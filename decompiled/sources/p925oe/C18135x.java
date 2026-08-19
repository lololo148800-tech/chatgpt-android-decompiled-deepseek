package p925oe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C18135x extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f57863Y;

    /* JADX INFO: renamed from: Z */
    public String f57864Z;

    /* JADX INFO: renamed from: o0 */
    public Object f57865o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f57866p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C18077B f57867q0;

    /* JADX INFO: renamed from: r0 */
    public int f57868r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18135x(C18077B c18077b, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f57867q0 = c18077b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57866p0 = obj;
        this.f57868r0 |= Integer.MIN_VALUE;
        return this.f57867q0.m19701f(null, null, this);
    }
}
