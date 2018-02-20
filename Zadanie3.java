package main.java;

public class Zadanie3 {
    public static void main(String[] args) {
        String str;
        str = "abc cba";
        int key = 0,l;
        l=str.length();
        System.out.printf("dlina %d\n",l);
        for (int i = 0; i <= l/2-1; i++) {
                if (str.charAt(i)!=str.charAt(l-i-1))
                {key=1;
                   System.out.printf("%d-tiy element @%c@ ne raven %d elemnty @%c@\n", i+1, str.charAt(i), l-i, str.charAt(l-i-1));
                   break;
            } ;
        }
        if (key==0) {
            System.out.println("stroka yavlyatsya palinomom");
        } else {System.out.println("stroka ne yavlyatsya palinomom");} ;
        };
    }

