package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.DisplayMetrics;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.android.core.internal.util.C15231c;
import io.sentry.android.core.internal.util.C15235g;
import io.sentry.protocol.C15433f;
import io.sentry.protocol.C15440m;
import io.sentry.protocol.EnumC15432e;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p110E4.C2313k;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8656j3;

/* JADX INFO: renamed from: io.sentry.android.core.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C15187E {

    /* JADX INFO: renamed from: h */
    public static volatile C15187E f47312h;

    /* JADX INFO: renamed from: a */
    public final Context f47313a;

    /* JADX INFO: renamed from: b */
    public final SentryAndroidOptions f47314b;

    /* JADX INFO: renamed from: c */
    public final C15184B f47315c;

    /* JADX INFO: renamed from: d */
    public final Boolean f47316d;

    /* JADX INFO: renamed from: e */
    public final C2313k f47317e;

    /* JADX INFO: renamed from: f */
    public final C15440m f47318f;

    /* JADX INFO: renamed from: g */
    public final Long f47319g;

    /* JADX WARN: Code duplicated, block: B:46:0x00cd A[PHI: r8
      0x00cd: PHI (r8v5 java.lang.Process) = (r8v26 java.lang.Process), (r8v27 java.lang.Process) binds: [B:45:0x00cb, B:50:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public C15187E(Context context, SentryAndroidOptions sentryAndroidOptions) {
        int length;
        Process processExec;
        Process process;
        Process process2;
        boolean z6;
        boolean z10;
        boolean z11 = false;
        this.f47313a = context;
        this.f47314b = sentryAndroidOptions;
        C15184B c15184b = new C15184B(sentryAndroidOptions.getLogger());
        this.f47315c = c15184b;
        C15231c.f47528b.m16439a();
        C15440m c15440m = new C15440m();
        c15440m.f48174Y = "Android";
        c15440m.f48175Z = Build.VERSION.RELEASE;
        c15440m.f48177p0 = Build.DISPLAY;
        String strM16469g = AbstractC15256t.m16469g(sentryAndroidOptions.getLogger());
        if (strM16469g != null) {
            c15440m.f48178q0 = strM16469g;
        }
        if (sentryAndroidOptions.isEnableRootCheck()) {
            C15235g c15235g = new C15235g(context, sentryAndroidOptions.getLogger(), c15184b);
            c15235g.f47542b.getClass();
            String str = Build.TAGS;
            if (str == null || !str.contains("test-keys")) {
                String[] strArr = c15235g.f47544d;
                int length2 = strArr.length;
                int i10 = 0;
                while (true) {
                    InterfaceC15127H interfaceC15127H = c15235g.f47543c;
                    if (i10 >= length2) {
                        length = "su";
                        try {
                            try {
                                processExec = c15235g.f47546f.exec(new String[]{"/system/xbin/which", "su"});
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), C15235g.f47540g));
                                    try {
                                        z6 = bufferedReader.readLine() != null;
                                        bufferedReader.close();
                                        processExec.destroy();
                                        length = processExec;
                                    } catch (Throwable th2) {
                                        try {
                                            bufferedReader.close();
                                            throw th2;
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                            throw th2;
                                        }
                                    }
                                } catch (IOException unused) {
                                    interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, "SU isn't found on this Device.", new Object[0]);
                                    process2 = processExec;
                                    process = processExec;
                                    if (processExec != null) {
                                        process.destroy();
                                        process2 = process;
                                    }
                                    z6 = false;
                                    length = process2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    interfaceC15127H.mo16297h(EnumC15375i1.DEBUG, "Error when trying to check if SU exists.", th);
                                    process2 = processExec;
                                    process = processExec;
                                    if (processExec != null) {
                                        process.destroy();
                                        process2 = process;
                                    }
                                    z6 = false;
                                    length = process2;
                                }
                            } catch (Throwable th5) {
                                if (length != 0) {
                                    length.destroy();
                                }
                                throw th5;
                            }
                        } catch (IOException unused2) {
                            processExec = null;
                        } catch (Throwable th6) {
                            th = th6;
                            processExec = null;
                        }
                        if (!z6) {
                            AbstractC8483G3.m9133c(interfaceC15127H, "The ILogger object is required.");
                            PackageManager packageManager = c15235g.f47541a.getPackageManager();
                            if (packageManager == null) {
                                z10 = false;
                                length = length;
                                break;
                            }
                            String[] strArr2 = c15235g.f47545e;
                            length = strArr2.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= length) {
                                    z10 = false;
                                    length = length;
                                    break;
                                }
                                String str2 = strArr2[i11];
                                try {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        packageManager.getPackageInfo(str2, PackageManager.PackageInfoFlags.of(0L));
                                    } else {
                                        packageManager.getPackageInfo(str2, 0);
                                    }
                                    z10 = true;
                                    length = length;
                                    break;
                                } catch (PackageManager.NameNotFoundException unused3) {
                                    i11++;
                                }
                            }
                            if (!z10) {
                                break;
                            } else {
                                break;
                            }
                        }
                    } else {
                        String str3 = strArr[i10];
                        try {
                            if (!new File(str3).exists()) {
                                i10++;
                            }
                        } catch (RuntimeException e10) {
                            length = new Object[]{str3};
                            interfaceC15127H.mo16296g(EnumC15375i1.ERROR, e10, "Error when trying to check if root file %s exists.", length);
                        }
                    }
                    z11 = true;
                    break;
                }
                c15440m.f48179r0 = Boolean.valueOf(z11);
            } else {
                z11 = true;
                c15440m.f48179r0 = Boolean.valueOf(z11);
            }
        }
        this.f47318f = c15440m;
        this.f47316d = this.f47315c.m16375b();
        this.f47317e = AbstractC15256t.m16481s(context, sentryAndroidOptions.getLogger(), this.f47315c);
        ActivityManager.MemoryInfo memoryInfoM16470h = AbstractC15256t.m16470h(context, sentryAndroidOptions.getLogger());
        if (memoryInfoM16470h != null) {
            this.f47319g = Long.valueOf(memoryInfoM16470h.totalMem);
        } else {
            this.f47319g = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Float m16383b(Intent intent, C15524y1 c15524y1) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th2) {
            c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Error getting device battery level.", th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m16384c(Intent intent, C15524y1 c15524y1) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z6 = true;
            if (intExtra != 1 && intExtra != 2) {
                z6 = false;
            }
            return Boolean.valueOf(z6);
        } catch (Throwable th2) {
            c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Error getting device charging state.", th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x023f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0247  */
    /* JADX WARN: Code duplicated, block: B:129:0x0299  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:144:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:43:0x0100  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0134  */
    /* JADX WARN: Code duplicated, block: B:59:0x0146  */
    /* JADX WARN: Code duplicated, block: B:62:0x0166  */
    /* JADX WARN: Code duplicated, block: B:66:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x017e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0184  */
    /* JADX WARN: Code duplicated, block: B:72:0x0199 A[Catch: all -> 0x01a2, TRY_LEAVE, TryCatch #2 {all -> 0x01a2, blocks: (B:70:0x0190, B:72:0x0199), top: B:150:0x0190 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x01f0  */
    /* JADX INFO: renamed from: a */
    public final C15433f m16385a(boolean z6, boolean z10) {
        EnumC15432e enumC15432e;
        Boolean bool;
        InterfaceC15127H logger;
        DisplayMetrics displayMetrics;
        Date dateM9341i;
        TimeZone timeZone;
        String strM16393a;
        Locale locale;
        ArrayList arrayListM16439a;
        IntentFilter intentFilter;
        Intent intentRegisterReceiver;
        int i10;
        Boolean bool2;
        ActivityManager.MemoryInfo memoryInfoM16470h;
        File externalFilesDir;
        String externalStorageState;
        StatFs statFs;
        Long lValueOf;
        File file;
        Long lValueOf2;
        Long lValueOf3;
        Float fValueOf;
        int intExtra;
        LocaleList locales;
        C15433f c15433f = new C15433f();
        SentryAndroidOptions sentryAndroidOptions = this.f47314b;
        boolean zIsSendDefaultPii = sentryAndroidOptions.isSendDefaultPii();
        Context context = this.f47313a;
        if (zIsSendDefaultPii) {
            c15433f.f48126Y = Settings.Global.getString(context.getContentResolver(), "device_name");
        }
        c15433f.f48127Z = Build.MANUFACTURER;
        c15433f.f48128o0 = Build.BRAND;
        c15433f.f48129p0 = AbstractC15256t.m16468f(sentryAndroidOptions.getLogger());
        c15433f.f48130q0 = Build.MODEL;
        c15433f.f48131r0 = Build.ID;
        this.f47315c.getClass();
        c15433f.f48132s0 = Build.SUPPORTED_ABIS;
        Long lValueOf4 = null;
        try {
            try {
                try {
                    int i11 = context.getResources().getConfiguration().orientation;
                    try {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                enumC15432e = null;
                            } else {
                                enumC15432e = EnumC15432e.LANDSCAPE;
                            }
                            if (enumC15432e == null) {
                                try {
                                    sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                                    enumC15432e = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Error getting device orientation.", th);
                                }
                            }
                            c15433f.f48136w0 = enumC15432e;
                            bool = this.f47316d;
                            if (bool != null) {
                                c15433f.f48137x0 = bool;
                            }
                            logger = sentryAndroidOptions.getLogger();
                            displayMetrics = context.getResources().getDisplayMetrics();
                            if (displayMetrics != null) {
                                c15433f.f48111G0 = Integer.valueOf(displayMetrics.widthPixels);
                                c15433f.f48112H0 = Integer.valueOf(displayMetrics.heightPixels);
                                c15433f.f48113I0 = Float.valueOf(displayMetrics.density);
                                c15433f.f48114J0 = Integer.valueOf(displayMetrics.densityDpi);
                            }
                            dateM9341i = AbstractC8656j3.m9341i(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                            c15433f.f48115K0 = dateM9341i;
                            if (Build.VERSION.SDK_INT >= 24) {
                                locales = context.getResources().getConfiguration().getLocales();
                                if (locales.isEmpty()) {
                                    timeZone = Calendar.getInstance().getTimeZone();
                                } else {
                                    timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
                                }
                            } else {
                                timeZone = Calendar.getInstance().getTimeZone();
                            }
                            c15433f.f48116L0 = timeZone;
                            if (c15433f.f48117M0 == null) {
                                try {
                                    strM16393a = AbstractC15191I.m16393a(context);
                                } catch (Throwable th3) {
                                    sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Error getting installationId.", th3);
                                    strM16393a = null;
                                }
                                c15433f.f48117M0 = strM16393a;
                            }
                            locale = Locale.getDefault();
                            if (c15433f.f48118N0 == null) {
                                c15433f.f48118N0 = locale.getLanguage();
                            }
                            if (c15433f.f48119O0 == null) {
                                c15433f.f48119O0 = locale.toString();
                            }
                            arrayListM16439a = C15231c.f47528b.m16439a();
                            if (!arrayListM16439a.isEmpty()) {
                                c15433f.f48123S0 = Double.valueOf(((Integer) Collections.max(arrayListM16439a)).doubleValue());
                                c15433f.f48122R0 = Integer.valueOf(arrayListM16439a.size());
                            }
                            c15433f.f48138y0 = this.f47319g;
                            if (z6 && sentryAndroidOptions.isCollectAdditionalContext()) {
                                intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                                if (Build.VERSION.SDK_INT >= 33) {
                                    intentRegisterReceiver = context.registerReceiver(null, intentFilter, 2);
                                } else {
                                    intentRegisterReceiver = context.registerReceiver(null, intentFilter);
                                }
                                if (intentRegisterReceiver != null) {
                                    c15433f.f48133t0 = m16383b(intentRegisterReceiver, sentryAndroidOptions);
                                    c15433f.f48134u0 = m16384c(intentRegisterReceiver, sentryAndroidOptions);
                                    try {
                                        intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                                        if (intExtra != -1) {
                                            fValueOf = Float.valueOf(intExtra / 10.0f);
                                        } else {
                                            fValueOf = null;
                                        }
                                    } catch (Throwable th4) {
                                        sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Error getting battery temperature.", th4);
                                    }
                                    c15433f.f48121Q0 = fValueOf;
                                }
                                i10 = AbstractC15186D.f47311a[sentryAndroidOptions.getConnectionStatusProvider().mo12581z().ordinal()];
                                if (i10 == 1) {
                                    bool2 = Boolean.FALSE;
                                } else if (i10 != 2) {
                                    bool2 = null;
                                } else {
                                    bool2 = Boolean.TRUE;
                                }
                                c15433f.f48135v0 = bool2;
                                memoryInfoM16470h = AbstractC15256t.m16470h(context, sentryAndroidOptions.getLogger());
                                if (memoryInfoM16470h != null && z10) {
                                    c15433f.f48139z0 = Long.valueOf(memoryInfoM16470h.availMem);
                                    c15433f.f48106B0 = Boolean.valueOf(memoryInfoM16470h.lowMemory);
                                }
                                externalFilesDir = context.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    StatFs statFs2 = new StatFs(externalFilesDir.getPath());
                                    try {
                                        lValueOf2 = Long.valueOf(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong());
                                    } catch (Throwable th5) {
                                        sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Error getting total internal storage amount.", th5);
                                        lValueOf2 = null;
                                    }
                                    c15433f.f48107C0 = lValueOf2;
                                    try {
                                        lValueOf3 = Long.valueOf(statFs2.getAvailableBlocksLong() * statFs2.getBlockSizeLong());
                                    } catch (Throwable th6) {
                                        sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Error getting unused internal storage amount.", th6);
                                        lValueOf3 = null;
                                    }
                                    c15433f.f48108D0 = lValueOf3;
                                }
                                externalStorageState = Environment.getExternalStorageState();
                                if ((!"mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && !Environment.isExternalStorageEmulated()) {
                                    sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.INFO, "External storage is not mounted or emulated.", new Object[0]);
                                } else {
                                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                                    if (externalFilesDirs != null) {
                                        String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
                                        int length = externalFilesDirs.length;
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 < length) {
                                                file = externalFilesDirs[i12];
                                                if (file != null && (absolutePath == null || absolutePath.isEmpty() || !file.getAbsolutePath().contains(absolutePath))) {
                                                    break;
                                                }
                                                i12++;
                                            }
                                        }
                                        if (file != null) {
                                            statFs = new StatFs(file.getPath());
                                        } else {
                                            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.INFO, "Not possible to read external files directory", new Object[0]);
                                        }
                                        if (statFs != null) {
                                            try {
                                                lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                            } catch (Throwable th7) {
                                                sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Error getting total external storage amount.", th7);
                                                lValueOf = null;
                                            }
                                            c15433f.f48109E0 = lValueOf;
                                            try {
                                                lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                            } catch (Throwable th8) {
                                                sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Error getting unused external storage amount.", th8);
                                            }
                                            c15433f.f48110F0 = lValueOf4;
                                        }
                                        if (c15433f.f48120P0 == null) {
                                            c15433f.f48120P0 = sentryAndroidOptions.getConnectionStatusProvider().mo12564h();
                                        }
                                    } else {
                                        sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                                    }
                                    file = null;
                                    if (file != null) {
                                        statFs = new StatFs(file.getPath());
                                    } else {
                                        sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.INFO, "Not possible to read external files directory", new Object[0]);
                                    }
                                    if (statFs != null) {
                                        lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                        c15433f.f48109E0 = lValueOf;
                                        lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                        c15433f.f48110F0 = lValueOf4;
                                    }
                                    if (c15433f.f48120P0 == null) {
                                        c15433f.f48120P0 = sentryAndroidOptions.getConnectionStatusProvider().mo12564h();
                                    }
                                }
                                statFs = null;
                                if (statFs != null) {
                                    lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                    c15433f.f48109E0 = lValueOf;
                                    lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                    c15433f.f48110F0 = lValueOf4;
                                }
                                if (c15433f.f48120P0 == null) {
                                    c15433f.f48120P0 = sentryAndroidOptions.getConnectionStatusProvider().mo12564h();
                                }
                            }
                            return c15433f;
                        }
                        enumC15432e = EnumC15432e.PORTRAIT;
                        if (enumC15432e == null) {
                            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                            enumC15432e = null;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        enumC15432e = null;
                        sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Error getting device orientation.", th);
                        c15433f.f48136w0 = enumC15432e;
                        bool = this.f47316d;
                        if (bool != null) {
                            c15433f.f48137x0 = bool;
                        }
                        logger = sentryAndroidOptions.getLogger();
                        displayMetrics = context.getResources().getDisplayMetrics();
                        if (displayMetrics != null) {
                            c15433f.f48111G0 = Integer.valueOf(displayMetrics.widthPixels);
                            c15433f.f48112H0 = Integer.valueOf(displayMetrics.heightPixels);
                            c15433f.f48113I0 = Float.valueOf(displayMetrics.density);
                            c15433f.f48114J0 = Integer.valueOf(displayMetrics.densityDpi);
                        }
                        dateM9341i = AbstractC8656j3.m9341i(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                        c15433f.f48115K0 = dateM9341i;
                        if (Build.VERSION.SDK_INT >= 24) {
                            locales = context.getResources().getConfiguration().getLocales();
                            if (locales.isEmpty()) {
                                timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
                            } else {
                                timeZone = Calendar.getInstance().getTimeZone();
                            }
                        } else {
                            timeZone = Calendar.getInstance().getTimeZone();
                        }
                        c15433f.f48116L0 = timeZone;
                        if (c15433f.f48117M0 == null) {
                            strM16393a = AbstractC15191I.m16393a(context);
                            c15433f.f48117M0 = strM16393a;
                        }
                        locale = Locale.getDefault();
                        if (c15433f.f48118N0 == null) {
                            c15433f.f48118N0 = locale.getLanguage();
                        }
                        if (c15433f.f48119O0 == null) {
                            c15433f.f48119O0 = locale.toString();
                        }
                        arrayListM16439a = C15231c.f47528b.m16439a();
                        if (!arrayListM16439a.isEmpty()) {
                            c15433f.f48123S0 = Double.valueOf(((Integer) Collections.max(arrayListM16439a)).doubleValue());
                            c15433f.f48122R0 = Integer.valueOf(arrayListM16439a.size());
                        }
                        c15433f.f48138y0 = this.f47319g;
                        if (z6) {
                            intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                            if (Build.VERSION.SDK_INT >= 33) {
                                intentRegisterReceiver = context.registerReceiver(null, intentFilter, 2);
                            } else {
                                intentRegisterReceiver = context.registerReceiver(null, intentFilter);
                            }
                            if (intentRegisterReceiver != null) {
                                c15433f.f48133t0 = m16383b(intentRegisterReceiver, sentryAndroidOptions);
                                c15433f.f48134u0 = m16384c(intentRegisterReceiver, sentryAndroidOptions);
                                intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                                if (intExtra != -1) {
                                    fValueOf = Float.valueOf(intExtra / 10.0f);
                                } else {
                                    fValueOf = null;
                                }
                                c15433f.f48121Q0 = fValueOf;
                            }
                            i10 = AbstractC15186D.f47311a[sentryAndroidOptions.getConnectionStatusProvider().mo12581z().ordinal()];
                            if (i10 == 1) {
                                bool2 = Boolean.FALSE;
                            } else if (i10 != 2) {
                                bool2 = null;
                            } else {
                                bool2 = Boolean.TRUE;
                            }
                            c15433f.f48135v0 = bool2;
                            memoryInfoM16470h = AbstractC15256t.m16470h(context, sentryAndroidOptions.getLogger());
                            if (memoryInfoM16470h != null) {
                                c15433f.f48139z0 = Long.valueOf(memoryInfoM16470h.availMem);
                                c15433f.f48106B0 = Boolean.valueOf(memoryInfoM16470h.lowMemory);
                            }
                            externalFilesDir = context.getExternalFilesDir(null);
                            if (externalFilesDir != null) {
                                StatFs statFs3 = new StatFs(externalFilesDir.getPath());
                                lValueOf2 = Long.valueOf(statFs3.getBlockCountLong() * statFs3.getBlockSizeLong());
                                c15433f.f48107C0 = lValueOf2;
                                lValueOf3 = Long.valueOf(statFs3.getAvailableBlocksLong() * statFs3.getBlockSizeLong());
                                c15433f.f48108D0 = lValueOf3;
                            }
                            externalStorageState = Environment.getExternalStorageState();
                            if ("mounted".equals(externalStorageState)) {
                                sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.INFO, "External storage is not mounted or emulated.", new Object[0]);
                            } else {
                                sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.INFO, "External storage is not mounted or emulated.", new Object[0]);
                            }
                            statFs = null;
                            if (statFs != null) {
                                lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                c15433f.f48109E0 = lValueOf;
                                lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                c15433f.f48110F0 = lValueOf4;
                            }
                            if (c15433f.f48120P0 == null) {
                                c15433f.f48120P0 = sentryAndroidOptions.getConnectionStatusProvider().mo12564h();
                            }
                        }
                        return c15433f;
                    }
                } catch (Throwable th10) {
                    th = th10;
                }
                dateM9341i = AbstractC8656j3.m9341i(System.currentTimeMillis() - SystemClock.elapsedRealtime());
            } catch (IllegalArgumentException e10) {
                sentryAndroidOptions.getLogger().mo16296g(EnumC15375i1.ERROR, e10, "Error getting the device's boot time.", new Object[0]);
                dateM9341i = null;
            }
            displayMetrics = context.getResources().getDisplayMetrics();
        } catch (Throwable th11) {
            logger.mo16297h(EnumC15375i1.ERROR, "Error getting DisplayMetrics.", th11);
            displayMetrics = null;
        }
        c15433f.f48136w0 = enumC15432e;
        bool = this.f47316d;
        if (bool != null) {
            c15433f.f48137x0 = bool;
        }
        logger = sentryAndroidOptions.getLogger();
        if (displayMetrics != null) {
            c15433f.f48111G0 = Integer.valueOf(displayMetrics.widthPixels);
            c15433f.f48112H0 = Integer.valueOf(displayMetrics.heightPixels);
            c15433f.f48113I0 = Float.valueOf(displayMetrics.density);
            c15433f.f48114J0 = Integer.valueOf(displayMetrics.densityDpi);
        }
        c15433f.f48115K0 = dateM9341i;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = context.getResources().getConfiguration().getLocales();
            if (locales.isEmpty()) {
                timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
            } else {
                timeZone = Calendar.getInstance().getTimeZone();
            }
        } else {
            timeZone = Calendar.getInstance().getTimeZone();
        }
        c15433f.f48116L0 = timeZone;
        if (c15433f.f48117M0 == null) {
            strM16393a = AbstractC15191I.m16393a(context);
            c15433f.f48117M0 = strM16393a;
        }
        locale = Locale.getDefault();
        if (c15433f.f48118N0 == null) {
            c15433f.f48118N0 = locale.getLanguage();
        }
        if (c15433f.f48119O0 == null) {
            c15433f.f48119O0 = locale.toString();
        }
        arrayListM16439a = C15231c.f47528b.m16439a();
        if (!arrayListM16439a.isEmpty()) {
            c15433f.f48123S0 = Double.valueOf(((Integer) Collections.max(arrayListM16439a)).doubleValue());
            c15433f.f48122R0 = Integer.valueOf(arrayListM16439a.size());
        }
        c15433f.f48138y0 = this.f47319g;
        if (z6) {
            intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                intentRegisterReceiver = context.registerReceiver(null, intentFilter, 2);
            } else {
                intentRegisterReceiver = context.registerReceiver(null, intentFilter);
            }
            if (intentRegisterReceiver != null) {
                c15433f.f48133t0 = m16383b(intentRegisterReceiver, sentryAndroidOptions);
                c15433f.f48134u0 = m16384c(intentRegisterReceiver, sentryAndroidOptions);
                intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                if (intExtra != -1) {
                    fValueOf = Float.valueOf(intExtra / 10.0f);
                } else {
                    fValueOf = null;
                }
                c15433f.f48121Q0 = fValueOf;
            }
            i10 = AbstractC15186D.f47311a[sentryAndroidOptions.getConnectionStatusProvider().mo12581z().ordinal()];
            if (i10 == 1) {
                bool2 = Boolean.FALSE;
            } else if (i10 != 2) {
                bool2 = null;
            } else {
                bool2 = Boolean.TRUE;
            }
            c15433f.f48135v0 = bool2;
            memoryInfoM16470h = AbstractC15256t.m16470h(context, sentryAndroidOptions.getLogger());
            if (memoryInfoM16470h != null) {
                c15433f.f48139z0 = Long.valueOf(memoryInfoM16470h.availMem);
                c15433f.f48106B0 = Boolean.valueOf(memoryInfoM16470h.lowMemory);
            }
            externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                StatFs statFs4 = new StatFs(externalFilesDir.getPath());
                lValueOf2 = Long.valueOf(statFs4.getBlockCountLong() * statFs4.getBlockSizeLong());
                c15433f.f48107C0 = lValueOf2;
                lValueOf3 = Long.valueOf(statFs4.getAvailableBlocksLong() * statFs4.getBlockSizeLong());
                c15433f.f48108D0 = lValueOf3;
            }
            externalStorageState = Environment.getExternalStorageState();
            if ("mounted".equals(externalStorageState)) {
                sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.INFO, "External storage is not mounted or emulated.", new Object[0]);
            } else {
                sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.INFO, "External storage is not mounted or emulated.", new Object[0]);
            }
            statFs = null;
            if (statFs != null) {
                lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                c15433f.f48109E0 = lValueOf;
                lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                c15433f.f48110F0 = lValueOf4;
            }
            if (c15433f.f48120P0 == null) {
                c15433f.f48120P0 = sentryAndroidOptions.getConnectionStatusProvider().mo12564h();
            }
        }
        return c15433f;
    }
}
