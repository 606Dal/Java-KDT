package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Menu {

	protected int mno; // 메뉴 번호
	protected String name; // 메뉴 이름
	protected int price; // 메뉴 가격

}
