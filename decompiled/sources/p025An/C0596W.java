package p025An;

import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;

/* JADX INFO: renamed from: An.W */
/* JADX INFO: loaded from: classes2.dex */
public final class C0596W extends AbstractC0633q0 {

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f1827q0;

    /* JADX INFO: renamed from: r0 */
    public final Object f1828r0;

    public /* synthetic */ C0596W(Object obj, int i10) {
        this.f1827q0 = i10;
        this.f1828r0 = obj;
    }

    @Override // p025An.AbstractC0633q0
    /* JADX INFO: renamed from: j */
    public final boolean mo1149j() {
        switch (this.f1827q0) {
        }
        return false;
    }

    @Override // p025An.AbstractC0633q0
    /* JADX INFO: renamed from: k */
    public final void mo1150k(Throwable th2) {
        switch (this.f1827q0) {
            case 0:
                ((InterfaceC0595V) this.f1828r0).dispose();
                break;
            case 1:
                ((InterfaceC1436k) this.f1828r0).invoke(th2);
                break;
            default:
                Object obj = C0641u0.f1897Y.get(m1280i());
                boolean z6 = obj instanceof C0642v;
                C0635r0 c0635r0 = (C0635r0) this.f1828r0;
                if (!z6) {
                    c0635r0.resumeWith(AbstractC0575H.m1166N(obj));
                } else {
                    c0635r0.resumeWith(AbstractC9233X.m9806b(((C0642v) obj).f1900a));
                }
                break;
        }
    }
}
