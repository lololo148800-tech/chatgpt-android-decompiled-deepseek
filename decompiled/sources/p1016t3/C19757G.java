package p1016t3;

import java.util.Locale;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: t3.G */
/* JADX INFO: loaded from: classes.dex */
public final class C19757G {

    /* JADX INFO: renamed from: d */
    public static final C19757G f62563d = new C19757G(1.0f, 1.0f);

    /* JADX INFO: renamed from: a */
    public final float f62564a;

    /* JADX INFO: renamed from: b */
    public final float f62565b;

    /* JADX INFO: renamed from: c */
    public final int f62566c;

    static {
        AbstractC20817s.m21425z(0);
        AbstractC20817s.m21425z(1);
    }

    public C19757G(float f10, float f11) {
        AbstractC20800b.m21316d(f10 > 0.0f);
        AbstractC20800b.m21316d(f11 > 0.0f);
        this.f62564a = f10;
        this.f62565b = f11;
        this.f62566c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19757G.class != obj.getClass()) {
            return false;
        }
        C19757G c19757g = (C19757G) obj;
        return this.f62564a == c19757g.f62564a && this.f62565b == c19757g.f62565b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f62565b) + ((Float.floatToRawIntBits(this.f62564a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f62564a), Float.valueOf(this.f62565b)};
        int i10 = AbstractC20817s.f66106a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
