package p268Kf;

import p002A0.C0132i;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4648c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f15114Y;

    /* JADX INFO: renamed from: Z */
    public int f15115Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0132i f15116o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4648c(C0132i c0132i, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f15116o0 = c0132i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15114Y = obj;
        this.f15115Z |= Integer.MIN_VALUE;
        return this.f15116o0.mo395a(null, this);
    }
}
