package p103Dn;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.i0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2185i0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2179f0 f6688Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f6689Z;

    /* JADX INFO: renamed from: o0 */
    public int f6690o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2179f0 f6691p0;

    /* JADX INFO: renamed from: q0 */
    public Object f6692q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2185i0(C2179f0 c2179f0, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6691p0 = c2179f0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6689Z = obj;
        this.f6690o0 |= Integer.MIN_VALUE;
        return this.f6691p0.mo395a(null, this);
    }
}
