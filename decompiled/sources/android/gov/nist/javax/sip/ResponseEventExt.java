package android.gov.nist.javax.sip;

import android.javax.sip.AbstractC10805l;
import android.javax.sip.InterfaceC10795b;
import p735f.InterfaceC13462c;

/* JADX INFO: loaded from: classes.dex */
public class ResponseEventExt extends AbstractC10805l {
    private boolean isForked;
    private boolean isRetransmission;
    private ClientTransactionExt m_originalTransaction;
    private String remoteIpAddress;
    private int remotePort;

    public ResponseEventExt(Object obj, ClientTransactionExt clientTransactionExt, InterfaceC10795b interfaceC10795b, InterfaceC13462c interfaceC13462c) {
        super(obj, clientTransactionExt, interfaceC10795b, interfaceC13462c);
        this.m_originalTransaction = clientTransactionExt;
    }

    public ClientTransactionExt getOriginalTransaction() {
        return this.m_originalTransaction;
    }

    public String getRemoteIpAddress() {
        return this.remoteIpAddress;
    }

    public int getRemotePort() {
        return this.remotePort;
    }

    public boolean isForkedResponse() {
        return this.isForked;
    }

    public boolean isRetransmission() {
        return this.isRetransmission;
    }

    public void setForkedResponse(boolean z6) {
        this.isForked = z6;
    }

    public void setOriginalTransaction(ClientTransactionExt clientTransactionExt) {
        this.m_originalTransaction = clientTransactionExt;
    }

    public void setRemoteIpAddress(String str) {
        this.remoteIpAddress = str;
    }

    public void setRemotePort(int i10) {
        this.remotePort = i10;
    }

    public void setRetransmission(boolean z6) {
        this.isRetransmission = z6;
    }
}
