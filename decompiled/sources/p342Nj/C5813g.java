package p342Nj;

import android.gov.nist.core.Separators;
import androidx.fragment.app.OwC.wNrQXvwLiB;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p247Jj.EnumC4458u;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Nj.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C5813g {

    /* JADX INFO: renamed from: a */
    public final String f18968a;

    /* JADX INFO: renamed from: b */
    public final String f18969b;

    /* JADX INFO: renamed from: c */
    public final String f18970c;

    /* JADX INFO: renamed from: d */
    public final EnumC4458u f18971d;

    /* JADX INFO: renamed from: e */
    public final String f18972e;

    /* JADX INFO: renamed from: f */
    public final String f18973f;

    /* JADX INFO: renamed from: g */
    public final String f18974g;

    /* JADX INFO: renamed from: h */
    public final String f18975h;

    /* JADX INFO: renamed from: i */
    public final Map f18976i;

    /* JADX INFO: renamed from: j */
    public final String f18977j;

    public C5813g(String str, String str2, String str3, EnumC4458u environment, String str4, String str5, String str6, Map map, String str7) {
        AbstractC16544l.m18094g(environment, "environment");
        this.f18968a = str;
        this.f18969b = str2;
        this.f18970c = str3;
        this.f18971d = environment;
        this.f18972e = str4;
        this.f18973f = str5;
        this.f18974g = str6;
        this.f18975h = null;
        this.f18976i = map;
        this.f18977j = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5813g)) {
            return false;
        }
        C5813g c5813g = (C5813g) obj;
        return AbstractC16544l.m18089b(this.f18968a, c5813g.f18968a) && AbstractC16544l.m18089b(this.f18969b, c5813g.f18969b) && AbstractC16544l.m18089b(this.f18970c, c5813g.f18970c) && this.f18971d == c5813g.f18971d && AbstractC16544l.m18089b(this.f18972e, c5813g.f18972e) && AbstractC16544l.m18089b(this.f18973f, c5813g.f18973f) && AbstractC16544l.m18089b(this.f18974g, c5813g.f18974g) && AbstractC16544l.m18089b(this.f18975h, c5813g.f18975h) && AbstractC16544l.m18089b(this.f18976i, c5813g.f18976i) && AbstractC16544l.m18089b(this.f18977j, c5813g.f18977j);
    }

    public final int hashCode() {
        String str = this.f18968a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18969b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18970c;
        int iHashCode3 = (this.f18971d.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f18972e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18973f;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f18974g;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f18975h;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map map = this.f18976i;
        int iHashCode8 = (iHashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        String str8 = this.f18977j;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InquiryAttributes(templateId=");
        sb2.append(this.f18968a);
        sb2.append(", templateVersion=");
        sb2.append(this.f18969b);
        sb2.append(", inquiryId=");
        sb2.append(this.f18970c);
        sb2.append(", environment=");
        sb2.append(this.f18971d);
        sb2.append(", environmentId=");
        sb2.append(this.f18972e);
        sb2.append(", accountId=");
        sb2.append(this.f18973f);
        sb2.append(", referenceId=");
        sb2.append(this.f18974g);
        sb2.append(", note=");
        sb2.append(this.f18975h);
        sb2.append(wNrQXvwLiB.tMrpWNue);
        sb2.append(this.f18976i);
        sb2.append(", themeSetId=");
        return AbstractC9306j0.m9891j(this.f18977j, Separators.RPAREN, sb2);
    }
}
