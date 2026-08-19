package android.gov.nist.javax.sip.clientauthutils;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.stack.SIPClientTransaction;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import android.javax.sip.C10797d;
import android.javax.sip.C10800g;
import android.javax.sip.C10807n;
import android.javax.sip.InterfaceC10794a;
import android.javax.sip.InterfaceC10810q;
import java.text.ParseException;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Timer;
import p691d.InterfaceC12943b;
import p691d.InterfaceC12945d;
import p691d.InterfaceC12947f;
import p713e.InterfaceC13202J;
import p713e.InterfaceC13231g0;
import p713e.InterfaceC13232h;
import p713e.InterfaceC13233h0;
import p713e.InterfaceC13234i;
import p713e.InterfaceC13252z;
import p735f.InterfaceC13461b;
import p735f.InterfaceC13462c;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticationHelperImpl implements AuthenticationHelper {
    private static StackLogger logger = CommonLogger.getLogger(AuthenticationHelperImpl.class);
    private Object accountManager;
    private CredentialsCache cachedCredentials;
    private InterfaceC13252z headerFactory;
    private SIPTransactionStack sipStack;
    Timer timer;

    public AuthenticationHelperImpl(SIPTransactionStack sIPTransactionStack, AccountManager accountManager, InterfaceC13252z interfaceC13252z) {
        this.accountManager = accountManager;
        this.headerFactory = interfaceC13252z;
        this.sipStack = sIPTransactionStack;
        this.cachedCredentials = new CredentialsCache(sIPTransactionStack.getTimer());
    }

    private InterfaceC13232h getAuthorization(String str, String str2, String str3, InterfaceC13233h0 interfaceC13233h0, UserCredentials userCredentials) {
        String str4 = interfaceC13233h0.getQop() != null ? "auth" : null;
        String strCalculateResponse = MessageDigestAlgorithm.calculateResponse(interfaceC13233h0.getAlgorithm(), userCredentials.getUserName(), interfaceC13233h0.getRealm(), userCredentials.getPassword(), interfaceC13233h0.getNonce(), "00000001", "xyz", str, str2, str3, str4, logger);
        try {
            InterfaceC13232h interfaceC13232hCreateProxyAuthorizationHeader = interfaceC13233h0 instanceof InterfaceC13202J ? this.headerFactory.createProxyAuthorizationHeader(interfaceC13233h0.getScheme()) : this.headerFactory.createAuthorizationHeader(interfaceC13233h0.getScheme());
            interfaceC13232hCreateProxyAuthorizationHeader.setUsername(userCredentials.getUserName());
            interfaceC13232hCreateProxyAuthorizationHeader.setRealm(interfaceC13233h0.getRealm());
            interfaceC13232hCreateProxyAuthorizationHeader.setNonce(interfaceC13233h0.getNonce());
            interfaceC13232hCreateProxyAuthorizationHeader.setParameter("uri", str2);
            interfaceC13232hCreateProxyAuthorizationHeader.setResponse(strCalculateResponse);
            if (interfaceC13233h0.getAlgorithm() != null) {
                interfaceC13232hCreateProxyAuthorizationHeader.setAlgorithm(interfaceC13233h0.getAlgorithm());
            }
            if (interfaceC13233h0.getOpaque() != null) {
                interfaceC13232hCreateProxyAuthorizationHeader.setOpaque(interfaceC13233h0.getOpaque());
            }
            if (str4 != null) {
                interfaceC13232hCreateProxyAuthorizationHeader.setQop(str4);
                interfaceC13232hCreateProxyAuthorizationHeader.setCNonce("xyz");
                interfaceC13232hCreateProxyAuthorizationHeader.setNonceCount(Integer.parseInt("00000001"));
            }
            interfaceC13232hCreateProxyAuthorizationHeader.setResponse(strCalculateResponse);
            return interfaceC13232hCreateProxyAuthorizationHeader;
        } catch (ParseException unused) {
            throw new RuntimeException("Failed to create an authorization header!");
        }
    }

    private void removeBranchID(InterfaceC13461b interfaceC13461b) {
        ((InterfaceC13231g0) interfaceC13461b.getHeader(SIPHeaderNames.VIA)).removeParameter("branch");
    }

    @Override // android.gov.nist.javax.sip.clientauthutils.AuthenticationHelper
    public InterfaceC10794a handleChallenge(InterfaceC13462c interfaceC13462c, InterfaceC10794a interfaceC10794a, InterfaceC10810q interfaceC10810q, int i10) {
        return handleChallenge(interfaceC13462c, interfaceC10794a, interfaceC10810q, i10, false);
    }

    @Override // android.gov.nist.javax.sip.clientauthutils.AuthenticationHelper
    public void removeCachedAuthenticationHeaders(String str) {
        if (str == null) {
            throw new NullPointerException("Null callId argument ");
        }
        this.cachedCredentials.removeAuthenticationHeader(str);
    }

    @Override // android.gov.nist.javax.sip.clientauthutils.AuthenticationHelper
    public void setAuthenticationHeaders(InterfaceC13461b interfaceC13461b) {
        String callId = ((SIPRequest) interfaceC13461b).getCallId().getCallId();
        interfaceC13461b.removeHeader(SIPHeaderNames.AUTHORIZATION);
        Collection<InterfaceC13232h> cachedAuthorizationHeaders = this.cachedCredentials.getCachedAuthorizationHeaders(callId);
        if (cachedAuthorizationHeaders == null) {
            if (logger.isLoggingEnabled(32)) {
                AbstractC10763a.m11065w("Could not find authentication headers for ", callId, logger);
            }
        } else {
            Iterator<InterfaceC13232h> it = cachedAuthorizationHeaders.iterator();
            while (it.hasNext()) {
                interfaceC13461b.addHeader(it.next());
            }
        }
    }

    @Override // android.gov.nist.javax.sip.clientauthutils.AuthenticationHelper
    public InterfaceC10794a handleChallenge(InterfaceC13462c interfaceC13462c, InterfaceC10794a interfaceC10794a, InterfaceC10810q interfaceC10810q, int i10, boolean z6) throws C10807n {
        InterfaceC13461b interfaceC13461bCreateRequest;
        ListIterator headers;
        InterfaceC13232h authorization;
        try {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("handleChallenge: " + interfaceC13462c);
            }
            SIPRequest sIPRequest = (SIPRequest) interfaceC10794a.getRequest();
            if (sIPRequest.getToTag() == null && interfaceC10794a.getDialog() != null && interfaceC10794a.getDialog().getState() == C10797d.f32034p0) {
                interfaceC13461bCreateRequest = interfaceC10794a.getDialog().createRequest(sIPRequest.getMethod());
                ListIterator<String> headerNames = sIPRequest.getHeaderNames();
                while (headerNames.hasNext()) {
                    String next = headerNames.next();
                    if (interfaceC13461bCreateRequest.getHeader(next) == null) {
                        ListIterator<SIPHeader> headers2 = sIPRequest.getHeaders(next);
                        while (headers2.hasNext()) {
                            interfaceC13461bCreateRequest.addHeader(headers2.next());
                        }
                    }
                }
            } else {
                interfaceC13461bCreateRequest = (InterfaceC13461b) sIPRequest.clone();
            }
            removeBranchID(interfaceC13461bCreateRequest);
            if (interfaceC13462c == null || interfaceC13461bCreateRequest == null) {
                throw new NullPointerException("A null argument was passed to handle challenge.");
            }
            if (interfaceC13462c.getStatusCode() == 401) {
                headers = interfaceC13462c.getHeaders(SIPHeaderNames.WWW_AUTHENTICATE);
            } else {
                if (interfaceC13462c.getStatusCode() != 407) {
                    throw new IllegalArgumentException("Unexpected status code ");
                }
                headers = interfaceC13462c.getHeaders(SIPHeaderNames.PROXY_AUTHENTICATE);
            }
            if (headers == null) {
                throw new IllegalArgumentException("Could not find WWWAuthenticate or ProxyAuthenticate headers");
            }
            interfaceC13461bCreateRequest.removeHeader(SIPHeaderNames.AUTHORIZATION);
            interfaceC13461bCreateRequest.removeHeader(SIPHeaderNames.PROXY_AUTHORIZATION);
            InterfaceC13234i interfaceC13234i = (InterfaceC13234i) interfaceC13461bCreateRequest.getHeader(SIPHeaderNames.CSEQ);
            try {
                interfaceC13234i.setSeqNumber(interfaceC13234i.getSeqNumber() + 1);
                if (!z6 && sIPRequest.getRouteHeaders() == null) {
                    InterfaceC12943b nextHop = ((SIPClientTransaction) interfaceC10794a).getNextHop();
                    InterfaceC12945d interfaceC12945d = (InterfaceC12945d) interfaceC13461bCreateRequest.getRequestURI();
                    interfaceC12945d.setMAddrParam(nextHop.getHost());
                    if (nextHop.getPort() != -1) {
                        interfaceC12945d.setPort(nextHop.getPort());
                    }
                }
                InterfaceC10794a newClientTransaction = interfaceC10810q.getNewClientTransaction(interfaceC13461bCreateRequest);
                while (headers.hasNext()) {
                    InterfaceC13233h0 interfaceC13233h0 = (InterfaceC13233h0) headers.next();
                    String realm = interfaceC13233h0.getRealm();
                    Object obj = this.accountManager;
                    if (obj instanceof SecureAccountManager) {
                        UserCredentialHash credentialHash = ((SecureAccountManager) obj).getCredentialHash(interfaceC10794a, realm);
                        if (credentialHash == null) {
                            logger.logDebug("Could not find creds");
                            throw new C10807n("Cannot find user creds for the given user name and realm");
                        }
                        InterfaceC12947f requestURI = interfaceC13461bCreateRequest.getRequestURI();
                        credentialHash.getSipDomain();
                        authorization = getAuthorization(interfaceC13461bCreateRequest.getMethod(), requestURI.toString(), interfaceC13461bCreateRequest.getContent() == null ? "" : new String(interfaceC13461bCreateRequest.getRawContent()), interfaceC13233h0, credentialHash);
                    } else {
                        UserCredentials credentials = ((AccountManager) obj).getCredentials(interfaceC10794a, realm);
                        if (credentials == null) {
                            throw new C10807n("Cannot find user creds for the given user name and realm");
                        }
                        credentials.getSipDomain();
                        authorization = getAuthorization(interfaceC13461bCreateRequest.getMethod(), interfaceC13461bCreateRequest.getRequestURI().toString(), interfaceC13461bCreateRequest.getContent() == null ? "" : new String(interfaceC13461bCreateRequest.getRawContent()), interfaceC13233h0, credentials);
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Created authorization header: " + authorization.toString());
                    }
                    if (i10 != 0) {
                        this.cachedCredentials.cacheAuthorizationHeader(sIPRequest.getCallId().getCallId(), authorization, i10);
                    }
                    interfaceC13461bCreateRequest.addHeader(authorization);
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Returning authorization transaction." + newClientTransaction);
                }
                return newClientTransaction;
            } catch (C10800g unused) {
                throw new C10807n("Invalid CSeq -- could not increment : " + interfaceC13234i.getSeqNumber());
            }
        } catch (C10807n e10) {
            throw e10;
        } catch (Exception e11) {
            logger.logError("Unexpected exception ", e11);
            throw new C10807n("Unexpected exception ", e11);
        }
    }

    public AuthenticationHelperImpl(SIPTransactionStack sIPTransactionStack, SecureAccountManager secureAccountManager, InterfaceC13252z interfaceC13252z) {
        this.accountManager = secureAccountManager;
        this.headerFactory = interfaceC13252z;
        this.sipStack = sIPTransactionStack;
        this.cachedCredentials = new CredentialsCache(sIPTransactionStack.getTimer());
    }

    private InterfaceC13232h getAuthorization(String str, String str2, String str3, InterfaceC13233h0 interfaceC13233h0, UserCredentialHash userCredentialHash) {
        InterfaceC13232h interfaceC13232hCreateAuthorizationHeader;
        String str4 = interfaceC13233h0.getQop() != null ? "auth" : null;
        String strCalculateResponse = MessageDigestAlgorithm.calculateResponse(interfaceC13233h0.getAlgorithm(), userCredentialHash.getHashUserDomainPassword(), interfaceC13233h0.getNonce(), "00000001", "xyz", str, str2, str3, str4, logger);
        try {
            if (interfaceC13233h0 instanceof InterfaceC13202J) {
                interfaceC13232hCreateAuthorizationHeader = this.headerFactory.createProxyAuthorizationHeader(interfaceC13233h0.getScheme());
            } else {
                interfaceC13232hCreateAuthorizationHeader = this.headerFactory.createAuthorizationHeader(interfaceC13233h0.getScheme());
            }
            interfaceC13232hCreateAuthorizationHeader.setUsername(userCredentialHash.getUserName());
            interfaceC13232hCreateAuthorizationHeader.setRealm(interfaceC13233h0.getRealm());
            interfaceC13232hCreateAuthorizationHeader.setNonce(interfaceC13233h0.getNonce());
            interfaceC13232hCreateAuthorizationHeader.setParameter("uri", str2);
            interfaceC13232hCreateAuthorizationHeader.setResponse(strCalculateResponse);
            if (interfaceC13233h0.getAlgorithm() != null) {
                interfaceC13232hCreateAuthorizationHeader.setAlgorithm(interfaceC13233h0.getAlgorithm());
            }
            if (interfaceC13233h0.getOpaque() != null) {
                interfaceC13232hCreateAuthorizationHeader.setOpaque(interfaceC13233h0.getOpaque());
            }
            if (str4 != null) {
                interfaceC13232hCreateAuthorizationHeader.setQop(str4);
                interfaceC13232hCreateAuthorizationHeader.setCNonce("xyz");
                interfaceC13232hCreateAuthorizationHeader.setNonceCount(Integer.parseInt("00000001"));
            }
            interfaceC13232hCreateAuthorizationHeader.setResponse(strCalculateResponse);
            return interfaceC13232hCreateAuthorizationHeader;
        } catch (ParseException unused) {
            throw new RuntimeException("Failed to create an authorization header!");
        }
    }
}
