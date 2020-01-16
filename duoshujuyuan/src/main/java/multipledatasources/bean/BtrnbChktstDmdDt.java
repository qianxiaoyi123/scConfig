package multipledatasources.bean;

import multipledatasources.common.HSBaseModel;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.io.Serializable;
import java.util.Date;
// WebApplicationContext  ,proxyMode = ScopedProxyMode.INTERFACES
@Component
//@Scope(value = WebApplicationContext.SCOPE_REQUEST,proxyMode = ScopedProxyMode.INTERFACES)
//@Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE)
public class BtrnbChktstDmdDt extends HSBaseModel implements Serializable {
    /**
     * 查验要求明细编号
     */
    private String btrnbChktstDmdDtNo;

    /**
     * 查验记录单编号
     */
    private String btrnbChktstRecBlNo;

    /**
     * 查验派单时间
     */
    private Date btrnbChktstAformTime;

    /**
     * 查验要求代码
     */
    private String chktstDmdcd;

    /**
     * 查验要求名称
     */
    private String chktstDmdNm;

    /**
     * 查验要求标志
     */
    private String chktstDmdFlag;

    /**
     * BTRNB_CHKTST_DMD_DT
     */
    private static final long serialVersionUID = 1L;

    /**
     * 查验要求明细编号
     * @return BTRNB_CHKTST_DMD_DT_NO 查验要求明细编号
     */
    public String getBtrnbChktstDmdDtNo() {
        return btrnbChktstDmdDtNo;
    }

    /**
     * 查验要求明细编号
     * @param btrnbChktstDmdDtNo 查验要求明细编号
     */
    public void setBtrnbChktstDmdDtNo(String btrnbChktstDmdDtNo) {
        this.btrnbChktstDmdDtNo = btrnbChktstDmdDtNo == null ? null : btrnbChktstDmdDtNo.trim();
    }

    /**
     * 查验记录单编号
     * @return BTRNB_CHKTST_REC_BL_NO 查验记录单编号
     */
    public String getBtrnbChktstRecBlNo() {
        return btrnbChktstRecBlNo;
    }

    /**
     * 查验记录单编号
     * @param btrnbChktstRecBlNo 查验记录单编号
     */
    public void setBtrnbChktstRecBlNo(String btrnbChktstRecBlNo) {
        this.btrnbChktstRecBlNo = btrnbChktstRecBlNo == null ? null : btrnbChktstRecBlNo.trim();
    }

    /**
     * 查验派单时间
     * @return BTRNB_CHKTST_AFORM_TIME 查验派单时间
     */
    public Date getBtrnbChktstAformTime() {
        return btrnbChktstAformTime;
    }

    /**
     * 查验派单时间
     * @param btrnbChktstAformTime 查验派单时间
     */
    public void setBtrnbChktstAformTime(Date btrnbChktstAformTime) {
        this.btrnbChktstAformTime = btrnbChktstAformTime;
    }

    /**
     * 查验要求代码
     * @return CHKTST_DMDCD 查验要求代码
     */
    public String getChktstDmdcd() {
        return chktstDmdcd;
    }

    /**
     * 查验要求代码
     * @param chktstDmdcd 查验要求代码
     */
    public void setChktstDmdcd(String chktstDmdcd) {
        this.chktstDmdcd = chktstDmdcd == null ? null : chktstDmdcd.trim();
    }

    /**
     * 查验要求名称
     * @return CHKTST_DMD_NM 查验要求名称
     */
    public String getChktstDmdNm() {
        return chktstDmdNm;
    }

    /**
     * 查验要求名称
     * @param chktstDmdNm 查验要求名称
     */
    public void setChktstDmdNm(String chktstDmdNm) {
        this.chktstDmdNm = chktstDmdNm == null ? null : chktstDmdNm.trim();
    }

    /**
     * 查验要求标志
     * @return CHKTST_DMD_FLAG 查验要求标志
     */
    public String getChktstDmdFlag() {
        return chktstDmdFlag;
    }

    /**
     * 查验要求标志
     * @param chktstDmdFlag 查验要求标志
     */
    public void setChktstDmdFlag(String chktstDmdFlag) {
        this.chktstDmdFlag = chktstDmdFlag == null ? null : chktstDmdFlag.trim();
    }

    @Override
    public String toString() {
        return "BtrnbChktstDmdDt{" +
                "btrnbChktstDmdDtNo='" + btrnbChktstDmdDtNo + '\'' +
                ", btrnbChktstRecBlNo='" + btrnbChktstRecBlNo + '\'' +
                ", btrnbChktstAformTime=" + btrnbChktstAformTime +
                ", chktstDmdcd='" + chktstDmdcd + '\'' +
                ", chktstDmdNm='" + chktstDmdNm + '\'' +
                ", chktstDmdFlag='" + chktstDmdFlag + '\'' +
                '}';
    }
}