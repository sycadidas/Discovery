package cn;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		String Categ = "";
		List<String> l = new ArrayList<String>();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("e");
		
		if(l.size()>0){
			for(int i=0;i<l.size()-1;i++){
					Categ = Categ+l.get(i)+",";
			}
			Categ = Categ+l.get(l.size()-1);
		}
		System.out.println(Categ);
	}

}
