package p156G1;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p200Hm.C3505d;

/* JADX INFO: renamed from: G1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2959f {

    /* JADX INFO: renamed from: d */
    public static final C2959f f8845d = new C2959f(0.0f, new C3505d(0.0f, 0.0f));

    /* JADX INFO: renamed from: a */
    public final float f8846a;

    /* JADX INFO: renamed from: b */
    public final C3505d f8847b;

    /* JADX INFO: renamed from: c */
    public final int f8848c = 0;

    public C2959f(float f10, C3505d c3505d) {
        this.f8846a = f10;
        this.f8847b = c3505d;
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    /* JADX INFO: renamed from: a */
    public final C3505d m3782a() {
        return this.f8847b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2959f)) {
            return false;
        }
        C2959f c2959f = (C2959f) obj;
        return this.f8846a == c2959f.f8846a && AbstractC16544l.m18089b(this.f8847b, c2959f.f8847b) && this.f8848c == c2959f.f8848c;
    }

    public final int hashCode() {
        return ((this.f8847b.hashCode() + (Float.floatToIntBits(this.f8846a) * 31)) * 31) + this.f8848c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressBarRangeInfo(current=");
        sb2.append(this.f8846a);
        sb2.append(", range=");
        sb2.append(this.f8847b);
        sb2.append(", steps=");
        return AbstractC12107L1.m13826q(sb2, this.f8848c, ')');
    }
}
