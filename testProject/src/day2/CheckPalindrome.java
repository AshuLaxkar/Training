package day2;

import java.util.Scanner;

public class CheckPalindrome {
 public static void checkPalindrome(){
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter a String to check for palindrome");
     String s = scn.nextLine();
     int flag = 0;
     String s1 = s.toLowerCase();
     for(int i = 0; i < s1.length()/2; i++){
         if(s.charAt(i) != s1.charAt(s1.length()-i-1)){
             flag = 1;
             break;
         }
     }
     if(flag == 1){
         System.out.println("not a palindrome");
     }else{
         System.out.println("Its a palindrome");
     }
 }
}
