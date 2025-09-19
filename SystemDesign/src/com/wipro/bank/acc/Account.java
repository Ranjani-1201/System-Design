package com.wipro.bank.acc;

public abstract class Account {
    int tenure;
    float principal;
    float rateOfInterest;

    public void setInterest(int age, String gender) {
        if (gender.equalsIgnoreCase("male") && age < 60) {
            this.rateOfInterest = 9.8f;
        } else if (gender.equalsIgnoreCase("male") && age >= 60) {
            this.rateOfInterest = 10.5f;
        } else if (gender.equalsIgnoreCase("female") && age < 58) {
            this.rateOfInterest = 10.2f;
        } else if (gender.equalsIgnoreCase("female") && age >= 58) {
            this.rateOfInterest = 10.8f;
        }
    }

    public float calculateMaturityAmount(float totalPrincipalDeposited, float maturityInterest) {
        return totalPrincipalDeposited + maturityInterest;
    }

    public abstract float calculateInterest();
    public abstract float calculateAmountDeposited();
}
