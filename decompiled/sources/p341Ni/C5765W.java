package p341Ni;

import p086D6.C1971o;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ni.W */
/* JADX INFO: loaded from: classes3.dex */
public final class C5765W extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f18773Y;

    /* JADX INFO: renamed from: Z */
    public int f18774Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1971o f18775o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5765W(C1971o c1971o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f18775o0 = c1971o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f18773Y = obj;
        this.f18774Z |= Integer.MIN_VALUE;
        return this.f18775o0.mo395a(null, this);
    }
}
