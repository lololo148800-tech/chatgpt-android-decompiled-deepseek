package p406Qg;

import p215Ic.C3690g;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Qg.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C6711g extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3690g f21569Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f21570Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3690g f21571o0;

    /* JADX INFO: renamed from: p0 */
    public int f21572p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6711g(C3690g c3690g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f21571o0 = c3690g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f21570Z = obj;
        this.f21572p0 |= Integer.MIN_VALUE;
        return this.f21571o0.mo1965a(this);
    }
}
