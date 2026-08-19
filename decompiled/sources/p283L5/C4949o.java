package p283L5;

import p026Ao.C0675i;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: L5.o */
/* JADX INFO: loaded from: classes.dex */
public final class C4949o extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C4951q f16138Y;

    /* JADX INFO: renamed from: Z */
    public C0675i f16139Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f16140o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4951q f16141p0;

    /* JADX INFO: renamed from: q0 */
    public int f16142q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4949o(C4951q c4951q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f16141p0 = c4951q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f16140o0 = obj;
        this.f16142q0 |= Integer.MIN_VALUE;
        return C4951q.m5592b(this.f16141p0, null, this);
    }
}
