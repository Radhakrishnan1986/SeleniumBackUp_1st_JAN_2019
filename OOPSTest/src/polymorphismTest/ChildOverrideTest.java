package polymorphismTest;

public class ChildOverrideTest extends ParentOverrideTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildOverrideTest c = new ChildOverrideTest();
		c.calc();

	}

	public static void add() {
		System.out.println("Child Add");
	}

	public void calc() {
		add();
		super.add();
		this.add();	//For 'Globalised variable'&'inside constructor' "this" key word can be used
	}

}
