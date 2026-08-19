package p556Wk;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Wk.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C8902P extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C8903Q f27245Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f27246Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8903Q f27247o0;

    /* JADX INFO: renamed from: p0 */
    public int f27248p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8902P(C8903Q c8903q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f27247o0 = c8903q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f27246Z = obj;
        this.f27248p0 |= Integer.MIN_VALUE;
        return this.f27247o0.mo9562a(null, this);
    }
}
