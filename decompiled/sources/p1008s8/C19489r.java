package p1008s8;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p160G5.p161rK.TVCuK;
import p315Me.Myis.CxcULo;
import p775h2.AbstractC14376f;
import p849k7.C16361n;

/* JADX INFO: renamed from: s8.r */
/* JADX INFO: loaded from: classes.dex */
public final class C19489r {

    /* JADX INFO: renamed from: a */
    public final C16361n f61907a;

    /* JADX INFO: renamed from: b */
    public final long f61908b;

    /* JADX INFO: renamed from: c */
    public final String f61909c;

    /* JADX INFO: renamed from: d */
    public final int f61910d;

    /* JADX INFO: renamed from: e */
    public final String f61911e;

    /* JADX INFO: renamed from: f */
    public final C19483l f61912f;

    /* JADX INFO: renamed from: g */
    public final C19486o f61913g;

    /* JADX INFO: renamed from: h */
    public final C19488q f61914h;

    /* JADX INFO: renamed from: i */
    public final C19482k f61915i;

    /* JADX INFO: renamed from: j */
    public final List f61916j;

    /* JADX INFO: renamed from: k */
    public final C19487p f61917k;

    public C19489r(C16361n c16361n, long j10, String str, int i10, String version, C19483l c19483l, C19486o c19486o, C19488q c19488q, C19482k c19482k, List list, C19487p c19487p) {
        AbstractC14376f.m15825D(i10, "source");
        AbstractC16544l.m18094g(version, "version");
        this.f61907a = c16361n;
        this.f61908b = j10;
        this.f61909c = str;
        this.f61910d = i10;
        this.f61911e = version;
        this.f61912f = c19483l;
        this.f61913g = c19486o;
        this.f61914h = c19488q;
        this.f61915i = c19482k;
        this.f61916j = list;
        this.f61917k = c19487p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19489r)) {
            return false;
        }
        C19489r c19489r = (C19489r) obj;
        return this.f61907a.equals(c19489r.f61907a) && this.f61908b == c19489r.f61908b && this.f61909c.equals(c19489r.f61909c) && this.f61910d == c19489r.f61910d && AbstractC16544l.m18089b(this.f61911e, c19489r.f61911e) && AbstractC16544l.m18089b(this.f61912f, c19489r.f61912f) && AbstractC16544l.m18089b(this.f61913g, c19489r.f61913g) && AbstractC16544l.m18089b(this.f61914h, c19489r.f61914h) && AbstractC16544l.m18089b(this.f61915i, c19489r.f61915i) && AbstractC16544l.m18089b(this.f61916j, c19489r.f61916j) && this.f61917k.equals(c19489r.f61917k);
    }

    public final int hashCode() {
        int iHashCode = this.f61907a.hashCode() * 31;
        long j10 = this.f61908b;
        int iM527p = AbstractC0168G.m527p(AbstractC12107L1.m13820k(this.f61910d, AbstractC0168G.m527p((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31, this.f61909c), 31), 31, this.f61911e);
        C19483l c19483l = this.f61912f;
        int iHashCode2 = (iM527p + (c19483l == null ? 0 : c19483l.f61893a.hashCode())) * 31;
        C19486o c19486o = this.f61913g;
        int iHashCode3 = (iHashCode2 + (c19486o == null ? 0 : c19486o.f61900a.hashCode())) * 31;
        C19488q c19488q = this.f61914h;
        int iHashCode4 = (iHashCode3 + (c19488q == null ? 0 : c19488q.f61906a.hashCode())) * 31;
        C19482k c19482k = this.f61915i;
        int iHashCode5 = (iHashCode4 + (c19482k == null ? 0 : c19482k.f61892a.hashCode())) * 31;
        List list = this.f61916j;
        return this.f61917k.hashCode() + ((iHashCode5 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TelemetryDebugEvent(dd=");
        sb2.append(this.f61907a);
        sb2.append(", date=");
        sb2.append(this.f61908b);
        sb2.append(", service=");
        sb2.append(this.f61909c);
        sb2.append(", source=");
        switch (this.f61910d) {
            case 1:
                str = "ANDROID";
                break;
            case 2:
                str = "IOS";
                break;
            case 3:
                str = "BROWSER";
                break;
            case 4:
                str = "FLUTTER";
                break;
            case 5:
                str = "REACT_NATIVE";
                break;
            case 6:
                str = TVCuK.eusJrybdd;
                break;
            case 7:
                str = "KOTLIN_MULTIPLATFORM";
                break;
            default:
                str = CxcULo.foLUt;
                break;
        }
        sb2.append(str);
        sb2.append(", version=");
        sb2.append(this.f61911e);
        sb2.append(", application=");
        sb2.append(this.f61912f);
        sb2.append(", session=");
        sb2.append(this.f61913g);
        sb2.append(", view=");
        sb2.append(this.f61914h);
        sb2.append(", action=");
        sb2.append(this.f61915i);
        sb2.append(", experimentalFeatures=");
        sb2.append(this.f61916j);
        sb2.append(", telemetry=");
        sb2.append(this.f61917k);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
