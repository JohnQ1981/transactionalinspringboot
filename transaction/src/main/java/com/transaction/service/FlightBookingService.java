package com.transaction.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mapping.AccessOptions.SetOptions.Propagation;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.transaction.dto.FlightBookingAcknowledgement;
import com.transaction.dto.FlightBookingRequest;
import com.transaction.entity.PassengerInfo;
import com.transaction.entity.PaymentInfo;
import com.transaction.repository.PassengerInfoRepository;
import com.transaction.repository.PaymentInformationRepository;
import com.transaction.utils.PaymentUtils;

@Service
public class FlightBookingService {
	
	@Autowired
	private PassengerInfoRepository passengerInfoRepository;
	@Autowired
	private PaymentInformationRepository paymentInfoRepository;
	@Transactional//(readOnly=false, isolation=Isolation.READ_COMMITTED, propagation = org.springframework.transaction.annotation.Propagation.REQUIRED)
	public FlightBookingAcknowledgement bookingFlightTicket(FlightBookingRequest request) {
		
		
		PassengerInfo passengerInfo = request.getPassengerInfo();
		passengerInfo=passengerInfoRepository.save(passengerInfo);
		PaymentInfo paymentInfo=request.getPaymentInfo();
		PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());
		paymentInfo.setPassengerId(passengerInfo.getpId());
		paymentInfo.setAmount(passengerInfo.getFare());
		paymentInfoRepository.save(paymentInfo);
		return new FlightBookingAcknowledgement("Success",passengerInfo.getFare(),UUID.randomUUID().toString().split("-")[0],passengerInfo);
		
	}

}
