package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.address.ParameterNames;
import android.gov.nist.javax.sip.address.SipUri;
import android.gov.nist.javax.sip.header.RequestLine;
import android.gov.nist.javax.sip.header.Route;
import android.gov.nist.javax.sip.header.RouteList;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.javax.sip.C10807n;
import android.javax.sip.InterfaceC10811r;
import java.util.LinkedList;
import java.util.ListIterator;
import p691d.InterfaceC12943b;
import p691d.InterfaceC12944c;
import p691d.InterfaceC12945d;
import p691d.InterfaceC12947f;
import p713e.InterfaceC13231g0;
import p735f.InterfaceC13461b;

/* JADX INFO: loaded from: classes.dex */
public class DefaultRouter implements InterfaceC12944c {
    private static StackLogger logger = CommonLogger.getLogger(DefaultRouter.class);
    private InterfaceC12943b defaultRoute;
    private SIPTransactionStack sipStack;

    private DefaultRouter() {
    }

    public final InterfaceC12943b createHop(InterfaceC12945d interfaceC12945d, InterfaceC13461b interfaceC13461b) {
        int port;
        String transportParam = interfaceC12945d.isSecure() ? ParameterNames.TLS : interfaceC12945d.getTransportParam();
        if (transportParam == null) {
            InterfaceC13231g0 interfaceC13231g0 = (InterfaceC13231g0) interfaceC13461b.getHeader(SIPHeaderNames.VIA);
            if (interfaceC13231g0 != null) {
                transportParam = interfaceC13231g0.getTransport();
            }
            if (transportParam == null) {
                transportParam = "UDP";
            }
        }
        if (interfaceC12945d.getPort() != -1) {
            port = interfaceC12945d.getPort();
        } else {
            port = transportParam.equalsIgnoreCase(ParameterNames.TLS) ? SIPConstants.DEFAULT_TLS_PORT : SIPConstants.DEFAULT_PORT;
        }
        return this.sipStack.getAddressResolver().resolveAddress(new HopImpl(interfaceC12945d.getMAddrParam() != null ? interfaceC12945d.getMAddrParam() : interfaceC12945d.getHost(), port, transportParam));
    }

    public void fixStrictRouting(SIPRequest sIPRequest) {
        RouteList routeHeaders = sIPRequest.getRouteHeaders();
        SipUri sipUri = (SipUri) ((Route) routeHeaders.getFirst()).getAddress().getURI();
        routeHeaders.removeFirst();
        AddressImpl addressImpl = new AddressImpl();
        addressImpl.setAddess(sIPRequest.getRequestURI());
        routeHeaders.add(new Route(addressImpl));
        sIPRequest.setRequestURI(sipUri);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("post: fixStrictRouting" + sIPRequest);
        }
    }

    @Override // p691d.InterfaceC12944c
    public InterfaceC12943b getNextHop(InterfaceC13461b interfaceC13461b) throws C10807n {
        SIPRequest sIPRequest = (SIPRequest) interfaceC13461b;
        RequestLine requestLine = sIPRequest.getRequestLine();
        if (requestLine == null) {
            return this.defaultRoute;
        }
        InterfaceC12947f uri = requestLine.getUri();
        if (uri == null) {
            throw new IllegalArgumentException("Bad message: Null requestURI");
        }
        RouteList routeHeaders = sIPRequest.getRouteHeaders();
        if (routeHeaders != null && routeHeaders.getFirst() != null) {
            InterfaceC12947f uri2 = ((Route) routeHeaders.getFirst()).getAddress().getURI();
            if (!uri2.isSipURI()) {
                throw new C10807n("First Route not a SIP URI");
            }
            InterfaceC12945d interfaceC12945d = (InterfaceC12945d) uri2;
            if (!interfaceC12945d.hasLrParam()) {
                fixStrictRouting(sIPRequest);
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Route post processing fixed strict routing");
                }
            }
            InterfaceC12943b interfaceC12943bCreateHop = createHop(interfaceC12945d, interfaceC13461b);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("NextHop based on Route:" + interfaceC12943bCreateHop);
            }
            return interfaceC12943bCreateHop;
        }
        if (uri.isSipURI()) {
            InterfaceC12945d interfaceC12945d2 = (InterfaceC12945d) uri;
            if (interfaceC12945d2.getMAddrParam() != null) {
                InterfaceC12943b interfaceC12943bCreateHop2 = createHop(interfaceC12945d2, interfaceC13461b);
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Using request URI maddr to route the request = " + interfaceC12943bCreateHop2.toString());
                }
                return interfaceC12943bCreateHop2;
            }
        }
        if (this.defaultRoute != null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Using outbound proxy to route the request = " + this.defaultRoute.toString());
            }
            return this.defaultRoute;
        }
        if (!uri.isSipURI()) {
            InternalErrorHandler.handleException("Unexpected non-sip URI", logger);
            return null;
        }
        InterfaceC12943b interfaceC12943bCreateHop3 = createHop((InterfaceC12945d) uri, interfaceC13461b);
        if (interfaceC12943bCreateHop3 != null && logger.isLoggingEnabled(32)) {
            logger.logDebug("Used request-URI for nextHop = " + interfaceC12943bCreateHop3.toString());
        } else if (logger.isLoggingEnabled(32)) {
            logger.logDebug("returning null hop -- loop detected");
        }
        return interfaceC12943bCreateHop3;
    }

    public ListIterator getNextHops(InterfaceC13461b interfaceC13461b) {
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(getNextHop(interfaceC13461b));
            return linkedList.listIterator();
        } catch (C10807n unused) {
            return null;
        }
    }

    @Override // p691d.InterfaceC12944c
    public InterfaceC12943b getOutboundProxy() {
        return this.defaultRoute;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultRouter(InterfaceC10811r interfaceC10811r, String str) {
        SIPTransactionStack sIPTransactionStack = (SIPTransactionStack) interfaceC10811r;
        this.sipStack = sIPTransactionStack;
        if (str != null) {
            try {
                this.defaultRoute = sIPTransactionStack.getAddressResolver().resolveAddress(new HopImpl(str));
            } catch (IllegalArgumentException e10) {
                logger.logError("Invalid default route specification - need host:port/transport");
                throw e10;
            }
        }
    }
}
