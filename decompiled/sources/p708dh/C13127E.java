package p708dh;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: dh.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C13127E extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f41665Y;

    /* JADX INFO: renamed from: Z */
    public boolean f41666Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f41667o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13132J f41668p0;

    /* JADX INFO: renamed from: q0 */
    public int f41669q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13127E(C13132J c13132j, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f41668p0 = c13132j;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f41667o0 = obj;
        this.f41669q0 |= Integer.MIN_VALUE;
        return this.f41668p0.m14812i(false, this);
    }
}
