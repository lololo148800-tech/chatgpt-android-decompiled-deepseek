package p1072w2;

import android.gov.nist.core.Separators;
import android.os.Build;
import java.util.Locale;
import p030B2.AbstractC0767l;

/* JADX INFO: renamed from: w2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C20793e {

    /* JADX INFO: renamed from: b */
    public static final C20793e f66055b = m21309a(new Locale[0]);

    /* JADX INFO: renamed from: a */
    public final InterfaceC20795g f66056a;

    public C20793e(InterfaceC20795g interfaceC20795g) {
        this.f66056a = interfaceC20795g;
    }

    /* JADX INFO: renamed from: a */
    public static C20793e m21309a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new C20793e(new C20796h(AbstractC0767l.m1706a(localeArr))) : new C20793e(new C20794f(localeArr));
    }

    /* JADX INFO: renamed from: b */
    public static C20793e m21310b(String str) {
        if (str == null || str.isEmpty()) {
            return f66055b;
        }
        String[] strArrSplit = str.split(Separators.COMMA, -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArrSplit[i10];
            int i11 = AbstractC20792d.f66054a;
            localeArr[i10] = Locale.forLanguageTag(str2);
        }
        return m21309a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C20793e) {
            if (this.f66056a.equals(((C20793e) obj).f66056a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f66056a.hashCode();
    }

    public final String toString() {
        return this.f66056a.toString();
    }
}
