package p273Kl;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kl.R0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4742R0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f15448Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4750V0 f15449Z;

    /* JADX INFO: renamed from: o0 */
    public int f15450o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4742R0(C4750V0 c4750v0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f15449Z = c4750v0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15448Y = obj;
        this.f15450o0 |= Integer.MIN_VALUE;
        return this.f15449Z.m5428r(null, null, null, this);
    }
}
