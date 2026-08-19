package p449S9;

import java.util.Arrays;

/* JADX INFO: renamed from: S9.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7064d0 extends AbstractC7072h0 {

    /* JADX INFO: renamed from: Y */
    public final long f22538Y;

    public C7064d0(long j10) {
        this.f22538Y = j10;
    }

    @Override // p449S9.AbstractC7072h0
    /* JADX INFO: renamed from: a */
    public final int mo7454a() {
        return AbstractC7072h0.m7475d(this.f22538Y >= 0 ? (byte) 0 : (byte) 32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC7072h0 abstractC7072h0 = (AbstractC7072h0) obj;
        if (mo7454a() != abstractC7072h0.mo7454a()) {
            return mo7454a() - abstractC7072h0.mo7454a();
        }
        long jAbs = Math.abs(this.f22538Y);
        long jAbs2 = Math.abs(((C7064d0) abstractC7072h0).f22538Y);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C7064d0.class == obj.getClass() && this.f22538Y == ((C7064d0) obj).f22538Y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo7454a()), Long.valueOf(this.f22538Y)});
    }

    public final String toString() {
        return Long.toString(this.f22538Y);
    }
}
