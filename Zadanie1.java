package main.java;
public class Zadanie1 {
    public static void main(String[] args) {
        int[] massive1 = { 990, 402, 984, 651, 360, 69, 408, 319, 601, 485, 960, 507, 725, 547, 544,
                615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941,
                386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
                399, 162, 758, 219, 918, 157, 899, 145, 345, 234, 777, 237, 412, 566, 826, 248, 866,
                951, 626, 949, 687, 217, 815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843,
                831, 445, 742, 717, 958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721,
                328, 753, 470, 743, 527};
        int min, max1, max2;
        min = massive1 [0];
        for (int i = 1; i<massive1.length;i++)
        {
            if (massive1 [i] < min) {
                min = massive1 [i];
            }
        }
        System.out.printf("minimalnyi element %d\n",min);
        max1= min;
        max2= min;
        for (int i = 0; i<massive1.length;i++)
        {
            if (massive1 [i] > max1) {
               max1 = massive1 [i];
            }
        }
        for (int i = 0; i<massive1.length;i++)
        {
            if (massive1 [i] > max2 && massive1 [i]!= max1) {
               max2 = massive1 [i];
            }
        }
        System.out.printf("vtoroy po velichine element raven = %d", max2);
    }
}
