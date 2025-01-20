package org.example;

import lombok.Cleanup;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class KeyCopy {

	//bad code
	public static void main(String[] args) throws Exception {

		InputStream in = System.in;

		@Cleanup
		OutputStream fos = new FileOutputStream("C:\\zzz\\input.txt");
		/*
		  앞에 공백이 들어가는 건 utf-8이라서 그런 거라고 함. 난 공백은 없음.
		  영어로 적었을 경우는 여러번 입력 해야 끝남. (줄바꿈도 O)
		  엔터키 입력하면 뭐가 추가로 들어감. -> Scanner 문제
		 */

		System.out.println("한글을 입력해 보세요"); // 10 13 엔터키
		for (int i = 0; i < 10; i++) {

			int data = in.read(); // 1바이트 내용물 나옴.

			System.out.println(data);

			if(data == 10){ // 10으로 해놓으면 한 번 입력 받는 걸로 끝남.
				break;
			}

			fos.write(data);
		}

	}
}
