package org.example.ui;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

// 이번에는 추상클래스로
@RequiredArgsConstructor
public abstract class BasicUI {

	private final Scanner scanner;

	// 키보드에서 입력받는 기능
	public String input(String msg){
		System.out.println(msg);

		return scanner.nextLine();
	}

	public int inputInt(String msg) {
		return Integer.parseInt(input(msg));
	}

	// 상속. 하위 클래스에서 구현해야 하는 부분.
	public abstract void execute();

}
