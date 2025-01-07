package org.example;

public class ArrayEx {

    public static void main(String[] args) {

        int[] arr = {10, 30, 24, 32, 42, 15};

        // length = 6
        // 인덱스 번호 = 0~5
        for (int i = 0; i < arr.length; i++) {
            /*
            int value = arr[i]; // 별 필요없이 변수를 계속 생성중이라서 좋지 않음.
            System.out.println(value);
            
             */
            System.out.println(arr[i]);
        } // end for

        System.out.println("-------------------------");

        for(int value : arr) {
            System.out.println(value);
        }

    }
}
