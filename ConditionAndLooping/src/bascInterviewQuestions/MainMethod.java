package bascInterviewQuestions;

public class MainMethod {

	 public static void main(String[] args) {
	        System.out.println("main(String[] args)");
	        main("arg1");
	        main("arg1","arg2");
	    }

	    public static void main(String arg1) {
	        System.out.println("main(String arg1)");
	    }

	    public static void main(String arg1, String arg2) {
	        System.out.println("main(String arg1, String arg2)");
	    }

}
