package p402Qc;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Qc.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C6594j extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C6589e f21302Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f21303Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6589e f21304o0;

    /* JADX INFO: renamed from: p0 */
    public int f21305p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6594j(C6589e c6589e, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f21304o0 = c6589e;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f21303Z = obj;
        this.f21305p0 |= Integer.MIN_VALUE;
        return this.f21304o0.m7158V(null, this);
    }
}
