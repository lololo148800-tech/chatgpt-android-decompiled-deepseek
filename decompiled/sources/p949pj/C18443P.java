package p949pj;

import android.gov.nist.core.Separators;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.C21319m;
import p571X9.AbstractC9306j0;
import p658b5.p659zh.MMVKXkcLpuHFDi;

/* JADX INFO: renamed from: pj.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C18443P {

    /* JADX INFO: renamed from: p */
    public static final C21319m f58840p = new C21319m("([A|C|I][A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]{9})([0-9]{1})([A-Z0-9<]{15})");

    /* JADX INFO: renamed from: q */
    public static final C21319m f58841q = new C21319m("([0-9]{6})([0-9]{1})([M|F|X|<]{1})([0-9]{6})([0-9]{1})([A-Z]{3})([A-Z0-9<]{11})([0-9]{1})");

    /* JADX INFO: renamed from: r */
    public static final C21319m f58842r = new C21319m("([A-Z0-9<]+?)<<([A-Z0-9<]+?)<<+");

    /* JADX INFO: renamed from: s */
    public static final C21319m f58843s;

    /* JADX INFO: renamed from: t */
    public static final C21319m f58844t;

    /* JADX INFO: renamed from: a */
    public final String f58845a;

    /* JADX INFO: renamed from: b */
    public final String f58846b;

    /* JADX INFO: renamed from: c */
    public final String f58847c;

    /* JADX INFO: renamed from: d */
    public final String f58848d;

    /* JADX INFO: renamed from: e */
    public final String f58849e;

    /* JADX INFO: renamed from: f */
    public final String f58850f;

    /* JADX INFO: renamed from: g */
    public final String f58851g;

    /* JADX INFO: renamed from: h */
    public final String f58852h;

    /* JADX INFO: renamed from: i */
    public final String f58853i;

    /* JADX INFO: renamed from: j */
    public final String f58854j;

    /* JADX INFO: renamed from: k */
    public final String f58855k;

    /* JADX INFO: renamed from: l */
    public final Date f58856l;

    /* JADX INFO: renamed from: m */
    public final Date f58857m;

    /* JADX INFO: renamed from: n */
    public final Date f58858n;

    /* JADX INFO: renamed from: o */
    public final String f58859o;

    static {
        AbstractC16544l.m18093f(Pattern.compile("([A|C|I][A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]{31})"), "compile(...)");
        AbstractC16544l.m18093f(Pattern.compile("([A-Z0-9<]{9})([0-9]{1})([A-Z]{3})([0-9]{6})([0-9]{1})([M|F|X|<]{1})([0-9]{6})([0-9]{1})([A-Z0-9<]{7})([0-9]{1})"), "compile(...)");
        AbstractC16544l.m18093f(Pattern.compile("(P[A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]+?<<+)"), "compile(...)");
        f58843s = new C21319m("(P[A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]+?)<<([A-Z0-9<]+<<+)");
        f58844t = new C21319m("([A-Z0-9<]{9})([0-9]{1})([A-Z]{3})([0-9]{6})([0-9]{1})([M|F|X|<]{1})([0-9]{6})([0-9]{1})?([A-Z0-9<]{14})?([0-9]{1})?([0-9]{1})?");
    }

    public C18443P(String rawText, String str, String str2, String str3, String str4, Date date, Date date2, String str5) {
        AbstractC16544l.m18094g(rawText, "rawText");
        this.f58845a = rawText;
        this.f58846b = null;
        this.f58847c = str;
        this.f58848d = null;
        this.f58849e = str2;
        this.f58850f = str3;
        this.f58851g = null;
        this.f58852h = null;
        this.f58853i = null;
        this.f58854j = null;
        this.f58855k = str4;
        this.f58856l = null;
        this.f58857m = date;
        this.f58858n = date2;
        this.f58859o = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18443P)) {
            return false;
        }
        C18443P c18443p = (C18443P) obj;
        return AbstractC16544l.m18089b(this.f58845a, c18443p.f58845a) && AbstractC16544l.m18089b(this.f58846b, c18443p.f58846b) && AbstractC16544l.m18089b(this.f58847c, c18443p.f58847c) && AbstractC16544l.m18089b(this.f58848d, c18443p.f58848d) && AbstractC16544l.m18089b(this.f58849e, c18443p.f58849e) && AbstractC16544l.m18089b(this.f58850f, c18443p.f58850f) && AbstractC16544l.m18089b(this.f58851g, c18443p.f58851g) && AbstractC16544l.m18089b(this.f58852h, c18443p.f58852h) && AbstractC16544l.m18089b(this.f58853i, c18443p.f58853i) && AbstractC16544l.m18089b(this.f58854j, c18443p.f58854j) && AbstractC16544l.m18089b(this.f58855k, c18443p.f58855k) && AbstractC16544l.m18089b(this.f58856l, c18443p.f58856l) && AbstractC16544l.m18089b(this.f58857m, c18443p.f58857m) && AbstractC16544l.m18089b(this.f58858n, c18443p.f58858n) && AbstractC16544l.m18089b(this.f58859o, c18443p.f58859o);
    }

    public final int hashCode() {
        int iHashCode = this.f58845a.hashCode() * 31;
        String str = this.f58846b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f58847c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f58848d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f58849e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f58850f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f58851g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f58852h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f58853i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f58854j;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f58855k;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Date date = this.f58856l;
        int iHashCode12 = (iHashCode11 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f58857m;
        int iHashCode13 = (iHashCode12 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.f58858n;
        int iHashCode14 = (iHashCode13 + (date3 == null ? 0 : date3.hashCode())) * 31;
        String str11 = this.f58859o;
        return iHashCode14 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MrzExtraction(rawText=");
        sb2.append(this.f58845a);
        sb2.append(", idClass=");
        sb2.append(this.f58846b);
        sb2.append(", nameFirst=");
        sb2.append(this.f58847c);
        sb2.append(MMVKXkcLpuHFDi.wMuzZQ);
        sb2.append(this.f58848d);
        sb2.append(", nameLast=");
        sb2.append(this.f58849e);
        sb2.append(", sex=");
        sb2.append(this.f58850f);
        sb2.append(", addressStreet1=");
        sb2.append(this.f58851g);
        sb2.append(", addressCity=");
        sb2.append(this.f58852h);
        sb2.append(", addressState=");
        sb2.append(this.f58853i);
        sb2.append(", addressPostalCode=");
        sb2.append(this.f58854j);
        sb2.append(", identificationNumber=");
        sb2.append(this.f58855k);
        sb2.append(", issueDate=");
        sb2.append(this.f58856l);
        sb2.append(", expirationDate=");
        sb2.append(this.f58857m);
        sb2.append(", birthdate=");
        sb2.append(this.f58858n);
        sb2.append(", issuingCountry=");
        return AbstractC9306j0.m9891j(this.f58859o, Separators.RPAREN, sb2);
    }
}
