/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */


import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        System.out.println("is the car silent when you turn the key?");
        Scanner UserInput = new Scanner(System.in);
        String first = UserInput.nextLine();

        if (first.equals("y")){
            System.out.println("Are the battery terminals corroded?");
            String second = UserInput.nextLine();
            if (second.equals("y")){
                System.out.println("Clean the terminals and try starting again.");
            }else if (second.equals("n")){
                System.out.println("Replace the cables and try again.");
            }
        }else if (first.equals("n")){
            System.out.println("Does the car make a slicking noise?");
            String second = UserInput.nextLine();
            if (second.equals("y")){
                System.out.println("Replace the battery.");
            }else if (second.equals("n")){
                System.out.println("Does the car crank up but fail to start.");
                String third = UserInput.nextLine();
                if (third.equals("y")){
                    System.out.println("Check the spark plug connections.");
                }else if(third.equals("n")){
                    System.out.println("Does the engine start and then die?");
                    String fourth = UserInput.nextLine();
                    if (fourth.equals("y")){
                        System.out.println("Does the car have fuel injection?");
                        String fifth = UserInput.nextLine();
                        if (fifth.equals("y")){
                            System.out.println("Get it in for service.");
                        }else if (fifth.equals("n")){
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }else if (fourth.equals("n")){
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
