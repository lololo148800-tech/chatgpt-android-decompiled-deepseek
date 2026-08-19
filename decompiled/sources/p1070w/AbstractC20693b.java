package p1070w;

import android.os.LocaleList;

/* JADX INFO: renamed from: w.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20693b {
    /* JADX INFO: renamed from: a */
    public static String m21212a() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
