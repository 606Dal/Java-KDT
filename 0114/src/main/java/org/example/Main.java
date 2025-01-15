package org.example;

import org.example.card.Card;
import org.example.card.CardDeck;
import org.example.kiosk.KioskUI;
import org.example.lots.LotsUI;
import org.example.vending.Scores;
import org.example.vending.VM2;
import org.example.vending.VendingMachine;
import org.example.vending.VendingUI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {

		//System.out.println(VM2.INSTANCE.hello());

		// 아메리카노 개수를 더 많이
//		VendingMachine vm = new VendingMachine(20,5,5);
//		VendingUI ui = new VendingUI(vm);
//
//		ui.use();

//		VendingUI ui = new VendingUI();
/*
		ArrayList<String> list = new ArrayList<>();
		list.add("꽝");
		list.add("꽝");
		list.add("당첨");

		Collections.shuffle(list);

		System.out.println(list);

		System.out.println(list.remove(0));
		System.out.println(list);

		System.out.println(list.remove(0));
		System.out.println(list);

		System.out.println(list.remove(0));
		System.out.println(list);
 */
		//LotsUI ui = new LotsUI();
		//ui.startGame();
/*
		Scanner scanner = new Scanner(System.in);
		// 유저랑 컴이 카드 뽑음
		while (true) {
			System.out.println("카드를 받고 싶은 만큼 Enter, Stop은 s");
			String input = scanner.nextLine();

			// 멈추고 싶으면
			if(input.equalsIgnoreCase("s")) {
				break;
			}

			Card userCard = CardDeck.INSTANCE.getOne();
			System.out.println("유저 카드: " + userCard);
			System.out.println();
		}

		Card comCard = CardDeck.INSTANCE.getOne();

		System.out.println("컴 카드: " + comCard);

 */
// 01/15 수업
		/*
		// new 없이 사용 가능. 과목별로 원하는 만큼  사용할 수 있음.
		Scores scores = Scores.builder()
				.kor(55)
				.eng(44)
				.build();
		 */

		KioskUI ui = new KioskUI();
		ui.startOrder();

	}
}