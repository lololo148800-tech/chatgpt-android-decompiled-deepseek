package p094De;

import p086D6.C1971o;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: De.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C2024g extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6208Y;

    /* JADX INFO: renamed from: Z */
    public int f6209Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1971o f6210o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2024g(C1971o c1971o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6210o0 = c1971o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6208Y = obj;
        this.f6209Z |= Integer.MIN_VALUE;
        return this.f6210o0.mo395a(null, this);
    }
}
