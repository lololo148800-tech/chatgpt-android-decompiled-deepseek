package p769gj;

import p086D6.C1971o;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: gj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C14159a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f44529Y;

    /* JADX INFO: renamed from: Z */
    public int f44530Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1971o f44531o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14159a(C1971o c1971o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f44531o0 = c1971o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f44529Y = obj;
        this.f44530Z |= Integer.MIN_VALUE;
        return this.f44531o0.mo395a(null, this);
    }
}
