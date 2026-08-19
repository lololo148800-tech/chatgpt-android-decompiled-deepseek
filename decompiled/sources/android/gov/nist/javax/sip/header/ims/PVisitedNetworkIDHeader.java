package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Token;
import java.util.Iterator;
import p713e.InterfaceC13200H;
import p713e.InterfaceC13250x;

/* JADX INFO: loaded from: classes.dex */
public interface PVisitedNetworkIDHeader extends InterfaceC13200H, InterfaceC13250x {
    public static final String NAME = "P-Visited-Network-ID";

    @Override // p713e.InterfaceC13250x
    /* synthetic */ Object clone();

    /* synthetic */ String getName();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ String getParameter(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ Iterator getParameterNames();

    String getVisitedNetworkID();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void removeParameter(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void setParameter(String str, String str2);

    void setVisitedNetworkID(Token token);

    void setVisitedNetworkID(String str);
}
