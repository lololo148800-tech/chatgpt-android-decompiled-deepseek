package ge;

import p072Ci.C1705j;
import p103Dn.InterfaceC2186j;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ge.S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14051S0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f44167Y;

    /* JADX INFO: renamed from: Z */
    public int f44168Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC2186j f44169o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14048Q0 f44170p0;

    /* JADX INFO: renamed from: q0 */
    public C1705j f44171q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14051S0(C14048Q0 c14048q0, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f44170p0 = c14048q0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f44167Y = obj;
        this.f44168Z |= Integer.MIN_VALUE;
        return this.f44170p0.mo395a(null, this);
    }
}
