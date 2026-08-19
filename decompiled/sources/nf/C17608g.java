package nf;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: nf.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C17608g {

    /* JADX INFO: renamed from: a */
    public final String f56362a;

    /* JADX INFO: renamed from: b */
    public final String f56363b;

    /* JADX INFO: renamed from: c */
    public final String f56364c;

    /* JADX INFO: renamed from: d */
    public final String f56365d;

    public C17608g(String id2, String name, String str, String str2) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(name, "name");
        this.f56362a = id2;
        this.f56363b = name;
        this.f56364c = str;
        this.f56365d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17608g)) {
            return false;
        }
        C17608g c17608g = (C17608g) obj;
        return AbstractC16544l.m18089b(this.f56362a, c17608g.f56362a) && AbstractC16544l.m18089b(this.f56363b, c17608g.f56363b) && AbstractC16544l.m18089b(this.f56364c, c17608g.f56364c) && AbstractC16544l.m18089b(this.f56365d, c17608g.f56365d);
    }

    public final int hashCode() {
        return this.f56365d.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(this.f56362a.hashCode() * 31, 31, this.f56363b), 31, this.f56364c);
    }

    public final String toString() {
        return "█";
    }
}
