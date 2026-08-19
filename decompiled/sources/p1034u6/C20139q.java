package p1034u6;

import p103Dn.C2142L;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: u6.q */
/* JADX INFO: loaded from: classes.dex */
public final class C20139q extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2142L f63792Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f63793Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2142L f63794o0;

    /* JADX INFO: renamed from: p0 */
    public int f63795p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20139q(C2142L c2142l, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f63794o0 = c2142l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f63793Z = obj;
        this.f63795p0 |= Integer.MIN_VALUE;
        return this.f63794o0.m3249b(null, this);
    }
}
