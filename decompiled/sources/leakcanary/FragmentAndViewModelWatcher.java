package leakcanary;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import fo.C13711h;
import fo.InterfaceC13708e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17316s;
import p007A5.C0372g;
import p049Bm.InterfaceC1436k;
import p771go.C14207f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18067d2 = {"Lleakcanary/FragmentAndViewModelWatcher;", "Lfo/e;", "Companion", "leakcanary-object-watcher-android-core_release"}, m18068k = 1, m18069mv = {1, 4, 1})
public final class FragmentAndViewModelWatcher implements InterfaceC13708e {

    /* JADX INFO: renamed from: d */
    public static final String f54352d;

    /* JADX INFO: renamed from: a */
    public final ArrayList f54353a;

    /* JADX INFO: renamed from: b */
    public final FragmentAndViewModelWatcher$lifecycleCallbacks$1 f54354b;

    /* JADX INFO: renamed from: c */
    public final Application f54355c;

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, m18067d2 = {"Lleakcanary/FragmentAndViewModelWatcher$Companion;", "", "<init>", "()V", "", "ANDROIDX_FRAGMENT_CLASS_NAME", "Ljava/lang/String;", "ANDROIDX_FRAGMENT_DESTROY_WATCHER_CLASS_NAME", "ANDROID_SUPPORT_FRAGMENT_DESTROY_WATCHER_CLASS_NAME", "leakcanary-object-watcher-android-core_release"}, m18068k = 1, m18069mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    static {
        new Companion(0);
        f54352d = "android.support.v4.app.Fragment";
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [leakcanary.FragmentAndViewModelWatcher$lifecycleCallbacks$1] */
    public FragmentAndViewModelWatcher(Application application, C13711h reachabilityWatcher) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        AbstractC16544l.m18095h(reachabilityWatcher, "reachabilityWatcher");
        this.f54355c = application;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 26) {
            arrayList.add(new C0372g(reachabilityWatcher));
        }
        InterfaceC1436k interfaceC1436kM18590b = m18590b("androidx.fragment.app.Fragment", "leakcanary.internal.AndroidXFragmentDestroyWatcher", reachabilityWatcher);
        if (interfaceC1436kM18590b != null) {
            arrayList.add(interfaceC1436kM18590b);
        }
        InterfaceC1436k interfaceC1436kM18590b2 = m18590b(f54352d, "leakcanary.internal.AndroidSupportFragmentDestroyWatcher", reachabilityWatcher);
        if (interfaceC1436kM18590b2 != null) {
            arrayList.add(interfaceC1436kM18590b2);
        }
        this.f54353a = arrayList;
        this.f54354b = new Application.ActivityLifecycleCallbacks() { // from class: leakcanary.FragmentAndViewModelWatcher$lifecycleCallbacks$1

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ Application.ActivityLifecycleCallbacks f54356Y;

            {
                Object objNewProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, C14207f.f44620a);
                if (objNewProxyInstance == null) {
                    throw new C17316s("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
                }
                this.f54356Y = (Application.ActivityLifecycleCallbacks) objNewProxyInstance;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                AbstractC16544l.m18095h(activity, "activity");
                Iterator it = this.f54357Z.f54353a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1436k) it.next()).invoke(activity);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity p10) {
                AbstractC16544l.m18095h(p10, "p0");
                this.f54356Y.onActivityDestroyed(p10);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity p10) {
                AbstractC16544l.m18095h(p10, "p0");
                this.f54356Y.onActivityPaused(p10);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity p10) {
                AbstractC16544l.m18095h(p10, "p0");
                this.f54356Y.onActivityResumed(p10);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity p10, Bundle p11) {
                AbstractC16544l.m18095h(p10, "p0");
                AbstractC16544l.m18095h(p11, "p1");
                this.f54356Y.onActivitySaveInstanceState(p10, p11);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity p10) {
                AbstractC16544l.m18095h(p10, "p0");
                this.f54356Y.onActivityStarted(p10);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity p10) {
                AbstractC16544l.m18095h(p10, "p0");
                this.f54356Y.onActivityStopped(p10);
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC1436k m18590b(String str, String str2, C13711h c13711h) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        try {
            Class.forName(str);
            Class.forName(str2);
            Object objNewInstance = Class.forName(str2).getDeclaredConstructor(C13711h.class).newInstance(c13711h);
            if (objNewInstance == null) {
                throw new C17316s("null cannot be cast to non-null type (android.app.Activity) -> kotlin.Unit");
            }
            AbstractC16529F.m18081e(1, objNewInstance);
            return (InterfaceC1436k) objNewInstance;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // fo.InterfaceC13708e
    /* JADX INFO: renamed from: a */
    public final void mo15175a() {
        this.f54355c.registerActivityLifecycleCallbacks(this.f54354b);
    }
}
