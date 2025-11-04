package com.example.springhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {

    @Autowired
    private AccountDAO dao;

    @Transactional
    public void transfer(int fromAcc, int toAcc, double amount) {
        dao.updateBalance(fromAcc, -amount);
        dao.updateBalance(toAcc, amount);
        System.out.println("Transferred " + amount + " successfully.");
    }
}

