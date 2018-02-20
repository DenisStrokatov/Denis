package main.java;

public class Zadanie8 {
    public static void main(String[] args) {
        String str1;
        str1 = "3a2b3d3c1a2e1k";
        int[] mass1;
        mass1 = new int[str1.length()];
        char[] mass2;
        mass2 = new char[str1.length()];
        int k = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == '1' || str1.charAt(i) == '2' || str1.charAt(i) == '3' || str1.charAt(i) == '4' || str1.charAt(i) == '5'
                    || str1.charAt(i) == '6' || str1.charAt(i) == '7' || str1.charAt(i) == '8' || str1.charAt(i) == '9') {
                k++;
                mass1[k] = Character.getNumericValue(str1.charAt(i));
                i++;
                while (str1.charAt(i) == '0' || str1.charAt(i) == '1' || str1.charAt(i) == '2' || str1.charAt(i) == '3' || str1.charAt(i) == '4' || str1.charAt(i) == '5'
                        || str1.charAt(i) == '6' || str1.charAt(i) == '7' || str1.charAt(i) == '8' || str1.charAt(i) == '9') {
                    mass1[k] = mass1[k] * 10 + Character.getNumericValue(str1.charAt(i));
                    i++;
                }
            }
            mass2[k] = str1.charAt(i);
        }
        ;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= mass1[i]; j++) {
                System.out.printf("%c", mass2[i]);
            }
        }
    }
}
