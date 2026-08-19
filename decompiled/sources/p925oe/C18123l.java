package p925oe;

import p787he.C14462S;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C18123l extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f57806Y;

    /* JADX INFO: renamed from: Z */
    public int f57807Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14462S f57808o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18123l(C14462S c14462s, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f57808o0 = c14462s;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57806Y = obj;
        this.f57807Z |= Integer.MIN_VALUE;
        return this.f57808o0.mo395a(null, this);
    }
}
