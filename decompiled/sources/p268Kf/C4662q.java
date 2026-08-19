package p268Kf;

import p403Qd.C6617X;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kf.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C4662q extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C4666u f15175Y;

    /* JADX INFO: renamed from: Z */
    public C6617X f15176Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f15177o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4666u f15178p0;

    /* JADX INFO: renamed from: q0 */
    public int f15179q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4662q(C4666u c4666u, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f15178p0 = c4666u;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15177o0 = obj;
        this.f15179q0 |= Integer.MIN_VALUE;
        return C4666u.m5374a(this.f15178p0, null, null, null, this);
    }
}
