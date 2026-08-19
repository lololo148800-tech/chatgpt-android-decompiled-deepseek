package p576Xe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xe.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C9486k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f28560Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9473F f28561Z;

    /* JADX INFO: renamed from: o0 */
    public int f28562o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9486k(C9473F c9473f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f28561Z = c9473f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28560Y = obj;
        this.f28562o0 |= Integer.MIN_VALUE;
        return this.f28561Z.m10008g(null, this);
    }
}
