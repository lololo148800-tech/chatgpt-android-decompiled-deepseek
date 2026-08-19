package p1099x6;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: x6.h */
/* JADX INFO: loaded from: classes.dex */
public final class C21140h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f67179Y;

    /* JADX INFO: renamed from: Z */
    public int f67180Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21141i f67181o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21140h(C21141i c21141i, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f67181o0 = c21141i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f67179Y = obj;
        this.f67180Z |= Integer.MIN_VALUE;
        return this.f67181o0.mo395a(null, this);
    }
}
