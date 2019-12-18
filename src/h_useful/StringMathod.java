package h_useful;

public class StringMathod {

	public static void main(String[] args) {
		String s = new String("Hello");
		// s = "Hello"

		char[] c = {'H','e','l','l','o'};
		String s = new String(c);
		// s = "Hello"

		StringBuffer sb = 
				new StringBuffer("Hello");
		String s = new String(sb);
		// s = "Hello"

		String s = "Hello";
		String n = "0123456";	
		char c = s.charAt(l);
		char c2 = n.charAt(l);
		// c = 'e'
		// c2 = '1'
		
		int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		//i = 0
		//i2 = -1
		//i3 = 1
		
		String s = "Hello";
		String s2 = s.concat("World");
		//s2="Hello World"
		
		String s = "abcedfg";
		boolean b = s.contains("bc");
		//b=true
		
		String file = "Hello.txt";
		boolean b = file.endsWith("txt");
		//b=true
		
		String s = "Hello;"
		boolean b = s.equals("Hello");
		boolean b2 = s.equals("hello");
		//b=true
		//b2=true

		String s = "Hello";
		boolean b = s.equalsIgnoreCase("HELLO");
		boolean b2 = s.equalsIgnoreCase("heLLo");
		//b=true
		//b2=true
		

		String s = "Hello";
		int idx1 = s.indexOf('o');
		int idx2 = s.indexOf('k');
		//idx1 = 4
		//idx2 = -1

		String s = "Hello";
		int idx1 = s.indexOf('e', 0);
		int idx2 = s.indexOf('e', 2);
		//idx1 = 1
		//idx2 = -1


		String s = "ABCDEFG";
		int idx = s.indexOf("CD");
		//idx1 = 2
		

		String s = new String("abc");
		String s2 = new String("abc");
		boolean b = (s==s2);
		boolean b2 = s.equals(s2);
		boolean b3 = (s.intern()==s2.intern());
		//b = false
		//b2 = true
		//b3 = true
		
		String s = "java.lang.Object";
		int idx1 = s.lastIndexOf('.');
		int idx2 = s.indexOf('.');
		//idx1 = 9
		//idx2 = 4
		

		String s = "java.lang.java";
		int idx1 = 
				s.lastIndexOf("java");
		int idx2 = s.indexOf("java");
		//idx1 = 10
		//idx2 = 0
		

		String s = "Hello";
		int length = s.length();
		//length = 5
		
		String s = "Hello";
		String s1 = s.replace('H','C');
		//sl ="Cello"
		

		String s = "Hellollo";
		String s1 = s.replace("ll","LL");
		//sl ="HeLLoLLo"

		String ab = "AABBAABB";
		String r = ab.replaceAll("BB","bb");
		//r ="AAbbAAbb"
		
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",",2);
		//arr[0] = "dog"
		//arr[1] = "cat"
		//arr[2] = "bear"
		
		String s = "java.lang.Object";
		boolean b = s.startsWith("java");
		boolean b2 = s.startsWith("lang");
		//b = true
		//b2 = false
		
		String s = "java.lang.Object";
		String c = s.substring(10);
		String p = s.substring(5,9);
		//c ="Obiect"
		//p = "lang"
		

		String s = "Hello";
		String s1 = s.toLowerCase();
		//s1 ="hello"
		
		String s = "Hello";
		String s1 = s.toString();
		//s1 ="Hello"
		
		String s = "Hello";
		String s1 = s.toUpperCase();
		//s1 ="HELLo"
		
		String s = "	Hello World	";
		String s1 = s.trim();
		//s1= "Hello World"
		
		String b = String.valueOf(true);
		String c = String.valueOf('a');
		String i = String.valueOf(100);
		String l = String.valueOf(100L);
		String f = String.valueOf(10f);
		String d = String.valueOf(10.0);
		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);
		// b = "true"
		// c = "a"
		//i = "100"
		//l = "100"
		//f = "10.0"
		//d = "10.0"
		//date = "wed Jan 27 21:26:29 KST 2016"
	}

}
