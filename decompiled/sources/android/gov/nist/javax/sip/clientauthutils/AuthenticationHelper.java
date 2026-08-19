package android.gov.nist.javax.sip.clientauthutils;

import android.javax.sip.InterfaceC10794a;
import android.javax.sip.InterfaceC10810q;
import p735f.InterfaceC13461b;
import p735f.InterfaceC13462c;

/* JADX INFO: loaded from: classes.dex */
public interface AuthenticationHelper {
    InterfaceC10794a handleChallenge(InterfaceC13462c interfaceC13462c, InterfaceC10794a interfaceC10794a, InterfaceC10810q interfaceC10810q, int i10);

    InterfaceC10794a handleChallenge(InterfaceC13462c interfaceC13462c, InterfaceC10794a interfaceC10794a, InterfaceC10810q interfaceC10810q, int i10, boolean z6);

    void removeCachedAuthenticationHeaders(String str);

    void setAuthenticationHeaders(InterfaceC13461b interfaceC13461b);
}
