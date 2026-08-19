package p576Xe;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xe.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C9476a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f28522Y;

    /* JADX INFO: renamed from: Z */
    public int f28523Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C9477b f28524o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9476a(C9477b c9477b, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f28524o0 = c9477b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28522Y = obj;
        this.f28523Z |= Integer.MIN_VALUE;
        return this.f28524o0.mo395a(null, this);
    }
}
