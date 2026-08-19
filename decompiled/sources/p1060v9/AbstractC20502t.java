package p1060v9;

import android.gov.nist.core.Separators;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import p001A.AbstractC0010F;
import p1022t9.C19819d;
import p1022t9.C19826k;

/* JADX INFO: renamed from: v9.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20502t {

    /* JADX INFO: renamed from: a */
    public static final Object f65099a = new Object();

    /* JADX INFO: renamed from: b */
    public static boolean f65100b;

    /* JADX INFO: renamed from: c */
    public static int f65101c;

    /* JADX INFO: renamed from: a */
    public static void m21150a(String str, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m21151b(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m21152c(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            throw new IllegalStateException(AbstractC0010F.m20d("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper", Separators.DOT));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m21153d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m21154e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m21155f() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            String name = looperMyLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m21156g(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m21157h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m21158i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m21159j(String str, boolean z6) {
        if (!z6) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m21160k(boolean z6) {
        if (!z6) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m21161l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static C19819d m21162m(Status status) {
        return status.f36054o0 != null ? new C19826k(status) : new C19819d(status);
    }
}
