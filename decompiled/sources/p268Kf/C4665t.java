package p268Kf;

import p403Qd.C6617X;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kf.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C4665t extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C4666u f15190Y;

    /* JADX INFO: renamed from: Z */
    public C6617X f15191Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f15192o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4666u f15193p0;

    /* JADX INFO: renamed from: q0 */
    public int f15194q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4665t(C4666u c4666u, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f15193p0 = c4666u;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15192o0 = obj;
        this.f15194q0 |= Integer.MIN_VALUE;
        return this.f15193p0.m5389o(null, null, this);
    }
}
