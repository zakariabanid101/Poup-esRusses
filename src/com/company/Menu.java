package com.company;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int dollChoices;
    int operationChoice;


    russianDoll doll1 = new russianDoll(2);
    russianDoll doll2 = new russianDoll(4);
    russianDoll doll3 = new russianDoll(6);
    russianDoll doll4 = new russianDoll(8);

    void dollChoice() {
        System.out.println("1 --> Doll 1");
        System.out.println("2 --> Doll 3");
        System.out.println("3 --> Doll 2");
        System.out.println("4 --> Doll 4");
        System.out.println("enter your choice");
        dollChoices = scanner.nextInt();
    }

    void OperationChoices() {
        System.out.println("enter your choice");
        System.out.println("1. Open the Doll.");
        System.out.println("2. Close the Doll");
        System.out.println("3. Place The Doll in another Doll");
        System.out.println("4. Take of the Doll from another");
        System.out.println("0. Back to Doll choice.");
        int opChoice;
        do {
            System.out.println("Enter your choice : ");
            opChoice = new Scanner(System.in).nextInt();
            if (opChoice < 0 || opChoice > 4) ;
            System.out.println("your choice must be between 0 and 4");
        } while (opChoice < 0 || opChoice > 4);
        switch (opChoice) {
            case 1:
                OperationChoices();
                break;

        }
    }
}

