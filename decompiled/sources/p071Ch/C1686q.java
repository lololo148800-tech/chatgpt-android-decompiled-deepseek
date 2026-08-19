package p071Ch;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ch.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C1686q extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f4769Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1692w f4770Z;

    /* JADX INFO: renamed from: o0 */
    public int f4771o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1686q(C1692w c1692w, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f4770Z = c1692w;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f4769Y = obj;
        this.f4771o0 |= Integer.MIN_VALUE;
        return this.f4770Z.m2508b(false, null, this);
    }
}
