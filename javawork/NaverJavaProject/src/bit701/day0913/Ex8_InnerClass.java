package bit701.day0913;

class OuterA
{
	int a=10;
	static int b=20;
	
	//Member 내부클래스
	class InnerA
	{
		int c=30;
		static int d=40;//jdk 11버전까지는 오류 발생,멤버내부클래스에서 static 선언 불가능,jdk17에서는 가능
		
		public void showInner()
		{
			System.out.println("** 내부 클래스의 메서드 **");
			System.out.println("외부의 변수 a="+a);
			System.out.println("외부의 변수 b="+b);
			System.out.println("내부의 변수 c="+c);
			System.out.println("내부의 변수 d="+d);			
		}		
	}
	

	//외부클래스의 메서드
	public void showOuter()
	{
		InnerA inA=new InnerA();
		inA.showInner();
	}	
}

public class Ex8_InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterA a=new OuterA();
		a.showOuter();
		System.out.println();
		//다른 클래스에서 직접 내부클래스의 메서드를 호출하고 싶을경우
		OuterA.InnerA b=new OuterA().new InnerA();
		b.showInner();
	}

}












