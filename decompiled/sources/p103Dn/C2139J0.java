package p103Dn;

import p002A0.C0132i;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.J0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2139J0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6550Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0132i f6551Z;

    /* JADX INFO: renamed from: o0 */
    public int f6552o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2139J0(C0132i c0132i, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6551Z = c0132i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6550Y = obj;
        this.f6552o0 |= Integer.MIN_VALUE;
        return this.f6551Z.m436b(0, this);
    }
}
