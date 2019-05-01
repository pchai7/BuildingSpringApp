package com.ps.springm1.model;

import com.ps.springm1.Account;
import com.ps.springm1.Card;

public class SavingAccount implements Account {

    private Card atmCard;

    public SavingAccount(Card card) {
        atmCard = card;
    }
    @Override
    public String createAccount(){
        return "Savings Account Created Successfully!";
    }

    @Override
    public String cardDetails() {
        return atmCard.CardDetails();
    }
}
