package multipledatasources.msg;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class IgdsdclDtTmp implements Serializable {
    /**
     * 进口商品申报单明细编号
     */
    private String igdsdclDtNo;

    /**
     * 进口商品申报单临时编号
     */
    private String igdsdclTmpNo;

    /**
     * 进口商品申报单基本编号
     */
    private String igdsdclBscNo;

    /**
     * 申报时间
     */
    private Date createTime;

    /**
     * 进口商品申报单编号
     */
    private String igdsdclNo;

    /**
     * 商品编码
     */
    private String gdecd;

    /**
     * 商品名称
     */
    private String gdsNm;

    /**
     * 边民互市商铺编号
     */
    private String btrnbShopsNo;

    /**
     * 边民互市商铺名称
     */
    private String btrnbShopsNm;

    /**
     * HS商品编码
     */
    private String hsGdecd;

    /**
     * 商品规格型号描述
     */
    private String gdsSpcfModelDesc;

    /**
     * 原产国别代码
     */
    private String originNatcd;

    /**
     * 申报类型代码
     */
    private String dclTypecd;

    /**
     * 申报数量
     */
    private BigDecimal dclQty;

    /**
     * 毛重量
     */
    private BigDecimal grossWt;

    /**
     * 净重量
     */
    private BigDecimal netWt;

    /**
     * 申报计量单位代码
     */
    private String dclUnitcd;

    /**
     * 包装类型代码
     */
    private String wrapTypecd;

    /**
     * 申报单价金额
     */
    private BigDecimal dclUprcAmt;

    /**
     * 申报总金额
     */
    private BigDecimal dclTotalAmt;

    /**
     * 通过卡口商品重量
     */
    private BigDecimal adoptChkpGdsWt;

    /**
     * IGDSDCL_DT_TMP
     */
    private static final long serialVersionUID = 1L;

    /**
     * 进口商品申报单明细编号
     * @return IGDSDCL_DT_NO 进口商品申报单明细编号
     */
    public String getIgdsdclDtNo() {
        return igdsdclDtNo;
    }

    /**
     * 进口商品申报单明细编号
     * @param igdsdclDtNo 进口商品申报单明细编号
     */
    public void setIgdsdclDtNo(String igdsdclDtNo) {
        this.igdsdclDtNo = igdsdclDtNo == null ? null : igdsdclDtNo.trim();
    }

    /**
     * 进口商品申报单临时编号
     * @return IGDSDCL_TMP_NO 进口商品申报单临时编号
     */
    public String getIgdsdclTmpNo() {
        return igdsdclTmpNo;
    }

    /**
     * 进口商品申报单临时编号
     * @param igdsdclTmpNo 进口商品申报单临时编号
     */
    public void setIgdsdclTmpNo(String igdsdclTmpNo) {
        this.igdsdclTmpNo = igdsdclTmpNo == null ? null : igdsdclTmpNo.trim();
    }

    /**
     * 进口商品申报单基本编号
     * @return IGDSDCL_BSC_NO 进口商品申报单基本编号
     */
    public String getIgdsdclBscNo() {
        return igdsdclBscNo;
    }

    /**
     * 进口商品申报单基本编号
     * @param igdsdclBscNo 进口商品申报单基本编号
     */
    public void setIgdsdclBscNo(String igdsdclBscNo) {
        this.igdsdclBscNo = igdsdclBscNo == null ? null : igdsdclBscNo.trim();
    }

    /**
     * 申报时间
     * @return CREATE_TIME 申报时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 申报时间
     * @param createTime 申报时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 进口商品申报单编号
     * @return IGDSDCL_NO 进口商品申报单编号
     */
    public String getIgdsdclNo() {
        return igdsdclNo;
    }

    /**
     * 进口商品申报单编号
     * @param igdsdclNo 进口商品申报单编号
     */
    public void setIgdsdclNo(String igdsdclNo) {
        this.igdsdclNo = igdsdclNo == null ? null : igdsdclNo.trim();
    }

    /**
     * 商品编码
     * @return GDECD 商品编码
     */
    public String getGdecd() {
        return gdecd;
    }

    /**
     * 商品编码
     * @param gdecd 商品编码
     */
    public void setGdecd(String gdecd) {
        this.gdecd = gdecd == null ? null : gdecd.trim();
    }

    /**
     * 商品名称
     * @return GDS_NM 商品名称
     */
    public String getGdsNm() {
        return gdsNm;
    }

    /**
     * 商品名称
     * @param gdsNm 商品名称
     */
    public void setGdsNm(String gdsNm) {
        this.gdsNm = gdsNm == null ? null : gdsNm.trim();
    }

    /**
     * 边民互市商铺编号
     * @return BTRNB_SHOPS_NO 边民互市商铺编号
     */
    public String getBtrnbShopsNo() {
        return btrnbShopsNo;
    }

    /**
     * 边民互市商铺编号
     * @param btrnbShopsNo 边民互市商铺编号
     */
    public void setBtrnbShopsNo(String btrnbShopsNo) {
        this.btrnbShopsNo = btrnbShopsNo == null ? null : btrnbShopsNo.trim();
    }

    /**
     * 边民互市商铺名称
     * @return BTRNB_SHOPS_NM 边民互市商铺名称
     */
    public String getBtrnbShopsNm() {
        return btrnbShopsNm;
    }

    /**
     * 边民互市商铺名称
     * @param btrnbShopsNm 边民互市商铺名称
     */
    public void setBtrnbShopsNm(String btrnbShopsNm) {
        this.btrnbShopsNm = btrnbShopsNm == null ? null : btrnbShopsNm.trim();
    }

    /**
     * HS商品编码
     * @return HS_GDECD HS商品编码
     */
    public String getHsGdecd() {
        return hsGdecd;
    }

    /**
     * HS商品编码
     * @param hsGdecd HS商品编码
     */
    public void setHsGdecd(String hsGdecd) {
        this.hsGdecd = hsGdecd == null ? null : hsGdecd.trim();
    }

    /**
     * 商品规格型号描述
     * @return GDS_SPCF_MODEL_DESC 商品规格型号描述
     */
    public String getGdsSpcfModelDesc() {
        return gdsSpcfModelDesc;
    }

    /**
     * 商品规格型号描述
     * @param gdsSpcfModelDesc 商品规格型号描述
     */
    public void setGdsSpcfModelDesc(String gdsSpcfModelDesc) {
        this.gdsSpcfModelDesc = gdsSpcfModelDesc == null ? null : gdsSpcfModelDesc.trim();
    }

    /**
     * 原产国别代码
     * @return ORIGIN_NATCD 原产国别代码
     */
    public String getOriginNatcd() {
        return originNatcd;
    }

    /**
     * 原产国别代码
     * @param originNatcd 原产国别代码
     */
    public void setOriginNatcd(String originNatcd) {
        this.originNatcd = originNatcd == null ? null : originNatcd.trim();
    }

    /**
     * 申报类型代码
     * @return DCL_TYPECD 申报类型代码
     */
    public String getDclTypecd() {
        return dclTypecd;
    }

    /**
     * 申报类型代码
     * @param dclTypecd 申报类型代码
     */
    public void setDclTypecd(String dclTypecd) {
        this.dclTypecd = dclTypecd == null ? null : dclTypecd.trim();
    }

    /**
     * 申报数量
     * @return DCL_QTY 申报数量
     */
    public BigDecimal getDclQty() {
        return dclQty;
    }

    /**
     * 申报数量
     * @param dclQty 申报数量
     */
    public void setDclQty(BigDecimal dclQty) {
        this.dclQty = dclQty;
    }

    /**
     * 毛重量
     * @return GROSS_WT 毛重量
     */
    public BigDecimal getGrossWt() {
        return grossWt;
    }

    /**
     * 毛重量
     * @param grossWt 毛重量
     */
    public void setGrossWt(BigDecimal grossWt) {
        this.grossWt = grossWt;
    }

    /**
     * 净重量
     * @return NET_WT 净重量
     */
    public BigDecimal getNetWt() {
        return netWt;
    }

    /**
     * 净重量
     * @param netWt 净重量
     */
    public void setNetWt(BigDecimal netWt) {
        this.netWt = netWt;
    }

    /**
     * 申报计量单位代码
     * @return DCL_UNITCD 申报计量单位代码
     */
    public String getDclUnitcd() {
        return dclUnitcd;
    }

    /**
     * 申报计量单位代码
     * @param dclUnitcd 申报计量单位代码
     */
    public void setDclUnitcd(String dclUnitcd) {
        this.dclUnitcd = dclUnitcd == null ? null : dclUnitcd.trim();
    }

    /**
     * 包装类型代码
     * @return WRAP_TYPECD 包装类型代码
     */
    public String getWrapTypecd() {
        return wrapTypecd;
    }

    /**
     * 包装类型代码
     * @param wrapTypecd 包装类型代码
     */
    public void setWrapTypecd(String wrapTypecd) {
        this.wrapTypecd = wrapTypecd == null ? null : wrapTypecd.trim();
    }

    /**
     * 申报单价金额
     * @return DCL_UPRC_AMT 申报单价金额
     */
    public BigDecimal getDclUprcAmt() {
        return dclUprcAmt;
    }

    /**
     * 申报单价金额
     * @param dclUprcAmt 申报单价金额
     */
    public void setDclUprcAmt(BigDecimal dclUprcAmt) {
        this.dclUprcAmt = dclUprcAmt;
    }

    /**
     * 申报总金额
     * @return DCL_TOTAL_AMT 申报总金额
     */
    public BigDecimal getDclTotalAmt() {
        return dclTotalAmt;
    }

    /**
     * 申报总金额
     * @param dclTotalAmt 申报总金额
     */
    public void setDclTotalAmt(BigDecimal dclTotalAmt) {
        this.dclTotalAmt = dclTotalAmt;
    }

    /**
     * 通过卡口商品重量
     * @return ADOPT_CHKP_GDS_WT 通过卡口商品重量
     */
    public BigDecimal getAdoptChkpGdsWt() {
        return adoptChkpGdsWt;
    }

    /**
     * 通过卡口商品重量
     * @param adoptChkpGdsWt 通过卡口商品重量
     */
    public void setAdoptChkpGdsWt(BigDecimal adoptChkpGdsWt) {
        this.adoptChkpGdsWt = adoptChkpGdsWt;
    }
}