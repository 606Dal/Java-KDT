package org.example.lots;

import java.util.ArrayList;
import java.util.Collections;

// 하나만 만들면 될 것 같아서 enum으로 - 의존성 귀찮은 걸
public enum LotsBox {

	INSTANCE;

	private ArrayList<String> notes;

	private LotsBox() {
		notes = new ArrayList<>();
		notes.add("꽝");
		notes.add("꽝");
		notes.add("꽝");
		notes.add("꽝");
		notes.add("당첨");

		Collections.shuffle(notes);
	}

	public String getNext() {
		// 하나 뽑을때마다 삭제
		String result = notes.remove(0);

		return result;
	}

}
