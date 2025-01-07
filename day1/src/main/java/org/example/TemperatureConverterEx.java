package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 온도 변환(섭씨 - 화씨)
public class TemperatureConverterEx {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("섭씨(°C) -> 화씨(°F)는 '1', 화씨(°F) -> 섭씨(°C)는 '2' 입력해주세요 : ");
        int num = Integer.parseInt(br.readLine());

        if(num == 1) {
            System.out.print("섭씨(°C) 온도를 입력하세요: ");
            double celsius = Double.parseDouble(br.readLine());
            // 섭씨를 화씨로 변환
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + "°C는 " + fahrenheit + "°F 입니다.");
        }else if(num == 2) {
            System.out.print("화씨(°F) 온도를 입력하세요: ");
            double fahrenheit = Double.parseDouble(br.readLine());
            // 화씨를 섭씨로 변환
            double celsius = (fahrenheit - 32) * 5 / 9;

            System.out.println(fahrenheit + "°F는 " + celsius + "°C 입니다.");
        }

    }
}
