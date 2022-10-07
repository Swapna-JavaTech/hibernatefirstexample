package com.hexaware.hibernatefirstexample.entity;

public class Seller {
	
	private Long sellerId;
	private String sellerName;
	private String sellerEmail;
	private String sellerMobileNo;
	
	public Seller() {
		// default constructor
	}

	public Seller(Long sellerId, String sellerName, String sellerEmail, String sellerMobileNo) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.sellerEmail = sellerEmail;
		this.sellerMobileNo = sellerMobileNo;
	}
	
	public Seller(String sellerName, String sellerEmail, String sellerMobileNo) {
		super();
		this.sellerName = sellerName;
		this.sellerEmail = sellerEmail;
		this.sellerMobileNo = sellerMobileNo;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public String getSellerMobileNo() {
		return sellerMobileNo;
	}

	public void setSellerMobileNo(String sellerMobileNo) {
		this.sellerMobileNo = sellerMobileNo;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + ", sellerEmail=" + sellerEmail
				+ ", sellerMobileNo=" + sellerMobileNo + "]";
	}
	
	

}
