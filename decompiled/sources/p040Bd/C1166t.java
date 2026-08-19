package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.t */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1166t {
    public static final C1160s Companion = new C1160s();

    /* JADX INFO: renamed from: u */
    public static final KSerializer[] f3090u;

    /* JADX INFO: renamed from: a */
    public final String f3091a;

    /* JADX INFO: renamed from: b */
    public final String f3092b;

    /* JADX INFO: renamed from: c */
    public final String f3093c;

    /* JADX INFO: renamed from: d */
    public final double f3094d;

    /* JADX INFO: renamed from: e */
    public final double f3095e;

    /* JADX INFO: renamed from: f */
    public final String f3096f;

    /* JADX INFO: renamed from: g */
    public final String f3097g;

    /* JADX INFO: renamed from: h */
    public final String f3098h;

    /* JADX INFO: renamed from: i */
    public final String f3099i;

    /* JADX INFO: renamed from: j */
    public final String f3100j;

    /* JADX INFO: renamed from: k */
    public final List f3101k;

    /* JADX INFO: renamed from: l */
    public final Double f3102l;

    /* JADX INFO: renamed from: m */
    public final Integer f3103m;

    /* JADX INFO: renamed from: n */
    public final Integer f3104n;

    /* JADX INFO: renamed from: o */
    public final List f3105o;

    /* JADX INFO: renamed from: p */
    public final String f3106p;

    /* JADX INFO: renamed from: q */
    public final List f3107q;

    /* JADX INFO: renamed from: r */
    public final Boolean f3108r;

    /* JADX INFO: renamed from: s */
    public final C0887A f3109s;

    /* JADX INFO: renamed from: t */
    public final String f3110t;

    static {
        C11181o0 c11181o0 = C11181o0.f33827a;
        f3090u = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, new C11158d(c11181o0, 0), null, null, null, new C11158d(c11181o0, 0), null, new C11158d(C1196y.f3151a, 0), null, null, null};
    }

    public /* synthetic */ C1166t(int i10, String str, String str2, String str3, double d10, double d11, String str4, String str5, String str6, String str7, String str8, List list, Double d12, Integer num, Integer num2, List list2, String str9, List list3, Boolean bool, C0887A c0887a, String str10) {
        if (63 != (i10 & 63)) {
            AbstractC11153a0.m12389l(i10, 63, C1154r.f3076a.getDescriptor());
            throw null;
        }
        this.f3091a = str;
        this.f3092b = str2;
        this.f3093c = str3;
        this.f3094d = d10;
        this.f3095e = d11;
        this.f3096f = str4;
        if ((i10 & 64) == 0) {
            this.f3097g = null;
        } else {
            this.f3097g = str5;
        }
        if ((i10 & 128) == 0) {
            this.f3098h = null;
        } else {
            this.f3098h = str6;
        }
        if ((i10 & 256) == 0) {
            this.f3099i = null;
        } else {
            this.f3099i = str7;
        }
        if ((i10 & 512) == 0) {
            this.f3100j = null;
        } else {
            this.f3100j = str8;
        }
        if ((i10 & 1024) == 0) {
            this.f3101k = null;
        } else {
            this.f3101k = list;
        }
        if ((i10 & 2048) == 0) {
            this.f3102l = null;
        } else {
            this.f3102l = d12;
        }
        if ((i10 & 4096) == 0) {
            this.f3103m = null;
        } else {
            this.f3103m = num;
        }
        if ((i10 & 8192) == 0) {
            this.f3104n = null;
        } else {
            this.f3104n = num2;
        }
        if ((i10 & 16384) == 0) {
            this.f3105o = null;
        } else {
            this.f3105o = list2;
        }
        if ((32768 & i10) == 0) {
            this.f3106p = null;
        } else {
            this.f3106p = str9;
        }
        if ((65536 & i10) == 0) {
            this.f3107q = null;
        } else {
            this.f3107q = list3;
        }
        if ((131072 & i10) == 0) {
            this.f3108r = null;
        } else {
            this.f3108r = bool;
        }
        if ((262144 & i10) == 0) {
            this.f3109s = null;
        } else {
            this.f3109s = c0887a;
        }
        if ((i10 & 524288) == 0) {
            this.f3110t = null;
        } else {
            this.f3110t = str10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1166t)) {
            return false;
        }
        C1166t c1166t = (C1166t) obj;
        return AbstractC16544l.m18089b(this.f3091a, c1166t.f3091a) && AbstractC16544l.m18089b(this.f3092b, c1166t.f3092b) && AbstractC16544l.m18089b(this.f3093c, c1166t.f3093c) && Double.compare(this.f3094d, c1166t.f3094d) == 0 && Double.compare(this.f3095e, c1166t.f3095e) == 0 && AbstractC16544l.m18089b(this.f3096f, c1166t.f3096f) && AbstractC16544l.m18089b(this.f3097g, c1166t.f3097g) && AbstractC16544l.m18089b(this.f3098h, c1166t.f3098h) && AbstractC16544l.m18089b(this.f3099i, c1166t.f3099i) && AbstractC16544l.m18089b(this.f3100j, c1166t.f3100j) && AbstractC16544l.m18089b(this.f3101k, c1166t.f3101k) && AbstractC16544l.m18089b(this.f3102l, c1166t.f3102l) && AbstractC16544l.m18089b(this.f3103m, c1166t.f3103m) && AbstractC16544l.m18089b(this.f3104n, c1166t.f3104n) && AbstractC16544l.m18089b(this.f3105o, c1166t.f3105o) && AbstractC16544l.m18089b(this.f3106p, c1166t.f3106p) && AbstractC16544l.m18089b(this.f3107q, c1166t.f3107q) && AbstractC16544l.m18089b(this.f3108r, c1166t.f3108r) && AbstractC16544l.m18089b(this.f3109s, c1166t.f3109s) && AbstractC16544l.m18089b(this.f3110t, c1166t.f3110t);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(this.f3091a.hashCode() * 31, 31, this.f3092b), 31, this.f3093c);
        long jDoubleToLongBits = Double.doubleToLongBits(this.f3094d);
        int i10 = (iM527p + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f3095e);
        int iM527p2 = AbstractC0168G.m527p((i10 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31, 31, this.f3096f);
        String str = this.f3097g;
        int iHashCode = (iM527p2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f3098h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3099i;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f3100j;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f3101k;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Double d10 = this.f3102l;
        int iHashCode6 = (iHashCode5 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f3103m;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f3104n;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list2 = this.f3105o;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.f3106p;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list3 = this.f3107q;
        int iHashCode11 = (iHashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.f3108r;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        C0887A c0887a = this.f3109s;
        int iHashCode13 = (iHashCode12 + (c0887a == null ? 0 : c0887a.hashCode())) * 31;
        String str6 = this.f3110t;
        return iHashCode13 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C1166t(List list, List list2, C0887A c0887a) {
        Double dValueOf = Double.valueOf(8.1d);
        Boolean bool = Boolean.FALSE;
        this.f3091a = "mock";
        this.f3092b = "foursquare";
        this.f3093c = "https://foursquare.com/v/4c5502e5f5f3d13a1a7f0afb";
        this.f3094d = 37.785453d;
        this.f3095e = -122.399262d;
        this.f3096f = "Benu";
        this.f3097g = "22 Hawthorne St (at Howard St), San Francisco, CA 94105";
        this.f3098h = "A three-Michelin-starred restaurant in SoMa, Benu offers an Asian-inspired New American tasting menu crafted by chef Corey Lee.";
        this.f3099i = "turn0search17";
        this.f3100j = "https://fastly.4sqi.net/img/general/original/55994515_cUXWbuNPVQteJrdQ2zJM6QD4yCJnDZkj0mTKsws_I6s.jpg";
        this.f3101k = null;
        this.f3102l = dValueOf;
        this.f3103m = 248;
        this.f3104n = 4;
        this.f3105o = list;
        this.f3106p = "http://www.benusf.com";
        this.f3107q = list2;
        this.f3108r = bool;
        this.f3109s = c0887a;
        this.f3110t = "+14156854860";
    }
}
