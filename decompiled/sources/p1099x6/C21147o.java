package p1099x6;

import p103Dn.C2142L;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: x6.o */
/* JADX INFO: loaded from: classes.dex */
public final class C21147o extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f67202Y;

    /* JADX INFO: renamed from: Z */
    public int f67203Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2142L f67204o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21147o(C2142L c2142l, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f67204o0 = c2142l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f67202Y = obj;
        this.f67203Z |= Integer.MIN_VALUE;
        return this.f67204o0.mo395a(null, this);
    }
}
