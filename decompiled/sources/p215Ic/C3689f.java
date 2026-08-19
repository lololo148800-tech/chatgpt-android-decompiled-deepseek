package p215Ic;

import p1081wc.C20879Z;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ic.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C3689f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C20879Z f11198Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f11199Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3690g f11200o0;

    /* JADX INFO: renamed from: p0 */
    public int f11201p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3689f(C3690g c3690g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f11200o0 = c3690g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f11199Z = obj;
        this.f11201p0 |= Integer.MIN_VALUE;
        return this.f11200o0.mo1965a(this);
    }
}
