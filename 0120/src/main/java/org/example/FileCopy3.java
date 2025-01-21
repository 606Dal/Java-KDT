package org.example;

import lombok.Cleanup;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy3 {
	// bad code
	public static void main(String[] args) throws Exception {

		@Cleanup
		InputStream fin = new FileInputStream("C:\\zzz\\test.txt");
		// 제일 중요. 데이터를 임시로 보관하는 공간을 Buffer라고 부름
		//byte[] buffer = new  byte[5];
		byte[] buffer = new  byte[1024 * 8]; // kbyte 단위로 읽어옴.

		@Cleanup
		OutputStream fos = new FileOutputStream("copy.txt"); // 이번엔 프로젝트 내부에 생성

		while (true){
			// 하나씩 읽어오는 대신 한번에 5개를 읽어옴.
			int count = fin.read(buffer); // 계란판을 이용한 읽기.

			// 더이상 읽어올 데이터가 없을 때.
			if(count == -1){
				break;
			}

			fos.write(buffer,0, count); // 맨 처음부터, 새롭게 채워진 숫자만큼만.

		} // end while

	}
}
