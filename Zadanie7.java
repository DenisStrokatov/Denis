package main.java;

public class Zadanie7 {
    public static void main(String[] args) {
        String str1;
        str1 = "abddcccaeee";
        int key;
        for (int i = 0; i <str1.length(); i++) {
            if (i==str1.length()-1) {
                System.out.printf("1%c", str1.charAt(i));
                break;
            }
            key=1;
            while (str1.charAt(i) == str1.charAt(i+key)) {
                key++;
                if (i+key == str1.length()) break;
            };
            System.out.printf("%d%c",key, str1.charAt(i));
            i=i+key-1;
        }
        }
    }

