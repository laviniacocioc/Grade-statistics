/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lavinia
 */

import java.util.Scanner;

public class UserInterface {
     private GradeRegister register;
    private Scanner scanner;
 
    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }
 
    public void start() {
        System.out.println("Enter point totals, -1 stops: ");
        readPoints();
        System.out.println("");
        System.out.println("Point average (all): " + register.averageOfPoints());
        register.averagePassingGrade(register.getArrayPoints());
        register.passPercentage(register.getArrayPoints());
        printGradeDistribution();
    }
 
    public void readPoints() {

        while (true) {
            
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                break;
            }

 
            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
            } else {this.register.addGradeBasedOnPoints(points);
            
            }
        }
    }
 
    public void printGradeDistribution() {
        int grade = 5;
        System.out.println("Grade distribution:");
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");
 
            grade = grade - 1;
        }
        
              
    }
 
    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}