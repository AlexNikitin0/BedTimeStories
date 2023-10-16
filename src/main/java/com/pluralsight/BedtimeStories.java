package com.pluralsight;
import java.util.Scanner;
import java.io.*;

public class BedtimeStories {

    public static void main(String[] args) {
        int choice;
        String input;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("what bedtime story would you like to read? Enter 1 2 or 3: ");
        System.out.println("(1)Goldilocks");
        System.out.println("(2)Hansel and Gretel");
        System.out.println("(3)Mary had a little lamb");
        choice = keyboard.nextInt();

        FileInputStream fis = null;

        //if user selects 1: goldilocks will print

        if (choice == 1) {

            try {
                fis = new FileInputStream("src/main/resources/goldilocks.txt");
                Scanner scanner = new Scanner(fis);

                while (scanner.hasNextLine()) {
                    input = scanner.nextLine();
                    System.out.println(input);
                }
                scanner.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);

            }

        }
        else if(choice == 2){

            try {
                fis = new FileInputStream("src/main/resources/hansel_and_gretel.txt");
                Scanner scanner = new Scanner(fis);

                while (scanner.hasNextLine()) {
                    input = scanner.nextLine();
                    System.out.println(input);
                }
                scanner.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);

            }

        }
        else if(choice == 3){
            try {
                fis = new FileInputStream("src/main/resources/mary_had_a_little_lamb.txt");
                Scanner scanner = new Scanner(fis);

                while (scanner.hasNextLine()) {
                    input = scanner.nextLine();
                    System.out.println(input);
                }
                scanner.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);

            }
        }

    }
}