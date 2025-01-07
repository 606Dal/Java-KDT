package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // br.readLine 밖에 안 씀.

        String str = br.readLine(); // throws Exception 필요함.

        // 소수 처리
        double value1 = Double.parseDouble(str); // 문자열 -> 더블로 처리

        // 정수
        int value2 = Integer.parseInt(str);


    }
}