package p341Ni;

import p148Fi.C2769I0;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ni.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C5768Z extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C5784h0 f18784Y;

    /* JADX INFO: renamed from: Z */
    public C2769I0 f18785Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f18786o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C5784h0 f18787p0;

    /* JADX INFO: renamed from: q0 */
    public int f18788q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5768Z(C5784h0 c5784h0, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f18787p0 = c5784h0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f18786o0 = obj;
        this.f18788q0 |= Integer.MIN_VALUE;
        return this.f18787p0.m6179l(null, this);
    }
}
