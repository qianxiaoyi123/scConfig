package multipledatasources.bordertrade.controller;

import java.io.Serializable;



/**
 * 公路舱单接口
 * @program: hssupervise
 * @description: Controller
 * @author: lujingya
 * @date: 2018年8月9日
 *
 */
public class DoCheckRelManifestData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String manifest_id;// 货物运输批次号/航班航次号  
	private String bill_no;// 提单号              
	private String decl_traf_mode;// 运输方式代码(4 公路运输
	private String i_e_flag;// 进出境标志（I进口 E出口）    
	private String customscode;// 进出境海关代码（4位关区代码） 
	private String form_id;// 互市申报单号                      
	private String weight;// 反核注重量
	
	public DoCheckRelManifestData() {
		// TODO Auto-generated constructor stub
	}
	
	
	public DoCheckRelManifestData(String manifest_id, String bill_no, String decl_traf_mode, String i_e_flag,
			String customscode, String form_id, String weight) {
		super();
		this.manifest_id = manifest_id;
		this.bill_no = bill_no;
		this.decl_traf_mode = decl_traf_mode;
		this.i_e_flag = i_e_flag;
		this.customscode = customscode;
		this.form_id = form_id;
		this.weight = weight;
	}

	/**
	 * 布控号
	 */
	private String ctrlId;
	/**
	 * 布控类型：1-即决式/2-预订式/3-预警式/0-其他
	 */
	private String ctrlType;
	/**
	 * 布控来源：1-公路舱单系统/2-H2000/3-公路舱单风险分析子系统/4-运输工具风险分析子系统
	 */
	private String ctrlSource;
	/**
	 *布控命中对象编号
	 */
	private String ctrlObjId;
	/**
	 * 布控命中对象类型：H-互市单
	 */
	private String ctrlObjType;
	/**
	 * 风险类型：A-锁舱单并自动布控报关单证/B-锁舱单/C-舱单预警提示/D-未知风险
	 */
	private String rskType;
	/**
	 * 命中时间
	 */
	private String hitTime;
	/**
	 *中控状态：0-已中控/1-已解控
	 */
	private String hitMark;
	/**
	 * 布控人
	 */
	private String rskEr;
	/**
	 *布控时间
	 */
	private String rskDate;
	/**
	 * 布控人联系方式
	 */
	private String rskPhone;
	/**
	 * 布控要求
	 */
	private String rskRequest;
	/**
	 * 布控结果
	 */
	private String rskResult;
	/**
	 * 布控审批人
	 */
	private String rskApproveEr;
	/**
	 *布控审批时间
	 */
	private String rskApproveDate;
	/**
	 *解控人
	 */
	private String releaseEr;
	/**
	 * 解控时间
	 */
	private String releaseDate;
	/**
	 * 创建人
	 */
	private String genDate;
	/**
	 * 审核人
	 */
	private String auditEr;
	/**
	 * 审核时间
	 */
	private String auditDate;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 在线分析系统布控指令生效标志：0为关，1为开
	 */
	private String rskValidMark;
	/**
	 *取值：1,2
	 */
	private String riskFlag;
	
	public String getManifest_id() {
		return manifest_id;
	}
	public void setManifest_id(String manifest_id) {
		this.manifest_id = manifest_id;
	}
	public String getBill_no() {
		return bill_no;
	}
	public void setBill_no(String bill_no) {
		this.bill_no = bill_no;
	}
	public String getDecl_traf_mode() {
		return decl_traf_mode;
	}
	public void setDecl_traf_mode(String decl_traf_mode) {
		this.decl_traf_mode = decl_traf_mode;
	}
	public String getI_e_flag() {
		return i_e_flag;
	}
	public void setI_e_flag(String i_e_flag) {
		this.i_e_flag = i_e_flag;
	}
	public String getCustomscode() {
		return customscode;
	}
	public void setCustomscode(String customscode) {
		this.customscode = customscode;
	}
	public String getForm_id() {
		return form_id;
	}
	public void setForm_id(String form_id) {
		this.form_id = form_id;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getCtrlId() {
		return ctrlId;
	}
	public void setCtrlId(String ctrlId) {
		this.ctrlId = ctrlId;
	}
	public String getCtrlType() {
		return ctrlType;
	}
	public void setCtrlType(String ctrlType) {
		this.ctrlType = ctrlType;
	}
	public String getCtrlSource() {
		return ctrlSource;
	}
	public void setCtrlSource(String ctrlSource) {
		this.ctrlSource = ctrlSource;
	}
	public String getCtrlObjId() {
		return ctrlObjId;
	}
	public void setCtrlObjId(String ctrlObjId) {
		this.ctrlObjId = ctrlObjId;
	}
	public String getCtrlObjType() {
		return ctrlObjType;
	}
	public void setCtrlObjType(String ctrlObjType) {
		this.ctrlObjType = ctrlObjType;
	}
	public String getRskType() {
		return rskType;
	}
	public void setRskType(String rskType) {
		this.rskType = rskType;
	}
	public String getHitTime() {
		return hitTime;
	}
	public void setHitTime(String hitTime) {
		this.hitTime = hitTime;
	}
	public String getHitMark() {
		return hitMark;
	}
	public void setHitMark(String hitMark) {
		this.hitMark = hitMark;
	}
	public String getRskEr() {
		return rskEr;
	}
	public void setRskEr(String rskEr) {
		this.rskEr = rskEr;
	}
	public String getRskDate() {
		return rskDate;
	}
	public void setRskDate(String rskDate) {
		this.rskDate = rskDate;
	}
	public String getRskPhone() {
		return rskPhone;
	}
	public void setRskPhone(String rskPhone) {
		this.rskPhone = rskPhone;
	}
	public String getRskRequest() {
		return rskRequest;
	}
	public void setRskRequest(String rskRequest) {
		this.rskRequest = rskRequest;
	}
	public String getRskResult() {
		return rskResult;
	}
	public void setRskResult(String rskResult) {
		this.rskResult = rskResult;
	}
	public String getRskApproveEr() {
		return rskApproveEr;
	}
	public void setRskApproveEr(String rskApproveEr) {
		this.rskApproveEr = rskApproveEr;
	}
	public String getRskApproveDate() {
		return rskApproveDate;
	}
	public void setRskApproveDate(String rskApproveDate) {
		this.rskApproveDate = rskApproveDate;
	}
	public String getReleaseEr() {
		return releaseEr;
	}
	public void setReleaseEr(String releaseEr) {
		this.releaseEr = releaseEr;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getGenDate() {
		return genDate;
	}
	public void setGenDate(String genDate) {
		this.genDate = genDate;
	}
	public String getAuditEr() {
		return auditEr;
	}
	public void setAuditEr(String auditEr) {
		this.auditEr = auditEr;
	}
	public String getAuditDate() {
		return auditDate;
	}
	public void setAuditDate(String auditDate) {
		this.auditDate = auditDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRskValidMark() {
		return rskValidMark;
	}
	public void setRskValidMark(String rskValidMark) {
		this.rskValidMark = rskValidMark;
	}
	public String getRiskFlag() {
		return riskFlag;
	}
	public void setRiskFlag(String riskFlag) {
		this.riskFlag = riskFlag;
	}
}
