package bascInterviewQuestions;

public class ToCharArrayTest {

	public static void main(String[] args) {

		String data = "How was the day welcome good evening";
		char s[] = data.toCharArray();
		int j =0;

		for(int i =0; i<s.length; i++) {
		char input = data.charAt(i);
		System.out.println(input);
		if(input==('a')||input==('e')) {
			j = j+1;
		}
		/*else if(input==('e')) {
			j = j+1;
		}*/
		else if(input==('i')) {
			j = j+1;
		}
		else if(input==('o')) {
			j = j+1;
		}
		else if(input==('u')) {
			j = j+1;
		}
		else {
			
		}
		
		}
		System.out.println("Total vowels in the given string is:" + j);


	}
}
