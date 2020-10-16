package com.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.Scanner;




public class Main {

    public static Date StringToDate(String dob) throws ParseException {
        //Instantiating the SimpleDateFormat class
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        //Parsing the given String to Date object
        Date date = formatter.parse(dob);
        System.out.println("Date object value: "+date);
        return date;
    }

    public static void main(String[] args)throws ParseException {
	    String empName;
	    int dateOfBirth,birthYear,age,monthOfBirth;
	    float monthlySalary;
	    double annualSalary;

	    double taxAmount = 0.0;

        Scanner sc = new Scanner(System.in);

        //taking employee name
        System.out.println("Enter Employee Name:");
        empName = sc.nextLine();

        System.out.println("Enter Dob (dd-mm-yy): ");
        String dob = sc.next();

        //converting string to date
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
        Date date = formatter.parse(dob);

        //Converting obtained Date object to LocalDate object
        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate givenDate = zone.toLocalDate();

        //Calculating the difference between given date to current date.
        Period period = Period.between(givenDate, LocalDate.now());
        System.out.print("Hello "+empName+" your current age is: ");
        System.out.print(period.getYears()+" years\n");

        System.out.println("Enter Employee Monthly Salary:");
        monthlySalary = sc.nextFloat();

      // System.out.println("DOB is:" + birthYear +"-"+ monthOfBirth +"-"+ dateOfBirth);
        System.out.println("Employee Name is:" + empName);
        annualSalary = (monthlySalary * 12);
        System.out.println("The Annual Salary is:" + annualSalary);


        if(annualSalary>200000){
            taxAmount = (annualSalary * 0.05);
        }else if(annualSalary>300000){
            taxAmount = (annualSalary * 0.10);
        }else if(annualSalary>400000){
            taxAmount = (annualSalary * 0.15);
        }else if(annualSalary>500000){
            taxAmount = (annualSalary * 0.20);
        }
        else{
            System.out.println("You Don't Need to Pay Tax Because Your income is in limit.");
        }
        System.out.println("The Tax Amount is:" + taxAmount);


    }
}
