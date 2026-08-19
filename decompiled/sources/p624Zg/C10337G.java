package p624Zg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Zg.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C10337G {

    /* JADX INFO: renamed from: a */
    public final String f30669a;

    /* JADX INFO: renamed from: b */
    public final boolean f30670b;

    /* JADX INFO: renamed from: c */
    public final EnumC10335E f30671c;

    /* JADX INFO: renamed from: d */
    public final String f30672d;

    static {
        EnumC10335E enumC10335E = EnumC10335E.f30665o0;
        new C10337G("plus", false, enumC10335E, "$19.99");
        new C10337G("pro", false, enumC10335E, "$200");
    }

    public C10337G(String str, boolean z6, EnumC10335E enumC10335E, String localizedPrice) {
        AbstractC16544l.m18094g(localizedPrice, "localizedPrice");
        this.f30669a = str;
        this.f30670b = z6;
        this.f30671c = enumC10335E;
        this.f30672d = localizedPrice;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10337G)) {
            return false;
        }
        C10337G c10337g = (C10337G) obj;
        return AbstractC16544l.m18089b(this.f30669a, c10337g.f30669a) && this.f30670b == c10337g.f30670b && this.f30671c == c10337g.f30671c && AbstractC16544l.m18089b(this.f30672d, c10337g.f30672d);
    }

    public final int hashCode() {
        return this.f30672d.hashCode() + ((this.f30671c.hashCode() + (((this.f30669a.hashCode() * 31) + (this.f30670b ? 1231 : 1237)) * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
