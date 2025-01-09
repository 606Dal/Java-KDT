package org.example.yesnogame;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Question {
// yes or no 테스트
	private String text;
	private int yesIndex;
	private int noIndex;

	public Question(String text) {
		this.text = text;
	}

	public Question(String text, int yesIndex, int noIndex) {
		this.text = text;
		this.yesIndex = yesIndex;
		this.noIndex = noIndex;
	}
}
