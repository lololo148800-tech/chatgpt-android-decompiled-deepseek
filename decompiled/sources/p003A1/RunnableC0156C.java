package p003A1;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.paywalls.events.PaywallEventsManager;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: A1.C */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0156C implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f636Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f637Z;

    public /* synthetic */ RunnableC0156C(int i10, InterfaceC1426a interfaceC1426a) {
        this.f636Y = i10;
        this.f637Z = interfaceC1426a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1426a tmp0 = this.f637Z;
        switch (this.f636Y) {
            case 0:
                tmp0.invoke();
                break;
            case 1:
                tmp0.invoke();
                break;
            case 2:
                AbstractC16544l.m18094g(tmp0, "$tmp0");
                tmp0.invoke();
                break;
            case 3:
                DiagnosticsSynchronizer.enqueue$lambda$0(tmp0);
                break;
            case 4:
                DiagnosticsTracker.enqueue$lambda$0(tmp0);
                break;
            case 5:
                OfferingsManager.dispatch$lambda$0(tmp0);
                break;
            case 6:
                IdentityManager.enqueue$lambda$3(tmp0);
                break;
            case 7:
                PaywallEventsManager.enqueue$lambda$0(tmp0);
                break;
            case 8:
                int i10 = Pi2CircleMaskView.f40861t0;
                if (tmp0 != null) {
                    tmp0.invoke();
                }
                break;
            case 9:
                int i11 = SelfieOverlayView.f40876S0;
                if (tmp0 != null) {
                    tmp0.invoke();
                }
                break;
            default:
                if (tmp0 != null) {
                    tmp0.invoke();
                }
                break;
        }
    }
}
