package p905nd;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: nd.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C17579g extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f56238Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17589q f56239Z;

    /* JADX INFO: renamed from: o0 */
    public int f56240o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17579g(C17589q c17589q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f56239Z = c17589q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f56238Y = obj;
        this.f56240o0 |= Integer.MIN_VALUE;
        return this.f56239Z.m19220f(this);
    }
}
