package p344Nl;

import p086D6.C1971o;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Nl.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C5852x extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f19144Y;

    /* JADX INFO: renamed from: Z */
    public int f19145Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1971o f19146o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5852x(C1971o c1971o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f19146o0 = c1971o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f19144Y = obj;
        this.f19145Z |= Integer.MIN_VALUE;
        return this.f19146o0.mo395a(null, this);
    }
}
