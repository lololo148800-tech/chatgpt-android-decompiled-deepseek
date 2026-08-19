package sc;

import p860l0.C16685J0;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: sc.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C19532n extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C16685J0 f62047Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f62048Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16685J0 f62049o0;

    /* JADX INFO: renamed from: p0 */
    public int f62050p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19532n(C16685J0 c16685j0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f62049o0 = c16685j0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f62048Z = obj;
        this.f62050p0 |= Integer.MIN_VALUE;
        return this.f62049o0.m18503c(this);
    }
}
