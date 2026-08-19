package cg;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: cg.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C11733e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f35581Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11745q f35582Z;

    /* JADX INFO: renamed from: o0 */
    public int f35583o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11733e(C11745q c11745q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f35582Z = c11745q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f35581Y = obj;
        this.f35583o0 |= Integer.MIN_VALUE;
        return this.f35582Z.m13037c(this);
    }
}
