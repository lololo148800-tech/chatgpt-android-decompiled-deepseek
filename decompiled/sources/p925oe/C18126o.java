package p925oe;

import p729ej.C13435z;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C18126o extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f57815Y;

    /* JADX INFO: renamed from: Z */
    public int f57816Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13435z f57817o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18126o(C13435z c13435z, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f57817o0 = c13435z;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57815Y = obj;
        this.f57816Z |= Integer.MIN_VALUE;
        return this.f57817o0.mo395a(null, this);
    }
}
