package p103Dn;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.V */
/* JADX INFO: loaded from: classes2.dex */
public final class C2161V extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2163W f6622Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f6623Z;

    /* JADX INFO: renamed from: o0 */
    public int f6624o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2163W f6625p0;

    /* JADX INFO: renamed from: q0 */
    public Object f6626q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2161V(C2163W c2163w, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6625p0 = c2163w;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6623Z = obj;
        this.f6624o0 |= Integer.MIN_VALUE;
        return this.f6625p0.mo395a(null, this);
    }
}
