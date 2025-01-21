package org.example.ex4;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum LottoService {

	INSTANCE;

	private ArrayList<String> lottoball;

	private LottoService(){
		lottoball = new ArrayList<>();

		for (int i = 1; i <= 45; i++) {
			lottoball.add(String.valueOf(i));
		}

	}

	public List<String> Balls() {
		Collections.shuffle(lottoball);  // 리스트를 섞기

		// 처음 6개 항목만 추출하여 반환
		return lottoball.subList(0, 6);
	}

}
