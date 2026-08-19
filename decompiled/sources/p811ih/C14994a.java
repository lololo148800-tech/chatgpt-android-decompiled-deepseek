package p811ih;

import p729ej.C13435z;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ih.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C14994a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f46671Y;

    /* JADX INFO: renamed from: Z */
    public int f46672Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13435z f46673o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14994a(C13435z c13435z, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f46673o0 = c13435z;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f46671Y = obj;
        this.f46672Z |= Integer.MIN_VALUE;
        return this.f46673o0.mo395a(null, this);
    }
}
