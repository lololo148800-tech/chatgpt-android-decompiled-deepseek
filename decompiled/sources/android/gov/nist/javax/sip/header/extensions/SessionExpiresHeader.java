package android.gov.nist.javax.sip.header.extensions;

import java.util.Iterator;
import p713e.InterfaceC13200H;
import p713e.InterfaceC13248v;
import p713e.InterfaceC13250x;

/* JADX INFO: loaded from: classes.dex */
public interface SessionExpiresHeader extends InterfaceC13200H, InterfaceC13250x, InterfaceC13248v {
    public static final String NAME = "Session-Expires";

    @Override // p713e.InterfaceC13250x
    /* synthetic */ Object clone();

    int getExpires();

    /* synthetic */ String getName();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ String getParameter(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ Iterator getParameterNames();

    String getRefresher();

    /* synthetic */ String getValue();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void removeParameter(String str);

    void setExpires(int i10);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void setParameter(String str, String str2);

    void setRefresher(String str);

    /* synthetic */ void setValue(String str);
}
