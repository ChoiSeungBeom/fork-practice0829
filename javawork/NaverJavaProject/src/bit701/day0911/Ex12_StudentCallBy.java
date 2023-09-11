package bit701.day0911;

public class Ex12_StudentCallBy {

	//주소가 넘어오므로 여기서 준 초기값은 main 의 stu 로 값이 전달된다
	public static void dataInput(Student [] stu)
	{
		stu[0]=new Student("김씨");
		stu[1]=new Student("이씨", 2000, 90);
		stu[2]=new Student("박씨", 1989, 89);
	}
	
	public static void dataWrite(Student []stu)
	{
		for(Student s:stu)
		{
			s.studentInfo();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student []stu=new Student[3];
		dataInput(stu);
		dataWrite(stu);	
		
		int a=100;
		int b=changeInt(a);//call by value 로 값을 변경한경우 리턴으로 변경된값을 얻어야만 알수있다
		System.out.println(a+" 를 "+b+"로 변경했어요");
	}

	private static int changeInt(int a) {
		// TODO Auto-generated method stub
		a=200;
		return a;
	}

}






