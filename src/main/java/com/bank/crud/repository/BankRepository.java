package com.bank.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bank.crud.domain.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
	
//	@Query(value = "select * from bank WHERE "
//			+ "bank_id =1 OR bank_name = OR "
//			+ "code = OR incorporate_date = OR "
//			+ "no_of_branches = OR "
//			+ "no_of_staff = OR "
//			+ "status = ")
//	   public List<Bank> findAllSorted();

}
