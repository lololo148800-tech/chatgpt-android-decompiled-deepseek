package p341Ni;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ni.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C5756M extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C5784h0 f18734Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f18735Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5784h0 f18736o0;

    /* JADX INFO: renamed from: p0 */
    public int f18737p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5756M(C5784h0 c5784h0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f18736o0 = c5784h0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f18735Z = obj;
        this.f18737p0 |= Integer.MIN_VALUE;
        return C5784h0.m6167a(this.f18736o0, null, null, null, this);
    }
}
