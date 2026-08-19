package p030B2;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.icu.text.DecimalFormatSymbols;
import android.os.LocaleList;
import android.os.UserManager;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import java.util.Locale;

/* JADX INFO: renamed from: B2.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0767l {
    /* JADX INFO: renamed from: a */
    public static LocaleList m1706a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    /* JADX INFO: renamed from: b */
    public static LocaleList m1707b() {
        return LocaleList.getDefault();
    }

    /* JADX INFO: renamed from: c */
    public static DecimalFormatSymbols m1708c(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    /* JADX INFO: renamed from: d */
    public static LocaleList m1709d(Configuration configuration) {
        return configuration.getLocales();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1710e(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    /* JADX INFO: renamed from: f */
    public static DragAndDropPermissions m1711f(Activity activity, DragEvent dragEvent) {
        return activity.requestDragAndDropPermissions(dragEvent);
    }
}
