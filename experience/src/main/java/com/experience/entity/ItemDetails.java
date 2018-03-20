package com.experience.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "item_details")
public class ItemDetails {
	
	 @Column(name = "item_id")
	 Integer itemId;
	 
	 @Column(name = "item_name")
	 String itemName;
	 
	 @Column(name = "no_of_items")
	 Integer noOfitems;
	 
	 @Column(name = "vendor_details")
	 String vendorDetails;

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getNoOfitems() {
		return noOfitems;
	}

	public void setNoOfitems(Integer noOfitems) {
		this.noOfitems = noOfitems;
	}

	public String getVendorDetails() {
		return vendorDetails;
	}

	public void setVendorDetails(String vendorDetails) {
		this.vendorDetails = vendorDetails;
	}

	
	  
}
