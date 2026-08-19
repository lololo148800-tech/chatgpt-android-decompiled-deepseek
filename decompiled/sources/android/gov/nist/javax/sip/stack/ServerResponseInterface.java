package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.message.SIPResponse;

/* JADX INFO: loaded from: classes.dex */
public interface ServerResponseInterface {
    void processResponse(SIPResponse sIPResponse, MessageChannel messageChannel);

    void processResponse(SIPResponse sIPResponse, MessageChannel messageChannel, SIPDialog sIPDialog);
}
