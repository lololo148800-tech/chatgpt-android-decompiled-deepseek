package p273Kl;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kl.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C4780k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f15584Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4808y f15585Z;

    /* JADX INFO: renamed from: o0 */
    public int f15586o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4780k(C4808y c4808y, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f15585Z = c4808y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15584Y = obj;
        this.f15586o0 |= Integer.MIN_VALUE;
        return this.f15585Z.m5440d(this);
    }
}
