package p893n;

import android.content.res.Configuration;
import android.os.LocaleList;
import p1072w2.C20793e;

/* JADX INFO: renamed from: n.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17383o {
    /* JADX INFO: renamed from: a */
    public static void m19075a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* JADX INFO: renamed from: b */
    public static C20793e m19076b(Configuration configuration) {
        return C20793e.m21310b(configuration.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: c */
    public static void m19077c(C20793e c20793e) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c20793e.f66056a.mo21311a()));
    }

    /* JADX INFO: renamed from: d */
    public static void m19078d(Configuration configuration, C20793e c20793e) {
        configuration.setLocales(LocaleList.forLanguageTags(c20793e.f66056a.mo21311a()));
    }
}
