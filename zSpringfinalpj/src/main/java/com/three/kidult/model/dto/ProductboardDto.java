package com.three.kidult.model.dto;

import java.util.Date;

public class ProductboardDto {
	
	private int productboard_no;
	private String id;
	private String productboard_title;
	private String productboard_content;
	private Date productboard_regdate;
	private int productboard_readcount;
	private double productboard_starscore;
	
	public ProductboardDto() {
		
	}

	public ProductboardDto(int productboard_no, String id, String productboard_title, String productboard_content,
			Date productboard_regdate, int productboard_readcount, double productboard_starscore) {
		super();
		this.productboard_no = productboard_no;
		this.id = id;
		this.productboard_title = productboard_title;
		this.productboard_content = productboard_content;
		this.productboard_regdate = productboard_regdate;
		this.productboard_readcount = productboard_readcount;
		this.productboard_starscore = productboard_starscore;
	}

	public int getProductboard_no() {
		return productboard_no;
	}

	public void setProductboard_no(int productboard_no) {
		this.productboard_no = productboard_no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductboard_title() {
		return productboard_title;
	}

	public void setProductboard_title(String productboard_title) {
		this.productboard_title = productboard_title;
	}

	public String getProductboard_content() {
		return productboard_content;
	}

	public void setProductboard_content(String productboard_content) {
		this.productboard_content = productboard_content;
	}

	public Date getProductboard_regdate() {
		return productboard_regdate;
	}

	public void setProductboard_regdate(Date productboard_regdate) {
		this.productboard_regdate = productboard_regdate;
	}

	public int getProductboard_readcount() {
		return productboard_readcount;
	}

	public void setProductboard_readcount(int productboard_readcount) {
		this.productboard_readcount = productboard_readcount;
	}

	public double getProductboard_starscore() {
		return productboard_starscore;
	}

	public void setProductboard_starscore(double productboard_starscore) {
		this.productboard_starscore = productboard_starscore;
	}
	
	

}
