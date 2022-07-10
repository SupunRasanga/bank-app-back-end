package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bank.domain.Bank;
import com.bank.service.BankService;

@Controller
@RequestMapping(path = "api/home/bank")
public class BankController {
	
	@Autowired
	public BankService bankService;
	
	@PostMapping
	public Bank createBank(@RequestBody Bank bank) {
		return bankService.createBank(bank);
	}

}
