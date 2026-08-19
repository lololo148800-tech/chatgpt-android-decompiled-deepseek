package p010A8;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p499U9.C7591u;

/* JADX INFO: renamed from: A8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0401d {

    /* JADX INFO: renamed from: h */
    public static final String[] f1333h = {"version", "_dd", "span", "tracer", "usr", "network"};

    /* JADX INFO: renamed from: a */
    public final String f1334a;

    /* JADX INFO: renamed from: b */
    public final C0400c f1335b;

    /* JADX INFO: renamed from: c */
    public final C7591u f1336c;

    /* JADX INFO: renamed from: d */
    public final C0406i f1337d;

    /* JADX INFO: renamed from: e */
    public final C0407j f1338e;

    /* JADX INFO: renamed from: f */
    public final C0403f f1339f;

    /* JADX INFO: renamed from: g */
    public final Map f1340g;

    public C0401d(String version, C0400c c0400c, C7591u c7591u, C0406i c0406i, C0407j c0407j, C0403f c0403f, Map map) {
        AbstractC16544l.m18094g(version, "version");
        this.f1334a = version;
        this.f1335b = c0400c;
        this.f1336c = c7591u;
        this.f1337d = c0406i;
        this.f1338e = c0407j;
        this.f1339f = c0403f;
        this.f1340g = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0401d)) {
            return false;
        }
        C0401d c0401d = (C0401d) obj;
        return AbstractC16544l.m18089b(this.f1334a, c0401d.f1334a) && AbstractC16544l.m18089b(this.f1335b, c0401d.f1335b) && AbstractC16544l.m18089b(this.f1336c, c0401d.f1336c) && AbstractC16544l.m18089b(this.f1337d, c0401d.f1337d) && AbstractC16544l.m18089b(this.f1338e, c0401d.f1338e) && AbstractC16544l.m18089b(this.f1339f, c0401d.f1339f) && AbstractC16544l.m18089b(this.f1340g, c0401d.f1340g);
    }

    public final int hashCode() {
        int iHashCode = (this.f1338e.hashCode() + AbstractC0168G.m527p((this.f1336c.hashCode() + ((this.f1335b.hashCode() + (this.f1334a.hashCode() * 31)) * 31)) * 31, 31, this.f1337d.f1348a)) * 31;
        C0403f c0403f = this.f1339f;
        return this.f1340g.hashCode() + ((iHashCode + (c0403f == null ? 0 : c0403f.hashCode())) * 31);
    }

    public final String toString() {
        return "Meta(version=" + this.f1334a + ", dd=" + this.f1335b + ", span=" + this.f1336c + ", tracer=" + this.f1337d + ", usr=" + this.f1338e + ", network=" + this.f1339f + ", additionalProperties=" + this.f1340g + Separators.RPAREN;
    }
}
