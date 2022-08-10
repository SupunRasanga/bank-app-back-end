package com.bank.crud.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.crud.domain.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
	
	List<Bank> findAllByOrderByBankId();
	
}
