package p283L5;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: L5.p */
/* JADX INFO: loaded from: classes.dex */
public final class C4950p extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f16143Y;

    /* JADX INFO: renamed from: Z */
    public Object f16144Z;

    /* JADX INFO: renamed from: o0 */
    public Object f16145o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f16146p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C4951q f16147q0;

    /* JADX INFO: renamed from: r0 */
    public int f16148r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4950p(C4951q c4951q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f16147q0 = c4951q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f16146p0 = obj;
        this.f16148r0 |= Integer.MIN_VALUE;
        return C4951q.m5593c(this.f16147q0, null, null, null, this);
    }
}
