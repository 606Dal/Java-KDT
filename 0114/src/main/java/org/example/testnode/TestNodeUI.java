package org.example.testnode;

import java.util.Scanner;

public class TestNodeUI {

	public void startGame() {
		Scanner scanner = new Scanner(System.in);
		TestNode currentNode = TestNodeService.INSTANCE.createTestNode(); // q1부터 시작.

		System.out.println("대답은 y / n 으로 해주세요.");
		while (currentNode != null) {
			// 현재 노드의 질문이 비었으면 결과 출력.
			if (currentNode.getQuestion() == null) {
				System.out.println("결과: " + currentNode.getResult());
				break;
			}

			System.out.println(currentNode.getQuestion()); // 질문 출력
			String answer = scanner.nextLine();

			currentNode = TestNodeService.INSTANCE.getNextNode(currentNode, answer);

			/*
			System.out.println("currentNode: " + currentNode);
			TestNode 의 @ToString 때문에 많은 객체들이 다 출력 됨.
			  -> @ToString(exclude = {"yesNode", "noNode"}) 로 두개는 제외하고 출력.
			 */

		} // end while

	}

}
