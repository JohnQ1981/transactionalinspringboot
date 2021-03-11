package com.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.entity.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {
	

}
