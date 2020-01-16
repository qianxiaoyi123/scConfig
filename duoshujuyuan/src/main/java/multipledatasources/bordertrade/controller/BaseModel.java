package multipledatasources.bordertrade.controller;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.util.StringUtils;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.PROPERTY)
public class BaseModel {

	/**
	 * 查询列表的--业务模式代码
	 */
	String[] btrnbBizModecdArray = new String[]{""};

	/**
	 * 查询列表的--运输工具类型
	 */
	String[] trspModecdArray = new String[]{""};

	/**
	 * 查询列表的--启用状态
	 */
	String[] struseFlagArray = new String[]{""};

	/**
	 * 查询列表的--审核状态
	 */
	String[] opTypecdArray = new String[]{""};
	
	//隶属关区数组
	private String[] cuscdList;
	//多个审核状态值
	private String[] emvryStscdArray ;

	/**
	 * 进出口商品申报单流转状态
	 */
	private String IEgdsdclCirculationState;
	/**
	 * 查询列表的--开始日期
	 */
	private Date startDate;

	/**
	 * 查询列表的--结束日期
	 */
	private Date endDate;

	/**
	 * 录入日期
	 */
	private String creatDate;

	/**
	 * 修改日期
	 */
	private String  ModifDate;

	/**
	 * 备案有效日期,可以用来展示其他日期
	 */
	private String  commonTime;
	
	/**
	 * 分页--当前页
	 */
	private Integer page = 1;

	/**
	 * 分页--每页大小
	 */
	@XmlTransient
	private Integer pageSize = 5;

	public String[] getEmvryStscdArray() {
		return emvryStscdArray;
	}

	public void setEmvryStscdArray(String[] emvryStscdArray) {
		this.emvryStscdArray = emvryStscdArray;
	}

	public String[] getCuscdList() {
		return cuscdList;
	}

	public void setCuscdList(String[] cuscdList) {
		this.cuscdList = cuscdList;
	}

	@XmlTransient
	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	@XmlTransient
	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer rows) {
		this.pageSize = rows;
	}

	@XmlTransient
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@XmlTransient
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@XmlTransient
	public String[] getOpTypecdArray() {
		return opTypecdArray;
	}

	public void setOpTypecdArray(String[] opTypecdArray) {
		this.opTypecdArray = opTypecdArray;
	}

	@XmlTransient
	public String[] getStruseFlagArray() {
		return struseFlagArray;
	}

	public void setStruseFlagArray(String[] struseFlagArray) {
		this.struseFlagArray = struseFlagArray;
	}

	@XmlTransient
	public String[] getTrspModecdArray() {
		return trspModecdArray;
	}

	public void setTrspModecdArray(String[] trspModecdArray) {
		this.trspModecdArray = trspModecdArray;
	}

	@XmlTransient
	public String[] getBtrnbBizModecdArray() {
		return btrnbBizModecdArray;
	}

	public void setBtrnbBizModecdArray(String[] btrnbBizModecdArray) {
		this.btrnbBizModecdArray = btrnbBizModecdArray;
	}

	public String getIEgdsdclCirculationState() {
		return IEgdsdclCirculationState;
	}

	public void setIEgdsdclCirculationState(String IEgdsdclCirculationState) {
		this.IEgdsdclCirculationState = IEgdsdclCirculationState;
	}

	public String getCreatDate() {
		return creatDate;
	}

	public void setCreatDate(String creatDate) {
		this.creatDate = creatDate;
	}

	public String getModifDate() {
		return ModifDate;
	}

	public void setModifDate(String modifDate) {
		ModifDate = modifDate;
	}

	public String getCommonTime() {
		return commonTime;
	}

	public void setCommonTime(String commonTime) {
		this.commonTime = commonTime;
	}
}
