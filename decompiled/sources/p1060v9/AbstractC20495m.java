package p1060v9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC15256t;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p063C9.AbstractC1616b;
import p1009s9.AbstractC19505h;
import p115E9.C2361c;
import p523V9.AbstractC8135l5;
import p692d0.C12959L;

/* JADX INFO: renamed from: v9.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20495m {

    /* JADX INFO: renamed from: a */
    public static final C12959L f65078a = new C12959L(0);

    /* JADX INFO: renamed from: b */
    public static Locale f65079b;

    /* JADX INFO: renamed from: a */
    public static String m21139a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C2361c.m3449a(context).f7317Y;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m21140b(Context context, int i10) {
        Resources resources = context.getResources();
        String strM21139a = m21139a(context);
        if (i10 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strM21139a);
        }
        if (i10 == 2) {
            return AbstractC1616b.m2473e(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strM21139a);
        }
        if (i10 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strM21139a);
        }
        if (i10 == 5) {
            return m21142d(context, "common_google_play_services_invalid_account_text", strM21139a);
        }
        if (i10 == 7) {
            return m21142d(context, "common_google_play_services_network_error_text", strM21139a);
        }
        if (i10 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strM21139a);
        }
        if (i10 == 20) {
            return m21142d(context, "common_google_play_services_restricted_profile_text", strM21139a);
        }
        switch (i10) {
            case 16:
                return m21142d(context, "common_google_play_services_api_unavailable_text", strM21139a);
            case 17:
                return m21142d(context, "common_google_play_services_sign_in_failed_text", strM21139a);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strM21139a);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, strM21139a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m21141c(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                AbstractC15256t.m16465c("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m21143e(context, "common_google_play_services_invalid_account_title");
            case 7:
                AbstractC15256t.m16465c("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m21143e(context, "common_google_play_services_network_error_title");
            case 8:
                AbstractC15256t.m16465c("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                AbstractC15256t.m16465c("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                AbstractC15256t.m16465c("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                AbstractC15256t.m16465c("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                AbstractC15256t.m16465c("GoogleApiAvailability", "Unexpected error code " + i10);
                return null;
            case 16:
                AbstractC15256t.m16465c("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                AbstractC15256t.m16465c("GoogleApiAvailability", "The specified account could not be signed in.");
                return m21143e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                AbstractC15256t.m16465c("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m21143e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m21142d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strM21143e = m21143e(context, str);
        if (strM21143e == null) {
            strM21143e = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strM21143e, str2);
    }

    /* JADX INFO: renamed from: e */
    public static String m21143e(Context context, String str) {
        Resources resourcesForApplication;
        C12959L c12959l = f65078a;
        synchronized (c12959l) {
            try {
                Locale locale = AbstractC8135l5.m8657e(context.getResources().getConfiguration()).f66056a.get(0);
                if (!locale.equals(f65079b)) {
                    c12959l.clear();
                    f65079b = locale;
                }
                String str2 = (String) c12959l.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = AbstractC19505h.f61953a;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication == null) {
                    return null;
                }
                int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    AbstractC15256t.m16482t("GoogleApiAvailability", "Missing resource: ".concat(str));
                    return null;
                }
                String string = resourcesForApplication.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    AbstractC15256t.m16482t("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    return null;
                }
                f65078a.put(str, string);
                return string;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
