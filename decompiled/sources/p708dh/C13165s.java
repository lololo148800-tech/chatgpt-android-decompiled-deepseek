package p708dh;

import p086D6.C1971o;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: dh.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C13165s extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f41794Y;

    /* JADX INFO: renamed from: Z */
    public int f41795Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1971o f41796o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13165s(C1971o c1971o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f41796o0 = c1971o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f41794Y = obj;
        this.f41795Z |= Integer.MIN_VALUE;
        return this.f41796o0.mo395a(null, this);
    }
}
