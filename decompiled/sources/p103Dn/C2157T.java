package p103Dn;

import p066Cc.C1625b;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.T */
/* JADX INFO: loaded from: classes2.dex */
public final class C2157T extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6610Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1625b f6611Z;

    /* JADX INFO: renamed from: o0 */
    public int f6612o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2157T(C1625b c1625b, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6611Z = c1625b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6610Y = obj;
        this.f6612o0 |= Integer.MIN_VALUE;
        return this.f6611Z.mo395a(null, this);
    }
}
