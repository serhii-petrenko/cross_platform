package org.example.ai;

public class OrderServiceD {

    public double calculateTotal(
            double price,
            int quantity,
            int previousOrders) {

        double total = price * quantity;

        if (previousOrders >= 5) {
            total = total * 0.95;
        }

        if (previousOrders >= 10) {
            total = total * 0.90;
        }

        if (quantity >= 20) {
            total = total - 100;
        }

        return total;
    }

}
