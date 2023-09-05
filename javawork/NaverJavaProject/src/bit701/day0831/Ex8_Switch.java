package bit701.day0831;

import java.util.Scanner;
/*
 *  switch 문은 jdk8 이전까지는 정수,문자만 가능했으나
 *  그 이후 문자열도 가능해졌음
 * 
 */
public class Ex8_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//숫자를 입력받아 1:one 2:two 3:three 그 이외 : other number
//		System.out.println("숫자 입력");
//		int num=sc.nextInt();
//		//switch 는 num 값에 따라서 해당 case 실행
//		//단 break 가 없을경우 끝까지 실행됨
//		switch (num) {
//		case 1: 
//			System.out.println("one!");
//			break;//switch 문을 빠져나간다			
//		case 2:
//			System.out.println("two!");
//			break;//switch 문을 빠져나간다	
//		case 3:
//			System.out.println("three!");
//			break;//switch 문을 빠져나간다	
//		default:
//			System.out.println("other number!");
//		}
		
		System.out.println("영문 색상명을 입력하세요");
		String color=sc.nextLine();
		
		switch(color)
		{
		case "red"://break 가 없으므로 다음 case 문이 실행된다
		case "RED":
			System.out.println(color+" : 빨강색");
			break;
		case "green":
		case "GREEN":
			System.out.println(color+" : 초록색");
			break;
		case "pink":
		case "PINK":
			System.out.println(color+" : 분홍색");
			break;
		default:
			System.out.println(color+": 그 이외의 색");
		}
				
		
	}

}









