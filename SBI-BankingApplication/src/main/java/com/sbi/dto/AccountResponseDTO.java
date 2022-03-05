package com.sbi.dto;

import com.sbi.model.Account;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
public class AccountResponseDTO {
private String status; 
private String msg;
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
@Override
public String toString() {
	return "AccountResponseDTO [status=" + status + ", msg=" + msg + "]";
}

}
