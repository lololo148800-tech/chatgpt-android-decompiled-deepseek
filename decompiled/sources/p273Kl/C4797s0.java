package p273Kl;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kl.s0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4797s0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C4801u0 f15646Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f15647Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4801u0 f15648o0;

    /* JADX INFO: renamed from: p0 */
    public int f15649p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4797s0(C4801u0 c4801u0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f15648o0 = c4801u0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15647Z = obj;
        this.f15649p0 |= Integer.MIN_VALUE;
        return this.f15648o0.m5436a(this);
    }
}
