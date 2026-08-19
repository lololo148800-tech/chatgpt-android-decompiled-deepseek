package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.message.SIPRequest;
import android.javax.sip.InterfaceC10811r;
import p735f.InterfaceC13462c;

/* JADX INFO: loaded from: classes.dex */
public interface SIPMessageValve {
    void destroy();

    void init(InterfaceC10811r interfaceC10811r);

    boolean processRequest(SIPRequest sIPRequest, MessageChannel messageChannel);

    boolean processResponse(InterfaceC13462c interfaceC13462c, MessageChannel messageChannel);
}
