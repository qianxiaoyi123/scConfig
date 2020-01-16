package multipledatasources.msg;

import org.springframework.stereotype.Service;

/**
 * 报文处理接口
 */
@Service
public interface MessageHandle {
    /**
     * 报文解析
     * @param bussinessData
     * @return 返回解析报文的 messageId
     */
    void analyzeMessage(BussinessData bussinessData);
}
