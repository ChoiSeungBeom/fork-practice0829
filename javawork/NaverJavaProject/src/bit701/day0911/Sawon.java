package bit701.day0911;

public class Sawon {
	private String name;//사원명
	private int gibon;//기본급
	private int sudang;//수당
	private int familySu;//가족수
	
	//멤버변수의 4개를 인자로 받아서 전달할 생성자
	
	
	//멤버변수 4개의 getter method
	
	//가족수에 따른 수당 반환하는 메서드
	//3인이상이면 10000, 나머지는 50000
	//   getFamilySudang()
	
	//세금반환하는 메서드
	//기본급의 5프로 반환
	//  getTax()
	
	//실제 받을 실수령액을 리턴하는 메서드
	//기본급+수당+가족수당-세금
	//   getNetPay()

}
