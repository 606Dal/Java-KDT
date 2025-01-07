package org.example;

import java.util.Arrays;

//다차원 배열
public class MultEx {

    public static void main(String[] args) {
/*
        int[][] arr = { {1, 3}, {2, 4}, {3, 4}, {6, 6, 7, 9, 10} };

        System.out.println(arr); // [[I@76ed5528
        System.out.println(arr[1][1]);
 */

        int[][] arr = new int[6][];

        System.out.println(Arrays.toString(arr));

        int[] temp1 = {1,2,3};

        System.out.println(temp1);

        arr[0] = temp1;

        System.out.println(arr[0] == temp1);

    }
}
