package p103Dn;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.K */
/* JADX INFO: loaded from: classes2.dex */
public final class C2140K extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2142L f6553Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f6554Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2142L f6555o0;

    /* JADX INFO: renamed from: p0 */
    public int f6556p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2140K(C2142L c2142l, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6555o0 = c2142l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6554Z = obj;
        this.f6556p0 |= Integer.MIN_VALUE;
        return this.f6555o0.mo395a(null, this);
    }
}
