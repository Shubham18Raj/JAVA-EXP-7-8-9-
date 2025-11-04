package com.example.springhibernate;

import jakarta.transaction.Transactional;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAO {

    @Autowired
    private SessionFactory factory;

    @Transactional
    public void updateBalance(int accNo, double amount) {
        Session session = factory.getCurrentSession();
        Account acc = session.get(Account.class, accNo);
        acc.setBalance(acc.getBalance() + amount);
        session.update(acc);
    }

    public double getBalance(int accNo) {
        Session session = factory.getCurrentSession();
        Account acc = session.get(Account.class, accNo);
        return acc.getBalance();
    }
}

