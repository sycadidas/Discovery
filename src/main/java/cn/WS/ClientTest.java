package cn.WS;


import cn.WS.WSDL2Client.WebApp;
import cn.WS.WSDL2Client.WebAppService;


public class ClientTest {

	public static void main(String[] args)  {
		WebAppService ws = new WebAppService();
		WebApp webAppPort = ws.getWebAppPort();
		System.out.println(webAppPort.sayHi("sunyanchen"));
		
	}

}
