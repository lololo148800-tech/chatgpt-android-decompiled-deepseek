package p229J0;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: J0.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4049f1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C4055g1 f12773Y;

    /* JADX INFO: renamed from: Z */
    public long f12774Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f12775o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4055g1 f12776p0;

    /* JADX INFO: renamed from: q0 */
    public int f12777q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4049f1(C4055g1 c4055g1, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f12776p0 = c4055g1;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f12775o0 = obj;
        this.f12777q0 |= Integer.MIN_VALUE;
        return this.f12776p0.mo4039V(0L, 0L, this);
    }
}
