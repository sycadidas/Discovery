package cn.WS;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
//发布WS服务
//客户端生成 命令行：wsimport –s . http://localhost:8080/hi?wsdl 根据描述生成本地代码
@WebService
public class WebApp {
	public String sayHi(String name){
		System.out.println("server go...");
		return "Hi"+name;
		
	}
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/hi", new WebApp());
		System.out.println("server ready...");
	}
}
