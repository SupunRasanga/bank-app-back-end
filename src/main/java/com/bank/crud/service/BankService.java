package com.bank.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.crud.domain.Bank;
import com.bank.crud.repository.BankRepository;

@Service
public class BankService {
	
	@Autowired
	private BankRepository bankRepositoy;
	
	//Post - Create Bank
	public Bank createBank(Bank bank) {
		return bankRepositoy.save(bank);
	}
	
	//Get - All Banks
	public List<Bank> getAllBanks(){
		return bankRepositoy.findAll();
	}
	
	//Put - Update Bank
	public Bank updateBank(long bankId, Bank bank) {
		Bank existingBank = bankRepositoy.getById(bankId);
		if(existingBank != null) {
			existingBank.setBankName(bank.getBankName());
			existingBank.setCode(bank.getCode());
			existingBank.setIncorporateDate(bank.getIncorporateDate());
			existingBank.setNoOfBranches(bank.getNoOfBranches());
			existingBank.setNoOfStaff(bank.getNoOfStaff());
			existingBank.setStatus(bank.getStatus());
		}
		return bankRepositoy.save(existingBank);
	}
	
	//Delete - Delete Bank
	public void deleteBank(long bankId) {
		bankRepositoy.deleteById(bankId);
	}
	
	//Get - Get Banks By Id
	public Optional<Bank> getBankById(long bankId){
		return bankRepositoy.findById(bankId);
	}

	//Get - Sorting Bank
	public List<Bank> sortBanks(String sortBy){
		return bankRepositoy.findAllSorted(sortBy);
	}

}
