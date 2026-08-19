package android.gov.nist.javax.sip;

import android.javax.sip.C10799f;

/* JADX INFO: loaded from: classes.dex */
public class IOExceptionEventExt extends C10799f {
    private final String myHost;
    private final int myPort;
    private Reason reason;

    public enum Reason {
        KeepAliveTimeout
    }

    public IOExceptionEventExt(Object obj, Reason reason, String str, int i10, String str2, int i11, String str3) {
        super(obj, str2, i11, str3);
        this.myHost = str;
        this.myPort = i10;
        this.reason = reason;
    }

    public String getLocalHost() {
        return this.myHost;
    }

    public int getLocalPort() {
        return this.myPort;
    }

    public String getPeerHost() {
        return getHost();
    }

    public int getPeerPort() {
        return getPort();
    }

    public Reason getReason() {
        return this.reason;
    }

    @Override // java.util.EventObject
    public String toString() {
        return "KeepAliveTimeoutEvent{myHost='" + this.myHost + "', myPort=" + this.myPort + ", peerHost='" + getHost() + "', peerPort=" + getPort() + ", transport='" + getTransport() + "'}";
    }
}
