package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
System.out.println("Enter Your Gender: male/female");
String Gender =in.nextLine();
        if (!Gender.equals("male") && !Gender.equals("female")) {
            System.out.println("Error");
            System.exit(1);
        }
        System.out.println("Enter Your Height:");
        float Height =in.nextFloat();
        System.out.println("Enter Your Weight:");
        float Weight =in.nextFloat();

        if(Gender.equals("male")&&(Height - 100) > Weight)
            System.out.println("get fat");

        if(Gender.equals("male")&&(Height-100)<Weight)
                System.out.println("lose Weight:");

        if(Gender.equals("male")&& Float.compare((Height-100), 0)==0)
            System.out.println("You are ok:");

        if(Gender.equals("female")&&(Height-110)>Weight)
            System.out.println("get fat:");

        if(Gender.equals("female")&&(Height-110)<Weight)
                System.out.println("lose Weight:");

        if(Gender.equals("female")&&(Height-100)==0)
            System.out.println("You are ok:");

    }
}
