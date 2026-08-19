package p025An;

import java.util.concurrent.CancellationException;
import p049Bm.InterfaceC1436k;
import p972qm.AbstractC18768a;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: An.x0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0647x0 extends AbstractC18768a implements InterfaceC0627n0 {

    /* JADX INFO: renamed from: Y */
    public static final C0647x0 f1902Y = new C0647x0(C0625m0.f1875Y);

    @Override // p025An.InterfaceC0627n0
    /* JADX INFO: renamed from: C0 */
    public final InterfaceC0630p mo1269C0(C0641u0 c0641u0) {
        return C0649y0.f1903Y;
    }

    @Override // p025An.InterfaceC0627n0
    /* JADX INFO: renamed from: E */
    public final InterfaceC0595V mo1270E(boolean z6, boolean z10, InterfaceC1436k interfaceC1436k) {
        return C0649y0.f1903Y;
    }

    @Override // p025An.InterfaceC0627n0
    /* JADX INFO: renamed from: H0 */
    public final InterfaceC0595V mo1271H0(InterfaceC1436k interfaceC1436k) {
        return C0649y0.f1903Y;
    }

    @Override // p025An.InterfaceC0627n0
    /* JADX INFO: renamed from: P */
    public final Object mo1272P(InterfaceC18770c interfaceC18770c) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // p025An.InterfaceC0627n0
    /* JADX INFO: renamed from: T */
    public final CancellationException mo1273T() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // p025An.InterfaceC0627n0
    /* JADX INFO: renamed from: a */
    public final boolean mo1274a() {
        return true;
    }

    @Override // p025An.InterfaceC0627n0
    public final InterfaceC0627n0 getParent() {
        return null;
    }

    @Override // p025An.InterfaceC0627n0
    public final boolean isCancelled() {
        return false;
    }

    @Override // p025An.InterfaceC0627n0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // p025An.InterfaceC0627n0
    /* JADX INFO: renamed from: e */
    public final void mo1275e(CancellationException cancellationException) {
    }
}
