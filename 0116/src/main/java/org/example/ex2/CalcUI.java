package org.example.ex2;

import java.util.Scanner;

/*
  로직 위주의 객체
  인스턴스 변수 - 조력자/협력자
 */
public class CalcUI {

	Calculator calculator;

	// 생성자 주입 (인터페이스를)
	public CalcUI(Calculator calculator) {
		this.calculator = calculator;
	}

	public void startUI() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("num1");
		int num1 = Integer.parseInt(scanner.nextLine());

		System.out.println("num2");
		int num2 = Integer.parseInt(scanner.nextLine());

		System.out.println(calculator.add(num1, num2));
	}
}
