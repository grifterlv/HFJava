package CalculateDifference;

import java.util.Scanner;

public class CalculateDifference {

    private double buyPrice;
    private double sellPrice;
    private double Amount;
//    private double sellAmount;
    private double feeRate = 3/10000;
    private double sellFeeRate = 0.001;

    public double calculateDiff () {

        System.out.println("Enter amount: ");
        Scanner scanner = new Scanner(System.in);
        Amount = scanner.nextDouble();

        System.out.println("Enter Sell Price: ");
        sellPrice = scanner.nextDouble();

        System.out.println("Enter Buy Price: ");
        buyPrice = scanner.nextDouble();



        double buyTotal = buyPrice * Amount;
        double sellTotal = sellPrice * Amount;
        double buyFee = Math.max(Amount * feeRate, 5);
        double sellFee = Math.max(Amount * feeRate, 5);
        sellFee += sellTotal * sellFeeRate;
        double diff = sellTotal - buyTotal - buyFee - sellFee;

        System.out.println("Total sellFee is : " + sellFee);
        System.out.println("Total buyFee is : " + buyFee);

        System.out.println("Total difference is : " + diff);
        return diff;
    }

//    public double breakEvenBuy () {
//
//    }


    public static void main (String[] args) {
        CalculateDifference c = new CalculateDifference();
//        c.Amount = 1200;
//        c.buyPrice = 9.77;
//        c.sellPrice = 9.9;
        c.calculateDiff();
    }

}
