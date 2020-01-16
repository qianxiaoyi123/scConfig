package multipledatasources.resttemptemplate.bean;

/**
 * Created by zhangmingyu on 2019/2/26.
 */
public class FaceSave {
    public String getIdentifyCard() {
        return identifyCard;
    }

    public void setIdentifyCard(String identifyCard) {
        this.identifyCard = identifyCard;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBorderMarket() {
        return borderMarket;
    }

    public void setBorderMarket(String borderMarket) {
        this.borderMarket = borderMarket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String identifyCard;
    private String image;
    private String borderMarket;
    private String name;
}
