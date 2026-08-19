package p117Eb;

import android.text.TextUtils;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.android.core.AbstractC15256t;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: Eb.w */
/* JADX INFO: loaded from: classes.dex */
public final class C2393w {

    /* JADX INFO: renamed from: d */
    public static final long f7441d = TimeUnit.DAYS.toMillis(7);

    /* JADX INFO: renamed from: a */
    public final String f7442a;

    /* JADX INFO: renamed from: b */
    public final String f7443b;

    /* JADX INFO: renamed from: c */
    public final long f7444c;

    public C2393w(String str, long j10, String str2) {
        this.f7442a = str;
        this.f7443b = str2;
        this.f7444c = j10;
    }

    /* JADX INFO: renamed from: a */
    public static String m3569a(String str, long j10, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put(DiagnosticsEntry.TIMESTAMP_KEY, j10);
            return jSONObject.toString();
        } catch (JSONException e10) {
            AbstractC15256t.m16482t("FirebaseMessaging", "Failed to encode token: " + e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C2393w m3570b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C2393w(str, 0L, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C2393w(jSONObject.getString("token"), jSONObject.getLong(DiagnosticsEntry.TIMESTAMP_KEY), jSONObject.getString("appVersion"));
        } catch (JSONException e10) {
            AbstractC15256t.m16482t("FirebaseMessaging", "Failed to parse token: " + e10);
            return null;
        }
    }
}
