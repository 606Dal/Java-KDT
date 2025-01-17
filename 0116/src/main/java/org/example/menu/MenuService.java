package org.example.menu;

import org.example.ex.A1;

import java.util.ArrayList;
// 추상 클래스
public abstract class MenuService {

	// 추상 메서드
	@A1
	public abstract ArrayList<Menu> getMenuList();




/*
	private ArrayList<Menu> menus;

	public MenuService(ArrayList<Menu> menus) {
		this.menus = menus;
	}

	public ArrayList<Menu> getMenu(){

		return menus;
	}

 */

}
