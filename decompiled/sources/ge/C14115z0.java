package ge;

import p086D6.C1971o;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ge.z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14115z0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f44444Y;

    /* JADX INFO: renamed from: Z */
    public int f44445Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1971o f44446o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14115z0(C1971o c1971o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f44446o0 = c1971o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f44444Y = obj;
        this.f44445Z |= Integer.MIN_VALUE;
        return this.f44446o0.mo395a(null, this);
    }
}
