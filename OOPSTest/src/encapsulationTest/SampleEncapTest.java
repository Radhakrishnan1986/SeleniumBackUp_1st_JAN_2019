package encapsulationTest;

public class SampleEncapTest {

	private int age;
	private String name;

	public void setAge(int age) {
		age = age+15;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
		
	}
	public String getName() {
		return name;
		
	}
}
