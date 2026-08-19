package p860l0;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: l0.I0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16682I0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C16685J0 f53444Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53445Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16685J0 f53446o0;

    /* JADX INFO: renamed from: p0 */
    public int f53447p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16682I0(C16685J0 c16685j0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f53446o0 = c16685j0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f53445Z = obj;
        this.f53447p0 |= Integer.MIN_VALUE;
        return this.f53446o0.m18503c(this);
    }
}
