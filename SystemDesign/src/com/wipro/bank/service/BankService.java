package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService {

    public boolean validateData(float principal, int tenure, int age, String gender) {
        try {
            if (principal < 500) {
                throw new BankValidationException("Principal should be minimum 500");
            }
            if (!(tenure == 5 || tenure == 10)) {
                throw new BankValidationException("Tenure should be 5 or 10");
            }
            if (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))) {
                throw new BankValidationException("Gender can be either male or female");
            }
            if (!(age >= 1 && age <= 100)) {
                throw new BankValidationException("Age should be between 1 to 100");
            }
            return true;
        } catch (BankValidationException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void calculate(float principal, int tenure, int age, String gender) {
        if (validateData(principal, tenure, age, gender)) {
            RDAccount rd = new RDAccount(tenure, principal);
            rd.setInterest(age, gender);

            float interest = rd.calculateInterest();
            System.out.println("Interest: " + interest);

            float amountDeposited = rd.calculateAmountDeposited();
            System.out.println("Deposited Amount: " + amountDeposited);

            float maturityAmount = rd.calculateMaturityAmount(amountDeposited, interest);
            System.out.println("Maturity Amount: " + maturityAmount);
        } else {
            System.out.println("Invalid data. Cannot calculate.");
        }
    }

}