package p328N1;

import fo.C13711h;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: N1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C5595k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C13711h f18126Y;

    /* JADX INFO: renamed from: Z */
    public C5594j f18127Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f18128o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13711h f18129p0;

    /* JADX INFO: renamed from: q0 */
    public int f18130q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5595k(C13711h c13711h, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f18129p0 = c13711h;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f18128o0 = obj;
        this.f18130q0 |= Integer.MIN_VALUE;
        return this.f18129p0.m15183E(null, null, null, this);
    }
}
