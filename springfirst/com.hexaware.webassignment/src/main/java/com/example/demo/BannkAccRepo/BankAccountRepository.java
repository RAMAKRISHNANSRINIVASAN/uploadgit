package com.example.demo.BannkAccRepo;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.BankAccount;
@Repository
public interface BankAccountRepository extends CrudRepository<BankAccount, Integer> {
}

