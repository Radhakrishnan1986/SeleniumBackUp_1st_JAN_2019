package stringTest;

public class Stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Vmetry";
		String output = "Technologies";
		input.concat(output);
		System.out.println(input);

//stringbuffer = mutable
		StringBuffer sb1 = new StringBuffer("Vmetry");
		sb1.append("Technologies");
		System.out.println(sb1);

//stringbuilder = mutable
		StringBuilder sb2 = new StringBuilder("Vmetry");
		sb2.append("Technologies");
		System.out.println(sb2);
	}

}
