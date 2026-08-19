package p103Dn;

import p086D6.C1970n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.M */
/* JADX INFO: loaded from: classes2.dex */
public final class C2144M extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6567Y;

    /* JADX INFO: renamed from: Z */
    public int f6568Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1970n f6569o0;

    /* JADX INFO: renamed from: p0 */
    public C1970n f6570p0;

    /* JADX INFO: renamed from: q0 */
    public InterfaceC2186j f6571q0;

    /* JADX INFO: renamed from: r0 */
    public Throwable f6572r0;

    /* JADX INFO: renamed from: s0 */
    public long f6573s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2144M(C1970n c1970n, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6569o0 = c1970n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6567Y = obj;
        this.f6568Z |= Integer.MIN_VALUE;
        return this.f6569o0.mo3141d(null, this);
    }
}
