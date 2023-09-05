package bit701.day0830;

public class ExamEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//money 변수에 args[0] 값을 대입후(급여:백만단위:5674321)
		/*
		 * 출력
		 * money : 5674321 원
		 * 만원짜리 567 장
		 * 천원짜리 4장
		 * 백원짜리 3개
		 * 십원짜리 2개
		 * 일원짜리 1개
		 * 
		 *  : 산술연산자를 사용해서 출력해보세요
		 * 
		 */
		
		//파라미터에서 월급여를 읽어서(문자열) 정수타입으로 변환한다
		int money =Integer.parseInt(args[0]);
		System.out.println("월 급여:"+money);
		System.out.println("만원짜리 "+money/10000+"장");
		System.out.println("천원짜리 "+(money%10000)/1000+"장");
		System.out.println("백원짜리 "+(money%1000)/100+"개");
		System.out.println("십원짜리 "+(money%100)/10+"개");
		System.out.println("일원짜리 "+(money%10)+"개");
		
	}

}















