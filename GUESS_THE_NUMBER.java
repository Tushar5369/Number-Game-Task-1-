package com.company;
import java.util.Scanner;

public class GUESS_THE_NUMBER {
    public static void main(String[]args){
        int number = (int)(Math.random()*100);
        Scanner sc =new Scanner(System.in);
        int userchoice=0;
        do{
            System.out.println("enter The Number Bettween 1-100");
            userchoice=sc.nextInt();
            if (userchoice==number){
                System.out.println("YOU GUESS THE RIGHT NUMBER....");
            }
            else if(userchoice>number){
                System.out.println("YOUR NUMBER IS THE LARGE......");
            }
            else{
                System.out.println("YOUR NUMBER IS TOO SMALL......");
            }
        }while (userchoice>0);
        System.out.println("THE GAME IS END....");
    }
}
