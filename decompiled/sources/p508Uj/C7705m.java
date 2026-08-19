package p508Uj;

import p002A0.C0132i;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Uj.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C7705m extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C0132i f24270Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC7701i f24271Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f24272o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0132i f24273p0;

    /* JADX INFO: renamed from: q0 */
    public int f24274q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7705m(C0132i c0132i, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f24273p0 = c0132i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f24272o0 = obj;
        this.f24274q0 |= Integer.MIN_VALUE;
        return this.f24273p0.m437c(null, this);
    }
}
