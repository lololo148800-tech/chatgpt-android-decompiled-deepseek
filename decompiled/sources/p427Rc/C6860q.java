package p427Rc;

import p049Bm.InterfaceC1436k;
import p275Kn.C4816c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rc.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C6860q extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f22022Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC1436k f22023Z;

    /* JADX INFO: renamed from: o0 */
    public C4816c f22024o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f22025p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C6861r f22026q0;

    /* JADX INFO: renamed from: r0 */
    public int f22027r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6860q(C6861r c6861r, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f22026q0 = c6861r;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f22025p0 = obj;
        this.f22027r0 |= Integer.MIN_VALUE;
        return this.f22026q0.m7283b(null, this);
    }
}
