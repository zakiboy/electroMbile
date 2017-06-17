package com.test.junit;

import java.math.BigDecimal;
import java.util.Date;

import com.electro.cxf.service.BaseOutDomain;
import com.electro.cxf.service.MbileInfo;
import com.electro.cxf.service.MemberService;
import com.electro.cxf.service.MemberServiceService;
import com.electro.mbile.model.WeChatMember;


public class CxfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String url ="http://47.92.78.70:8081/electroMbile/cxf/order?wsdl";
//		String url ="http://localhost:8081/electroMbile-web/cxf/order?wsdl";
//		String methodName = "saveOderInfo";
//        // url为调用webService的wsdl地址
////        QName name = new QName("http://service.cxf.electrombile.com/", "saveOderInfo");
//        // namespace是命名空间，methodName是方法名
//        
//        OrderRequest param = new OrderRequest();
//        param.setOpenId("OPENID21635");
//        param.setOrderChannel(0);
//        param.setOrderMoney(new BigDecimal(12.5));
//        param.setOrderNo("NO"+new Date().getTime());
//        param.setOrderType(0);
////        String xmlStr = XMLUtil.convertToXml(order);
////        System.out.println(xmlStr);
//        // paramvalue为参数值
//        try {
//        	Object[] objects = ClientUtil.routeServer(url, methodName, param);
//            System.out.println(objects[0].toString());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
		
//		OrderServiceService service = new OrderServiceService();
//		OrderService port = service.getOrderServicePort();
//	    OrderRequest param = new OrderRequest();
//	    param.setOpenId("OPENID21635");
//	    param.setOrderChannel(0);
//	    param.setOrderMoney(new BigDecimal(12.5));
//	    param.setOrderNo("NO"+new Date().getTime());
//	    param.setOrderType(0);
//		BaseOutDomain bd = port.saveOderInfo(param);
//	    System.out.println(bd.getCode() + bd.getDesc());
		
		MemberServiceService memberService = new MemberServiceService();
		MemberService port = memberService.getMemberServicePort();
		com.electro.cxf.service.WeChatMember member = new com.electro.cxf.service.WeChatMember();
		member.setLongitude("121.48613");
		member.setLatitude("31.23612");
	    BaseOutDomain bd = port.getScopeMbilePageList(member);
		System.out.println("返回code："+bd.getCode()+"结果描述："+bd.getDesc());
		for (MbileInfo mi:bd.getMbiles()) {
			System.out.println("地理位置："+mi.getElectrombileCoordinate());
		}
	}

}
