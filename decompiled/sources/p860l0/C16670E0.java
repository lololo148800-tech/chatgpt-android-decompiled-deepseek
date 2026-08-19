package p860l0;

import kotlin.jvm.internal.AbstractC16544l;
import p692d0.C12987z;
import p882m1.clb.WGTYqNchEpHca;

/* JADX INFO: renamed from: l0.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16670E0 {

    /* JADX INFO: renamed from: a */
    public final C12987z f53389a;

    public C16670E0(C12987z c12987z) {
        this.f53389a = c12987z;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[DONT_INVERT, PHI: r5 r6
      0x0052: PHI (r5v3 java.lang.Object) = (r5v2 java.lang.Object), (r5v4 java.lang.Object) binds: [B:6:0x0022, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r6v2 float) = (r6v1 float), (r6v3 float) binds: [B:6:0x0022, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[LOOP:0: B:5:0x0014->B:17:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[EDGE_INSN: B:20:0x0057->B:18:0x0057 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x0054], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final Object m18491a(float f10) {
        C12987z c12987z = this.f53389a;
        Object[] objArr = c12987z.f41233b;
        float[] fArr = c12987z.f41234c;
        long[] jArr = c12987z.f41232a;
        int length = jArr.length - 2;
        Object obj = null;
        if (length >= 0) {
            float f11 = Float.POSITIVE_INFINITY;
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj2 = objArr[i13];
                            float fAbs = Math.abs(f10 - fArr[i13]);
                            if (fAbs <= f11) {
                                f11 = fAbs;
                                obj = obj2;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c A[DONT_INVERT, PHI: r5 r9
      0x005c: PHI (r5v3 java.lang.Object) = (r5v2 java.lang.Object), (r5v4 java.lang.Object) binds: [B:6:0x0023, B:22:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r9v2 float) = (r9v1 float), (r9v3 float) binds: [B:6:0x0023, B:22:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e A[LOOP:0: B:5:0x0015->B:24:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[EDGE_INSN: B:27:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:5:0x0015->B:24:0x005e], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final Object m18492b(float f10, boolean z6) {
        C12987z c12987z = this.f53389a;
        Object[] objArr = c12987z.f41233b;
        float[] fArr = c12987z.f41234c;
        long[] jArr = c12987z.f41232a;
        int length = jArr.length - 2;
        Object obj = null;
        if (length >= 0) {
            float f11 = Float.POSITIVE_INFINITY;
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj2 = objArr[i13];
                            float f12 = fArr[i13];
                            float f13 = z6 ? f12 - f10 : f10 - f12;
                            if (f13 < 0.0f) {
                                f13 = Float.POSITIVE_INFINITY;
                            }
                            if (f13 <= f11) {
                                f11 = f13;
                                obj = obj2;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004f A[DONT_INVERT, PHI: r3
      0x004f: PHI (r3v3 float) = (r3v2 float), (r3v4 float) binds: [B:9:0x0025, B:18:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0051 A[LOOP:0: B:8:0x0017->B:22:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x004d A[EDGE_INSN: B:25:0x004d->B:20:0x004d BREAK  A[LOOP:0: B:8:0x0017->B:22:0x0051], SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public final float m18493c() {
        C12987z c12987z = this.f53389a;
        if (c12987z.f41236e == 1) {
            return Float.NaN;
        }
        float[] fArr = c12987z.f41234c;
        long[] jArr = c12987z.f41232a;
        int length = jArr.length - 2;
        float f10 = Float.NEGATIVE_INFINITY;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            float f11 = fArr[(i10 << 3) + i12];
                            if (f11 >= f10) {
                                f10 = f11;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return f10;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004f A[DONT_INVERT, PHI: r3
      0x004f: PHI (r3v3 float) = (r3v2 float), (r3v4 float) binds: [B:9:0x0025, B:18:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0051 A[LOOP:0: B:8:0x0017->B:22:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x004d A[EDGE_INSN: B:25:0x004d->B:20:0x004d BREAK  A[LOOP:0: B:8:0x0017->B:22:0x0051], SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final float m18494d() {
        C12987z c12987z = this.f53389a;
        if (c12987z.f41236e == 1) {
            return Float.NaN;
        }
        float[] fArr = c12987z.f41234c;
        long[] jArr = c12987z.f41232a;
        int length = jArr.length - 2;
        float f10 = Float.POSITIVE_INFINITY;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            float f11 = fArr[(i10 << 3) + i12];
                            if (f11 <= f10) {
                                f10 = f11;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return f10;
    }

    /* JADX INFO: renamed from: e */
    public final float m18495e(Object obj) {
        C12987z c12987z = this.f53389a;
        int iM14719c = c12987z.m14719c(obj);
        if (iM14719c >= 0) {
            return c12987z.f41234c[iM14719c];
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16670E0)) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f53389a, ((C16670E0) obj).f53389a);
    }

    public final int hashCode() {
        return this.f53389a.hashCode() * 31;
    }

    public final String toString() {
        return WGTYqNchEpHca.NDrXfiTAEjNumXM + this.f53389a + ')';
    }
}
