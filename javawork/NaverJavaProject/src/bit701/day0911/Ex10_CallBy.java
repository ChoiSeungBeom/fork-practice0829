package bit701.day0911;

public class Ex10_CallBy {

	//Call by value:값만 전달된다(주소가 전달되지 않는다)
	//모든 기본형과 String 타입은 값만 전달된다
	public static void changeInt(int a)
	{
		System.out.println("전달받은 a값:"+a);
		//a값을 변경
		a=20;
		System.out.println("변경된후 a값:"+a);
	}
	
	//Call by Reference
	//모든 배열은 주소가 전달(배열은 무조건 객체 타입으로 인식)
	public static void changeArray(int []arr)
	{
		System.out.println("전달받은 배열값 확인");
		for(int a:arr)
			System.out.print(a+"\t");
		System.out.println("\n1번지 값을 변경해보자");
		arr[1]=100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		changeInt(a);
		System.out.println("main a="+a);
		
		int []arr= {3,4,5};
		changeArray(arr);//주소가 전달
		System.out.println("main 에서 arr 배열 확인");
		for(int n:arr)
			System.out.print(n+"\t");
		System.out.println();
	}

}






