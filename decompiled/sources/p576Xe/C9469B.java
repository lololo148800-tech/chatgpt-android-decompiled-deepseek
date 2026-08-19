package p576Xe;

import p094De.C2027j;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xe.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C9469B extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f28495Y;

    /* JADX INFO: renamed from: Z */
    public int f28496Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2027j f28497o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9469B(C2027j c2027j, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f28497o0 = c2027j;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28495Y = obj;
        this.f28496Z |= Integer.MIN_VALUE;
        return this.f28497o0.mo395a(null, this);
    }
}
