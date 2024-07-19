package com.solid_principles.solidprinciples.DIP;

public class ShoppingMall {
    private final BankCard bankCard;
    // private final DebitCard debitCard;
    // line 6 is Violating DIP

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void purchaseSomething(int amount) {
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bc = new DebitCard();//Method Overriding
        //DebitCard d = new DebitCard();
        //CreditCard c = new CreditCard();
        ShoppingMall s = new ShoppingMall(bc);
        s.purchaseSomething(5000);
    }
}
