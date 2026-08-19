package p193Hf;

import p002A0.C0132i;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Hf.u1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3408u1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f10384Y;

    /* JADX INFO: renamed from: Z */
    public int f10385Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0132i f10386o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3408u1(C0132i c0132i, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f10386o0 = c0132i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f10384Y = obj;
        this.f10385Z |= Integer.MIN_VALUE;
        return this.f10386o0.mo395a(null, this);
    }
}
