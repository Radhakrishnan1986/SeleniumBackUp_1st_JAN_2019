package dataType;

public class StringTest {
/**
 * @author Dharani
 * @param args
 */
	public static void main(String[] args) {
		//// TODO Auto-generated method stub
String a = " ABC123 ABC123 ";
String input = "Vmetry";
String output = "vmetry";
System.out.println(input.length());				//6
System.out.println(input.equals(output));			//false
System.out.println(input.equalsIgnoreCase(output)); //true
System.out.println(input.charAt(2));				//e
System.out.println(input.toUpperCase());
System.out.println(input.toLowerCase());
System.out.println(input.contains("me"));
System.out.println(input.startsWith("Vme"));
System.out.println(input.endsWith("try"));
System.out.println(input.substring(2));				//etry
System.out.println(input.substring(2, 4));			//et
System.out.println(input.concat(output));
System.out.println(input.replace("me", "cen"));
System.out.println(a.trim());
	}

}