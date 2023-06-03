/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinformation;

import java.util.Scanner;

/**
 *
 * @author layan
 */
public class Userp {

    
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your gender (M/F): ");
        String gender = scanner.next();
        UserInformation user = new UserInformation(name, age, height, weight, gender);
        System.out.println("User information recorded:");
        System.out.println(user);
    }
    
}
