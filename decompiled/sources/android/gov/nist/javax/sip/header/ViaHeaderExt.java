package android.gov.nist.javax.sip.header;

import java.util.Iterator;
import p713e.InterfaceC13231g0;

/* JADX INFO: loaded from: classes.dex */
public interface ViaHeaderExt extends InterfaceC13231g0 {
    @Override // p713e.InterfaceC13250x
    /* synthetic */ Object clone();

    /* synthetic */ String getBranch();

    /* synthetic */ String getHost();

    /* synthetic */ String getMAddr();

    /* synthetic */ String getName();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ String getParameter(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ Iterator getParameterNames();

    /* synthetic */ int getPort();

    /* synthetic */ String getProtocol();

    /* synthetic */ int getRPort();

    /* synthetic */ String getReceived();

    String getSentByField();

    String getSentProtocolField();

    /* synthetic */ int getTTL();

    /* synthetic */ String getTransport();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void removeParameter(String str);

    /* synthetic */ void setBranch(String str);

    /* synthetic */ void setHost(String str);

    /* synthetic */ void setMAddr(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void setParameter(String str, String str2);

    /* synthetic */ void setPort(int i10);

    /* synthetic */ void setProtocol(String str);

    /* synthetic */ void setRPort();

    /* synthetic */ void setReceived(String str);

    /* synthetic */ void setTTL(int i10);

    /* synthetic */ void setTransport(String str);
}
