package p854kf;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: kf.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C16387e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f50890Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f50891Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16390h f50892o0;

    /* JADX INFO: renamed from: p0 */
    public int f50893p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16387e(C16390h c16390h, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f50892o0 = c16390h;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f50891Z = obj;
        this.f50893p0 |= Integer.MIN_VALUE;
        return this.f50892o0.m17972b(null, this);
    }
}
