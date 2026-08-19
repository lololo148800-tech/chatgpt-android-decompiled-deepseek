package ke;

import p787he.C14462S;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ke.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C16381i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f50871Y;

    /* JADX INFO: renamed from: Z */
    public int f50872Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14462S f50873o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16381i(C14462S c14462s, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f50873o0 = c14462s;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f50871Y = obj;
        this.f50872Z |= Integer.MIN_VALUE;
        return this.f50873o0.mo395a(null, this);
    }
}
