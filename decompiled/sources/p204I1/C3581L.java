package p204I1;

import com.google.protobuf.AbstractC12107L1;
import p544W9.AbstractC8676n;

/* JADX INFO: renamed from: I1.L */
/* JADX INFO: loaded from: classes.dex */
public final class C3581L {

    /* JADX INFO: renamed from: b */
    public static final long f10906b = AbstractC8676n.m9365b(0, 0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f10907c = 0;

    /* JADX INFO: renamed from: a */
    public final long f10908a;

    public /* synthetic */ C3581L(long j10) {
        this.f10908a = j10;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m4265a(long j10, long j11) {
        return m4270f(j10) <= m4270f(j11) && m4269e(j11) <= m4269e(j10);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m4266b(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m4267c(long j10) {
        return ((int) (j10 >> 32)) == ((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static final int m4268d(long j10) {
        return m4269e(j10) - m4270f(j10);
    }

    /* JADX INFO: renamed from: e */
    public static final int m4269e(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return i10 > i11 ? i10 : i11;
    }

    /* JADX INFO: renamed from: f */
    public static final int m4270f(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return i10 > i11 ? i11 : i10;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m4271g(long j10) {
        return ((int) (j10 >> 32)) > ((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: h */
    public static String m4272h(long j10) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j10 >> 32));
        sb2.append(", ");
        return AbstractC12107L1.m13826q(sb2, (int) (j10 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3581L) {
            return this.f10908a == ((C3581L) obj).f10908a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f10908a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return m4272h(this.f10908a);
    }
}
