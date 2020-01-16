package multipledatasources.water.controller;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import cn.gov.customs.outservice.manifest.cupaa.contracts.IManifestWriterServiceHS;
import multipledatasources.water.controller.req.Request;
import multipledatasources.water.controller.req.RequestBody;
import multipledatasources.water.controller.res.Response;
import multipledatasources.water.controller.res.ResponseBody;
import multipledatasources.water.controller.res.ResponseHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.tempuri.ManifestWriterServiceHS;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


//import cn.gov.customs.outservice.manifest.cupaa.contracts.IManifestWriterServiceHS;
import org.apache.log4j.Logger;
/**
 * 水空舱单接口实现
 * @author lujingya 2018-9-18 11:11:42
 */
@Service
public class WaterFlightServiceImpl implements WaterFlightService {
	private static Logger logger = Logger.getLogger(WaterFlightServiceImpl.class);
	@Autowired
	private Environment environment;
	@Override
	public Response<List<WaterFlightResDTO>> waterFlightRequest(Request<List<WaterFlightReqDTO>> req) throws Exception {
		Response<List<WaterFlightResDTO>> res = makeResponse();
		List<WaterFlightReqDTO> list = req.getBody().getBody();
		Gson gson = new Gson();
		String json = gson.toJson(list);
//		QName SERVICE_NAME = new QName(environment.getProperty("ws.waterFlight.namespace"), environment.getProperty("ws.waterFlight.localpart"));
//		URL wsdlURL = new URL(environment.getProperty("ws.waterFlight.url"));
		QName SERVICE_NAME = new QName("http://tempuri.org/", "ManifestWriterServiceHS");

		URL wsdlURL = new URL("http://10.99.29.216/MFTOutService/ManifestWriterServiceHS.svc?wsdl");
		URL endpoint= new URL(wsdlURL, "",new URLStreamHandler() {
			@Override
			protected URLConnection openConnection(URL url) throws IOException {
				 URLConnection connection = url.openConnection();
				 connection.setConnectTimeout(30*1000);//timeout时间为30秒
				 connection.setReadTimeout(30*1000);//timeout时间为30秒
				 return(connection);
			}
		});
		ManifestWriterServiceHS ss = new ManifestWriterServiceHS(endpoint, SERVICE_NAME);
        IManifestWriterServiceHS port = ss.getWSHttpBindingIManifestWriterServiceHS();

        String resultJson = port.setChkNew(json);
        JsonParser parse = new JsonParser();
        JsonElement resultElement = parse.parse(resultJson);
        JsonObject asJsonObject = resultElement.getAsJsonObject();
        JsonElement jsonElement = asJsonObject.get("ResultStatus");
        String resultStatus = jsonElement.getAsString();
        res.getHeader().setCode(resultStatus);
        res.getHeader().setMessage(asJsonObject.get("ErrorData").getAsString());
        List<WaterFlightResDTO> waterFlights = new ArrayList<>();
    	JsonElement element = asJsonObject.get("ResultData");
    	if (element.isJsonNull() || !element.isJsonArray()) {
    		return res;
    	}
    	JsonArray jsonArray = element.getAsJsonArray();
    	for (int i =  0; i < jsonArray.size(); i++) {
    		JsonElement childEle = jsonArray.get(i);
    		WaterFlightResDTO waterFlight = gson.fromJson(childEle, WaterFlightResDTO.class);
    		waterFlights.add(waterFlight);
    	}
        ResponseBody<List<WaterFlightResDTO>> body = new ResponseBody<>();
        body.setBody(waterFlights);
        res.setBody(body);
        logger.info("Invoking setChkNew..." + resultJson);
		return res;
	}


	private Response<List<WaterFlightResDTO>> makeResponse() {
		Response<List<WaterFlightResDTO>> response = new Response<>();
		ResponseHeader header = new ResponseHeader();

		response.setHeader(header);
		return response;
	}


	/**
	 * 水运舱单调用接口
	 * @param manifest
	 * @return
	 * @throws Exception
	 */
	public String waterManifestInterface(WaterFlightReqDTO manifest) throws Exception{
		List<WaterFlightReqDTO> list =new ArrayList<WaterFlightReqDTO>();
		list.add(manifest);
		RequestBody<List<WaterFlightReqDTO>> body=new RequestBody<List<WaterFlightReqDTO>>();
		body.setBody(list);
		Request<List<WaterFlightReqDTO>> req=new Request<List<WaterFlightReqDTO>>();
		req.setBody(body);
		Response<List<WaterFlightResDTO>> res=this.waterFlightRequest(req);
		if(StringUtils.isEmpty(res) ||  StringUtils.isEmpty(res.getBody()) || StringUtils.isEmpty(res.getBody().getBody())){
			return "水空舱单接口调用失败";
		}
		//是否一对一
		WaterFlightResDTO resDto=res.getBody().getBody().get(0);
		if(!StringUtils.isEmpty(resDto.getSuccessMesg())){
			return "";
		}
		if(!StringUtils.isEmpty(resDto.getErrorMesg())){
			return "水空舱单："+resDto.getErrorMesg();
		}
		return "";
	}
}
