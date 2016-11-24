package cn.Exception.MyException;

public class MyException extends Exception{
	
	/**
	 * 自定义异常类
	 */
	private static final long serialVersionUID = 1L;

	public MyException(){}
	
	public MyException(String msg){
		super(msg);
	}
	
	public static String checkAge(String age) throws MyException{
		if(Integer.parseInt(age)<0){
			throw new MyException("年龄不合法");
		}
		
		return age;
	}
	
	public static void main(String[] args) {
		String age = "-5";
		try {
			System.out.println(checkAge(age));
		} catch (MyException e) {
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
	}
}
