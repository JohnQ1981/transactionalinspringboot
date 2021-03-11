package com.transaction.dto;

import com.transaction.entity.PassengerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowledgement {
	
	private String status;
	private double totalFare;
	private String invoiceNum;
	private PassengerInfo passengerInfo;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}
	public String getInvoiceNum() {
		return invoiceNum;
	}
	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}
	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}
	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}
	@Override
	public String toString() {
		return "FlightBookingAcknowledgement [status=" + status + ", totalFare=" + totalFare + ", invoiceNum="
				+ invoiceNum + ", passengerInfo=" + passengerInfo + "]";
	}
	public FlightBookingAcknowledgement(String status, double totalFare, String invoiceNum,
			PassengerInfo passengerInfo) {
		
		this.status = status;
		this.totalFare = totalFare;
		this.invoiceNum = invoiceNum;
		this.passengerInfo = passengerInfo;
	}
	public FlightBookingAcknowledgement() {
		
	}
	

}
