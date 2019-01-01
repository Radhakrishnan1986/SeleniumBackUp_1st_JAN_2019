package dataType;

public class DataTypeTest4 {

	public static void main(String[] args) {

		String name = "RADHAKRISHNAN";
		char[] a = name.toCharArray();

		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println(a.length);
		
		/**/
		for(int i = 0; i<name.length(); i++) {
			System.out.print(name.charAt(i)+ " ");
		}
		System.out.println();
		System.out.println(name.length());
		
		/**/
		String data = "Alpha,Bita,Gama,Nano,Micra";
		
		String[] value = data.split(",");
		
		for(int j = 0; j<value.length;j++) {
			System.out.println(value[j]);
		}
		System.out.println(value.length);

	}

}
