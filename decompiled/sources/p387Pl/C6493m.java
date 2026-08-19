package p387Pl;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Pl.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C6493m extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C6494n f21060Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f21061Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6494n f21062o0;

    /* JADX INFO: renamed from: p0 */
    public int f21063p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6493m(C6494n c6494n, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f21062o0 = c6494n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f21061Z = obj;
        this.f21063p0 |= Integer.MIN_VALUE;
        return this.f21062o0.m7061q(this);
    }
}
