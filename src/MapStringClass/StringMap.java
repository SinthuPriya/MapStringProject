package MapStringClass;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringMap {
	public static void main(String[] args) {
		String s = "Welcome to my home";
		char[] c = s.toCharArray();
		Map <String,Integer>mp= new LinkedHashMap<>();
		String[] sp= s.split(" ");
		for(String  x: sp) {
			if(mp.containsKey(c)) {
				mp.put(s, null);
			}
			System.out.println(mp);
		}
	}
		
		
		
		
		
		
		

		
		
		
	}

}
