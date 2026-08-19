package p103Dn;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.S */
/* JADX INFO: loaded from: classes2.dex */
public final class C2155S extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6601Y;

    /* JADX INFO: renamed from: Z */
    public int f6602Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2146N f6603o0;

    /* JADX INFO: renamed from: p0 */
    public Object f6604p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2155S(C2146N c2146n, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6603o0 = c2146n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6601Y = obj;
        this.f6602Z |= Integer.MIN_VALUE;
        return this.f6603o0.mo3141d(null, this);
    }
}
