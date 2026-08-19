package p010A8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: A8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0400c {

    /* JADX INFO: renamed from: a */
    public final String f1329a;

    /* JADX INFO: renamed from: b */
    public final C0398a f1330b;

    /* JADX INFO: renamed from: c */
    public final C0404g f1331c;

    /* JADX INFO: renamed from: d */
    public final C0408k f1332d;

    public C0400c(String str, C0398a c0398a, C0404g c0404g, C0408k c0408k) {
        this.f1329a = str;
        this.f1330b = c0398a;
        this.f1331c = c0404g;
        this.f1332d = c0408k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0400c)) {
            return false;
        }
        C0400c c0400c = (C0400c) obj;
        return AbstractC16544l.m18089b(this.f1329a, c0400c.f1329a) && AbstractC16544l.m18089b(this.f1330b, c0400c.f1330b) && AbstractC16544l.m18089b(this.f1331c, c0400c.f1331c) && AbstractC16544l.m18089b(this.f1332d, c0400c.f1332d);
    }

    public final int hashCode() {
        String str = this.f1329a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C0398a c0398a = this.f1330b;
        int iHashCode2 = (iHashCode + (c0398a == null ? 0 : c0398a.hashCode())) * 31;
        C0404g c0404g = this.f1331c;
        int iHashCode3 = (iHashCode2 + (c0404g == null ? 0 : c0404g.hashCode())) * 31;
        C0408k c0408k = this.f1332d;
        return iHashCode3 + (c0408k != null ? c0408k.hashCode() : 0);
    }

    public final String toString() {
        return "Dd(source=" + this.f1329a + ", application=" + this.f1330b + ", session=" + this.f1331c + ", view=" + this.f1332d + Separators.RPAREN;
    }
}
