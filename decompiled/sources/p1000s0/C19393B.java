package p1000s0;

import p758g0.InterfaceC13772l;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: s0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C19393B extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public AbstractC19397F f61413Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC13772l f61414Z;

    /* JADX INFO: renamed from: o0 */
    public int f61415o0;

    /* JADX INFO: renamed from: p0 */
    public float f61416p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f61417q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ AbstractC19397F f61418r0;

    /* JADX INFO: renamed from: s0 */
    public int f61419s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19393B(AbstractC19397F abstractC19397F, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f61418r0 = abstractC19397F;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f61417q0 = obj;
        this.f61419s0 |= Integer.MIN_VALUE;
        return this.f61418r0.m20495f(0, 0.0f, null, this);
    }
}
