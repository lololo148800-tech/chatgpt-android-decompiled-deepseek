package p1156zj;

import p729ej.C13435z;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: zj.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C22098G extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f69850Y;

    /* JADX INFO: renamed from: Z */
    public int f69851Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13435z f69852o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22098G(C13435z c13435z, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f69852o0 = c13435z;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f69850Y = obj;
        this.f69851Z |= Integer.MIN_VALUE;
        return this.f69852o0.mo395a(null, this);
    }
}
