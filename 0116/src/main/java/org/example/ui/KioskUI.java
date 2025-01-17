package org.example.ui;

public class KioskUI extends AbstractUI {

	public void doA() {

		// 상속받아서 스캐너 정의 안 해도 됨.

		// 이름 나이 입력 받기
		String name = input("당신의 이름은?");

		int age = inputInt("당신의 나이는?");

	}

}
