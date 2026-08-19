package p103Dn;

import p066Cc.C1625b;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C2178f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6670Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1625b f6671Z;

    /* JADX INFO: renamed from: o0 */
    public int f6672o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2178f(C1625b c1625b, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6671Z = c1625b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6670Y = obj;
        this.f6672o0 |= Integer.MIN_VALUE;
        return this.f6671Z.mo395a(null, this);
    }
}
