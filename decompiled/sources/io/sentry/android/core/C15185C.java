package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Looper;
import com.openai.chatgpt.app.MainApplication;
import io.sentry.AbstractC15160S0;
import io.sentry.C15108A1;
import io.sentry.C15347d1;
import io.sentry.C15399k1;
import io.sentry.C15516w;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15472s;
import io.sentry.android.core.performance.C15251d;
import io.sentry.android.core.performance.C15252e;
import io.sentry.protocol.C15421A;
import io.sentry.protocol.C15425E;
import io.sentry.protocol.C15428a;
import io.sentry.protocol.C15430c;
import io.sentry.protocol.C15433f;
import io.sentry.protocol.C15440m;
import io.sentry.protocol.C15446s;
import io.sentry.protocol.C15451x;
import io.sentry.protocol.C15452y;
import io.sentry.protocol.C15453z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p110E4.C2313k;
import p117Eb.CallableC2378h;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8656j3;
import p690cp.C12910A;

/* JADX INFO: renamed from: io.sentry.android.core.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C15185C implements InterfaceC15472s {

    /* JADX INFO: renamed from: Y */
    public final Context f47306Y;

    /* JADX INFO: renamed from: Z */
    public final C15184B f47307Z;

    /* JADX INFO: renamed from: o0 */
    public final SentryAndroidOptions f47308o0;

    /* JADX INFO: renamed from: p0 */
    public final Future f47309p0;

    public C15185C(MainApplication mainApplication, C15184B c15184b, SentryAndroidOptions sentryAndroidOptions) {
        Context applicationContext = mainApplication.getApplicationContext();
        this.f47306Y = applicationContext != null ? applicationContext : mainApplication;
        this.f47307Z = c15184b;
        AbstractC8483G3.m9133c(sentryAndroidOptions, "The options object is required.");
        this.f47308o0 = sentryAndroidOptions;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f47309p0 = executorServiceNewSingleThreadExecutor.submit(new CallableC2378h(this, 6, sentryAndroidOptions));
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: a */
    public final C15108A1 mo16376a(C15108A1 c15108a1, C15516w c15516w) {
        boolean zM16379d = m16379d(c15108a1, c15516w);
        if (zM16379d) {
            m16377b(c15108a1, c15516w);
        }
        m16378c(c15108a1, false, zM16379d);
        return c15108a1;
    }

    /* JADX INFO: renamed from: b */
    public final void m16377b(AbstractC15160S0 abstractC15160S0, C15516w c15516w) {
        Boolean bool;
        C15428a c15428a = (C15428a) abstractC15160S0.f47195Z.m16663d(C15428a.class, "app");
        if (c15428a == null) {
            c15428a = new C15428a();
        }
        SentryAndroidOptions sentryAndroidOptions = this.f47308o0;
        InterfaceC15127H logger = sentryAndroidOptions.getLogger();
        Context context = this.f47306Y;
        c15428a.f48090q0 = AbstractC15256t.m16467e(context, logger);
        C15252e c15252eM16454a = C15251d.m16451b().m16454a(sentryAndroidOptions);
        if (c15252eM16454a.m16457b()) {
            C15399k1 c15399k1 = c15252eM16454a.m16457b() ? new C15399k1(c15252eM16454a.f47617Z * 1000000) : null;
            c15428a.f48087Z = c15399k1 != null ? AbstractC8656j3.m9341i(Double.valueOf(c15399k1.f48009Y / 1000000.0d).longValue()) : null;
        }
        if (!AbstractC8465D3.m9091e(c15516w) && c15428a.f48096w0 == null && (bool = C15183A.f47265b.f47266a) != null) {
            c15428a.f48096w0 = Boolean.valueOf(!bool.booleanValue());
        }
        InterfaceC15127H logger2 = sentryAndroidOptions.getLogger();
        C15184B c15184b = this.f47307Z;
        PackageInfo packageInfoM16471i = AbstractC15256t.m16471i(context, 4096, logger2, c15184b);
        if (packageInfoM16471i != null) {
            String strM16472j = AbstractC15256t.m16472j(packageInfoM16471i, c15184b);
            if (abstractC15160S0.f47205x0 == null) {
                abstractC15160S0.f47205x0 = strM16472j;
            }
            c15428a.f48086Y = packageInfoM16471i.packageName;
            c15428a.f48091r0 = packageInfoM16471i.versionName;
            c15428a.f48092s0 = AbstractC15256t.m16472j(packageInfoM16471i, c15184b);
            HashMap map = new HashMap();
            String[] strArr = packageInfoM16471i.requestedPermissions;
            int[] iArr = packageInfoM16471i.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    String str = strArr[i10];
                    map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i10] & 2) == 2 ? "granted" : "not_granted");
                }
            }
            c15428a.f48093t0 = map;
        }
        abstractC15160S0.f47195Z.m16661b(c15428a);
    }

    /* JADX INFO: renamed from: c */
    public final void m16378c(AbstractC15160S0 abstractC15160S0, boolean z6, boolean z10) {
        C15425E c15425e = abstractC15160S0.f47202u0;
        if (c15425e == null) {
            c15425e = new C15425E();
            abstractC15160S0.f47202u0 = c15425e;
        }
        if (c15425e.f48063Z == null) {
            c15425e.f48063Z = AbstractC15191I.m16393a(this.f47306Y);
        }
        if (c15425e.f48066q0 == null) {
            c15425e.f48066q0 = "{{auto}}";
        }
        C15430c c15430c = abstractC15160S0.f47195Z;
        C15433f c15433f = (C15433f) c15430c.m16663d(C15433f.class, "device");
        Future future = this.f47309p0;
        SentryAndroidOptions sentryAndroidOptions = this.f47308o0;
        if (c15433f == null) {
            try {
                c15430c.put("device", ((C15187E) future.get()).m16385a(z6, z10));
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to retrieve device info", th2);
            }
            C15440m c15440m = (C15440m) c15430c.m16663d(C15440m.class, "os");
            try {
                c15430c.put("os", ((C15187E) future.get()).f47318f);
            } catch (Throwable th3) {
                sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to retrieve os system", th3);
            }
            if (c15440m != null) {
                String str = c15440m.f48174Y;
                c15430c.put((str == null || str.isEmpty()) ? "os_1" : "os_" + str.trim().toLowerCase(Locale.ROOT), c15440m);
            }
        }
        try {
            C2313k c2313k = ((C15187E) future.get()).f47317e;
            if (c2313k != null) {
                HashMap map = new HashMap();
                map.put("isSideLoaded", String.valueOf(c2313k.f7194b));
                String str2 = c2313k.f7195c;
                if (str2 != null) {
                    map.put("installerStore", str2);
                }
                for (Map.Entry entry : map.entrySet()) {
                    abstractC15160S0.m16341c((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Error getting side loaded info.", th4);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m16379d(AbstractC15160S0 abstractC15160S0, C15516w c15516w) {
        if (AbstractC8465D3.m9093g(c15516w)) {
            return true;
        }
        this.f47308o0.getLogger().mo16298o(EnumC15375i1.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC15160S0.f47194Y);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: e */
    public final C15347d1 mo16380e(C15347d1 c15347d1, C15516w c15516w) {
        C15452y c15452y;
        List list;
        boolean z6;
        boolean zM16379d = m16379d(c15347d1, c15516w);
        if (zM16379d) {
            m16377b(c15347d1, c15516w);
            C12910A c12910a = c15347d1.f47917E0;
            if ((c12910a != null ? c12910a.f41066a : null) != null) {
                boolean zM9091e = AbstractC8465D3.m9091e(c15516w);
                C12910A c12910a2 = c15347d1.f47917E0;
                for (C15453z c15453z : c12910a2 != null ? c12910a2.f41066a : null) {
                    Long l4 = c15453z.f48261Y;
                    if (l4 == null) {
                        z6 = false;
                    } else if (Looper.getMainLooper().getThread().getId() == l4.longValue()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (c15453z.f48266r0 == null) {
                        c15453z.f48266r0 = Boolean.valueOf(z6);
                    }
                    if (!zM9091e && c15453z.f48268t0 == null) {
                        c15453z.f48268t0 = Boolean.valueOf(z6);
                    }
                }
            }
        }
        m16378c(c15347d1, true, zM16379d);
        C12910A c12910a3 = c15347d1.f47918F0;
        ArrayList arrayList = c12910a3 != null ? c12910a3.f41066a : null;
        if (arrayList != null && arrayList.size() > 1) {
            C15446s c15446s = (C15446s) arrayList.get(arrayList.size() - 1);
            if ("java.lang".equals(c15446s.f48211o0) && (c15452y = c15446s.f48213q0) != null && (list = c15452y.f48257Y) != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(((C15451x) it.next()).f48245o0)) {
                        Collections.reverse(arrayList);
                        break;
                    }
                }
            }
        }
        return c15347d1;
    }

    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: k */
    public final C15421A mo16381k(C15421A c15421a, C15516w c15516w) {
        boolean zM16379d = m16379d(c15421a, c15516w);
        if (zM16379d) {
            m16377b(c15421a, c15516w);
        }
        m16378c(c15421a, false, zM16379d);
        return c15421a;
    }
}
