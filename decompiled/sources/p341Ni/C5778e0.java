package p341Ni;

import p387Pl.C6494n;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ni.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5778e0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C5784h0 f18811Y;

    /* JADX INFO: renamed from: Z */
    public Object f18812Z;

    /* JADX INFO: renamed from: o0 */
    public C6494n f18813o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f18814p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C5784h0 f18815q0;

    /* JADX INFO: renamed from: r0 */
    public int f18816r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5778e0(C5784h0 c5784h0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f18815q0 = c5784h0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f18814p0 = obj;
        this.f18816r0 |= Integer.MIN_VALUE;
        return this.f18815q0.m6182p(null, this);
    }
}
