package p576Xe;

import p086D6.C1971o;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xe.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C9499x extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f28601Y;

    /* JADX INFO: renamed from: Z */
    public int f28602Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1971o f28603o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9499x(C1971o c1971o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f28603o0 = c1971o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28601Y = obj;
        this.f28602Z |= Integer.MIN_VALUE;
        return this.f28603o0.mo395a(null, this);
    }
}
