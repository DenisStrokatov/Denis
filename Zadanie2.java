package main.java;
public class Zadanie2 {
        public static void main(String[] args) {
            int chislo = 2480;
            int i,k, chastnoe,dlina;
            int[] massive;
            massive = new int [32];
            massive [0]=1;
            k=0;
            chastnoe = chislo;
            i=2;
            while (i<=chastnoe){
                if (chastnoe % i == 0) {
                    k=k+1;
                    massive[k]=i;
                    chastnoe = chastnoe/i;
                    i=2;
                } else {i++;};
            }
            dlina=k;
            for (k=0;k<dlina;k++) {
                System.out.printf("%d * ", massive[k]);
            }
            System.out.printf("%d", massive[dlina]);
        }
    }
