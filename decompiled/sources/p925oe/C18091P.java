package p925oe;

import p066Cc.C1625b;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C18091P extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f57719Y;

    /* JADX INFO: renamed from: Z */
    public int f57720Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1625b f57721o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18091P(C1625b c1625b, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f57721o0 = c1625b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57719Y = obj;
        this.f57720Z |= Integer.MIN_VALUE;
        return this.f57721o0.mo395a(null, this);
    }
}
