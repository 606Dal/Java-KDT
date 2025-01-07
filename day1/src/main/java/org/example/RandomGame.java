package org.example;

import java.util.Scanner;

public class RandomGame {

    public static void main(String[] args) {
        // Scanner 필요
        Scanner scanner = new Scanner(System.in);
        // 당첨값 필요 - 랜덤 값
        int value = (int)(Math.random() * 6); // 0 ~ 5

        // 반복 처리
        for(int i = 0; i < 6; i++) {
            System.out.println("i ---- " + i);
            scanner.nextLine(); // 키보드 입력 시까지 멈춤

            if(value == i){
                System.out.println("당첨");
                break;
            }

        } // end for

        // 시간되면 - 순서대로 나 - 컴 - 나 - 컴 이런식으로 진행되게.



    }
}
