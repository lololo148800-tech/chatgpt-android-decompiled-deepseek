package android.gov.nist.javax.sip.stack;

import android.javax.sip.InterfaceC10811r;
import p735f.InterfaceC13460a;

/* JADX INFO: loaded from: classes.dex */
public interface SIPEventInterceptor {
    void afterMessage(InterfaceC13460a interfaceC13460a);

    void beforeMessage(InterfaceC13460a interfaceC13460a);

    void destroy();

    void init(InterfaceC10811r interfaceC10811r);
}
