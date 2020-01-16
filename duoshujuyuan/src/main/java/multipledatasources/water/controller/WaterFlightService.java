package multipledatasources.water.controller;

import multipledatasources.water.controller.req.Request;
import multipledatasources.water.controller.res.Response;

import java.util.List;



/**
 * 
 * @author lujingya 2018年8月21日11:13:11
 * 水空舱单接口
 *
 */
public interface WaterFlightService {
	
	/**
     * 水空舱单接口
     * @param req
     * @return
     * @throws Exception
     */
	Response<List<WaterFlightResDTO>> waterFlightRequest(Request<List<WaterFlightReqDTO>> req) throws Exception;

	/**
	 * 水运舱单调用接口
	 * @param manifest
	 * @return
	 * @throws Exception
	 */
	public String waterManifestInterface(WaterFlightReqDTO manifest) throws Exception;
}
