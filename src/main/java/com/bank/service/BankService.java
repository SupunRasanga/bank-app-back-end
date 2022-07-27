package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.domain.Bank;
import com.bank.repository.BankRepository;

@Service
public class BankService {
	
	@Autowired
	private BankRepository bankRepositoy;
	
	//Create Bank
	public Bank createBank(Bank bank) {
		return bankRepositoy.save(bank);
	}
	
	//Get All Banks
	public List<Bank> getAllBanks(){
		return bankRepositoy.findAll();
	}

}
