package p435Rl;

import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.C21319m;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Rl.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C6930n {
    public static final C6929m Companion = new C6929m();

    /* JADX INFO: renamed from: d */
    public static final C21319m f22201d = new C21319m("L(\\d)T(\\d)(h|_KEY|_KEY_SHIFT)?");

    /* JADX INFO: renamed from: a */
    public final int f22202a;

    /* JADX INFO: renamed from: b */
    public final int f22203b;

    /* JADX INFO: renamed from: c */
    public final String f22204c;

    public C6930n(int i10, int i11, String suffix) {
        AbstractC16544l.m18094g(suffix, "suffix");
        this.f22202a = i10;
        this.f22203b = i11;
        this.f22204c = suffix;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6930n)) {
            return false;
        }
        C6930n c6930n = (C6930n) obj;
        return this.f22202a == c6930n.f22202a && this.f22203b == c6930n.f22203b && AbstractC16544l.m18089b(this.f22204c, c6930n.f22204c);
    }

    public final int hashCode() {
        return this.f22204c.hashCode() + (((this.f22202a * 31) + this.f22203b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScalabilityMode(spatial=");
        sb2.append(this.f22202a);
        sb2.append(", temporal=");
        sb2.append(this.f22203b);
        sb2.append(", suffix=");
        return AbstractC9306j0.m9892k(sb2, this.f22204c, ')');
    }
}
