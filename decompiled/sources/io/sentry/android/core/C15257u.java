package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import com.openai.chatgpt.app.MainApplication;
import io.sentry.C15108A1;
import io.sentry.C15138K1;
import io.sentry.C15324c;
import io.sentry.C15347d1;
import io.sentry.C15516w;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15472s;
import io.sentry.android.core.internal.util.C15231c;
import io.sentry.cache.AbstractC15327a;
import io.sentry.cache.C15332f;
import io.sentry.hints.InterfaceC15362a;
import io.sentry.hints.InterfaceC15363b;
import io.sentry.protocol.C15421A;
import io.sentry.protocol.C15425E;
import io.sentry.protocol.C15428a;
import io.sentry.protocol.C15430c;
import io.sentry.protocol.C15431d;
import io.sentry.protocol.C15433f;
import io.sentry.protocol.C15437j;
import io.sentry.protocol.C15440m;
import io.sentry.protocol.C15441n;
import io.sentry.protocol.C15445r;
import io.sentry.protocol.C15452y;
import io.sentry.protocol.C15453z;
import io.sentry.protocol.DebugImage;
import io.sentry.util.AbstractC15502g;
import io.sentry.util.C15501f;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p1009s9.C19506i;
import p110E4.C2313k;
import p544W9.AbstractC8465D3;
import p571X9.AbstractC9306j0;
import p582Xk.HXHG.TfazcFv;
import p594Y9.C9895g4;
import p690cp.C12910A;

/* JADX INFO: renamed from: io.sentry.android.core.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C15257u implements InterfaceC15472s {

    /* JADX INFO: renamed from: Y */
    public final Context f47625Y;

    /* JADX INFO: renamed from: Z */
    public final SentryAndroidOptions f47626Z;

    /* JADX INFO: renamed from: o0 */
    public final C15184B f47627o0;

    /* JADX INFO: renamed from: p0 */
    public final C19506i f47628p0;

    public C15257u(MainApplication mainApplication, C15184B c15184b, SentryAndroidOptions sentryAndroidOptions) {
        Context applicationContext = mainApplication.getApplicationContext();
        this.f47625Y = applicationContext != null ? applicationContext : mainApplication;
        this.f47626Z = sentryAndroidOptions;
        this.f47627o0 = c15184b;
        this.f47628p0 = new C19506i(new C9895g4(sentryAndroidOptions), 29);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16486b(InterfaceC15363b interfaceC15363b) {
        if (interfaceC15363b instanceof InterfaceC15362a) {
            return "anr_background".equals(((InterfaceC15362a) interfaceC15363b).mo16462e());
        }
        return false;
    }

    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: a */
    public final C15108A1 mo16376a(C15108A1 c15108a1, C15516w c15516w) {
        return c15108a1;
    }

    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: k */
    public final C15421A mo16381k(C15421A c15421a, C15516w c15516w) {
        return c15421a;
    }

    /* JADX WARN: Code duplicated, block: B:197:0x049d  */
    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: e */
    public final C15347d1 mo16380e(C15347d1 c15347d1, C15516w c15516w) {
        C15453z c15453z;
        ArrayList arrayList;
        C15430c c15430c;
        String strM16393a;
        String str;
        int i10;
        File[] fileArr;
        DisplayMetrics displayMetrics;
        String strM16393a2;
        Object objM9088b = AbstractC8465D3.m9088b(c15516w);
        boolean z6 = objM9088b instanceof InterfaceC15363b;
        SentryAndroidOptions sentryAndroidOptions = this.f47626Z;
        if (!z6) {
            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return c15347d1;
        }
        C15437j c15437j = new C15437j();
        InterfaceC15363b interfaceC15363b = (InterfaceC15363b) objM9088b;
        if (interfaceC15363b.mo16488a()) {
            c15437j.f48157Y = "AppExitInfo";
        } else {
            c15437j.f48157Y = "HistoricalAppExitInfo";
        }
        InterfaceC15363b interfaceC15363b2 = (InterfaceC15363b) objM9088b;
        ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(Thread.currentThread(), m16486b(interfaceC15363b2) ? "Background ANR" : "ANR");
        C12910A c12910a = c15347d1.f47917E0;
        ArrayList arrayList2 = c12910a != null ? c12910a.f41066a : null;
        if (arrayList2 == null) {
            c15453z = null;
            break;
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                c15453z = null;
                break;
            }
            c15453z = (C15453z) it.next();
            String str2 = c15453z.f48263o0;
            if (str2 != null && str2.equals("main")) {
                break;
            }
        }
        if (c15453z == null) {
            c15453z = new C15453z();
            c15453z.f48269u0 = new C15452y();
        }
        this.f47628p0.getClass();
        C15452y c15452y = c15453z.f48269u0;
        if (c15452y == null) {
            arrayList = new ArrayList(0);
        } else {
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(C19506i.m20605W(applicationNotResponding, c15437j, c15453z.f48261Y, c15452y.f48257Y, true));
            arrayList = arrayList3;
        }
        c15347d1.f47918F0 = new C12910A(arrayList);
        if (c15347d1.f47201t0 == null) {
            c15347d1.f47201t0 = "java";
        }
        C15430c c15430c2 = c15347d1.f47195Z;
        C15440m c15440m = (C15440m) c15430c2.m16663d(C15440m.class, "os");
        C15440m c15440m2 = new C15440m();
        c15440m2.f48174Y = "Android";
        c15440m2.f48175Z = Build.VERSION.RELEASE;
        c15440m2.f48177p0 = Build.DISPLAY;
        try {
            c15440m2.f48178q0 = AbstractC15256t.m16469g(sentryAndroidOptions.getLogger());
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Error getting OperatingSystem.", th2);
        }
        c15430c2.put("os", c15440m2);
        if (c15440m != null) {
            String str3 = c15440m.f48174Y;
            c15430c2.put((str3 == null || str3.isEmpty()) ? "os_1" : "os_" + str3.trim().toLowerCase(Locale.ROOT), c15440m);
        }
        C15433f c15433f = (C15433f) c15430c2.m16663d(C15433f.class, "device");
        Context context = this.f47625Y;
        C15184B c15184b = this.f47627o0;
        if (c15433f == null) {
            C15433f c15433f2 = new C15433f();
            if (sentryAndroidOptions.isSendDefaultPii()) {
                c15433f2.f48126Y = Settings.Global.getString(context.getContentResolver(), "device_name");
            }
            c15433f2.f48127Z = Build.MANUFACTURER;
            c15433f2.f48128o0 = Build.BRAND;
            c15433f2.f48129p0 = AbstractC15256t.m16468f(sentryAndroidOptions.getLogger());
            c15433f2.f48130q0 = Build.MODEL;
            c15433f2.f48131r0 = Build.ID;
            c15184b.getClass();
            c15433f2.f48132s0 = Build.SUPPORTED_ABIS;
            ActivityManager.MemoryInfo memoryInfoM16470h = AbstractC15256t.m16470h(context, sentryAndroidOptions.getLogger());
            if (memoryInfoM16470h != null) {
                c15433f2.f48138y0 = Long.valueOf(memoryInfoM16470h.totalMem);
            }
            c15433f2.f48137x0 = c15184b.m16375b();
            InterfaceC15127H logger = sentryAndroidOptions.getLogger();
            try {
                displayMetrics = context.getResources().getDisplayMetrics();
            } catch (Throwable th3) {
                logger.mo16297h(EnumC15375i1.ERROR, "Error getting DisplayMetrics.", th3);
                displayMetrics = null;
            }
            if (displayMetrics != null) {
                c15433f2.f48111G0 = Integer.valueOf(displayMetrics.widthPixels);
                c15433f2.f48112H0 = Integer.valueOf(displayMetrics.heightPixels);
                c15433f2.f48113I0 = Float.valueOf(displayMetrics.density);
                c15433f2.f48114J0 = Integer.valueOf(displayMetrics.densityDpi);
            }
            if (c15433f2.f48117M0 == null) {
                try {
                    strM16393a2 = AbstractC15191I.m16393a(context);
                } catch (Throwable th4) {
                    sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Error getting installationId.", th4);
                    strM16393a2 = null;
                }
                c15433f2.f48117M0 = strM16393a2;
            }
            ArrayList arrayListM16439a = C15231c.f47528b.m16439a();
            if (!arrayListM16439a.isEmpty()) {
                c15433f2.f48123S0 = Double.valueOf(((Integer) Collections.max(arrayListM16439a)).doubleValue());
                c15433f2.f48122R0 = Integer.valueOf(arrayListM16439a.size());
            }
            c15430c = c15430c2;
            c15430c.put("device", c15433f2);
        } else {
            c15430c = c15430c2;
        }
        if (!interfaceC15363b.mo16488a()) {
            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return c15347d1;
        }
        if (c15347d1.f47197p0 == null) {
            c15347d1.f47197p0 = (C15441n) C15332f.m16547h(sentryAndroidOptions, "request.json", C15441n.class);
        }
        if (c15347d1.f47202u0 == null) {
            c15347d1.f47202u0 = (C15425E) C15332f.m16547h(sentryAndroidOptions, "user.json", C15425E.class);
        }
        Map map = (Map) C15332f.m16547h(sentryAndroidOptions, "tags.json", Map.class);
        if (map != null) {
            if (c15347d1.f47198q0 == null) {
                c15347d1.f47198q0 = new HashMap(new HashMap(map));
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    if (!c15347d1.f47198q0.containsKey(entry.getKey())) {
                        c15347d1.m16341c((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
        }
        List list = (List) AbstractC15327a.m16536b(sentryAndroidOptions, ".scope-cache", "breadcrumbs.json", List.class, new C15324c(0));
        if (list != null) {
            List list2 = c15347d1.f47206y0;
            if (list2 == null) {
                c15347d1.f47206y0 = new ArrayList(new ArrayList(list));
            } else {
                list2.addAll(list);
            }
        }
        Map map2 = (Map) AbstractC15327a.m16536b(sentryAndroidOptions, ".scope-cache", "extras.json", Map.class, null);
        if (map2 != null) {
            if (c15347d1.f47193A0 == null) {
                c15347d1.f47193A0 = new HashMap(new HashMap(map2));
            } else {
                for (Map.Entry entry2 : map2.entrySet()) {
                    if (!c15347d1.f47193A0.containsKey(entry2.getKey())) {
                        c15347d1.f47193A0.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
        }
        C15430c c15430c3 = (C15430c) AbstractC15327a.m16536b(sentryAndroidOptions, ".scope-cache", "contexts.json", C15430c.class, null);
        if (c15430c3 != null) {
            Iterator it2 = new C15430c(c15430c3).entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it2.next();
                Object value = entry3.getValue();
                Iterator it3 = it2;
                if ((!"trace".equals(entry3.getKey()) || !(value instanceof C15138K1)) && !c15430c.containsKey(entry3.getKey())) {
                    c15430c.put((String) entry3.getKey(), value);
                }
                it2 = it3;
            }
        }
        String str4 = (String) AbstractC15327a.m16536b(sentryAndroidOptions, ".scope-cache", "transaction.json", String.class, null);
        if (c15347d1.f47920H0 == null) {
            c15347d1.f47920H0 = str4;
        }
        List list3 = (List) AbstractC15327a.m16536b(sentryAndroidOptions, ".scope-cache", "fingerprint.json", List.class, null);
        if (c15347d1.f47921I0 == null) {
            c15347d1.f47921I0 = list3 != null ? new ArrayList(list3) : null;
        }
        boolean zM16486b = m16486b(interfaceC15363b2);
        if (c15347d1.f47921I0 == null) {
            List listAsList = Arrays.asList("{{ default }}", zM16486b ? "background-anr" : "foreground-anr");
            c15347d1.f47921I0 = listAsList != null ? new ArrayList(listAsList) : null;
        }
        EnumC15375i1 enumC15375i1 = (EnumC15375i1) AbstractC15327a.m16536b(sentryAndroidOptions, ".scope-cache", "level.json", EnumC15375i1.class, null);
        if (c15347d1.f47919G0 == null) {
            c15347d1.f47919G0 = enumC15375i1;
        }
        C15138K1 c15138k1 = (C15138K1) AbstractC15327a.m16536b(sentryAndroidOptions, ".scope-cache", TfazcFv.wJUxCfNBIyODIt, C15138K1.class, null);
        if (c15430c.m16660a() == null && c15138k1 != null && c15138k1.f47145Z != null && c15138k1.f47144Y != null) {
            c15430c.m16662c(c15138k1);
        }
        String str5 = (String) AbstractC15327a.m16536b(sentryAndroidOptions, ".scope-cache", "replay.json", String.class, null);
        String str6 = "replay_";
        if (!new File(sentryAndroidOptions.getCacheDirPath(), AbstractC9306j0.m9889h("replay_", str5)).exists()) {
            String str7 = (String) AbstractC15327a.m16536b(sentryAndroidOptions, ".options-cache", "replay-error-sample-rate.json", String.class, null);
            if (str7 != null) {
                try {
                    if (Double.parseDouble(str7) < ((C15501f) AbstractC15502g.f48424a.get()).m16686b()) {
                        sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", c15347d1.f47194Y);
                    } else {
                        File[] fileArrListFiles = new File(sentryAndroidOptions.getCacheDirPath()).listFiles();
                        if (fileArrListFiles != null) {
                            int length = fileArrListFiles.length;
                            long jLastModified = Long.MIN_VALUE;
                            int i11 = 0;
                            String strSubstring = null;
                            while (i11 < length) {
                                File file = fileArrListFiles[i11];
                                if (file.isDirectory()) {
                                    fileArr = fileArrListFiles;
                                    if (file.getName().startsWith(str6) && file.lastModified() > jLastModified && file.lastModified() <= ((Date) c15347d1.f47914B0.clone()).getTime()) {
                                        jLastModified = file.lastModified();
                                        strSubstring = file.getName().substring(7);
                                    }
                                } else {
                                    fileArr = fileArrListFiles;
                                }
                                i11++;
                                str6 = str6;
                                fileArrListFiles = fileArr;
                            }
                            str5 = strSubstring;
                        } else {
                            str5 = null;
                        }
                        if (str5 != null) {
                            AbstractC15327a.m16537c(sentryAndroidOptions, str5, ".scope-cache", "replay.json");
                            c15430c.put("replay_id", str5);
                        }
                    }
                } catch (Throwable th5) {
                    sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Error parsing replay sample rate.", th5);
                }
            }
        } else if (str5 != null) {
            AbstractC15327a.m16537c(sentryAndroidOptions, str5, ".scope-cache", "replay.json");
            c15430c.put("replay_id", str5);
        }
        if (c15347d1.f47199r0 == null) {
            c15347d1.f47199r0 = (String) AbstractC15327a.m16536b(sentryAndroidOptions, ".options-cache", "release.json", String.class, null);
        }
        if (c15347d1.f47200s0 == null) {
            String environment = (String) AbstractC15327a.m16536b(sentryAndroidOptions, ".options-cache", "environment.json", String.class, null);
            if (environment == null) {
                environment = sentryAndroidOptions.getEnvironment();
            }
            c15347d1.f47200s0 = environment;
        }
        if (c15347d1.f47205x0 == null) {
            c15347d1.f47205x0 = (String) AbstractC15327a.m16536b(sentryAndroidOptions, ".options-cache", "dist.json", String.class, null);
        }
        if (c15347d1.f47205x0 == null && (str = (String) AbstractC15327a.m16536b(sentryAndroidOptions, ".options-cache", "release.json", String.class, null)) != null) {
            try {
                i10 = 1;
                try {
                    c15347d1.f47205x0 = str.substring(str.indexOf(43) + 1);
                } catch (Throwable unused) {
                    InterfaceC15127H logger2 = sentryAndroidOptions.getLogger();
                    EnumC15375i1 enumC15375i2 = EnumC15375i1.WARNING;
                    Object[] objArr = new Object[i10];
                    objArr[0] = str;
                    logger2.mo16298o(enumC15375i2, "Failed to parse release from scope cache: %s", objArr);
                }
            } catch (Throwable unused2) {
                i10 = 1;
            }
        }
        C15431d c15431d = c15347d1.f47207z0;
        if (c15431d == null) {
            c15431d = new C15431d();
        }
        if (c15431d.f48103Z == null) {
            c15431d.f48103Z = new ArrayList(new ArrayList());
        }
        List list4 = c15431d.f48103Z;
        if (list4 != null) {
            String str8 = (String) AbstractC15327a.m16536b(sentryAndroidOptions, ".options-cache", "proguard-uuid.json", String.class, null);
            if (str8 != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str8);
                list4.add(debugImage);
            }
            c15347d1.f47207z0 = c15431d;
        }
        if (c15347d1.f47196o0 == null) {
            c15347d1.f47196o0 = (C15445r) AbstractC15327a.m16536b(sentryAndroidOptions, ".options-cache", "sdk-version.json", C15445r.class, null);
        }
        C15428a c15428a = (C15428a) c15430c.m16663d(C15428a.class, "app");
        if (c15428a == null) {
            c15428a = new C15428a();
        }
        c15428a.f48090q0 = AbstractC15256t.m16467e(context, sentryAndroidOptions.getLogger());
        c15428a.f48096w0 = Boolean.valueOf(!m16486b(interfaceC15363b2));
        PackageInfo packageInfoM16471i = AbstractC15256t.m16471i(context, 0, sentryAndroidOptions.getLogger(), c15184b);
        if (packageInfoM16471i != null) {
            c15428a.f48086Y = packageInfoM16471i.packageName;
        }
        String str9 = c15347d1.f47199r0;
        if (str9 == null) {
            str9 = (String) AbstractC15327a.m16536b(sentryAndroidOptions, ".options-cache", "release.json", String.class, null);
        }
        if (str9 != null) {
            try {
                String strSubstring2 = str9.substring(str9.indexOf(64) + 1, str9.indexOf(43));
                String strSubstring3 = str9.substring(str9.indexOf(43) + 1);
                c15428a.f48091r0 = strSubstring2;
                c15428a.f48092s0 = strSubstring3;
            } catch (Throwable unused3) {
                sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.WARNING, "Failed to parse release from scope cache: %s", str9);
            }
        }
        c15430c.m16661b(c15428a);
        Map map3 = (Map) AbstractC15327a.m16536b(sentryAndroidOptions, ".options-cache", "tags.json", Map.class, null);
        if (map3 != null) {
            if (c15347d1.f47198q0 == null) {
                c15347d1.f47198q0 = new HashMap(new HashMap(map3));
            } else {
                for (Map.Entry entry4 : map3.entrySet()) {
                    if (!c15347d1.f47198q0.containsKey(entry4.getKey())) {
                        c15347d1.m16341c((String) entry4.getKey(), (String) entry4.getValue());
                    }
                }
            }
        }
        C15425E c15425e = c15347d1.f47202u0;
        if (c15425e == null) {
            c15425e = new C15425E();
            c15347d1.f47202u0 = c15425e;
        }
        C15425E c15425e2 = c15425e;
        if (c15425e2.f48063Z == null) {
            try {
                strM16393a = AbstractC15191I.m16393a(context);
            } catch (Throwable th6) {
                sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Error getting installationId.", th6);
                strM16393a = null;
            }
            c15425e2.f48063Z = strM16393a;
        }
        if (c15425e2.f48066q0 == null) {
            c15425e2.f48066q0 = "{{auto}}";
        }
        try {
            C2313k c2313kM16481s = AbstractC15256t.m16481s(context, sentryAndroidOptions.getLogger(), c15184b);
            if (c2313kM16481s != null) {
                HashMap map4 = new HashMap();
                map4.put("isSideLoaded", String.valueOf(c2313kM16481s.f7194b));
                String str10 = c2313kM16481s.f7195c;
                if (str10 != null) {
                    map4.put("installerStore", str10);
                }
                for (Map.Entry entry5 : map4.entrySet()) {
                    c15347d1.m16341c((String) entry5.getKey(), (String) entry5.getValue());
                }
            }
        } catch (Throwable th7) {
            sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Error getting side loaded info.", th7);
        }
        return c15347d1;
    }
}
