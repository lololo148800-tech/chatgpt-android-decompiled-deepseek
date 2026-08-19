package p484Ti;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C11114w;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC11112u;
import androidx.lifecycle.ProcessLifecycleOwner;
import bo.AbstractC11523k;
import com.segment.analytics.kotlin.core.AbstractC12774a;
import com.segment.analytics.kotlin.core.Settings;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16644c;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0611f0;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p117Eb.C2392v;
import p153Fn.AbstractC2935m;
import p153Fn.C2925c;
import p201Hn.C3516e;
import p437Rn.C6949g;
import p530Vi.C8312h;
import p530Vi.C8317m;
import p530Vi.InterfaceC8294B;
import p554Wi.EnumC8881h;
import p554Wi.InterfaceC8882i;
import p594Y9.AbstractC9804S3;
import p594Y9.AbstractC9852a3;

/* JADX INFO: renamed from: Ti.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C7491t implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver, InterfaceC8882i {
    public static final C7480i Companion = new C7480i();

    /* JADX INFO: renamed from: y0 */
    public static final C7479h f23774y0;

    /* JADX INFO: renamed from: Y */
    public C8312h f23775Y;

    /* JADX INFO: renamed from: Z */
    public PackageInfo f23776Z;

    /* JADX INFO: renamed from: o0 */
    public Application f23777o0;

    /* JADX INFO: renamed from: r0 */
    public boolean f23780r0;

    /* JADX INFO: renamed from: w0 */
    public C11114w f23785w0;

    /* JADX INFO: renamed from: x0 */
    public InterfaceC8294B f23786x0;

    /* JADX INFO: renamed from: p0 */
    public boolean f23778p0 = true;

    /* JADX INFO: renamed from: q0 */
    public boolean f23779q0 = true;

    /* JADX INFO: renamed from: s0 */
    public final AtomicBoolean f23781s0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: t0 */
    public final AtomicInteger f23782t0 = new AtomicInteger(1);

    /* JADX INFO: renamed from: u0 */
    public final AtomicBoolean f23783u0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: v0 */
    public final AtomicBoolean f23784v0 = new AtomicBoolean(false);

    static {
        C7479h c7479h = new C7479h();
        c7479h.f23750Y = new C7478g();
        f23774y0 = c7479h;
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: b */
    public final void mo7803b(Settings settings, int i10) {
        AbstractC9804S3.m10428b(settings, i10);
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: c */
    public final C8312h mo7804c() {
        C8312h c8312h = this.f23775Y;
        if (c8312h != null) {
            return c8312h;
        }
        AbstractC16544l.m18103p("analytics");
        throw null;
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: d */
    public final void mo7805d(C8312h c8312h) {
        this.f23775Y = c8312h;
        C8317m c8317m = c8312h.f25902Y;
        Object obj = c8317m.f25916b;
        Application application = obj instanceof Application ? (Application) obj : null;
        if (application == null) {
            throw new IllegalStateException("no android application context registered");
        }
        this.f23777o0 = application;
        this.f23778p0 = c8317m.f25919e;
        this.f23779q0 = c8317m.f25921g;
        this.f23780r0 = c8317m.f25920f;
        this.f23786x0 = c8312h.m8932b();
        Application application2 = this.f23777o0;
        if (application2 == null) {
            AbstractC16544l.m18103p(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
            throw null;
        }
        PackageManager packageManager = application2.getPackageManager();
        AbstractC16544l.m18093f(packageManager, "application.packageManager");
        try {
            Application application3 = this.f23777o0;
            if (application3 == null) {
                AbstractC16544l.m18103p(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
                throw null;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(application3.getPackageName(), 0);
            AbstractC16544l.m18093f(packageInfo, "{\n            packageMan…packageName, 0)\n        }");
            this.f23776Z = packageInfo;
            Application application4 = this.f23777o0;
            if (application4 == null) {
                AbstractC16544l.m18103p(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
                throw null;
            }
            application4.registerActivityLifecycleCallbacks(this);
            if (this.f23780r0) {
                this.f23785w0 = ProcessLifecycleOwner.f33399u0.f33405r0;
                C6949g c6949g = new C6949g(this, 10);
                C2925c c2925c = (C2925c) mo7804c().f25903Z.f7437o0;
                C3516e c3516e = AbstractC0593T.f1824a;
                AbstractC0575H.m1156D(c2925c, AbstractC2935m.f8797a, null, new C7489r(c6949g, null), 2);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder("Package not found: ");
            Application application5 = this.f23777o0;
            if (application5 == null) {
                AbstractC16544l.m18103p(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
                throw null;
            }
            sb2.append(application5.getPackageName());
            AssertionError assertionError = new AssertionError(sb2.toString());
            AbstractC9852a3.m10503d(c8312h, assertionError);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7810f(InterfaceC1436k interfaceC1436k) {
        C2392v c2392v = mo7804c().f25903Z;
        AbstractC0575H.m1156D((C2925c) c2392v.f7437o0, (C0611f0) c2392v.f7438p0, null, new C7488q(interfaceC1436k, null), 2);
    }

    @Override // p554Wi.InterfaceC8882i
    public final EnumC8881h getType() {
        return EnumC8881h.f27187q0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent;
        AbstractC16544l.m18094g(activity, "activity");
        m7810f(new C7481j(this, activity, bundle, null));
        if (!this.f23780r0) {
            onCreate(f23774y0);
        }
        if (!this.f23779q0 || (intent = activity.getIntent()) == null) {
            return;
        }
        Uri referrer = activity.getReferrer();
        String string = referrer != null ? referrer.toString() : null;
        C8312h c8312hMo7804c = mo7804c();
        if (intent.getData() == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (string != null) {
            AbstractC16645d element = AbstractC11523k.m12910c(string);
            AbstractC16544l.m18094g(element, "element");
        }
        Uri data = intent.getData();
        if (data != null) {
            if (data.isHierarchical()) {
                for (String parameter : data.getQueryParameterNames()) {
                    String queryParameter = data.getQueryParameter(parameter);
                    if (queryParameter != null && AbstractC21322p.m21711s0(queryParameter).toString().length() > 0) {
                        AbstractC16544l.m18093f(parameter, "parameter");
                        AbstractC16645d element2 = AbstractC11523k.m12910c(queryParameter);
                        AbstractC16544l.m18094g(element2, "element");
                    }
                }
            }
            AbstractC16645d element3 = AbstractC11523k.m12910c(data.toString());
            AbstractC16544l.m18094g(element3, "element");
        }
        C8312h.m8930e(c8312hMo7804c, "Deep Link Opened", new C16644c(linkedHashMap), 4);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        m7810f(new C7482k(this, activity, null));
        if (this.f23780r0) {
            return;
        }
        onDestroy(f23774y0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        m7810f(new C7483l(this, activity, null));
        if (this.f23780r0) {
            return;
        }
        onPause(f23774y0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        m7810f(new C7484m(this, activity, null));
        if (this.f23780r0) {
            return;
        }
        onStart(f23774y0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC16544l.m18094g(bundle, "bundle");
        m7810f(new C7485n(this, activity, bundle, null));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        m7810f(new C7486o(this, activity, null));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        m7810f(new C7487p(this, activity, null));
        if (this.f23780r0) {
            return;
        }
        onStop(f23774y0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(InterfaceC11112u owner) {
        AbstractC16544l.m18094g(owner, "owner");
        if (this.f23781s0.getAndSet(true) || !this.f23778p0) {
            return;
        }
        this.f23782t0.set(0);
        this.f23783u0.set(true);
        PackageInfo packageInfo = this.f23776Z;
        if (packageInfo == null) {
            AbstractC16544l.m18103p("packageInfo");
            throw null;
        }
        String str = packageInfo.versionName;
        String string = (Build.VERSION.SDK_INT >= 28 ? Long.valueOf(packageInfo.getLongVersionCode()) : Integer.valueOf(packageInfo.versionCode)).toString();
        InterfaceC8294B interfaceC8294B = this.f23786x0;
        if (interfaceC8294B == null) {
            AbstractC16544l.m18103p("storage");
            throw null;
        }
        String strMo7525b = interfaceC8294B.mo7525b(6);
        InterfaceC8294B interfaceC8294B2 = this.f23786x0;
        if (interfaceC8294B2 == null) {
            AbstractC16544l.m18103p("storage");
            throw null;
        }
        String strMo7525b2 = interfaceC8294B2.mo7525b(7);
        InterfaceC8294B interfaceC8294B3 = this.f23786x0;
        if (interfaceC8294B3 == null) {
            AbstractC16544l.m18103p("storage");
            throw null;
        }
        String strMo7525b3 = interfaceC8294B3.mo7525b(8);
        if (strMo7525b2 == null && strMo7525b3 == null) {
            C8312h c8312hMo7804c = mo7804c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AbstractC16645d element = AbstractC11523k.m12910c(str);
            AbstractC16544l.m18094g(element, "element");
            AbstractC16645d element2 = AbstractC11523k.m12910c(string);
            AbstractC16544l.m18094g(element2, "element");
            C8312h.m8930e(c8312hMo7804c, "Application Installed", new C16644c(linkedHashMap), 4);
        } else if (!AbstractC16544l.m18089b(string, strMo7525b2)) {
            C8312h c8312hMo7804c2 = mo7804c();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            AbstractC16645d element3 = AbstractC11523k.m12910c(str);
            AbstractC16544l.m18094g(element3, "element");
            AbstractC16645d element4 = AbstractC11523k.m12910c(string);
            AbstractC16544l.m18094g(element4, "element");
            AbstractC16645d element5 = AbstractC11523k.m12910c(strMo7525b);
            AbstractC16544l.m18094g(element5, "element");
            AbstractC16645d element6 = AbstractC11523k.m12910c(String.valueOf(strMo7525b2));
            AbstractC16544l.m18094g(element6, "element");
            C8312h.m8930e(c8312hMo7804c2, "Application Updated", new C16644c(linkedHashMap2), 4);
        }
        m7810f(new C7490s(this, str, string, null));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC11112u owner) {
        AbstractC16544l.m18094g(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(InterfaceC11112u owner) {
        AbstractC16544l.m18094g(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC11112u owner) {
        AbstractC16544l.m18094g(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC11112u owner) {
        AbstractC16544l.m18094g(owner, "owner");
        if (this.f23778p0 && this.f23782t0.incrementAndGet() == 1 && !this.f23784v0.get()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AtomicBoolean atomicBoolean = this.f23783u0;
            if (atomicBoolean.get()) {
                PackageInfo packageInfo = this.f23776Z;
                if (packageInfo == null) {
                    AbstractC16544l.m18103p("packageInfo");
                    throw null;
                }
                AbstractC16645d element = AbstractC11523k.m12910c(packageInfo.versionName);
                AbstractC16544l.m18094g(element, "element");
                PackageInfo packageInfo2 = this.f23776Z;
                if (packageInfo2 == null) {
                    AbstractC16544l.m18103p("packageInfo");
                    throw null;
                }
                AbstractC16645d element2 = AbstractC11523k.m12910c((Build.VERSION.SDK_INT >= 28 ? Long.valueOf(packageInfo2.getLongVersionCode()) : Integer.valueOf(packageInfo2.versionCode)).toString());
                AbstractC16544l.m18094g(element2, "element");
            }
            C8312h.m8930e(mo7804c(), "Application Opened", new C16644c(linkedHashMap), 4);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC11112u owner) {
        AbstractC16544l.m18094g(owner, "owner");
        if (this.f23778p0 && this.f23782t0.decrementAndGet() == 0 && !this.f23784v0.get()) {
            C8312h.m8930e(mo7804c(), "Application Backgrounded", null, 6);
        }
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: a */
    public final AbstractC12774a mo7802a(AbstractC12774a abstractC12774a) {
        return abstractC12774a;
    }
}
