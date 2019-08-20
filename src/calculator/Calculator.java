/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author rock and roll
 */
public class Calculator{

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    public static calulatorcalculate ca;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator cal = new Calculator();

//        int a=0;
//        int b=0;
        int choice;
        int choice1;
        int choice2;

        do {

            System.out.println("Select your choices:");
            System.out.println("1.Addition:");
            System.out.println("2.Subtraction:");
            System.out.println("3.Multiplication:");
            System.out.println("4.Division:");
            System.out.println("Enter the value of a:");
            Scanner sc3 = new Scanner(System.in);
            choice = sc3.nextInt();
            
            System.out.println("Enter the value of b:");
            Scanner sc4 = new Scanner(System.in);
            choice1 = sc4.nextInt();
            System.out.println("Enter your choice:");
             Scanner sc5 = new Scanner(System.in);
            choice2 = sc5.nextInt();
            
           

            Model m = new Model(choice, choice1);
           
           

            switch (choice2) {
                case 1:
//                ca=new Add();
//                System.out.println("addition="+ca.calculate(cal.getA(),cal.getB()));
                    int add = m.getA() + m.getB();
                    System.out.println("addition: " + add);

                    break;
                case 2:
                    int sub = m.getA() - m.getB();
                    System.out.println("addition: " + sub);

                    break;
                case 3:
                    int mul = m.getA() * m.getB();
                    System.out.println("addition: " + mul);

                    break;
                case 4:
                    int div = m.getA() / m.getB();
                    System.out.println("addition: " + div);

                    break;

                default:
                    System.out.println("Unrecognized choice.");
                    ;
            }
        } while (choice2 != 0);

    }

}
