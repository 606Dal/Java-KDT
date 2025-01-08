package org.example;

import org.example.knn.Point;
import org.example.lotto.LottoBall;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // 로직용 메서드는 동사로 만듦.
    public static double calcDistance(Point p1, Point p2) {

        double result = 0;
        // 거리 계산하는 것
        result = Math.sqrt(
                // pow = 제곱
          Math.pow(p1.xpos - p2.xpos, 2) +
                Math.pow(p1.ypos - p2.ypos, 2)
        );

        return result;
    }

    public static void main(String[] args) {

        Point p1 = new Point(1,1);
        Point p2 = new Point(5,5);

        double distance = calcDistance(p1, p2);

        System.out.println(distance);

        /*
        ArrayList<Integer> list = new ArrayList<>();

        // 인덱스 번호 몰라도 됨
        list.add(30);
        list.add(44);
        list.add(11);
        list.add(52);
        list.add(9);

        // Arrays.toString() 배열의 내용물
        System.out.println(list);
        System.out.println(list.size());

        list.remove(Integer.valueOf(44));

        Collections.sort(list); // Dual-pivot QuickSort

        System.out.println(list);
        System.out.println(list.size());

         */

        //ArrayList<LottoBall> balls = new ArrayList<>();

//        LottoBall b1 = new LottoBall(1);
//        balls.add(b1);

        /*
        for(int i = 1; i <= 45; i++) {
            balls.add(new LottoBall(i));
        }

        for (int i = 0; i <3; i++) {
            Collections.shuffle(balls); // 공 순서를 섞음

            System.out.println(balls.subList(0,6)); // 6개로 자름 (0부터 5까지)

            System.out.println("------------");
            System.out.println(balls.size()); // 45개

        }

         */


    } // main
}