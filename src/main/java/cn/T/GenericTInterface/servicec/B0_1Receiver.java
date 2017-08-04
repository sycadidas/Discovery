package cn.T.GenericTInterface.servicec;

import com.alibaba.fastjson.JSON;

import cn.T.GenericTInterface.abstractc.DefaultReceiveService;
import cn.T.GenericTInterface.domain.interfaceDTO.IOrder;
import cn.T.GenericTInterface.domain.serviceDTO.Order;

public class B0_1Receiver extends DefaultReceiveService<String,Boolean,Boolean,Order,Boolean,IOrder>{

	@Override
	public OS getOtherSide() {
		return OS.A;
	}

	@Override
	public INT_NO getInterfaceNo() {
		return INT_NO.B0_1;
	}

	//在B0.1中注入业务service 并提供get，set方法
	@Override
	protected ItoBDataHandler<Order, Boolean> getDataHandler() {
		return null;
	}

	@Override
	protected IOrder formatReceive(String interfaceData) {
		return JSON.parseObject(interfaceData, IOrder.class);
	}

	@Override
	protected Order toBData(IOrder interfaceData) {
		return null;
	}

	@Override
	protected Boolean formatResponse(Boolean brt) {
		return true;
	}


}
