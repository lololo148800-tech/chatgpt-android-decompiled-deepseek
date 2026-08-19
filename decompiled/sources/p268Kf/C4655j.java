package p268Kf;

import p403Qd.C6617X;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kf.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C4655j extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C4666u f15138Y;

    /* JADX INFO: renamed from: Z */
    public C6617X f15139Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f15140o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4666u f15141p0;

    /* JADX INFO: renamed from: q0 */
    public int f15142q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4655j(C4666u c4666u, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f15141p0 = c4666u;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15140o0 = obj;
        this.f15142q0 |= Integer.MIN_VALUE;
        return this.f15141p0.m5382g(null, null, this);
    }
}
