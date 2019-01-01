package bascInterviewQuestions;

public class ReverseAString {

	public static void main(String[] args) {
		String data = "RADHAKRISHNAN";
		char a[] = data.toCharArray();
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]+" ");
		}

	}

}
