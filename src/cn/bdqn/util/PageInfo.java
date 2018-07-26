package cn.bdqn.util;

import java.util.List;

public class PageInfo <T>{

	private Integer pageNo;
	private Integer pageSize;
	private Integer totalCount;
	private Integer totalPageCount;
	
	private List<T> dataList;//分页数据集合
	
	public PageInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public PageInfo(Integer pageNo, Integer pageSize){
		this.pageNo = pageNo;
		this.pageSize = pageSize;
	}
	
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount(Integer totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}
	
	
	
}
