package com.bank.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bank.crud.domain.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
	
	@Query(value = "SELECT b FROM Bank b ORDER BY ?1")
	   public List<Bank> findAllSorted(@Param("sortBy") String sortBy);

}
