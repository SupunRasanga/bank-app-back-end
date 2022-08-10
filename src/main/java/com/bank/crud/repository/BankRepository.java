package com.bank.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bank.crud.domain.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
	
	List<Bank> findAllByOrderByBankIdAsc();
	List<Bank> findAllByOrderByBankNameAsc();
	List<Bank> findAllByOrderByCodeAsc();
	List<Bank> findAllByOrderByIncorporateDateAsc();
	List<Bank> findAllByOrderByNoOfStaffAsc();
	List<Bank> findAllByOrderByNoOfBranchesAsc();
	List<Bank> findAllByOrderByStatusAsc();

	List<Bank> findAllByOrderByBankIdDesc();
	List<Bank> findAllByOrderByBankNameDesc();
	List<Bank> findAllByOrderByCodeDesc();
	List<Bank> findAllByOrderByIncorporateDateDesc();
	List<Bank> findAllByOrderByNoOfStaffDesc();
	List<Bank> findAllByOrderByNoOfBranchesDesc();
	List<Bank> findAllByOrderByStatusDesc();


}
