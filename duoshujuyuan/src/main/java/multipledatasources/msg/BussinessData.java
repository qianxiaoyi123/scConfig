package multipledatasources.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class BussinessData {
	@XmlElement(name = "CHK105")
	private CHK105 chk105;

	public CHK105 getChk105() {
		return chk105;
	}

	public void setChk105(CHK105 chk105) {
		this.chk105 = chk105;
	}


}
