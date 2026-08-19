package p351O2;

import p086D6.C1971o;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: O2.t */
/* JADX INFO: loaded from: classes.dex */
public final class C6106t extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f19854Y;

    /* JADX INFO: renamed from: Z */
    public int f19855Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1971o f19856o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6106t(C1971o c1971o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f19856o0 = c1971o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f19854Y = obj;
        this.f19855Z |= Integer.MIN_VALUE;
        return this.f19856o0.mo395a(null, this);
    }
}
