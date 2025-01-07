package org.example;

import java.util.HashSet;
import java.util.Set;

// set을 이용한 로또번호 생성기
public class LottoEx {

    public static void main(String[] args) {
        // 로또 번호 저장 (set은 중복 방지)
        Set<Integer> lottoNumbers = new HashSet<>();

        for (int i = 0; lottoNumbers.size() < 6; i++) {
            int idx = (int)(Math.random() * 45);

            System.out.print(idx + " "); // 번호 확인용

            lottoNumbers.add(idx); // lottoNumbers.size() 가 6이 될 때까지 for 돌림
        }

        // 로또 번호 출력
        System.out.println();
        System.out.println("로또 번호: " + lottoNumbers);

    }
}
