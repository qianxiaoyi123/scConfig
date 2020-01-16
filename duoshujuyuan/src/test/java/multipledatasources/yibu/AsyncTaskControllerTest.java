package multipledatasources.yibu;

import com.alibaba.fastjson.JSON;
import multipledatasources.MultipleDataSourcesApplication;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by zhangmingyu on 2020/1/13.
 */
@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = MultipleDataSourcesApplication.class)//Application启动类
public class AsyncTaskControllerTest  {
    @Autowired
    private  WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;
    @Before
    public  void  setUp() throws Exception{
        mockMvc= MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void doTask() throws Exception {
        //调用接口传递参数

       RequestBuilder request= MockMvcRequestBuilders.post("/asynctime").contentType(MediaType.APPLICATION_JSON_UTF8).content(JSON.toJSONString(null));
   //     RequestBuilder request= MockMvcRequestBuilders.get("/asynctime");
        MvcResult mvcResult=mockMvc.perform(request).andReturn();
      //  MvcResult mvcResult=mockMvc.perform(request).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

        int status=mvcResult.getResponse().getStatus();
        String content=mvcResult.getResponse().getContentAsString();
        Assert.assertTrue("正确",status==200);
        Assert.assertFalse("错误",status!=200);
        System.out.println("返回结果："+status);
        System.out.println(content);
    }

    @Test
    public void asyncDemo() throws Exception {

    }

    @Test
    public void contextLoads() throws Exception {

    }

    @Test
    public void async2() throws Exception {

    }

}