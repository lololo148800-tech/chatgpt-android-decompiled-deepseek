package p523V9;

import android.os.Build;
import android.os.Parcel;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: V9.o4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8158o4 {
    /* JADX INFO: renamed from: a */
    public static void m8716a(Object obj, String str, String str2) {
        String strM8719d = m8719d(str);
        if (Log.isLoggable(strM8719d, 3)) {
            Log.d(strM8719d, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m8717b(byte[] bytes, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(bytes, "bytes");
        Parcel parcelObtain = Parcel.obtain();
        AbstractC16544l.m18093f(parcelObtain, "obtain()");
        try {
            parcelObtain.unmarshall(bytes, 0, bytes.length);
            parcelObtain.setDataPosition(0);
            return interfaceC1436k.invoke(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m8718c(String str, String str2, Exception exc) {
        String strM8719d = m8719d(str);
        if (Log.isLoggable(strM8719d, 6)) {
            AbstractC15256t.m16466d(strM8719d, str2, exc);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m8719d(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }
}
