package basicPrograms;

public class HighestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 180;
		int b = 90;
		int c = 10;
		
		if((a> b) && (a>c)){
			System.out.println(a);
		}
		else if((b> a) && (b>c)){
			System.out.println(b);
		}
		else {
			System.out.println(c);		
		}
	}

}
