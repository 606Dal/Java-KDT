package org.example.ex3;


import lombok.Cleanup;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FTServer {
	// bad code
	public static void main(String[] args) throws Exception {

		@Cleanup
		ServerSocket serverSocket = new ServerSocket(5555);
		System.out.println("FTServer Ready....");

		int num = (int)(Math.random() * 4) + 1; // 1~4
		// 여기 파일명의 숫자를 1234 랜덤으로 들어오게 함.
		String filName = "C:\\zzz\\"+num+".jpg";

		byte[] buffer = new byte[1024*8];

		while (true){
			System.out.println("===========while 실행 확인================");

			@Cleanup Socket socket = serverSocket.accept();
			@Cleanup OutputStream outputStream = socket.getOutputStream();
			// 파일데이터 읽기
			@Cleanup InputStream fin = new FileInputStream(filName);

			while (true){

				int count = fin.read(buffer);

				if(count == -1) { break; }

				outputStream.write(buffer,0,count);

			} //end while

			System.out.println("============================");
		} //end while
	}
}
