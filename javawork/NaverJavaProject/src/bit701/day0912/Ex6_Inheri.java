package bit701.day0912;

class SuperA
{
	public void processA()
	{
		System.out.println("부모가 가진 메서드 A");
	}
	
	protected void processB()
	{
		System.out.println("부모가 가진 메서드 B");
	}
	
	private void processC()//상속안됨
	{
		System.out.println("부모가 가진 메서드 C");
	}
}

class SubA extends SuperA
{
	public void show()
	{
		//this는 자기 자신의 주소를 가진 인스턴스 변수이다
		//this 로 processA() 호출시 현재 클래스에 없으면 부모로부터 찾아서 가져온다
		this.processA();
		this.processB();
		//부모의 주소값을 가진 인스턴스 변수 super
		//반드시 super 로만 부모 메서드를 가져와야 하는경우는
		//  부모의 메서드를 자식이 오버라이드한경우
		super.processA();//부모의 메서드이므로 super로도 가져올수 있다
		super.processB();
	}
}
//////////////////////////////////////
public class Ex6_Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubA sub1=new SubA();
		sub1.processA();
		sub1.processB();
		//sub1.processC();//상속 안됨(private 은 패키지 상관없이 상속 안됨, 오류발생	
		System.out.println("-----");
		sub1.show();
	}

}















