package p103Dn;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C2218z extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6798Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2206t f6799Z;

    /* JADX INFO: renamed from: o0 */
    public int f6800o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2218z(C2206t c2206t, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6799Z = c2206t;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6798Y = obj;
        this.f6800o0 |= Integer.MIN_VALUE;
        return this.f6799Z.mo395a(null, this);
    }
}
