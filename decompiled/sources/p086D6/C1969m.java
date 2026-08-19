package p086D6;

import p002A0.C0132i;
import p103Dn.InterfaceC2186j;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: D6.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1969m extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f5826Y;

    /* JADX INFO: renamed from: Z */
    public int f5827Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC2186j f5828o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0132i f5829p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1969m(C0132i c0132i, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f5829p0 = c0132i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f5826Y = obj;
        this.f5827Z |= Integer.MIN_VALUE;
        return this.f5829p0.mo395a(null, this);
    }
}
