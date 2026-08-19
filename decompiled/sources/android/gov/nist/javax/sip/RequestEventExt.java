package android.gov.nist.javax.sip;

import android.javax.sip.AbstractC10804k;
import android.javax.sip.InterfaceC10795b;
import android.javax.sip.InterfaceC10806m;
import p735f.InterfaceC13461b;

/* JADX INFO: loaded from: classes.dex */
public class RequestEventExt extends AbstractC10804k {
    private String remoteIpAddress;
    private int remotePort;

    public RequestEventExt(Object obj, InterfaceC10806m interfaceC10806m, InterfaceC10795b interfaceC10795b, InterfaceC13461b interfaceC13461b) {
        super(obj, interfaceC10806m, interfaceC10795b, interfaceC13461b);
    }

    public String getRemoteIpAddress() {
        return this.remoteIpAddress;
    }

    public int getRemotePort() {
        return this.remotePort;
    }

    public void setRemoteIpAddress(String str) {
        this.remoteIpAddress = str;
    }

    public void setRemotePort(int i10) {
        this.remotePort = i10;
    }
}
