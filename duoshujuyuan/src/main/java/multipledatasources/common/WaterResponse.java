package multipledatasources.common;

import multipledatasources.water.controller.WaterFlightResDTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangmingyu on 2020/1/8.
 */

 public class WaterResponse  {
    private String ResultStatus;
    private String ErrorData;
    private List<Result> ResultData;

    public String getResultStatus() {
        return ResultStatus;
    }

    @Override
    public String toString() {
        return "WaterResponse{" +
                "ResultStatus='" + ResultStatus + '\'' +
                ", ErrorData='" + ErrorData + '\'' +
                ", ResultData=" + ResultData +
                '}';
    }

    public void setResultStatus(String resultStatus) {
        ResultStatus = resultStatus;
    }

    public String getErrorData() {
        return ErrorData;
    }

    public void setErrorData(String errorData) {
        ErrorData = errorData;
    }

    public List<Result> getResultData() {
        return ResultData;
    }

    public void setResultData(List<Result> resultData) {
        ResultData = resultData;
    }

    class Result{

    private String I_E_Flag;//进出口方式
    private String Decl_Traf_Mode;//运输方式
    private String Form_Id;//多式联运单证号
    private String Form_Type;//单证类型
    private String Gross_Wt;//合住核销重量
    private String Oper_Code;//操作结果
    private String Oper_Er;//核注核销人
    private String Oper_Date;//操作时间
    private String Dest_Customs_Code;//管辖关区号码
    private String Customs_Code;
    private String Manifest_Id;//舱单信息编号
    private String Bill_No;//提运单号
    private String Remark;//备注
    private String ErrorMesg;
    private String SuccessMesg;
    private String ParamSetChkRel;//操作方式：（核注核销，反核注核销）
    private String ON_OFF;
    private String I_E_DATE;
    private String PACK_NO;//合住核销件数
    @Override
    public String toString() {
        return "WaterResponse{" +
                "I_E_Flag='" + I_E_Flag + '\'' +
                ", Decl_Traf_Mode='" + Decl_Traf_Mode + '\'' +
                ", Form_Id='" + Form_Id + '\'' +
                ", Form_Type='" + Form_Type + '\'' +
                ", Gross_Wt='" + Gross_Wt + '\'' +
                ", Oper_Code='" + Oper_Code + '\'' +
                ", Oper_Er='" + Oper_Er + '\'' +
                ", Oper_Date='" + Oper_Date + '\'' +
                ", Dest_Customs_Code='" + Dest_Customs_Code + '\'' +
                ", Customs_Code='" + Customs_Code + '\'' +
                ", Manifest_Id='" + Manifest_Id + '\'' +
                ", Bill_No='" + Bill_No + '\'' +
                ", Remark='" + Remark + '\'' +
                ", ErrorMesg='" + ErrorMesg + '\'' +
                ", SuccessMesg='" + SuccessMesg + '\'' +
                ", ParamSetChkRel='" + ParamSetChkRel + '\'' +
                ", ON_OFF='" + ON_OFF + '\'' +
                ", I_E_DATE='" + I_E_DATE + '\'' +
                ", PACK_NO='" + PACK_NO + '\'' +
                '}';
    }

    public String getI_E_Flag() {
        return I_E_Flag;
    }

    public void setI_E_Flag(String i_E_Flag) {
        I_E_Flag = i_E_Flag;
    }

    public String getDecl_Traf_Mode() {
        return Decl_Traf_Mode;
    }

    public void setDecl_Traf_Mode(String decl_Traf_Mode) {
        Decl_Traf_Mode = decl_Traf_Mode;
    }

    public String getForm_Id() {
        return Form_Id;
    }

    public void setForm_Id(String form_Id) {
        Form_Id = form_Id;
    }

    public String getForm_Type() {
        return Form_Type;
    }

    public void setForm_Type(String form_Type) {
        Form_Type = form_Type;
    }

    public String getGross_Wt() {
        return Gross_Wt;
    }

    public void setGross_Wt(String gross_Wt) {
        Gross_Wt = gross_Wt;
    }

    public String getOper_Code() {
        return Oper_Code;
    }

    public void setOper_Code(String oper_Code) {
        Oper_Code = oper_Code;
    }

    public String getOper_Er() {
        return Oper_Er;
    }

    public void setOper_Er(String oper_Er) {
        Oper_Er = oper_Er;
    }

    public String getOper_Date() {
        return Oper_Date;
    }

    public void setOper_Date(String oper_Date) {
        Oper_Date = oper_Date;
    }

    public String getDest_Customs_Code() {
        return Dest_Customs_Code;
    }

    public void setDest_Customs_Code(String dest_Customs_Code) {
        Dest_Customs_Code = dest_Customs_Code;
    }

    public String getCustoms_Code() {
        return Customs_Code;
    }

    public void setCustoms_Code(String customs_Code) {
        Customs_Code = customs_Code;
    }

    public String getManifest_Id() {
        return Manifest_Id;
    }

    public void setManifest_Id(String manifest_Id) {
        Manifest_Id = manifest_Id;
    }

    public String getBill_No() {
        return Bill_No;
    }

    public void setBill_No(String bill_No) {
        Bill_No = bill_No;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getErrorMesg() {
        return ErrorMesg;
    }

    public void setErrorMesg(String errorMesg) {
        ErrorMesg = errorMesg;
    }

    public String getSuccessMesg() {
        return SuccessMesg;
    }

    public void setSuccessMesg(String successMesg) {
        SuccessMesg = successMesg;
    }

    public String getParamSetChkRel() {
        return ParamSetChkRel;
    }

    public void setParamSetChkRel(String paramSetChkRel) {
        ParamSetChkRel = paramSetChkRel;
    }

    public String getON_OFF() {
        return ON_OFF;
    }

    public void setON_OFF(String ON_OFF) {
        this.ON_OFF = ON_OFF;
    }

    public String getI_E_DATE() {
        return I_E_DATE;
    }

    public void setI_E_DATE(String i_E_DATE) {
        I_E_DATE = i_E_DATE;
    }

    public String getPACK_NO() {
        return PACK_NO;
    }

    public void setPACK_NO(String PACK_NO) {
        this.PACK_NO = PACK_NO;
    }
    }

}
