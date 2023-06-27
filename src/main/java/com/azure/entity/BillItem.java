package com.azure.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="JW_BILL_ITEM")
public class BillItem {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable=false)
	private String item;
	
	@Column(nullable=true)
	private String descr;
	
	@Column(nullable=false)
	private double price;
	
	@Column(nullable=false)
	private int qty;
	

	public BillItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BillItem(int id, String item, String descr, double price, int qty) {
		super();
		this.id = id;
		this.item = item;
		this.descr = descr;
		this.price = price;
		this.qty = qty;
		
	}

	@Override
	public String toString() {
		return "BillItem [id=" + id + ", item=" + item + ", descr=" + descr + ", price=" + price + ", qty=" + qty
				+ ", bill=" + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
