package p344Nl;

import p275Kn.InterfaceC4814a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Nl.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C5841m extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f19098Y;

    /* JADX INFO: renamed from: Z */
    public Object f19099Z;

    /* JADX INFO: renamed from: o0 */
    public Object f19100o0;

    /* JADX INFO: renamed from: p0 */
    public InterfaceC4814a f19101p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f19102q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ Object f19103r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C5842n f19104s0;

    /* JADX INFO: renamed from: t0 */
    public int f19105t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5841m(C5842n c5842n, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f19104s0 = c5842n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f19103r0 = obj;
        this.f19105t0 |= Integer.MIN_VALUE;
        return this.f19104s0.m6254y(null, false, null, this);
    }
}
