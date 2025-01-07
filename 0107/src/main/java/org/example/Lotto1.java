package org.example;

import java.util.Arrays;

public class Lotto1 {

    public static void main(String[] args) {

        // 결과물을 담을 배열 선언
        int[] result = new  int[6];

        for(int i = 0; i < 6; i++) {

            int temp = (int)(Math.random() * 45) + 1;

            result[i] = temp;

            // 중복 방지

        }

        // 1~45 랜덤 숫자
//        result[0] = (int)(Math.random() * 45) + 1;
//        result[1] = (int)(Math.random() * 45) + 1;
//        result[2] = (int)(Math.random() * 45) + 1;
//        result[3] = (int)(Math.random() * 45) + 1;
//        result[4] = (int)(Math.random() * 45) + 1;
//        result[5] = (int)(Math.random() * 45) + 1;

        System.out.println(Arrays.toString(result));



    }
}
