package org.example.distancecost;

import org.example.ui.BasicUI;

import java.util.Scanner;

public class DistanceCostIfEles {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int totalCost = 0;
		int ktxBaseFare = 30000; // ktx 기본료
		int busBaseFare = 10000; // 고속버스 기본 요금 1만원
		int busTollFee = 40000;  // 고속버스 톨게이트 비용 4만원

		// 거리
		System.out.println("거리는 얼마인가요?");
		int distance = Integer.parseInt(scanner.nextLine());

		System.out.println("어떤 교통수단을 이용하십니까? 자동차 = 1, KTX = 2, 고속버스 = 3 번을 입력해주세요.");
		int transportation = Integer.parseInt(scanner.nextLine());

		// 자동차 : 1km당 130원.
		// KTX : 기본료 3만원 - 1km당 50원
		// 고속버스 : 기본료 1만원 + 톨게이트 비용 4만원 - 1km당 10원
		if (transportation == 1) {
			totalCost = distance * 130;
			System.out.println("자동차-> 총 비용은 " + totalCost + "입니다.");
		}else if (transportation == 2) {
			totalCost = ktxBaseFare + distance * 50;
			System.out.println("KTX-> 총 비용은 " + totalCost + "입니다.");
		} else if (transportation == 3) {
			totalCost = busBaseFare + busTollFee + distance * 10;
			System.out.println("고속버스-> 총 비용은 " + totalCost + "입니다.");
		}
	}

}
