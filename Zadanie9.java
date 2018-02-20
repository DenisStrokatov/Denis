package main.java;

public class Zadanie9 {
    public static void main(String[] args) {
        int[] massive1 = {10, 15, 7}, massive2;
        massive2 = new int[massive1.length];
        int chislo = 4;
        int i, k, t, p;
        for (i = 0; i < massive1.length; i++) {
            massive2[i] = massive1[i];
        }
        for (i = 0; i < massive1.length; i++) {
            for (k = i + 1; k < massive1.length; k++) {
                if (i < k && massive2[i] > massive2[k]) {
                    t = massive2[k];
                    p = massive2[i];
                    massive2[i] = t;
                    massive2[k] = p;
                }
            }
            ;
        }
        for (i = 0; i < massive1.length; i++) {
            System.out.printf("%d  ", massive2[i]);
        }
        System.out.printf("\n razmen %d koppek po %d, %d i %d:\n", chislo, massive2[0], massive2[1], massive2[2]);
        for (k = 0; k <= chislo / massive2[2]; k++) {
            i = 0;
            while (chislo - massive2[2] * k - massive2[1] * i >= 0 && chislo >= massive2[2]) {
                System.out.printf("%d kop*%d, %d kop*%d, %d kop*%d, ne razmenyano %d kop\n ",
                        massive2[2], k, massive2[1], i, massive2[0], (chislo - massive2[2] * k - massive2[1] * i) / massive2[0], (chislo - massive2[2] * k - massive2[1] * i) % massive2[0]);
                i = i + 1;
            }
        }
        i = 0;
        if (chislo >= massive2[1] && chislo < massive2[2]) {
            while (chislo - massive2[1] * i >= 0) {
                System.out.printf("%d kop*0, %d kop*%d, %d kop*%d, ne razmenyano %d kop\n ", massive2[2], massive2[1], i, massive2[0], (chislo - massive2[1] * i) / massive2[0], (chislo - massive2[1] * i) % massive2[0]);
                i = i + 1;
            }
            ;
        }
        ;
        if (chislo >= massive2[0] && chislo < massive2[1]) {
            System.out.printf("%d kop*0, %d kop*0, %d kop*%d, ne razmenyano %d kop\n ", massive2[2], massive2[1], massive2[0], chislo / massive2[0], chislo % massive2[0]);
        }
        ;
        if (chislo < massive2[0]) {
            System.out.printf("razmen %d kopeek ne vozmogen\n ", chislo);
        }
    }
}
