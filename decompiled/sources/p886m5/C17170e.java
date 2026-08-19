package p886m5;

import p787he.C14462S;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: m5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C17170e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f54853Y;

    /* JADX INFO: renamed from: Z */
    public int f54854Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14462S f54855o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17170e(C14462S c14462s, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f54855o0 = c14462s;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f54853Y = obj;
        this.f54854Z |= Integer.MIN_VALUE;
        return this.f54855o0.mo395a(null, this);
    }
}
