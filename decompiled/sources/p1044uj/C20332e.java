package p1044uj;

import p729ej.C13435z;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: uj.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C20332e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f64286Y;

    /* JADX INFO: renamed from: Z */
    public int f64287Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13435z f64288o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20332e(C13435z c13435z, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f64288o0 = c13435z;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f64286Y = obj;
        this.f64287Z |= Integer.MIN_VALUE;
        return this.f64288o0.mo395a(null, this);
    }
}
