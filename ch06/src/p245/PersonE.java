package p245;

public class PersonE {
	public static void main(String[] args) {
		Person p1= new Person("123456-1234567", "���");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name = "��������";
	}

}
