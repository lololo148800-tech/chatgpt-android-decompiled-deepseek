package ne;

import p787he.C14462S;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ne.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C17599a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f56345Y;

    /* JADX INFO: renamed from: Z */
    public int f56346Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14462S f56347o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17599a(C14462S c14462s, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f56347o0 = c14462s;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f56345Y = obj;
        this.f56346Z |= Integer.MIN_VALUE;
        return this.f56347o0.mo395a(null, this);
    }
}
