package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.openai.chatgpt.app.MainApplication;
import io.sentry.AbstractC15152P0;
import io.sentry.C15345d;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15171W;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import p110E4.C2313k;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: io.sentry.android.core.t */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15256t {
    /* JADX INFO: renamed from: a */
    public static void m16463a(String str, EnumC15375i1 enumC15375i1, String str2, Throwable th2) {
        C15345d c15345d = new C15345d();
        c15345d.f47909r0 = "Logcat";
        c15345d.f47906o0 = str2;
        c15345d.f47911t0 = enumC15375i1;
        if (str != null) {
            c15345d.m16574b(str, ParameterNames.TAG);
        }
        if (th2 != null && th2.getMessage() != null) {
            c15345d.m16574b(th2.getMessage(), "throwable");
        }
        AbstractC15152P0.m16331e().mo16248l(c15345d);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC15171W m16464b(MainApplication mainApplication, C15184B c15184b) {
        return Build.VERSION.SDK_INT >= 30 ? new AnrV2Integration(mainApplication) : new AnrIntegration(mainApplication);
    }

    /* JADX INFO: renamed from: c */
    public static int m16465c(String str, String str2) {
        m16463a(str, EnumC15375i1.ERROR, str2, null);
        return Log.e(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static int m16466d(String str, String str2, Throwable th2) {
        m16463a(str, EnumC15375i1.ERROR, str2, th2);
        return Log.e(str, str2, th2);
    }

    /* JADX INFO: renamed from: e */
    public static String m16467e(Context context, InterfaceC15127H interfaceC15127H) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 != 0) {
                return context.getString(i10);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable th2) {
            interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Error getting application name.", th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m16468f(InterfaceC15127H interfaceC15127H) {
        try {
            return Build.MODEL.split(Separators.f31991SP, -1)[0];
        } catch (Throwable th2) {
            interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Error getting device family.", th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m16469g(InterfaceC15127H interfaceC15127H) {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Exception while attempting to read kernel information", e10);
            return property;
        }
    }

    /* JADX INFO: renamed from: h */
    public static ActivityManager.MemoryInfo m16470h(Context context, InterfaceC15127H interfaceC15127H) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            interfaceC15127H.mo16298o(EnumC15375i1.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Error getting MemoryInfo.", th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static PackageInfo m16471i(Context context, int i10, InterfaceC15127H interfaceC15127H, C15184B c15184b) {
        try {
            c15184b.getClass();
            return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(i10)) : context.getPackageManager().getPackageInfo(context.getPackageName(), i10);
        } catch (Throwable th2) {
            interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Error getting package info.", th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m16472j(PackageInfo packageInfo, C15184B c15184b) {
        c15184b.getClass();
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m16473k() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m16474l(Bundle bundle, InterfaceC15127H interfaceC15127H, String str, boolean z6) {
        boolean z10 = bundle.getBoolean(str, z6);
        interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, str + " read: " + z10, new Object[0]);
        return z10;
    }

    /* JADX INFO: renamed from: m */
    public static Boolean m16475m(Bundle bundle, InterfaceC15127H interfaceC15127H) {
        if (bundle.getSerializable("io.sentry.traces.enable") == null) {
            interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, "io.sentry.traces.enable used default null", new Object[0]);
            return null;
        }
        boolean z6 = bundle.getBoolean("io.sentry.traces.enable", false);
        interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, "io.sentry.traces.enable read: " + z6, new Object[0]);
        return Boolean.valueOf(z6);
    }

    /* JADX INFO: renamed from: n */
    public static Double m16476n(Bundle bundle, InterfaceC15127H interfaceC15127H, String str) {
        Double dValueOf = Double.valueOf(Float.valueOf(bundle.getFloat(str, bundle.getInt(str, -1))).doubleValue());
        interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, str + " read: " + dValueOf, new Object[0]);
        return dValueOf;
    }

    /* JADX INFO: renamed from: o */
    public static List m16477o(Bundle bundle, InterfaceC15127H interfaceC15127H, String str) {
        String string = bundle.getString(str);
        interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, AbstractC9306j0.m9890i(str, " read: ", string), new Object[0]);
        if (string != null) {
            return Arrays.asList(string.split(Separators.COMMA, -1));
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static long m16478p(Bundle bundle, InterfaceC15127H interfaceC15127H, String str, long j10) {
        long j11 = bundle.getInt(str, (int) j10);
        interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, str + " read: " + j11, new Object[0]);
        return j11;
    }

    /* JADX INFO: renamed from: q */
    public static String m16479q(Bundle bundle, InterfaceC15127H interfaceC15127H, String str, String str2) {
        String string = bundle.getString(str, str2);
        interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, AbstractC9306j0.m9890i(str, " read: ", string), new Object[0]);
        return string;
    }

    /* JADX INFO: renamed from: r */
    public static String m16480r(Bundle bundle, InterfaceC15127H interfaceC15127H, String str, String str2) {
        String string = bundle.getString(str, str2);
        interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, AbstractC9306j0.m9890i(str, " read: ", string), new Object[0]);
        return string;
    }

    /* JADX INFO: renamed from: s */
    public static C2313k m16481s(Context context, InterfaceC15127H interfaceC15127H, C15184B c15184b) {
        String str;
        try {
            PackageInfo packageInfoM16471i = m16471i(context, 0, interfaceC15127H, c15184b);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfoM16471i != null && packageManager != null) {
                str = packageInfoM16471i.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    return new C2313k(installerPackageName == null, installerPackageName, 1);
                } catch (IllegalArgumentException unused) {
                    interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static int m16482t(String str, String str2) {
        m16463a(str, EnumC15375i1.WARNING, str2, null);
        return Log.w(str, str2);
    }

    /* JADX INFO: renamed from: u */
    public static void m16483u(String str, String str2, Throwable th2) {
        m16463a(str, EnumC15375i1.WARNING, str2, th2);
        Log.w(str, str2, th2);
    }

    /* JADX INFO: renamed from: v */
    public static void m16484v(String str, Throwable th2) {
        m16463a(str, EnumC15375i1.WARNING, null, th2);
        Log.w(str, th2);
    }

    /* JADX INFO: renamed from: w */
    public static void m16485w(String str, String str2, Exception exc) {
        m16463a(str, EnumC15375i1.ERROR, str2, exc);
        Log.wtf(str, str2, exc);
    }
}
