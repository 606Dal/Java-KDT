package org.example.domain;

public class KoreanMenu extends Menu{

	private int person; // 몇 인분

	public KoreanMenu(int mno, String name, int price, int person) {
		super(mno, name, price);
		this.person = person;
	}
}
