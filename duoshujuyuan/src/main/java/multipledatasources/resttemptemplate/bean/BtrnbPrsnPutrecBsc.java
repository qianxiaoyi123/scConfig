package multipledatasources.resttemptemplate.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BtrnbPrsnPutrecBsc implements Serializable {
    /**
     * 边民互市人员备案基本编号
     */
    private String btrnbPrsnPutrecBscNo;

    /**
     * 边民互市人员备案编号
     */
    private String btrnbPrsnPutrecNo;

    /**
     * 申报时间
     */
    private Date dclTime;

    /**
     * 备案人姓名
     */
    private String putrecErName;

    /**
     * 性别代码
     */
    private String gencd;

    /**
     * 身份证号
     */
    private String idno;

    /**
     * 身份证号HASH编码
     */
    private String idnoHashNo;

    /**
     * 身份证有效开始日期
     */
    private Date idcdValidBeginDate;

    /**
     * 身份证有效结束日期
     */
    private Date idcdValidFinishDate;

    /**
     * 身份证发证机关名称
     */
    private String idcdGcertPgoffNm;

    /**
     * 移动电话号码
     */
    private BigDecimal mobnum;

    /**
     * 籍贯名称
     */
    private String birplNm;

    /**
     * 居住地址
     */
    private String residAddr;

    /**
     * 身份类型代码
     */
    private String identTypecd;

    /**
     * 申报关区代码
     */
    private String dclCuscd;

    /**
     * 监管场所编号
     */
    private String supvLoctNo;

    /**
     * IC卡号
     */
    private String icCardno;

    /**
     * IC卡制造编号
     */
    private String icCardMadeNo;

    /**
     * 备案延期标志
     */
    private String putrecPstpFlag;

    /**
     * 备案时间
     */
    private Date putrecTime;

    /**
     * 备案有效日期
     */
    private Date putrecValidDate;

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
     * 备注
     */
    private String rmk;

    /**
     * 有效标志
     */
    private String validFlag;

    /**
     * 操作类型代码
     */
    private String opTypecd;

    /**
     * 备案变更标志
     */
    private String putrecChgFlag;

    /**
     * 名族
     */
    private String nationality;

    /**
     * BTRNB_PRSN_PUTREC_BSC
     */
    private static final long serialVersionUID = 1L;

    /**
     * 边民互市人员备案基本编号
     * @return BTRNB_PRSN_PUTREC_BSC_NO 边民互市人员备案基本编号
     */
    public String getBtrnbPrsnPutrecBscNo() {
        return btrnbPrsnPutrecBscNo;
    }

    /**
     * 边民互市人员备案基本编号
     * @param btrnbPrsnPutrecBscNo 边民互市人员备案基本编号
     */
    public void setBtrnbPrsnPutrecBscNo(String btrnbPrsnPutrecBscNo) {
        this.btrnbPrsnPutrecBscNo = btrnbPrsnPutrecBscNo == null ? null : btrnbPrsnPutrecBscNo.trim();
    }

    /**
     * 边民互市人员备案编号
     * @return BTRNB_PRSN_PUTREC_NO 边民互市人员备案编号
     */
    public String getBtrnbPrsnPutrecNo() {
        return btrnbPrsnPutrecNo;
    }

    /**
     * 边民互市人员备案编号
     * @param btrnbPrsnPutrecNo 边民互市人员备案编号
     */
    public void setBtrnbPrsnPutrecNo(String btrnbPrsnPutrecNo) {
        this.btrnbPrsnPutrecNo = btrnbPrsnPutrecNo == null ? null : btrnbPrsnPutrecNo.trim();
    }

    /**
     * 申报时间
     * @return DCL_TIME 申报时间
     */
    public Date getDclTime() {
        return dclTime;
    }

    /**
     * 申报时间
     * @param dclTime 申报时间
     */
    public void setDclTime(Date dclTime) {
        this.dclTime = dclTime;
    }

    /**
     * 备案人姓名
     * @return PUTREC_ER_NAME 备案人姓名
     */
    public String getPutrecErName() {
        return putrecErName;
    }

    /**
     * 备案人姓名
     * @param putrecErName 备案人姓名
     */
    public void setPutrecErName(String putrecErName) {
        this.putrecErName = putrecErName == null ? null : putrecErName.trim();
    }

    /**
     * 性别代码
     * @return GENCD 性别代码
     */
    public String getGencd() {
        return gencd;
    }

    /**
     * 性别代码
     * @param gencd 性别代码
     */
    public void setGencd(String gencd) {
        this.gencd = gencd == null ? null : gencd.trim();
    }

    /**
     * 身份证号
     * @return IDNO 身份证号
     */
    public String getIdno() {
        return idno;
    }

    /**
     * 身份证号
     * @param idno 身份证号
     */
    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    /**
     * 身份证号HASH编码
     * @return IDNO_HASH_NO 身份证号HASH编码
     */
    public String getIdnoHashNo() {
        return idnoHashNo;
    }

    /**
     * 身份证号HASH编码
     * @param idnoHashNo 身份证号HASH编码
     */
    public void setIdnoHashNo(String idnoHashNo) {
        this.idnoHashNo = idnoHashNo == null ? null : idnoHashNo.trim();
    }

    /**
     * 身份证有效开始日期
     * @return IDCD_VALID_BEGIN_DATE 身份证有效开始日期
     */
    public Date getIdcdValidBeginDate() {
        return idcdValidBeginDate;
    }

    /**
     * 身份证有效开始日期
     * @param idcdValidBeginDate 身份证有效开始日期
     */
    public void setIdcdValidBeginDate(Date idcdValidBeginDate) {
        this.idcdValidBeginDate = idcdValidBeginDate;
    }

    /**
     * 身份证有效结束日期
     * @return IDCD_VALID_FINISH_DATE 身份证有效结束日期
     */
    public Date getIdcdValidFinishDate() {
        return idcdValidFinishDate;
    }

    /**
     * 身份证有效结束日期
     * @param idcdValidFinishDate 身份证有效结束日期
     */
    public void setIdcdValidFinishDate(Date idcdValidFinishDate) {
        this.idcdValidFinishDate = idcdValidFinishDate;
    }

    /**
     * 身份证发证机关名称
     * @return IDCD_GCERT_PGOFF_NM 身份证发证机关名称
     */
    public String getIdcdGcertPgoffNm() {
        return idcdGcertPgoffNm;
    }

    /**
     * 身份证发证机关名称
     * @param idcdGcertPgoffNm 身份证发证机关名称
     */
    public void setIdcdGcertPgoffNm(String idcdGcertPgoffNm) {
        this.idcdGcertPgoffNm = idcdGcertPgoffNm == null ? null : idcdGcertPgoffNm.trim();
    }

    /**
     * 移动电话号码
     * @return MOBNUM 移动电话号码
     */
    public BigDecimal getMobnum() {
        return mobnum;
    }

    /**
     * 移动电话号码
     * @param mobnum 移动电话号码
     */
    public void setMobnum(BigDecimal mobnum) {
        this.mobnum = mobnum;
    }

    /**
     * 籍贯名称
     * @return BIRPL_NM 籍贯名称
     */
    public String getBirplNm() {
        return birplNm;
    }

    /**
     * 籍贯名称
     * @param birplNm 籍贯名称
     */
    public void setBirplNm(String birplNm) {
        this.birplNm = birplNm == null ? null : birplNm.trim();
    }

    /**
     * 居住地址
     * @return RESID_ADDR 居住地址
     */
    public String getResidAddr() {
        return residAddr;
    }

    /**
     * 居住地址
     * @param residAddr 居住地址
     */
    public void setResidAddr(String residAddr) {
        this.residAddr = residAddr == null ? null : residAddr.trim();
    }

    /**
     * 身份类型代码
     * @return IDENT_TYPECD 身份类型代码
     */
    public String getIdentTypecd() {
        return identTypecd;
    }

    /**
     * 身份类型代码
     * @param identTypecd 身份类型代码
     */
    public void setIdentTypecd(String identTypecd) {
        this.identTypecd = identTypecd == null ? null : identTypecd.trim();
    }

    /**
     * 申报关区代码
     * @return DCL_CUSCD 申报关区代码
     */
    public String getDclCuscd() {
        return dclCuscd;
    }

    /**
     * 申报关区代码
     * @param dclCuscd 申报关区代码
     */
    public void setDclCuscd(String dclCuscd) {
        this.dclCuscd = dclCuscd == null ? null : dclCuscd.trim();
    }

    /**
     * 监管场所编号
     * @return SUPV_LOCT_NO 监管场所编号
     */
    public String getSupvLoctNo() {
        return supvLoctNo;
    }

    /**
     * 监管场所编号
     * @param supvLoctNo 监管场所编号
     */
    public void setSupvLoctNo(String supvLoctNo) {
        this.supvLoctNo = supvLoctNo == null ? null : supvLoctNo.trim();
    }

    /**
     * IC卡号
     * @return IC_CARDNO IC卡号
     */
    public String getIcCardno() {
        return icCardno;
    }

    /**
     * IC卡号
     * @param icCardno IC卡号
     */
    public void setIcCardno(String icCardno) {
        this.icCardno = icCardno == null ? null : icCardno.trim();
    }

    /**
     * IC卡制造编号
     * @return IC_CARD_MADE_NO IC卡制造编号
     */
    public String getIcCardMadeNo() {
        return icCardMadeNo;
    }

    /**
     * IC卡制造编号
     * @param icCardMadeNo IC卡制造编号
     */
    public void setIcCardMadeNo(String icCardMadeNo) {
        this.icCardMadeNo = icCardMadeNo == null ? null : icCardMadeNo.trim();
    }

    /**
     * 备案延期标志
     * @return PUTREC_PSTP_FLAG 备案延期标志
     */
    public String getPutrecPstpFlag() {
        return putrecPstpFlag;
    }

    /**
     * 备案延期标志
     * @param putrecPstpFlag 备案延期标志
     */
    public void setPutrecPstpFlag(String putrecPstpFlag) {
        this.putrecPstpFlag = putrecPstpFlag == null ? null : putrecPstpFlag.trim();
    }

    /**
     * 备案时间
     * @return PUTREC_TIME 备案时间
     */
    public Date getPutrecTime() {
        return putrecTime;
    }

    /**
     * 备案时间
     * @param putrecTime 备案时间
     */
    public void setPutrecTime(Date putrecTime) {
        this.putrecTime = putrecTime;
    }

    /**
     * 备案有效日期
     * @return PUTREC_VALID_DATE 备案有效日期
     */
    public Date getPutrecValidDate() {
        return putrecValidDate;
    }

    /**
     * 备案有效日期
     * @param putrecValidDate 备案有效日期
     */
    public void setPutrecValidDate(Date putrecValidDate) {
        this.putrecValidDate = putrecValidDate;
    }

    /**
     * 创建时间
     * @return CREATE_TIME 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人编号
     * @return CREATE_ER_NO 创建人编号
     */
    public String getCreateErNo() {
        return createErNo;
    }

    /**
     * 创建人编号
     * @param createErNo 创建人编号
     */
    public void setCreateErNo(String createErNo) {
        this.createErNo = createErNo == null ? null : createErNo.trim();
    }

    /**
     * 创建人姓名
     * @return CREATE_ER_NAME 创建人姓名
     */
    public String getCreateErName() {
        return createErName;
    }

    /**
     * 创建人姓名
     * @param createErName 创建人姓名
     */
    public void setCreateErName(String createErName) {
        this.createErName = createErName == null ? null : createErName.trim();
    }

    /**
     * 修改时间
     * @return MODF_TIME 修改时间
     */
    public Date getModfTime() {
        return modfTime;
    }

    /**
     * 修改时间
     * @param modfTime 修改时间
     */
    public void setModfTime(Date modfTime) {
        this.modfTime = modfTime;
    }

    /**
     * 修改人编号
     * @return MODF_ER_NO 修改人编号
     */
    public String getModfErNo() {
        return modfErNo;
    }

    /**
     * 修改人编号
     * @param modfErNo 修改人编号
     */
    public void setModfErNo(String modfErNo) {
        this.modfErNo = modfErNo == null ? null : modfErNo.trim();
    }

    /**
     * 修改人姓名
     * @return MODF_ER_NAME 修改人姓名
     */
    public String getModfErName() {
        return modfErName;
    }

    /**
     * 修改人姓名
     * @param modfErName 修改人姓名
     */
    public void setModfErName(String modfErName) {
        this.modfErName = modfErName == null ? null : modfErName.trim();
    }

    /**
     * 审核状态代码
     * @return EMVRY_STUCD 审核状态代码
     */
    public String getEmvryStucd() {
        return emvryStucd;
    }

    /**
     * 审核状态代码
     * @param emvryStucd 审核状态代码
     */
    public void setEmvryStucd(String emvryStucd) {
        this.emvryStucd = emvryStucd == null ? null : emvryStucd.trim();
    }

    /**
     * 审核意见描述
     * @return EMVRY_OPIN_DESC 审核意见描述
     */
    public String getEmvryOpinDesc() {
        return emvryOpinDesc;
    }

    /**
     * 审核意见描述
     * @param emvryOpinDesc 审核意见描述
     */
    public void setEmvryOpinDesc(String emvryOpinDesc) {
        this.emvryOpinDesc = emvryOpinDesc == null ? null : emvryOpinDesc.trim();
    }

    /**
     * 备注
     * @return RMK 备注
     */
    public String getRmk() {
        return rmk;
    }

    /**
     * 备注
     * @param rmk 备注
     */
    public void setRmk(String rmk) {
        this.rmk = rmk == null ? null : rmk.trim();
    }

    /**
     * 有效标志
     * @return VALID_FLAG 有效标志
     */
    public String getValidFlag() {
        return validFlag;
    }

    /**
     * 有效标志
     * @param validFlag 有效标志
     */
    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag == null ? null : validFlag.trim();
    }

    /**
     * 操作类型代码
     * @return OP_TYPECD 操作类型代码
     */
    public String getOpTypecd() {
        return opTypecd;
    }

    /**
     * 操作类型代码
     * @param opTypecd 操作类型代码
     */
    public void setOpTypecd(String opTypecd) {
        this.opTypecd = opTypecd == null ? null : opTypecd.trim();
    }

    /**
     * 备案变更标志
     * @return PUTREC_CHG_FLAG 备案变更标志
     */
    public String getPutrecChgFlag() {
        return putrecChgFlag;
    }

    /**
     * 备案变更标志
     * @param putrecChgFlag 备案变更标志
     */
    public void setPutrecChgFlag(String putrecChgFlag) {
        this.putrecChgFlag = putrecChgFlag == null ? null : putrecChgFlag.trim();
    }

    /**
     * 名族
     * @return NATIONALITY 名族
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * 名族
     * @param nationality 名族
     */
    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }
}