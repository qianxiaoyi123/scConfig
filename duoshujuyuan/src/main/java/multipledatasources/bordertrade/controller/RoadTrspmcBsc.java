package multipledatasources.bordertrade.controller;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RoadTrspmcBsc extends HSBaseModel implements Serializable {
	/**
	 * 公路运输工具基本编号
	 */
	private String roadTrspmcBscNo;
    /**
     * 车辆海关编号
     */
    private String veCusmNo;

    @Override
    public String toString() {
        return "RoadTrspmcBsc{" +
                "roadTrspmcBscNo='" + roadTrspmcBscNo + '\'' +
                ", veCusmNo='" + veCusmNo + '\'' +
                ", domsPltno='" + domsPltno + '\'' +
                ", bybordPltno='" + bybordPltno + '\'' +
                ", apprVeImpexpOprtCuscd='" + apprVeImpexpOprtCuscd + '\'' +
                ", veNatyNm='" + veNatyNm + '\'' +
                ", veRegPlcNm='" + veRegPlcNm + '\'' +
                ", trcretNo='" + trcretNo + '\'' +
                ", veChkinVeownNm='" + veChkinVeownNm + '\'' +
                ", veChkinVeownCredNo='" + veChkinVeownCredNo + '\'' +
                ", veownInbordConcAddr='" + veownInbordConcAddr + '\'' +
                ", veownInbordTelnum='" + veownInbordTelnum + '\'' +
                ", veTypecd='" + veTypecd + '\'' +
                ", cobrdNm='" + cobrdNm + '\'' +
                ", vefrmNo='" + vefrmNo + '\'' +
                ", vrfcofCrypsgCnt=" + vrfcofCrypsgCnt +
                ", veSelfWt=" + veSelfWt +
                ", veColcd='" + veColcd + '\'' +
                ", veElctPltno='" + veElctPltno + '\'' +
                ", gpsNo='" + gpsNo + '\'' +
                ", rfileLicValidDate=" + rfileLicValidDate +
                ", applyErNo='" + applyErNo + '\'' +
                ", applyErName='" + applyErName + '\'' +
                ", applyTime=" + applyTime +
                ", emvryCusrno='" + emvryCusrno + '\'' +
                ", emvryCuserName='" + emvryCuserName + '\'' +
                ", emvryTime=" + emvryTime +
                ", emvryStscd='" + emvryStscd + '\'' +
                ", emvryRmk='" + emvryRmk + '\'' +
                ", belongCusNm='" + belongCusNm + '\'' +
                '}';
    }

    /**
     * 国内车牌号
     */
    private String domsPltno;

    /**
     * 境外车牌号(外籍车牌号)
     */
    private String bybordPltno;

    /**
     * 批准车辆进出口岸隶属关代码
     */
    private String apprVeImpexpOprtCuscd;

    /**
     * 车辆国籍名称
     */
    private String veNatyNm;

    /**
     * 车辆注册地地址
     */
    private String veRegPlcNm;

    /**
     * 行驶证编号
     */
    private String trcretNo;

    /**
     * 车辆登记车主名称
     */
    private String veChkinVeownNm;

    /**
     * 车辆登记车主证件号码
     */
    private String veChkinVeownCredNo;

    /**
     * 车主境内联系地址
     */
    private String veownInbordConcAddr;

    /**
     * 车主境内联系电话
     */
    private String veownInbordTelnum;

    /**
     * 车辆类型代码(型样)
     */
    private String veTypecd;

    /**
     * 厂牌名称
     */
    private String cobrdNm;

    /**
     * 车架编号(车辆识别代号)
     */
    private String vefrmNo;

    /**
     * 核定载质量
     */
    private BigDecimal vrfcofCrypsgCnt;

    /**
     * 车辆自重量(整备质量)
     */
    private BigDecimal veSelfWt;

    /**
     * 车身颜色代码
     */
    private String veColcd;

    /**
     * 车辆电子车牌号
     */
    private String veElctPltno;

    /**
     * GPS编号(GPSID号)
     */
    private String gpsNo;

    /**
     * 批文/许可证有效期(年月日)
     */
    private Date rfileLicValidDate;

    /**
     * 申请人编号
     */
    private String applyErNo;

    /**
     * 申请人姓名
     */
    private String applyErName;

    /**
     * 申请时间(年月日)
     */
    private Date applyTime;

    /**
     * 审核关员编号
     */
    private String emvryCusrno;

    /**
     * 审核关员姓名
     */
    private String emvryCuserName;

    /**
     * 审核时间(时分秒)
     */
    private Date emvryTime;

    /**
     * 审核状态代码
     */
    private String emvryStscd;

    /**
     * 审核备注
     */
    private String emvryRmk;
    
    
    //非数据库字段
    //隶属关区名称
    private String belongCusNm ;

    /**
     * ROAD_TRSPMC_BSC
     */
    private static final long serialVersionUID = 1L;
    
    
    public String getBelongCusNm() {
		return belongCusNm;
	}

	public void setBelongCusNm(String belongCusNm) {
		this.belongCusNm = belongCusNm;
	}

	/**
     * 车辆海关编号
     * @return VE_CUSM_NO 车辆海关编号
     */
    public String getVeCusmNo() {
        return veCusmNo;
    }

    /**
     * 车辆海关编号
     * @param veCusmNo 车辆海关编号
     */
    public void setVeCusmNo(String veCusmNo) {
        this.veCusmNo = veCusmNo == null ? null : veCusmNo.trim();
    }

    /**
     * 国内车牌号
     * @return DOMS_PLTNO 国内车牌号
     */
    public String getDomsPltno() {
        return domsPltno;
    }

    /**
     * 国内车牌号
     * @param domsPltno 国内车牌号
     */
    public void setDomsPltno(String domsPltno) {
        this.domsPltno = domsPltno == null ? null : domsPltno.trim();
    }

    /**
     * 境外车牌号(外籍车牌号)
     * @return BYBORD_PLTNO 境外车牌号(外籍车牌号)
     */
    public String getBybordPltno() {
        return bybordPltno;
    }

    /**
     * 境外车牌号(外籍车牌号)
     * @param bybordPltno 境外车牌号(外籍车牌号)
     */
    public void setBybordPltno(String bybordPltno) {
        this.bybordPltno = bybordPltno == null ? null : bybordPltno.trim();
    }

    /**
     * 批准车辆进出口岸隶属关代码
     * @return APPR_VE_IMPEXP_OPRT_CUSCD 批准车辆进出口岸隶属关代码
     */
    public String getApprVeImpexpOprtCuscd() {
        return apprVeImpexpOprtCuscd;
    }

    /**
     * 批准车辆进出口岸隶属关代码
     * @param apprVeImpexpOprtCuscd 批准车辆进出口岸隶属关代码
     */
    public void setApprVeImpexpOprtCuscd(String apprVeImpexpOprtCuscd) {
        this.apprVeImpexpOprtCuscd = apprVeImpexpOprtCuscd == null ? null : apprVeImpexpOprtCuscd.trim();
    }

    /**
     * 车辆国籍名称
     * @return VE_NATY_NM 车辆国籍名称
     */
    public String getVeNatyNm() {
        return veNatyNm;
    }

    /**
     * 车辆国籍名称
     * @param veNatyNm 车辆国籍名称
     */
    public void setVeNatyNm(String veNatyNm) {
        this.veNatyNm = veNatyNm == null ? null : veNatyNm.trim();
    }

    /**
     * 车辆注册地地址
     * @return VE_REG_PLC_NM 车辆注册地地址
     */
    public String getVeRegPlcNm() {
        return veRegPlcNm;
    }

    /**
     * 车辆注册地地址
     * @param veRegPlcNm 车辆注册地地址
     */
    public void setVeRegPlcNm(String veRegPlcNm) {
        this.veRegPlcNm = veRegPlcNm == null ? null : veRegPlcNm.trim();
    }

    /**
     * 行驶证编号
     * @return TRCRET_NO 行驶证编号
     */
    public String getTrcretNo() {
        return trcretNo;
    }

    /**
     * 行驶证编号
     * @param trcretNo 行驶证编号
     */
    public void setTrcretNo(String trcretNo) {
        this.trcretNo = trcretNo == null ? null : trcretNo.trim();
    }

    /**
     * 车辆登记车主名称
     * @return VE_CHKIN_VEOWN_NM 车辆登记车主名称
     */
    public String getVeChkinVeownNm() {
        return veChkinVeownNm;
    }

    /**
     * 车辆登记车主名称
     * @param veChkinVeownNm 车辆登记车主名称
     */
    public void setVeChkinVeownNm(String veChkinVeownNm) {
        this.veChkinVeownNm = veChkinVeownNm == null ? null : veChkinVeownNm.trim();
    }

    /**
     * 车辆登记车主证件号码
     * @return VE_CHKIN_VEOWN_CRED_NO 车辆登记车主证件号码
     */
    public String getVeChkinVeownCredNo() {
        return veChkinVeownCredNo;
    }

    /**
     * 车辆登记车主证件号码
     * @param veChkinVeownCredNo 车辆登记车主证件号码
     */
    public void setVeChkinVeownCredNo(String veChkinVeownCredNo) {
        this.veChkinVeownCredNo = veChkinVeownCredNo == null ? null : veChkinVeownCredNo.trim();
    }

    /**
     * 车主境内联系地址
     * @return VEOWN_INBORD_CONC_ADDR 车主境内联系地址
     */
    public String getVeownInbordConcAddr() {
        return veownInbordConcAddr;
    }

    /**
     * 车主境内联系地址
     * @param veownInbordConcAddr 车主境内联系地址
     */
    public void setVeownInbordConcAddr(String veownInbordConcAddr) {
        this.veownInbordConcAddr = veownInbordConcAddr == null ? null : veownInbordConcAddr.trim();
    }

    /**
     * 车主境内联系电话
     * @return VEOWN_INBORD_TELNUM 车主境内联系电话
     */
    public String getVeownInbordTelnum() {
        return veownInbordTelnum;
    }

    /**
     * 车主境内联系电话
     * @param veownInbordTelnum 车主境内联系电话
     */
    public void setVeownInbordTelnum(String veownInbordTelnum) {
        this.veownInbordTelnum = veownInbordTelnum == null ? null : veownInbordTelnum.trim();
    }

    /**
     * 车辆类型代码(型样)
     * @return VE_TYPECD 车辆类型代码(型样)
     */
    public String getVeTypecd() {
        return veTypecd;
    }

    /**
     * 车辆类型代码(型样)
     * @param veTypecd 车辆类型代码(型样)
     */
    public void setVeTypecd(String veTypecd) {
        this.veTypecd = veTypecd == null ? null : veTypecd.trim();
    }

    /**
     * 厂牌名称
     * @return COBRD_NM 厂牌名称
     */
    public String getCobrdNm() {
        return cobrdNm;
    }

    /**
     * 厂牌名称
     * @param cobrdNm 厂牌名称
     */
    public void setCobrdNm(String cobrdNm) {
        this.cobrdNm = cobrdNm == null ? null : cobrdNm.trim();
    }

    /**
     * 车架编号(车辆识别代号)
     * @return VEFRM_NO 车架编号(车辆识别代号)
     */
    public String getVefrmNo() {
        return vefrmNo;
    }

    /**
     * 车架编号(车辆识别代号)
     * @param vefrmNo 车架编号(车辆识别代号)
     */
    public void setVefrmNo(String vefrmNo) {
        this.vefrmNo = vefrmNo == null ? null : vefrmNo.trim();
    }

    /**
     * 核定载质量
     * @return VRFCOF_CRYPSG_CNT 核定载质量
     */
    public BigDecimal getVrfcofCrypsgCnt() {
        return vrfcofCrypsgCnt;
    }

    /**
     * 核定载质量
     * @param vrfcofCrypsgCnt 核定载质量
     */
    public void setVrfcofCrypsgCnt(BigDecimal vrfcofCrypsgCnt) {
        this.vrfcofCrypsgCnt = vrfcofCrypsgCnt;
    }

    /**
     * 车辆自重量(整备质量)
     * @return VE_SELF_WT 车辆自重量(整备质量)
     */
    public BigDecimal getVeSelfWt() {
        return veSelfWt;
    }

    /**
     * 车辆自重量(整备质量)
     * @param veSelfWt 车辆自重量(整备质量)
     */
    public void setVeSelfWt(BigDecimal veSelfWt) {
        this.veSelfWt = veSelfWt;
    }

    /**
     * 车身颜色代码
     * @return VE_COLCD 车身颜色代码
     */
    public String getVeColcd() {
        return veColcd;
    }

    /**
     * 车身颜色代码
     * @param veColcd 车身颜色代码
     */
    public void setVeColcd(String veColcd) {
        this.veColcd = veColcd == null ? null : veColcd.trim();
    }

    /**
     * 车辆电子车牌号
     * @return VE_ELCT_PLTNO 车辆电子车牌号
     */
    public String getVeElctPltno() {
        return veElctPltno;
    }

    /**
     * 车辆电子车牌号
     * @param veElctPltno 车辆电子车牌号
     */
    public void setVeElctPltno(String veElctPltno) {
        this.veElctPltno = veElctPltno == null ? null : veElctPltno.trim();
    }

    /**
     * GPS编号(GPSID号)
     * @return GPS_NO GPS编号(GPSID号)
     */
    public String getGpsNo() {
        return gpsNo;
    }

    /**
     * GPS编号(GPSID号)
     * @param gpsNo GPS编号(GPSID号)
     */
    public void setGpsNo(String gpsNo) {
        this.gpsNo = gpsNo == null ? null : gpsNo.trim();
    }

    /**
     * 批文/许可证有效期(年月日)
     * @return RFILE_LIC_VALID_DATE 批文/许可证有效期(年月日)
     */
    public Date getRfileLicValidDate() {
        return rfileLicValidDate;
    }

    /**
     * 批文/许可证有效期(年月日)
     * @param rfileLicValidDate 批文/许可证有效期(年月日)
     */
    public void setRfileLicValidDate(Date rfileLicValidDate) {
        this.rfileLicValidDate = rfileLicValidDate;
    }

    /**
     * 申请人编号
     * @return APPLY_ER_NO 申请人编号
     */
    public String getApplyErNo() {
        return applyErNo;
    }

    /**
     * 申请人编号
     * @param applyErNo 申请人编号
     */
    public void setApplyErNo(String applyErNo) {
        this.applyErNo = applyErNo == null ? null : applyErNo.trim();
    }

    /**
     * 申请人姓名
     * @return APPLY_ER_NAME 申请人姓名
     */
    public String getApplyErName() {
        return applyErName;
    }

    /**
     * 申请人姓名
     * @param applyErName 申请人姓名
     */
    public void setApplyErName(String applyErName) {
        this.applyErName = applyErName == null ? null : applyErName.trim();
    }

    /**
     * 申请时间(年月日)
     * @return APPLY_TIME 申请时间(年月日)
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * 申请时间(年月日)
     * @param applyTime 申请时间(年月日)
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * 审核关员编号
     * @return EMVRY_CUSRNO 审核关员编号
     */
    public String getEmvryCusrno() {
        return emvryCusrno;
    }

    /**
     * 审核关员编号
     * @param emvryCusrno 审核关员编号
     */
    public void setEmvryCusrno(String emvryCusrno) {
        this.emvryCusrno = emvryCusrno == null ? null : emvryCusrno.trim();
    }

    /**
     * 审核关员姓名
     * @return EMVRY_CUSER_NAME 审核关员姓名
     */
    public String getEmvryCuserName() {
        return emvryCuserName;
    }

    /**
     * 审核关员姓名
     * @param emvryCuserName 审核关员姓名
     */
    public void setEmvryCuserName(String emvryCuserName) {
        this.emvryCuserName = emvryCuserName == null ? null : emvryCuserName.trim();
    }

    /**
     * 审核时间(时分秒)
     * @return EMVRY_TIME 审核时间(时分秒)
     */
    public Date getEmvryTime() {
        return emvryTime;
    }

    /**
     * 审核时间(时分秒)
     * @param emvryTime 审核时间(时分秒)
     */
    public void setEmvryTime(Date emvryTime) {
        this.emvryTime = emvryTime;
    }

    /**
     * 审核状态代码
     * @return EMVRY_STSCD 审核状态代码
     */
    public String getEmvryStscd() {
        return emvryStscd;
    }

    /**
     * 审核状态代码
     * @param emvryStscd 审核状态代码
     */
    public void setEmvryStscd(String emvryStscd) {
        this.emvryStscd = emvryStscd == null ? null : emvryStscd.trim();
    }

    /**
     * 审核备注
     * @return EMVRY_RMK 审核备注
     */
    public String getEmvryRmk() {
        return emvryRmk;
    }

    /**
     * 审核备注
     * @param emvryRmk 审核备注
     */
    public void setEmvryRmk(String emvryRmk) {
        this.emvryRmk = emvryRmk == null ? null : emvryRmk.trim();
    }

	public String getRoadTrspmcBscNo() {
		return roadTrspmcBscNo;
	}

	public void setRoadTrspmcBscNo(String roadTrspmcBscNo) {
		this.roadTrspmcBscNo = roadTrspmcBscNo;
	}
    
}