package p209I6;

import p002A0.C0132i;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: I6.p */
/* JADX INFO: loaded from: classes.dex */
public final class C3638p extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f11087Y;

    /* JADX INFO: renamed from: Z */
    public int f11088Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0132i f11089o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3638p(C0132i c0132i, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f11089o0 = c0132i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f11087Y = obj;
        this.f11088Z |= Integer.MIN_VALUE;
        return this.f11089o0.mo395a(null, this);
    }
}
