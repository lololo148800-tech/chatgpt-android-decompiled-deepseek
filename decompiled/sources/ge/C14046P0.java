package ge;

import p072Ci.C1705j;
import p103Dn.InterfaceC2186j;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ge.P0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14046P0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f44154Y;

    /* JADX INFO: renamed from: Z */
    public int f44155Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC2186j f44156o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14048Q0 f44157p0;

    /* JADX INFO: renamed from: q0 */
    public C1705j f44158q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14046P0(C14048Q0 c14048q0, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f44157p0 = c14048q0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f44154Y = obj;
        this.f44155Z |= Integer.MIN_VALUE;
        return this.f44157p0.mo395a(null, this);
    }
}
