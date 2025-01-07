package org.example;

import java.util.Scanner;

public class Calculator4U {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 계속 유지할 변수
        int sum = 0;
        int lastValue = 0;  // 마지막으로 더한 값

            System.out.println("종료하려면 END를 입력하세요.");
            System.out.println("취소하려면 C를 입력하세요.");
        // 로직
        while(true) {
            System.out.println("값을 입력하세요 : ");
            String str = scanner.nextLine();

            if(str.equals("END")){
                break;
            } else if(str.equals("C")) {
                // 최근에 더한 값을 취소 (빼기)
                sum -= lastValue;
                System.out.println("마지막 값이 취소되었습니다. 현재 합계 : " + sum);
                continue;
            }

            int value = Integer.parseInt(str);

            sum = sum + value;
            lastValue = value;  // 최근에 입력한 값을 저장

            System.out.println("합계 : " + sum);
        } // end while

    }
}
