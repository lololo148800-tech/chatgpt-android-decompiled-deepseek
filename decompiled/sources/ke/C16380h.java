package ke;

import p787he.C14462S;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ke.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C16380h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f50868Y;

    /* JADX INFO: renamed from: Z */
    public int f50869Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14462S f50870o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16380h(C14462S c14462s, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f50870o0 = c14462s;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f50868Y = obj;
        this.f50869Z |= Integer.MIN_VALUE;
        return this.f50870o0.mo395a(null, this);
    }
}
