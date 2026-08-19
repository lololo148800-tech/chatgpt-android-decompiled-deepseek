package cg;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: cg.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C11743o extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f35615Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11745q f35616Z;

    /* JADX INFO: renamed from: o0 */
    public int f35617o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11743o(C11745q c11745q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f35616Z = c11745q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f35615Y = obj;
        this.f35617o0 |= Integer.MIN_VALUE;
        return this.f35616Z.m13042h(null, null, this);
    }
}
