package com.azure.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="JW_SERVICE_BILL")
@Data
public class ServiceBill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;

//	@OneToMany(mappedBy="bill")
//	@JsonIgnore
	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn(name="fk_bill_id",referencedColumnName="id")
	private List<BillItem> item;

	@Column(nullable = false)
	private int billNo;
	
	@Column(nullable = false)
	private LocalDate date;
	
	@Column(nullable = false)
	private double billAmt;
	


	public ServiceBill(int id, List<BillItem> item, int billNo, LocalDate date, double billAmt) {
		super();
		Id = id;
		this.item = item;
		this.billNo = billNo;
		this.date = date;
		this.billAmt = billAmt;
	}

	@Override
	public String toString() {
		return "ServiceBill [Id=" + Id + ", item=" + item + ", billNo=" + billNo + ", date=" + date + ", billAmt="
				+ billAmt + "]";
	}



	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public List<BillItem> getItem() {
		return item;
	}



	public void setItem(List<BillItem> item) {
		this.item = item;
	}



	public int getBillNo() {
		return billNo;
	}



	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public double getBillAmt() {
		return billAmt;
	}



	public void setBillAmt(double billAmt) {
		this.billAmt = billAmt;
	}



	public ServiceBill() {
		
	}
	
}
