package swing;

import java.util.Arrays;

public class Lotto {
	// 로또는 1 부터 45까지 중복되지 않는 랜덤 숫자들의 집합
	/* 필드 */
	int[] lotto = new int[6];

	/* 생성자 */
	
	/* 멤버메소드 */
	public int[] getLotto() {
		return lotto;
	}

	// 로또는 외부에서 숫자를 주입받는것이 아니라
	// 자체 적으로 랜덤숫자를 발생시켜야한다.
	public void setLotto() {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = 0; // 배열 내부의 지역변수 6개를 for문을 이용해 초기화
		}
		for (int i = 0; i < lotto.length; i++) {
			// 로또의 사이즈 6만큼 회전하면서 랜덤 숫자 6개를 생성
			int randomNum = (int) ((Math.random()*45)+1);
			
			// 로또의 법칙 : 로또는 숫자가 중복이 있어서는 안된다.
			boolean exist = false;
			for (int j = 0; j < lotto.length; j++) {
				if (randomNum == lotto[j]) { 
					exist = true; // 전의 숫자와 같다면 exist 를 트루로 만든다.
					break;
				}
			}
			if (exist) { // exist 가 트루면 실행
				i--; // 숫자가 중복되지 않을때까지 i 를 되돌린다.
				continue;
			} else {
				lotto[i] = randomNum;
			}
		}
		
		// 중복이 되지 않은 6개의 랜덤숫자가 배열에 담겼다면
		// 그 배열의 숫자를 오름차순으로 정렬해야함
		Arrays.sort(lotto);
	}	
}
