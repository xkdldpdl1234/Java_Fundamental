package java_20190715;

public class CharLiteralDemo {

	public static void main (String[] args) {
		char c1 = '\uc131';
		char c2 = '\uc601';
		
		
	System.out.println(c1);
	System.out.println(c2);
		// char literal의 문자표현 => ''
		char c5 = 'q';
		System.out.println(c5);
		
		char c6= '\"';
		System.out.println(c6);
		
		String path = "https:\\shaeod.tistory.com\\760";
		
		System.out.println(path);
		// \n => line feed
		// \t => tab
		// \\ => back slash
		// \' => single quotation
		// \" => double quotation
		String path1 = "aa\ncc";
		System.out.println(path1);
			
	}
}
