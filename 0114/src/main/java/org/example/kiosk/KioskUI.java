package org.example.kiosk;

import org.example.kiosk.menu.Menu;
import org.example.kiosk.menu.MenuService;
import org.example.kiosk.order.Order;
import org.example.kiosk.order.OrderItem;
import org.example.kiosk.order.OrderService;

import java.util.ArrayList;
import java.util.Scanner;

public class KioskUI {

	// 아래에 있는 메서드 3개를 한 번에 가져옴
	public void startOrder() {
		while (true) {
			this.greeting();
			this.makeOrder();
			this.thanks();
		}
	}

	// 인사
	private void greeting() {
		System.out.println("안녕하세요!");
	}

	private void makeOrder() {

		Scanner scanner = new Scanner(System.in);

		Order order = new Order();

		while(true) {
			ArrayList<Menu> menus = MenuService.INSTANCE.getList(); // 메뉴 목록 가져옴.

			System.out.println("============메뉴 판============");
			menus.forEach(m -> System.out.println(m)); // 메뉴 목록 보여줌
			System.out.println("==============================");

			System.out.println("메뉴 번호를 입력하세요.");
			int num = Integer.parseInt(scanner.nextLine());

			System.out.println("수량을 입력하세요.");
			int qty = Integer.parseInt(scanner.nextLine());

			// 주문 목록 생성
			OrderItem orderItem = OrderItem.builder().menuNo(num).qty(qty).build();

			order.addOrderItem(orderItem);

			System.out.println("주문을 계속 하시겠습니까? y/n");
			String oper = scanner.nextLine();

			if(oper.equals("n")){
				break;
			}

		} // while 끝
		//주문 끝
		int num = OrderService.ISTANCE.addOrder(order);

		System.out.println("주문 번호 " + num);

	} // end makeOrder()

	private void thanks() {
		System.out.println("안녕히가세요, 행복하세요~");
	}

}
