package p025An;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mm.C17296C;

/* JADX INFO: renamed from: An.p0 */
/* JADX INFO: loaded from: classes2.dex */
public class C0631p0 extends C0641u0 implements InterfaceC0638t {

    /* JADX INFO: renamed from: o0 */
    public final boolean f1880o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0631p0(InterfaceC0627n0 interfaceC0627n0) {
        super(true);
        boolean z6 = true;
        m1294K(interfaceC0627n0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0641u0.f1898Z;
        InterfaceC0630p interfaceC0630p = (InterfaceC0630p) atomicReferenceFieldUpdater.get(this);
        C0632q c0632q = interfaceC0630p instanceof C0632q ? (C0632q) interfaceC0630p : null;
        if (c0632q == null) {
            z6 = false;
            break;
        }
        C0641u0 c0641u0M1280i = c0632q.m1280i();
        while (!c0641u0M1280i.mo1277F()) {
            InterfaceC0630p interfaceC0630p2 = (InterfaceC0630p) atomicReferenceFieldUpdater.get(c0641u0M1280i);
            C0632q c0632q2 = interfaceC0630p2 instanceof C0632q ? (C0632q) interfaceC0630p2 : null;
            if (c0632q2 == null) {
                z6 = false;
                break;
            }
            c0641u0M1280i = c0632q2.m1280i();
        }
        this.f1880o0 = z6;
    }

    @Override // p025An.C0641u0
    /* JADX INFO: renamed from: F */
    public final boolean mo1277F() {
        return this.f1880o0;
    }

    @Override // p025An.C0641u0
    /* JADX INFO: renamed from: G */
    public final boolean mo1278G() {
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m1279g0() {
        return m1298O(C17296C.f55119a);
    }
}
