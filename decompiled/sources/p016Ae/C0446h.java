package p016Ae;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ae.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C0446h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f1447Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0452n f1448Z;

    /* JADX INFO: renamed from: o0 */
    public int f1449o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0446h(C0452n c0452n, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f1448Z = c0452n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f1447Y = obj;
        this.f1449o0 |= Integer.MIN_VALUE;
        return this.f1448Z.m1099g(0, 0, false, this);
    }
}
