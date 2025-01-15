package org.example.card;

import java.util.ArrayList;
import java.util.Collections;

// 카드를 여러개 가짐
public enum CardDeck {

	INSTANCE;

	private ArrayList<Card> cards;

	private CardDeck() {
		this.cards = new ArrayList<>();

		for (CardPattern pattern : CardPattern.values()) {
			for (int i = 1; i <= 12; i++) {  // 1부터 12까지 카드 번호
				cards.add(new Card(pattern, i));  // 각 패턴에 대해 카드 추가
			}
		}

		Collections.shuffle(cards); // 카드 뽑기 전 미리 섞음.
	}

	// 임의의 카드 뽑기
	public Card getOne() {
		Card card = cards.remove(0); // 위에서 한 장 뺌
		return card;
	}


}
