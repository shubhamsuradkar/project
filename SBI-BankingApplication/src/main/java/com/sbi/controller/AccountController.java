package com.sbi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sbi.dto.AccountRequestDTO;
import com.sbi.dto.AccountResponseDTO;
import com.sbi.model.Account;
import com.sbi.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(value = "/addAccount",consumes = "application/json",produces = "application/json",method = RequestMethod.POST)
	public ResponseEntity<AccountResponseDTO>addAccount(@RequestBody Account account ){
		AccountResponseDTO response=accountService.addAccount(account);
		return new ResponseEntity<>(response,HttpStatus.CREATED);
	}
	@RequestMapping(value = "/payment",consumes = "application/json",produces = "application/json",method = RequestMethod.POST)
	public ResponseEntity<AccountResponseDTO>payment(@RequestBody AccountRequestDTO account ){
		System.out.println("Bank Application AccountController ->Payment method request:"+account);
		AccountResponseDTO response=accountService.payment(account);
		System.out.println("Bank Application AccountController ->Payment method response:"+response);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
		
	}