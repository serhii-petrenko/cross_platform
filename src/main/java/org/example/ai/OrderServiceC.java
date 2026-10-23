package org.example.ai;

public class OrderServiceC {

    public double calculateTotal(
            double price,
            int quantity,
            String promoCode) {

        double total = price * quantity;

        if (promoCode.equals("SALE10")) {
            total -= total * 0.10;
        }

        if (promoCode.equals("SALE20") && total > 500) {
            total -= total * 0.20;
        }

        if (promoCode.equals("FREE50")) {
            total -= 50;
        }

        return total;
    }

}
