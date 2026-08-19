package androidx.lifecycle;

import androidx.navigation.AbstractC11122c;
import io.sentry.C15358g1;
import io.sentry.android.navigation.SentryNavigationListener;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p183H4.C3231f;
import p544W9.AbstractC8471E3;

/* JADX INFO: renamed from: androidx.lifecycle.f */
/* JADX INFO: loaded from: classes.dex */
public final class C11097f implements InterfaceC11110s {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f33470Y = 1;

    /* JADX INFO: renamed from: Z */
    public final Object f33471Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f33472o0;

    public C11097f(DefaultLifecycleObserver defaultLifecycleObserver, InterfaceC11110s interfaceC11110s) {
        AbstractC16544l.m18094g(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f33471Z = defaultLifecycleObserver;
        this.f33472o0 = interfaceC11110s;
    }

    @Override // androidx.lifecycle.InterfaceC11110s
    /* JADX INFO: renamed from: E */
    public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
        switch (this.f33470Y) {
            case 0:
                int i10 = AbstractC11096e.f33469a[enumC11103l.ordinal()];
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.f33471Z;
                switch (i10) {
                    case 1:
                        defaultLifecycleObserver.onCreate(interfaceC11112u);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(interfaceC11112u);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(interfaceC11112u);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(interfaceC11112u);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(interfaceC11112u);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(interfaceC11112u);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC11110s interfaceC11110s = (InterfaceC11110s) this.f33472o0;
                if (interfaceC11110s != null) {
                    interfaceC11110s.mo684E(interfaceC11112u, enumC11103l);
                    return;
                }
                return;
            case 1:
                if (enumC11103l == EnumC11103l.ON_START) {
                    ((AbstractC11105n) this.f33471Z).mo7808c(this);
                    ((C3231f) this.f33472o0).m4126g();
                    return;
                }
                return;
            case 2:
                HashMap map = ((C11091a) this.f33472o0).f33459a;
                List list = (List) map.get(enumC11103l);
                InterfaceC11111t interfaceC11111t = (InterfaceC11111t) this.f33471Z;
                C11091a.m12150a(list, interfaceC11112u, enumC11103l, interfaceC11111t);
                C11091a.m12150a((List) map.get(EnumC11103l.ON_ANY), interfaceC11112u, enumC11103l, interfaceC11111t);
                return;
            default:
                EnumC11103l enumC11103l2 = EnumC11103l.ON_RESUME;
                SentryNavigationListener sentryNavigationListener = (SentryNavigationListener) this.f33472o0;
                AbstractC11122c abstractC11122c = (AbstractC11122c) this.f33471Z;
                if (enumC11103l == enumC11103l2) {
                    abstractC11122c.m12183b(sentryNavigationListener);
                    return;
                } else {
                    if (enumC11103l == EnumC11103l.ON_PAUSE) {
                        abstractC11122c.f33546r.remove(sentryNavigationListener);
                        return;
                    }
                    return;
                }
        }
    }

    public C11097f(AbstractC11122c abstractC11122c, SentryNavigationListener sentryNavigationListener) {
        this.f33471Z = abstractC11122c;
        this.f33472o0 = sentryNavigationListener;
        AbstractC8471E3.m9104b("ComposeNavigation");
        C15358g1.m16578n().m16580f("maven:io.sentry:sentry-compose");
    }

    public C11097f(InterfaceC11111t interfaceC11111t) {
        this.f33471Z = interfaceC11111t;
        C11094c c11094c = C11094c.f33466c;
        Class<?> cls = interfaceC11111t.getClass();
        C11091a c11091a = (C11091a) c11094c.f33467a.get(cls);
        this.f33472o0 = c11091a == null ? c11094c.m12152a(cls, null) : c11091a;
    }

    public C11097f(C3231f c3231f, AbstractC11105n abstractC11105n) {
        this.f33471Z = abstractC11105n;
        this.f33472o0 = c3231f;
    }
}
