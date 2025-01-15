package org.example.testnode;

// 서비스 부분
public enum TestNodeService {

	INSTANCE;

	public TestNode createTestNode() {

		// 질문을 노드로 생성
		TestNode q1 = TestNode.builder().question("카페나 새로운 공간에 가면 인테리어를 유심히 보는 편이다?").build();
		TestNode q2 = TestNode.builder().question("친구들과 엠티 간 것 같은 분위기를 즐기고 싶다?").build();
		TestNode q3 = TestNode.builder().question("영화, 드라마 등 영상콘텐츠 보는 것을 좋아한다?").build();
		TestNode q4 = TestNode.builder().question("모임을 위해 공간을 빌리는 비용이 조금 부담이 된다?").build();
		TestNode q5 = TestNode.builder().question("SNS에 예쁜 공간에서 찍은 사진 올리기를 좋아하고 즐긴다?").build();
		TestNode q6 = TestNode.builder().question("보드게임, 오락기, 노래방 시설, 재미있는 게임 등을 하며 시간을 보내는 것이 좋다?").build();
		TestNode q7 = TestNode.builder().question("친구들과 영화나 드라마 정주행하는 것을 즐기거나 해보고 싶다?").build();
		TestNode q8 = TestNode.builder().question("친구들과 무엇을 하기 보다는 맛있는 음식 먹고 이야기 하는 게 좋다?").build();
		TestNode q9 = TestNode.builder().question("파티룸 대관 시 일단 멋지고 예쁜 인테리어는 기본이다?").build();
		TestNode q10 = TestNode.builder().question("파티룸 대관 시 무리가 모두 즐길 수 있는 게임이나 시설이 구비되어 있는 것이 중요하다?").build();
		TestNode q11 = TestNode.builder().question("파티룸 대관 시 다른 오락시설보다 빔 프로젝터 구비 여부가 중요하다?").build();
		TestNode q12 = TestNode.builder().question("파티룸 대관 시 예산에 맞는 가격대의 공간을 찾는 것이 제일 중요하다?").build();
		// 결과 부분
		TestNode resultA = TestNode.builder().result("A유형 - 감각적인 인테리어가 돋보이는 포토제닉 공간").build();
		TestNode resultB = TestNode.builder().result("B유형 - 다양한 오락시설이 구비된 놀기 좋은 공간").build();
		TestNode resultC = TestNode.builder().result("C유형 - 영상 시청에 최적화된 빔 프로젝터가 구비된 공간").build();
		TestNode resultD = TestNode.builder().result("D유형 - 합리적인 가격에 이용이 가능한 가성비 좋은 실속형 모임 공간").build();

		q1.setYesNode(q5);
		q1.setNoNode(q2);

		q2.setYesNode(q6);
		q2.setNoNode(q3);

		q3.setYesNode(q7);
		q3.setNoNode(q4);

		q4.setYesNode(q8);
		q4.setNoNode(q6);

		q5.setYesNode(q9);
		q5.setNoNode(q2);

		q6.setYesNode(q10);
		q6.setNoNode(q7);

		q7.setYesNode(q11);
		q7.setNoNode(q8);

		q8.setYesNode(q12);
		q8.setNoNode(q10);

		q9.setYesNode(resultA);
		q9.setNoNode(q6);

		q10.setYesNode(resultB);
		q10.setNoNode(q11);

		q11.setYesNode(resultC);
		q11.setNoNode(resultD);

		q12.setYesNode(resultD);
		q12.setNoNode(q11);

		return q1;
	} // end createTestNode()

	// ui에서 답을 받아오면 (y/n) 이동
	public TestNode getNextNode(TestNode currentNode, String answer) {
		if (answer.equalsIgnoreCase("y") && currentNode.getYesNode() != null) {
			return currentNode.getYesNode();
		} else if (answer.equalsIgnoreCase("n") && currentNode.getNoNode() != null) {
			return currentNode.getNoNode();
		}
		return currentNode;
	}
}
