package org.example;

// 윤년 계산
public class LeapYearChecker {

    public static void main(String[] args) {

        int year = 2024;

        // 연산 데이터 범위가 제일 좁은 애부터
        if(year % 400 == 0) {
            System.out.println("윤년");
        }else if(year % 100 == 0) {
            System.out.println("평년");
        }else if(year % 4 == 0) {
            System.out.println("윤년");
        }else {
            System.out.println("평년");
        }

    }
}
