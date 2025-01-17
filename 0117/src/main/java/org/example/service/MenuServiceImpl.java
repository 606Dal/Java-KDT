package org.example.service;

import org.example.domain.DrinkMenu;
import org.example.domain.Menu;
import org.example.domain.PizzaMenu;
import org.example.domain.PizzaSize;

import java.util.ArrayList;
import java.util.List;

public class MenuServiceImpl implements MenuService {

	private List<Menu> menus;

	public MenuServiceImpl(List<Menu> menus) {
		this.menus = menus;
	}
/*
	public MenuServiceImpl() {

		// 이건 직접 생성한 경우
		menus = new ArrayList<>();
		menus.add(new PizzaMenu(1, "Super Pizza", 30000, PizzaSize.M));
		menus.add(new PizzaMenu(2, "Cheese Pizza", 30000, PizzaSize.M));
		menus.add(new PizzaMenu(3, "Pineapple Pizza", 30060, PizzaSize.M));
		menus.add(new PizzaMenu(4, "Sausage Pizza", 30500, PizzaSize.M));
		menus.add(new PizzaMenu(5, "Bacon Pizza", 30300, PizzaSize.M));

		menus.add(new DrinkMenu(6, "Cloa", 1000, true));
		menus.add(new DrinkMenu(7, "Americano", 1000, true));
	}

*/

	@Override
	public List<Menu> getMenus() {
		return this.menus;
	}
}
