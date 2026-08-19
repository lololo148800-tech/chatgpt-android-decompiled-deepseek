package p854kf;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: kf.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C16388f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f50894Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16390h f50895Z;

    /* JADX INFO: renamed from: o0 */
    public int f50896o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16388f(C16390h c16390h, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f50895Z = c16390h;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f50894Y = obj;
        this.f50896o0 |= Integer.MIN_VALUE;
        return this.f50895Z.m17973c(this);
    }
}
