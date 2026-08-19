package p708dh;

import p066Cc.C1625b;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: dh.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C13148b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f41739Y;

    /* JADX INFO: renamed from: Z */
    public int f41740Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1625b f41741o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13148b(C1625b c1625b, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f41741o0 = c1625b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f41739Y = obj;
        this.f41740Z |= Integer.MIN_VALUE;
        return this.f41741o0.mo395a(null, this);
    }
}
