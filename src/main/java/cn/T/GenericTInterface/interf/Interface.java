package cn.T.GenericTInterface.interf;


/**
 * 顶层接口定义
* @ClassName: Interface 
* @Description:接口定义，接口相关的枚举类型的存放 
* @author sunyanchen 
* @date 2017年8月4日 下午1:59:16
 */
public interface Interface<D,R1,R2>{

	/**
	 * @Description:通信方法1
	 */
	public R1 communicate(D data);
	
	/**
	 * @Description:通信方法2
	 */
	public R1 communicate(D data,String sign);
	
	/**
	 * @Description:通信方法3
	 */
	public R2 communicate(D...data);
	
	/**
	*对方系统描述
	 */
	public OS getOtherSide();
	
	
	public static enum OS{
		A("a"),B("b");
		OS(String code){
			_code = code;
		}
		String _code;
		public String get_code() {
			return _code;
		}
		public void set_code(String _code) {
			this._code = _code;
		}
	}
	
	/**
  	*接口编号描述
  	 */
	public INT_NO getInterfaceNo();
	
	public static enum INT_NO{
		/**
		 * B0.1废弃
		 */
		@Deprecated
		B0_1("B0.1","I"),
		/**
		 * B0.2使用中
		 */
		B0_2("B0.2","O");

		
		INT_NO(String code,String io){
			_code = code;
			_io = io;
		}
		String _code;
		String _io;
		
		public String get_io(){
			return _io;
		}
		public String get_code() {
			return _code;
		}
		public void set_code(String _code) {
			this._code = _code;
		}

	}
	
	
}

