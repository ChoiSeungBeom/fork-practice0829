package bit701.day0906;

import java.util.Scanner;

public class Ex6_ArrayScoreInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * score 에 5개의 배열할당후 키보드로 직접 점수를 입력하여 배열에 저장후
		 * 총점과 평균을 구하세요
		 */
		Scanner sc=new Scanner(System.in);
		//변수 선언
		int []score=new int[5];
		double avg;
		int sum=0;
		
		//입력
		for(int i=0;i<score.length;i++)
		{
			System.out.print(i+"번 점수입력:");
			score[i]=sc.nextInt();
			//조건추가:0보다 작거나 100보다 크면 "0~100 사이 점수로 입력바람!" 출력후 다시 입력
			//continue 이용해서 작성해보세요
			if(score[i]<0 || score[i]>100)
			{
				System.out.println("\t0~100 사이 점수로 입력바람!");
				i--;//미리 1 감소후 i++ 에서 1증가되므로 다시 제자리에 입력
				continue;//i++ 로 이동
			}
			
			sum+=score[i];
		}
		//평균계산
		avg=(double)sum/score.length;
		
		//출력
		System.out.println("입력한 점수들");
		for(int n:score)
			System.out.printf("%5d",n);
		System.out.println("\n총점:"+sum);
		System.out.println("평균:"+avg);
	}

}










