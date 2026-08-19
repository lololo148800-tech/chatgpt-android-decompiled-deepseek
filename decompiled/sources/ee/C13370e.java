package ee;

import kotlin.jvm.internal.AbstractC16544l;
import p359Oc.C6168d;

/* JADX INFO: renamed from: ee.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C13370e extends AbstractC13371f {

    /* JADX INFO: renamed from: a */
    public final C6168d f42408a;

    /* JADX INFO: renamed from: b */
    public final boolean f42409b;

    /* JADX INFO: renamed from: c */
    public final boolean f42410c;

    public C13370e(C6168d warning, boolean z6, boolean z10) {
        AbstractC16544l.m18094g(warning, "warning");
        this.f42408a = warning;
        this.f42409b = z6;
        this.f42410c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13370e)) {
            return false;
        }
        C13370e c13370e = (C13370e) obj;
        return AbstractC16544l.m18089b(this.f42408a, c13370e.f42408a) && this.f42409b == c13370e.f42409b && this.f42410c == c13370e.f42410c;
    }

    public final int hashCode() {
        return (((this.f42408a.hashCode() * 31) + (this.f42409b ? 1231 : 1237)) * 31) + (this.f42410c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
