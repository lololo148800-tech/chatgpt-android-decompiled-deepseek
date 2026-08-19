package id;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: id.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C14964c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f46607Y;

    /* JADX INFO: renamed from: Z */
    public int f46608Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14965d f46609o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14964c(C14965d c14965d, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f46609o0 = c14965d;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f46607Y = obj;
        this.f46608Z |= Integer.MIN_VALUE;
        return this.f46609o0.mo395a(null, this);
    }
}
