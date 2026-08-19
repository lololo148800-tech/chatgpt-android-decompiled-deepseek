package p185H6;

import p129En.C2602m;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: H6.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3253i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f9902Y;

    /* JADX INFO: renamed from: Z */
    public int f9903Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2602m f9904o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3253i(C2602m c2602m, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f9904o0 = c2602m;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f9902Y = obj;
        this.f9903Z |= Integer.MIN_VALUE;
        return this.f9904o0.mo395a(null, this);
    }
}
