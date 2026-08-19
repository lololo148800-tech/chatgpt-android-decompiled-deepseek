package p387Pl;

import p002A0.C0132i;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Pl.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C6486f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f21043Y;

    /* JADX INFO: renamed from: Z */
    public int f21044Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0132i f21045o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6486f(C0132i c0132i, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f21045o0 = c0132i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f21043Y = obj;
        this.f21044Z |= Integer.MIN_VALUE;
        return this.f21045o0.mo395a(null, this);
    }
}
