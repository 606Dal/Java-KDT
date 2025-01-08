package org.example.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lotto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<LottoBall> balls = new ArrayList<>();

        // 공 생성
        for(int i = 1; i <= 45; i++) {
            balls.add(new LottoBall(i));
        }

        // 금액 받기
        System.out.println("1회 1000원 입니다. 원하는 횟수만큼의 금액을 입력해 주세요 : ");
        int amount = Integer.parseInt(scanner.nextLine()) / 1000;

        for (int i = 0; i <amount; i++) {
            Collections.shuffle(balls); // 공 순서를 섞음

            System.out.println((i+1) + "회: " + balls.subList(0,6)); // 6개로 자름 (0부터 5까지)

            System.out.println("------------");

        } // end for

        scanner.close();

    }
}
