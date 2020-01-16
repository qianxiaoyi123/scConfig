package multipledatasources.msg;


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.PROPERTY)
public class CHK105 implements Serializable {

	/**
	 * 进口商品申报单申报明细 一对多
	 */
	private List<IgdsDclDt> IgdsDclDtList;

	/**
	 * 进口商品申报单变更明细 一对多
	 */
	private List<IgdsdclDtTmp> IgdsdclDtTmpList;

	/**
	 * 进口商品申报单变更编号
	 */
	private String igdsdclTmpNo;

    /**
     * 进口商品申报单基本编号
     */
    private String igdsdclBscNo;

    /**
     * 申报时间
     */
    private Date dclTime;

    /**
     * 进口商品申报单编号
     */
    private String igdsdclNo;

    /**
     * 申报人姓名
     */
    private String dclerName;

    /**
     * 身份证号
     */
    private String idno;

    /**
     * 车牌号
     */
    private String pltno;

    /**
     * 边民互市业务方式代码
     */
    private String btrnbBizModecd;

    /**
     * 监管场所编号
     */
    private String supvLoctNo;

    /**
     * 监管场所名称
     */
    private String supvLoctNm;

    /**
     * 申报关区代码
     */
    private String dclCuscd;

    /**
     * 进出口标记代码
     */
    private String impexpMarkcd;

    /**
     * 拼车标志
     */
    private String trcplFlag;

    /**
     * 备注
     */
    private String rmk;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人编号
     */
    private String createErNo;

    /**
     * 创建人姓名
     */
    private String createErName;

    /**
     * 修改时间
     */
    private Date modfTime;

    /**
     * 修改人编号
     */
    private String modfErNo;

    /**
     * 修改人姓名
     */
    private String modfErName;

    /**
     * 审核状态代码
     */
    private String emvryStucd;

    /**
     * 审核意见描述
     */
    private String emvryOpinDesc;

    /**
     * 有效标志
     */
    private String validFlag;

    /**
     * 备案变更标志
     */
    private String putrecChgFlag;

    /**
     * 操作类型代码
     */
    private String opTypecd;

	/**
	 * 申报人类型
	 */
	private String dclerType;
    
    private String hitFlag; //命中标志
    
    
    
    private static final long serialVersionUID = 1L;

	public List<IgdsDclDt> getIgdsDclDtList() {
		return IgdsDclDtList;
	}

	@XmlElementWrapper(name = "igdsDclDtList")
	@XmlElement(name = "igdsdclDt")
	public void setIgdsDclDtList(List<IgdsDclDt> igdsDclDtList) {
		IgdsDclDtList = igdsDclDtList;
	}
	
	public String getIgdsdclBscNo() {
		return igdsdclBscNo;
	}

	public void setIgdsdclBscNo(String igdsdclBscNo) {
		this.igdsdclBscNo = igdsdclBscNo;
	}

	public Date getDclTime() {
		return dclTime;
	}

	public void setDclTime(Date dclTime) {
		this.dclTime = dclTime;
	}

	public String getIgdsdclNo() {
		return igdsdclNo;
	}

	public void setIgdsdclNo(String igdsdclNo) {
		this.igdsdclNo = igdsdclNo;
	}

	public String getDclerName() {
		return dclerName;
	}

	public void setDclerName(String dclerName) {
		this.dclerName = dclerName;
	}

	public String getIdno() {
		return idno;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}

	public String getPltno() {
		return pltno;
	}

	public void setPltno(String pltno) {
		this.pltno = pltno;
	}

	public String getBtrnbBizModecd() {
		return btrnbBizModecd;
	}

	public void setBtrnbBizModecd(String btrnbBizModecd) {
		this.btrnbBizModecd = btrnbBizModecd;
	}

	public String getSupvLoctNo() {
		return supvLoctNo;
	}

	public void setSupvLoctNo(String supvLoctNo) {
		this.supvLoctNo = supvLoctNo;
	}

	public String getSupvLoctNm() {
		return supvLoctNm;
	}

	public void setSupvLoctNm(String supvLoctNm) {
		this.supvLoctNm = supvLoctNm;
	}

	public String getDclCuscd() {
		return dclCuscd;
	}

	public void setDclCuscd(String dclCuscd) {
		this.dclCuscd = dclCuscd;
	}

	public String getImpexpMarkcd() {
		return impexpMarkcd;
	}

	public void setImpexpMarkcd(String impexpMarkcd) {
		this.impexpMarkcd = impexpMarkcd;
	}

	public String getTrcplFlag() {
		return trcplFlag;
	}

	public void setTrcplFlag(String trcplFlag) {
		this.trcplFlag = trcplFlag;
	}

	public String getRmk() {
		return rmk;
	}

	public void setRmk(String rmk) {
		this.rmk = rmk;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateErNo() {
		return createErNo;
	}

	public void setCreateErNo(String createErNo) {
		this.createErNo = createErNo;
	}

	public String getCreateErName() {
		return createErName;
	}

	public void setCreateErName(String createErName) {
		this.createErName = createErName;
	}

	public Date getModfTime() {
		return modfTime;
	}

	public void setModfTime(Date modfTime) {
		this.modfTime = modfTime;
	}

	public String getModfErNo() {
		return modfErNo;
	}

	public void setModfErNo(String modfErNo) {
		this.modfErNo = modfErNo;
	}

	public String getModfErName() {
		return modfErName;
	}

	public void setModfErName(String modfErName) {
		this.modfErName = modfErName;
	}

	public String getEmvryStucd() {
		return emvryStucd;
	}

	public void setEmvryStucd(String emvryStucd) {
		this.emvryStucd = emvryStucd;
	}

	public String getEmvryOpinDesc() {
		return emvryOpinDesc;
	}

	public void setEmvryOpinDesc(String emvryOpinDesc) {
		this.emvryOpinDesc = emvryOpinDesc;
	}

	public String getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	public String getPutrecChgFlag() {
		return putrecChgFlag;
	}

	public void setPutrecChgFlag(String putrecChgFlag) {
		this.putrecChgFlag = putrecChgFlag;
	}

	public String getOpTypecd() {
		return opTypecd;
	}

	public void setOpTypecd(String opTypecd) {
		this.opTypecd = opTypecd;
	}

	public String getHitFlag() {
		return hitFlag;
	}

	public void setHitFlag(String hitFlag) {
		this.hitFlag = hitFlag;
	}

	public List<IgdsdclDtTmp> getIgdsdclDtTmpList() {
		return IgdsdclDtTmpList;
	}

	@XmlElementWrapper(name = "IgdsdclDtTmpList")
	@XmlElement(name = "IgdsdclDtTmp")
	public void setIgdsdclDtTmpList(List<IgdsdclDtTmp> igdsdclDtTmpList) {
		IgdsdclDtTmpList = igdsdclDtTmpList;
	}

	public String getIgdsdclTmpNo() {
		return igdsdclTmpNo;
	}

	public void setIgdsdclTmpNo(String igdsdclTmpNo) {
		this.igdsdclTmpNo = igdsdclTmpNo;
	}
	
	public String getDclerType() {
		return dclerType;
	}

	public void setDclerType(String dclerType) {
		this.dclerType = dclerType;
	}
}