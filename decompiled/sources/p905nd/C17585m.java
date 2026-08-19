package p905nd;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: nd.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C17585m extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C17589q f56272Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f56273Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17589q f56274o0;

    /* JADX INFO: renamed from: p0 */
    public int f56275p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17585m(C17589q c17589q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f56274o0 = c17589q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f56273Z = obj;
        this.f56275p0 |= Integer.MIN_VALUE;
        return this.f56274o0.m19225k(this);
    }
}
