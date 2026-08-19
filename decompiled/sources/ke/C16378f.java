package ke;

import p811ih.C14998e;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ke.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C16378f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f50862Y;

    /* JADX INFO: renamed from: Z */
    public int f50863Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14998e f50864o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16378f(C14998e c14998e, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f50864o0 = c14998e;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f50862Y = obj;
        this.f50863Z |= Integer.MIN_VALUE;
        return this.f50864o0.mo395a(null, this);
    }
}
