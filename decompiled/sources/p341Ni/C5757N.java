package p341Ni;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ni.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C5757N extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C5784h0 f18738Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f18739Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5784h0 f18740o0;

    /* JADX INFO: renamed from: p0 */
    public int f18741p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5757N(C5784h0 c5784h0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f18740o0 = c5784h0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f18739Z = obj;
        this.f18741p0 |= Integer.MIN_VALUE;
        return this.f18740o0.m6175h(this);
    }
}
