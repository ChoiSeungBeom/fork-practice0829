package bit701.day0907;

import java.util.Scanner;

public class Ex1_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("배열 복습 예제");
		/*
		 *  처음에 인원수(count)를 입력후 그 인원수만큼
		 *  names, kor,eng 를 배열 할당한후
		 *  인원수만큼 이름,국어점수,영어점수를 입력하면
		 *  
		 *  아래와 같이 출력되도록 프로그램을 작성하세요
		 *  
		 *  번호  이름  국어  영어  총점   평균
		 *  ----------------------------------
		 *  1     김     89    90    179   89.5
		 *  2     이     100  100    200  100
		 */
		Scanner sc=new Scanner(System.in);
		int count;
		String []names;
		int []kor,eng,tot;
		double []avg;
		
		System.out.println("입력할 인원수는?");
		count=Integer.parseInt(sc.nextLine());
		//배열 할당
		names=new String[count];
		kor=new int[count];
		eng=new int[count];
		tot=new int[count];
		avg=new double[count];
		
		//데이타 입력
		for(int i=0;i<count;i++)
		{
			System.out.println(i+"번 이름");
			names[i]=sc.nextLine();
			
			System.out.println(i+"번 국어,영어점수");
			kor[i]=Integer.parseInt(sc.nextLine());
			eng[i]=Integer.parseInt(sc.nextLine());
			
			//총점 , 평균 계산
			tot[i]=kor[i]+eng[i];
			avg[i]=tot[i]/2.0;
			System.out.println();
		}		
		
		//출력
		System.out.println("번호\t이름\t국어\t영어\t총점\t평균");
		System.out.println("=".repeat(40));
		for(int i=0;i<count;i++)
		{
			System.out.println(i+1+"\t"+names[i]+"\t"+kor[i]+"\t"+
					eng[i]+"\t"+tot[i]+"\t"+avg[i]);
		}
		
	}

}













