package p103Dn;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.X */
/* JADX INFO: loaded from: classes2.dex */
public final class C2165X extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2166Y f6633Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f6634Z;

    /* JADX INFO: renamed from: o0 */
    public int f6635o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2166Y f6636p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2165X(C2166Y c2166y, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6636p0 = c2166y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6634Z = obj;
        this.f6635o0 |= Integer.MIN_VALUE;
        return this.f6636p0.mo395a(null, this);
    }
}
