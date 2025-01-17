package org.example.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PizzaMenu extends Menu {

	// 사이즈는 3개정도로 정해져 있으니까 enum 사용함.
	private PizzaSize size;

	public PizzaMenu(int mno, String name, int price, PizzaSize size) {
		super(mno, name, price);
		this.size = size;
	}

}
