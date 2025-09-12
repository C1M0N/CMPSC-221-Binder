/*
 * Copyright 2025 Doucheng Peng
 *
 * Author      : Doucheng Peng [C1M0N]
 * Email       : dbp5625@psu.edu / cimon@cementine.ink
 * Course      : CMPSC 221 [Autumn 002]
 * Date        : 9/11/25 PM11:10
 *
 * Collaboration Statement: By myself
 * Description : final version
 */
package pa_1;

public class LoanAccount {

  private static double annualInterestRate;

  private double principle;

  public LoanAccount(double principle) {
    this.principle = principle;
  }


  public static void setAnnualInterestRate(double ratePercent) {
    annualInterestRate = ratePercent / 100.0;
  }


  public double calculateMonthlyPayment(int numberOfPayments) {
    double monthlyInterest = annualInterestRate / 12.0;

    return principle * (monthlyInterest / (1.0 - Math.pow(1.0 + monthlyInterest,
        -numberOfPayments)));
  }

  // Test
  public static void main(String[] args) {
    LoanAccount loan1 = new LoanAccount(5000.00);
    LoanAccount loan2 = new LoanAccount(31000.00);

    printTable(loan1, loan2, 1);

    System.out.println();

    printTable(loan1, loan2, 5);
  }

  // Helper class 1
  private static void printTable(LoanAccount loan1, LoanAccount loan2, double ratePercent) {
    setAnnualInterestRate(ratePercent);

    System.out.printf(
        "Monthly payments for loan1 of $5000.00 and loan2 $31000.00 for 3, 5, and 6 year loans at %.0f%% interest.%n",
        ratePercent);

    System.out.printf("%-6s %-8s %-8s %-8s%n", "Loan", "3 years", "5 years", "6 years");

    System.out.printf("%-6s %-8.2f %-8.2f %-8.2f%n", "Loan1",
        loan1.calculateMonthlyPayment(36),
        loan1.calculateMonthlyPayment(60),
        loan1.calculateMonthlyPayment(72));

    System.out.printf("%-6s %-8.2f %-8.2f %-8.2f%n", "Loan2",
        loan2.calculateMonthlyPayment(36),
        loan2.calculateMonthlyPayment(60),
        loan2.calculateMonthlyPayment(72));
  }
}
