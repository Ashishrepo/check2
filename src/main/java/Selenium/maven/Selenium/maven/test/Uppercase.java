package Selenium.maven.Selenium.maven.test;

public class Uppercase {

	public static void main(String[] args) {

		String g="selenium Interview series for begineers";
		//System.out.println(g.toUpperCase());

		char [] ch=g.toCharArray();

		//logic to print first letter of each word in Capital
		for(int i=1;i<g.length();i++) {

			if(Character.isLowerCase(ch[0])) {

				ch[0]=Character.toUpperCase(ch[0]);}

			if(ch[i]==' ') {
				if(Character.isLowerCase(ch[i+1])) {
					ch[i+1]=Character.toUpperCase(ch[i+1]);
				}


			}
			
		}
		System.out.println(ch);



	}
}
