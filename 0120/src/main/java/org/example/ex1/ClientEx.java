package org.example.ex1;

import lombok.Cleanup;

import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientEx {
	public static void main(String[] args) throws Exception {

		// 서버 연결
		@Cleanup Socket socket = new Socket("127.0.0.1", 5555);
		System.out.println("서버에 연결. " + socket);

		@Cleanup
		InputStream inputStream = socket.getInputStream();

		@Cleanup
		//OutputStream outputStream = socket.getOutputStream();
		ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());

		// 명언 모음
		List<String> lifeQuotesList = new ArrayList<>();
		lifeQuotesList.add("언제나 현재에 집중할 수 있다면 행복할 것이다. -파울로 코엘료");
		lifeQuotesList.add("행복의 문이 하나 닫히면 다른 문이 열린다. 그러나 우리는 종종 닫힌 문을 멍하니 바라보다가 우리를 향해 열린 문을 보지 못하게 된다. –헬렌켈러");
		lifeQuotesList.add("네 믿음은 네 생각이 된다. 네 생각은 네 말이 된다. 네 말은 네 행동이 된다. 네 행동은 네 습관이 된다. 네 습관은 네 가치가 된다. 네 가치는 네 운명이 된다. –간디");
		lifeQuotesList.add("물러나서 조용하게 구하면 배울 수 있는 스승은 많다. 사람은 가는 곳마다 보는 것마다 모두 스승으로서 배울 것이 많은 법이다. -맹자");
		lifeQuotesList.add("진짜 문제는 사람들의 마음이다. 그것은 절대로 물리학이나 윤리학의 문제가 아니다. -아인슈타인");
		lifeQuotesList.add("당신이 할 수 있다고 믿든 할 수 없다고 믿든 믿는 대로 될 것이다. -헨리 포드");
		lifeQuotesList.add("되찾을 수 없는 게 세월이니 시시한 일에 시간을 낭비하지 말고 순간순간을 후회 없이 잘 살아야 한다. -루소");

		Collections.shuffle(lifeQuotesList);

		outputStream.writeObject(lifeQuotesList);  // ArrayList 직렬화하여 전송
	}
}
