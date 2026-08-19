package p341Ni;

import p148Fi.C2807b0;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ni.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C5764V extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C5784h0 f18768Y;

    /* JADX INFO: renamed from: Z */
    public C2807b0 f18769Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f18770o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C5784h0 f18771p0;

    /* JADX INFO: renamed from: q0 */
    public int f18772q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5764V(C5784h0 c5784h0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f18771p0 = c5784h0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f18770o0 = obj;
        this.f18772q0 |= Integer.MIN_VALUE;
        return C5784h0.m6171e(this.f18771p0, null, this);
    }
}
