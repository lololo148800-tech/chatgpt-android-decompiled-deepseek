package android.gov.nist.javax.sip.header;

import p691d.InterfaceC12947f;

/* JADX INFO: loaded from: classes.dex */
public interface SipRequestLine {
    String getMethod();

    String getSipVersion();

    InterfaceC12947f getUri();

    String getVersionMajor();

    String getVersionMinor();

    void setMethod(String str);

    void setSipVersion(String str);

    void setUri(InterfaceC12947f interfaceC12947f);
}
