package p120Ee;

import p403Qd.C6636i;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ee.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C2417k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C6636i f7510Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f7511Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2423q f7512o0;

    /* JADX INFO: renamed from: p0 */
    public int f7513p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2417k(C2423q c2423q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f7512o0 = c2423q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f7511Z = obj;
        this.f7513p0 |= Integer.MIN_VALUE;
        return C2423q.m3576a(this.f7512o0, null, this);
    }
}
