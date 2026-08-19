package p523V9;

import android.os.Build;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import kotlin.jvm.internal.AbstractC16544l;
import p017Af.C0470a;
import p049Bm.InterfaceC1436k;
import p1127yf.C21530e;
import p1155zi.C22011h0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p503Ud.C7629b;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8467E;
import p575Xd.C9436E;
import p759g1.AbstractC13799a;
import p774h1.C14365u;

/* JADX INFO: renamed from: V9.d6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8072d6 {

    /* JADX INFO: renamed from: a */
    public static int f25387a = 3;

    /* JADX INFO: renamed from: a */
    public static final long m8484a(float f10, float f11) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = AbstractC13799a.f43583b;
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: b */
    public static final void m8485b(String str, String messageId, C7629b block, boolean z6, C9436E safeUrls, InterfaceC1436k onIntent, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(block, "block");
        AbstractC16544l.m18094g(safeUrls, "safeUrls");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(-779997351);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str != null ? new C22011h0(str) : null) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(messageId) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? c6021p.m6542f(block) : c6021p.m6545h(block) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6544g(z6) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(safeUrls) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 131072 : 65536;
        }
        if ((i11 & 74899) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC8098h0.m8569a(null, 0, 0.0f, AbstractC8411c.m8969c(-1394886997, c6021p, new C21530e(block, str, messageId, onIntent, AbstractC8467E.m9097b(c6021p) ? C14365u.f45055e : C14365u.f45052b, z6, safeUrls)), c6021p, 3120, 5);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0470a(str, messageId, block, z6, safeUrls, onIntent, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m8486c(String str, String str2) {
        String strM8491h = m8491h(str);
        if (m8490g(3, strM8491h)) {
            Log.d(strM8491h, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m8487d(String str, String str2) {
        String strM8491h = m8491h(str);
        if (m8490g(6, strM8491h)) {
            AbstractC15256t.m16465c(strM8491h, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m8488e(String str, String str2, Throwable th2) {
        String strM8491h = m8491h(str);
        if (m8490g(6, strM8491h)) {
            AbstractC15256t.m16466d(strM8491h, str2, th2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m8489f(String str) {
        return m8490g(3, m8491h(str));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m8490g(int i10, String str) {
        return f25387a <= i10 || Log.isLoggable(str, i10);
    }

    /* JADX INFO: renamed from: h */
    public static String m8491h(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    /* JADX INFO: renamed from: i */
    public static void m8492i(String str, String str2) {
        String strM8491h = m8491h(str);
        if (m8490g(5, strM8491h)) {
            AbstractC15256t.m16482t(strM8491h, str2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m8493j(String str, String str2, Throwable th2) {
        String strM8491h = m8491h(str);
        if (m8490g(5, strM8491h)) {
            AbstractC15256t.m16483u(strM8491h, str2, th2);
        }
    }
}
