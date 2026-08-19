package p016Ae;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ae.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C0447i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f1450Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0452n f1451Z;

    /* JADX INFO: renamed from: o0 */
    public int f1452o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0447i(C0452n c0452n, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f1451Z = c0452n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f1450Y = obj;
        this.f1452o0 |= Integer.MIN_VALUE;
        return this.f1451Z.m1100h(null, this);
    }
}
