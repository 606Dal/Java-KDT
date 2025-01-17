package org.example;

import org.example.ex.Ex1;
import org.example.menu.*;
import org.example.store.BasicRes;
import org.example.store.BusanRes;
import org.example.store.DaeguRes;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) throws Exception {

		List<LottoBall> ballList = new ArrayList<>();

		for (int i = 1; i <= 45 ; i++) {
			ballList.add(new LottoBall(i));
		}

		Collections.shuffle(ballList);
		List<LottoBall> result = ballList.subList(0, 6); // 자르기

		System.out.println(result);

		// 함수 형태의 인터페이스를 사용하고 싶을 때 람다식을 씀.
		result.sort( (b1, b2) -> b1.getNum() - b2.getNum() );

		System.out.println(result);


//		Ex1 obj1 = new Ex1();
//		//obj1.
//		Ex1 obj2 = new Ex1();

/*
		HashMap<String , MenuService> map = new HashMap<>();

		map.put("mega", new MegaMenuService());
		map.put("compose", new ComposeMenuService());

		MenuService menuService = map.get("mega");
		menuService.getMenuList();

 */
		/*
		String url = "https://www.mega-mgccoffee.com/menu/menu.php?menu_category1=1&menu_category2=1&category=&list_checkbox_all=all";
		Document doc = Jsoup.connect(url).get();

		//System.out.println(doc);

		Element element = doc.selectFirst("#menu_list");
		//System.out.println(element);

		// text1 밑의 b
		Elements names = element.select(".text1 b");
		//System.out.println(names);

		List<String> nameList = names.eachText();
		System.out.println(nameList);

		 */

		/*
		Document doc = Jsoup.connect("https://composecoffee.com/menu?amp%3Bcategory=185").get();

		// System.out.println(doc);

		// 인터넷 페이지에서 id로 그 부분 찾기.
		Element element = doc.selectFirst("#masonry-container");
		// System.out.println(element);

		// 상품 이름 <h4>태그로 가져오기.
		Elements names = element.select("h4");
		//System.out.println(names);

		// 메뉴 이름만 출력.
		List<String> nameList = names.eachText();
		System.out.println(nameList);

		 */



		/*
		  추상 클래스는 객체 생성 불가.
		  물려주거나 타입으로는 유용.
		 */
//		Menu m1 = new Menu(); // 에러O
//		Menu[] m = new Menu[10]; // 배열은 에러 안 남.
//		Menu m2 = new Coffee(); // 가능



//		BasicRes r1 = new DaeguRes();
//		r1.makeZazang();
/*
		ArrayList<BasicRes> resList = new ArrayList<>();

		resList.add(new BasicRes());
		resList.add(new BusanRes());
		resList.add(new DaeguRes());

		resList.forEach(r -> {
			r.makeZazang();
		});

 */
/*
		HashMap<String, BasicRes> resHashMap = new HashMap<>();

		resHashMap.put("서울", new BasicRes());
		resHashMap.put("부산", new BusanRes());
		resHashMap.put("대구", new DaeguRes());


		// 여기서 부터만 보면 어떤 짜장이 나올지 모름.
		Scanner scanner = new Scanner(System.in);

		System.out.println("도시를 입력하세요.");
		String city = scanner.nextLine();

		BasicRes target = resHashMap.get(city); // 여기 값만 바꿔주면 내용물을 가져올 수 있음.

		target.makeZazang();

 */

		// 키를 통해 가져오기
//		String engWord = resHashMap.get("사과");
//		System.out.println(engWord);

	}
}