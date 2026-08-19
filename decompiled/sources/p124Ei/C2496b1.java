package p124Ei;

import p086D6.C1971o;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ei.b1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2496b1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f7777Y;

    /* JADX INFO: renamed from: Z */
    public int f7778Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1971o f7779o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2496b1(C1971o c1971o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f7779o0 = c1971o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f7777Y = obj;
        this.f7778Z |= Integer.MIN_VALUE;
        return this.f7779o0.mo395a(null, this);
    }
}
