package io.sentry.android.core;

import android.os.Looper;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import io.sentry.C15108A1;
import io.sentry.C15138K1;
import io.sentry.C15144M1;
import io.sentry.C15347d1;
import io.sentry.C15516w;
import io.sentry.EnumC15147N1;
import io.sentry.EnumC15401l0;
import io.sentry.InterfaceC15472s;
import io.sentry.android.core.performance.C15251d;
import io.sentry.android.core.performance.C15252e;
import io.sentry.android.core.performance.EnumC15250c;
import io.sentry.protocol.C15421A;
import io.sentry.protocol.C15428a;
import io.sentry.protocol.C15436i;
import io.sentry.protocol.C15447t;
import io.sentry.protocol.C15450w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p009A7.FlM.nkFZpTrMPpn;
import p228J.AbstractC3794B0;
import p544W9.AbstractC8483G3;
import p791hj.C14522e;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.android.core.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C15199Q implements InterfaceC15472s {

    /* JADX INFO: renamed from: Y */
    public boolean f47378Y = false;

    /* JADX INFO: renamed from: Z */
    public final C14522e f47379Z;

    /* JADX INFO: renamed from: o0 */
    public final SentryAndroidOptions f47380o0;

    public C15199Q(SentryAndroidOptions sentryAndroidOptions, C14522e c14522e) {
        AbstractC8483G3.m9133c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f47380o0 = sentryAndroidOptions;
        this.f47379Z = c14522e;
    }

    /* JADX INFO: renamed from: f */
    public static C15450w m16409f(C15252e c15252e, C15144M1 c15144m1, C15447t c15447t, String str) {
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(Looper.getMainLooper().getThread().getId()));
        map.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        Double dValueOf = Double.valueOf(c15252e.f47617Z / 1000.0d);
        long j10 = 0;
        if (c15252e.m16457b()) {
            j10 = (c15252e.m16458c() ? c15252e.f47619p0 - c15252e.f47618o0 : 0L) + c15252e.f47617Z;
        }
        return new C15450w(dValueOf, Double.valueOf(j10 / 1000.0d), c15447t, new C15144M1(), c15144m1, str, c15252e.f47616Y, EnumC15147N1.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), null, map);
    }

    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: a */
    public final C15108A1 mo16376a(C15108A1 c15108a1, C15516w c15516w) {
        return c15108a1;
    }

    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: e */
    public final C15347d1 mo16380e(C15347d1 c15347d1, C15516w c15516w) {
        return c15347d1;
    }

    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: k */
    public final synchronized C15421A mo16381k(C15421A c15421a, C15516w c15516w) {
        Map mapM16009A;
        try {
            if (!this.f47380o0.isTracingEnabled()) {
                return c15421a;
            }
            if (m16407c(c15421a)) {
                if (!this.f47378Y) {
                    C15252e c15252eM16454a = C15251d.m16451b().m16454a(this.f47380o0);
                    long j10 = c15252eM16454a.m16458c() ? c15252eM16454a.f47619p0 - c15252eM16454a.f47618o0 : 0L;
                    if (j10 != 0) {
                        c15421a.f48055F0.put(C15251d.m16451b().f47606Y == EnumC15250c.COLD ? "app_start_cold" : "app_start_warm", new C15436i(Float.valueOf(j10), EnumC15401l0.MILLISECOND.apiName()));
                        m16406b(C15251d.m16451b(), c15421a);
                        this.f47378Y = true;
                    }
                }
                C15428a c15428a = (C15428a) c15421a.f47195Z.m16663d(C15428a.class, "app");
                if (c15428a == null) {
                    c15428a = new C15428a();
                    c15421a.f47195Z.m16661b(c15428a);
                }
                c15428a.f48095v0 = C15251d.m16451b().f47606Y == EnumC15250c.COLD ? "cold" : "warm";
            }
            m16408d(c15421a);
            C15447t c15447t = c15421a.f47194Y;
            C15138K1 c15138k1M16660a = c15421a.f47195Z.m16660a();
            if (c15447t != null && c15138k1M16660a != null && c15138k1M16660a.f47148q0.contentEquals("ui.load") && (mapM16009A = this.f47379Z.m16009A(c15447t)) != null) {
                c15421a.f48055F0.putAll(mapM16009A);
            }
            return c15421a;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m16406b(C15251d c15251d, C15421A c15421a) {
        C15138K1 c15138k1M16660a;
        C15144M1 c15144m1;
        if (c15251d.f47606Y == EnumC15250c.COLD && (c15138k1M16660a = c15421a.f47195Z.m16660a()) != null) {
            ArrayList arrayList = c15421a.f48054E0;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c15144m1 = null;
                    break;
                }
                C15450w c15450w = (C15450w) it.next();
                if (c15450w.f48230r0.contentEquals("app.start.cold")) {
                    c15144m1 = c15450w.f48228p0;
                    break;
                }
            }
            long j10 = C15251d.f47604w0;
            C15252e c15252e = c15251d.f47608o0;
            boolean zM16457b = c15252e.m16457b();
            C15447t c15447t = c15138k1M16660a.f47144Y;
            if (zM16457b && Math.abs(j10 - c15252e.f47618o0) <= 10000) {
                C15252e c15252e2 = new C15252e();
                c15252e2.m16459d(c15252e.f47618o0);
                c15252e2.f47617Z = c15252e.f47617Z;
                c15252e2.f47619p0 = j10;
                c15252e2.f47616Y = "Process Initialization";
                arrayList.add(m16409f(c15252e2, c15144m1, c15447t, nkFZpTrMPpn.eoVmoIebZ));
            }
            ArrayList arrayList2 = new ArrayList(c15251d.f47611r0.values());
            Collections.sort(arrayList2);
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(m16409f((C15252e) it2.next(), c15144m1, c15447t, "contentprovider.load"));
                }
            }
            C15252e c15252e3 = c15251d.f47610q0;
            if (c15252e3.m16458c()) {
                arrayList.add(m16409f(c15252e3, c15144m1, c15447t, "application.load"));
            }
            ArrayList arrayList3 = new ArrayList(c15251d.f47612s0);
            Collections.sort(arrayList3);
            if (arrayList3.isEmpty()) {
                return;
            }
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                throw AbstractC3794B0.m4497v(it3);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16407c(C15421A c15421a) {
        C15450w c15450w;
        Iterator it = c15421a.f48054E0.iterator();
        do {
            boolean zHasNext = it.hasNext();
            String str = VjclRfeKsMflo.lezt;
            if (!zHasNext) {
                C15138K1 c15138k1M16660a = c15421a.f47195Z.m16660a();
                if (c15138k1M16660a != null) {
                    String str2 = c15138k1M16660a.f47148q0;
                    if (str2.equals(str) || str2.equals("app.start.warm")) {
                        return true;
                    }
                }
                return false;
            }
            c15450w = (C15450w) it.next();
            if (c15450w.f48230r0.contentEquals(str)) {
                break;
            }
        } while (!c15450w.f48230r0.contentEquals("app.start.warm"));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX INFO: renamed from: d */
    public static void m16408d(C15421A c15421a) {
        boolean z6;
        Double d10;
        Double d11;
        Object obj;
        ArrayList<C15450w> arrayList = c15421a.f48054E0;
        C15450w c15450w = null;
        C15450w c15450w2 = null;
        for (C15450w c15450w3 : arrayList) {
            if ("ui.load.initial_display".equals(c15450w3.f48230r0)) {
                c15450w = c15450w3;
            } else if ("ui.load.full_display".equals(c15450w3.f48230r0)) {
                c15450w2 = c15450w3;
            }
            if (c15450w != null && c15450w2 != null) {
                break;
            }
        }
        if (c15450w == null && c15450w2 == null) {
            return;
        }
        for (C15450w c15450w4 : arrayList) {
            if (c15450w4 != c15450w && c15450w4 != c15450w2) {
                Map map = c15450w4.f48235w0;
                boolean z10 = false;
                boolean z11 = map == null || (obj = map.get("thread.name")) == null || qffLJgOYizGmMj.RgQ.equals(obj);
                Double d12 = c15450w4.f48225Y;
                if (c15450w != null) {
                    double dDoubleValue = d12.doubleValue();
                    if (dDoubleValue < c15450w.f48225Y.doubleValue() || (((d11 = c15450w.f48226Z) != null && dDoubleValue > d11.doubleValue()) || !z11)) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                } else {
                    z6 = false;
                }
                if (c15450w2 != null) {
                    double dDoubleValue2 = d12.doubleValue();
                    if (dDoubleValue2 >= c15450w2.f48225Y.doubleValue() && ((d10 = c15450w2.f48226Z) == null || dDoubleValue2 <= d10.doubleValue())) {
                        z10 = true;
                    }
                }
                if (z6 || z10) {
                    Map concurrentHashMap = c15450w4.f48235w0;
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                        c15450w4.f48235w0 = concurrentHashMap;
                    }
                    if (z6) {
                        concurrentHashMap.put("ui.contributes_to_ttid", Boolean.TRUE);
                    }
                    if (z10) {
                        concurrentHashMap.put("ui.contributes_to_ttfd", Boolean.TRUE);
                    }
                }
            }
        }
    }
}
