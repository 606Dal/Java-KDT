package org.example.ex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class HttpFTServer {
	// bad code
	public static void main(String[] args) throws Exception {

		ServerSocket serverSocket = new ServerSocket(5555);
		System.out.println("FTserver run.................");

		// 파일 데이터를 읽어서 OutputStream - write() 사용. byte[] 이용하면 1000배 빨라짐.
		byte[] buffer = new byte[1024*8];  // 8kb

		while (true){

			// 브라우저와 연결해서 socket을 생성 - accept()
			Socket socket = serverSocket.accept();

			// 영상 연결이 약간 이상해서 생긴 코드
			InputStream in = socket.getInputStream();
			Scanner scanner = new Scanner(in);

			String first = scanner.nextLine();

			if(!first.startsWith("GET /ring")){
				scanner.close();
				socket.close();

				continue;
			}

			// 보내기 - OutputStream 생성
			OutputStream outputStream = socket.getOutputStream();

			// 파일을 읽어서 보내야 하니까 InputStream 준비.
			//InputStream inputStream = new FileInputStream("C:\\zzz\\1.jpg");
			File target = new File("C:\\zzz\\RING.mp4");
			InputStream inputStream = new FileInputStream(target);

			// HTTP에 맞는 image/jpeg 헤더 메시지를 OutputStream에 기록
			outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
			//outputStream.write("Content-Type: image/jpeg;\r\n".getBytes());
			outputStream.write("Content-Type: video/mp4;\r\n".getBytes());
			outputStream.write("Content-Length: 23710005\r\n".getBytes());
			outputStream.write("\r\n".getBytes()); // 공백문자 - 줄바꿈 용

			while (true){
				// try catch 만든 이후 영상 재생 가능해 짐.
				try {
					int count = inputStream.read(buffer); // 내용물은 버퍼에 있고,
					if(count == -1){
						break;
					}
					outputStream.write(buffer,0,count);
				} catch (Exception e){
					System.out.println("Exception");
					break;
				}

			} //end while
			outputStream.close();
			socket.close();
		}//end while
	}
}
