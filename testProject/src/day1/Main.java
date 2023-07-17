package day1;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {

            Scanner scn = new Scanner(System.in);
            Test t = new Test();

            System.out.println("Enter 1 to find largest number");
            System.out.println("Enter 2 to reverse the String");
            int x = scn.nextInt();
            scn.nextLine();
            switch (x) {
                case 1:
                    System.out.println("Enter total number");
                    int num = scn.nextInt();
                    int arr[] = new int[num];
                    System.out.println("Enter numbers");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = scn.nextInt();
                    }
                    t.largestNumber(arr);
                    break;
                case 2:
                    System.out.println("Enter a String to reverse :");
                    String s = scn.nextLine();
                    t.toReverseString(s);
                    scn.nextLine();
                    break;
                default:
                    System.out.println("Wrong input please Enter right input");
            }
            System.out.println("Do you want to continue Y / N");
            String s1 = scn.nextLine();
            if (s1.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}