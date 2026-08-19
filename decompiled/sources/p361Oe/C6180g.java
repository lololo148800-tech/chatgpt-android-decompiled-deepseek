package p361Oe;

import p086D6.C1971o;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Oe.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C6180g extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f20129Y;

    /* JADX INFO: renamed from: Z */
    public int f20130Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1971o f20131o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6180g(C1971o c1971o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f20131o0 = c1971o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f20129Y = obj;
        this.f20130Z |= Integer.MIN_VALUE;
        return this.f20131o0.mo395a(null, this);
    }
}
