package cn.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//计算给定字符串出现多少字符以及个数
public class StringStatistics {
	
		public static void main(String[] args) {
			String string = "dfgsfasfffsdfdarewgrgsdfaDQWTERRTFJUKHKLLD";
			  Map<Character, Integer> map = countLetters(string);
			  System.out.println("total: " + map.size());
			  for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			   System.out.printf("letter %c: %d\n", entry.getKey(),entry.getValue());
			  }
		 }
		 
		protected static Map<Character, Integer> countLetters(String s) {
		  if (s == null) {
		   return null;
		  }
		  Map<Character, Integer> map = new HashMap<Character, Integer>();
		  char c;
		  Integer oldValue;
		  int newValue;
		  for (int i = 0; i < s.length(); ++i) {
		   c = s.charAt(i);
		   oldValue = map.get(c);
		   newValue = (oldValue == null) ? 1 : oldValue.intValue() + 1;
		   map.put(c, newValue);
		  }
		  return map;
		 }

}
