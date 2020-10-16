package com.percentage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float Phy,Che,Math,Com,Eng;
        float total,percentage;


        Scanner sc = new Scanner(System.in);    //taking input from system by using Scanner class
        System.out.println("Enter Five Subject Marks:");
        Eng = sc.nextFloat();
        Phy = sc.nextFloat();
        Che = sc.nextFloat();
        Math = sc.nextFloat();
        Com = sc.nextFloat();

        total = Eng+Phy+Che+Math+Com;
        System.out.println("The Total is:" + total);
        percentage = (float) (total/5.0);
        System.out.println("The Percentage is:"+ percentage);

        System.out.println("The Student Grade is:");
        if(percentage>=90){
            System.out.println("Grade A");
        }else if(percentage>=80 && percentage<90){
            System.out.println("Grade B");
        }else if(percentage>=70 && percentage<80){
            System.out.println("Grade C");
        }else if(percentage>=60 && percentage<70){
            System.out.println("Grade D");
        }else if(percentage>=50 && percentage<60){
            System.out.println("Grade E");
        }else if(percentage>=40 && percentage<50){
            System.out.println("Grade F");
        }
        else {
            System.out.println("Fail");
        }

    }
}

