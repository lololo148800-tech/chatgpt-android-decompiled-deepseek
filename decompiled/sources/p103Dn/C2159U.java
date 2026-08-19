package p103Dn;

import p086D6.C1970n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.U */
/* JADX INFO: loaded from: classes2.dex */
public final class C2159U extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6615Y;

    /* JADX INFO: renamed from: Z */
    public int f6616Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1970n f6617o0;

    /* JADX INFO: renamed from: p0 */
    public C2163W f6618p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2159U(C1970n c1970n, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6617o0 = c1970n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6615Y = obj;
        this.f6616Z |= Integer.MIN_VALUE;
        return this.f6617o0.mo3141d(null, this);
    }
}
