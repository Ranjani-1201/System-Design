package com.wipro.bank.main;
import com.wipro.bank.service.BankService;
public class MainClass {
    public static void main(String[] args) {
        BankService service = new BankService();

        System.out.println("Test Case 1\n ");
        service.calculate(500, 5, 20, "male");

        System.out.println("Test Case 2 \n");
        service.calculate(1200, 10, 65, "female"); 
        System.out.println("Test Case 3 \n");
        service.calculate(2500, 5, 59, "female"); 

        System.out.println("Test Case 4\n ");
        service.calculate(10000, 10, 60, "male"); 

        System.out.println("Test Case 5 \n");
        service.calculate(750, 5, 100, "male"); 
    }
}