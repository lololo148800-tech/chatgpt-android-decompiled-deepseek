package p1089wl;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: wl.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21007a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C21008b f66855Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f66856Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21008b f66857o0;

    /* JADX INFO: renamed from: p0 */
    public int f66858p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21007a(C21008b c21008b, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f66857o0 = c21008b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f66856Z = obj;
        this.f66858p0 |= Integer.MIN_VALUE;
        return this.f66857o0.m21466e(this);
    }
}
