package multipledatasources.bean;

import java.io.Serializable;

public class BtrnbPrsnPutrecBscWithBLOBs extends BtrnbPrsnPutrecBsc implements Serializable {
    /**
     * 第一指纹信息
     */
    private String fstFgprtInfo;

    /**
     * 第二指纹信息
     */
    private String secdFgprtInfo;

    /**
     * 照片信息
     */
    private String photoInfo;

    @Override
    public String toString() {
        return "BtrnbPrsnPutrecBscWithBLOBs{" +
                "fstFgprtInfo='" + fstFgprtInfo + '\'' +
                ", secdFgprtInfo='" + secdFgprtInfo + '\'' +
                ", photoInfo='" + photoInfo + '\'' +
                '}';
    }

    /**
     * BTRNB_PRSN_PUTREC_BSC
     */
    private static final long serialVersionUID = 1L;

    /**
     * 第一指纹信息
     * @return FST_FGPRT_INFO 第一指纹信息
     */
    public String getFstFgprtInfo() {
        return fstFgprtInfo;
    }

    /**
     * 第一指纹信息
     * @param fstFgprtInfo 第一指纹信息
     */
    public void setFstFgprtInfo(String fstFgprtInfo) {
        this.fstFgprtInfo = fstFgprtInfo == null ? null : fstFgprtInfo.trim();
    }

    /**
     * 第二指纹信息
     * @return SECD_FGPRT_INFO 第二指纹信息
     */
    public String getSecdFgprtInfo() {
        return secdFgprtInfo;
    }

    /**
     * 第二指纹信息
     * @param secdFgprtInfo 第二指纹信息
     */
    public void setSecdFgprtInfo(String secdFgprtInfo) {
        this.secdFgprtInfo = secdFgprtInfo == null ? null : secdFgprtInfo.trim();
    }

    /**
     * 照片信息
     * @return PHOTO_INFO 照片信息
     */
    public String getPhotoInfo() {
        return photoInfo;
    }

    /**
     * 照片信息
     * @param photoInfo 照片信息
     */
    public void setPhotoInfo(String photoInfo) {
        this.photoInfo = photoInfo == null ? null : photoInfo.trim();
    }

}