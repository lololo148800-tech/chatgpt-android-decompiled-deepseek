package p1043ui;

import p729ej.C13435z;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ui.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C20295e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f64161Y;

    /* JADX INFO: renamed from: Z */
    public int f64162Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13435z f64163o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20295e(C13435z c13435z, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f64163o0 = c13435z;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f64161Y = obj;
        this.f64162Z |= Integer.MIN_VALUE;
        return this.f64163o0.mo395a(null, this);
    }
}
