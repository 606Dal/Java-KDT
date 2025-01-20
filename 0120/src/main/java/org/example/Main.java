package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	// bad code
	public static void main(String[] args) throws Exception {

		// 마우스 우클릭 이미지 막아놓은 거 가져옴.
		String path = "https://image9.coupangcdn.com/image/vendor_inventory/b180/95521b3f022c6c203ce7a887cbb86545bb02c3143438d48fb7cb5d632c6f.jpg";
		URL url = new URL(path);
		InputStream in = url.openStream();

		// new Scanner(System.in);
		//InputStream in = System.in;

		// InputStream의 하위 클래스(아래 예시 : FileInputStream)면 다 사용 가능.
		// 파일 데이터 읽기 (예외 나옴)
//		InputStream in = new FileInputStream("C:\\zzz\\aaa.jpg");

		//in이랑 read는 쌍으로 봄.

		// FileOutputStream 만약 파일이 존재하지 않으면 자동으로 파일을 생성해 줌.
		OutputStream out = new FileOutputStream("C:\\zzz\\copy.jpg");
		//OutputStream out = new FileOutputStream("C:\\zzz\\copy.mp4");

		while (true){

			// read()는 함수형 데이터. 뭔가 잘못되면 -1 반환.
			int data = in.read();

			System.out.println(data);

			if(data == -1){ // 더 이상 읽어야 하는 데이터가 없는 경우.
				break;
			}

			out.write(data);
		} // end while

		// 모든 빨대는 사용 후에 닫음. close. 종종 까먹기도 해서 롬복 사용 방법도 있음.
		in.close();
		out.close();
	}
}