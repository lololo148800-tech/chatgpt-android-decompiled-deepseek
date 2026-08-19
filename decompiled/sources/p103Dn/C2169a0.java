package p103Dn;

import p002A0.C0132i;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.a0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2169a0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6647Y;

    /* JADX INFO: renamed from: Z */
    public int f6648Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC2186j f6649o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0132i f6650p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2169a0(C0132i c0132i, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6650p0 = c0132i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6647Y = obj;
        this.f6648Z |= Integer.MIN_VALUE;
        return this.f6650p0.mo395a(null, this);
    }
}
