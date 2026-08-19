package cg;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: cg.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C11739k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f35601Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11745q f35602Z;

    /* JADX INFO: renamed from: o0 */
    public int f35603o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11739k(C11745q c11745q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f35602Z = c11745q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f35601Y = obj;
        this.f35603o0 |= Integer.MIN_VALUE;
        return this.f35602Z.m13040f(null, this);
    }
}
