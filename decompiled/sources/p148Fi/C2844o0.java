package p148Fi;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Fi.o0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2844o0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2854t0 f8590Y;

    /* JADX INFO: renamed from: Z */
    public String f8591Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f8592o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2854t0 f8593p0;

    /* JADX INFO: renamed from: q0 */
    public int f8594q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2844o0(C2854t0 c2854t0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f8593p0 = c2854t0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f8592o0 = obj;
        this.f8594q0 |= Integer.MIN_VALUE;
        return this.f8593p0.m3715a(null, null, null, null, this);
    }
}
