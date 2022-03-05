package com.sbi.dto;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@Getter
@ToString

public class AccountRequestDTO {

	private long accountNumber;
	private String AccountHolderName;
	private double amount;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "AccountRequestDTO [accountNumber=" + accountNumber + ", AccountHolderName=" + AccountHolderName
				+ ", amount=" + amount + "]";
	}
	
	
}
