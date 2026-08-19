package id;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: id.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C14967f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f46616Y;

    /* JADX INFO: renamed from: Z */
    public int f46617Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14965d f46618o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14967f(C14965d c14965d, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f46618o0 = c14965d;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f46616Y = obj;
        this.f46617Z |= Integer.MIN_VALUE;
        return this.f46618o0.mo395a(null, this);
    }
}
