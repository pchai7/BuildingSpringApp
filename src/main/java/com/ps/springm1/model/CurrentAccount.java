package com.ps.springm1.model;

import com.ps.springm1.Account;
import com.ps.springm1.Card;
import org.springframework.beans.factory.annotation.Autowired;

public class CurrentAccount implements Account {

    @Autowired
    private Card creditCard;

    public void setCreditCard(Card creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String createAccount() {
        return "Current Account Created Successfully.";
    }

    @Override
    public String cardDetails() {
        return this.creditCard.CardDetails();
    }

    public void onInit() {
        System.out.println("onInit of CurrentAccount has been invoked");
    }

    public void onDestory() {
        System.out.println("onDestroy of CurrentAccount has been invoked");
    }

    private void onDestroy() {
    }
}
