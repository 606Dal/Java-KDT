package org.example.vending;

// 서비스 로직 - 자판기 (클래스에서 -> enum으로 변경)
public enum VendingMachine {

	// 일단 하나만
	INSTANCE; // 보통 이 이름으로 사용

	private int iaCount;
	private int teaCount;
	private int milkCount;

	// 생성자 (자판기마다 상태가 다름)
	private VendingMachine() {
		this.iaCount = 10;
		this.teaCount = 5;
		this.milkCount = 7;
		//this(10, 5, 7);
		// 생성자 함수 -> 아래에 있는 걸 호출하게 됨.
	}

	private VendingMachine(int iaCount, int teaCount, int milkCount) {
		this.iaCount = iaCount;
		this.teaCount = teaCount;
		this.milkCount = milkCount;
	}

	// 음료들
	public String makeIA() {
								// 뽑으면 줄어듦
		return "Ice Americano: " + this.iaCount--;
	}

	public String makeTea() {

		return "Green Tea: " + this.teaCount--;
	}

	public String makeMilkCoffee() {
		return "Milk Coffee: " + this.milkCount--;
	}

}
