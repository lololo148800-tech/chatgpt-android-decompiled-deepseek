package p905nd;

import p787he.C14462S;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: nd.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C17577e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f56230Y;

    /* JADX INFO: renamed from: Z */
    public int f56231Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14462S f56232o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17577e(C14462S c14462s, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f56232o0 = c14462s;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f56230Y = obj;
        this.f56231Z |= Integer.MIN_VALUE;
        return this.f56232o0.mo395a(null, this);
    }
}
