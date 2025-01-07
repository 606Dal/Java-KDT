package org.example;

public class IfTest {

    public static void main(String[] args) {

        // 랜덤한 숫자 int (0.0 ~ 2.999999 사이의 숫자만 나옴)
        //int value = (int)(Math.random() * 3); // 0, 1, 2
        int value = (int)(Math.random() * 6) + 1;

        System.out.println(value);

        int oddEven = value % 2; // 2로 나눈 나머지 => 0,1
/*
        // oddEven이 0이면 짝수 출력 - boolean
        if(oddEven == 0){
            System.out.println("짝수");
            return; // 여기서 끝
        }
        System.out.println("홀수");

 */

        // 삼항 연산자의 경우
        String result = oddEven == 1? "홀수" : "짝수";

        System.out.println(result);

    }
}
