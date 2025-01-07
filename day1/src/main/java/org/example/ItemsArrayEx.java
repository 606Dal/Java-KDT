package org.example;

import java.util.Scanner;

public class ItemsArrayEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        // 2차원 배열 사용한 예제
        Item[][] itemsArray = new Item[2][5];

        System.out.println("최대 5개의 항목을 입력하세요.");
        System.out.println("입력을 끝내려면 'q'를 입력하세요.");

        // 배열에 내용 입력 스캐너로 받기
        Loop1 :
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((i+1) + "-" + (j+1) + " 종류를 입력하세요: ");
                String type = scanner.nextLine();

                if (type.equals("q")) {
                    break Loop1;
                }

                System.out.print((i+1) + "-" + (j+1) + " 금액을 입력하세요: ");
                int amount = scanner.nextInt();

                // Item 객체 생성 및 배열에 저장
                itemsArray[i][j] = new Item(type, amount);

                // nextInt() 후 nextLine() 추가하여 입력 오류 방지
                scanner.nextLine();
            } // end for
        } // end for

        scanner.close(); // 스캐너 닫기

        // 출력
        System.out.println("\n입력된 정보:");
        for (Item[] row : itemsArray) {
            for (Item item : row) {
                // null 처리를 안 해서 마지막에 자꾸 오류 있었음
                if (item != null) {
                    System.out.println("종류 = " + item.type + " : 금액 = " + item.amount);
                    sum += item.amount;

                }
            }
        }
        System.out.println("합계 : " + sum);

/*
        // ArrayList  사용한 예제
        ArrayList<Item> list = new ArrayList<>();

        System.out.println("최대 5개의 항목을 입력하세요.");
        System.out.println("입력을 끝내려면 'q'를 입력하세요.");

        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + ". 종류를 입력하세요: ");
            String type = scanner.nextLine();

            if (type.equals("q")) {
                break;
            }

            System.out.print((i+1) + ". 금액을 입력하세요: ");
            int amount = scanner.nextInt();

            scanner.nextLine();

            list.add(new Item(type, amount));

        }

        scanner.close(); // 스캐너 닫기

        // 출력
        System.out.println("\n입력된 정보:");
        for (Item item : list) {
            System.out.println(item.type + " : " + item.amount);
        }

 */

    }
}

class Item {
    String type;
    int amount;

    public Item(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }
}
