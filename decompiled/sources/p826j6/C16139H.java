package p826j6;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.AbstractC11957g1;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.google.android.gms.internal.play_billing.C11856A2;
import com.google.android.gms.internal.play_billing.C11858B0;
import com.google.android.gms.internal.play_billing.C11867E0;
import com.google.android.gms.internal.play_billing.C11876H0;
import com.google.android.gms.internal.play_billing.C11918V1;
import com.google.android.gms.internal.play_billing.C11924X1;
import com.google.android.gms.internal.play_billing.C12009t1;
import com.google.android.gms.internal.play_billing.C12012u0;
import com.google.android.gms.internal.play_billing.C12022w2;
import com.google.android.gms.internal.play_billing.C12026x2;
import com.google.android.gms.internal.play_billing.C12030y2;
import com.google.android.gms.internal.play_billing.C12034z2;
import com.google.android.gms.internal.play_billing.EnumC12000r0;
import com.google.android.gms.internal.play_billing.InterfaceC11959h;
import com.google.android.gms.internal.play_billing.InterfaceFutureC12028y0;
import com.google.android.gms.internal.play_billing.InterfaceScheduledExecutorServiceC11854A0;
import com.google.android.gms.internal.play_billing.RunnableC11870F0;
import com.google.android.gms.internal.play_billing.RunnableC12008t0;
import com.revenuecat.purchases.google.usecase.C12746a;
import com.revenuecat.purchases.google.usecase.C12748c;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import p007A5.C0376k;
import p1073w3.C20810l;
import p265Kb.C4612e;
import p265Kb.C4613f;
import p357Oa.ServiceConnectionC6160m;
import p519V4.RunnableC7757e;
import p817j$.util.Objects;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j6.H */
/* JADX INFO: loaded from: classes.dex */
public final class C16139H extends C16149c {

    /* JADX INFO: renamed from: F */
    public final Context f50066F;

    /* JADX INFO: renamed from: G */
    public volatile int f50067G;

    /* JADX INFO: renamed from: H */
    public volatile InterfaceC11959h f50068H;

    /* JADX INFO: renamed from: I */
    public volatile ServiceConnectionC6160m f50069I;

    /* JADX INFO: renamed from: J */
    public volatile InterfaceScheduledExecutorServiceC11854A0 f50070J;

    public C16139H(C0376k c0376k, Context context) {
        super(c0376k, context);
        this.f50067G = 0;
        this.f50066F = context;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m17702I(C4612e c4612e, C12746a c12746a) {
        super.mo17709a(c4612e, c12746a);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m17703J(C4613f c4613f, C12746a c12746a) {
        super.mo17710b(c4613f, c12746a);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m17704K(C16167u c16167u, C12748c c12748c) {
        super.mo17713g(c16167u, c12748c);
    }

    /* JADX INFO: renamed from: L */
    public final synchronized boolean m17705L() {
        return (this.f50067G != 2 || this.f50068H == null || this.f50069I == null) ? false : true;
    }

    /* JADX INFO: renamed from: M */
    public final InterfaceFutureC12028y0 m17706M(int i10) {
        if (!m17705L()) {
            AbstractC11988o0.m13512g("BillingClientTesting", "Billing Override Service is not ready.");
            m17707N(106, 28, AbstractC16144M.m17720a(-1, "Billing Override Service connection is disconnected."));
            return new C12012u0();
        }
        C16137F c16137f = new C16137F(this, i10, 0);
        C12026x2 c12026x2 = new C12026x2();
        c12026x2.f36359c = new C11856A2();
        C12034z2 c12034z2 = new C12034z2(c12026x2);
        c12026x2.f36358b = c12034z2;
        c12026x2.f36357a = C16137F.class;
        try {
            c16137f.m17701v(c12026x2);
            c12026x2.f36357a = "billingOverrideService.getBillingOverride";
        } catch (Exception e10) {
            C12009t1 c12009t1 = new C12009t1(e10);
            AbstractC11957g1 abstractC11957g1 = C12022w2.f36347r0;
            C12030y2 c12030y2 = c12034z2.f36368Z;
            if (abstractC11957g1.mo13462D(c12030y2, null, c12009t1)) {
                C12022w2.m13550d(c12030y2);
            }
        }
        return c12034z2;
    }

    /* JADX INFO: renamed from: N */
    public final void m17707N(int i10, int i11, C16155i c16155i) {
        C11918V1 c11918v1M17717b = AbstractC16142K.m17717b(i10, i11, c16155i);
        Objects.requireNonNull(c11918v1M17717b, "ApiFailure should not be null");
        this.f50118g.m16153t(c11918v1M17717b);
    }

    /* JADX INFO: renamed from: O */
    public final void m17708O(int i10, Consumer consumer, Runnable runnable) {
        InterfaceScheduledExecutorServiceC11854A0 interfaceScheduledExecutorServiceC11854A0;
        InterfaceFutureC12028y0 interfaceFutureC12028y0M17706M = m17706M(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.f50070J == null) {
                    ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                    this.f50070J = scheduledExecutorServiceNewSingleThreadScheduledExecutor instanceof InterfaceScheduledExecutorServiceC11854A0 ? (InterfaceScheduledExecutorServiceC11854A0) scheduledExecutorServiceNewSingleThreadScheduledExecutor : new C11867E0(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
                }
                interfaceScheduledExecutorServiceC11854A0 = this.f50070J;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!interfaceFutureC12028y0M17706M.isDone()) {
            C11876H0 c11876h0 = new C11876H0();
            c11876h0.f36135t0 = interfaceFutureC12028y0M17706M;
            RunnableC11870F0 runnableC11870F0 = new RunnableC11870F0();
            runnableC11870F0.f36124Y = c11876h0;
            c11876h0.f36136u0 = ((C11867E0) interfaceScheduledExecutorServiceC11854A0).schedule(runnableC11870F0, 28500L, timeUnit);
            interfaceFutureC12028y0M17706M.mo13259b(runnableC11870F0, EnumC12000r0.f36313Y);
            interfaceFutureC12028y0M17706M = c11876h0;
        }
        interfaceFutureC12028y0M17706M.mo13259b(new RunnableC12008t0(interfaceFutureC12028y0M17706M, new C20810l(this, i10, consumer, runnable)), m17760H());
    }

    @Override // p826j6.C16149c, p826j6.AbstractC16148b
    /* JADX INFO: renamed from: a */
    public final void mo17709a(C4612e c4612e, C12746a c12746a) {
        m17708O(3, new C16135D(c12746a, 1), new RunnableC7757e(this, c4612e, c12746a, 7));
    }

    @Override // p826j6.C16149c, p826j6.AbstractC16148b
    /* JADX INFO: renamed from: b */
    public final void mo17710b(final C4613f c4613f, final C12746a c12746a) {
        m17708O(4, new Consumer() { // from class: j6.E
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m17405p(Object obj) {
                String str = c4613f.f15035Y;
                c12746a.m14489d((C16155i) obj, str);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new RunnableC7757e(this, c4613f, c12746a, 6));
    }

    @Override // p826j6.C16149c, p826j6.AbstractC16148b
    /* JADX INFO: renamed from: c */
    public final void mo17711c() {
        synchronized (this) {
            C11924X1 c11924x1M17719d = AbstractC16142K.m17719d(27);
            Objects.requireNonNull(c11924x1M17719d, "ApiSuccess should not be null");
            this.f50118g.m16155v(c11924x1M17719d);
            try {
                try {
                    if (this.f50069I != null && this.f50068H != null) {
                        AbstractC11988o0.m13511f("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.f50066F.unbindService(this.f50069I);
                        this.f50069I = new ServiceConnectionC6160m(this, 4);
                    }
                    this.f50068H = null;
                    if (this.f50070J != null) {
                        ((C11858B0) this.f50070J).shutdownNow();
                        this.f50070J = null;
                    }
                } catch (RuntimeException e10) {
                    AbstractC11988o0.m13513h("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e10);
                }
                this.f50067G = 3;
            } catch (Throwable th2) {
                this.f50067G = 3;
                throw th2;
            }
        }
        super.mo17711c();
    }

    @Override // p826j6.C16149c, p826j6.AbstractC16148b
    /* JADX INFO: renamed from: f */
    public final C16155i mo17712f(Activity activity, C16154h c16154h) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) m17706M(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            m17707N(114, 28, AbstractC16144M.f50077E);
            AbstractC11988o0.m13513h("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            m17707N(107, 28, AbstractC16144M.f50077E);
            AbstractC11988o0.m13513h("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
        }
        if (iIntValue > 0) {
            C16155i c16155iM17720a = AbstractC16144M.m17720a(iIntValue, "Billing override value was set by a license tester.");
            m17707N(105, 2, c16155iM17720a);
            m17759G(c16155iM17720a);
            return c16155iM17720a;
        }
        try {
            return super.mo17712f(activity, c16154h);
        } catch (Exception e12) {
            C16155i c16155i = AbstractC16144M.f50086i;
            m17707N(115, 2, c16155i);
            AbstractC11988o0.m13513h("BillingClientTesting", "An internal error occurred.", e12);
            return c16155i;
        }
    }

    @Override // p826j6.C16149c, p826j6.AbstractC16148b
    /* JADX INFO: renamed from: g */
    public final void mo17713g(C16167u c16167u, C12748c c12748c) {
        m17708O(7, new C16135D(c12748c, 0), new RunnableC7757e(this, c16167u, c12748c, 5));
    }

    @Override // p826j6.C16149c, p826j6.AbstractC16148b
    /* JADX INFO: renamed from: h */
    public final void mo17714h(InterfaceC16150d interfaceC16150d) {
        synchronized (this) {
            if (m17705L()) {
                AbstractC11988o0.m13511f("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                C11924X1 c11924x1M17719d = AbstractC16142K.m17719d(26);
                Objects.requireNonNull(c11924x1M17719d, "ApiSuccess should not be null");
                this.f50118g.m16155v(c11924x1M17719d);
            } else {
                int i10 = 1;
                if (this.f50067G == 1) {
                    AbstractC11988o0.m13512g("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.f50067G == 3) {
                    AbstractC11988o0.m13512g("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    m17707N(38, 26, AbstractC16144M.m17720a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.f50067G = 1;
                    AbstractC11988o0.m13511f("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.f50069I = new ServiceConnectionC6160m(this, 4);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    List<ResolveInfo> listQueryIntentServices = this.f50066F.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        i10 = 41;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                AbstractC11988o0.m13512g("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (this.f50066F.bindService(intent2, this.f50069I, 1)) {
                                    AbstractC11988o0.m13511f("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    AbstractC11988o0.m13512g("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i10 = 39;
                        }
                    }
                    this.f50067G = 0;
                    AbstractC11988o0.m13511f("BillingClientTesting", "Billing Override Service unavailable on device.");
                    m17707N(i10, 26, AbstractC16144M.m17720a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        super.mo17714h(interfaceC16150d);
    }

    public C16139H(C0376k c0376k, Context context, InterfaceC16165s interfaceC16165s) {
        super(c0376k, context, interfaceC16165s);
        this.f50067G = 0;
        this.f50066F = context;
    }
}
