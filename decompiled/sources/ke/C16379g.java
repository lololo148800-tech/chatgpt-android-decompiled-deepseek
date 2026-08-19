package ke;

import p787he.C14462S;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ke.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C16379g extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f50865Y;

    /* JADX INFO: renamed from: Z */
    public int f50866Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14462S f50867o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16379g(C14462S c14462s, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f50867o0 = c14462s;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f50865Y = obj;
        this.f50866Z |= Integer.MIN_VALUE;
        return this.f50867o0.mo395a(null, this);
    }
}
