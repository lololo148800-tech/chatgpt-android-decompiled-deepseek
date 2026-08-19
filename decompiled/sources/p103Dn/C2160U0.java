package p103Dn;

import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.U0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2160U0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6619Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2162V0 f6620Z;

    /* JADX INFO: renamed from: o0 */
    public int f6621o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2160U0(C2162V0 c2162v0, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6620Z = c2162v0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6619Y = obj;
        this.f6621o0 |= Integer.MIN_VALUE;
        this.f6620Z.mo3141d(null, this);
        return EnumC19250a.f61036Y;
    }
}
