package p860l0;

import p025An.InterfaceC0627n0;
import p278L0.C4880j;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: l0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C16743h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C4880j f53693Y;

    /* JADX INFO: renamed from: Z */
    public Object f53694Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC0627n0 f53695o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f53696p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C4880j f53697q0;

    /* JADX INFO: renamed from: r0 */
    public int f53698r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16743h(C4880j c4880j, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f53697q0 = c4880j;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f53696p0 = obj;
        this.f53698r0 |= Integer.MIN_VALUE;
        return this.f53697q0.mo395a(null, this);
    }
}
