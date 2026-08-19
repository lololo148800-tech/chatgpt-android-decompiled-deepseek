package android.gov.nist.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface SipStatusLine {
    String getReasonPhrase();

    String getSipVersion();

    int getStatusCode();

    String getVersionMajor();

    String getVersionMinor();

    void setReasonPhrase(String str);

    void setSipVersion(String str);

    void setStatusCode(int i10);
}
