package multipledatasources.water.controller;

import java.io.Serializable;
/**'
 * 
 * @author lujingya
 * 2018年8月22日12:44:45
 * 水空舱单接口请求数据
 *
 */
public class WaterFlightReqDTO implements Serializable {
	
	private String ParamTransportId;//进出境运输工具代码
	private String ParamIeFlag;//进出口方式
	private String ParamVoyageNo;//航班航次号
	private String ParamTrafMod;//运输方式
	private String ParamBillNo;//提运单号
	private String ParamFormID;//申报单编号
	private String ParamChkWt;//合住核销重量
	private String ParamCustomsCode;//管辖关区号码
	private String ParamSetChkRel;//操作方式：（核注核销，反核注核销）核注：NTCHT 核销 CHK 反核注核销:UNCHK
	private String ParamCheckRelType;//核注核销类型  空和1表示一对一核注，0表示一对多，这个参数只有核注时使用
	/*private String ParamChkPackNO;//合住核销件数
	private String ParamRemark;//备注
	private String ParamFormType;//单证类型
	private String ParamChkRelEr;//核注核销人
*/	
	
	/**
	 * 接口返回消息
	 */
	private String retMsg;
	public WaterFlightReqDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public WaterFlightReqDTO(String paramTransportId, String paramIeFlag, String paramVoyageNo, String paramTrafMod,
			String paramBillNo, String paramChkWt,String paramFormID,  String paramCustomsCode, String paramSetChkRel,
			String paramCheckRelType) {
		super();
		ParamTransportId = paramTransportId;
		ParamIeFlag = paramIeFlag;
		ParamVoyageNo = paramVoyageNo;
		ParamTrafMod = paramTrafMod;
		ParamBillNo = paramBillNo;
		ParamFormID = paramFormID;
		ParamChkWt = paramChkWt;
		ParamCustomsCode = paramCustomsCode;
		ParamSetChkRel = paramSetChkRel;
		ParamCheckRelType = paramCheckRelType;
	}


	public String getParamTrafMod() {
		return ParamTrafMod;
	}
	public void setParamTrafMod(String paramTrafMod) {
		ParamTrafMod = paramTrafMod;
	}
	public String getParamCustomsCode() {
		return ParamCustomsCode;
	}
	public void setParamCustomsCode(String paramCustomsCode) {
		ParamCustomsCode = paramCustomsCode;
	}
	public String getParamBillNo() {
		return ParamBillNo;
	}
	public void setParamBillNo(String paramBillNo) {
		ParamBillNo = paramBillNo;
	}
	/*public String getParamManifestId() {
		return ParamManifestId;
	}
	public void setParamManifestId(String paramManifestId) {
		ParamManifestId = paramManifestId;
	}*/
	public String getParamIeFlag() {
		return ParamIeFlag;
	}
	public void setParamIeFlag(String paramIeFlag) {
		ParamIeFlag = paramIeFlag;
	}
	public String getParamChkWt() {
		return ParamChkWt;
	}
	public void setParamChkWt(String paramChkWt) {
		ParamChkWt = paramChkWt;
	}
	/*public String getParamChkPackNO() {
		return ParamChkPackNO;
	}
	public void setParamChkPackNO(String paramChkPackNO) {
		ParamChkPackNO = paramChkPackNO;
	}
	public String getParamRemark() {
		return ParamRemark;
	}
	public void setParamRemark(String paramRemark) {
		ParamRemark = paramRemark;
	}
	public String getParamFormType() {
		return ParamFormType;
	}*/
	/*public void setParamFormType(String paramFormType) {
		ParamFormType = paramFormType;
	}*/
	public String getParamFormID() {
		return ParamFormID;
	}
	public void setParamFormID(String paramFormID) {
		ParamFormID = paramFormID;
	}
	/*public String getParamChkRelEr() {
		return ParamChkRelEr;
	}
	public void setParamChkRelEr(String paramChkRelEr) {
		ParamChkRelEr = paramChkRelEr;
	}*/
	public String getParamSetChkRel() {
		return ParamSetChkRel;
	}
	public void setParamSetChkRel(String paramSetChkRel) {
		ParamSetChkRel = paramSetChkRel;
	}
	public String getParamTransportId() {
		return ParamTransportId;
	}
	public void setParamTransportId(String paramTransportId) {
		ParamTransportId = paramTransportId;
	}
	public String getParamVoyageNo() {
		return ParamVoyageNo;
	}
	public void setParamVoyageNo(String paramVoyageNo) {
		ParamVoyageNo = paramVoyageNo;
	}
	public String getParamCheckRelType() {
		return ParamCheckRelType;
	}
	public void setParamCheckRelType(String paramCheckRelType) {
		ParamCheckRelType = paramCheckRelType;
	}

	public String getRetMsg() {
		return retMsg;
	}

	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}
}
