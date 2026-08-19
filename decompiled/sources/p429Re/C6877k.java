package p429Re;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p204I1.C3590f;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Re.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C6877k {

    /* JADX INFO: renamed from: a */
    public final String f22052a;

    /* JADX INFO: renamed from: b */
    public final String f22053b;

    /* JADX INFO: renamed from: c */
    public final String f22054c;

    /* JADX INFO: renamed from: d */
    public final C3590f f22055d;

    /* JADX INFO: renamed from: e */
    public final List f22056e;

    /* JADX INFO: renamed from: f */
    public final C6875i f22057f;

    /* JADX INFO: renamed from: g */
    public final String f22058g;

    /* JADX INFO: renamed from: h */
    public final String f22059h;

    /* JADX INFO: renamed from: i */
    public final boolean f22060i;

    public C6877k(String str, String str2, C3590f c3590f, List list, C6875i c6875i, String cta, String str3, int i10) {
        str2 = (i10 & 4) != 0 ? null : str2;
        c3590f = (i10 & 8) != 0 ? null : c3590f;
        c6875i = (i10 & 32) != 0 ? null : c6875i;
        str3 = (i10 & 128) != 0 ? null : str3;
        boolean z6 = (i10 & 256) != 0;
        AbstractC16544l.m18094g(cta, "cta");
        this.f22052a = str;
        this.f22053b = null;
        this.f22054c = str2;
        this.f22055d = c3590f;
        this.f22056e = list;
        this.f22057f = c6875i;
        this.f22058g = cta;
        this.f22059h = str3;
        this.f22060i = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6877k)) {
            return false;
        }
        C6877k c6877k = (C6877k) obj;
        return AbstractC16544l.m18089b(this.f22052a, c6877k.f22052a) && AbstractC16544l.m18089b(this.f22053b, c6877k.f22053b) && AbstractC16544l.m18089b(this.f22054c, c6877k.f22054c) && AbstractC16544l.m18089b(this.f22055d, c6877k.f22055d) && AbstractC16544l.m18089b(this.f22056e, c6877k.f22056e) && AbstractC16544l.m18089b(this.f22057f, c6877k.f22057f) && AbstractC16544l.m18089b(this.f22058g, c6877k.f22058g) && AbstractC16544l.m18089b(this.f22059h, c6877k.f22059h) && this.f22060i == c6877k.f22060i;
    }

    public final int hashCode() {
        String str = this.f22052a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f22053b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f22054c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C3590f c3590f = this.f22055d;
        int iM15858x = AbstractC14376f.m15858x(this.f22056e, (iHashCode3 + (c3590f == null ? 0 : c3590f.hashCode())) * 31, 31);
        C6875i c6875i = this.f22057f;
        int iM527p = AbstractC0168G.m527p((iM15858x + (c6875i == null ? 0 : c6875i.hashCode())) * 31, 31, this.f22058g);
        String str4 = this.f22059h;
        return ((iM527p + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.f22060i ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
