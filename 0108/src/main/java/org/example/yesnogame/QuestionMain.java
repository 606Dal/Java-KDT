package org.example.yesnogame;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 배열 0~14 (총 15)
		ArrayList<Question> questions = new ArrayList<>();

		// 각 배열에 글자 저장
		questions.add(new Question("0. 일을 하기는 하는데 뭘 하고 있는지 잘 모르겠다.", 1, 3));
		questions.add(new Question("1. 일과 관련한 기록을 어떤 방식으로든 하고 있다.", 2, 5));
		questions.add(new Question("2. 주변에 일 고민을 나눌 수 있는 사수나 동료가 없다.", 4,8));
		questions.add(new Question("3. 지나온 커리어가 나에게 어떤 의미인지 잘 알고 있다.", 6, 4));
		questions.add(new Question("4. 지금 나에게 가장 필요한 건 일에 대한 피드백이다.", 8, 7));
		questions.add(new Question("5. 일에서 실수가 잦은 게 고민이다.", 8, 7));
		questions.add(new Question("6. 나의 커리어패스나 경험을 눈에 보이는 방식으로 한번 정리하고 싶다.", 9, 7));
		questions.add(new Question("7. 사이드 프로젝트에 대한 생각이 있다.", 15, 10));
		questions.add(new Question("8. 분명히 했던 일인데 또 하려면 어떻게 했는지 기억이 잘 나지 않는다.", 11, 9));
		questions.add(new Question("9. 내 강점을 잘 설명하고 싶다.", 12, 10));
		questions.add(new Question("10. 긴 글을 쓰고 싶다는 마음이 늘 있다.", 13, 11));
		questions.add(new Question("11. 내가 일에서 뭘 원하는지, 뭘 하고 싶은지 알고 싶다.", 14, 15));
		// 결과
		questions.add(new Question("A. 내가 어떻게 일하는지, 내 강점은 무엇인지 스스로 이미 너무 잘 알고 있어요.", 0, 0));
		questions.add(new Question("B. 일에 대해 뭔가 하고 싶은 이야기는 있는데, 그게 어떤 방식으로 쓰일 수 있을지 감이 잡히지 않죠.", 0, 0));
		questions.add(new Question("C. 일을 하고 있지만 내가 뭘 배우고 있는지, 내가 어떻게 '일하는 나'를 만들어가고 있는지 아직은 의문인 당신.", 0, 0));
		questions.add(new Question("D. 지금 하고 있는 일에서 크게 고민되는 게 없거나, 지금 하는 일에 지루함을 느끼는 상황인가요?", 0, 0));
		System.out.println(questions.get(15));

		// 입력 받기 -> 스캐너 -> get(스캐너로 입력받은 숫자)
		// 0으로 시작, yes -> get(1) / no -> get(3)
		int inputNum = 0;
		while (true){
			// 현재 위치
			Question currentQuestion = questions.get(inputNum);
			System.out.println(currentQuestion.getText());

			if(currentQuestion.getYesIndex() == 0){
				break;
			}

			System.out.println("답 (예 = y / 아니오 = n) : ");
			String answer = scanner.nextLine();

			if(answer.equals("y")) {
				inputNum = currentQuestion.getYesIndex();
			}else if(answer.equals("n")) {
				inputNum = currentQuestion.getNoIndex();
			}else {
				System.out.println(" 'y' 또는 'n'로 대답해 주세요.");
			}
		} // end while
		scanner.close();
	}
}
