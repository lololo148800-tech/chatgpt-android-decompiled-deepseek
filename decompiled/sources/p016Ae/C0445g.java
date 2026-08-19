package p016Ae;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ae.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C0445g extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public String f1442Y;

    /* JADX INFO: renamed from: Z */
    public String f1443Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f1444o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0452n f1445p0;

    /* JADX INFO: renamed from: q0 */
    public int f1446q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0445g(C0452n c0452n, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f1445p0 = c0452n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f1444o0 = obj;
        this.f1446q0 |= Integer.MIN_VALUE;
        return this.f1445p0.m1098f(null, null, this);
    }
}
