package p854kf;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: kf.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C16386d extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f50886Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f50887Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16390h f50888o0;

    /* JADX INFO: renamed from: p0 */
    public int f50889p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16386d(C16390h c16390h, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f50888o0 = c16390h;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f50887Z = obj;
        this.f50889p0 |= Integer.MIN_VALUE;
        return this.f50888o0.m17971a(null, false, this);
    }
}
