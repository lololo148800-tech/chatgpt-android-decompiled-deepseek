package com.openai.chatgpt.app;

import android.app.Application;
import android.os.SystemClock;
import androidx.navigation.AbstractC11122c;
import com.pairip.StartupLauncher;
import io.sentry.AbstractC15152P0;
import io.sentry.C15476t0;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15124G;
import io.sentry.android.core.AbstractC15202U;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.android.core.C15198P;
import io.sentry.android.core.C15216g;
import io.sentry.android.core.performance.C15251d;
import io.sentry.android.core.performance.C15252e;
import io.sentry.hints.C15370i;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import ni.C17632f;
import p025An.AbstractC0575H;
import p030B2.C0742X;
import p092Dc.C1998o;
import p103Dn.AbstractC2124C;
import p1061vb.C20513d;
import p1081wc.C20884c;
import p140Fa.C2685e;
import p239Ja.C4307j;
import p266Kc.C4633b;
import p266Kc.C4635d;
import p266Kc.C4636e;
import p289Lc.C4995c;
import p451Sb.C7102a;
import p499U9.C7591u;
import p523V9.AbstractC8223w5;
import p849k7.C16349b;
import p905nd.C17592t;
import p992ri.EnumC19019b;
import p992ri.InterfaceC19020c;
import tm.C20007b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/chatgpt/app/MainApplication;", "Landroid/app/Application;", "<init>", "()V", "app_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public class MainApplication extends Application {

    /* JADX INFO: renamed from: Y */
    public C1998o f37185Y;

    static {
        StartupLauncher.launch();
    }

    @Override // android.app.Application
    public final void onCreate() {
        int i10 = 4;
        int i11 = 1;
        C15251d c15251d = C15251d.f47605x0;
        long jUptimeMillis = SystemClock.uptimeMillis();
        C15251d c15251dM16451b = C15251d.m16451b();
        C15252e c15252e = c15251dM16451b.f47610q0;
        if (c15252e.f47618o0 == 0) {
            c15252e.m16459d(jUptimeMillis);
            c15251dM16451b.m16455e(this);
        }
        C16349b c16349b = new C16349b(i11);
        int i12 = AbstractC15202U.f47411b;
        C15198P c15198p = new C15198P();
        synchronized (AbstractC15202U.class) {
            try {
                try {
                    try {
                        AbstractC15152P0.m16333g(new C15476t0(6), new C15216g(c15198p, this, c16349b));
                        InterfaceC15124G interfaceC15124GM16331e = AbstractC15152P0.m16331e();
                        if (AbstractC15256t.m16473k()) {
                            if (interfaceC15124GM16331e.mo16246j().isEnableAutoSessionTracking()) {
                                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                interfaceC15124GM16331e.mo16253v(new C4307j(atomicBoolean, 23));
                                if (!atomicBoolean.get()) {
                                    interfaceC15124GM16331e.mo16236C();
                                }
                            }
                            interfaceC15124GM16331e.mo16246j().getReplayController().start();
                        }
                    } catch (IllegalAccessException e10) {
                        c15198p.mo16297h(EnumC15375i1.FATAL, "Fatal error during SentryAndroid.init(...)", e10);
                        throw new RuntimeException("Failed to initialize Sentry's SDK", e10);
                    } catch (InstantiationException e11) {
                        c15198p.mo16297h(EnumC15375i1.FATAL, "Fatal error during SentryAndroid.init(...)", e11);
                        throw new RuntimeException("Failed to initialize Sentry's SDK", e11);
                    }
                } catch (NoSuchMethodException e12) {
                    c15198p.mo16297h(EnumC15375i1.FATAL, "Fatal error during SentryAndroid.init(...)", e12);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e12);
                } catch (InvocationTargetException e13) {
                    c15198p.mo16297h(EnumC15375i1.FATAL, "Fatal error during SentryAndroid.init(...)", e13);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e13);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC15152P0.m16330d(5000L);
        AbstractC11122c.f33524E = false;
        C1998o c1998o = new C1998o(new C2685e(), new C7591u(i10), new C7102a(i10), new C20513d(), new C7591u(11), new C17592t(), new C2685e(), new C20884c(), new C15370i(16), this);
        this.f37185Y = c1998o;
        C17632f.f56419a.m19234a(c1998o);
        C4995c c4995c = new C4995c(AbstractC8223w5.m8851c());
        c4995c.f16305Z = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(c4995c);
        super.onCreate();
        C1998o c1998o2 = this.f37185Y;
        if (c1998o2 == null) {
            AbstractC16544l.m18103p("appComponent");
            throw null;
        }
        C4636e c4636e = (C4636e) c1998o2.f6079x0.get();
        if (c4636e.f15094e.getAndSet(true)) {
            throw new IllegalArgumentException("Initialize may only be called once!");
        }
        Set set = c4636e.f15092c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            EnumC19019b enumC19019bMo14948a = ((InterfaceC19020c) obj).mo14948a();
            Object arrayList = linkedHashMap.get(enumC19019bMo14948a);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(enumC19019bMo14948a, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        C20007b c20007b = EnumC19019b.f60602p0;
        c20007b.getClass();
        C0742X c0742x = new C0742X(c20007b, 8);
        while (c0742x.hasNext()) {
            EnumC19019b enumC19019b = (EnumC19019b) c0742x.next();
            if (!linkedHashMap.containsKey(enumC19019b)) {
                throw new IllegalArgumentException(("There is no initializer for " + enumC19019b + "!").toString());
            }
            List list = (List) linkedHashMap.get(enumC19019b);
            if (list == null || list.size() != 1) {
                throw new IllegalArgumentException(("There are multiple initializers for " + enumC19019b + "!").toString());
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC19020c) it.next()).mo14949b();
        }
        AbstractC0575H.m1156D(c4636e.f15090a, null, null, new C4633b(c4636e, null), 3);
        AbstractC2124C.m3226y(AbstractC2124C.m3227z(new C4635d(c4636e, null), c4636e.f15093d.f42469c), c4636e.f15090a);
        AbstractC15152P0.m16327a("MainApplication.onCreate " + this);
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        C15251d c15251dM16451b2 = C15251d.m16451b();
        if (c15251dM16451b2.f47610q0.m16456a()) {
            String strConcat = MainApplication.class.getName().concat(".onCreate");
            C15252e c15252e2 = c15251dM16451b2.f47610q0;
            c15252e2.f47616Y = strConcat;
            c15252e2.f47619p0 = jUptimeMillis2;
        }
    }
}
