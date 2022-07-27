package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.domain.Bank;
import com.bank.service.BankService;


@RestController
@RequestMapping(path = "/api/home/bank")
public class BankController {
	
	@Autowired
	public BankService bankService;
	
	@PostMapping
	public Bank createBank(@RequestBody Bank bank) {
		return bankService.createBank(bank);
	}
	
	@GetMapping
	public List<Bank> getAllBanks(){
		return bankService.getAllBanks();
	}

}
