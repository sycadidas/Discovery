package cn.implement;

public enum Gender {
	//实现带有构造器的枚举
			 MAN("1"), WOMEN("0");
			 private final String value;
			  
			 Gender(String value) {
		            this.value = value;
		     }
			 
			 public String getValue() {
		            return value;
		 }
}
