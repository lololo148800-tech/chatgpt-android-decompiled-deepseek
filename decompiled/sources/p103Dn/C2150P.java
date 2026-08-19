package p103Dn;

import p066Cc.C1625b;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.P */
/* JADX INFO: loaded from: classes2.dex */
public final class C2150P extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C1625b f6582Y;

    /* JADX INFO: renamed from: Z */
    public Object f6583Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f6584o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C1625b f6585p0;

    /* JADX INFO: renamed from: q0 */
    public int f6586q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2150P(C1625b c1625b, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6585p0 = c1625b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6584o0 = obj;
        this.f6586q0 |= Integer.MIN_VALUE;
        return this.f6585p0.mo395a(null, this);
    }
}
