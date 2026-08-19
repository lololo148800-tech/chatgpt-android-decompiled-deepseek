package p792hl;

import p434Rk.C6911c;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: hl.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C14533h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f45804Y;

    /* JADX INFO: renamed from: Z */
    public C6911c f45805Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f45806o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14535j f45807p0;

    /* JADX INFO: renamed from: q0 */
    public int f45808q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14533h(C14535j c14535j, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f45807p0 = c14535j;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45806o0 = obj;
        this.f45808q0 |= Integer.MIN_VALUE;
        return this.f45807p0.m16038c(this);
    }
}
