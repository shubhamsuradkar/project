package com.sbi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbi.dto.AccountRequestDTO;
import com.sbi.dto.AccountResponseDTO;
import com.sbi.model.Account;
import com.sbi.repo.SBIRepo;
 @Service
public class AccountService {
@Autowired
private SBIRepo repo;

public AccountResponseDTO addAccount(Account account) {
	// TODO Auto-generated method stub
	Account acc=repo.save(account);
	AccountResponseDTO accResponseDTO=new AccountResponseDTO();
	if(acc!=null) {
		accResponseDTO.setStatus("Account Created");
		//accResponseDTO.setAccount(acc);
	}else {
		accResponseDTO.setStatus("Account Not Created");
		
	}
	return accResponseDTO;
}

public AccountResponseDTO payment(AccountRequestDTO account) {
	// TODO Auto-generated method stub
	Account acc=repo.findById(account.getAccountNumber()).get();
	AccountResponseDTO accResponseDTO=new AccountResponseDTO();
	if(acc!=null) {
		double balance=acc.getBalance()-account.getAmount();
		acc.setAccnumber(account.getAccountNumber());
		acc.setBalance(balance);
	Account ac=	repo.save(acc);
	if(ac!=null) {
		accResponseDTO.setStatus("SUCCESS");
		accResponseDTO.setMsg("payment updated successfully.");
	}else {
		accResponseDTO.setStatus("FAIL");
		accResponseDTO.setMsg("something went wrong..!");
	}
	}
	return accResponseDTO;
}
 }
