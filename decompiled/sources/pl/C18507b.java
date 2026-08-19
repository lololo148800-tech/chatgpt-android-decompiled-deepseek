package pl;

import p103Dn.InterfaceC2186j;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: pl.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18507b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f58975Y;

    /* JADX INFO: renamed from: Z */
    public int f58976Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC2186j f58977o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18508c f58978p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18507b(C18508c c18508c, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f58978p0 = c18508c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f58975Y = obj;
        this.f58976Z |= Integer.MIN_VALUE;
        return this.f58978p0.mo395a(null, this);
    }
}
