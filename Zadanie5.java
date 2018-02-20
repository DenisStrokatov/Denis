package main.java;

public class Zadanie5 {
    public static void main(String[] args) {
        String str1, str2;
        str1 = "abccba";
        str2 = "b";
        int key=1,l1,l2;
        l1=str1.length();
        l2=str2.length();
        for (int i = 0; i <= l1-l2; i++) {
            if (str1.charAt(i) == str2.charAt(0) && l2>1)
            {key = 0;
                for (int k=1; k<=l2-1;k++) {
                if (str1.charAt(i+k) != str2.charAt(k)){
                key = 1;}

            };
            if (key==0) {
                    System.out.println("stroka " + str2 + " soderjitsy v stroke " + str1);
                    break;
            };
            } ;
            if (str1.charAt(i) == str2.charAt(0) && l2==1)
            {   key=0;
                System.out.println("stroka " + str2 + " soderjitsy v stroke " + str1);
                break;
            }
        };
        if (key==1)
        {System.out.println("stroka " + str2 + " NE soderjitsy v stroke " + str1);
        };
    };
    }


