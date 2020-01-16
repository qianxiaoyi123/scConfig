package multipledatasources.common;

import java.util.HashMap;
import java.util.Map;

public class ReturnResultJson {
	
	private boolean success;
	private Map<String,Object> error;
	private Object data;
	private String version;
	private String errMsg;
	
	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public boolean getSuccess() {
		return success;
	}
	
	public void setSuccess(boolean success) {
		this.success = success;
	}    
    	
	public Map<String, Object> getError() {
		return error;
	}

	public void setError(Map<String, Object> error) {
		this.error = error;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	public ReturnResultJson() {
		// TODO Auto-generated constructor stub
	}

	public ReturnResultJson(boolean successNew ,Object results,String code,String info){
		this.success=successNew;
		Map<String,Object> hmData=new HashMap<String,Object>();
		hmData.put("code",  code);
		hmData.put("message", info);
		this.error=hmData;
		this.data = results;
		this.errMsg=info;
	}
	
	public ReturnResultJson(boolean successNew ,Object results,String code,String info,Object errorData){
		this.success=successNew;
		Map<String,Object> hmData=new HashMap<String,Object>();
		hmData.put("code",  code);
		hmData.put("message", info);
		hmData.put("data", errorData);
		this.error=hmData;
		this.data = results;
		this.errMsg=info;
	}
	
	public ReturnResultJson(boolean successNew,Object results){
		this.success=successNew;		
		Map<String,Object> hmData=new HashMap<String,Object>();
		hmData.put("code",  "");
		hmData.put("message", "");
		this.error=hmData;		
		this.data = results;
	}
}
