package com.bank.crud.service;

import java.util.List;
import java.util.Optional;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.bank.crud.domain.Bank;
import com.bank.crud.repository.BankRepository;

@Slf4j
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
	public List<Bank> sortBanks(String sortBy, String orderBy){
		if(sortBy.equals("bankId")){
			if(orderBy.equals("ASC")){
				return bankRepositoy.findAllByOrderByBankIdAsc();
			}else{
				return bankRepositoy.findAllByOrderByBankIdDesc();
			}
		}else if(sortBy.equals("bankName")){
			if(orderBy.equals("ASC")){
				return bankRepositoy.findAllByOrderByBankNameAsc();
			}else{
				return bankRepositoy.findAllByOrderByBankNameDesc();
			}
		}else if(sortBy.equals("code")){
			if(orderBy.equals("ASC")){
				return bankRepositoy.findAllByOrderByCodeAsc();
			}else {
				return bankRepositoy.findAllByOrderByCodeDesc();
			}
		}else if(sortBy.equals("incorporateDate")){
			if(orderBy.equals("ASC")){
				return bankRepositoy.findAllByOrderByIncorporateDateAsc();
			}else {
				return bankRepositoy.findAllByOrderByIncorporateDateDesc();
			}
		}else if(sortBy.equals("noOfStaff")){
			if(orderBy.equals("ASC")){
				return bankRepositoy.findAllByOrderByNoOfStaffAsc();
			}else {
				return bankRepositoy.findAllByOrderByNoOfStaffDesc();
			}
		}else if(sortBy.equals("noOfBranches")){
			if(orderBy.equals("ASC")){
				return bankRepositoy.findAllByOrderByNoOfBranchesAsc();
			}else {
				return bankRepositoy.findAllByOrderByNoOfBranchesDesc();
			}
		}else if(sortBy.equals("status")){
			if(orderBy.equals("ASC")){
				return bankRepositoy.findAllByOrderByStatusAsc();
			}else{
				return bankRepositoy.findAllByOrderByStatusDesc();
			}
		}else{
			return null;
		}

	}
}
//this.bankName = bankName;
//		this.code = code;
//		this.incorporateDate = incorporateDate;
//		this.noOfStaff = noOfStaff;
//		this.noOfBranches = noOfBranches;
//		this.status = status;