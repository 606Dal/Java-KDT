package org.example.card;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Card {

	// 무늬, 숫자
	private CardPattern pattern;
	private int num;

}
