package org.example.ex1;

import lombok.Cleanup;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client1 {

	//bad code
	public static void main(String[] args) throws Exception {

		// 실행되면 서버 연결
		@Cleanup Socket socket = new Socket("127.0.0.1", 5555);

		System.out.println(socket);

		// 서버에서 보낸 걸 읽음.
		@Cleanup
		InputStream inputStream = socket.getInputStream();
/*
		// 지금은 1바이트 보내는 걸 알고 있지만 -> 모르는 상태에선 문제가 생김. 그때를 대비한 게 프로토콜 약속.
		int data = inputStream.read();
		System.out.println(data);
*/
		@Cleanup OutputStream outputStream = socket.getOutputStream(); // 보내는 코드

		String msg = "삶의 진정한 가치는 어떻게 살았는가에 달려 있다.\n";

		byte[] arr = msg.getBytes();

		outputStream.write(arr);
	}
}
