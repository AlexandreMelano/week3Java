/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.time.LocalDate;

/**
 *
 * @author User1
 */
/*
This method uses extend to replicate the parent class constructor 
*/

public class HourlyEmployee extends Employee2{
    
    
    private double hourlyRate, hoursWorked;
    private double minimumWage = 11.40;
    
    public HourlyEmployee(String first, String last, int sin, LocalDate dob, double payRate) {
        super(first, last, sin, dob);
        
        hoursWorked = 0;
    
        setPayRate(payRate);
    }
    
    /*
    this method will validate that the pay is above minimum wage and set the 
    variable
    */

    public void setPayRate(double payRate)
    {
        if (payRate >= minimumWage)
            this.hourlyRate = payRate;
        else
            throw new IllegalArgumentException("hey cheapo - minimum wage is " + minimumWage);
    }//end of setPayRate
    
    /*
    thismethod will add hours wrked to the employees history
    */
    public void addHoursWorked(double hoursWorked)
    {
        if (hoursWorked > 0)
            this.hoursWorked += hoursWorked;
        else
            throw new IllegalArgumentException("new hours worked must be greater then 0");
    }//end of addHoursWorked
    
    @Override
    public PayCheque getPayCheque() {
        double payAmount = hoursWorked * hourlyRate;
        PayCheque newPayCheque = new PayCheque(super.toString(),payAmount,"Your pay cheque");
        
        hoursWorked = 0;
        
        return newPayCheque;
    }//end of PayCheque
    
    
    
    
}//end of class
