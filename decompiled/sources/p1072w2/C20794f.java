package p1072w2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: w2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C20794f implements InterfaceC20795g {

    /* JADX INFO: renamed from: c */
    public static final Locale[] f66057c = new Locale[0];

    /* JADX INFO: renamed from: a */
    public final Locale[] f66058a;

    /* JADX INFO: renamed from: b */
    public final String f66059b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(strArrSplit[0]);
        }
    }

    public C20794f(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f66058a = f66057c;
            this.f66059b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale == null) {
                throw new NullPointerException(AbstractC0010F.m19c(i10, "list[", "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb2.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb2.append('-');
                    sb2.append(locale2.getCountry());
                }
                if (i10 < localeArr.length - 1) {
                    sb2.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f66058a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f66059b = sb2.toString();
    }

    @Override // p1072w2.InterfaceC20795g
    /* JADX INFO: renamed from: a */
    public final String mo21311a() {
        return this.f66059b;
    }

    @Override // p1072w2.InterfaceC20795g
    /* JADX INFO: renamed from: b */
    public final Object mo21312b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C20794f)) {
            return false;
        }
        Locale[] localeArr = ((C20794f) obj).f66058a;
        Locale[] localeArr2 = this.f66058a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < localeArr2.length; i10++) {
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // p1072w2.InterfaceC20795g
    public final Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f66058a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f66058a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // p1072w2.InterfaceC20795g
    public final boolean isEmpty() {
        return this.f66058a.length == 0;
    }

    @Override // p1072w2.InterfaceC20795g
    public final int size() {
        return this.f66058a.length;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f66058a;
            if (i10 >= localeArr.length) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(localeArr[i10]);
            if (i10 < localeArr.length - 1) {
                sb2.append(',');
            }
            i10++;
        }
    }
}
