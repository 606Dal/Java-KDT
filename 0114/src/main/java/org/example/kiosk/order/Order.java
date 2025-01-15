package org.example.kiosk.order;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@ToString
@Setter
public class Order {

	private int ono; // 주문 번호
	private ArrayList<OrderItem> orderItemList; // 주문 메뉴 목록

	// 생성자
	public Order() {
		orderItemList = new ArrayList<>();
	}

	// 새로운 OrderItem 추가
	public void addOrderItem(OrderItem newItem) {
		orderItemList.add(newItem); // 주문 목록에 메뉴 목록을 추가
	}

}
