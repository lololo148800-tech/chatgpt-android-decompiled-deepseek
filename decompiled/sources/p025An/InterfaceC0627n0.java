package p025An;

import java.util.concurrent.CancellationException;
import p049Bm.InterfaceC1436k;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18774g;

/* JADX INFO: renamed from: An.n0 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0627n0 extends InterfaceC18774g {
    /* JADX INFO: renamed from: C0 */
    InterfaceC0630p mo1269C0(C0641u0 c0641u0);

    /* JADX INFO: renamed from: E */
    InterfaceC0595V mo1270E(boolean z6, boolean z10, InterfaceC1436k interfaceC1436k);

    /* JADX INFO: renamed from: H0 */
    InterfaceC0595V mo1271H0(InterfaceC1436k interfaceC1436k);

    /* JADX INFO: renamed from: P */
    Object mo1272P(InterfaceC18770c interfaceC18770c);

    /* JADX INFO: renamed from: T */
    CancellationException mo1273T();

    /* JADX INFO: renamed from: a */
    boolean mo1274a();

    /* JADX INFO: renamed from: e */
    void mo1275e(CancellationException cancellationException);

    InterfaceC0627n0 getParent();

    boolean isCancelled();

    boolean start();
}
