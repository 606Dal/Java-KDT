package org.example.ex2;

public enum WiseSayingService {

	INSTANCE;

	private String[] sentences;

	private WiseSayingService(){
		sentences = new String[5];
		sentences[0] = "성공은 최선을 다하는 사람에게 찾아온다. – 칼 로저스";
		sentences[1] = "작은 일들이 모여 위대한 결과를 만든다. – 빈센트 반 고흐";
		sentences[2] = "시간은 우리 편이다, 단 포기하지 않는다면. – 앤드류 카네기";
		sentences[3] = "남들이 당신을 평가하는 기준에 휘둘리지 마세요. 당신만의 길을 가세요. – 스티브 잡스";
		sentences[4] = "언제나 현재에 집중할 수 있다면 행복할 것이다. -파울로 코엘료";
	}

	public String getOne() {
		int idx = (int)(Math.random() * 5); // 0,1,2,3,4
		return sentences[idx];
	}

}
