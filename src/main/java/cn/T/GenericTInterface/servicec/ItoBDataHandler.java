package cn.T.GenericTInterface.servicec;
/**
 * 负责处理接口传递的业务对象
* @ClassName: ItoBDataHandler 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author sunyanchen 
* @date 2017年8月4日 下午3:01:57
 */
public interface ItoBDataHandler<BDT,BRT> {
	public BRT handleBData(BDT bData) throws Exception;
}
