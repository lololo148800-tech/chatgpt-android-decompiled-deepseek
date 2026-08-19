package p103Dn;

import p002A0.C0132i;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.q0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2201q0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6745Y;

    /* JADX INFO: renamed from: Z */
    public int f6746Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0132i f6747o0;

    /* JADX INFO: renamed from: p0 */
    public Object f6748p0;

    /* JADX INFO: renamed from: q0 */
    public InterfaceC2186j f6749q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2201q0(C0132i c0132i, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6747o0 = c0132i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6745Y = obj;
        this.f6746Z |= Integer.MIN_VALUE;
        return this.f6747o0.mo395a(null, this);
    }
}
