package org.example.kiosk;

import lombok.extern.log4j.Log4j2;
import org.example.kiosk.menu.Menu;
import org.example.kiosk.menu.MenuService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

// 여기 있는 걸 실행하면 테스트 모두 실행
@Log4j2
public class SampleTests {
	/*
		void , 반환값이 없음.
	 */

	@Test
	public void test1() {

		ArrayList<Menu> menuArrayList = MenuService.INSTANCE.getList();
		menuArrayList.forEach(m -> log.info(m));

/*
		// ArrayList의 for문 출력 - 람다식
		// 각각의 메뉴에 대해서 이런 함수를 실행하라는 것. ( f(x) => y )
		menuArrayList.forEach(menu -> System.out.println(menu));

		// 메뉴가 4개 나와야 정상
		Assertions.assertEquals(4, menuArrayList.size());

 */


//		int a = 10;
//		int b = 20;
//
//		// 비교 - 확실하게 이런 값인지 확인할 때 사용.
//		Assertions.assertEquals( a + b, 130);

	}

	@Test
	public void test2() {

	}
}
