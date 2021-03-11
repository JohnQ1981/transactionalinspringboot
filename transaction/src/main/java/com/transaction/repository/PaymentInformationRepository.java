package com.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.entity.PaymentInfo;

public interface PaymentInformationRepository extends JpaRepository<PaymentInfo, String> {

}
