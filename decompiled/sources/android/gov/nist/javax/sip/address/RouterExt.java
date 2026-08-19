package android.gov.nist.javax.sip.address;

import java.util.ListIterator;
import p691d.InterfaceC12943b;
import p691d.InterfaceC12944c;
import p735f.InterfaceC13461b;

/* JADX INFO: loaded from: classes.dex */
public interface RouterExt extends InterfaceC12944c {
    @Override // p691d.InterfaceC12944c
    /* synthetic */ InterfaceC12943b getNextHop(InterfaceC13461b interfaceC13461b);

    /* synthetic */ ListIterator getNextHops(InterfaceC13461b interfaceC13461b);

    @Override // p691d.InterfaceC12944c
    /* synthetic */ InterfaceC12943b getOutboundProxy();

    void transactionTimeout(InterfaceC12943b interfaceC12943b);
}
