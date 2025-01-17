package org.example.distancecost;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DistanceCostMain {
	public static void main(String[] args) {

		Map<Integer, DistanceCost> map = new HashMap<>();
		map.put(1, new Car());
		map.put(2, new KTX());
		map.put(3, new Bus());

		Scanner scanner = new Scanner(System.in);

		System.out.println("거리를 입력하세요. ( :km)");
		int distance = Integer.parseInt(scanner.nextLine());

		System.out.println("어떤 교통수단을 이용하십니까? 자동차 = 1, KTX = 2, 고속버스 = 3 번을 입력해주세요.");
		int transportationNum = Integer.parseInt(scanner.nextLine());

		DistanceCost transportation = map.get(transportationNum);

		int totalCost = transportation.cost(distance);
		System.out.println("선택한 교통수단의 총 비용은 " + totalCost + "원 입니다.");



	}
}
