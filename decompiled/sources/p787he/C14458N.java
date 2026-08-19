package p787he;

import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: he.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C14458N extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C14459O f45496Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC1439n f45497Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f45498o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14459O f45499p0;

    /* JADX INFO: renamed from: q0 */
    public int f45500q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14458N(C14459O c14459o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f45499p0 = c14459o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45498o0 = obj;
        this.f45500q0 |= Integer.MIN_VALUE;
        return this.f45499p0.m15992u(null, this);
    }
}
