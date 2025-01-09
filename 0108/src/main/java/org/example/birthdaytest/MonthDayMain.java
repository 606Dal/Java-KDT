package org.example.birthdaytest;

import org.example.yesnogame.Question;

import java.util.ArrayList;
import java.util.Scanner;

// 생일로 보는 25년 미리보기
public class MonthDayMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 월 별 배열 -> 일 별 배열
		ArrayList<MonthDay> months = new ArrayList<>();

		months.add(new MonthDay(1, "놀랍게"));
		months.add(new MonthDay(2, "종종"));
		months.add(new MonthDay(3, "멍때리다가"));
		months.add(new MonthDay(4, "갑자기"));
		months.add(new MonthDay(5, "어쩌다보니"));
		months.add(new MonthDay(6, "점점"));
		months.add(new MonthDay(7, "예상대로"));
		months.add(new MonthDay(8, "가만있어도"));
		months.add(new MonthDay(9, "우연히"));
		months.add(new MonthDay(10, "자연스레"));
		months.add(new MonthDay(11, "바라는대로"));
		months.add(new MonthDay(12, "나도모르게"));

		ArrayList<MonthDay> days = new ArrayList<>();

		days.add(new MonthDay(1, "외모 상승"));
		days.add(new MonthDay(2, "다이어트 성공"));
		days.add(new MonthDay(3, "여행 감"));
		days.add(new MonthDay(4, "취직 성공"));
		days.add(new MonthDay(5, "고민풀림"));
		days.add(new MonthDay(6, "새 친구 사귐"));
		days.add(new MonthDay(7, "연예인 만남"));
		days.add(new MonthDay(8, "똑똑해짐"));
		days.add(new MonthDay(9, "연봉오름"));
		days.add(new MonthDay(10, "이상형 만남"));
		days.add(new MonthDay(11, "키 큼"));
		days.add(new MonthDay(12, "일복 터짐"));
		days.add(new MonthDay(13, "물광 피부됨"));
		days.add(new MonthDay(14, "자격증 땀"));
		days.add(new MonthDay(15, "귀여워짐"));
		days.add(new MonthDay(16, "먹을 복 터짐"));
		days.add(new MonthDay(17, "유튜브 데뷔"));
		days.add(new MonthDay(18, "웃음이 남"));
		days.add(new MonthDay(19, "인싸 등극"));
		days.add(new MonthDay(20, "돈 복 터짐"));
		days.add(new MonthDay(21, "복권 당첨"));
		days.add(new MonthDay(22, "칭찬받음"));
		days.add(new MonthDay(23, "건강해짐"));
		days.add(new MonthDay(24, "쇼핑함"));
		days.add(new MonthDay(25, "영화 봄"));
		days.add(new MonthDay(26, "소원 성취"));
		days.add(new MonthDay(27, "전성기 옴"));
		days.add(new MonthDay(28, "밝아짐"));
		days.add(new MonthDay(29, "인생 역전"));
		days.add(new MonthDay(30, "운수대통"));
		days.add(new MonthDay(31, "인기 상승"));

		// 스캐너로 입력 -> 월 ->  일
		System.out.println("생일을 입력하세요. 월 : ");
		int month = Integer.parseInt(scanner.nextLine()) - 1;

		System.out.println("생일을 입력하세요. 일 : ");
		int day = Integer.parseInt(scanner.nextLine()) - 1;

		// 출력은 한 번에
		System.out.println("-> " + months.get(month).getText() + " / " + days.get(day).getText());

	}
}
