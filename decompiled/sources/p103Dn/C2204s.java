package p103Dn;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C2204s extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6761Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2206t f6762Z;

    /* JADX INFO: renamed from: o0 */
    public int f6763o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2204s(C2206t c2206t, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6762Z = c2206t;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6761Y = obj;
        this.f6763o0 |= Integer.MIN_VALUE;
        return this.f6762Z.mo395a(null, this);
    }
}
