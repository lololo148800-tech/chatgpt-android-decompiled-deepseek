package p623Zf;

import ao.C11158d;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p102Dm.AbstractC2119a;
import p324Mn.C5554x;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p872lg.C16944d;
import p872lg.EnumC16949i;
import p909nm.C17689w;

/* JADX INFO: renamed from: Zf.w */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10327w {
    public static final C10326v Companion = new C10326v();

    /* JADX INFO: renamed from: l */
    public static final KSerializer[] f30643l = {null, null, null, null, null, null, null, null, new C11158d(C16944d.f54393a, 0), null, EnumC16949i.Companion.serializer()};

    /* JADX INFO: renamed from: m */
    public static final C10327w f30644m = new C10327w((String) null, (String) null, false, (String) null, false, false, (String) null, (C5554x) null, (List) null, (String) null, (EnumC16949i) null, 2047);

    /* JADX INFO: renamed from: a */
    public final String f30645a;

    /* JADX INFO: renamed from: b */
    public final String f30646b;

    /* JADX INFO: renamed from: c */
    public final boolean f30647c;

    /* JADX INFO: renamed from: d */
    public final String f30648d;

    /* JADX INFO: renamed from: e */
    public final boolean f30649e;

    /* JADX INFO: renamed from: f */
    public final boolean f30650f;

    /* JADX INFO: renamed from: g */
    public final String f30651g;

    /* JADX INFO: renamed from: h */
    public final C5554x f30652h;

    /* JADX INFO: renamed from: i */
    public final List f30653i;

    /* JADX INFO: renamed from: j */
    public final String f30654j;

    /* JADX INFO: renamed from: k */
    public final EnumC16949i f30655k;

    public /* synthetic */ C10327w(int i10, String str, String str2, boolean z6, String str3, boolean z10, boolean z11, String str4, C5554x c5554x, List list, String str5, EnumC16949i enumC16949i) {
        if ((i10 & 1) == 0) {
            this.f30645a = null;
        } else {
            this.f30645a = str;
        }
        if ((i10 & 2) == 0) {
            this.f30646b = null;
        } else {
            this.f30646b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f30647c = false;
        } else {
            this.f30647c = z6;
        }
        if ((i10 & 8) == 0) {
            this.f30648d = null;
        } else {
            this.f30648d = str3;
        }
        if ((i10 & 16) == 0) {
            this.f30649e = false;
        } else {
            this.f30649e = z10;
        }
        if ((i10 & 32) == 0) {
            this.f30650f = false;
        } else {
            this.f30650f = z11;
        }
        if ((i10 & 64) == 0) {
            String country = Locale.getDefault().getCountry();
            AbstractC16544l.m18093f(country, "getCountry(...)");
            this.f30651g = country;
        } else {
            this.f30651g = str4;
        }
        if ((i10 & 128) == 0) {
            this.f30652h = AbstractC2119a.m3193g();
        } else {
            this.f30652h = c5554x;
        }
        if ((i10 & 256) == 0) {
            this.f30653i = C17689w.f56480Y;
        } else {
            this.f30653i = list;
        }
        if ((i10 & 512) == 0) {
            this.f30654j = null;
        } else {
            this.f30654j = str5;
        }
        if ((i10 & 1024) == 0) {
            this.f30655k = EnumC16949i.f54401o0;
        } else {
            this.f30655k = enumC16949i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C10327w m10883a(C10327w c10327w, boolean z6, String str, EnumC16949i enumC16949i, int i10) {
        String str2 = c10327w.f30645a;
        String str3 = c10327w.f30646b;
        boolean z10 = c10327w.f30647c;
        String str4 = c10327w.f30648d;
        boolean z11 = (i10 & 16) != 0 ? c10327w.f30649e : z6;
        boolean z12 = c10327w.f30650f;
        String defaultCountry = c10327w.f30651g;
        C5554x maxBirthDate = c10327w.f30652h;
        List countries = c10327w.f30653i;
        String str5 = (i10 & 512) != 0 ? c10327w.f30654j : str;
        EnumC16949i inquiryStatus = (i10 & 1024) != 0 ? c10327w.f30655k : enumC16949i;
        c10327w.getClass();
        AbstractC16544l.m18094g(defaultCountry, "defaultCountry");
        AbstractC16544l.m18094g(maxBirthDate, "maxBirthDate");
        AbstractC16544l.m18094g(countries, "countries");
        AbstractC16544l.m18094g(inquiryStatus, "inquiryStatus");
        return new C10327w(str2, str3, z10, str4, z11, z12, defaultCountry, maxBirthDate, countries, str5, inquiryStatus);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10327w)) {
            return false;
        }
        C10327w c10327w = (C10327w) obj;
        return AbstractC16544l.m18089b(this.f30645a, c10327w.f30645a) && AbstractC16544l.m18089b(this.f30646b, c10327w.f30646b) && this.f30647c == c10327w.f30647c && AbstractC16544l.m18089b(this.f30648d, c10327w.f30648d) && this.f30649e == c10327w.f30649e && this.f30650f == c10327w.f30650f && AbstractC16544l.m18089b(this.f30651g, c10327w.f30651g) && AbstractC16544l.m18089b(this.f30652h, c10327w.f30652h) && AbstractC16544l.m18089b(this.f30653i, c10327w.f30653i) && AbstractC16544l.m18089b(this.f30654j, c10327w.f30654j) && this.f30655k == c10327w.f30655k;
    }

    public final int hashCode() {
        String str = this.f30645a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f30646b;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.f30647c ? 1231 : 1237)) * 31;
        String str3 = this.f30648d;
        int iM15858x = AbstractC14376f.m15858x(this.f30653i, (this.f30652h.f18006Y.hashCode() + AbstractC0168G.m527p((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + (this.f30649e ? 1231 : 1237)) * 31) + (this.f30650f ? 1231 : 1237)) * 31, 31, this.f30651g)) * 31, 31);
        String str4 = this.f30654j;
        return this.f30655k.hashCode() + ((iM15858x + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C10327w(String str, String str2, boolean z6, String str3, boolean z10, boolean z11, String defaultCountry, C5554x maxBirthDate, List countries, String str4, EnumC16949i inquiryStatus) {
        AbstractC16544l.m18094g(defaultCountry, "defaultCountry");
        AbstractC16544l.m18094g(maxBirthDate, "maxBirthDate");
        AbstractC16544l.m18094g(countries, "countries");
        AbstractC16544l.m18094g(inquiryStatus, "inquiryStatus");
        this.f30645a = str;
        this.f30646b = str2;
        this.f30647c = z6;
        this.f30648d = str3;
        this.f30649e = z10;
        this.f30650f = z11;
        this.f30651g = defaultCountry;
        this.f30652h = maxBirthDate;
        this.f30653i = countries;
        this.f30654j = str4;
        this.f30655k = inquiryStatus;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C10327w(String str, String str2, boolean z6, String str3, boolean z10, boolean z11, String str4, C5554x c5554x, List list, String str5, EnumC16949i enumC16949i, int i10) {
        String country;
        String str6 = (i10 & 1) != 0 ? null : str;
        String str7 = (i10 & 2) != 0 ? null : str2;
        boolean z12 = (i10 & 4) != 0 ? false : z6;
        String str8 = (i10 & 8) != 0 ? null : str3;
        boolean z13 = (i10 & 16) != 0 ? false : z10;
        boolean z14 = (i10 & 32) == 0 ? z11 : false;
        if ((i10 & 64) != 0) {
            country = Locale.getDefault().getCountry();
            AbstractC16544l.m18093f(country, "getCountry(...)");
        } else {
            country = str4;
        }
        this(str6, str7, z12, str8, z13, z14, country, (i10 & 128) != 0 ? AbstractC2119a.m3193g() : c5554x, (i10 & 256) != 0 ? C17689w.f56480Y : list, (i10 & 512) == 0 ? str5 : null, (i10 & 1024) != 0 ? EnumC16949i.f54401o0 : enumC16949i);
    }
}
