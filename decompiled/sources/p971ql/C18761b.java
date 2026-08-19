package p971ql;

import p103Dn.InterfaceC2186j;
import p972qm.InterfaceC18770c;
import pl.C18508c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ql.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18761b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f59651Y;

    /* JADX INFO: renamed from: Z */
    public int f59652Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC2186j f59653o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18508c f59654p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18761b(C18508c c18508c, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f59654p0 = c18508c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f59651Y = obj;
        this.f59652Z |= Integer.MIN_VALUE;
        return this.f59654p0.mo395a(null, this);
    }
}
