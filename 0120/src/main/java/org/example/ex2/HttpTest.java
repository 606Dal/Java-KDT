package org.example.ex2;

import lombok.Cleanup;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
	브라우저에서 오는 정보 확인
 */
public class HttpTest {
	// bad code
	public static void main(String[] args) throws Exception {

		@Cleanup
		ServerSocket serverSocket = new ServerSocket(5555);
		System.out.println("Server Opened..........");

		for (int i = 0; i < 10; i++) {
			byte[] arr = new byte[100 * 8]; // 800

			@Cleanup Socket client = serverSocket.accept();
			@Cleanup InputStream in = client.getInputStream();
			@Cleanup OutputStream out = client.getOutputStream();

			// 브라우저 정보 읽음
			int count = in.read(arr); // (중요) 몇 개나 새로운 데이터가 채워졌는지

			String str = new String(arr, 0, count); // 바이트 배열을 문자열로
			System.out.println(str);
			System.out.println("--------------------------------");

			// HTTP 응답 작성 (자바의 텍스트 블록(Text Block) -> 문자열 여러줄 작성 가능.)
			/*
			String response = """
							HTTP/1.1 200 OK
							Content-Type: text/plain; charset=UTF-8
							Content-Length: 12
							
							Hello World
							""";
				// 헤더와 바디를 구분하기 위해 두 줄을 띄움.

			 */
			String response = """
							HTTP/1.1 200 OK
							Content-Type: text/html; charset=UTF-8
							
							""";

			// enum 클래스로 서비스를 따로 만듦.
			response += "<h1>" + WiseSayingService.INSTANCE.getOne() + "</h1>";

			// 브라우저로 보내면 거기에 띄워 줌.
			byte[] msgArr = response.getBytes();
			out.write(msgArr);

		} //end for

	}
}
