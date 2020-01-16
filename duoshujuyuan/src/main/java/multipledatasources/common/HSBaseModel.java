package multipledatasources.common;

import javax.xml.bind.annotation.XmlTransient;

import org.springframework.util.StringUtils;


public class HSBaseModel {

	
	/**
	 * 用于接受处理同时传入多个审核状态值
	 */
	@XmlTransient
    private String[] emvryStscdArray ;
  
    /**
     * 用于接受处理查询开始时间
     */
	@XmlTransient
    private String beginDate;

    /**
     * 用于接受处理查询结束时间
     */
    @XmlTransient
    private String endDate;

	/**
	 * 分页--当前页
	 */
	@XmlTransient
	private Integer page = 1;

	/**
	 * 分页--每页大小
	 */
	@XmlTransient
	private Integer pageSize = 10;


	public String[] getEmvryStscdArray() {
		return emvryStscdArray;
	}

	public void setEmvryStscdArray(String[] emvryStscdArray) {
		this.emvryStscdArray = emvryStscdArray;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer rows) {
		this.pageSize = rows;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		if(!StringUtils.isEmpty(endDate) && endDate.length()<=10){
			return this.endDate+" 23:59:59";
		}
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}
