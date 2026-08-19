package p278L0;

import p025An.InterfaceC0627n0;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: L0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C4878i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C4880j f15893Y;

    /* JADX INFO: renamed from: Z */
    public Object f15894Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC0627n0 f15895o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f15896p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C4880j f15897q0;

    /* JADX INFO: renamed from: r0 */
    public int f15898r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4878i(C4880j c4880j, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f15897q0 = c4880j;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15896p0 = obj;
        this.f15898r0 |= Integer.MIN_VALUE;
        return this.f15897q0.mo395a(null, this);
    }
}
