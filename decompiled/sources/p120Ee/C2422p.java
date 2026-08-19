package p120Ee;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ee.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C2422p extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2423q f7529Y;

    /* JADX INFO: renamed from: Z */
    public String f7530Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f7531o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2423q f7532p0;

    /* JADX INFO: renamed from: q0 */
    public int f7533q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2422p(C2423q c2423q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f7532p0 = c2423q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f7531o0 = obj;
        this.f7533q0 |= Integer.MIN_VALUE;
        return C2423q.m3578c(this.f7532p0, null, null, null, this);
    }
}
