package p124Ei;

import p086D6.C1971o;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ei.V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2482V0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f7731Y;

    /* JADX INFO: renamed from: Z */
    public int f7732Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1971o f7733o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2482V0(C1971o c1971o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f7733o0 = c1971o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f7731Y = obj;
        this.f7732Z |= Integer.MIN_VALUE;
        return this.f7733o0.mo395a(null, this);
    }
}
