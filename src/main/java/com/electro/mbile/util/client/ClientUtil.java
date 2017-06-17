package com.electro.mbile.util.client;

import javax.xml.namespace.QName;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.transport.http.HTTPConduit; 
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

public class ClientUtil{
	
	public static void getClient(){
		JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
        org.apache.cxf.endpoint.Client client = factory
                .createClient("http://47.92.78.70:8081/electroMbile/cxf/order?wsdl");
        // url为调用webService的wsdl地址
        QName name = new QName("http://service.cxf.electrombile.com/", "findOrderList");
        // namespace是命名空间，methodName是方法名
        String xmlStr = "aaaaaaaa";
        // paramvalue为参数值
        Object[] objects;
        try {
            objects = client.invoke(name, xmlStr);
            System.out.println(objects[0].toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	
	/**
	 * 
	 * 远程调用WebService 
	 * 
	 * @param methodName    方法类型
	 * @param param         参数
	 * @return
	 * @throws Exception
	 */
	public static Object[] routeServer(String url,String methodName,Object param) throws Exception{
	    JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
	    HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();    // 策略
	    httpClientPolicy.setConnectionTimeout( 36000 );    //连接超时 
	    httpClientPolicy.setAllowChunking( false );   
	    httpClientPolicy.setReceiveTimeout( 10000 );       //接收超时
	    Client client = dcf.createClient(url);
	    HTTPConduit http = (HTTPConduit) client.getConduit();  
	    http.setClient(httpClientPolicy);
	    return client.invoke(methodName, param);
	}
}
