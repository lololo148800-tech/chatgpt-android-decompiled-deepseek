package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.message.SIPRequest;
import p691d.InterfaceC12943b;

/* JADX INFO: loaded from: classes.dex */
public interface AckSendingStrategy {
    InterfaceC12943b getLastHop();

    void send(SIPRequest sIPRequest);
}
