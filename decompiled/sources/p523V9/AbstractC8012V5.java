package p523V9;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import p1120y4.C21382i;
import p171Gh.EnumC3058a;
import p893n.AbstractActivityC17375g;

/* JADX INFO: renamed from: V9.V5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8012V5 {
    /* JADX INFO: renamed from: a */
    public static final AbstractActivityC17375g m8328a(Context context) {
        if (context instanceof AbstractActivityC17375g) {
            return (AbstractActivityC17375g) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        AbstractC16544l.m18093f(baseContext, "getBaseContext(...)");
        return m8328a(baseContext);
    }

    /* JADX INFO: renamed from: b */
    public static final String m8329b(Context context) {
        String string;
        AbstractC16544l.m18094g(context, "<this>");
        int i10 = context.getApplicationInfo().labelRes;
        if (i10 == 0) {
            try {
                CharSequence charSequence = context.getApplicationInfo().nonLocalizedLabel;
                return (charSequence == null || (string = charSequence.toString()) == null) ? context.getApplicationInfo().loadLabel(context.getPackageManager()).toString() : string;
            } catch (PackageManager.NameNotFoundException unused) {
                return "";
            }
        }
        String string2 = context.getString(i10);
        AbstractC16544l.m18091d(string2);
        return string2;
    }

    /* JADX INFO: renamed from: c */
    public static long m8330c(View view) {
        if (C21382i.f67879h < 0) {
            Window window = null;
            if ((view != null ? view.getContext() : null) instanceof Activity) {
                Context context = view.getContext();
                AbstractC16544l.m18092e(context, "null cannot be cast to non-null type android.app.Activity");
                window = ((Activity) context).getWindow();
            }
            float f10 = 60.0f;
            float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
            if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                f10 = refreshRate;
            }
            C21382i.f67879h = (long) ((1000 / f10) * UtilsKt.MICROS_MULTIPLIER);
        }
        return C21382i.f67879h;
    }

    /* JADX INFO: renamed from: d */
    public static final void m8331d(Context context) {
        View currentFocus;
        AbstractActivityC17375g abstractActivityC17375gM8328a = m8328a(context);
        if (abstractActivityC17375gM8328a == null || (currentFocus = abstractActivityC17375gM8328a.getCurrentFocus()) == null) {
            return;
        }
        Object systemService = context.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m8332e(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m8333f(Context context) {
        AbstractC16544l.m18094g(context, "<this>");
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.microphone");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static Locale m8334g(Context context) {
        Locale locale = EnumC3058a.EN.f9226Y;
        AbstractC16544l.m18094g(context, "<this>");
        AbstractC16544l.m18094g(locale, "default");
        Locale locale2 = AbstractC8135l5.m8657e(context.getResources().getConfiguration()).f66056a.get(0);
        return locale2 == null ? locale : locale2;
    }
}
