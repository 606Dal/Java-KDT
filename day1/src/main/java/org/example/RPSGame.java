package org.example;

import java.util.Scanner;

// 가위바위보 게임
public class RPSGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int userWins = 0; // 사용자 승리 횟수

        System.out.println("종료하려면 END를 입력하세요.");

        while (true) {
            System.out.println("가위0, 바위1, 보2 입력하세요 : ");
            String str = scanner.nextLine();
            if(str.equals("END")){
                break;
            }
            System.out.println("입력한 값 : " + str);

            int user = Integer.parseInt(str);

            // 컴 값
            int com = (int)(Math.random() * 3);

            // 유저가 컴보다 작으면 +3
            user = user < com ? user + 3 : user;

            int result = user - com; // 0, 1, 2

            System.out.println("USER: " + user);
            System.out.println("COM: " + com);

            switch (result){
                case 0:
                    System.out.println("무승부");
                    break;
                case 1:
                    System.out.println("승");
                    userWins++;  // 사용자 승리 횟수 증가
                    break;
                case 2:
                    System.out.println("패");
                    break;
            } //end switch

            System.out.println("현재 사용자 승리 횟수: " + userWins);

            // 최종 결과
            if (userWins == 3) {
                System.out.println("사용자가 3번 승리하여 게임 종료");
                break;
            }

        } //end while

        scanner.close();



    }
}
