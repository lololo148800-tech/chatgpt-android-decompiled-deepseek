package p063C9;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Base64;
import io.sentry.instrumentation.file.C15378c;
import io.sentry.instrumentation.file.C15380e;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import p1060v9.AbstractC20502t;

/* JADX INFO: renamed from: C9.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1616b {

    /* JADX INFO: renamed from: a */
    public static final char[] f4569a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b */
    public static Boolean f4570b;

    /* JADX INFO: renamed from: c */
    public static Boolean f4571c;

    /* JADX INFO: renamed from: d */
    public static Boolean f4572d;

    /* JADX INFO: renamed from: e */
    public static Boolean f4573e;

    /* JADX INFO: renamed from: f */
    public static String f4574f;

    /* JADX INFO: renamed from: g */
    public static int f4575g;

    /* JADX INFO: renamed from: a */
    public static byte[] m2469a(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    /* JADX INFO: renamed from: b */
    public static String m2470b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    /* JADX INFO: renamed from: c */
    public static String m2471c() throws Throwable {
        BufferedReader bufferedReader;
        if (f4574f == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f4574f = Application.getProcessName();
            } else {
                int iMyPid = f4575g;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f4575g = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                strTrim = null;
                try {
                    if (iMyPid > 0) {
                        try {
                            String str = "/proc/" + iMyPid + "/cmdline";
                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                bufferedReader = new BufferedReader(new C15380e(new C15378c(str != null ? new File(str) : null)));
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                try {
                                    String line = bufferedReader.readLine();
                                    AbstractC20502t.m21157h(line);
                                    strTrim = line.trim();
                                    bufferedReader.close();
                                } catch (IOException unused) {
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    f4574f = strTrim;
                                    return f4574f;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader2 = bufferedReader;
                                    if (bufferedReader2 != null) {
                                        try {
                                            bufferedReader2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                throw th3;
                            }
                        } catch (IOException unused3) {
                            bufferedReader = null;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                } catch (IOException unused4) {
                }
                f4574f = strTrim;
            }
        }
        return f4574f;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2472d() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2473e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f4570b == null) {
            f4570b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (f4570b.booleanValue() && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (f4571c == null) {
            f4571c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f4571c.booleanValue()) {
            return !m2472d() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }
}
