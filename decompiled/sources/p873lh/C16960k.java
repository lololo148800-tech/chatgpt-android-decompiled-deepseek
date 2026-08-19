package p873lh;

import p787he.C14462S;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: lh.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C16960k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f54434Y;

    /* JADX INFO: renamed from: Z */
    public int f54435Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14462S f54436o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16960k(C14462S c14462s, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f54436o0 = c14462s;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f54434Y = obj;
        this.f54435Z |= Integer.MIN_VALUE;
        return this.f54436o0.mo395a(null, this);
    }
}
