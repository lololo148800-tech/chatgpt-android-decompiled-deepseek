package p268Kf;

import p066Cc.C1625b;
import p103Dn.InterfaceC2186j;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kf.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C4654i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f15134Y;

    /* JADX INFO: renamed from: Z */
    public int f15135Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC2186j f15136o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C1625b f15137p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4654i(C1625b c1625b, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f15137p0 = c1625b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15134Y = obj;
        this.f15135Z |= Integer.MIN_VALUE;
        return this.f15137p0.mo395a(null, this);
    }
}
