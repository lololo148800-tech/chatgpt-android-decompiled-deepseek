package li;

import p215Ic.C3690g;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: li.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C16962a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3690g f54443Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f54444Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3690g f54445o0;

    /* JADX INFO: renamed from: p0 */
    public int f54446p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16962a(C3690g c3690g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f54445o0 = c3690g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f54444Z = obj;
        this.f54446p0 |= Integer.MIN_VALUE;
        return this.f54445o0.mo1965a(this);
    }
}
