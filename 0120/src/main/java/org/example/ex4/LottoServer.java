package org.example.ex4;

import lombok.Cleanup;
import org.example.ex2.WiseSayingService;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class LottoServer {

	public static void main(String[] args) throws Exception {

		@Cleanup
		ServerSocket serverSocket = new ServerSocket(5555);
		System.out.println("LottoServer Opened..........");

		byte[] arr = new byte[1024 * 8];

		for (int i = 0; i < 10; i++) {

			@Cleanup Socket client = serverSocket.accept();
			@Cleanup InputStream in = client.getInputStream();
			@Cleanup OutputStream out = client.getOutputStream();

			// 헤더
			out.write("HTTP/1.1 200 OK\r\n".getBytes());
			out.write("Content-Type: text/html;\r\n".getBytes());
			out.write("\r\n".getBytes()); // 공백문자 - 줄바꿈 용
			// 제목
			out.write("<h1>Lotto Numbers</h1>\n".getBytes());

			// 본문. 로또번호 출력
			out.write("<ul>\n".getBytes());
			for (String ball : LottoService.INSTANCE.Balls()) {
				out.write(("<li>" + ball + "</li>\n").getBytes());
			}
			out.write("</ul>\n".getBytes());


		} //end for
	}
}
