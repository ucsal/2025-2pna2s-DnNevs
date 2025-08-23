package br.com.mariojp.solid.srp;

public class taxCalculator {

    public static double calculateTax(double subtotal) {
        String rateString = System.getProperty("tax.rate", "0.10");
        double rate = Double.parseDouble(rateString);
        try {
            rate = Double.parseDouble(rateString);
        }catch(NumberFormatException e) {
            rate = 0.10;
        }
        return subtotal * rate;
    }
}
