package com.solid_principles.solidprinciples.DIP;

public class DebitCard implements BankCard {
    @Override
    public void doTransaction(int amount){
        System.out.println("amount has been transferred successfully");
    }
}