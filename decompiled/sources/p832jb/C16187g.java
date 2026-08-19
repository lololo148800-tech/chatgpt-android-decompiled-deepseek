package p832jb;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.internal.debugmeta.C15384c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p063C9.AbstractC1616b;
import p065Cb.C1623a;
import p1036u9.ComponentCallbacks2C20157c;
import p1060v9.AbstractC20502t;
import p1061vb.C20512c;
import p1104xb.InterfaceC21170a;
import p523V9.AbstractC8151n5;
import p525Vb.C8258a;
import p692d0.C12966e;
import p784hb.C14437f;
import p890mb.C17204a;
import p890mb.C17206c;
import p890mb.C17209f;
import p890mb.C17216m;
import p904nb.EnumC17553j;
import sk.C19665d;

/* JADX INFO: renamed from: jb.g */
/* JADX INFO: loaded from: classes.dex */
public final class C16187g {

    /* JADX INFO: renamed from: j */
    public static final Object f50233j = new Object();

    /* JADX INFO: renamed from: k */
    public static final C12966e f50234k = new C12966e(0);

    /* JADX INFO: renamed from: a */
    public final Context f50235a;

    /* JADX INFO: renamed from: b */
    public final String f50236b;

    /* JADX INFO: renamed from: c */
    public final C16189i f50237c;

    /* JADX INFO: renamed from: d */
    public final C17209f f50238d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f50239e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f50240f;

    /* JADX INFO: renamed from: g */
    public final C17216m f50241g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC21170a f50242h;

    /* JADX INFO: renamed from: i */
    public final CopyOnWriteArrayList f50243i;

    public C16187g(Context context, String str, C16189i c16189i) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f50239e = atomicBoolean;
        this.f50240f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f50243i = copyOnWriteArrayList;
        new CopyOnWriteArrayList();
        this.f50235a = context;
        AbstractC20502t.m21153d(str);
        this.f50236b = str;
        this.f50237c = c16189i;
        C16181a c16181a = FirebaseInitProvider.f36863Y;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayListM16639n = new C15384c(context, 27, new C14437f(ComponentDiscoveryService.class)).m16639n();
        Trace.endSection();
        Trace.beginSection("Runtime");
        EnumC17553j enumC17553j = EnumC17553j.f56156Y;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(arrayListM16639n);
        arrayList.add(new C17206c(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new C17206c(new ExecutorsRegistrar(), 1));
        arrayList2.add(C17204a.m18944c(context, Context.class, new Class[0]));
        arrayList2.add(C17204a.m18944c(this, C16187g.class, new Class[0]));
        arrayList2.add(C17204a.m18944c(c16189i, C16189i.class, new Class[0]));
        C8258a c8258a = new C8258a();
        if (AbstractC8151n5.m8695c(context) && FirebaseInitProvider.f36864Z.get()) {
            arrayList2.add(C17204a.m18944c(c16181a, C16181a.class, new Class[0]));
        }
        C17209f c17209f = new C17209f(enumC17553j, arrayList, arrayList2, c8258a);
        this.f50238d = c17209f;
        Trace.endSection();
        this.f50241g = new C17216m(new C16183c(this, 0, context));
        this.f50242h = c17209f.mo12569o(C20512c.class);
        C16184d c16184d = new C16184d(this);
        m17794a();
        if (atomicBoolean.get()) {
            ComponentCallbacks2C20157c.f63847q0.f63848Y.get();
        }
        copyOnWriteArrayList.add(c16184d);
        Trace.endSection();
    }

    /* JADX INFO: renamed from: b */
    public static C16187g m17791b() {
        C16187g c16187g;
        synchronized (f50233j) {
            try {
                c16187g = (C16187g) f50234k.get("[DEFAULT]");
                if (c16187g == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC1616b.m2471c() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C20512c) c16187g.f50242h.get()).m21166c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c16187g;
    }

    /* JADX INFO: renamed from: e */
    public static C16187g m17792e(Context context) {
        synchronized (f50233j) {
            try {
                if (f50234k.containsKey("[DEFAULT]")) {
                    return m17791b();
                }
                C16189i c16189iM17798a = C16189i.m17798a(context);
                if (c16189iM17798a == null) {
                    AbstractC15256t.m16482t("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return m17793f(context, c16189iM17798a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static C16187g m17793f(Context context, C16189i c16189i) {
        C16187g c16187g;
        AtomicReference atomicReference = C16185e.f50230a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = C16185e.f50230a;
            if (atomicReference2.get() == null) {
                C16185e c16185e = new C16185e();
                do {
                    if (atomicReference2.compareAndSet(null, c16185e)) {
                        ComponentCallbacks2C20157c.m20974b(application);
                        ComponentCallbacks2C20157c.f63847q0.m20975a(c16185e);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f50233j) {
            C12966e c12966e = f50234k;
            AbstractC20502t.m21159j("FirebaseApp name [DEFAULT] already exists!", !c12966e.containsKey("[DEFAULT]"));
            AbstractC20502t.m21158i(context, "Application context cannot be null.");
            c16187g = new C16187g(context, "[DEFAULT]", c16189i);
            c12966e.put("[DEFAULT]", c16187g);
        }
        c16187g.m17796d();
        return c16187g;
    }

    /* JADX INFO: renamed from: a */
    public final void m17794a() {
        AbstractC20502t.m21159j("FirebaseApp was deleted", !this.f50240f.get());
    }

    /* JADX INFO: renamed from: c */
    public final String m17795c() {
        StringBuilder sb2 = new StringBuilder();
        m17794a();
        sb2.append(AbstractC1616b.m2470b(this.f50236b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        m17794a();
        sb2.append(AbstractC1616b.m2470b(this.f50237c.f50250b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d */
    public final void m17796d() {
        Context context = this.f50235a;
        boolean zM8695c = AbstractC8151n5.m8695c(context);
        String str = this.f50236b;
        if (zM8695c) {
            StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            m17794a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            m17794a();
            this.f50238d.m18946d("[DEFAULT]".equals(str));
            ((C20512c) this.f50242h.get()).m21166c();
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        m17794a();
        sb3.append(str);
        Log.i("FirebaseApp", sb3.toString());
        AtomicReference atomicReference = C16186f.f50231b;
        if (atomicReference.get() == null) {
            C16186f c16186f = new C16186f(context);
            while (!atomicReference.compareAndSet(null, c16186f)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(c16186f, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16187g)) {
            return false;
        }
        C16187g c16187g = (C16187g) obj;
        c16187g.m17794a();
        return this.f50236b.equals(c16187g.f50236b);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m17797g() {
        boolean z6;
        m17794a();
        C1623a c1623a = (C1623a) this.f50241g.get();
        synchronized (c1623a) {
            z6 = c1623a.f4606a;
        }
        return z6;
    }

    public final int hashCode() {
        return this.f50236b.hashCode();
    }

    public final String toString() {
        C19665d c19665d = new C19665d(this);
        c19665d.m20639a(this.f50236b, DiagnosticsEntry.NAME_KEY);
        c19665d.m20639a(this.f50237c, "options");
        return c19665d.toString();
    }
}
