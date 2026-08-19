package bg;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: bg.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C11421u extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C11422v f34484Y;

    /* JADX INFO: renamed from: Z */
    public String f34485Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f34486o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11422v f34487p0;

    /* JADX INFO: renamed from: q0 */
    public int f34488q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11421u(C11422v c11422v, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f34487p0 = c11422v;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f34486o0 = obj;
        this.f34488q0 |= Integer.MIN_VALUE;
        return this.f34487p0.m12793h(null, this);
    }
}
