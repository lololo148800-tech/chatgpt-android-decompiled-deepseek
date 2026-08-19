package p971ql;

import p103Dn.InterfaceC2186j;
import p427Rc.C6848e;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ql.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C18764e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f59664Y;

    /* JADX INFO: renamed from: Z */
    public int f59665Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC2186j f59666o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6848e f59667p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18764e(C6848e c6848e, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f59667p0 = c6848e;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f59664Y = obj;
        this.f59665Z |= Integer.MIN_VALUE;
        return this.f59667p0.mo395a(null, this);
    }
}
