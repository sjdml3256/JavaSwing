package total;

public class AccountController {
	public static void main(String[] args) {
		AccountService a = new AccountServiceImpl();
		a.first();
		// 직접구현한 객체를 사용할 경우 단점
		// 구현 클래스가 메소드를 추가 할수 없다.
		
		
		Account2 t = new Account2();
		t.first();
	}
}
