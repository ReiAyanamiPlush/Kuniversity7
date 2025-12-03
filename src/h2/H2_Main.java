package h2;

import java.util.Arrays;

public class H2_Main {

    public static void main(String[] args) {

        change(new int[]{2, 7, 1, 9}, new int[]{5, 6, 7}, 2, 4);        //should be [2, 7, 1, 9]
        change(new int[]{2, 7, 1, 9}, new int[]{2, 7, 1, 9}, 2, 4);     //should be [7, 9]
        change(new int[]{2, 7, 1, 9}, new int[]{2, 7, 1, 9}, 3, 2);     //should be [] aka "nö"

    }

    public static int[] change(int[] a, int[] b, int start, int end) {

        if (end > start) {

            if (Arrays.compare(a, b) != 0) {
                int[] hor = new int[a.length];

                for (int i = 0; i < a.length; i++) {
                    hor[i] = a[i];
                }
                System.out.println(Arrays.toString(hor));
                return hor;

            } else {

                Arrays.sort(a);

                int[] glorbyoinsky = Arrays.copyOfRange(a, start, end);

                System.out.println(Arrays.toString(glorbyoinsky));
                return glorbyoinsky;


            }

        } else {

            System.out.println("nö");
            return new int[0];

        }


    }

}
