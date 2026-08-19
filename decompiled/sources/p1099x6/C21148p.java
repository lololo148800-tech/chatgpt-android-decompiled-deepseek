package p1099x6;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: x6.p */
/* JADX INFO: loaded from: classes.dex */
public final class C21148p extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f67205Y;

    /* JADX INFO: renamed from: Z */
    public int f67206Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21149q f67207o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21148p(C21149q c21149q, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f67207o0 = c21149q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f67205Y = obj;
        this.f67206Z |= Integer.MIN_VALUE;
        return this.f67207o0.mo395a(null, this);
    }
}
