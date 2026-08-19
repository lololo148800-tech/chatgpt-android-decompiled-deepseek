package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.message.SIPRequest;

/* JADX INFO: loaded from: classes.dex */
public interface ServerRequestInterface {
    void processRequest(SIPRequest sIPRequest, MessageChannel messageChannel);
}
