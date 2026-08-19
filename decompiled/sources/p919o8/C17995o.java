package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.o */
/* JADX INFO: loaded from: classes.dex */
public final class C17995o {

    /* JADX INFO: renamed from: a */
    public final C18004r f57464a;

    /* JADX INFO: renamed from: b */
    public final C17977i f57465b;

    /* JADX INFO: renamed from: c */
    public final String f57466c;

    /* JADX INFO: renamed from: d */
    public final C17998p f57467d;

    public C17995o(C18004r c18004r, C17977i c17977i, String str, C17998p c17998p) {
        this.f57464a = c18004r;
        this.f57465b = c17977i;
        this.f57466c = str;
        this.f57467d = c17998p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17995o)) {
            return false;
        }
        C17995o c17995o = (C17995o) obj;
        return AbstractC16544l.m18089b(this.f57464a, c17995o.f57464a) && AbstractC16544l.m18089b(this.f57465b, c17995o.f57465b) && AbstractC16544l.m18089b(this.f57466c, c17995o.f57466c) && AbstractC16544l.m18089b(this.f57467d, c17995o.f57467d);
    }

    public final int hashCode() {
        C18004r c18004r = this.f57464a;
        int iHashCode = (c18004r == null ? 0 : c18004r.hashCode()) * 31;
        C17977i c17977i = this.f57465b;
        int iHashCode2 = (iHashCode + (c17977i == null ? 0 : c17977i.hashCode())) * 31;
        String str = this.f57466c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C17998p c17998p = this.f57467d;
        return iHashCode3 + (c17998p != null ? c17998p.hashCode() : 0);
    }

    public final String toString() {
        return "Dd(session=" + this.f57464a + ", configuration=" + this.f57465b + ", browserSdkVersion=" + this.f57466c + ", action=" + this.f57467d + Separators.RPAREN;
    }
}
