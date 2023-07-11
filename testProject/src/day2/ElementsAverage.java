package day2;

import java.util.Scanner;

public class ElementsAverage {
    public static void elementsAverage(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter total numbers of elements :");
        int num = scn.nextInt();
        int []arr = new int[num];
        System.out.println("Enter elements");
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
            sum += arr[i];
        }

        float average = (float) sum / num;
        System.out.println("This is the average of all the elements : " + average);
    }
}
