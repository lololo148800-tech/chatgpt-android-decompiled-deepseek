package p893n;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: renamed from: n.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17378j {
    /* JADX INFO: renamed from: a */
    public static LocaleList m19057a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    /* JADX INFO: renamed from: b */
    public static void m19058b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
