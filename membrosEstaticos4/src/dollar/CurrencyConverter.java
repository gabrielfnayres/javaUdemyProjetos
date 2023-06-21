package dollar;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double realAmount (double priceDollar, double amount ) {

        return amount*priceDollar*(1 + IOF);

    }

}
