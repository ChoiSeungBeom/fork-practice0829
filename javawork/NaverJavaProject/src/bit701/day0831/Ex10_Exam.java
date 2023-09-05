package bit701.day0831;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex10_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  상품명 과 수량, 단가를 각각 입력받은후 총금액을 출력하시오
		 *  그리고 수량이 5개 이상일경우 10프로 할인된 최종 금액도 출력해주세요
		 *  
		 *  (예)
		 *  상품명 : 딸기
		 *  수량:6
		 *  단가:1000
		 *  
		 *  총금액 : 6000 원
		 *  5개 이상 10프로 할인된 금액 : 5400원
		 */
		//선언
		Scanner sc=new Scanner(System.in);
		NumberFormat numFormat=NumberFormat.getInstance();
		String sangpum="";
		int su=0,dan=0,total=0;
		
		//입력
		System.out.println("상품명");
		sangpum=sc.nextLine();
		System.out.println("수량");
		su=sc.nextInt();
		System.out.println("단가");
		dan=sc.nextInt();
		
		//계산
		//총금액
		total=su*dan;
		
		//출력
		System.out.println("총금액="+numFormat.format(total)+"원");
		
		//5개 이상 할인받는 조건 추가
		if(su>=5)
		{
			total=(int)(total*0.9);
			System.out.printf("5개 이상 10프로 할인된 금액 : %d 원\n",total);
			System.out.printf("5개 이상 10%% 할인된 금액 : %s 원\n",numFormat.format(total));
		}
		
	}

}




















