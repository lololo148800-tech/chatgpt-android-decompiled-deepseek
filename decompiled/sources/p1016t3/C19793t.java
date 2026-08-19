package p1016t3;

import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: t3.t */
/* JADX INFO: loaded from: classes.dex */
public final class C19793t {

    /* JADX INFO: renamed from: a */
    public final long f62774a;

    /* JADX INFO: renamed from: b */
    public final long f62775b;

    /* JADX INFO: renamed from: c */
    public final long f62776c;

    /* JADX INFO: renamed from: d */
    public final float f62777d;

    /* JADX INFO: renamed from: e */
    public final float f62778e;

    static {
        new C19792s().m20750a();
        AbstractC20817s.m21425z(0);
        AbstractC20817s.m21425z(1);
        AbstractC20817s.m21425z(2);
        AbstractC20817s.m21425z(3);
        AbstractC20817s.m21425z(4);
    }

    public C19793t(C19792s c19792s) {
        long j10 = c19792s.f62769a;
        long j11 = c19792s.f62770b;
        long j12 = c19792s.f62771c;
        float f10 = c19792s.f62772d;
        float f11 = c19792s.f62773e;
        this.f62774a = j10;
        this.f62775b = j11;
        this.f62776c = j12;
        this.f62777d = f10;
        this.f62778e = f11;
    }

    /* JADX INFO: renamed from: a */
    public final C19792s m20751a() {
        C19792s c19792s = new C19792s();
        c19792s.f62769a = this.f62774a;
        c19792s.f62770b = this.f62775b;
        c19792s.f62771c = this.f62776c;
        c19792s.f62772d = this.f62777d;
        c19792s.f62773e = this.f62778e;
        return c19792s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19793t)) {
            return false;
        }
        C19793t c19793t = (C19793t) obj;
        return this.f62774a == c19793t.f62774a && this.f62775b == c19793t.f62775b && this.f62776c == c19793t.f62776c && this.f62777d == c19793t.f62777d && this.f62778e == c19793t.f62778e;
    }

    public final int hashCode() {
        long j10 = this.f62774a;
        long j11 = this.f62775b;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f62776c;
        int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
        float f10 = this.f62777d;
        int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f62778e;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }
}
