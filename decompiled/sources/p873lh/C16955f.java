package p873lh;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: lh.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C16955f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C16961l f54418Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f54419Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16961l f54420o0;

    /* JADX INFO: renamed from: p0 */
    public int f54421p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16955f(C16961l c16961l, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f54420o0 = c16961l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f54419Z = obj;
        this.f54421p0 |= Integer.MIN_VALUE;
        return this.f54420o0.mo1965a(this);
    }
}
