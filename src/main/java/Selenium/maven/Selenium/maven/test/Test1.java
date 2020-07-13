package Selenium.maven.Selenium.maven.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test1 {

	public static void main(String[] args) {
		
		
		String h= "I work for Ness Technology pvt limited";
		
		String []sp= h.split(" ");
		int maxlenght=0;
		String mx="";
		for(int i=0;i<sp.length;i++) {
			if(sp[i].length()>maxlenght) {
				maxlenght=sp[i].length();
				mx=sp[i];
			}
				
				
		}
		System.out.println(mx+": "+maxlenght);
		
		
		
		
		String b ="Ness";
		
		Map<Character, Integer> mp = new HashMap<>();
		
		for(int i=0;i<b.length();i++) {
			
			char ch=b.charAt(i);
			
			if(mp.containsKey(ch)) {
				mp.put(ch, mp.get(ch)+1);
			}
			else {
				mp.put(ch,1);
			}
			
			
//			WebDriver d = new ChromeDriver();
//			List<WebElement> links = d.findElements(By.tagName("a"));
//			System.out.println(links.size());
//			
			
			
			
		}
		
		System.out.println(mp);
		
		Set<Map.Entry<Character, Integer>>sp1 = mp.entrySet();
		
		for(Map.Entry<Character, Integer>lt:sp1) {
			System.out.println(lt.getKey()+" "+lt.getValue());
		}
		
		
		
	
		
	}
	
	
	
	

}
