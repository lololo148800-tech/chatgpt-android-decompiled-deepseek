package p351O2;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: O2.D */
/* JADX INFO: loaded from: classes.dex */
public final class C6081D extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C6084G f19793Y;

    /* JADX INFO: renamed from: Z */
    public Object f19794Z;

    /* JADX INFO: renamed from: o0 */
    public Object f19795o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f19796p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C6084G f19797q0;

    /* JADX INFO: renamed from: r0 */
    public int f19798r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6081D(C6084G c6084g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f19797q0 = c6084g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f19796p0 = obj;
        this.f19798r0 |= Integer.MIN_VALUE;
        return this.f19797q0.m6658j(null, null, this);
    }
}
