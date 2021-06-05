/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rafael Nieves
 */

package org.example;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String orderString = input.nextLine();
        double orderNumber = Double.parseDouble(orderString);

        System.out.print("What is the state? ");
        String stateString = input.nextLine();

        double tax = 0.055;
        double taxCharge =  orderNumber * tax;
        double total = orderNumber + taxCharge;
        DecimalFormat dfDollar = new DecimalFormat("#.##");

        String outputString = "The subtotal is $" + dfDollar.format(orderNumber) + ".\n" +
                              "The Tax is $" + dfDollar.format(taxCharge) + ".\n" +
                              "The total is $" + dfDollar.format(total) + ".";

        if (!stateString.equals("WI")){
            total = orderNumber;
            outputString = "The total is $" + dfDollar.format(total) + ".";
        }

        System.out.println(outputString);

    }
}
