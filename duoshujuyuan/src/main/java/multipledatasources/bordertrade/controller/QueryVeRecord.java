package multipledatasources.bordertrade.controller;

import java.io.Serializable;



public class QueryVeRecord extends BaseModel implements Serializable {

	/**
	 * 车辆海关编号
	 */
	private String ve_customs_no;
	/**
	 * 国内车牌
	 */
	private String domestic_lisence_no;
	/**
	 *外籍车牌
	 */
    private String foreign_license;
	/**
	 *车辆注册地
	 */
    private String ve_reg_place;
	/**
	 *车辆行驶证编号
	 */
    private String ve_card_no;
	/**
	 *车辆登记车主名称
	 */
    private String ve_owner_name;
	/**
	 *车辆登记车主证件号码
	 */
    private String ve_owner_no;
	/**
	 *车主境内联系地址
	 */
    private String owner_inside_addr;
	/**
	 *车主境内联系电话
	 */
    private String owner_inside_tel;
	/**
	 *车辆类型(型样)
	 */
    private String ve_type;
	/**
	 *厂牌
	 */
    private String brand;
	/**
	 *车架号（车辆识别代号）
	 */
    private String ve_frame_no;
	/**
	 *核定载质量
	 */
    private String ve_ton;
	/**
	 *自重（整备质量）
	 */
    private String self_wt;
	/**
	 *车身颜色
	 */
    private String ve_body_color;
	/**
	 *批文/许可证有效期（年-月-日）
	 */
    private String appr_period;
	/**
	 *申请人
	 */
    private String proposer;
	/**
	 *申请时间（年月日）
	 */
    private String propose_time;



	/**
	 * 车辆国籍
	 */
	private String nationality;
	/**
	 * 1正常；0没有结果
	 （可直接根据此字段判断）
	 */
    private String result;
    private String rownum;
    private String start_propose_time; //备案开始时间
    private String end_propose_time; //备案结束时间
    private String allow_ve_ie_port; //备案结束时间
	/**
	 * 审核关员
	 * 审核前的车辆一律为NULL
	 */
	private String auditor;
	/**
	 * 审核时间（时分秒）
	 * 审核前的车辆一律为NULL
	 */
	private String audit_time;
	/**
	 * 审核备注
	 * 审核前的车辆一律为NULL
	 */
	private String audit_memo;

	public String getAllow_ve_ie_port() {
		return allow_ve_ie_port;
	}
	public String getVe_customs_no() {
		return ve_customs_no;
	}
	public void setVe_customs_no(String ve_customs_no) {
		this.ve_customs_no = ve_customs_no;
	}
	public void setAllow_ve_ie_port(String allow_ve_ie_port) {
		this.allow_ve_ie_port = allow_ve_ie_port;
	}
	public String getStart_propose_time() {
		return start_propose_time;
	}
	public void setStart_propose_time(String start_propose_time) {
		this.start_propose_time = start_propose_time;
	}
	public String getEnd_propose_time() {
		return end_propose_time;
	}
	public void setEnd_propose_time(String end_propose_time) {
		this.end_propose_time = end_propose_time;
	}
	public String getDomestic_lisence_no() {
		return domestic_lisence_no;
	}
	public void setDomestic_lisence_no(String domestic_lisence_no) {
		this.domestic_lisence_no = domestic_lisence_no;
	}
	public String getForeign_license() {
		return foreign_license;
	}
	public void setForeign_license(String foreign_license) {
		this.foreign_license = foreign_license;
	}
	public String getVe_reg_place() {
		return ve_reg_place;
	}
	public void setVe_reg_place(String ve_reg_place) {
		this.ve_reg_place = ve_reg_place;
	}
	public String getVe_card_no() {
		return ve_card_no;
	}
	public void setVe_card_no(String ve_card_no) {
		this.ve_card_no = ve_card_no;
	}
	public String getVe_owner_name() {
		return ve_owner_name;
	}
	public void setVe_owner_name(String ve_owner_name) {
		this.ve_owner_name = ve_owner_name;
	}
	public String getVe_owner_no() {
		return ve_owner_no;
	}
	public void setVe_owner_no(String ve_owner_no) {
		this.ve_owner_no = ve_owner_no;
	}
	public String getOwner_inside_addr() {
		return owner_inside_addr;
	}
	public void setOwner_inside_addr(String owner_inside_addr) {
		this.owner_inside_addr = owner_inside_addr;
	}
	public String getOwner_inside_tel() {
		return owner_inside_tel;
	}
	public void setOwner_inside_tel(String owner_inside_tel) {
		this.owner_inside_tel = owner_inside_tel;
	}
	public String getVe_type() {
		return ve_type;
	}
	public void setVe_type(String ve_type) {
		this.ve_type = ve_type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getVe_frame_no() {
		return ve_frame_no;
	}
	public void setVe_frame_no(String ve_frame_no) {
		this.ve_frame_no = ve_frame_no;
	}
	public String getVe_ton() {
		return ve_ton;
	}
	public void setVe_ton(String ve_ton) {
		this.ve_ton = ve_ton;
	}
	public String getSelf_wt() {
		return self_wt;
	}
	public void setSelf_wt(String self_wt) {
		this.self_wt = self_wt;
	}
	public String getVe_body_color() {
		return ve_body_color;
	}
	public void setVe_body_color(String ve_body_color) {
		this.ve_body_color = ve_body_color;
	}
	public String getAppr_period() {
		return appr_period;
	}
	public void setAppr_period(String appr_period) {
		this.appr_period = appr_period;
	}
	public String getProposer() {
		return proposer;
	}
	public void setProposer(String proposer) {
		this.proposer = proposer;
	}
	public String getPropose_time() {
		return propose_time;
	}
	public void setPropose_time(String propose_time) {
		this.propose_time = propose_time;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getRownum() {
		return rownum;
	}
	public void setRownum(String rownum) {
		this.rownum = rownum;
	}

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	public String getAudit_time() {
		return audit_time;
	}

	public void setAudit_time(String audit_time) {
		this.audit_time = audit_time;
	}

	public String getAudit_memo() {
		return audit_memo;
	}

	public void setAudit_memo(String audit_memo) {
		this.audit_memo = audit_memo;
	}
}
