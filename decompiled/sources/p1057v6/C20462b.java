package p1057v6;

import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.C21319m;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: v6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C20462b {

    /* JADX INFO: renamed from: b */
    public static final C21319m f64954b = new C21319m("ApolloCacheReference\\{(.*)\\}");

    /* JADX INFO: renamed from: c */
    public static final C20462b f64955c = new C20462b("QUERY_ROOT");

    /* JADX INFO: renamed from: a */
    public final String f64956a;

    public C20462b(String key) {
        AbstractC16544l.m18094g(key, "key");
        this.f64956a = key;
    }

    public final boolean equals(Object obj) {
        C20462b c20462b = obj instanceof C20462b ? (C20462b) obj : null;
        return AbstractC16544l.m18089b(this.f64956a, c20462b != null ? c20462b.f64956a : null);
    }

    public final int hashCode() {
        return this.f64956a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("CacheKey("), this.f64956a, ')');
    }
}
