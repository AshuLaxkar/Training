package day2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
        System.out.println("Enter 1 to count Vowels");
        System.out.println("Enter 2 to Find Average");
        System.out.println("Enter 3 to Check if String is a Palindrome or Not");
        System.out.println("Enter 4 to Reverse Array");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        scn.nextLine();
        switch(x){

            case 1 : CountVowels.countVowels();
            break;

            case 2 : ElementsAverage.elementsAverage();
            break;

            case 3 : CheckPalindrome.checkPalindrome();
            break;

            case 4 : ArrayReverse.reverseArray();
            break;
            default : System.out.println("Enter a correct input");
        }
            System.out.println("Do you want to continue Y / N");
            String s1 = scn.nextLine();
            if(s1.equalsIgnoreCase("N")){
                break;
            }
        }
    }
}
