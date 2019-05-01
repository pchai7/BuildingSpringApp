package com.ps.springm1.model;

import com.ps.springm1.Card;

public class ATMCard implements Card {

    @Override
    public String CardDetails() {
        return "ATM Card has been issued successfully!";
    }
}
