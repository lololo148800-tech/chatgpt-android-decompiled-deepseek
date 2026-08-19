package p386Pk;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p211I8.lPE.sRXLFOsOgS;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Pk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6449a {

    /* JADX INFO: renamed from: a */
    public final String f20921a;

    /* JADX INFO: renamed from: b */
    public final String f20922b;

    /* JADX INFO: renamed from: c */
    public final String f20923c;

    /* JADX INFO: renamed from: d */
    public final String f20924d;

    /* JADX INFO: renamed from: e */
    public final List f20925e;

    /* JADX INFO: renamed from: f */
    public final C6451c f20926f;

    /* JADX INFO: renamed from: g */
    public final List f20927g;

    public C6449a(String str, String str2, String str3, String str4, List list, C6451c c6451c, List list2) {
        this.f20921a = str;
        this.f20922b = str2;
        this.f20923c = str3;
        this.f20924d = str4;
        this.f20925e = list;
        this.f20926f = c6451c;
        this.f20927g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6449a)) {
            return false;
        }
        C6449a c6449a = (C6449a) obj;
        return AbstractC16544l.m18089b(this.f20921a, c6449a.f20921a) && AbstractC16544l.m18089b(this.f20922b, c6449a.f20922b) && AbstractC16544l.m18089b(this.f20923c, c6449a.f20923c) && AbstractC16544l.m18089b(this.f20924d, c6449a.f20924d) && AbstractC16544l.m18089b(this.f20925e, c6449a.f20925e) && AbstractC16544l.m18089b(this.f20926f, c6449a.f20926f) && AbstractC16544l.m18089b(this.f20927g, c6449a.f20927g);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(this.f20921a.hashCode() * 31, 31, this.f20922b), 31, this.f20923c);
        String str = this.f20924d;
        int iM15858x = AbstractC14376f.m15858x(this.f20925e, (iM527p + (str == null ? 0 : str.hashCode())) * 31, 31);
        C6451c c6451c = this.f20926f;
        return this.f20927g.hashCode() + ((iM15858x + (c6451c != null ? c6451c.f20930a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Artifact(groupId=" + this.f20921a + ", artifactId=" + this.f20922b + ", version=" + this.f20923c + ", name=" + this.f20924d + sRXLFOsOgS.gcBBAfDNllh + this.f20925e + ", scm=" + this.f20926f + ", unknownLicenses=" + this.f20927g + ')';
    }
}
