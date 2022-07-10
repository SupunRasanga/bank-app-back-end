package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.domain.Bank;

public interface BankRepository extends JpaRepository<Bank, Long> {

}
