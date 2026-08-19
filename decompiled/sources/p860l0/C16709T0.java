package p860l0;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: l0.T0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16709T0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public long f53526Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53527Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16711U0 f53528o0;

    /* JADX INFO: renamed from: p0 */
    public int f53529p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16709T0(C16711U0 c16711u0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f53528o0 = c16711u0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f53527Z = obj;
        this.f53529p0 |= Integer.MIN_VALUE;
        return this.f53528o0.mo4039V(0L, 0L, this);
    }
}
