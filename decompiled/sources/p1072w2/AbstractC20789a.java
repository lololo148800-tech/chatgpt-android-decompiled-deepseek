package p1072w2;

import android.os.Build;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.AbstractC0763j;

/* JADX INFO: renamed from: w2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20789a {
    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            AbstractC0763j.m1695d(30);
        }
        if (i10 >= 30) {
            AbstractC0763j.m1695d(31);
        }
        if (i10 >= 30) {
            AbstractC0763j.m1695d(33);
        }
        if (i10 >= 30) {
            AbstractC0763j.m1695d(UtilsKt.MICROS_MULTIPLIER);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m21307a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 35) {
            if (i10 >= 34) {
                String CODENAME = Build.VERSION.CODENAME;
                AbstractC16544l.m18093f(CODENAME, "CODENAME");
                if (!"REL".equals(CODENAME)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = CODENAME.toUpperCase(locale);
                    AbstractC16544l.m18093f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase2 = "VanillaIceCream".toUpperCase(locale);
                    AbstractC16544l.m18093f(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (upperCase.compareTo(upperCase2) >= 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
