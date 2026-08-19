package p993rj;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: rj.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C19022B extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C19024D f60606Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f60607Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19024D f60608o0;

    /* JADX INFO: renamed from: p0 */
    public int f60609p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19022B(C19024D c19024d, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f60608o0 = c19024d;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f60607Z = obj;
        this.f60609p0 |= Integer.MIN_VALUE;
        return this.f60608o0.m20283e(this);
    }
}
