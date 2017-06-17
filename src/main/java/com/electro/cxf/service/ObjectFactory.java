
package com.electro.cxf.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.electro.cxf.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetScopeMbilePageListResponse_QNAME = new QName("http://service.cxf.electrombile.com/", "getScopeMbilePageListResponse");
    private final static QName _ColseLockMobileResponse_QNAME = new QName("http://service.cxf.electrombile.com/", "colseLockMobileResponse");
    private final static QName _OrderMessage_QNAME = new QName("http://service.cxf.electrombile.com/", "OrderMessage");
    private final static QName _GetScopeMbilePageList_QNAME = new QName("http://service.cxf.electrombile.com/", "getScopeMbilePageList");
    private final static QName _AddMemberInfo_QNAME = new QName("http://service.cxf.electrombile.com/", "addMemberInfo");
    private final static QName _SendMemberPosition_QNAME = new QName("http://service.cxf.electrombile.com/", "sendMemberPosition");
    private final static QName _UnlockingMobile_QNAME = new QName("http://service.cxf.electrombile.com/", "unlockingMobile");
    private final static QName _UnlockingMobileResponse_QNAME = new QName("http://service.cxf.electrombile.com/", "unlockingMobileResponse");
    private final static QName _AddMemberInfoResponse_QNAME = new QName("http://service.cxf.electrombile.com/", "addMemberInfoResponse");
    private final static QName _SendMemberPositionResponse_QNAME = new QName("http://service.cxf.electrombile.com/", "sendMemberPositionResponse");
    private final static QName _ColseLockMobile_QNAME = new QName("http://service.cxf.electrombile.com/", "colseLockMobile");
    private final static QName _BaseOutDomain_QNAME = new QName("http://service.cxf.electrombile.com/", "baseOutDomain");
    private final static QName _OrderBack_QNAME = new QName("http://service.cxf.electrombile.com/", "OrderBack");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.electro.cxf.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BaseOutDomain }
     * 
     */
    public BaseOutDomain createBaseOutDomain() {
        return new BaseOutDomain();
    }

    /**
     * Create an instance of {@link OrderBack }
     * 
     */
    public OrderBack createOrderBack() {
        return new OrderBack();
    }

    /**
     * Create an instance of {@link ColseLockMobile }
     * 
     */
    public ColseLockMobile createColseLockMobile() {
        return new ColseLockMobile();
    }

    /**
     * Create an instance of {@link SendMemberPositionResponse }
     * 
     */
    public SendMemberPositionResponse createSendMemberPositionResponse() {
        return new SendMemberPositionResponse();
    }

    /**
     * Create an instance of {@link UnlockingMobileResponse }
     * 
     */
    public UnlockingMobileResponse createUnlockingMobileResponse() {
        return new UnlockingMobileResponse();
    }

    /**
     * Create an instance of {@link AddMemberInfoResponse }
     * 
     */
    public AddMemberInfoResponse createAddMemberInfoResponse() {
        return new AddMemberInfoResponse();
    }

    /**
     * Create an instance of {@link UnlockingMobile }
     * 
     */
    public UnlockingMobile createUnlockingMobile() {
        return new UnlockingMobile();
    }

    /**
     * Create an instance of {@link AddMemberInfo }
     * 
     */
    public AddMemberInfo createAddMemberInfo() {
        return new AddMemberInfo();
    }

    /**
     * Create an instance of {@link SendMemberPosition }
     * 
     */
    public SendMemberPosition createSendMemberPosition() {
        return new SendMemberPosition();
    }

    /**
     * Create an instance of {@link GetScopeMbilePageList }
     * 
     */
    public GetScopeMbilePageList createGetScopeMbilePageList() {
        return new GetScopeMbilePageList();
    }

    /**
     * Create an instance of {@link OrderMessage }
     * 
     */
    public OrderMessage createOrderMessage() {
        return new OrderMessage();
    }

    /**
     * Create an instance of {@link ColseLockMobileResponse }
     * 
     */
    public ColseLockMobileResponse createColseLockMobileResponse() {
        return new ColseLockMobileResponse();
    }

    /**
     * Create an instance of {@link GetScopeMbilePageListResponse }
     * 
     */
    public GetScopeMbilePageListResponse createGetScopeMbilePageListResponse() {
        return new GetScopeMbilePageListResponse();
    }

    /**
     * Create an instance of {@link WeChatMember }
     * 
     */
    public WeChatMember createWeChatMember() {
        return new WeChatMember();
    }

    /**
     * Create an instance of {@link MbileInfo }
     * 
     */
    public MbileInfo createMbileInfo() {
        return new MbileInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScopeMbilePageListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.electrombile.com/", name = "getScopeMbilePageListResponse")
    public JAXBElement<GetScopeMbilePageListResponse> createGetScopeMbilePageListResponse(GetScopeMbilePageListResponse value) {
        return new JAXBElement<GetScopeMbilePageListResponse>(_GetScopeMbilePageListResponse_QNAME, GetScopeMbilePageListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColseLockMobileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.electrombile.com/", name = "colseLockMobileResponse")
    public JAXBElement<ColseLockMobileResponse> createColseLockMobileResponse(ColseLockMobileResponse value) {
        return new JAXBElement<ColseLockMobileResponse>(_ColseLockMobileResponse_QNAME, ColseLockMobileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.electrombile.com/", name = "OrderMessage")
    public JAXBElement<OrderMessage> createOrderMessage(OrderMessage value) {
        return new JAXBElement<OrderMessage>(_OrderMessage_QNAME, OrderMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScopeMbilePageList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.electrombile.com/", name = "getScopeMbilePageList")
    public JAXBElement<GetScopeMbilePageList> createGetScopeMbilePageList(GetScopeMbilePageList value) {
        return new JAXBElement<GetScopeMbilePageList>(_GetScopeMbilePageList_QNAME, GetScopeMbilePageList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMemberInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.electrombile.com/", name = "addMemberInfo")
    public JAXBElement<AddMemberInfo> createAddMemberInfo(AddMemberInfo value) {
        return new JAXBElement<AddMemberInfo>(_AddMemberInfo_QNAME, AddMemberInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMemberPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.electrombile.com/", name = "sendMemberPosition")
    public JAXBElement<SendMemberPosition> createSendMemberPosition(SendMemberPosition value) {
        return new JAXBElement<SendMemberPosition>(_SendMemberPosition_QNAME, SendMemberPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnlockingMobile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.electrombile.com/", name = "unlockingMobile")
    public JAXBElement<UnlockingMobile> createUnlockingMobile(UnlockingMobile value) {
        return new JAXBElement<UnlockingMobile>(_UnlockingMobile_QNAME, UnlockingMobile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnlockingMobileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.electrombile.com/", name = "unlockingMobileResponse")
    public JAXBElement<UnlockingMobileResponse> createUnlockingMobileResponse(UnlockingMobileResponse value) {
        return new JAXBElement<UnlockingMobileResponse>(_UnlockingMobileResponse_QNAME, UnlockingMobileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMemberInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.electrombile.com/", name = "addMemberInfoResponse")
    public JAXBElement<AddMemberInfoResponse> createAddMemberInfoResponse(AddMemberInfoResponse value) {
        return new JAXBElement<AddMemberInfoResponse>(_AddMemberInfoResponse_QNAME, AddMemberInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMemberPositionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.electrombile.com/", name = "sendMemberPositionResponse")
    public JAXBElement<SendMemberPositionResponse> createSendMemberPositionResponse(SendMemberPositionResponse value) {
        return new JAXBElement<SendMemberPositionResponse>(_SendMemberPositionResponse_QNAME, SendMemberPositionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColseLockMobile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.electrombile.com/", name = "colseLockMobile")
    public JAXBElement<ColseLockMobile> createColseLockMobile(ColseLockMobile value) {
        return new JAXBElement<ColseLockMobile>(_ColseLockMobile_QNAME, ColseLockMobile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseOutDomain }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.electrombile.com/", name = "baseOutDomain")
    public JAXBElement<BaseOutDomain> createBaseOutDomain(BaseOutDomain value) {
        return new JAXBElement<BaseOutDomain>(_BaseOutDomain_QNAME, BaseOutDomain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderBack }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.electrombile.com/", name = "OrderBack")
    public JAXBElement<OrderBack> createOrderBack(OrderBack value) {
        return new JAXBElement<OrderBack>(_OrderBack_QNAME, OrderBack.class, null, value);
    }

}
