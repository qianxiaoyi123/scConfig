package multipledatasources.bordertrade.controller;

public enum ExceptionEnum {
	UNKONW_ERROR("-1","未知错误"),
	SUCCESS("0","成功"),
	ERROR("1","失败"),
	;
	
	private String code;
	private String msg;
	
	ExceptionEnum(String code,String msg) {
		this.code = code;
		this.msg = msg;
	}
 
	public String getCode() {
		return code;
	}
 
	public String getMsg() {
		return msg;
	}
}
