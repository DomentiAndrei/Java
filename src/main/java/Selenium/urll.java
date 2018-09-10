package Selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class urll {

	@Test
	public void testii() throws Exception {
		
		
		URL myUrl = new URL("https://google.com");
		HttpURLConnection coo = (HttpURLConnection) myUrl.openConnection();
		System.out.println(coo.getRequestMethod());
		System.out.println(coo.getResponseMessage());
		
		Map <String, List <String>> myMap = coo.getHeaderFields();
		Set<String> myField = myMap.keySet();
		
		for (String k : myField) {
			System.out.println( k + " " + myMap.get(k));
		}
		
		
		
		
	}
}
