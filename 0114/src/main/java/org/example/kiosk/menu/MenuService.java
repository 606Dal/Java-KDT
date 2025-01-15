package org.example.kiosk.menu;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;

@Log4j2
public enum MenuService {

	INSTANCE;

	// 주어진 메뉴 데이터들을 제공하는 기능
	// MenuService가 CRUD 기능 함.
	// 2. 변수 선언
	private ArrayList<Menu> menus;

	// 3. (생성자) 초기화
	private MenuService () {
		this.menus = new ArrayList<>();
		menus.add(new Menu(1, "Americano", 3000));
		menus.add(new Menu(2, "Latte", 3500));
		menus.add(new Menu(3, "Cappuccino", 4000));
		menus.add(new Menu(4, "Espresso", 2500));

		// 생성자에서는 log 사용 문제가 생김.
	}

	// 1.
	public ArrayList<Menu> getList() {

		log.info("getList..called");
		log.info(menus);

		return menus;
	}



}
