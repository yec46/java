package sub2;

public class SalaryStudent extends Student {
	private String name;
	private int age;
	private String school;
	private String major;
	private String company;
	
	//생성자
	
	
	public void hello() {
		System.out.println(name+"입니다.");
		System.out.println(age+"입니다.");
		System.out.println(school+"학생입니다.");
		System.out.println(major+"을 공부중입니다.");
		System.out.println(company+"에 재직중입니다.");
	}
	

}
