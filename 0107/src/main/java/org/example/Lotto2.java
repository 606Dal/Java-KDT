package org.example;

import java.util.Arrays;
import java.util.Scanner;

// 평가시험때 쓸 수도 있음
public class Lotto2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 금액 받기
        System.out.println("1회 1000원 입니다. 원하는 횟수만큼의 금액을 입력해 주세요 : ");
        int amount = Integer.parseInt(scanner.nextLine()) / 1000 ;

        // 지금 방법은 효율적이지는 않음.
        int[] balls = new int[45];

        // 공을 1~45개 만듦
        for(int i = 0; i < balls.length; i++) {
            balls[i] = i + 1;
        }
        //System.out.println(Arrays.toString(balls));

        // 금액만큼 돌려야 함
        for (int i = 0; i < amount; i++) {
            System.out.println();
            System.out.println((i + 1) + "번째 회차: ");

            // 임의의 숫자 0부터 44까지 - 6번 뽑기
            for(int j = 0; j < 6;) {
                int idx = (int)(Math.random() * 45);   // 임의의 배열내 인덱스 번호

                int value = balls[idx];

                // -1이 나오면 출력하지 않고 for문을 다시 돎.
                if(value == -1){
                    //System.out.println("중복 발생");
                    continue;
                }

                System.out.print(" " + value);

                // 출력 후 -1로 바꿈
                balls[idx] = -1;
                j++;
            }//end for

//            System.out.println(Arrays.toString(balls));

        }//end for

    }// end main
}
