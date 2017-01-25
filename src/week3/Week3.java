/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author User1
 */
public class Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HourlyEmployee employee1 = new HourlyEmployee("Fred","Flintstone",1234,LocalDate.of(1998, Month.MARCH, 14),30);
        System.out.printf("Employee1 is %s%n", employee1);
        System.out.printf("the employee was born on %s, that was a %s%n",employee1.getDateOfBirth(),employee1.getDateOfBirth().getDayOfWeek());
    
       HourlyEmployee employee3 = new HourlyEmployee("Alex","Melano",3546,LocalDate.of(1995, Month.FEBRUARY, 16),20);
        System.out.printf("Employee1 is %s%n", employee3);
        System.out.printf("the employee was born on %s, that was a %s%n",employee3.getDateOfBirth(),employee3.getDateOfBirth().getDayOfWeek());
    
        employee1.addHoursWorked(30);
        System.out.printf("The pay cheque for employee 1 is %s%n",employee1.getPayCheque());
        
    }
    
    
}//end of class
