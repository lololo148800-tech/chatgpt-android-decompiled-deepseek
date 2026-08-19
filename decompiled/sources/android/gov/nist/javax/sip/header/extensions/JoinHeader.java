package android.gov.nist.javax.sip.header.extensions;

import java.util.Iterator;
import p713e.InterfaceC13200H;
import p713e.InterfaceC13250x;

/* JADX INFO: loaded from: classes.dex */
public interface JoinHeader extends InterfaceC13200H, InterfaceC13250x {
    public static final String NAME = "Join";

    @Override // p713e.InterfaceC13250x
    /* synthetic */ Object clone();

    String getCallId();

    String getFromTag();

    /* synthetic */ String getName();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ String getParameter(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ Iterator getParameterNames();

    String getToTag();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void removeParameter(String str);

    void setCallId(String str);

    void setFromTag(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void setParameter(String str, String str2);

    void setToTag(String str);
}
