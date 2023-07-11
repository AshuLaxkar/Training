//Write a program to find the largest number in an array?:
//
//        input: [5, 98, 43, 1, 321, 43]
//
//        output: 321

//        Write a program to reverse a string using loop?
//
//        input: "Hello"
//
//        output: olleH

public class Test {

    public  void largestNumber(int arr[]) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
    System.out.println("Largest number is " +max);
    }

    public void toReverseString(String s){
        StringBuffer sb = new StringBuffer();
//        for(int i = s.length()-1; i >= 0 ; i--){
//            sb.append(s.charAt(i));
//        }
        int i = s.length()-1;
        while(i >= 0){
            sb.append(s.charAt(i));
            i--;
        }
        String s1 = sb.toString();

        System.out.println("This is your reversed string " + s1);
    }
}
