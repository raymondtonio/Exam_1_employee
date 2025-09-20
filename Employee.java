/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private int currentYear;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;
    private double taxesAndDeductionRate;
    private double hoursWorked;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = currentYear - yearOfBirth;
         if (age >= 16){
        System.out.println("Can Drive");
        return true;
    }
        else{
        System.out.println(16 - age +"years to wait to start driving");
        return false;
    }
}

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        double totalSalary = unpaidHours * hourlyWage;
        double taxesAndDeductions = totalSalary * taxesAndDeductionRate;
        double netPay = totalSalary - taxesAndDeductions;
        System.out.println(netPay);
        return netPay;
        
        
        // 1) Set Value to unpaidhours to 0.0
        // 2) Set Value to hourlyWage to 10 dollars per hour(dph)
        // 3) Set Value to taxes and deductions rate to 30%
        // 4) Increment unpaidHours by 10
        
        // 5) Set total salary to unpaidhours * hourlyWage
        // 6) Taxes and deductions = total salary * taxes and deduction rate
        // 7) Net pay = total salary - taxes and deductions
        // 8) Print Net pay
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(double hoursWorked){
        double netpay = calculatePay();
        System.out.println(fullname+" "+"has recived a wire transfer of"+" "+netpay+"CAD");
        System.out.println(fullname+" "+"has received a wire transfer of"+" "+netpay+"CAD");
        unpaidHours = 0;
    }
}