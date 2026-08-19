package ve;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: ve.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C20587k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C20592p f65323Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f65324Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20592p f65325o0;

    /* JADX INFO: renamed from: p0 */
    public int f65326p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20587k(C20592p c20592p, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f65325o0 = c20592p;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f65324Z = obj;
        this.f65326p0 |= Integer.MIN_VALUE;
        return this.f65325o0.m21189c(this);
    }
}
