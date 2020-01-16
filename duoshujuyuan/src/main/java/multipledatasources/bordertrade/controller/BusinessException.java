package multipledatasources.bordertrade.controller;


public class BusinessException extends RuntimeException{
		
		private static final long serialVersionUID = 1L;
		
		private String code;  //错误码
		
		public BusinessException() {}
		
		public BusinessException(String errMsg){
			super(errMsg);
			this.code = "-1";
		}	
		public BusinessException(String code,String errMsg) {
			super(errMsg);
			this.code = code;
		}
		public BusinessException(ExceptionEnum resultEnum) {
			super(resultEnum.getMsg());
			this.code = resultEnum.getCode();
		}
		
		public String getCode() {
			return code;
		}
	 
		public void setCode(String code) {
			this.code = code;
		}
	}