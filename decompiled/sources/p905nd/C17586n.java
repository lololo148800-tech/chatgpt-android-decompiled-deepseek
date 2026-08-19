package p905nd;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: nd.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C17586n extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C17589q f56276Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f56277Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17589q f56278o0;

    /* JADX INFO: renamed from: p0 */
    public int f56279p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17586n(C17589q c17589q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f56278o0 = c17589q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f56277Z = obj;
        this.f56279p0 |= Integer.MIN_VALUE;
        return this.f56278o0.m19226l(this);
    }
}
