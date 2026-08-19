package p273Kl;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kl.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C4776i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f15575Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4808y f15576Z;

    /* JADX INFO: renamed from: o0 */
    public int f15577o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4776i(C4808y c4808y, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f15576Z = c4808y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15575Y = obj;
        this.f15577o0 |= Integer.MIN_VALUE;
        return this.f15576Z.m5439c(this);
    }
}
