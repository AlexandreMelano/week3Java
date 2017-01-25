/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author User1
 */
public abstract class Employee2 {
    private String firstName, lastName;
    private int socialInsuranceNumber;
    private LocalDate dateOfBirth;
    
    
    public Employee2(String first, String last, int sin, LocalDate dob)
    {
        firstName = first;
        lastName = last;
        socialInsuranceNumber = sin;
        setBirthDay(dob);
    }//end of constructor
    
    /*
    thismethod will return the employee's first and last name
    */
    public String toString()
    {
        return firstName + " " + lastName;
    }//end of toString
    
    /*
    this method will validate that the employee is 15-90 years old and set
    the dateOfBirth instance variale
    */
    public void setBirthDay(LocalDate dob)
    {
        LocalDate today = LocalDate.now();
        
        int age = Period.between(dob, today).getYears();
        
        if (age >= 15 && age <= 90) // valid employee dob
            this.dateOfBirth = dob;
        else
            throw new IllegalArgumentException("the employee must be between 15-90");
    }//end of setBirthDay

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSocialInsuranceNumber() {
        return socialInsuranceNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public abstract PayCheque getPayCheque();
  
}

