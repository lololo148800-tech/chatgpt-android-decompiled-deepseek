package p1155zi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.h2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22013h2 {
    public static final C22009g2 Companion = new C22009g2();

    /* JADX INFO: renamed from: g */
    public static final C22013h2 f69654g = new C22013h2(0, "fake", "someone@openai.com", "+17145883326", "John Doe", null);

    /* JADX INFO: renamed from: a */
    public final String f69655a;

    /* JADX INFO: renamed from: b */
    public final String f69656b;

    /* JADX INFO: renamed from: c */
    public final String f69657c;

    /* JADX INFO: renamed from: d */
    public final String f69658d;

    /* JADX INFO: renamed from: e */
    public final String f69659e;

    /* JADX INFO: renamed from: f */
    public final int f69660f;

    public C22013h2(int i10, String id2, String str, String str2, String name, String str3) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(name, "name");
        this.f69655a = id2;
        this.f69656b = str;
        this.f69657c = str2;
        this.f69658d = name;
        this.f69659e = str3;
        this.f69660f = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22013h2)) {
            return false;
        }
        C22013h2 c22013h2 = (C22013h2) obj;
        return AbstractC16544l.m18089b(this.f69655a, c22013h2.f69655a) && AbstractC16544l.m18089b(this.f69656b, c22013h2.f69656b) && AbstractC16544l.m18089b(this.f69657c, c22013h2.f69657c) && AbstractC16544l.m18089b(this.f69658d, c22013h2.f69658d) && AbstractC16544l.m18089b(this.f69659e, c22013h2.f69659e) && this.f69660f == c22013h2.f69660f;
    }

    public final int hashCode() {
        int iHashCode = this.f69655a.hashCode() * 31;
        String str = this.f69656b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f69657c;
        int iM527p = AbstractC0168G.m527p((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f69658d);
        String str3 = this.f69659e;
        return ((iM527p + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f69660f;
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C22013h2(int i10, String str, String str2, String str3, String str4, String str5, int i11) {
        if (63 != (i10 & 63)) {
            AbstractC11153a0.m12389l(i10, 63, C22005f2.f69648a.getDescriptor());
            throw null;
        }
        this.f69655a = str;
        this.f69656b = str2;
        this.f69657c = str3;
        this.f69658d = str4;
        this.f69659e = str5;
        this.f69660f = i11;
    }
}
