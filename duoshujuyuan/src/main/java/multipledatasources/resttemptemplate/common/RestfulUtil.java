package multipledatasources.resttemptemplate.common;

/**
 * Created by zhangmingyu on 2019/3/6.
 */

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Service
public class RestfulUtil {
    @Autowired
    private RestTemplate restTemplate;

    private Logger logger=Logger.getLogger(this.getClass());

    public Object postForEntity(String url, MultiValueMap<String, Object> requestEntity, String contentType) throws Exception{
        try {
            System.out.println("开始调用接口："+new Date().toLocaleString());
            HttpHeaders headers = new HttpHeaders();
            if(StringUtils.isEmpty(contentType)){
                contentType="application/x-www-form-urlencoded;charset=UTF-8";

            }
            headers.add("Content-Type", contentType);
            HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(requestEntity, headers);
            ResponseEntity<String> result = restTemplate.postForEntity(url,entity,String.class);
            System.out.println("结束调用接口："+new Date().toLocaleString());
            return result.getBody();
        } catch (Exception e) {
            logger.error("调用restful接口["+url+"]错误,"+e.getMessage());
            throw e;
        }

    }

}
