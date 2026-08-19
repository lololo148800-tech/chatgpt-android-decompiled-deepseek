package p268Kf;

import p403Qd.C6617X;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kf.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C4659n extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C4666u f15160Y;

    /* JADX INFO: renamed from: Z */
    public C6617X f15161Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f15162o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4666u f15163p0;

    /* JADX INFO: renamed from: q0 */
    public int f15164q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4659n(C4666u c4666u, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f15163p0 = c4666u;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15162o0 = obj;
        this.f15164q0 |= Integer.MIN_VALUE;
        return this.f15163p0.m5385k(null, null, this);
    }
}
