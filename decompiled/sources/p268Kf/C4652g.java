package p268Kf;

import p049Bm.InterfaceC1439n;
import p403Qd.C6617X;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kf.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C4652g extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C4666u f15124Y;

    /* JADX INFO: renamed from: Z */
    public C6617X f15125Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC1439n f15126o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f15127p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C4666u f15128q0;

    /* JADX INFO: renamed from: r0 */
    public int f15129r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4652g(C4666u c4666u, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f15128q0 = c4666u;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15127p0 = obj;
        this.f15129r0 |= Integer.MIN_VALUE;
        return this.f15128q0.m5380e(null, null, this);
    }
}
