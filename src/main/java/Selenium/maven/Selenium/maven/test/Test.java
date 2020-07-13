package Selenium.maven.Selenium.maven.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	
	public static void main(String[] args) {
		
		
		
		String s="Hello how are you?";
		Map<Character, Integer> mp= new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			
			
			if(mp.containsKey(c)) {
				mp.put(c, mp.get(c)+1);
				
			}
			else{
				mp.put(c,1);
			}
						
		}
		
		
		int max=0;
		char z = 0;	
		Iterator<Entry<Character, Integer>>itr= mp.entrySet().iterator();
		while(itr.hasNext()) {
			
			int value=itr.next().getValue();
			if(value>max) {
            	max=value;
            	            	
            }
			
			System.out.println(itr.next().getKey()+":"+itr.next());
					
			
		}
		System.out.println("Maximum Occurence: "+":"+max);
		
		
		//Swap
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		a=40, b=2
				
		1st: a=42
		2nd: b=42-2=40
		3rd: a=42-40=2
		
		@dataprovider(browser)
		@Test
		
		testng.xml
		<>
		
}
	
}
