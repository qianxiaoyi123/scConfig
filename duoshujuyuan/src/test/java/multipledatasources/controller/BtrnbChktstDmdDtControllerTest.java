package multipledatasources.controller;

import multipledatasources.service.BtrnbChktstDmdDtService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;



 //* Created by zhangmingyu on 2019/4/3.
 

@RunWith(SpringRunner.class)
@SpringBootTest
public class BtrnbChktstDmdDtControllerTest {
    @Autowired
    private BtrnbChktstDmdDtService bt;



  //  @Commodity
    public void contextLoads() {
        System.out.println("aa");

    }

}
