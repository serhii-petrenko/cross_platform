package org.example.ai;

public class OrderServiceA {

    public double calculateTotal(double price, int quantity, String customerType) {

        double total = price * quantity;

        if (customerType.equals("VIP")) {
            total = total - total * 0.20;
        }

        if (customerType.equals("REGULAR") && total > 1000) {
            total = total - total * 0.05;
        }

        if (quantity > 10) {
            total = total - total * 0.10;
        }

        return total;
    }

}
