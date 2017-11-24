package cn.algorithm;
//压缩字符串
public class Question {
	
	public static void main(String[] args) {
		String s = "aaabbbcaa";
		
		int count = 1;
		StringBuffer c = new StringBuffer();
		
		for(int i=0;i<s.length();i++){
			char index_char = s.charAt(i);
			
			if(i+1<=s.length()&&i!=s.length()-1&&s.charAt(i+1)==index_char){
				count++;
			}else{
				c = c.append(index_char+""+count);
				count = 1;
			}
		}
		System.out.println(c);
		System.out.println(Question.reduction(c.toString()));
	}
	
	public static String reduction (String s){
		StringBuffer c = new StringBuffer();
		for(int i=0;i<s.length()/2;i++){
			int k = Integer.parseInt(s.charAt(2*i+1)+"");
			for(int j=0 ; j<k ; j++){
				c = c.append(s.charAt(2*i));
			}
		}
		return c.toString();
		
	}

	
	

}
