package p708dh;

import p215Ic.C3690g;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: dh.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C13136N extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3690g f41702Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f41703Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3690g f41704o0;

    /* JADX INFO: renamed from: p0 */
    public int f41705p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13136N(C3690g c3690g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f41704o0 = c3690g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f41703Z = obj;
        this.f41705p0 |= Integer.MIN_VALUE;
        return this.f41704o0.mo1965a(this);
    }
}
