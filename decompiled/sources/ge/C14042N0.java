package ge;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: ge.N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14042N0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C14053T0 f44144Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f44145Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14053T0 f44146o0;

    /* JADX INFO: renamed from: p0 */
    public int f44147p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14042N0(C14053T0 c14053t0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f44146o0 = c14053t0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f44145Z = obj;
        this.f44147p0 |= Integer.MIN_VALUE;
        return C14053T0.m15483c(this.f44146o0, this);
    }
}
