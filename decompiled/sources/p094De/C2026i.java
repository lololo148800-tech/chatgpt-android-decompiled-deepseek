package p094De;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: De.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C2026i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6213Y;

    /* JADX INFO: renamed from: Z */
    public int f6214Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2027j f6215o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2026i(C2027j c2027j, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6215o0 = c2027j;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6213Y = obj;
        this.f6214Z |= Integer.MIN_VALUE;
        return this.f6215o0.mo395a(null, this);
    }
}
