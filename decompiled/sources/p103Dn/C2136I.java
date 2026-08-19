package p103Dn;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.I */
/* JADX INFO: loaded from: classes2.dex */
public final class C2136I extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6541Y;

    /* JADX INFO: renamed from: Z */
    public int f6542Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2134H f6543o0;

    /* JADX INFO: renamed from: p0 */
    public C2134H f6544p0;

    /* JADX INFO: renamed from: q0 */
    public InterfaceC2186j f6545q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2136I(C2134H c2134h, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6543o0 = c2134h;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6541Y = obj;
        this.f6542Z |= Integer.MIN_VALUE;
        return this.f6543o0.mo3141d(null, this);
    }
}
