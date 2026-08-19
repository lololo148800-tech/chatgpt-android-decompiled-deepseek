package p351O2;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: O2.C */
/* JADX INFO: loaded from: classes.dex */
public final class C6080C extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f19788Y;

    /* JADX INFO: renamed from: Z */
    public Object f19789Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f19790o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6084G f19791p0;

    /* JADX INFO: renamed from: q0 */
    public int f19792q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6080C(C6084G c6084g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f19791p0 = c6084g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f19790o0 = obj;
        this.f19792q0 |= Integer.MIN_VALUE;
        return this.f19791p0.m6657i(this);
    }
}
