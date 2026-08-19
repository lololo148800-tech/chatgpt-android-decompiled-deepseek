package p826j6;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import com.google.android.gms.internal.play_billing.AbstractC11857B;
import com.google.android.gms.internal.play_billing.AbstractC11957g1;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.google.android.gms.internal.play_billing.AbstractC11991p;
import com.google.android.gms.internal.play_billing.C11858B0;
import com.google.android.gms.internal.play_billing.C11867E0;
import com.google.android.gms.internal.play_billing.C11894N0;
import com.google.android.gms.internal.play_billing.C11897O0;
import com.google.android.gms.internal.play_billing.C11915U1;
import com.google.android.gms.internal.play_billing.C11918V1;
import com.google.android.gms.internal.play_billing.C11921W1;
import com.google.android.gms.internal.play_billing.C11924X1;
import com.google.android.gms.internal.play_billing.C11927Y1;
import com.google.android.gms.internal.play_billing.C11930Z1;
import com.google.android.gms.internal.play_billing.C11935b;
import com.google.android.gms.internal.play_billing.C11950e2;
import com.google.android.gms.internal.play_billing.C11954f2;
import com.google.android.gms.internal.play_billing.C11962h2;
import com.google.android.gms.internal.play_billing.C11970j2;
import com.google.android.gms.internal.play_billing.C12006s2;
import com.google.android.gms.internal.play_billing.C12010t2;
import com.google.android.gms.internal.play_billing.C12027y;
import com.google.android.gms.internal.play_billing.InterfaceC11943d;
import com.google.android.gms.internal.play_billing.InterfaceExecutorServiceC12032z0;
import com.revenuecat.purchases.google.usecase.C12746a;
import com.revenuecat.purchases.google.usecase.C12747b;
import com.revenuecat.purchases.google.usecase.C12748c;
import io.sentry.android.core.RunnableC15195M;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;
import p001A.C0042V0;
import p007A5.C0376k;
import p009A7.ThreadFactoryC0394d;
import p013Ab.C0420b;
import p138F8.vJO.vRJidSveZHcTw;
import p228J.AbstractC3794B0;
import p265Kb.C4612e;
import p265Kb.C4613f;
import p519V4.RunnableC7757e;
import p618Za.C10267f;
import p658b5.C11234e;
import p775h2.AbstractC14376f;
import p813ij.C15026j;
import p817j$.util.Collection;
import p817j$.util.Objects;
import p817j$.util.function.Function$CC;
import p817j$.util.function.Predicate$CC;
import p826j6.C16153g;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: j6.c */
/* JADX INFO: loaded from: classes.dex */
public class C16149c extends AbstractC16148b {

    /* JADX INFO: renamed from: A */
    public final C0376k f50107A;

    /* JADX INFO: renamed from: B */
    public final boolean f50108B;

    /* JADX INFO: renamed from: C */
    public ExecutorService f50109C;

    /* JADX INFO: renamed from: D */
    public volatile InterfaceExecutorServiceC12032z0 f50110D;

    /* JADX INFO: renamed from: E */
    public final Long f50111E;

    /* JADX INFO: renamed from: a */
    public final Object f50112a;

    /* JADX INFO: renamed from: b */
    public volatile int f50113b;

    /* JADX INFO: renamed from: c */
    public final String f50114c;

    /* JADX INFO: renamed from: d */
    public final Handler f50115d;

    /* JADX INFO: renamed from: e */
    public volatile C0042V0 f50116e;

    /* JADX INFO: renamed from: f */
    public final Context f50117f;

    /* JADX INFO: renamed from: g */
    public final C15026j f50118g;

    /* JADX INFO: renamed from: h */
    public volatile InterfaceC11943d f50119h;

    /* JADX INFO: renamed from: i */
    public volatile ServiceConnectionC16132A f50120i;

    /* JADX INFO: renamed from: j */
    public boolean f50121j;

    /* JADX INFO: renamed from: k */
    public boolean f50122k;

    /* JADX INFO: renamed from: l */
    public int f50123l;

    /* JADX INFO: renamed from: m */
    public boolean f50124m;

    /* JADX INFO: renamed from: n */
    public boolean f50125n;

    /* JADX INFO: renamed from: o */
    public boolean f50126o;

    /* JADX INFO: renamed from: p */
    public boolean f50127p;

    /* JADX INFO: renamed from: q */
    public boolean f50128q;

    /* JADX INFO: renamed from: r */
    public boolean f50129r;

    /* JADX INFO: renamed from: s */
    public boolean f50130s;

    /* JADX INFO: renamed from: t */
    public boolean f50131t;

    /* JADX INFO: renamed from: u */
    public boolean f50132u;

    /* JADX INFO: renamed from: v */
    public boolean f50133v;

    /* JADX INFO: renamed from: w */
    public boolean f50134w;

    /* JADX INFO: renamed from: x */
    public boolean f50135x;

    /* JADX INFO: renamed from: y */
    public boolean f50136y;

    /* JADX INFO: renamed from: z */
    public boolean f50137z;

    public C16149c(C0376k c0376k, Context context) {
        this.f50112a = new Object();
        this.f50113b = 0;
        this.f50115d = new Handler(Looper.getMainLooper());
        this.f50123l = 0;
        long jNextLong = new Random().nextLong();
        this.f50111E = Long.valueOf(jNextLong);
        this.f50114c = m17751l();
        this.f50117f = context.getApplicationContext();
        C11950e2 c11950e2M13420r = C11954f2.m13420r();
        String strM17751l = m17751l();
        c11950e2M13420r.m13473d();
        C11954f2.m13419q((C11954f2) c11950e2M13420r.f36278Z, strM17751l);
        String packageName = this.f50117f.getPackageName();
        c11950e2M13420r.m13473d();
        C11954f2.m13418p((C11954f2) c11950e2M13420r.f36278Z, packageName);
        c11950e2M13420r.m13473d();
        C11954f2.m13417o((C11954f2) c11950e2M13420r.f36278Z, jNextLong);
        this.f50118g = new C15026j(this.f50117f, (C11954f2) c11950e2M13420r.m13471b());
        AbstractC11988o0.m13512g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f50116e = new C0042V0(this.f50117f, (InterfaceC16165s) null, this.f50118g);
        this.f50107A = c0376k;
        this.f50117f.getPackageName();
    }

    /* JADX INFO: renamed from: i */
    public static Future m17750i(Callable callable, long j10, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new RunnableC15195M(futureSubmit, runnable, false, 2), (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            AbstractC11988o0.m13513h("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m17751l() {
        try {
            return (String) AbstractC16347a.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "7.1.1";
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m17752y(C16149c c16149c) {
        boolean z6;
        synchronized (c16149c.f50112a) {
            z6 = true;
            if (c16149c.f50113b != 1) {
                z6 = false;
            }
        }
        return z6;
    }

    /* JADX INFO: renamed from: A */
    public final C16155i m17753A() {
        AbstractC11988o0.m13511f("BillingClient", "Service connection is valid. No need to re-initialize.");
        C11921W1 c11921w1M13365q = C11924X1.m13365q();
        c11921w1M13365q.m13473d();
        C11924X1.m13364p((C11924X1) c11921w1M13365q.f36278Z, 6);
        C12006s2 c12006s2M13526o = C12010t2.m13526o();
        c12006s2M13526o.m13473d();
        C12010t2.m13525n((C12010t2) c12006s2M13526o.f36278Z);
        c11921w1M13365q.m13473d();
        C11924X1.m13363o((C11924X1) c11921w1M13365q.f36278Z, (C12010t2) c12006s2M13526o.m13471b());
        m17765o((C11924X1) c11921w1M13365q.m13471b());
        return AbstractC16144M.f50087j;
    }

    /* JADX INFO: renamed from: B */
    public final void m17754B(C12747b c12747b, C16155i c16155i, int i10, Exception exc) {
        AbstractC11988o0.m13513h("BillingClient", "getBillingConfig got an exception.", exc);
        m17757E(i10, 13, c16155i, AbstractC16142K.m17716a(exc));
        c12747b.m14490a(c16155i, null);
    }

    /* JADX INFO: renamed from: C */
    public final void m17755C(int i10, int i11, Exception exc) {
        C11918V1 c11918v1;
        AbstractC11988o0.m13513h("BillingClient", "showInAppMessages error.", exc);
        C15026j c15026j = this.f50118g;
        String strM17716a = AbstractC16142K.m17716a(exc);
        try {
            C11927Y1 c11927y1M13380r = C11930Z1.m13380r();
            c11927y1M13380r.m13369e(i10);
            c11927y1M13380r.m13370f(i11);
            if (strM17716a != null) {
                c11927y1M13380r.m13473d();
                C11930Z1.m13376n((C11930Z1) c11927y1M13380r.f36278Z, strM17716a);
            }
            C11915U1 c11915u1M13360r = C11918V1.m13360r();
            c11915u1M13360r.m13354e(c11927y1M13380r);
            c11915u1M13360r.m13355f(30);
            c11918v1 = (C11918V1) c11915u1M13360r.m13471b();
        } catch (Throwable th2) {
            AbstractC11988o0.m13513h("BillingLogger", "Unable to create logging payload", th2);
            c11918v1 = null;
        }
        c15026j.m16153t(c11918v1);
    }

    /* JADX INFO: renamed from: D */
    public final void m17756D(int i10, int i11, C16155i c16155i) {
        try {
            m17764n(AbstractC16142K.m17717b(i10, i11, c16155i));
        } catch (Throwable th2) {
            AbstractC11988o0.m13513h("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m17757E(int i10, int i11, C16155i c16155i, String str) {
        try {
            m17764n(AbstractC16142K.m17718c(i10, i11, c16155i, str));
        } catch (Throwable th2) {
            AbstractC11988o0.m13513h("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m17758F(int i10) {
        try {
            m17765o(AbstractC16142K.m17719d(i10));
        } catch (Throwable th2) {
            AbstractC11988o0.m13513h("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m17759G(C16155i c16155i) {
        if (Thread.interrupted()) {
            return;
        }
        this.f50115d.post(new RunnableC15195M(this, c16155i, false, 5));
    }

    /* JADX INFO: renamed from: H */
    public final synchronized InterfaceExecutorServiceC12032z0 m17760H() {
        InterfaceExecutorServiceC12032z0 c11867e0;
        try {
            if (this.f50110D == null) {
                ExecutorService executorServiceM17763m = m17763m();
                if (executorServiceM17763m instanceof InterfaceExecutorServiceC12032z0) {
                    c11867e0 = (InterfaceExecutorServiceC12032z0) executorServiceM17763m;
                } else {
                    c11867e0 = executorServiceM17763m instanceof ScheduledExecutorService ? new C11867E0((ScheduledExecutorService) executorServiceM17763m) : new C11858B0(executorServiceM17763m);
                }
                this.f50110D = c11867e0;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f50110D;
    }

    @Override // p826j6.AbstractC16148b
    /* JADX INFO: renamed from: a */
    public void mo17709a(C4612e c4612e, C12746a c12746a) {
        if (!mo17749e()) {
            C16155i c16155i = AbstractC16144M.f50088k;
            m17756D(2, 3, c16155i);
            c12746a.m14488c(c16155i);
            return;
        }
        if (TextUtils.isEmpty(c4612e.f15034Z)) {
            AbstractC11988o0.m13512g("BillingClient", "Please provide a valid purchase token.");
            C16155i c16155i2 = AbstractC16144M.f50085h;
            m17756D(26, 3, c16155i2);
            c12746a.m14488c(c16155i2);
            return;
        }
        if (!this.f50126o) {
            C16155i c16155i3 = AbstractC16144M.f50079b;
            m17756D(27, 3, c16155i3);
            c12746a.m14488c(c16155i3);
            return;
        }
        if (m17750i(new CallableC16170x(this, c12746a, c4612e, 5), 30000L, new RunnableC15195M(this, c12746a, false, 6), m17775z(), m17763m()) == null) {
            C16155i c16155iM17761j = m17761j();
            m17756D(25, 3, c16155iM17761j);
            c12746a.m14488c(c16155iM17761j);
        }
    }

    @Override // p826j6.AbstractC16148b
    /* JADX INFO: renamed from: b */
    public void mo17710b(C4613f c4613f, C12746a c12746a) {
        if (!mo17749e()) {
            C16155i c16155i = AbstractC16144M.f50088k;
            m17756D(2, 4, c16155i);
            c12746a.m14489d(c16155i, c4613f.f15035Y);
        } else if (m17750i(new CallableC16170x(this, c4613f, c12746a, 0), 30000L, new RunnableC7757e(this, c12746a, c4613f, 4), m17775z(), m17763m()) == null) {
            C16155i c16155iM17761j = m17761j();
            m17756D(25, 4, c16155iM17761j);
            c12746a.m14489d(c16155iM17761j, c4613f.f15035Y);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    @Override // p826j6.AbstractC16148b
    /* JADX INFO: renamed from: d */
    public final C16155i mo17748d(String str) {
        if (!mo17749e()) {
            C16155i c16155i = AbstractC16144M.f50088k;
            if (c16155i.f50151a != 0) {
                m17756D(2, 5, c16155i);
            } else {
                m17758F(5);
            }
            return c16155i;
        }
        C16155i c16155i2 = AbstractC16144M.f50078a;
        switch (str) {
            case "subscriptions":
                C16155i c16155i3 = this.f50121j ? AbstractC16144M.f50087j : AbstractC16144M.f50090m;
                m17772v(9, 2, c16155i3);
                return c16155i3;
            case "subscriptionsUpdate":
                C16155i c16155i4 = this.f50122k ? AbstractC16144M.f50087j : AbstractC16144M.f50091n;
                m17772v(10, 3, c16155i4);
                return c16155i4;
            case "priceChangeConfirmation":
                C16155i c16155i5 = this.f50125n ? AbstractC16144M.f50087j : AbstractC16144M.f50093p;
                m17772v(35, 4, c16155i5);
                return c16155i5;
            case "bbb":
                C16155i c16155i6 = this.f50127p ? AbstractC16144M.f50087j : AbstractC16144M.f50098u;
                m17772v(30, 5, c16155i6);
                return c16155i6;
            case "aaa":
                C16155i c16155i7 = this.f50129r ? AbstractC16144M.f50087j : AbstractC16144M.f50094q;
                m17772v(31, 6, c16155i7);
                return c16155i7;
            case "ddd":
                C16155i c16155i8 = this.f50128q ? AbstractC16144M.f50087j : AbstractC16144M.f50096s;
                m17772v(21, 7, c16155i8);
                return c16155i8;
            case "ccc":
                C16155i c16155i9 = this.f50130s ? AbstractC16144M.f50087j : AbstractC16144M.f50095r;
                m17772v(19, 8, c16155i9);
                return c16155i9;
            case "eee":
                C16155i c16155i10 = this.f50130s ? AbstractC16144M.f50087j : AbstractC16144M.f50095r;
                m17772v(61, 9, c16155i10);
                return c16155i10;
            case "fff":
                C16155i c16155i11 = this.f50131t ? AbstractC16144M.f50087j : AbstractC16144M.f50097t;
                m17772v(20, 10, c16155i11);
                return c16155i11;
            case "ggg":
                C16155i c16155i12 = this.f50132u ? AbstractC16144M.f50087j : AbstractC16144M.f50102y;
                m17772v(32, 11, c16155i12);
                return c16155i12;
            case "hhh":
                C16155i c16155i13 = this.f50132u ? AbstractC16144M.f50087j : AbstractC16144M.f50103z;
                m17772v(33, 12, c16155i13);
                return c16155i13;
            case "iii":
                C16155i c16155i14 = this.f50134w ? AbstractC16144M.f50087j : AbstractC16144M.f50074B;
                m17772v(60, 13, c16155i14);
                return c16155i14;
            case "jjj":
                C16155i c16155i15 = this.f50135x ? AbstractC16144M.f50087j : AbstractC16144M.f50075C;
                m17772v(66, 14, c16155i15);
                return c16155i15;
            case "kkk":
                C16155i c16155i16 = this.f50136y ? AbstractC16144M.f50087j : AbstractC16144M.f50099v;
                m17772v(103, 18, c16155i16);
                return c16155i16;
            case "lll":
                C16155i c16155i17 = this.f50137z ? AbstractC16144M.f50087j : AbstractC16144M.f50100w;
                m17772v(116, 19, c16155i17);
                return c16155i17;
            default:
                AbstractC11988o0.m13512g("BillingClient", "Unsupported feature: ".concat(str));
                C16155i c16155i18 = AbstractC16144M.f50101x;
                m17772v(34, 1, c16155i18);
                return c16155i18;
        }
    }

    @Override // p826j6.AbstractC16148b
    /* JADX INFO: renamed from: e */
    public final boolean mo17749e() {
        boolean z6;
        synchronized (this.f50112a) {
            try {
                z6 = false;
                if (this.f50113b == 2 && this.f50119h != null && this.f50120i != null) {
                    z6 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z6;
    }

    @Override // p826j6.AbstractC16148b
    /* JADX INFO: renamed from: g */
    public void mo17713g(C16167u c16167u, C12748c c12748c) {
        if (!mo17749e()) {
            C16155i c16155i = AbstractC16144M.f50088k;
            m17756D(2, 7, c16155i);
            c12748c.mo14487b(c16155i, new ArrayList());
        } else {
            if (!this.f50131t) {
                AbstractC11988o0.m13512g("BillingClient", "Querying product details is not supported.");
                C16155i c16155i2 = AbstractC16144M.f50097t;
                m17756D(20, 7, c16155i2);
                c12748c.mo14487b(c16155i2, new ArrayList());
                return;
            }
            if (m17750i(new CallableC16170x(this, c16167u, c12748c, 1), 30000L, new RunnableC15195M(this, c12748c, false, 4), m17775z(), m17763m()) == null) {
                C16155i c16155iM17761j = m17761j();
                m17756D(25, 7, c16155iM17761j);
                c12748c.mo14487b(c16155iM17761j, new ArrayList());
            }
        }
    }

    @Override // p826j6.AbstractC16148b
    /* JADX INFO: renamed from: h */
    public void mo17714h(InterfaceC16150d interfaceC16150d) {
        C16155i c16155iM17753A;
        synchronized (this.f50112a) {
            try {
                if (mo17749e()) {
                    c16155iM17753A = m17753A();
                } else if (this.f50113b == 1) {
                    AbstractC11988o0.m13512g("BillingClient", "Client is already in the process of connecting to billing service.");
                    c16155iM17753A = AbstractC16144M.f50082e;
                    m17756D(37, 6, c16155iM17753A);
                } else if (this.f50113b == 3) {
                    AbstractC11988o0.m13512g("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    c16155iM17753A = AbstractC16144M.f50088k;
                    m17756D(38, 6, c16155iM17753A);
                } else {
                    m17766p(1);
                    m17768r();
                    AbstractC11988o0.m13511f("BillingClient", "Starting in-app billing setup.");
                    this.f50120i = new ServiceConnectionC16132A(this, interfaceC16150d);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> listQueryIntentServices = this.f50117f.getPackageManager().queryIntentServices(intent, 0);
                    int i10 = 41;
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        m17766p(0);
                        AbstractC11988o0.m13511f("BillingClient", "Billing service unavailable on device.");
                        c16155iM17753A = AbstractC16144M.f50080c;
                        m17756D(i10, 6, c16155iM17753A);
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        i10 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                AbstractC11988o0.m13512g("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f50114c);
                                synchronized (this.f50112a) {
                                    try {
                                        if (this.f50113b == 2) {
                                            c16155iM17753A = m17753A();
                                        } else if (this.f50113b != 1) {
                                            AbstractC11988o0.m13512g("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            c16155iM17753A = AbstractC16144M.f50088k;
                                            m17756D(117, 6, c16155iM17753A);
                                        } else {
                                            ServiceConnectionC16132A serviceConnectionC16132A = this.f50120i;
                                            if (this.f50117f.bindService(intent2, serviceConnectionC16132A, 1)) {
                                                AbstractC11988o0.m13511f("BillingClient", "Service was bonded successfully.");
                                                c16155iM17753A = null;
                                            } else {
                                                AbstractC11988o0.m13512g("BillingClient", "Connection to Billing service is blocked.");
                                                i10 = 39;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        } else {
                            AbstractC11988o0.m13512g("BillingClient", "The device doesn't have valid Play Store.");
                        }
                        m17766p(0);
                        AbstractC11988o0.m13511f("BillingClient", "Billing service unavailable on device.");
                        c16155iM17753A = AbstractC16144M.f50080c;
                        m17756D(i10, 6, c16155iM17753A);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (c16155iM17753A != null) {
            interfaceC16150d.onBillingSetupFinished(c16155iM17753A);
        }
    }

    /* JADX INFO: renamed from: j */
    public final C16155i m17761j() {
        C16155i c16155i;
        int[] iArr = {0, 3};
        synchronized (this.f50112a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f50113b == iArr[i10]) {
                    c16155i = AbstractC16144M.f50088k;
                }
            }
            c16155i = AbstractC16144M.f50086i;
        }
        return c16155i;
    }

    /* JADX INFO: renamed from: k */
    public final void m17762k() {
        if (TextUtils.isEmpty(null)) {
            this.f50117f.getPackageName();
        }
    }

    /* JADX INFO: renamed from: m */
    public final synchronized ExecutorService m17763m() {
        try {
            if (this.f50109C == null) {
                this.f50109C = Executors.newFixedThreadPool(AbstractC11988o0.f36308a, new ThreadFactoryC0394d());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f50109C;
    }

    /* JADX INFO: renamed from: n */
    public final void m17764n(C11918V1 c11918v1) {
        try {
            this.f50118g.m16154u(c11918v1, this.f50123l);
        } catch (Throwable th2) {
            AbstractC11988o0.m13513h("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m17765o(C11924X1 c11924x1) {
        try {
            C15026j c15026j = this.f50118g;
            int i10 = this.f50123l;
            c15026j.getClass();
            try {
                C11950e2 c11950e2 = (C11950e2) ((C11954f2) c15026j.f46724Y).m13481g();
                c11950e2.m13473d();
                C11954f2.m13416n((C11954f2) c11950e2.f36278Z, i10);
                c15026j.f46724Y = (C11954f2) c11950e2.m13471b();
                c15026j.m16155v(c11924x1);
            } catch (Throwable th2) {
                AbstractC11988o0.m13513h("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            AbstractC11988o0.m13513h("BillingClient", "Unable to log.", th3);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m17766p(int i10) {
        String str;
        String str2;
        synchronized (this.f50112a) {
            try {
                if (this.f50113b == 3) {
                    return;
                }
                int i11 = this.f50113b;
                if (i11 == 0) {
                    str = "DISCONNECTED";
                } else if (i11 != 1) {
                    str = i11 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str = "CONNECTING";
                }
                if (i10 == 0) {
                    str2 = "DISCONNECTED";
                } else if (i10 != 1) {
                    str2 = i10 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str2 = "CONNECTING";
                }
                AbstractC11988o0.m13511f("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.f50113b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m17767q() {
        ExecutorService executorService = this.f50109C;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f50109C = null;
            this.f50110D = null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m17768r() {
        synchronized (this.f50112a) {
            if (this.f50120i != null) {
                try {
                    this.f50117f.unbindService(this.f50120i);
                    this.f50119h = null;
                    this.f50120i = null;
                } catch (Throwable th2) {
                    try {
                        AbstractC11988o0.m13513h("BillingClient", "There was an exception while unbinding service!", th2);
                        this.f50119h = null;
                        this.f50120i = null;
                    } catch (Throwable th3) {
                        this.f50119h = null;
                        this.f50120i = null;
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final C0420b m17769s(C16155i c16155i, int i10, String str, Exception exc) {
        AbstractC11988o0.m13513h("BillingClient", str, exc);
        m17757E(i10, 7, c16155i, AbstractC16142K.m17716a(exc));
        return new C0420b(c16155i.f50151a, c16155i.f50152b, new ArrayList());
    }

    /* JADX INFO: renamed from: t */
    public final C15384c m17770t(C16155i c16155i, int i10, String str, Exception exc) {
        AbstractC11988o0.m13513h("BillingClient", str, exc);
        m17757E(i10, 11, c16155i, AbstractC16142K.m17716a(exc));
        return new C15384c(c16155i, null, false, 26);
    }

    /* JADX INFO: renamed from: u */
    public final C11234e m17771u(C16155i c16155i, int i10, String str, Exception exc) {
        m17757E(i10, 9, c16155i, AbstractC16142K.m17716a(exc));
        AbstractC11988o0.m13513h("BillingClient", str, exc);
        return new C11234e(c16155i, null, false, 27);
    }

    /* JADX INFO: renamed from: v */
    public final void m17772v(int i10, int i11, C16155i c16155i) {
        C11924X1 c11924x1 = null;
        C11918V1 c11918v1 = null;
        if (c16155i.f50151a == 0) {
            int i12 = AbstractC16142K.f50071a;
            try {
                C11921W1 c11921w1M13365q = C11924X1.m13365q();
                c11921w1M13365q.m13473d();
                C11924X1.m13364p((C11924X1) c11921w1M13365q.f36278Z, 5);
                C11962h2 c11962h2M13485o = C11970j2.m13485o();
                c11962h2M13485o.m13473d();
                C11970j2.m13484n((C11970j2) c11962h2M13485o.f36278Z, i11);
                C11970j2 c11970j2 = (C11970j2) c11962h2M13485o.m13471b();
                c11921w1M13365q.m13473d();
                C11924X1.m13362n((C11924X1) c11921w1M13365q.f36278Z, c11970j2);
                c11924x1 = (C11924X1) c11921w1M13365q.m13471b();
            } catch (Exception e10) {
                AbstractC11988o0.m13513h("BillingLogger", "Unable to create logging payload", e10);
            }
            m17765o(c11924x1);
            return;
        }
        int i13 = AbstractC16142K.f50071a;
        try {
            C11915U1 c11915u1M13360r = C11918V1.m13360r();
            C11927Y1 c11927y1M13380r = C11930Z1.m13380r();
            c11927y1M13380r.m13369e(c16155i.f50151a);
            String str = c16155i.f50152b;
            c11927y1M13380r.m13473d();
            C11930Z1.m13377o((C11930Z1) c11927y1M13380r.f36278Z, str);
            c11927y1M13380r.m13370f(i10);
            c11915u1M13360r.m13354e(c11927y1M13380r);
            c11915u1M13360r.m13355f(5);
            C11962h2 c11962h2M13485o2 = C11970j2.m13485o();
            c11962h2M13485o2.m13473d();
            C11970j2.m13484n((C11970j2) c11962h2M13485o2.f36278Z, i11);
            C11970j2 c11970j3 = (C11970j2) c11962h2M13485o2.m13471b();
            c11915u1M13360r.m13473d();
            C11918V1.m13358p((C11918V1) c11915u1M13360r.f36278Z, c11970j3);
            c11918v1 = (C11918V1) c11915u1M13360r.m13471b();
        } catch (Exception e11) {
            AbstractC11988o0.m13513h("BillingLogger", "Unable to create logging payload", e11);
        }
        m17764n(c11918v1);
    }

    /* JADX INFO: renamed from: w */
    public final void m17773w(C12746a c12746a, C16155i c16155i, int i10, Exception exc) {
        AbstractC11988o0.m13513h("BillingClient", "Error in acknowledge purchase!", exc);
        m17757E(i10, 3, c16155i, AbstractC16142K.m17716a(exc));
        c12746a.m14488c(c16155i);
    }

    /* JADX INFO: renamed from: x */
    public final void m17774x(C12746a c12746a, String str, C16155i c16155i, int i10, String str2, Exception exc) {
        AbstractC11988o0.m13513h("BillingClient", str2, exc);
        m17757E(i10, 4, c16155i, AbstractC16142K.m17716a(exc));
        c12746a.m14489d(c16155i, str);
    }

    /* JADX INFO: renamed from: z */
    public final Handler m17775z() {
        return Looper.myLooper() == null ? this.f50115d : new Handler(Looper.myLooper());
    }

    @Override // p826j6.AbstractC16148b
    /* JADX INFO: renamed from: c */
    public void mo17711c() {
        m17758F(12);
        synchronized (this.f50112a) {
            try {
                if (this.f50116e != null) {
                    C0042V0 c0042v0 = this.f50116e;
                    C16146O c16146o = (C16146O) c0042v0.f208q0;
                    Context context = (Context) c0042v0.f205Z;
                    c16146o.m17746b(context);
                    ((C16146O) c0042v0.f209r0).m17746b(context);
                    try {
                        AbstractC11988o0.m13511f("BillingClient", vRJidSveZHcTw.SyzzIfIzIHZS);
                        m17768r();
                    } catch (Throwable th2) {
                        AbstractC11988o0.m13513h("BillingClient", "There was an exception while unbinding from the service while ending connection!", th2);
                    }
                    try {
                        m17767q();
                    } catch (Throwable th3) {
                        try {
                            AbstractC11988o0.m13513h("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th3);
                        } catch (Throwable th4) {
                            m17766p(3);
                            throw th4;
                        }
                    }
                    m17766p(3);
                } else {
                    AbstractC11988o0.m13511f("BillingClient", vRJidSveZHcTw.SyzzIfIzIHZS);
                    m17768r();
                    m17767q();
                    m17766p(3);
                }
            } catch (Throwable th5) {
                AbstractC11988o0.m13513h("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th5);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:272:0x068d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    @Override // p826j6.AbstractC16148b
    /* JADX INFO: renamed from: f */
    public C16155i mo17712f(Activity activity, final C16154h c16154h) {
        String str;
        String str2;
        String str3;
        C16155i c16155iM17720a;
        String str4;
        String str5;
        Future futureM17750i;
        int iM13452o;
        int i10;
        String string;
        boolean z6;
        String str6;
        String str7;
        C16153g c16153g;
        boolean z10;
        String str8;
        int i11;
        final int i12;
        C16149c c16149c = this;
        String str9 = "BUY_INTENT";
        if (c16149c.f50116e == null || ((InterfaceC16165s) c16149c.f50116e.f206o0) == null) {
            C16155i c16155i = AbstractC16144M.f50076D;
            c16149c.m17756D(12, 2, c16155i);
            return c16155i;
        }
        if (!mo17749e()) {
            C16155i c16155i2 = AbstractC16144M.f50088k;
            c16149c.m17756D(2, 2, c16155i2);
            c16149c.m17759G(c16155i2);
            return c16155i2;
        }
        c16154h.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c16154h.f50149e);
        AbstractC11857B abstractC11857B = c16154h.f50148d;
        Iterator it = arrayList.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            throw new ClassCastException();
        }
        C12027y c12027y = (C12027y) abstractC11857B.iterator();
        C16153g c16153g2 = (C16153g) (c12027y.hasNext() ? c12027y.next() : null);
        C16162p c16162p = c16153g2.f50143a;
        String str10 = c16162p.f50177c;
        String str11 = c16162p.f50178d;
        if (str11.equals("subs") && !c16149c.f50121j) {
            AbstractC11988o0.m13512g("BillingClient", "Current client doesn't support subscriptions.");
            C16155i c16155i3 = AbstractC16144M.f50090m;
            c16149c.m17756D(9, 2, c16155i3);
            c16149c.m17759G(c16155i3);
            return c16155i3;
        }
        if (c16154h.f50146b == null) {
            C10267f c10267f = c16154h.f50147c;
            c10267f.getClass();
            if (c10267f.f30498b != 0 || Collection.EL.stream(c16154h.f50148d).anyMatch(new C16140I()) || c16154h.f50145a || c16154h.f50150f) {
                if (!c16149c.f50124m) {
                    AbstractC11988o0.m13512g("BillingClient", "Current client doesn't support extra params for buy intent.");
                    C16155i c16155i4 = AbstractC16144M.f50084g;
                    c16149c.m17756D(18, 2, c16155i4);
                    c16149c.m17759G(c16155i4);
                    return c16155i4;
                }
            }
        } else if (!c16149c.f50124m) {
            AbstractC11988o0.m13512g("BillingClient", "Current client doesn't support extra params for buy intent.");
            C16155i c16155i5 = AbstractC16144M.f50084g;
            c16149c.m17756D(18, 2, c16155i5);
            c16149c.m17759G(c16155i5);
            return c16155i5;
        }
        if (arrayList.size() > 1 && !c16149c.f50130s) {
            AbstractC11988o0.m13512g("BillingClient", "Current client doesn't support multi-item purchases.");
            C16155i c16155i6 = AbstractC16144M.f50095r;
            c16149c.m17756D(19, 2, c16155i6);
            c16149c.m17759G(c16155i6);
            return c16155i6;
        }
        if (!abstractC11857B.isEmpty() && !c16149c.f50131t) {
            AbstractC11988o0.m13512g("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            C16155i c16155i7 = AbstractC16144M.f50097t;
            c16149c.m17756D(20, 2, c16155i7);
            c16149c.m17759G(c16155i7);
            return c16155i7;
        }
        if (!c16154h.f50148d.isEmpty()) {
            C16153g c16153g3 = (C16153g) c16154h.f50148d.get(0);
            int i13 = 1;
            while (true) {
                if (i13 >= c16154h.f50148d.size()) {
                    str = str9;
                    String strM17782d = c16153g3.m17777a().m17782d();
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    AbstractC11857B abstractC11857B2 = c16154h.f50148d;
                    int size = abstractC11857B2.size();
                    str2 = str11;
                    str3 = str10;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            Iterator it2 = hashSet2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    C16159m c16159mM17779a = c16153g3.m17777a().m17779a();
                                    if (c16159mM17779a != null && c16159mM17779a.f50162f != null) {
                                        c16155iM17720a = AbstractC16144M.m17720a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                        break;
                                    }
                                    c16155iM17720a = AbstractC16144M.f50087j;
                                    break;
                                }
                                String str12 = (String) it2.next();
                                if (hashSet.contains(str12)) {
                                    c16155iM17720a = AbstractC16144M.m17720a(5, qffLJgOYizGmMj.XDpCYemNAgpjWuL + str12 + Separators.DOT);
                                    break;
                                }
                            }
                        } else {
                            C16153g c16153g4 = (C16153g) abstractC11857B2.get(i14);
                            int i15 = size;
                            AbstractC11857B abstractC11857B3 = abstractC11857B2;
                            c16153g4.m17777a().m17781c().equals("subs");
                            if (!hashSet.contains(c16153g4.m17777a().m17780b())) {
                                hashSet.add(c16153g4.m17777a().m17780b());
                                if (!c16153g3.m17777a().m17781c().equals("play_pass_subs") && !c16153g4.m17777a().m17781c().equals("play_pass_subs") && !strM17782d.equals(c16153g4.m17777a().m17782d())) {
                                    c16155iM17720a = AbstractC16144M.m17720a(5, "All products must have the same package name.");
                                    break;
                                }
                                i14++;
                                abstractC11857B2 = abstractC11857B3;
                                size = i15;
                            } else {
                                c16155iM17720a = AbstractC16144M.m17720a(5, "ProductId can not be duplicated. Invalid product id: " + c16153g4.m17777a().m17780b() + Separators.DOT);
                                break;
                            }
                        }
                    }
                } else {
                    C16153g c16153g5 = (C16153g) c16154h.f50148d.get(i13);
                    str = str9;
                    if (!c16153g5.m17777a().m17781c().equals(c16153g3.m17777a().m17781c()) && !c16153g5.m17777a().m17781c().equals("play_pass_subs")) {
                        c16155iM17720a = AbstractC16144M.m17720a(5, "All products should have same ProductType.");
                        str2 = str11;
                        str3 = str10;
                        break;
                    }
                    i13++;
                    str9 = str;
                }
            }
        } else {
            c16155iM17720a = AbstractC16144M.f50087j;
            str2 = str11;
            str3 = str10;
            str = "BUY_INTENT";
        }
        if (c16155iM17720a != AbstractC16144M.f50087j) {
            c16149c.m17756D(120, 2, c16155iM17720a);
            c16149c.m17759G(c16155iM17720a);
            return c16155iM17720a;
        }
        if (c16149c.f50124m) {
            boolean z11 = c16149c.f50126o;
            boolean z12 = c16149c.f50133v;
            c16149c.f50107A.getClass();
            boolean z13 = c16149c.f50107A.f1278Z;
            boolean z14 = c16149c.f50108B;
            String str13 = c16149c.f50114c;
            long jLongValue = c16149c.f50111E.longValue();
            final String packageName = c16149c.f50117f.getPackageName();
            final Bundle bundle = new Bundle();
            AbstractC11988o0.m13507b(bundle, str13, jLongValue);
            int i16 = c16154h.f50147c.f30498b;
            if (i16 != 0) {
                bundle.putInt("prorationMode", i16);
            }
            if (!TextUtils.isEmpty(c16154h.f50146b)) {
                bundle.putString("accountId", c16154h.f50146b);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("obfuscatedProfileId", null);
            }
            if (c16154h.f50150f) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(c16154h.f50147c.f30497a)) {
                bundle.putString("oldSkuPurchaseToken", c16154h.f50147c.f30497a);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("oldSkuPurchaseId", null);
            }
            c16154h.f50147c.getClass();
            if (!TextUtils.isEmpty(null)) {
                c16154h.f50147c.getClass();
                bundle.putString("originalExternalTransactionId", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("paymentsPurchaseParams", null);
            }
            if (z11) {
                z6 = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z6 = true;
            }
            if (z12 && z13) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z6);
            }
            if (z14) {
                bundle.putBoolean("enableAlternativeBilling", z6);
            }
            final int i17 = 0;
            if (Collection.EL.stream(c16154h.f50148d).anyMatch(new Predicate() { // from class: com.google.android.gms.internal.play_billing.a
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    int i18 = i17;
                    return Predicate$CC.$default$and(this, predicate);
                }

                public final /* synthetic */ Predicate negate() {
                    switch (i17) {
                        case 0:
                            break;
                    }
                    return Predicate$CC.$default$negate(this);
                }

                /* JADX INFO: renamed from: or */
                public final /* synthetic */ Predicate m13381or(Predicate predicate) {
                    int i18 = i17;
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    switch (i17) {
                        case 0:
                            int i18 = AbstractC11988o0.f36308a;
                            break;
                        default:
                            int i19 = AbstractC11988o0.f36308a;
                            break;
                    }
                    return false;
                }
            })) {
                C11894N0 c11894n0M13312n = C11897O0.m13312n();
                final int i18 = 1;
                Iterable iterable = (Iterable) Collection.EL.stream(c16154h.f50148d).filter(new Predicate() { // from class: com.google.android.gms.internal.play_billing.a
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        int i19 = i18;
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    public final /* synthetic */ Predicate negate() {
                        switch (i18) {
                            case 0:
                                break;
                        }
                        return Predicate$CC.$default$negate(this);
                    }

                    /* JADX INFO: renamed from: or */
                    public final /* synthetic */ Predicate m13381or(Predicate predicate) {
                        int i19 = i18;
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        switch (i18) {
                            case 0:
                                int i19 = AbstractC11988o0.f36308a;
                                break;
                            default:
                                int i110 = AbstractC11988o0.f36308a;
                                break;
                        }
                        return false;
                    }
                }).map(new Function() { // from class: com.google.android.gms.internal.play_billing.s
                    public final /* synthetic */ Function andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        int i19 = AbstractC11988o0.f36308a;
                        String str14 = ((C16153g) obj).f50143a.f50177c;
                        C11888L0 c11888l0M13304n = C11891M0.m13304n();
                        C11900P0 c11900p0M13321n = C11903Q0.m13321n();
                        String str15 = "subs:" + packageName + ":" + str14;
                        c11900p0M13321n.m13473d();
                        C11903Q0.m13322o((C11903Q0) c11900p0M13321n.f36278Z, str15);
                        c11888l0M13304n.m13473d();
                        C11891M0.m13305o((C11891M0) c11888l0M13304n.f36278Z, (C11903Q0) c11900p0M13321n.m13471b());
                        C11903Q0.m13321n();
                        throw null;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(AbstractC11991p.f36311a);
                c11894n0M13312n.m13473d();
                C11897O0.m13313o((C11897O0) c11894n0M13312n.f36278Z, iterable);
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((C11897O0) c11894n0M13312n.m13471b()).m13346b());
            }
            if (arrayList.isEmpty()) {
                ArrayList<String> arrayList2 = new ArrayList<>(abstractC11857B.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>(abstractC11857B.size() - 1);
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<String> arrayList6 = new ArrayList<>();
                ArrayList<Integer> arrayList7 = new ArrayList<>();
                str6 = "proxyPackageVersion";
                str7 = "BillingClient";
                int i19 = 0;
                while (i19 < abstractC11857B.size()) {
                    C16153g c16153g6 = (C16153g) abstractC11857B.get(i19);
                    C16153g c16153g7 = c16153g2;
                    C16162p c16162p2 = c16153g6.f50143a;
                    if (!c16162p2.f50182h.isEmpty()) {
                        arrayList4.add(c16162p2.f50182h);
                    }
                    arrayList5.add(c16153g6.f50144b);
                    String str14 = c16162p2.f50183i;
                    ArrayList arrayList8 = c16162p2.f50185k;
                    if (arrayList8 != null && !arrayList8.isEmpty()) {
                        Iterator it3 = c16162p2.f50185k.iterator();
                        while (it3.hasNext()) {
                            C16159m c16159m = (C16159m) it3.next();
                            Iterator it4 = it3;
                            if (!TextUtils.isEmpty(c16159m.f50161e)) {
                                str14 = c16159m.f50161e;
                                break;
                            }
                            it3 = it4;
                        }
                    }
                    if (!TextUtils.isEmpty(str14)) {
                        arrayList6.add(str14);
                    }
                    if (i19 > 0) {
                        arrayList2.add(((C16153g) abstractC11857B.get(i19)).f50143a.f50177c);
                        arrayList3.add(((C16153g) abstractC11857B.get(i19)).f50143a.f50178d);
                    }
                    i19++;
                    c16153g2 = c16153g7;
                }
                c16153g = c16153g2;
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                bundle.putIntegerArrayList("AUTO_PAY_BALANCE_THRESHOLD_LIST", arrayList7);
                if (!arrayList4.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList4);
                }
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                }
                if (!arrayList2.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList2);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList3);
                }
            } else {
                ArrayList<String> arrayList9 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it5 = arrayList.iterator();
                if (it5.hasNext()) {
                    throw AbstractC3794B0.m4497v(it5);
                }
                if (!arrayList9.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList9);
                }
                if (arrayList.size() > 1) {
                    ArrayList<String> arrayList10 = new ArrayList<>(arrayList.size() - 1);
                    ArrayList<String> arrayList11 = new ArrayList<>(arrayList.size() - 1);
                    if (1 < arrayList.size()) {
                        throw AbstractC14376f.m15860z(1, arrayList);
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList10);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList11);
                }
                str6 = "proxyPackageVersion";
                c16153g = c16153g2;
                str7 = "BillingClient";
            }
            c16149c = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !c16149c.f50128q) {
                C16155i c16155i8 = AbstractC16144M.f50096s;
                c16149c.m17756D(21, 2, c16155i8);
                c16149c.m17759G(c16155i8);
                return c16155i8;
            }
            C16153g c16153g8 = c16153g;
            if (TextUtils.isEmpty(c16153g8.f50143a.m17782d())) {
                str5 = null;
                z10 = false;
            } else {
                bundle.putString("skuPackageName", c16153g8.f50143a.m17782d());
                str5 = null;
                z10 = true;
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("accountName", str5);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                str4 = str7;
                AbstractC11988o0.m13512g(str4, "Activity's intent is null.");
            } else {
                str4 = str7;
                if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                    bundle.putString("proxyPackage", stringExtra);
                    try {
                        str8 = str6;
                        try {
                            bundle.putString(str8, c16149c.f50117f.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                        } catch (PackageManager.NameNotFoundException unused) {
                            bundle.putString(str8, "package not found");
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str8 = str6;
                    }
                }
            }
            if (c16149c.f50131t && !abstractC11857B.isEmpty()) {
                i11 = 17;
            } else if (c16149c.f50129r && z10) {
                i11 = 15;
            } else {
                if (c16149c.f50126o) {
                    i12 = 9;
                } else {
                    i11 = 6;
                }
                final String str15 = str3;
                final String str16 = str2;
                futureM17750i = m17750i(new Callable(i12, str15, str16, c16154h, bundle) { // from class: j6.z

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ int f50200b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ String f50201c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ String f50202d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ Bundle f50203e;

                    {
                        this.f50203e = bundle;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle bundleM13514i;
                        InterfaceC11943d interfaceC11943d;
                        C16149c c16149c2 = this.f50199a;
                        int i20 = this.f50200b;
                        String str17 = this.f50201c;
                        String str18 = this.f50202d;
                        Bundle bundle2 = this.f50203e;
                        c16149c2.getClass();
                        try {
                            synchronized (c16149c2.f50112a) {
                                interfaceC11943d = c16149c2.f50119h;
                            }
                            if (interfaceC11943d == null) {
                                return AbstractC11988o0.m13514i(AbstractC16144M.f50088k, 119);
                            }
                            return ((C11935b) interfaceC11943d).m13408w(i20, c16149c2.f50117f.getPackageName(), str17, str18, bundle2);
                        } catch (DeadObjectException e10) {
                            C16155i c16155i9 = AbstractC16144M.f50088k;
                            String strM17716a = AbstractC16142K.m17716a(e10);
                            bundleM13514i = AbstractC11988o0.m13514i(c16155i9, 5);
                            if (strM17716a != null) {
                                bundleM13514i.putString("ADDITIONAL_LOG_DETAILS", strM17716a);
                            }
                            return bundleM13514i;
                        } catch (Exception e11) {
                            C16155i c16155i10 = AbstractC16144M.f50086i;
                            String strM17716a2 = AbstractC16142K.m17716a(e11);
                            bundleM13514i = AbstractC11988o0.m13514i(c16155i10, 5);
                            if (strM17716a2 != null) {
                                bundleM13514i.putString("ADDITIONAL_LOG_DETAILS", strM17716a2);
                            }
                            return bundleM13514i;
                        }
                    }
                }, 5000L, null, c16149c.f50115d, m17763m());
            }
            i12 = i11;
            final String str17 = str3;
            final String str18 = str2;
            futureM17750i = m17750i(new Callable(i12, str17, str18, c16154h, bundle) { // from class: j6.z

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f50200b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f50201c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f50202d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Bundle f50203e;

                {
                    this.f50203e = bundle;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundleM13514i;
                    InterfaceC11943d interfaceC11943d;
                    C16149c c16149c2 = this.f50199a;
                    int i20 = this.f50200b;
                    String str19 = this.f50201c;
                    String str110 = this.f50202d;
                    Bundle bundle2 = this.f50203e;
                    c16149c2.getClass();
                    try {
                        synchronized (c16149c2.f50112a) {
                            interfaceC11943d = c16149c2.f50119h;
                        }
                        if (interfaceC11943d == null) {
                            return AbstractC11988o0.m13514i(AbstractC16144M.f50088k, 119);
                        }
                        return ((C11935b) interfaceC11943d).m13408w(i20, c16149c2.f50117f.getPackageName(), str19, str110, bundle2);
                    } catch (DeadObjectException e10) {
                        C16155i c16155i9 = AbstractC16144M.f50088k;
                        String strM17716a = AbstractC16142K.m17716a(e10);
                        bundleM13514i = AbstractC11988o0.m13514i(c16155i9, 5);
                        if (strM17716a != null) {
                            bundleM13514i.putString("ADDITIONAL_LOG_DETAILS", strM17716a);
                        }
                        return bundleM13514i;
                    } catch (Exception e11) {
                        C16155i c16155i10 = AbstractC16144M.f50086i;
                        String strM17716a2 = AbstractC16142K.m17716a(e11);
                        bundleM13514i = AbstractC11988o0.m13514i(c16155i10, 5);
                        if (strM17716a2 != null) {
                            bundleM13514i.putString("ADDITIONAL_LOG_DETAILS", strM17716a2);
                        }
                        return bundleM13514i;
                    }
                }
            }, 5000L, null, c16149c.f50115d, m17763m());
        } else {
            str4 = "BillingClient";
            str5 = null;
            futureM17750i = m17750i(new CallableC16170x(c16149c, str3, str2, 4), 5000L, null, c16149c.f50115d, m17763m());
        }
        try {
            if (futureM17750i == null) {
                C16155i c16155i9 = AbstractC16144M.f50081d;
                c16149c.m17756D(25, 2, c16155i9);
                c16149c.m17759G(c16155i9);
                return c16155i9;
            }
            Bundle bundle2 = (Bundle) futureM17750i.get(5000L, TimeUnit.MILLISECONDS);
            int iM13506a = AbstractC11988o0.m13506a(str4, bundle2);
            String strM13510e = AbstractC11988o0.m13510e(str4, bundle2);
            if (iM13506a == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                String str19 = str;
                intent2.putExtra(str19, (PendingIntent) bundle2.getParcelable(str19));
                activity.startActivity(intent2);
                return AbstractC16144M.f50087j;
            }
            AbstractC11988o0.m13512g(str4, "Unable to buy item, Error response code: " + iM13506a);
            C16155i c16155iM17720a2 = AbstractC16144M.m17720a(iM13506a, strM13510e);
            if (bundle2 == null) {
                i10 = 1;
                iM13452o = 1;
            } else {
                try {
                    Object obj = bundle2.get("LOG_REASON");
                    if (obj != null) {
                        if (obj instanceof Integer) {
                            iM13452o = AbstractC11957g1.m13452o(((Integer) obj).intValue());
                            i10 = 1;
                        } else {
                            AbstractC11988o0.m13512g(str4, "Unexpected type for bundle log reason: " + obj.getClass().getName());
                        }
                    }
                } catch (Throwable th2) {
                    AbstractC11988o0.m13512g(str4, "Failed to get log reason from bundle: ".concat(String.valueOf(th2.getMessage())));
                }
                i10 = 1;
                iM13452o = 1;
            }
            if (iM13452o == i10) {
                iM13452o = 23;
            }
            if (bundle2 == null) {
                string = str5;
            } else {
                try {
                    string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                } catch (Throwable th3) {
                    AbstractC11988o0.m13512g(str4, "Failed to get additional log details from bundle: ".concat(String.valueOf(th3.getMessage())));
                    string = str5;
                }
            }
            c16149c.m17757E(iM13452o, 2, c16155iM17720a2, string);
            c16149c.m17759G(c16155iM17720a2);
            return c16155iM17720a2;
        } catch (CancellationException e10) {
            e = e10;
            AbstractC11988o0.m13513h(str4, "Time out while launching billing flow. Try to reconnect", e);
            C16155i c16155i10 = AbstractC16144M.f50089l;
            c16149c.m17757E(4, 2, c16155i10, AbstractC16142K.m17716a(e));
            c16149c.m17759G(c16155i10);
            return c16155i10;
        } catch (TimeoutException e11) {
            e = e11;
            AbstractC11988o0.m13513h(str4, "Time out while launching billing flow. Try to reconnect", e);
            C16155i c16155i11 = AbstractC16144M.f50089l;
            c16149c.m17757E(4, 2, c16155i11, AbstractC16142K.m17716a(e));
            c16149c.m17759G(c16155i11);
            return c16155i11;
        } catch (Exception e12) {
            AbstractC11988o0.m13513h(str4, "Exception while launching billing flow. Try to reconnect", e12);
            C16155i c16155i12 = AbstractC16144M.f50088k;
            c16149c.m17757E(5, 2, c16155i12, AbstractC16142K.m17716a(e12));
            c16149c.m17759G(c16155i12);
            return c16155i12;
        }
    }

    public C16149c(C0376k c0376k, Context context, InterfaceC16165s interfaceC16165s) {
        String strM17751l = m17751l();
        this.f50112a = new Object();
        this.f50113b = 0;
        this.f50115d = new Handler(Looper.getMainLooper());
        this.f50123l = 0;
        long jNextLong = new Random().nextLong();
        this.f50111E = Long.valueOf(jNextLong);
        this.f50114c = strM17751l;
        this.f50117f = context.getApplicationContext();
        C11950e2 c11950e2M13420r = C11954f2.m13420r();
        c11950e2M13420r.m13473d();
        C11954f2.m13419q((C11954f2) c11950e2M13420r.f36278Z, strM17751l);
        String packageName = this.f50117f.getPackageName();
        c11950e2M13420r.m13473d();
        C11954f2.m13418p((C11954f2) c11950e2M13420r.f36278Z, packageName);
        c11950e2M13420r.m13473d();
        C11954f2.m13417o((C11954f2) c11950e2M13420r.f36278Z, jNextLong);
        this.f50118g = new C15026j(this.f50117f, (C11954f2) c11950e2M13420r.m13471b());
        if (interfaceC16165s == null) {
            AbstractC11988o0.m13512g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f50116e = new C0042V0(this.f50117f, interfaceC16165s, this.f50118g);
        this.f50107A = c0376k;
        this.f50108B = false;
        this.f50117f.getPackageName();
    }
}
