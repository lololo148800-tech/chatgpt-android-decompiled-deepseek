package android.gov.nist.javax.sip;

import android.gov.nist.core.net.AddressResolver;
import android.gov.nist.javax.sip.clientauthutils.AccountManager;
import android.gov.nist.javax.sip.clientauthutils.AuthenticationHelper;
import android.gov.nist.javax.sip.clientauthutils.SecureAccountManager;
import android.gov.nist.javax.sip.header.extensions.JoinHeader;
import android.gov.nist.javax.sip.header.extensions.ReplacesHeader;
import android.javax.sip.InterfaceC10795b;
import android.javax.sip.InterfaceC10801h;
import android.javax.sip.InterfaceC10810q;
import android.javax.sip.InterfaceC10811r;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Iterator;
import p691d.InterfaceC12944c;
import p713e.InterfaceC13252z;

/* JADX INFO: loaded from: classes.dex */
public interface SipStackExt extends InterfaceC10811r {
    /* synthetic */ InterfaceC10801h createListeningPoint(int i10, String str);

    /* synthetic */ InterfaceC10801h createListeningPoint(String str, int i10, String str2);

    /* synthetic */ InterfaceC10810q createSipProvider(InterfaceC10801h interfaceC10801h);

    /* synthetic */ void deleteListeningPoint(InterfaceC10801h interfaceC10801h);

    /* synthetic */ void deleteSipProvider(InterfaceC10810q interfaceC10810q);

    AuthenticationHelper getAuthenticationHelper(AccountManager accountManager, InterfaceC13252z interfaceC13252z);

    Collection<InterfaceC10795b> getDialogs();

    /* synthetic */ String getIPAddress();

    InterfaceC10795b getJoinDialog(JoinHeader joinHeader);

    /* synthetic */ Iterator getListeningPoints();

    SocketAddress getLocalAddressForTcpDst(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11);

    SocketAddress getLocalAddressForTlsDst(InetAddress inetAddress, int i10, InetAddress inetAddress2);

    InterfaceC10795b getReplacesDialog(ReplacesHeader replacesHeader);

    /* synthetic */ InterfaceC12944c getRouter();

    AuthenticationHelper getSecureAuthenticationHelper(SecureAccountManager secureAccountManager, InterfaceC13252z interfaceC13252z);

    /* synthetic */ Iterator getSipProviders();

    /* synthetic */ String getStackName();

    /* synthetic */ boolean isRetransmissionFilterActive();

    void setAddressResolver(AddressResolver addressResolver);

    void setEnabledCipherSuites(String[] strArr);

    /* synthetic */ void start();

    /* synthetic */ void stop();
}
