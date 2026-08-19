package com.revenuecat.purchases.utils;

import android.os.Build;
import com.revenuecat.purchases.common.LogUtilsKt;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p030B2.AbstractC0767l;
import p1072w2.C20793e;
import p1072w2.C20796h;
import p1113xn.AbstractC21329w;
import p909nm.AbstractC17678l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\n*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Ljava/util/Locale;", "convertToCorrectlyFormattedLocale", "(Ljava/util/Locale;)Ljava/util/Locale;", "", "toLocale", "(Ljava/lang/String;)Ljava/util/Locale;", "locale", "", "sharedLanguageCodeWith", "(Ljava/util/Locale;Ljava/util/Locale;)Z", "", "getDefaultLocales", "()Ljava/util/List;", "inferScript", "(Ljava/util/Locale;)Ljava/lang/String;", "Lw2/e;", "toList", "(Lw2/e;)Ljava/util/List;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class LocaleExtensionsKt {
    public static final Locale convertToCorrectlyFormattedLocale(Locale locale) {
        AbstractC16544l.m18094g(locale, "<this>");
        String string = locale.toString();
        AbstractC16544l.m18093f(string, "toString()");
        return toLocale(string);
    }

    public static final List<Locale> getDefaultLocales() {
        C20793e c20793e = C20793e.f66055b;
        return toList(Build.VERSION.SDK_INT >= 24 ? new C20793e(new C20796h(AbstractC0767l.m1707b())) : C20793e.m21309a(Locale.getDefault()));
    }

    private static final String inferScript(Locale locale) {
        String country;
        String script = locale.getScript();
        if (script != null && script.length() != 0) {
            String script2 = locale.getScript();
            AbstractC16544l.m18093f(script2, "script");
            return script2;
        }
        if (!AbstractC16544l.m18089b(locale.getLanguage(), "zh") || (country = locale.getCountry()) == null) {
            return "";
        }
        int iHashCode = country.hashCode();
        if (iHashCode != 2155) {
            if (iHashCode != 2307) {
                if (iHashCode != 2466) {
                    if (iHashCode != 2644) {
                        if (iHashCode != 2691 || !country.equals("TW")) {
                            return "";
                        }
                    } else if (!country.equals("SG")) {
                        return "";
                    }
                } else if (!country.equals("MO")) {
                    return "";
                }
            } else if (!country.equals("HK")) {
                return "";
            }
            return "Hant";
        }
        if (!country.equals("CN")) {
            return "";
        }
        return "Hans";
    }

    public static final boolean sharedLanguageCodeWith(Locale locale, Locale locale2) {
        AbstractC16544l.m18094g(locale, "<this>");
        AbstractC16544l.m18094g(locale2, "locale");
        try {
            return AbstractC16544l.m18089b(locale.getISO3Language(), locale2.getISO3Language()) && AbstractC16544l.m18089b(inferScript(locale), inferScript(locale2));
        } catch (MissingResourceException e10) {
            LogUtilsKt.errorLog$default("Locale " + locale + " or " + locale2 + " can't obtain ISO3 language code (" + e10 + "). Falling back to language.", null, 2, null);
            return AbstractC16544l.m18089b(locale.getLanguage(), locale2.getLanguage());
        }
    }

    private static final List<Locale> toList(C20793e c20793e) {
        int size = c20793e.f66056a.size();
        Locale[] localeArr = new Locale[size];
        for (int i10 = 0; i10 < size; i10++) {
            localeArr[i10] = c20793e.f66056a.get(i10);
        }
        return AbstractC17678l.m19315v(localeArr);
    }

    public static final Locale toLocale(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        Locale localeForLanguageTag = Locale.forLanguageTag(AbstractC21329w.m21731r(str, "_", "-"));
        AbstractC16544l.m18093f(localeForLanguageTag, "forLanguageTag(replace(\"_\", \"-\"))");
        return localeForLanguageTag;
    }
}
