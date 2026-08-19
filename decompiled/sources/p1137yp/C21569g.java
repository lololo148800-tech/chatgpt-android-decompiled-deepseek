package p1137yp;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8192s6;

/* JADX INFO: renamed from: yp.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C21569g {

    /* JADX INFO: renamed from: a */
    public final String f68297a;

    /* JADX INFO: renamed from: b */
    public final char f68298b;

    /* JADX INFO: renamed from: c */
    public final AbstractC8192s6 f68299c;

    public C21569g(String str, char c9, AbstractC8192s6 abstractC8192s6) {
        this.f68297a = str;
        this.f68298b = c9;
        this.f68299c = abstractC8192s6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21569g)) {
            return false;
        }
        C21569g c21569g = (C21569g) obj;
        return AbstractC16544l.m18089b(this.f68297a, c21569g.f68297a) && this.f68298b == c21569g.f68298b && AbstractC16544l.m18089b(this.f68299c, c21569g.f68299c);
    }

    public final int hashCode() {
        return this.f68299c.hashCode() + (((this.f68297a.hashCode() * 31) + this.f68298b) * 31);
    }

    public final String toString() {
        return "TrimArguments(text=" + this.f68297a + ", char=" + this.f68298b + ", mode=" + this.f68299c + Separators.RPAREN;
    }
}
