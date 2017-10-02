package com.company;
import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----Shop----- Please select one  of the following:" +
                "\n1) Shed" +
                "\n2) Handbag" +
                "\n3) Tractor\n\n");

        Scanner scanner = new Scanner(System.in);
        int itemInt = scanner.nextInt();

        if (itemInt == 1) {
            System.out.println("How many people is this order for?\n");
            int itemQuantity = scanner.nextInt();
            //String[] addressLog = new String[itemQuantity];
            ArrayList<String> addressLog = new ArrayList<String>();
            for (int i = 1; i <= itemQuantity; i++) {
                System.out.println("Enter address for order #" + i + " in one line please");
                Scanner addressScanner = new Scanner(System.in);

                String tempAddress= addressScanner.nextLine();
                addressLog.add(tempAddress);

            }
            System.out.println("A Shed will be delivered to the following addresses:");
            for (int i = 0; i < addressLog.size(); i++) {
                System.out.println(addressLog.get(i));

            }

        } else if (itemInt == 2) {
            System.out.println("How many people is this order for?\n");
            int itemQuantity = scanner.nextInt();
            //String[] addressLog = new String[itemQuantity];
            ArrayList<String> addressLog = new ArrayList<String>();
            for (int i = 1; i <= itemQuantity; i++) {
                System.out.println("Enter address for order #" + i + " in one line please");
                Scanner addressScanner = new Scanner(System.in);

                String tempAddress= addressScanner.nextLine();
                addressLog.add(tempAddress);

            }
            System.out.println("A Handbag will be delivered to the following addresses:");
            for (int i = 0; i < addressLog.size(); i++) {
                System.out.println(addressLog.get(i));
            }

        } else if (itemInt == 3) {
            System.out.println("How many people is this order for?\n");
            int itemQuantity = scanner.nextInt();
            //String[] addressLog = new String[itemQuantity];
            ArrayList<String> addressLog = new ArrayList<String>();
            for (int i = 1; i <= itemQuantity; i++) {
                System.out.println("Enter address for order #" + i + " in one line please");
                Scanner addressScanner = new Scanner(System.in);

                String tempAddress= addressScanner.nextLine();
                addressLog.add(tempAddress);

            }
            System.out.println("A tractor will be delivered to the following addresses:");
            for (int i = 0; i < addressLog.size(); i++) {
                System.out.println(addressLog.get(i));
            }
        } else {
            System.out.println("Please select 1,2 or 3 next time \n ----- PROCESS TERMINATED -----");
        }
    }
}
