package p787he;

import p086D6.C1971o;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: he.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C14448D extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f45433Y;

    /* JADX INFO: renamed from: Z */
    public int f45434Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1971o f45435o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14448D(C1971o c1971o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f45435o0 = c1971o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45433Y = obj;
        this.f45434Z |= Integer.MIN_VALUE;
        return this.f45435o0.mo395a(null, this);
    }
}
