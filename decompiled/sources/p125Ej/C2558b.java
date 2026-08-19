package p125Ej;

import p086D6.C1971o;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ej.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2558b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2557a f7981Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f7982Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1971o f7983o0;

    /* JADX INFO: renamed from: p0 */
    public int f7984p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2558b(C1971o c1971o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f7983o0 = c1971o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f7982Z = obj;
        this.f7984p0 |= Integer.MIN_VALUE;
        return this.f7983o0.m3143c(null, this);
    }
}
