package day4v3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 1 to remove white spaces from a sentence");
        System.out.println("Enter 2 to replace word with another word");
        System.out.println("Enter 3  to reverse the words of an sentence");
        int x = scn.nextInt();
        scn.nextLine();

        switch (x) {
            case 1:
                String s = scn.nextLine();
                StringManipulation.removeWhiteSpace(s);
                break;
            case 2:
                System.out.print("Enter the sentence  you have to replace: ");
                String s1 = scn.nextLine();
                System.out.print("Enter the old word that you have to replace: ");
                String o = scn.nextLine();
                System.out.print("Enter new word you want to replace it with: ");
                String n = scn.nextLine();
                StringManipulation.replaceWord(s1,o,n);
                break;
            case 3:
                System.out.print("Enter any sentence");
                String s3 = scn.nextLine();
                StringManipulation.replaceReverse(s3);
                break;
            default: System.out.println("Enter the correct input");
        }


    }
}
