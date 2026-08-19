package p1034u6;

import p103Dn.C2142L;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: u6.k */
/* JADX INFO: loaded from: classes.dex */
public final class C20133k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f63773Y;

    /* JADX INFO: renamed from: Z */
    public int f63774Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2142L f63775o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20133k(C2142L c2142l, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f63775o0 = c2142l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f63773Y = obj;
        this.f63774Z |= Integer.MIN_VALUE;
        return this.f63775o0.mo395a(null, this);
    }
}
