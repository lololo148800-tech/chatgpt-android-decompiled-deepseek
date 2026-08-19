package p364Oh;

import p002A0.C0132i;
import p103Dn.InterfaceC2186j;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Oh.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C6232f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f20294Y;

    /* JADX INFO: renamed from: Z */
    public int f20295Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC2186j f20296o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0132i f20297p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6232f(C0132i c0132i, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f20297p0 = c0132i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f20294Y = obj;
        this.f20295Z |= Integer.MIN_VALUE;
        return this.f20297p0.mo395a(null, this);
    }
}
