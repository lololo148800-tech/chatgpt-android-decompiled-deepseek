package android.gov.nist.javax.sip.header;

import java.util.Iterator;
import java.util.Map;
import p691d.InterfaceC12942a;
import p713e.InterfaceC13200H;

/* JADX INFO: loaded from: classes.dex */
public interface AddressParameters extends InterfaceC13200H {
    InterfaceC12942a getAddress();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ String getParameter(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ Iterator getParameterNames();

    Map<String, Map.Entry<String, String>> getParameters();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void removeParameter(String str);

    void setAddress(InterfaceC12942a interfaceC12942a);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void setParameter(String str, String str2);
}
