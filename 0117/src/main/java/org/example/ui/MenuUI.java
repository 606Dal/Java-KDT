package org.example.ui;

import org.example.service.MenuService;

import java.util.Scanner;

public class MenuUI extends BasicUI{

	private MenuService service;

	public MenuUI(Scanner scanner, MenuService service) {
		super(scanner);
		this.service = service;
	}

	// 부모 생성자
	public MenuUI(Scanner scanner) {
		super(scanner);
	}
	// 구현
	@Override
	public void execute() {

		System.out.println("지금부터 메뉴를 보여드리겠습니다.");

		service.getMenus().forEach(menu -> {

			System.out.println(menu.getMno());
			System.out.println(menu.getName());
			System.out.println(menu.getPrice());

		});

	}
}
