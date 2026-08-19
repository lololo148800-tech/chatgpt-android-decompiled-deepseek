package p103Dn;

import p025An.InterfaceC0627n0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.C0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2125C0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2127D0 f6499Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC2186j f6500Z;

    /* JADX INFO: renamed from: o0 */
    public C2129E0 f6501o0;

    /* JADX INFO: renamed from: p0 */
    public InterfaceC0627n0 f6502p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f6503q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C2127D0 f6504r0;

    /* JADX INFO: renamed from: s0 */
    public int f6505s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2125C0(C2127D0 c2127d0, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6504r0 = c2127d0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f6503q0 = obj;
        this.f6505s0 |= Integer.MIN_VALUE;
        C2127D0.m3228m(this.f6504r0, null, this);
        return EnumC19250a.f61036Y;
    }
}
