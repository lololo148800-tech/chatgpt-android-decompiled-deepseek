package p642a8;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p009A7.C0392b;
import p049Bm.InterfaceC1436k;
import p087D7.AbstractC1976c;
import p1145z7.C21807d;
import p1145z7.InterfaceC21808e;
import p140Fa.C2685e;
import p210I7.C3650b;
import p214Ib.C3676s;
import p236J7.AbstractC4283g;
import p339Nf.C5734p;
import p437Rn.C6949g;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC7933L4;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9306j0;
import p592Y7.AbstractC9667b;
import p592Y7.InterfaceC9670e;
import p592Y7.InterfaceC9672g;
import p658b5.C11248s;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p662b8.RunnableC11259c;
import p677c8.C11690b;
import p699d7.InterfaceC13038b;
import p699d7.InterfaceC13039c;
import p700d8.C13043d;
import p700d8.C13045f;
import p721e7.InterfaceC13290b;
import p743f7.C13577c;
import p743f7.C13578d;
import p743f7.InterfaceC13575a;
import p744f8.C13580a;
import p744f8.C13581b;
import p744f8.C13582c;
import p765g7.InterfaceC13823a;
import p766g8.C13824a;
import p804i8.C14943b;
import p804i8.InterfaceC14942a;
import p827j7.C16174b;
import p849k7.C16360m;
import p849k7.ScheduledExecutorServiceC16357j;
import p867l8.C16829a;
import p867l8.C16830b;
import p867l8.C16831c;
import p867l8.InterfaceC16832d;
import p874lj.C17057a;
import p885m4.C17151a;
import p902n8.C17514a;
import p902n8.C17515b;
import p902n8.C17518e;
import p902n8.C17519f;
import p902n8.C17521h;
import p902n8.InterfaceC17524k;
import p902n8.RunnableC17526m;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p909nm.C17690x;
import p919o8.C17946W1;
import p959q8.C18639a;
import p959q8.C18643e;
import p959q8.InterfaceC18645g;
import p959q8.InterfaceC18646h;

/* JADX INFO: renamed from: a8.h */
/* JADX INFO: loaded from: classes.dex */
public final class C10525h implements InterfaceC13039c, InterfaceC13038b {

    /* JADX INFO: renamed from: L0 */
    public static final C10523f f31209L0;

    /* JADX INFO: renamed from: A0 */
    public InterfaceC17524k f31210A0;

    /* JADX INFO: renamed from: B0 */
    public InterfaceC17524k f31211B0;

    /* JADX INFO: renamed from: C0 */
    public InterfaceC9672g f31212C0;

    /* JADX INFO: renamed from: D0 */
    public ScheduledExecutorService f31213D0;

    /* JADX INFO: renamed from: E0 */
    public ExecutorService f31214E0;

    /* JADX INFO: renamed from: F0 */
    public RunnableC11259c f31215F0;

    /* JADX INFO: renamed from: G0 */
    public Context f31216G0;

    /* JADX INFO: renamed from: H0 */
    public final C17314q f31217H0;

    /* JADX INFO: renamed from: I0 */
    public final String f31218I0;

    /* JADX INFO: renamed from: J0 */
    public final C17314q f31219J0;

    /* JADX INFO: renamed from: K0 */
    public final C13577c f31220K0;

    /* JADX INFO: renamed from: Y */
    public final InterfaceC13823a f31221Y;

    /* JADX INFO: renamed from: Z */
    public final C10523f f31222Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC1436k f31223o0;

    /* JADX INFO: renamed from: p0 */
    public InterfaceC13575a f31224p0;

    /* JADX INFO: renamed from: q0 */
    public final AtomicBoolean f31225q0;

    /* JADX INFO: renamed from: r0 */
    public float f31226r0;

    /* JADX INFO: renamed from: s0 */
    public float f31227s0;

    /* JADX INFO: renamed from: t0 */
    public float f31228t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f31229u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f31230v0;

    /* JADX INFO: renamed from: w0 */
    public InterfaceC18646h f31231w0;

    /* JADX INFO: renamed from: x0 */
    public InterfaceC16832d f31232x0;

    /* JADX INFO: renamed from: y0 */
    public InterfaceC18645g f31233y0;

    /* JADX INFO: renamed from: z0 */
    public InterfaceC17524k f31234z0;

    static {
        C17689w c17689w = C17689w.f56480Y;
        C16830b c16830b = new C16830b();
        C18643e c18643e = new C18643e(new C18639a(0));
        C13580a c13580a = new C13580a(100L);
        C3650b c3650b = new C3650b();
        C3650b c3650b2 = new C3650b();
        C3650b c3650b3 = new C3650b();
        C3650b c3650b4 = new C3650b();
        C3650b c3650b5 = new C3650b();
        C3650b c3650b6 = new C3650b();
        InterfaceC21808e.f69170n0.getClass();
        f31209L0 = new C10523f(null, 100.0f, 20.0f, 20.0f, true, c17689w, c16830b, c18643e, c13580a, c3650b, c3650b2, c3650b3, c3650b4, c3650b5, c3650b6, false, true, C21807d.f69169b.f9112Z < 30, 2, new C10521d(), C17690x.f56481Y);
    }

    public C10525h(InterfaceC13823a interfaceC13823a, C10523f configuration) {
        C10522e c10522e = C10522e.f31185Y;
        AbstractC16544l.m18094g(configuration, "configuration");
        this.f31221Y = interfaceC13823a;
        this.f31222Z = configuration;
        this.f31223o0 = c10522e;
        this.f31224p0 = new C13578d();
        this.f31225q0 = new AtomicBoolean(false);
        this.f31231w0 = new C17151a();
        this.f31232x0 = new C16831c();
        this.f31233y0 = new C17057a(3);
        this.f31234z0 = new C17519f();
        this.f31210A0 = new C17519f();
        this.f31211B0 = new C17519f();
        new AtomicReference(null);
        this.f31212C0 = new C10521d();
        this.f31213D0 = new ScheduledExecutorServiceC16357j(1);
        this.f31217H0 = AbstractC9227W.m9800c(new C10524g(this, 0));
        this.f31218I0 = "rum";
        this.f31219J0 = AbstractC9227W.m9800c(new C10524g(this, 1));
        this.f31220K0 = C13577c.f42927a;
    }

    @Override // p699d7.InterfaceC13037a
    /* JADX INFO: renamed from: a */
    public final void mo3513a() {
        this.f31221Y.mo15455k(this.f31218I0);
        Context context = this.f31216G0;
        if (context == null) {
            AbstractC16544l.m18103p("appContext");
            throw null;
        }
        this.f31232x0.mo15102a(context);
        this.f31231w0.mo15102a(context);
        this.f31233y0.mo15102a(context);
        this.f31224p0 = new C13578d();
        this.f31231w0 = new C17151a();
        this.f31232x0 = new C16831c();
        this.f31233y0 = new C17057a(3);
        this.f31234z0 = new C17519f();
        this.f31210A0 = new C17519f();
        this.f31211B0 = new C17519f();
        this.f31213D0.shutdownNow();
        ExecutorService executorService = this.f31214E0;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        RunnableC11259c runnableC11259c = this.f31215F0;
        if (runnableC11259c != null) {
            runnableC11259c.f34112q0 = true;
        }
        this.f31213D0 = new ScheduledExecutorServiceC16357j(1);
        this.f31212C0 = new C10521d();
        LinkedHashMap linkedHashMap = AbstractC9667b.f29147a;
        InterfaceC13823a interfaceC13823a = this.f31221Y;
        LinkedHashMap linkedHashMap2 = AbstractC9667b.f29147a;
        synchronized (linkedHashMap2) {
        }
    }

    @Override // p699d7.InterfaceC13038b
    /* JADX INFO: renamed from: b */
    public final void mo5602b(Object obj) throws InterruptedException {
        BlockingQueue<Runnable> queue;
        boolean z6 = obj instanceof Map;
        EnumC11255b enumC11255b = EnumC11255b.f34098Y;
        InterfaceC13823a interfaceC13823a = this.f31221Y;
        c17946w1 = null;
        C17946W1 c17946w1 = null;
        if (!z6) {
            if (obj instanceof C16174b) {
                C16174b c16174b = (C16174b) obj;
                InterfaceC9670e interfaceC9670eM10254a = AbstractC9667b.m10254a(interfaceC13823a);
                InterfaceC14942a interfaceC14942a = interfaceC9670eM10254a instanceof InterfaceC14942a ? (InterfaceC14942a) interfaceC9670eM10254a : null;
                if (interfaceC14942a != null) {
                    interfaceC14942a.mo16107i(c16174b.f50210b, c16174b.f50209a, c16174b.f50211c);
                    return;
                }
                return;
            }
            if (!(obj instanceof AbstractC4283g)) {
                AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 4, enumC11255b, new C0392b(obj, 6), null, false, 56);
                return;
            }
            AbstractC4283g abstractC4283g = (AbstractC4283g) obj;
            InterfaceC9670e interfaceC9670eM10254a2 = AbstractC9667b.m10254a(interfaceC13823a);
            InterfaceC14942a interfaceC14942a2 = interfaceC9670eM10254a2 instanceof InterfaceC14942a ? (InterfaceC14942a) interfaceC9670eM10254a2 : null;
            if (interfaceC14942a2 == null) {
                return;
            }
            interfaceC14942a2.mo16101c(abstractC4283g);
            return;
        }
        Map map = (Map) obj;
        Object obj2 = map.get("type");
        if (AbstractC16544l.m18089b(obj2, "ndk_crash")) {
            InterfaceC10520c interfaceC10520c = (InterfaceC10520c) this.f31217H0.getValue();
            InterfaceC13575a interfaceC13575a = this.f31224p0;
            C10519b c10519b = (C10519b) interfaceC10520c;
            c10519b.getClass();
            InterfaceC13823a interfaceC13823a2 = c10519b.f31182a;
            C16360m c16360mMo15458n = interfaceC13823a2.mo15458n("rum");
            if (c16360mMo15458n == null) {
                AbstractC7889G0.m8184b(interfaceC13823a2.mo15463s(), 3, enumC11255b, C10518a.f31172o0, null, false, 56);
                return;
            }
            Object obj3 = map.get("sourceType");
            String str = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = map.get(DiagnosticsEntry.TIMESTAMP_KEY);
            Long l4 = obj4 instanceof Long ? (Long) obj4 : null;
            Object obj5 = map.get("timeSinceAppStartMs");
            Long l10 = obj5 instanceof Long ? (Long) obj5 : null;
            Object obj6 = map.get("signalName");
            String str2 = obj6 instanceof String ? (String) obj6 : null;
            Object obj7 = map.get("stacktrace");
            String str3 = obj7 instanceof String ? (String) obj7 : null;
            Object obj8 = map.get("message");
            String str4 = obj8 instanceof String ? (String) obj8 : null;
            Object obj9 = map.get("lastViewEvent");
            C3676s c3676s = obj9 instanceof C3676s ? (C3676s) obj9 : null;
            if (c3676s != null) {
                Object objMo3913N = c10519b.f31183b.mo3913N(c3676s);
                if (objMo3913N instanceof C17946W1) {
                    c17946w1 = (C17946W1) objMo3913N;
                }
            }
            C17946W1 c17946w2 = c17946w1;
            if (l4 == null || str2 == null || str3 == null || str4 == null || c17946w2 == null) {
                AbstractC7889G0.m8184b(interfaceC13823a2.mo15463s(), 4, enumC11255b, C10518a.f31173p0, null, false, 56);
                return;
            } else {
                AbstractC7933L4.m8226d(c16360mMo15458n, new C5734p(c10519b, str, str4, l4, l10, str3, str2, c17946w2, interfaceC13575a));
                return;
            }
        }
        boolean zM18089b = AbstractC16544l.m18089b(obj2, "logger_error");
        Map map2 = C17690x.f56481Y;
        EnumC11255b enumC11255b2 = EnumC11255b.f34100o0;
        if (zM18089b) {
            Object obj10 = map.get("throwable");
            Throwable th2 = obj10 instanceof Throwable ? (Throwable) obj10 : null;
            Object obj11 = map.get("message");
            String str5 = obj11 instanceof String ? (String) obj11 : null;
            Object obj12 = map.get("attributes");
            Map map3 = obj12 instanceof Map ? (Map) obj12 : null;
            if (str5 == null) {
                AbstractC7889G0.m8185c(interfaceC13823a.mo15463s(), 4, AbstractC17681o.m19382k(enumC11255b, enumC11255b2), C10518a.f31175r0, null, 56);
                return;
            }
            InterfaceC9670e interfaceC9670eM10254a3 = AbstractC9667b.m10254a(interfaceC13823a);
            InterfaceC14942a interfaceC14942a3 = interfaceC9670eM10254a3 instanceof InterfaceC14942a ? (InterfaceC14942a) interfaceC9670eM10254a3 : null;
            if (interfaceC14942a3 != null) {
                if (map3 != null) {
                    map2 = map3;
                }
                interfaceC14942a3.mo10262r(str5, 4, th2, map2);
                return;
            }
            return;
        }
        if (AbstractC16544l.m18089b(obj2, "logger_error_with_stacktrace")) {
            Object obj13 = map.get("stacktrace");
            String str6 = obj13 instanceof String ? (String) obj13 : null;
            Object obj14 = map.get("message");
            String str7 = obj14 instanceof String ? (String) obj14 : null;
            Object obj15 = map.get("attributes");
            Map map4 = obj15 instanceof Map ? (Map) obj15 : null;
            if (str7 == null) {
                AbstractC7889G0.m8185c(interfaceC13823a.mo15463s(), 4, AbstractC17681o.m19382k(enumC11255b, enumC11255b2), C10518a.f31176s0, null, 56);
                return;
            }
            InterfaceC9670e interfaceC9670eM10254a4 = AbstractC9667b.m10254a(interfaceC13823a);
            InterfaceC14942a interfaceC14942a4 = interfaceC9670eM10254a4 instanceof InterfaceC14942a ? (InterfaceC14942a) interfaceC9670eM10254a4 : null;
            if (interfaceC14942a4 != null) {
                if (map4 != null) {
                    map2 = map4;
                }
                interfaceC14942a4.mo10258n(str7, str6, map2);
                return;
            }
            return;
        }
        if (AbstractC16544l.m18089b(obj2, "web_view_ingested_notification")) {
            InterfaceC9670e interfaceC9670eM10254a5 = AbstractC9667b.m10254a(interfaceC13823a);
            InterfaceC14942a interfaceC14942a5 = interfaceC9670eM10254a5 instanceof InterfaceC14942a ? (InterfaceC14942a) interfaceC9670eM10254a5 : null;
            if (interfaceC14942a5 != null) {
                interfaceC14942a5.mo16100b();
                return;
            }
            return;
        }
        if (!AbstractC16544l.m18089b(obj2, "flush_and_stop_monitor")) {
            AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 4, enumC11255b, new C6949g(map, 20), null, false, 56);
            return;
        }
        InterfaceC9670e interfaceC9670eM10254a6 = AbstractC9667b.m10254a(interfaceC13823a);
        C14943b c14943b = interfaceC9670eM10254a6 instanceof C14943b ? (C14943b) interfaceC9670eM10254a6 : null;
        if (c14943b != null) {
            c14943b.f46557c.removeCallbacks(c14943b.f46561g);
            ArrayList arrayList = new ArrayList();
            ExecutorService executorService = c14943b.f46559e;
            ThreadPoolExecutor threadPoolExecutor = executorService instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) executorService : null;
            if (threadPoolExecutor != null && (queue = threadPoolExecutor.getQueue()) != null) {
                queue.drainTo(arrayList);
            }
            executorService.shutdown();
            executorService.awaitTermination(10L, TimeUnit.SECONDS);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    @Override // p699d7.InterfaceC13039c
    /* JADX INFO: renamed from: f */
    public final C13577c mo5603f() {
        return this.f31220K0;
    }

    @Override // p699d7.InterfaceC13037a
    public final String getName() {
        return this.f31218I0;
    }

    @Override // p699d7.InterfaceC13039c
    /* JADX INFO: renamed from: j */
    public final InterfaceC13290b mo5604j() {
        return (InterfaceC13290b) this.f31219J0.getValue();
    }

    @Override // p699d7.InterfaceC13037a
    /* JADX INFO: renamed from: k */
    public final void mo3517k(Context appContext) {
        float f10;
        InterfaceC16832d c16831c;
        C10523f c10523f;
        AbstractC16544l.m18094g(appContext, "appContext");
        this.f31216G0 = appContext;
        InterfaceC13823a interfaceC13823a = this.f31221Y;
        C10523f c10523f2 = this.f31222Z;
        this.f31224p0 = new C11690b(new C11248s(new C13043d(c10523f2.f31195j, c10523f2.f31196k, c10523f2.f31197l, c10523f2.f31198m, c10523f2.f31199n, c10523f2.f31200o, interfaceC13823a.mo15463s()), new C13045f(interfaceC13823a.mo15463s()), false, 7), new C2685e(), interfaceC13823a);
        if (interfaceC13823a.mo15452h()) {
            AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 3, EnumC11255b.f34098Y, C10518a.f31179v0, null, false, 56);
            f10 = 100.0f;
        } else {
            f10 = c10523f2.f31187b;
        }
        this.f31226r0 = f10;
        this.f31227s0 = c10523f2.f31188c;
        this.f31228t0 = c10523f2.f31189d;
        this.f31229u0 = c10523f2.f31201p;
        this.f31230v0 = c10523f2.f31202q;
        InterfaceC18646h interfaceC18646h = c10523f2.f31193h;
        if (interfaceC18646h != null) {
            this.f31231w0 = interfaceC18646h;
        }
        if (c10523f2.f31190e) {
            C16829a[] c16829aArr = (C16829a[]) c10523f2.f31191f.toArray(new C16829a[0]);
            C16830b c16830b = c10523f2.f31192g;
            InterfaceC11256c interfaceC11256cMo15463s = interfaceC13823a.mo15463s();
            C16829a[] c16829aArr2 = {new C16829a()};
            AbstractC16544l.m18094g(c16829aArr, "<this>");
            int length = c16829aArr.length;
            Object[] objArrCopyOf = Arrays.copyOf(c16829aArr, length + 1);
            System.arraycopy(c16829aArr2, 0, objArrCopyOf, length, 1);
            AbstractC16544l.m18091d(objArrCopyOf);
            C13824a c13824a = new C13824a((C16829a[]) objArrCopyOf, c16830b, interfaceC11256cMo15463s);
            c16831c = Build.VERSION.SDK_INT >= 29 ? new C13581b(c13824a) : new C13582c(c13824a);
        } else {
            c16831c = new C16831c();
        }
        this.f31232x0 = c16831c;
        InterfaceC18645g interfaceC18645g = c10523f2.f31194i;
        if (interfaceC18645g != null) {
            this.f31233y0 = interfaceC18645g;
        }
        int i10 = c10523f2.f31204s;
        if (i10 == 4) {
            c10523f = c10523f2;
        } else {
            this.f31234z0 = new C17514a(0);
            this.f31210A0 = new C17514a(0);
            this.f31211B0 = new C17514a(0);
            long jM9885d = AbstractC9306j0.m9885d(i10);
            this.f31213D0 = interfaceC13823a.mo15454j("rum-vital");
            c10523f = c10523f2;
            RunnableC17526m runnableC17526m = new RunnableC17526m(interfaceC13823a, new C17515b(interfaceC13823a.mo15463s()), this.f31234z0, this.f31213D0, jM9885d);
            ScheduledExecutorService scheduledExecutorService = this.f31213D0;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            AbstractC1976c.m3151h(scheduledExecutorService, "Vitals monitoring", jM9885d, timeUnit, interfaceC13823a.mo15463s(), runnableC17526m);
            AbstractC1976c.m3151h(this.f31213D0, "Vitals monitoring", jM9885d, timeUnit, interfaceC13823a.mo15463s(), new RunnableC17526m(interfaceC13823a, new C17521h(interfaceC13823a.mo15463s()), this.f31210A0, this.f31213D0, jM9885d));
            C17518e c17518e = new C17518e(this.f31211B0, interfaceC13823a.mo15463s());
            Context context = this.f31216G0;
            if (context == null) {
                AbstractC16544l.m18103p("appContext");
                throw null;
            }
            Application application = context instanceof Application ? (Application) context : null;
            if (application != null) {
                application.registerActivityLifecycleCallbacks(c17518e);
            }
        }
        if (c10523f.f31203r) {
            RunnableC11259c runnableC11259c = new RunnableC11259c(interfaceC13823a, new Handler(Looper.getMainLooper()));
            ExecutorService executorServiceMo15465u = interfaceC13823a.mo15465u("rum-anr-detection");
            this.f31214E0 = executorServiceMo15465u;
            AbstractC1976c.m3146c(executorServiceMo15465u, "ANR detection", interfaceC13823a.mo15463s(), runnableC11259c);
            this.f31215F0 = runnableC11259c;
        }
        this.f31232x0.mo15103e(interfaceC13823a, appContext);
        this.f31231w0.mo15103e(interfaceC13823a, appContext);
        this.f31233y0.mo15103e(interfaceC13823a, appContext);
        this.f31212C0 = c10523f.f31205t;
        interfaceC13823a.mo15459o(this.f31218I0, this);
        this.f31225q0.set(true);
    }
}
