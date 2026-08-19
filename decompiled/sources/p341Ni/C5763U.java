package p341Ni;

import p148Fi.C2855u;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ni.U */
/* JADX INFO: loaded from: classes3.dex */
public final class C5763U extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C5784h0 f18763Y;

    /* JADX INFO: renamed from: Z */
    public C2855u f18764Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f18765o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C5784h0 f18766p0;

    /* JADX INFO: renamed from: q0 */
    public int f18767q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5763U(C5784h0 c5784h0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f18766p0 = c5784h0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f18765o0 = obj;
        this.f18767q0 |= Integer.MIN_VALUE;
        return C5784h0.m6169c(this.f18766p0, null, this);
    }
}
