package p086D6;

import p002A0.C0132i;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: D6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1958b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f5792Y;

    /* JADX INFO: renamed from: Z */
    public int f5793Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0132i f5794o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1958b(C0132i c0132i, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f5794o0 = c0132i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f5792Y = obj;
        this.f5793Z |= Integer.MIN_VALUE;
        return this.f5794o0.mo395a(null, this);
    }
}
