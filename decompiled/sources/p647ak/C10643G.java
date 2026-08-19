package p647ak;

import p002A0.C0132i;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ak.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C10643G extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f31574Y;

    /* JADX INFO: renamed from: Z */
    public int f31575Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0132i f31576o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10643G(C0132i c0132i, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f31576o0 = c0132i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f31574Y = obj;
        this.f31575Z |= Integer.MIN_VALUE;
        return this.f31576o0.mo395a(null, this);
    }
}
