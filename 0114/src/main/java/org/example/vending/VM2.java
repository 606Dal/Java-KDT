package org.example.vending;

/*
  Enum은 처음부터 몇 개를 만들지 정해야 함.
  - 지정된 숫자만큼의 객체만 생성
  - 외부에서 바꾸면 안 돼서 public X
 */
public enum VM2 {
	// 상수로 (없으면 메서드 생성에서 오류남)
	INSTANCE; // 필요한 갯수만큼 객체 생성.

	// public 생성자 사용 못함.

	public String hello() {
		return "Hello";
	}
}
