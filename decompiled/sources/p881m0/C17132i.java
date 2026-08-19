package p881m0;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: m0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C17132i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f54781Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17133j f54782Z;

    /* JADX INFO: renamed from: o0 */
    public int f54783o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17132i(C17133j c17133j, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f54782Z = c17133j;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f54781Y = obj;
        this.f54783o0 |= Integer.MIN_VALUE;
        return C17133j.m18897b(this.f54782Z, null, 0.0f, 0.0f, null, this);
    }
}
