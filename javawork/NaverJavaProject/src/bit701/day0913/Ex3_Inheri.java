package bit701.day0913;
//다형성 처리시 부모가 하는일이 없을경우 어떻게 해야할까요~
//오버라이딩을 위해서 일단 메서드는 만들어야 한다

//추상 클래스의 특징
// 1. 일반 메서드와 미완성의 abstract 메서드 둘다 구현 가능하다
// 2. abstract(추상) 클래스는 new 로 객체 생성을 할수 없다
// 3. 추상 클래스를 상속받는 클래스는 반드시 추상 메서드를 오버라이드해서 기능을 구현해야만 한다
// 4. 만약 추상 메소드를 오버라이드 안할경우 서브클래스도 역시 추상화시켜야만 한다

abstract class SuperColor
{
//	public void draw()
//	{
//		//부모클래스가 하는일이 없으므로 안에 내용도 없음
//	}
	//오버라이드를 위해서 {} 부분을 없앤다
	//abstract:추상화-미완성적인 메서드라는 의미
	//class 의 멤버메서드중 한개이상의 추상 메소드가 있는경우
	// 반드시 클래스도 추상화시켜야한다 . 즉 class 앞에 abstract 를 붙인다
	abstract public void draw();
	
	//오버라이드를 안할경우 호출 가능
	//서브클래스에만 있는 메서드는 호출 불가능(부모로 선언시)
	public void parentJob()
	{
		System.out.println("부모는 오늘도 돈을 벌어온다");
	}
}

//3개의 서브 클래스들
class SubRed extends SuperColor
{
	@Override
	public void draw() {
		System.out.println("집안 청소를 한다");
	}
}

class SubGreen extends SuperColor
{
	@Override
	public void draw() {
		System.out.println("식사준비를 한다");
	}
}

class SubBlue extends SuperColor
{
	@Override
	public void draw() {
		System.out.println("설거지를 한다");
	}
}
public class Ex3_Inheri {

	public static void draw(SuperColor s)
	{
		s.parentJob();//부모가 갖구있는 메소드 호출(오버라이드 x)
		s.draw();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		draw(new SubBlue());
		draw(new SubGreen());
		draw(new SubRed());
	}

}



















