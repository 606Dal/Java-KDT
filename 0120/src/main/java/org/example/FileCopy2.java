package org.example;

import lombok.Cleanup;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy2 {

	// try ~ catch ~finally
	public static void main(String[] args) throws Exception {

		@Cleanup // 자동으로 try chatch 구문 만들어 줌
		InputStream fin = new FileInputStream("C:\\zzz\\copy.jpg");

		@Cleanup // 자동으로 try chatch 구문 만들어 줌
		OutputStream out = new FileOutputStream("C:\\zzz\\copy2.jpg");

		while (true){

			// read()는 함수형 데이터. 뭔가 잘못되면 -1 반환.
			int data = fin.read();

			System.out.println(data);

			if(data == -1){ // 더이상 읽어야 하는 데이터가 없는 경우.
				break;
			}

			out.write(data);
		} // end while

/*
		// 옛날 방식
		try{
			InputStream in = new FileInputStream("경로");
			// 변수 선언을 try 밖에 해야 함.

		}catch (Exception e){

		}finally {
			try {
//				in.close; // 여기서 못함;
			} catch (Exception e) {}
		}

 */
		/* 이후 방식 이것보다 편한 방식도 있음.
		// try with resource = auto close
		try(InputStream in = new FileInputStream("경로")){

		}catch (Exception e) {

		}

*/




	}
}
