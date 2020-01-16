package multipledatasources.resttemptemplate.common;

/**
 * Created by zhangmingyu on 2019/3/6.
 */

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Service
public class RestfulUtil2 {
    @Autowired
    private RestTemplate restTemplate;

    private Logger logger=Logger.getLogger(this.getClass());

    public void postForEntity(String url, MultiValueMap<String, Object> requestEntity, String contentType) {
        Gson gson=new Gson();
        System.out.println("开始调用接口："+new Date().toLocaleString());
        HttpHeaders headers=new HttpHeaders();
        // headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        //org.springframework.http.HttpEntity<String> httpEntity = new org.springframework.http.HttpEntity<>(value,headers);
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        org.springframework.http.HttpEntity<MultiValueMap<String,Object>> httpEntity = new org.springframework.http.HttpEntity<>(requestEntity,headers);
        ResponseEntity<String> result = restTemplate.postForEntity(url,httpEntity,String.class);

       // return result.getBody();

    }

}
