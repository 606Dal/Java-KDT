package org.example.kiosk.order;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;

// OrderService = 주문 받는 사람(이라고 보는 게 편함)
// Order에 대한 CRUD를 처리.
@Log4j2
public enum OrderService {
	// 몇 개나 미리 만들것인가?
	ISTANCE;

	// 주문 데이터를 보관해야 함.
	private ArrayList<Order> orders;

	private int idx;

	private OrderService() {
		orders = new ArrayList<>();
	}

	// 주문 받음 (추가함)
	public int addOrder(Order order) {

		log.info(order);
		log.info("현재 idx: " + idx);

		idx++;

		order.setOno(idx); // 주문하면 주문 번호가 생김.

		orders.add(order); // 주문을 추가함.
		//return orderItemList.size(); // 로 새로운 주문 때 주문 번호를 알 수 있음.
		return idx;
	}

}
