package org.example.vending;

import java.util.Scanner;

// 프롬프트 UI
public class VendingUI {
	// 메서드들이 계속 사용할 수 있게 공유
	private Scanner scanner;
	// 협력자/조력자
	//private  VendingMachine vendingMachine;


	public VendingUI() {
		this.scanner = new Scanner(System.in);
		//this.vendingMachine = new VendingMachine();
		// 생성자를 통한 의존성 주입(외부에서 만들어서 줌)
		//this.vendingMachine = vm;
	}


	public  void use() {

		outer:
		while (true) {
			System.out.println("1.아아 2.티 3.밀크커피 4.종료");
			String oper = this.scanner.nextLine();

			switch (oper) {
				case "1":
					System.out.println(VendingMachine.INSTANCE.makeIA());
					break;
				case "2":
					System.out.println(VendingMachine.INSTANCE.makeTea());
					break;
				case "3":
					System.out.println(VendingMachine.INSTANCE.makeMilkCoffee());
					break;
				case "4":
					System.out.println("프로그램을 종료 합니다.");
					break outer;
			} // end switch
		} // end while


	}

}
