package p103Dn;

import p129En.C2582B;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2168a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2582B f6643Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f6644Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2219z0 f6645o0;

    /* JADX INFO: renamed from: p0 */
    public int f6646p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2168a(C2219z0 c2219z0, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6645o0 = c2219z0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6644Z = obj;
        this.f6646p0 |= Integer.MIN_VALUE;
        return this.f6645o0.mo3141d(null, this);
    }
}
