package com.ycl.room.vo;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.ycl.room.domain.Room;

public class RoomVo extends Room{
	
	private String typename;
	private BigDecimal staprice;
	private BigDecimal endprice;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date staDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	
	
	
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	
	public BigDecimal getStaprice() {
		return staprice;
	}
	public void setStaprice(BigDecimal staprice) {
		this.staprice = staprice;
	}
	public BigDecimal getEndprice() {
		return endprice;
	}
	public void setEndprice(BigDecimal endprice) {
		this.endprice = endprice;
	}
	public Date getStaDate() {
		return staDate;
	}
	public void setStaDate(Date staDate) {
		this.staDate = staDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
	
}
