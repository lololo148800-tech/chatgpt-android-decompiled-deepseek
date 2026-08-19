package p826j6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.AbstractBinderC11939c;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.google.android.gms.internal.play_billing.C11915U1;
import com.google.android.gms.internal.play_billing.C11918V1;
import com.google.android.gms.internal.play_billing.C11927Y1;
import com.google.android.gms.internal.play_billing.C11930Z1;
import com.google.android.gms.internal.play_billing.C11935b;
import com.google.android.gms.internal.play_billing.C11938b2;
import com.google.android.gms.internal.play_billing.C12002r2;
import com.google.android.gms.internal.play_billing.InterfaceC11943d;
import p003A1.RunnableC0153B;
import p277L.CallableC4829b;
import p813ij.C15026j;

/* JADX INFO: renamed from: j6.A */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC16132A implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final InterfaceC16150d f50051a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C16149c f50052b;

    public /* synthetic */ ServiceConnectionC16132A(C16149c c16149c, InterfaceC16150d interfaceC16150d) {
        this.f50052b = c16149c;
        this.f50051a = interfaceC16150d;
    }

    /* JADX INFO: renamed from: a */
    public final void m17685a(C16155i c16155i) {
        synchronized (this.f50052b.f50112a) {
            try {
                if (this.f50052b.f50113b == 3) {
                    return;
                }
                this.f50051a.onBillingSetupFinished(c16155i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        AbstractC11988o0.m13512g("BillingClient", "Billing service died.");
        try {
            if (C16149c.m17752y(this.f50052b)) {
                C15026j c15026j = this.f50052b.f50118g;
                C11915U1 c11915u1M13360r = C11918V1.m13360r();
                c11915u1M13360r.m13355f(6);
                C11927Y1 c11927y1M13380r = C11930Z1.m13380r();
                c11927y1M13380r.m13370f(122);
                c11915u1M13360r.m13354e(c11927y1M13380r);
                c15026j.m16153t((C11918V1) c11915u1M13360r.m13471b());
            } else {
                this.f50052b.f50118g.m16156w(C11938b2.m13412n());
            }
        } catch (Throwable th2) {
            AbstractC11988o0.m13513h("BillingClient", "Unable to log.", th2);
        }
        synchronized (this.f50052b.f50112a) {
            if (this.f50052b.f50113b != 3 && this.f50052b.f50113b != 0) {
                this.f50052b.m17766p(0);
                this.f50052b.m17768r();
                this.f50051a.onBillingServiceDisconnected();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC11943d c11935b;
        AbstractC11988o0.m13511f("BillingClient", "Billing service connected.");
        synchronized (this.f50052b.f50112a) {
            try {
                if (this.f50052b.f50113b == 3) {
                    return;
                }
                C16149c c16149c = this.f50052b;
                int i10 = AbstractBinderC11939c.f36238b;
                if (iBinder == null) {
                    c11935b = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    c11935b = iInterfaceQueryLocalInterface instanceof InterfaceC11943d ? (InterfaceC11943d) iInterfaceQueryLocalInterface : new C11935b(iBinder, "com.android.vending.billing.IInAppBillingService", 6);
                }
                c16149c.f50119h = c11935b;
                C16149c c16149c2 = this.f50052b;
                if (C16149c.m17750i(new CallableC4829b(this, 6), 30000L, new RunnableC0153B(this, 27), c16149c2.m17775z(), c16149c2.m17763m()) == null) {
                    C16149c c16149c3 = this.f50052b;
                    C16155i c16155iM17761j = c16149c3.m17761j();
                    c16149c3.m17756D(25, 6, c16155iM17761j);
                    m17685a(c16155iM17761j);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC11988o0.m13512g("BillingClient", "Billing service disconnected.");
        try {
            if (C16149c.m17752y(this.f50052b)) {
                C15026j c15026j = this.f50052b.f50118g;
                C11915U1 c11915u1M13360r = C11918V1.m13360r();
                c11915u1M13360r.m13355f(6);
                C11927Y1 c11927y1M13380r = C11930Z1.m13380r();
                c11927y1M13380r.m13370f(121);
                c11915u1M13360r.m13354e(c11927y1M13380r);
                c15026j.m16153t((C11918V1) c11915u1M13360r.m13471b());
            } else {
                this.f50052b.f50118g.m16158y(C12002r2.m13522n());
            }
        } catch (Throwable th2) {
            AbstractC11988o0.m13513h("BillingClient", "Unable to log.", th2);
        }
        synchronized (this.f50052b.f50112a) {
            try {
                if (this.f50052b.f50113b == 3) {
                    return;
                }
                this.f50052b.m17766p(0);
                this.f50051a.onBillingServiceDisconnected();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
