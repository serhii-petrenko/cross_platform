package org.example.ai;

public class OrderServiceB {

    public double calculateTotal(
            double price,
            int quantity,
            String deliveryType,
            boolean premiumCustomer) {

        double total = price * quantity;

        if (deliveryType.equals("COURIER")) {
            total += 100;
        }

        if (deliveryType.equals("EXPRESS")) {
            total += 200;
        }

        if (premiumCustomer) {
            total = total * 0.9;
        }

        if (total > 2000) {
            total -= 150;
        }

        return total;
    }

}
