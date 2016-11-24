package cn.implement;

public class Son extends Father{

	@Override
	public void op3() {
		System.out.println("Son");
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.op1();
		s.op2();
		s.op3();
		System.out.println(Gender.MAN.getValue());
	}

}
