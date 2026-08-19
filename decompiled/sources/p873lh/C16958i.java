package p873lh;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: lh.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C16958i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C16961l f54424Y;

    /* JADX INFO: renamed from: Z */
    public String f54425Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f54426o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16961l f54427p0;

    /* JADX INFO: renamed from: q0 */
    public int f54428q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16958i(C16961l c16961l, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f54427p0 = c16961l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f54426o0 = obj;
        this.f54428q0 |= Integer.MIN_VALUE;
        return this.f54427p0.m18595f(null, this);
    }
}
