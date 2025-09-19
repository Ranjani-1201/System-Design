This project is a simple Java application that simulates a Recurring Deposit (RD) account system for a bank.
It allows users (or test cases) to enter details such as principal amount, tenure, age, and gender, and then calculates the maturity amount using the RD formula.

The system also applies different interest rates based on the age and gender of the customer, making the calculation more realistic.
For example, senior citizens receive slightly higher interest rates compared to younger customers.

The project follows a modular design using packages:

Client package (com.wipro.bank.client / com.wipro.bank.main) – Handles user interaction or test cases.

Service package (com.wipro.bank.service) – Provides validation and calculation services.

Account package (com.wipro.bank.acc) – Contains the account class and business logic for RD calculations.

Exception package (com.wipro.bank.exception) – Manages custom validation exceptions.
