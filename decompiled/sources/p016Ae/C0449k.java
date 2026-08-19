package p016Ae;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ae.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C0449k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f1456Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0452n f1457Z;

    /* JADX INFO: renamed from: o0 */
    public int f1458o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0449k(C0452n c0452n, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f1457Z = c0452n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f1456Y = obj;
        this.f1458o0 |= Integer.MIN_VALUE;
        return this.f1457Z.m1102j(null, null, this);
    }
}
