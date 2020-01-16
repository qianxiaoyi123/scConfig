package multipledatasources.resttemptemplate.bean;

/**
 * Created by zhangmingyu on 2019/2/25.
 */
public class Face {
    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    private String departmentId;

    @Override
    public String toString() {
        return "Face{" +
                "departmentId='" + departmentId + '\'' +
                ", borderMarket='" + borderMarket + '\'' +
                ", personId='" + personId + '\'' +
                ", targetImage='" + targetImage + '\'' +
                '}';
    }

    private String borderMarket;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    private String personId;
    private String targetImage;


    public String getBorderMarket() {
        return borderMarket;
    }

    public void setBorderMarket(String borderMarket) {
        this.borderMarket = borderMarket;
    }



    public String getTargetImage() {
        return targetImage;
    }

    public void setTargetImage(String targetImage) {
        this.targetImage = targetImage;
    }
}
