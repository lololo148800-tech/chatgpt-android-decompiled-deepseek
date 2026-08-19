package p708dh;

import p002A0.C0132i;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: dh.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C13140S extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f41715Y;

    /* JADX INFO: renamed from: Z */
    public int f41716Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0132i f41717o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13140S(C0132i c0132i, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f41717o0 = c0132i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f41715Y = obj;
        this.f41716Z |= Integer.MIN_VALUE;
        return this.f41717o0.mo395a(null, this);
    }
}
