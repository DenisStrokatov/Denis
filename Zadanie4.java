package main.java;
public class Zadanie4 { public static void main(String[] args) {
    int chislo = 27;
    int i,k;
    System.out.printf("razmen po 3 i 5 koppek:\n");
    i = 0;
    while (chislo - 5*i >= 0 && chislo>=5) {
        System.out.printf("5 kop*%d, 3 kop*%d, ne razmenyano %d kop\n ", i, (chislo - 5*i) / 3, (chislo - 5*i) % 3);
        i = i + 1;
        };

    if (chislo==4 || chislo==3) {
        System.out.printf("5 kop*0, 3 kop*1, ne razmenyano %d kop\n ", chislo - 3);
    };
    if (chislo<3) {
        System.out.printf("razmen %d kopeek ne vozmogen\n ", chislo);
    }

    System.out.printf("\n razmen po 3, 5 i 7 koppek:\n");
    for (k=0; k<= chislo / 7;k++) {
        i=0;
        while (chislo-7*k - 5*i >= 0 && chislo>=7) {
            System.out.printf("7kop*%d, 5 kop*%d, 3 kop*%d, ne razmenyano %d kop\n ", k, i, (chislo-7*k - 5*i) / 3, (chislo-7*k - 5*i) % 3);
            i = i + 1;
            }
    }
    i=0;
    if (chislo==6 || chislo==5) {
        while (chislo - 5*i >= 0) {
            System.out.printf("7kop*0, 5 kop*%d, 3 kop*%d, ne razmenyano %d kop\n ", i, (chislo - 5*i) / 3, (chislo - 5*i) % 3);
            i = i + 1;
        };
    };
    if (chislo==4 || chislo==3) {
        System.out.printf("7kop*0, 5 kop*0, 3 kop*1, ne razmenyano %d kop\n ", chislo - 3);
    };
    if (chislo<3) {
        System.out.printf("razmen %d kopeek ne vozmogen\n ", chislo);
    }
    }
}
