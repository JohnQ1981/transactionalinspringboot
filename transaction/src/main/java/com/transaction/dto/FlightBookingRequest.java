package com.transaction.dto;

import com.transaction.entity.PassengerInfo;
import com.transaction.entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {
	
	private PassengerInfo passengerInfo;
	private PaymentInfo paymentInfo;
	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}
	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}
	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}
	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	@Override
	public String toString() {
		return "FlightBookingRequest [passengerInfo=" + passengerInfo + ", paymentInfo=" + paymentInfo + "]";
	}
	
	
}
