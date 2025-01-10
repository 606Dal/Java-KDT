package org.example.word;

import java.util.ArrayList;

public class WordService {

	// 3. 유지해야할 데이터 => 인스턴스 변수
	private ArrayList<WordVO> wordList;

	// 2. 기능을 쓸 때 필요한 (생성자)
	public  WordService(){
		wordList = new ArrayList<>();
		wordList.add(new WordVO("사과", "apple"));
		wordList.add(new WordVO("바나나", "banana"));
		wordList.add(new WordVO("강아지", "dog"));
	}

	// 1. 다음 단어를 뽑아서 전달하는 기능
	public WordVO getNextWord() {
		WordVO word = null;

		word = wordList.remove(0);

		return word;
	}

}
