package org.example.menu;

import java.util.ArrayList;

public class Menu {

    public static void main(String[] args) {

        // 김밥류
        ArrayList<Category> gimbapList = new ArrayList<>();

        Category gimbap1 = new Category("참치김밥", 3500);
        Category gimbap2 = new Category("치즈김밥", 3500);
        Category gimbap3 = new Category("날치알땡초김밥", 4000);

        gimbapList.add(gimbap1);
        gimbapList.add(gimbap2);
        gimbapList.add(gimbap3);

        // 면류(칼국수)
        ArrayList<Category> kalguksuList = new ArrayList<>();

        Category kalguksu1 = new Category("칼국수", 5000);
        Category kalguksu2 = new Category("장칼국수", 6000);
        Category kalguksu3 = new Category("비빔칼국수", 6000);

        kalguksuList.add(kalguksu1);
        kalguksuList.add(kalguksu2);
        kalguksuList.add(kalguksu3);

        // 음료
        ArrayList<Category> drinkList = new ArrayList<>();

        Category drink1 = new Category("콜라", 1500);
        Category drink2 = new Category("사이다", 1500);

        drinkList.add(drink1);
        drinkList.add(drink2);

        // 출력
        System.out.println("메뉴판");
        System.out.println("=========================");
        System.out.println("김밥류 " + gimbapList);
        System.out.println("=========================");
        System.out.println("면류 " + kalguksuList);
        System.out.println("=========================");
        System.out.println("음료 " + drinkList);
    }



}
