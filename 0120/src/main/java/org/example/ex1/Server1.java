package org.example.ex1;

import lombok.Cleanup;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Server1 {

	//bad code 수업용이라서 짧게
	public static void main(String[] args) throws Exception {

		// 서버는 ip 지정은 안 하고 포트 번호 - 아파트의 동호수 같은? 5555번으로 가게 열기
		@Cleanup // 닫아줘야 하는 애들.
		ServerSocket serverSocket = new ServerSocket(5555);

		System.out.println("Server Opened...."); // 이것만 하면 문 열었다 끝남.

		// 서버를 계속 켜놓기 위해 임시로 for문 사용.
		for (int i = 0; i < 100; i++) {
			// 스캐너는 입력 받을 때 까지 멈춤. 이런 것처럼 손님 왔을 때 잠시 멈추게 함.
			@Cleanup
			Socket clientSocket = serverSocket.accept(); // 여기가 블로킹

			System.out.println(clientSocket); // 누가 5555로 들어오면 실행 됨.
				// Socket[addr=/0:0:0:0:0:0:0:1,port=8503,localport=5555]

			/*
			@Cleanup
			OutputStream outputStream = clientSocket.getOutputStream();

			// adcii code (소문자 a 97) 로 보내려면 어려움.
			outputStream.write(97); // 서버가 연결되면 97을 보냄. 1바이트

			 */
			/*
			// 클라이언트에서 보낸 거 읽기.
			@Cleanup
			InputStream inputStream = clientSocket.getInputStream();
			Scanner inScanner = new Scanner(inputStream);

			String line = inScanner.nextLine(); // \n이 있을 때까지 읽어옴.
			System.out.println(line);

			 */
			// 클라이언트로부터 ArrayList 수신
			@Cleanup
			ObjectInputStream inputStream = new ObjectInputStream(clientSocket.getInputStream());

			ArrayList<String> receivedMessages = (ArrayList<String>) inputStream.readObject();  // ArrayList 역직렬화

			System.out.println("=========명언 출력==========");
			System.out.println(receivedMessages.get(0));

		} // end for

	} // end main
}
