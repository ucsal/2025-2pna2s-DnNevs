package br.com.mariojp.solid.srp;

public class ReceiptService {
    public String generate(Order order) {


        double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
        double tax = taxCalculator.calculateTax(subtotal); //Taxa 10 fixa :(
        double total = subtotal + tax;

        return ReceiptFormatter.formatReceipt(subtotal,tax,total,order);


    }
}
