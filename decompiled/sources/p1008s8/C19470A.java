package p1008s8;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p775h2.AbstractC14376f;
import p867l8.C16831c;

/* JADX INFO: renamed from: s8.A */
/* JADX INFO: loaded from: classes.dex */
public final class C19470A {

    /* JADX INFO: renamed from: a */
    public final C16831c f61783a;

    /* JADX INFO: renamed from: b */
    public final long f61784b;

    /* JADX INFO: renamed from: c */
    public final String f61785c;

    /* JADX INFO: renamed from: d */
    public final int f61786d;

    /* JADX INFO: renamed from: e */
    public final String f61787e;

    /* JADX INFO: renamed from: f */
    public final C19491t f61788f;

    /* JADX INFO: renamed from: g */
    public final C19495x f61789g;

    /* JADX INFO: renamed from: h */
    public final C19497z f61790h;

    /* JADX INFO: renamed from: i */
    public final C19490s f61791i;

    /* JADX INFO: renamed from: j */
    public final List f61792j;

    /* JADX INFO: renamed from: k */
    public final C19496y f61793k;

    public C19470A(C16831c c16831c, long j10, String str, int i10, String version, C19491t c19491t, C19495x c19495x, C19497z c19497z, C19490s c19490s, List list, C19496y c19496y) {
        AbstractC14376f.m15825D(i10, "source");
        AbstractC16544l.m18094g(version, "version");
        this.f61783a = c16831c;
        this.f61784b = j10;
        this.f61785c = str;
        this.f61786d = i10;
        this.f61787e = version;
        this.f61788f = c19491t;
        this.f61789g = c19495x;
        this.f61790h = c19497z;
        this.f61791i = c19490s;
        this.f61792j = list;
        this.f61793k = c19496y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19470A)) {
            return false;
        }
        C19470A c19470a = (C19470A) obj;
        return this.f61783a.equals(c19470a.f61783a) && this.f61784b == c19470a.f61784b && this.f61785c.equals(c19470a.f61785c) && this.f61786d == c19470a.f61786d && AbstractC16544l.m18089b(this.f61787e, c19470a.f61787e) && AbstractC16544l.m18089b(this.f61788f, c19470a.f61788f) && AbstractC16544l.m18089b(this.f61789g, c19470a.f61789g) && AbstractC16544l.m18089b(this.f61790h, c19470a.f61790h) && AbstractC16544l.m18089b(this.f61791i, c19470a.f61791i) && AbstractC16544l.m18089b(this.f61792j, c19470a.f61792j) && this.f61793k.equals(c19470a.f61793k);
    }

    public final int hashCode() {
        int iHashCode = this.f61783a.hashCode() * 31;
        long j10 = this.f61784b;
        int iM527p = AbstractC0168G.m527p(AbstractC12107L1.m13820k(this.f61786d, AbstractC0168G.m527p((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31, this.f61785c), 31), 31, this.f61787e);
        C19491t c19491t = this.f61788f;
        int iHashCode2 = (iM527p + (c19491t == null ? 0 : c19491t.f61919a.hashCode())) * 31;
        C19495x c19495x = this.f61789g;
        int iHashCode3 = (iHashCode2 + (c19495x == null ? 0 : c19495x.f61928a.hashCode())) * 31;
        C19497z c19497z = this.f61790h;
        int iHashCode4 = (iHashCode3 + (c19497z == null ? 0 : c19497z.f61935a.hashCode())) * 31;
        C19490s c19490s = this.f61791i;
        int iHashCode5 = (iHashCode4 + (c19490s == null ? 0 : c19490s.f61918a.hashCode())) * 31;
        List list = this.f61792j;
        return this.f61793k.hashCode() + ((iHashCode5 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TelemetryErrorEvent(dd=");
        sb2.append(this.f61783a);
        sb2.append(", date=");
        sb2.append(this.f61784b);
        sb2.append(", service=");
        sb2.append(this.f61785c);
        sb2.append(", source=");
        switch (this.f61786d) {
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
                str = "UNITY";
                break;
            case 7:
                str = "KOTLIN_MULTIPLATFORM";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append(", version=");
        sb2.append(this.f61787e);
        sb2.append(", application=");
        sb2.append(this.f61788f);
        sb2.append(", session=");
        sb2.append(this.f61789g);
        sb2.append(", view=");
        sb2.append(this.f61790h);
        sb2.append(", action=");
        sb2.append(this.f61791i);
        sb2.append(", experimentalFeatures=");
        sb2.append(this.f61792j);
        sb2.append(", telemetry=");
        sb2.append(this.f61793k);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
