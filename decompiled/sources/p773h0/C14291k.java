package p773h0;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: h0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C14291k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C14297n f44867Y;

    /* JADX INFO: renamed from: Z */
    public long f44868Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f44869o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14297n f44870p0;

    /* JADX INFO: renamed from: q0 */
    public int f44871q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14291k(C14297n c14297n, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f44870p0 = c14297n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f44869o0 = obj;
        this.f44871q0 |= Integer.MIN_VALUE;
        return this.f44870p0.mo15582e(0L, null, this);
    }
}
