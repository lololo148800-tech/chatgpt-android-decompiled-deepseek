package cg;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: cg.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C11737i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f35594Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11745q f35595Z;

    /* JADX INFO: renamed from: o0 */
    public int f35596o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11737i(C11745q c11745q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f35595Z = c11745q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f35594Y = obj;
        this.f35596o0 |= Integer.MIN_VALUE;
        return this.f35595Z.m13039e(null, this);
    }
}
