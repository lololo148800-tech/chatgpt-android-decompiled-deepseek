package p112E6;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: E6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2345d extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2346e f7280Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f7281Z;

    /* JADX INFO: renamed from: o0 */
    public int f7282o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2346e f7283p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2345d(C2346e c2346e, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f7283p0 = c2346e;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f7281Z = obj;
        this.f7282o0 |= Integer.MIN_VALUE;
        return this.f7283p0.mo395a(null, this);
    }
}
