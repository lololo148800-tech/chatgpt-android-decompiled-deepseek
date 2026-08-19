package p385Pj;

import p002A0.C0132i;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Pj.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C6434i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f20891Y;

    /* JADX INFO: renamed from: Z */
    public int f20892Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0132i f20893o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6434i(C0132i c0132i, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f20893o0 = c0132i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f20891Y = obj;
        this.f20892Z |= Integer.MIN_VALUE;
        return this.f20893o0.mo395a(null, this);
    }
}
