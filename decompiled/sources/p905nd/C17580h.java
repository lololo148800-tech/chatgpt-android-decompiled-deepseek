package p905nd;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: nd.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C17580h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C17589q f56241Y;

    /* JADX INFO: renamed from: Z */
    public String f56242Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f56243o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C17589q f56244p0;

    /* JADX INFO: renamed from: q0 */
    public int f56245q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17580h(C17589q c17589q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f56244p0 = c17589q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f56243o0 = obj;
        this.f56245q0 |= Integer.MIN_VALUE;
        return this.f56244p0.m19221g(this);
    }
}
