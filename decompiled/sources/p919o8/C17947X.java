package p919o8;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p138F8.vJO.anhfj;
import p775h2.AbstractC14376f;
import p806ia.nJAW.FpwNpGDhomXHZ;

/* JADX INFO: renamed from: o8.X */
/* JADX INFO: loaded from: classes.dex */
public final class C17947X {

    /* JADX INFO: renamed from: a */
    public final String f57255a;

    /* JADX INFO: renamed from: b */
    public final String f57256b;

    /* JADX INFO: renamed from: c */
    public final int f57257c;

    /* JADX INFO: renamed from: d */
    public final String f57258d;

    /* JADX INFO: renamed from: e */
    public final List f57259e;

    /* JADX INFO: renamed from: f */
    public final Boolean f57260f;

    /* JADX INFO: renamed from: g */
    public final String f57261g;

    /* JADX INFO: renamed from: h */
    public final String f57262h;

    /* JADX INFO: renamed from: i */
    public final int f57263i;

    /* JADX INFO: renamed from: j */
    public final int f57264j;

    /* JADX INFO: renamed from: k */
    public final String f57265k;

    /* JADX INFO: renamed from: l */
    public final int f57266l;

    /* JADX INFO: renamed from: m */
    public final C17969f0 f57267m;

    /* JADX INFO: renamed from: n */
    public final List f57268n;

    /* JADX INFO: renamed from: o */
    public final List f57269o;

    /* JADX INFO: renamed from: p */
    public final Boolean f57270p;

    /* JADX INFO: renamed from: q */
    public final C17957b0 f57271q;

    /* JADX INFO: renamed from: r */
    public final Long f57272r;

    public /* synthetic */ C17947X(String str, int i10, String str2, Boolean bool, String str3, String str4, int i11, int i12, C17969f0 c17969f0, ArrayList arrayList, Long l4, int i13) {
        this(null, str, i10, str2, null, bool, (i13 & 64) != 0 ? null : str3, str4, i11, 0, null, i12, (i13 & 4096) != 0 ? null : c17969f0, (i13 & 8192) != 0 ? null : arrayList, null, null, null, (i13 & 131072) != 0 ? null : l4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17947X)) {
            return false;
        }
        C17947X c17947x = (C17947X) obj;
        return AbstractC16544l.m18089b(this.f57255a, c17947x.f57255a) && AbstractC16544l.m18089b(this.f57256b, c17947x.f57256b) && this.f57257c == c17947x.f57257c && AbstractC16544l.m18089b(this.f57258d, c17947x.f57258d) && AbstractC16544l.m18089b(this.f57259e, c17947x.f57259e) && AbstractC16544l.m18089b(this.f57260f, c17947x.f57260f) && AbstractC16544l.m18089b(this.f57261g, c17947x.f57261g) && AbstractC16544l.m18089b(this.f57262h, c17947x.f57262h) && this.f57263i == c17947x.f57263i && this.f57264j == c17947x.f57264j && AbstractC16544l.m18089b(this.f57265k, c17947x.f57265k) && this.f57266l == c17947x.f57266l && AbstractC16544l.m18089b(this.f57267m, c17947x.f57267m) && AbstractC16544l.m18089b(this.f57268n, c17947x.f57268n) && AbstractC16544l.m18089b(this.f57269o, c17947x.f57269o) && AbstractC16544l.m18089b(this.f57270p, c17947x.f57270p) && AbstractC16544l.m18089b(this.f57271q, c17947x.f57271q) && AbstractC16544l.m18089b(this.f57272r, c17947x.f57272r);
    }

    public final int hashCode() {
        String str = this.f57255a;
        int iM13820k = AbstractC12107L1.m13820k(this.f57257c, AbstractC0168G.m527p((str == null ? 0 : str.hashCode()) * 31, 31, this.f57256b), 31);
        String str2 = this.f57258d;
        int iHashCode = (iM13820k + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f57259e;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f57260f;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f57261g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f57262h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        int i10 = this.f57263i;
        int iM24h = (iHashCode5 + (i10 == 0 ? 0 : AbstractC0010F.m24h(i10))) * 31;
        int i11 = this.f57264j;
        int iM24h2 = (iM24h + (i11 == 0 ? 0 : AbstractC0010F.m24h(i11))) * 31;
        String str5 = this.f57265k;
        int iHashCode6 = (iM24h2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        int i12 = this.f57266l;
        int iM24h3 = (iHashCode6 + (i12 == 0 ? 0 : AbstractC0010F.m24h(i12))) * 31;
        C17969f0 c17969f0 = this.f57267m;
        int iHashCode7 = (iM24h3 + (c17969f0 == null ? 0 : c17969f0.hashCode())) * 31;
        List list2 = this.f57268n;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f57269o;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool2 = this.f57270p;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C17957b0 c17957b0 = this.f57271q;
        int iHashCode11 = (iHashCode10 + (c17957b0 == null ? 0 : c17957b0.hashCode())) * 31;
        Long l4 = this.f57272r;
        return iHashCode11 + (l4 != null ? l4.hashCode() : 0);
    }

    public C17947X(String str, String message, int i10, String str2, List list, Boolean bool, String str3, String str4, int i11, int i12, String str5, int i13, C17969f0 c17969f0, List list2, List list3, Boolean bool2, C17957b0 c17957b0, Long l4) {
        AbstractC16544l.m18094g(message, "message");
        AbstractC14376f.m15825D(i10, "source");
        this.f57255a = str;
        this.f57256b = message;
        this.f57257c = i10;
        this.f57258d = str2;
        this.f57259e = list;
        this.f57260f = bool;
        this.f57261g = str3;
        this.f57262h = str4;
        this.f57263i = i11;
        this.f57264j = i12;
        this.f57265k = str5;
        this.f57266l = i13;
        this.f57267m = c17969f0;
        this.f57268n = list2;
        this.f57269o = list3;
        this.f57270p = bool2;
        this.f57271q = c17957b0;
        this.f57272r = l4;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder("Error(id=");
        sb2.append(this.f57255a);
        sb2.append(", message=");
        sb2.append(this.f57256b);
        sb2.append(", source=");
        sb2.append(AbstractC17962d.m19617H(this.f57257c));
        sb2.append(", stack=");
        sb2.append(this.f57258d);
        sb2.append(", causes=");
        sb2.append(this.f57259e);
        sb2.append(anhfj.YUqfgTUsYAE);
        sb2.append(this.f57260f);
        sb2.append(", fingerprint=");
        sb2.append(this.f57261g);
        sb2.append(", type=");
        sb2.append(this.f57262h);
        sb2.append(", category=");
        int i10 = this.f57263i;
        if (i10 == 1) {
            str = "ANR";
        } else if (i10 == 2) {
            str = "APP_HANG";
        } else if (i10 == 3) {
            str = "EXCEPTION";
        } else if (i10 != 4) {
            str = i10 != 5 ? "null" : "MEMORY_WARNING";
        } else {
            str = "WATCHDOG_TERMINATION";
        }
        sb2.append(str);
        sb2.append(", handling=");
        int i11 = this.f57264j;
        if (i11 != 1) {
            str2 = i11 != 2 ? "null" : "UNHANDLED";
        } else {
            str2 = "HANDLED";
        }
        sb2.append(str2);
        sb2.append(", handlingStack=");
        sb2.append(this.f57265k);
        sb2.append(", sourceType=");
        switch (this.f57266l) {
            case 1:
                str3 = "ANDROID";
                break;
            case 2:
                str3 = "BROWSER";
                break;
            case 3:
                str3 = "IOS";
                break;
            case 4:
                str3 = "REACT_NATIVE";
                break;
            case 5:
                str3 = "FLUTTER";
                break;
            case 6:
                str3 = "ROKU";
                break;
            case 7:
                str3 = FpwNpGDhomXHZ.wFfsMWBZK;
                break;
            case 8:
                str3 = "IOS_IL2CPP";
                break;
            case 9:
                str3 = "NDK_IL2CPP";
                break;
            default:
                str3 = "null";
                break;
        }
        sb2.append(str3);
        sb2.append(", resource=");
        sb2.append(this.f57267m);
        sb2.append(", threads=");
        sb2.append(this.f57268n);
        sb2.append(", binaryImages=");
        sb2.append(this.f57269o);
        sb2.append(", wasTruncated=");
        sb2.append(this.f57270p);
        sb2.append(", meta=");
        sb2.append(this.f57271q);
        sb2.append(", timeSinceAppStart=");
        sb2.append(this.f57272r);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
