package org.example.ex3;

import lombok.Cleanup;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class FTClient {
	// bad code
	public static void main(String[] args) throws Exception {

		// 소켓 연결
		@Cleanup Socket socket = new Socket("127.0.0.1", 5555);

		// 이미지 데이터가 온다는 걸 알고 있는 상태
		@Cleanup InputStream in = socket.getInputStream();

		// 파일 확인.
		@Cleanup FileOutputStream fos = new FileOutputStream("today.jpg");

		// 출력 전에 데이터가 오는지 확인
		byte[] buffer = new byte[1024]; // 한 번에 1kbyte씩 읽음.

		System.out.println("전송된 데이터 읽기 시작");

		while (true){
			int count = in.read(buffer);
			System.out.println("count: " + count); // 1024로 안 나올 수도 있음. 지금은 내 컴퓨터로만 하고 있어서.
			if(count == -1) { break; }

			fos.write(buffer,0,count); // 파일 다운?

		} // end while


	}
}
