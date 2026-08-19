package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import io.sentry.android.core.AbstractC15256t;
import org.json.JSONException;
import p618Za.C10267f;
import p826j6.C16155i;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11988o0 {

    /* JADX INFO: renamed from: a */
    public static final int f36308a = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: a */
    public static int m13506a(String str, Bundle bundle) {
        if (bundle == null) {
            m13512g(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m13511f(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        m13512g(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    /* JADX INFO: renamed from: b */
    public static void m13507b(Bundle bundle, String str, long j10) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j10);
    }

    /* JADX INFO: renamed from: c */
    public static Bundle m13508c(boolean z6, boolean z10, boolean z11, String str, long j10) {
        Bundle bundle = new Bundle();
        m13507b(bundle, str, j10);
        if (z6) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z10 && z11) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    public static C16155i m13509d(Intent intent, String str) {
        if (intent != null) {
            C10267f c10267fM17778a = C16155i.m17778a();
            c10267fM17778a.f30498b = m13506a(str, intent.getExtras());
            c10267fM17778a.f30497a = m13510e(str, intent.getExtras());
            return c10267fM17778a.m10864c();
        }
        m13512g("BillingHelper", "Got null intent!");
        C10267f c10267fM17778a2 = C16155i.m17778a();
        c10267fM17778a2.f30498b = 6;
        c10267fM17778a2.f30497a = "An internal error occurred.";
        return c10267fM17778a2.m10864c();
    }

    /* JADX INFO: renamed from: e */
    public static String m13510e(String str, Bundle bundle) {
        if (bundle == null) {
            m13512g(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m13511f(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        m13512g(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    /* JADX INFO: renamed from: f */
    public static void m13511f(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i10 = 40000;
            while (!str2.isEmpty() && i10 > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i10));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i10 -= iMin;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m13512g(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            AbstractC15256t.m16482t(str, str2);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m13513h(String str, String str2, Throwable th2) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th2 == null) {
                    AbstractC15256t.m16482t(str, str2);
                } else {
                    AbstractC15256t.m16483u(str, str2, th2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static Bundle m13514i(C16155i c16155i, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", c16155i.f50151a);
        bundle.putString("DEBUG_MESSAGE", c16155i.f50152b);
        bundle.putInt("LOG_REASON", i10 - 1);
        return bundle;
    }

    /* JADX INFO: renamed from: j */
    public static Purchase m13515j(String str, String str2) {
        if (str == null || str2 == null) {
            m13511f("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e10) {
            m13512g("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e10.toString()));
            return null;
        }
    }
}
