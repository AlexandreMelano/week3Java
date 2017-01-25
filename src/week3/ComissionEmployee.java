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
   public class ComissionEmployee extends Employee2 {
    private double monthlySales, comissionRate;   
        
    public ComissionEmployee(String first, String last, int sin, LocalDate dob
                                ,double comRate) {
        super(first, last, sin, dob);
        
        monthlySales = 0;
        
        setComRate(comRate);
    }
    
    /*
    this method sets the comissionRate
    */
    public void setComRate(double comRate)
    {
        if (comRate > 0 && comRate < 60)
            comissionRate = comRate;
        else
            throw new IllegalArgumentException("Comissions must be greater than 0" + "& less than or equal to 60");
    }//end of setComRate
    
    /*
    this method will record sales
    */
    public void addSales(double newSalesAmount)
    {
        if (newSalesAmount > 0)
            this.monthlySales += newSalesAmount;
        else
            throw new IllegalArgumentException("Sales must be > 0");
        
    }
    
    @Override
    public PayCheque getPayCheque() {
        double payAmount = comissionRate / 100 * monthlySales;
        
        PayCheque newPay = new PayCheque(super.toString(), payAmount, "Comission pay");
        monthlySales = 0; // zero out sales for new month
        return newPay;
    }
    
    
}//end of class
