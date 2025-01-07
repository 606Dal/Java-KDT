package org.example;

// 최솟값, 최댓값
public class MinEx {

    public static void main(String[] args) {

        int[] arr = {32, 34, 22, 13, 6, -3};

        int min = arr[0];
        int max = arr[0];

        for(int value : arr) {

            System.out.println(value);

            min = value < min ? value : min;
            max = value > max ? value : max;

            /*
            if(value < min) {
                min = value; // 값 교환
            }
            if(value > max) {
                max = value;
            }

             */

        } // end for

        System.out.println("Min : " + min);
        System.out.println("Max : " + max);

    }
}
