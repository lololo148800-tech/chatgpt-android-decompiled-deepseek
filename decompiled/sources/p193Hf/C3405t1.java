package p193Hf;

import p086D6.C1971o;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Hf.t1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3405t1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f10377Y;

    /* JADX INFO: renamed from: Z */
    public int f10378Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1971o f10379o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3405t1(C1971o c1971o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f10379o0 = c1971o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f10377Y = obj;
        this.f10378Z |= Integer.MIN_VALUE;
        return this.f10379o0.mo395a(null, this);
    }
}
