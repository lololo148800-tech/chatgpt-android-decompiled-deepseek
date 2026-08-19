package p1016t3;

import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: t3.X */
/* JADX INFO: loaded from: classes.dex */
public final class C19773X {

    /* JADX INFO: renamed from: e */
    public static final C19773X f62650e = new C19773X(0, 0, 0, 1.0f);

    /* JADX INFO: renamed from: a */
    public final int f62651a;

    /* JADX INFO: renamed from: b */
    public final int f62652b;

    /* JADX INFO: renamed from: c */
    public final int f62653c;

    /* JADX INFO: renamed from: d */
    public final float f62654d;

    static {
        AbstractC20817s.m21425z(0);
        AbstractC20817s.m21425z(1);
        AbstractC20817s.m21425z(2);
        AbstractC20817s.m21425z(3);
    }

    public C19773X(int i10, int i11, int i12, float f10) {
        this.f62651a = i10;
        this.f62652b = i11;
        this.f62653c = i12;
        this.f62654d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19773X)) {
            return false;
        }
        C19773X c19773x = (C19773X) obj;
        return this.f62651a == c19773x.f62651a && this.f62652b == c19773x.f62652b && this.f62653c == c19773x.f62653c && this.f62654d == c19773x.f62654d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f62654d) + ((((((217 + this.f62651a) * 31) + this.f62652b) * 31) + this.f62653c) * 31);
    }
}
