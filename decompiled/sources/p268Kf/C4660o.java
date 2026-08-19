package p268Kf;

import p049Bm.InterfaceC1436k;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kf.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C4660o extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C4666u f15165Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC1436k f15166Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f15167o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4666u f15168p0;

    /* JADX INFO: renamed from: q0 */
    public int f15169q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4660o(C4666u c4666u, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f15168p0 = c4666u;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15167o0 = obj;
        this.f15169q0 |= Integer.MIN_VALUE;
        return this.f15168p0.m5386l(null, this);
    }
}
