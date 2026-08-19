package p273Kl;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kl.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C4796s extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f15642Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f15643Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4808y f15644o0;

    /* JADX INFO: renamed from: p0 */
    public int f15645p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4796s(C4808y c4808y, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f15644o0 = c4808y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15643Z = obj;
        this.f15645p0 |= Integer.MIN_VALUE;
        return this.f15644o0.m5442f(null, this);
    }
}
