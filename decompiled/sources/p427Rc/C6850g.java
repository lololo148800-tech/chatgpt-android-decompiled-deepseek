package p427Rc;

import p103Dn.C2163W;
import p103Dn.InterfaceC2186j;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rc.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C6850g extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f21984Y;

    /* JADX INFO: renamed from: Z */
    public int f21985Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC2186j f21986o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2163W f21987p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6850g(C2163W c2163w, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f21987p0 = c2163w;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f21984Y = obj;
        this.f21985Z |= Integer.MIN_VALUE;
        return this.f21987p0.mo395a(null, this);
    }
}
