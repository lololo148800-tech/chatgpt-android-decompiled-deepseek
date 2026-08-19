package p209I6;

import p129En.C2602m;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: I6.r */
/* JADX INFO: loaded from: classes.dex */
public final class C3640r extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f11093Y;

    /* JADX INFO: renamed from: Z */
    public int f11094Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2602m f11095o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3640r(C2602m c2602m, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f11095o0 = c2602m;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f11093Y = obj;
        this.f11094Z |= Integer.MIN_VALUE;
        return this.f11095o0.mo395a(null, this);
    }
}
