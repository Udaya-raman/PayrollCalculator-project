## Payroll Calculator

### Description
The `PayrollCalculator` program calculates the monthly salary of an employee based on the hours worked each day for a month (22 working days). It takes into account regular hours, overtime, and hours worked less than 8 hours.

- **Regular Hours:** If the employee works exactly 8 hours, they earn a fixed salary of 2500/-.
- **Less than 8 Hours:** If the employee works fewer than 8 hours, a deduction is applied at a rate of 100/- per hour less than 8 hours.
- **More than 8 Hours (Overtime):** If the employee works more than 8 hours, an additional amount is added at a rate of 400/- per hour beyond 8 hours.

### Features
- Calculates daily salary based on hours worked.
- Deducts salary for working less than 8 hours.
- Adds extra salary for overtime (hours worked beyond 8 hours).
- Computes the total monthly salary based on 22 working days.

### How It Works
1. The program prompts the user to enter the number of hours worked for each of the 22 working days.
2. Based on the entered hours, the program calculates the salary for that day:
   - If exactly 8 hours are worked, the salary remains 2500/-.
   - If fewer than 8 hours are worked, the salary is reduced by 100/- for each hour less than 8.
   - If more than 8 hours are worked, the salary is increased by 400/- for each hour beyond 8.
3. The program calculates the total monthly salary and outputs it at the end.

### Code Explanation
- **`detectSalary(int hours)`**: A method to detect and deduct salary for working fewer than 8 hours.
- **`overTime(int hours)`**: A method to calculate and add salary for working overtime (more than 8 hours).
- **`main(String[] args)`**: The main method, which asks the user to input hours worked each day for 22 days and calculates the total salary accordingly.

### Example
```java
Enter the number of hours worked in 1 day:
8
Salary is:2500.0

Enter the number of hours worked in 2 day:
7
Ammount detected is:100
Salary is:2400.0

...

Monthly Salary is:xxxx.xx
