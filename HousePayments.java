//Figuring out a house loan payment at 5% interest, rounded up two spaces. Myla Fairchild

import java.math.RoundingMode;

import java.text.DecimalFormat;

 

public class HouseLoan {

                public static void main(String[] args) {

 

                int houseLoan = 500000;

   

  int loanLength = 30;

   

  double interestRate = 5.481;

   

  int downPayment = 280000;

   

    if (loanLength <= 0 || interestRate <= 0) {

      System.out.println("Error! You must take out a valid loan.");

    } else if (downPayment >= houseLoan ) {

      System.out.println("You can buy the house outright");

    } else {

    int remainingBalance = houseLoan - downPayment;

    int months = loanLength * 12;

    int monthlyBalance = remainingBalance / months;

    double interest = monthlyBalance * interestRate / 100;

    double monthlyPayment = monthlyBalance + interest;

    double roundOff = (double) Math.round(monthlyPayment * 100) / 100;

   

    System.out.println(roundOff);

    }

 

                }

}
