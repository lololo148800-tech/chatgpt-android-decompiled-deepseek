package p811ih;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ih.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C14997d extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f46681Y;

    /* JADX INFO: renamed from: Z */
    public int f46682Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14998e f46683o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14997d(C14998e c14998e, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f46683o0 = c14998e;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f46681Y = obj;
        this.f46682Z |= Integer.MIN_VALUE;
        return this.f46683o0.mo395a(null, this);
    }
}
