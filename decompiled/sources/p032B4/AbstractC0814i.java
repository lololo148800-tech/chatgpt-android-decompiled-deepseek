package p032B4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import io.sentry.hints.C15370i;
import java.io.File;
import java.io.IOException;
import p610Z1.C10147n;

/* JADX INFO: renamed from: B4.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0814i {

    /* JADX INFO: renamed from: a */
    public static final C10147n f2270a = new C10147n();

    /* JADX INFO: renamed from: b */
    public static final Object f2271b = new Object();

    /* JADX INFO: renamed from: c */
    public static C15370i f2272c = null;

    /* JADX INFO: renamed from: a */
    public static long m1873a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0812g.m1870a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static C15370i m1874b() {
        C15370i c15370i = new C15370i(2);
        f2272c = c15370i;
        f2270a.m10745k(c15370i);
        return f2272c;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    /* JADX WARN: Code duplicated, block: B:44:0x006f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX INFO: renamed from: c */
    public static void m1875c(Context context, boolean z6) {
        int i10;
        boolean z10;
        int i11;
        File file;
        boolean z11;
        File file2;
        long length;
        boolean z12;
        File file3;
        C0813h c0813hM1871a;
        int i12;
        C0813h c0813h;
        int i13;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z6 || f2272c == null) {
            synchronized (f2271b) {
                if (z6) {
                    i10 = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 28) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        long jM1873a = m1873a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            c0813hM1871a = C0813h.m1871a(file3);
                        } else {
                            c0813hM1871a = null;
                        }
                        if (c0813hM1871a == null) {
                            if (!z10) {
                                i10 = 327680;
                            } else if (z11) {
                                i10 = 1;
                            } else if (z12) {
                                i10 = 2;
                            }
                        } else if (!z10) {
                            i10 = 327680;
                        } else if (z11) {
                            i10 = 1;
                        } else if (z12) {
                            i10 = 2;
                        }
                        if (z6) {
                            i10 = 2;
                        }
                        if (c0813hM1871a == null) {
                            i12 = i10;
                        } else {
                            i12 = i10;
                        }
                        c0813h = new C0813h(1, i12, jM1873a, length);
                        if (c0813hM1871a != null) {
                            c0813h.m1872b(file3);
                        } else {
                            c0813h.m1872b(file3);
                        }
                        m1874b();
                        return;
                    }
                    m1874b();
                    return;
                }
                if (f2272c != null) {
                    return;
                }
                i10 = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th2) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th2;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (IOException unused) {
                    z10 = false;
                }
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28 && i11 != 30) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    if (file.exists() || length3 <= 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists() || length <= 0) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    try {
                        long jM1873a2 = m1873a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                c0813hM1871a = C0813h.m1871a(file3);
                            } catch (IOException unused2) {
                                m1874b();
                                return;
                            }
                        } else {
                            c0813hM1871a = null;
                        }
                        if (c0813hM1871a == null && c0813hM1871a.f2268c == jM1873a2 && (i13 = c0813hM1871a.f2267b) != 2) {
                            i10 = i13;
                        } else if (!z10) {
                            i10 = 327680;
                        } else if (z11) {
                            i10 = 1;
                        } else if (z12) {
                            i10 = 2;
                        }
                        if (z6 && z12 && i10 != 1) {
                            i10 = 2;
                        }
                        if (c0813hM1871a == null && c0813hM1871a.f2267b == 2 && i10 == 1 && length3 < c0813hM1871a.f2269d) {
                            i12 = 3;
                        } else {
                            i12 = i10;
                        }
                        c0813h = new C0813h(1, i12, jM1873a2, length);
                        if (c0813hM1871a != null || !c0813hM1871a.equals(c0813h)) {
                            try {
                                c0813h.m1872b(file3);
                            } catch (IOException unused3) {
                            }
                        }
                        m1874b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        m1874b();
                        return;
                    }
                }
                m1874b();
                return;
                throw th;
            }
        }
    }
}
