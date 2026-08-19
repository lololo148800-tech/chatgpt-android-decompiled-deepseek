package p857kl;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21329w;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: kl.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C16473u {

    /* JADX INFO: renamed from: a */
    public final String f51112a;

    /* JADX INFO: renamed from: b */
    public final String f51113b;

    public C16473u(String name, String value) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(value, "value");
        this.f51112a = name;
        this.f51113b = value;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16473u) {
            C16473u c16473u = (C16473u) obj;
            if (AbstractC21329w.m21726m(c16473u.f51112a, this.f51112a) && AbstractC21329w.m21726m(c16473u.f51113b, this.f51113b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f51112a.toLowerCase(locale);
        AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f51113b.toLowerCase(locale);
        AbstractC16544l.m18093f(lowerCase2, "toLowerCase(...)");
        return lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderValueParam(name=");
        sb2.append(this.f51112a);
        sb2.append(", value=");
        return AbstractC9306j0.m9891j(this.f51113b, ", escapeValue=false)", sb2);
    }
}
