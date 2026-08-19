package p993rj;

import android.gov.nist.core.Separators;
import android.util.Range;
import android.util.Size;
import kotlin.jvm.internal.AbstractC16544l;
import p949pj.C18428A;
import p949pj.EnumC18495z;

/* JADX INFO: renamed from: rj.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C19032L {

    /* JADX INFO: renamed from: a */
    public final String f60669a;

    /* JADX INFO: renamed from: b */
    public final Size f60670b;

    /* JADX INFO: renamed from: c */
    public final double f60671c;

    /* JADX INFO: renamed from: d */
    public final Range f60672d;

    /* JADX INFO: renamed from: e */
    public final int f60673e;

    /* JADX INFO: renamed from: f */
    public final EnumC18495z f60674f;

    /* JADX INFO: renamed from: g */
    public final C19035O f60675g;

    /* JADX INFO: renamed from: h */
    public final C18428A f60676h;

    public C19032L(String str, Size size, double d10, Range range, int i10, EnumC18495z enumC18495z, C19035O c19035o) {
        this.f60669a = str;
        this.f60670b = size;
        this.f60671c = d10;
        this.f60672d = range;
        this.f60673e = i10;
        this.f60674f = enumC18495z;
        this.f60675g = c19035o;
        this.f60676h = new C18428A(str, enumC18495z, size, (int) d10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19032L)) {
            return false;
        }
        C19032L c19032l = (C19032L) obj;
        return AbstractC16544l.m18089b(this.f60669a, c19032l.f60669a) && AbstractC16544l.m18089b(this.f60670b, c19032l.f60670b) && Double.compare(this.f60671c, c19032l.f60671c) == 0 && AbstractC16544l.m18089b(this.f60672d, c19032l.f60672d) && this.f60673e == c19032l.f60673e && this.f60674f == c19032l.f60674f && AbstractC16544l.m18089b(this.f60675g, c19032l.f60675g);
    }

    public final int hashCode() {
        int iHashCode = (this.f60670b.hashCode() + (this.f60669a.hashCode() * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f60671c);
        return this.f60675g.hashCode() + ((this.f60674f.hashCode() + ((((this.f60672d.hashCode() + ((iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31)) * 31) + this.f60673e) * 31)) * 31);
    }

    public final String toString() {
        return "CameraChoice(id=" + this.f60669a + ", size=" + this.f60670b + ", maxFps=" + this.f60671c + ", targetFpsRange=" + this.f60672d + ", rotation=" + this.f60673e + ", facingMode=" + this.f60674f + ", additionalOptions=" + this.f60675g + Separators.RPAREN;
    }
}
