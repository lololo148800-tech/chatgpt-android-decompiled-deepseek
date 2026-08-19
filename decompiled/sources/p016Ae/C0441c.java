package p016Ae;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ae.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0441c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f1430Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0452n f1431Z;

    /* JADX INFO: renamed from: o0 */
    public int f1432o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0441c(C0452n c0452n, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f1431Z = c0452n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f1430Y = obj;
        this.f1432o0 |= Integer.MIN_VALUE;
        return this.f1431Z.m1094b(this);
    }
}
