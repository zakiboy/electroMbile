package com.electro.cxf.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-06-12T20:52:33.563+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "MemberServiceService", 
                  wsdlLocation = "http://localhost:8081/electroMbile-web/cxf/member?wsdl",
                  targetNamespace = "http://service.cxf.electrombile.com/") 
public class MemberServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.cxf.electrombile.com/", "MemberServiceService");
    public final static QName MemberServicePort = new QName("http://service.cxf.electrombile.com/", "MemberServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8081/electroMbile-web/cxf/member?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MemberServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8081/electroMbile-web/cxf/member?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MemberServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MemberServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MemberServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MemberServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MemberServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MemberServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns MemberService
     */
    @WebEndpoint(name = "MemberServicePort")
    public MemberService getMemberServicePort() {
        return super.getPort(MemberServicePort, MemberService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MemberService
     */
    @WebEndpoint(name = "MemberServicePort")
    public MemberService getMemberServicePort(WebServiceFeature... features) {
        return super.getPort(MemberServicePort, MemberService.class, features);
    }

}
