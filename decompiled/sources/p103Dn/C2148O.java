package p103Dn;

import p002A0.C0132i;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.O */
/* JADX INFO: loaded from: classes2.dex */
public final class C2148O extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6579Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0132i f6580Z;

    /* JADX INFO: renamed from: o0 */
    public int f6581o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2148O(C0132i c0132i, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6580Z = c0132i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6579Y = obj;
        this.f6581o0 |= Integer.MIN_VALUE;
        return this.f6580Z.mo395a(null, this);
    }
}
