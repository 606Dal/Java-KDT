package org.example.kiosk;

import lombok.extern.log4j.Log4j2;
import org.example.kiosk.order.Order;
import org.example.kiosk.order.OrderItem;
import org.example.kiosk.order.OrderService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Log4j2
public class OrderServiceTests {

//	@Disabled // 테스트 안 하는 것
	@Test
	public void testAddOrder() {

		Order order = new Order();

		// 메뉴 번호와 수량
		OrderItem item1 = OrderItem.builder().menuNo(1).qty(1).build();
		OrderItem item2 = OrderItem.builder().menuNo(2).qty(3).build();

		order.addOrderItem(item1);
		order.addOrderItem(item2);

		int orderNum = OrderService.ISTANCE.addOrder(order);

		log.info("주문 번호: " + orderNum);

	}

}
