package day2;

import java.util.Scanner;

public class ArrayReverse {

    public static void print(int arr[]){
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverseArray(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter total numbers of elements :");
        int num = scn.nextInt();
        int []arr = new int[num];
        System.out.println("Enter elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println("Here is the reversed Array");
        print(arr);
        System.out.println();
    }
}
