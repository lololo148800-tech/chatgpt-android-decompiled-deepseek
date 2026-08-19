package p722e8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: e8.N */
/* JADX INFO: loaded from: classes.dex */
public final class C13304N {

    /* JADX INFO: renamed from: a */
    public final String f42077a;

    /* JADX INFO: renamed from: b */
    public final String f42078b;

    /* JADX INFO: renamed from: c */
    public final String f42079c;

    public C13304N(String id2, String url, String name) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(url, "url");
        AbstractC16544l.m18094g(name, "name");
        this.f42077a = id2;
        this.f42078b = url;
        this.f42079c = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13304N)) {
            return false;
        }
        C13304N c13304n = (C13304N) obj;
        return AbstractC16544l.m18089b(this.f42077a, c13304n.f42077a) && AbstractC16544l.m18089b(this.f42078b, c13304n.f42078b) && AbstractC16544l.m18089b(this.f42079c, c13304n.f42079c);
    }

    public final int hashCode() {
        return this.f42079c.hashCode() + AbstractC0168G.m527p(this.f42077a.hashCode() * 31, 31, this.f42078b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RumScopeKey(id=");
        sb2.append(this.f42077a);
        sb2.append(", url=");
        sb2.append(this.f42078b);
        sb2.append(", name=");
        return AbstractC9306j0.m9891j(this.f42079c, Separators.RPAREN, sb2);
    }
}
