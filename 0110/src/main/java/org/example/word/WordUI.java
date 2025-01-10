package org.example.word;

/*
 로직 위주의 객체 - 인스턴스 변수
 - 여러 메서드에서 사용
 - 메소드의 결과를 계속 보관하는 경우
 - 협력자(조력자) 인스턴스 변수
 - 한번 만들어서 여러 번 사용하느 객체
 */

import java.util.Scanner;

public class WordUI {

	// 기능 설계는 동사, UI는 대부분 void
	// 4.

	private WordService service;

	// 서비스가 없으면 UI 안 됨 (이런 제약 조건이 의존성 주입)
	public  WordUI(WordService serviceObj) {
		this.service = serviceObj;
	}

	public void exam() {

		Scanner scanner = new Scanner(System.in);

		WordVO word = this.service.getNextWord();

		// 한국어 문제
		System.out.println(word.getKor());

	}

}
