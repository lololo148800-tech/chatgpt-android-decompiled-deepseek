package p344Nl;

import p086D6.C1971o;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Nl.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C5851w extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f19141Y;

    /* JADX INFO: renamed from: Z */
    public int f19142Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1971o f19143o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5851w(C1971o c1971o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f19143o0 = c1971o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f19141Y = obj;
        this.f19142Z |= Integer.MIN_VALUE;
        return this.f19143o0.mo395a(null, this);
    }
}
