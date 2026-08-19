package p501Ub;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import p813ij.C15026j;

/* JADX INFO: renamed from: Ub.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7601c {

    /* JADX INFO: renamed from: a */
    public static final C15026j f24035a = new C15026j("CommonUtils", "");

    /* JADX INFO: renamed from: a */
    public static String m7947a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            String strConcat = "Exception thrown when trying to get app version ".concat(e10.toString());
            C15026j c15026j = f24035a;
            if (Log.isLoggable((String) c15026j.f46724Y, 6)) {
                String str = (String) c15026j.f46725Z;
                if (str != null) {
                    strConcat = str.concat(strConcat);
                }
                AbstractC15256t.m16465c("CommonUtils", strConcat);
            }
            return "";
        }
    }
}
