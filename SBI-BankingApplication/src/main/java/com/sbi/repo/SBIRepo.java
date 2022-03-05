package com.sbi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbi.model.Account;

@Repository
public interface SBIRepo extends JpaRepository<Account, Long>{

}
