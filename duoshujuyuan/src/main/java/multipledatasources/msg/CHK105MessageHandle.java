package multipledatasources.msg;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;

/**
 * CHK105报文 进口商品申报单解析（服务系统解析监管系统报文）
 */
@Component
public class CHK105MessageHandle implements MessageHandle {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     * 报文解析
     *
     * @param bussinessData
     * @return 返回解析报文的 messageId
     */
    @Override
    public void analyzeMessage(BussinessData bussinessData) {
        CHK105 chk105 = bussinessData.getChk105();

        System.out.println(chk105);

    }

}
