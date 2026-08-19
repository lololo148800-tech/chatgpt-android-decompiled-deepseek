package android.gov.nist.javax.sip.header.extensions;

import java.util.Iterator;
import p691d.InterfaceC12942a;
import p713e.InterfaceC13200H;
import p713e.InterfaceC13250x;
import p713e.InterfaceC13251y;

/* JADX INFO: loaded from: classes.dex */
public interface ReferredByHeader extends InterfaceC13251y, InterfaceC13200H, InterfaceC13250x {
    public static final String NAME = "Referred-By";

    @Override // p713e.InterfaceC13250x
    /* synthetic */ Object clone();

    @Override // p713e.InterfaceC13251y
    /* synthetic */ InterfaceC12942a getAddress();

    /* synthetic */ String getName();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ String getParameter(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ Iterator getParameterNames();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void removeParameter(String str);

    /* synthetic */ void setAddress(InterfaceC12942a interfaceC12942a);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void setParameter(String str, String str2);
}
