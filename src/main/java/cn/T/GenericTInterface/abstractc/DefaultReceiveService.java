package cn.T.GenericTInterface.abstractc;


import java.sql.Timestamp;

import cn.T.GenericTInterface.interf.Interface;
import cn.T.GenericTInterface.servicec.ItoBDataHandler;

/**
 * 默认的收消息业务接口
* @ClassName: DefaultReceiveService 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author sunyanchen 
 * @param <D>
* @date 2017年8月4日 下午2:42:44
 */
public abstract class DefaultReceiveService<D,R1,R2,BDT,BRT,ID> implements Interface<D,R1,R2>{
	
	//获得业务处理接口的引用，以便在上层类中使用
	protected  abstract  ItoBDataHandler<BDT,BRT> getDataHandler();
	//将接受到的数据格式化处理并返回
	protected abstract ID formatReceive(D interfaceData);
	//将格式化后的数据转换为本系统的业务对象
	protected abstract BDT toBData(ID interfaceData);
	//将处理结果格式化并返回
	protected abstract R2 formatResponse(BRT brt);
	
	//这里默认使用通信方法3 其余两方法空实现
	public R2 communicate(D...data){
		boolean isCommucationSuccess = true;
		Timestamp begin = null;
		Timestamp end = null;
		ID iData = null;
		BDT bData = null;
		BRT result = null;
		R2 iResult = null;
		try{
			begin = new Timestamp(System.currentTimeMillis());
			for (D d : data) {
				//接口对象
				iData = formatReceive(d);
				//业务对象
				bData = toBData(iData);
				//交给业务端处理
				ItoBDataHandler<BDT,BRT> handler = getDataHandler();
				result = handler.handleBData(bData);
				//处理结果，返回给远程系统
				iResult = formatResponse(result);
				end = new Timestamp(System.currentTimeMillis());
				return iResult;
			}
			
		}catch(Exception e){
			isCommucationSuccess = false;
			throw new RuntimeException(e.getMessage(),e);
		}finally{
			//mongoService.save("ColInterfaceLog_"+getInterfaceNo().get_code()+"_"+DateUtil.format(new Date(), "yyyyMM"),getLog());
		}
		
		return null;
	}
	//如果必要 以下两方法可以在此处全部实现，这里仅做示例
	@Override
	public R1 communicate(D data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R1 communicate(D data, String sign) {
		// TODO Auto-generated method stub
		return null;
	}
	//组装log的格式
	
	/*protected InterfaceLog getLog(D data,IT iModel,BDT bModel,BRT result,R iResult,Boolean isSuccess,Timestamp begin,Timestamp end,Exception e){
		InterfaceLog log = new InterfaceLog();
		log.setTransationId(iModel != null ? iModel.getTid() : null);
		log.setCommucationType(getCommucationType() != null ? getCommucationType().get_code() : null);
		log.setIo(getInterfaceNo() != null ? getInterfaceNo().get_io() : null);
		log.setInterfaceNo(getInterfaceNo() != null ? getInterfaceNo().get_code() : null);
		log.setOtherSide(getOtherSide() != null ? getOtherSide().get_code() : null);
		log.setRequest(data != null ? data.toString() : null);
		log.setResponse(iResult == null ? "" : iResult.toString());
		log.setResultFlag(isSuccess);
		log.setBegin(begin);
		log.setEnd(end);
		log.setDataId(iModel!=null?iModel.getDataId():null);
		if(!isSuccess){
			Writer w=new StringWriter();
			if(e!=null){
				e.printStackTrace(new PrintWriter(w));
			}
			log.setE(w.toString());
		}
		log.setHostIp(InetAddressUtil.getLocalIp());
		return log;
		
	}*/
	
	//接口日志计入mongo 所以此处注入mongoService 并提供get，set方法
}
