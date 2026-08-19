package p999s;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: renamed from: s.Q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19314Q {
    /* JADX INFO: renamed from: a */
    public static LocaleList m20400a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m20401b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
