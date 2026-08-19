package p059C5;

import p374P5.C6354g;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: C5.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1595m extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C6354g f4470Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f4471Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1596n f4472o0;

    /* JADX INFO: renamed from: p0 */
    public int f4473p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1595m(C1596n c1596n, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f4472o0 = c1596n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f4471Z = obj;
        this.f4473p0 |= Integer.MIN_VALUE;
        return this.f4472o0.m2444a(null, null, this);
    }
}
