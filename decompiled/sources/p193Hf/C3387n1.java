package p193Hf;

import p094De.C2027j;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Hf.n1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3387n1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f10328Y;

    /* JADX INFO: renamed from: Z */
    public int f10329Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2027j f10330o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3387n1(C2027j c2027j, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f10330o0 = c2027j;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f10328Y = obj;
        this.f10329Z |= Integer.MIN_VALUE;
        return this.f10330o0.mo395a(null, this);
    }
}
