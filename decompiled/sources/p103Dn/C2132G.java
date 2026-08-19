package p103Dn;

import p129En.C2582B;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.G */
/* JADX INFO: loaded from: classes2.dex */
public final class C2132G extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6530Y;

    /* JADX INFO: renamed from: Z */
    public int f6531Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2134H f6532o0;

    /* JADX INFO: renamed from: p0 */
    public C2134H f6533p0;

    /* JADX INFO: renamed from: q0 */
    public InterfaceC2186j f6534q0;

    /* JADX INFO: renamed from: r0 */
    public C2582B f6535r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2132G(C2134H c2134h, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6532o0 = c2134h;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6530Y = obj;
        this.f6531Z |= Integer.MIN_VALUE;
        return this.f6532o0.mo3141d(null, this);
    }
}
