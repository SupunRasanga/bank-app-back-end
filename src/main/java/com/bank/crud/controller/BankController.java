package com.bank.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.crud.domain.Bank;
import com.bank.crud.service.BankService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
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
	
	@PutMapping(path = "{bankId}")
	public Bank updateBank(@PathVariable long bankId, @RequestBody Bank bank) {
		return bankService.updateBank(bankId, bank);
	}
	
	@DeleteMapping(path = "{bankId}")
	public void deleteBank(@PathVariable long bankId) {
		bankService.deleteBank(bankId);
	}
	
	@GetMapping(path = "{bankId}")
	public Optional<Bank> getBankById(@PathVariable long bankId){
		return bankService.getBankById(bankId);
	}
	
	@GetMapping(path = "/sorting")
	public List<Bank> sortBanks(@RequestParam())

}
