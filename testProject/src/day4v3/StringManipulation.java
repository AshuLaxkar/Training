package day4v3;

public class StringManipulation {

    public static void removeWhiteSpace(String s){

        System.out.println(s.trim());
    }

    public static void replaceWord(String s,String o,String n){
            String s1 =  s.replace(o,n);
            System.out.println(s1);
    }

    public static void replaceReverse(String s){
        String arr[] = s.split(" ");
//        for(String s1 : arr){
//            System.out.println(s1);
//        }
//        System.out.print(arr.length);
        for(int i = 0; i < arr.length; i++){
            String s1 = arr[i];
            StringBuffer sb = new StringBuffer();
            for(int j = s1.length()-1; j >= 0; j--){

               sb.append(s1.charAt(j));
            }
            String s3 = sb.toString();
            System.out.print(s3+" ");
        }
    }
}
