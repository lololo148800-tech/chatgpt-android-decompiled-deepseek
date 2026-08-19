package p811ih;

import p066Cc.C1625b;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ih.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C14995b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f46674Y;

    /* JADX INFO: renamed from: Z */
    public int f46675Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1625b f46676o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14995b(C1625b c1625b, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f46676o0 = c1625b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f46674Y = obj;
        this.f46675Z |= Integer.MIN_VALUE;
        return this.f46676o0.mo395a(null, this);
    }
}
