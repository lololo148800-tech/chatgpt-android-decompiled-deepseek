package p692d0;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p714e0.AbstractC13253a;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: d0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C12977p implements Cloneable {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ boolean f41187Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ long[] f41188Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object[] f41189o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ int f41190p0;

    public C12977p(int i10) {
        if (i10 == 0) {
            this.f41188Z = AbstractC13253a.f41866b;
            this.f41189o0 = AbstractC13253a.f41867c;
            return;
        }
        int i11 = i10 * 8;
        for (int i12 = 4; i12 < 32; i12++) {
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
        }
        int i14 = i11 / 8;
        this.f41188Z = new long[i14];
        this.f41189o0 = new Object[i14];
    }

    /* JADX INFO: renamed from: a */
    public final void m14661a(long j10, Long l4) {
        int i10 = this.f41190p0;
        if (i10 != 0 && j10 <= this.f41188Z[i10 - 1]) {
            m14668h(j10, l4);
            return;
        }
        if (this.f41187Y) {
            long[] jArr = this.f41188Z;
            if (i10 >= jArr.length) {
                Object[] objArr = this.f41189o0;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != AbstractC12978q.f41191a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f41187Y = false;
                this.f41190p0 = i11;
            }
        }
        int i13 = this.f41190p0;
        if (i13 >= this.f41188Z.length) {
            int i14 = (i13 + 1) * 8;
            for (int i15 = 4; i15 < 32; i15++) {
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
            }
            int i17 = i14 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f41188Z, i17);
            AbstractC16544l.m18093f(jArrCopyOf, "copyOf(this, newSize)");
            this.f41188Z = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f41189o0, i17);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            this.f41189o0 = objArrCopyOf;
        }
        this.f41188Z[i13] = j10;
        this.f41189o0[i13] = l4;
        this.f41190p0 = i13 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m14662b() {
        int i10 = this.f41190p0;
        Object[] objArr = this.f41189o0;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f41190p0 = 0;
        this.f41187Y = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C12977p clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC16544l.m18092e(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C12977p c12977p = (C12977p) objClone;
        c12977p.f41188Z = (long[]) this.f41188Z.clone();
        c12977p.f41189o0 = (Object[]) this.f41189o0.clone();
        return c12977p;
    }

    /* JADX INFO: renamed from: d */
    public final Object m14664d(long j10) {
        Object obj;
        int iM14849b = AbstractC13253a.m14849b(this.f41188Z, this.f41190p0, j10);
        if (iM14849b < 0 || (obj = this.f41189o0[iM14849b]) == AbstractC12978q.f41191a) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: e */
    public final Object m14665e(long j10) {
        Object obj;
        int iM14849b = AbstractC13253a.m14849b(this.f41188Z, this.f41190p0, j10);
        if (iM14849b < 0 || (obj = this.f41189o0[iM14849b]) == AbstractC12978q.f41191a) {
            return -1L;
        }
        return obj;
    }

    /* JADX INFO: renamed from: f */
    public final int m14666f(long j10) {
        if (this.f41187Y) {
            int i10 = this.f41190p0;
            long[] jArr = this.f41188Z;
            Object[] objArr = this.f41189o0;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC12978q.f41191a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f41187Y = false;
            this.f41190p0 = i11;
        }
        return AbstractC13253a.m14849b(this.f41188Z, this.f41190p0, j10);
    }

    /* JADX INFO: renamed from: g */
    public final long m14667g(int i10) {
        if (!(i10 >= 0 && i10 < this.f41190p0)) {
            AbstractC13253a.m14850c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f41187Y) {
            int i11 = this.f41190p0;
            long[] jArr = this.f41188Z;
            Object[] objArr = this.f41189o0;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != AbstractC12978q.f41191a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f41187Y = false;
            this.f41190p0 = i12;
        }
        return this.f41188Z[i10];
    }

    /* JADX INFO: renamed from: h */
    public final void m14668h(long j10, Object obj) {
        int iM14849b = AbstractC13253a.m14849b(this.f41188Z, this.f41190p0, j10);
        if (iM14849b >= 0) {
            this.f41189o0[iM14849b] = obj;
            return;
        }
        int i10 = ~iM14849b;
        int i11 = this.f41190p0;
        Object obj2 = AbstractC12978q.f41191a;
        if (i10 < i11) {
            Object[] objArr = this.f41189o0;
            if (objArr[i10] == obj2) {
                this.f41188Z[i10] = j10;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f41187Y) {
            long[] jArr = this.f41188Z;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.f41189o0;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj3 = objArr2[i13];
                    if (obj3 != obj2) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj3;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f41187Y = false;
                this.f41190p0 = i12;
                i10 = ~AbstractC13253a.m14849b(this.f41188Z, i12, j10);
            }
        }
        int i14 = this.f41190p0;
        if (i14 >= this.f41188Z.length) {
            int i15 = (i14 + 1) * 8;
            for (int i16 = 4; i16 < 32; i16++) {
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
            }
            int i18 = i15 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f41188Z, i18);
            AbstractC16544l.m18093f(jArrCopyOf, "copyOf(this, newSize)");
            this.f41188Z = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f41189o0, i18);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            this.f41189o0 = objArrCopyOf;
        }
        int i19 = this.f41190p0 - i10;
        if (i19 != 0) {
            long[] jArr2 = this.f41188Z;
            int i20 = i10 + 1;
            AbstractC16544l.m18094g(jArr2, "<this>");
            System.arraycopy(jArr2, i10, jArr2, i20, i19);
            Object[] objArr3 = this.f41189o0;
            AbstractC17678l.m19304k(i20, i10, this.f41190p0, objArr3, objArr3);
        }
        this.f41188Z[i10] = j10;
        this.f41189o0[i10] = obj;
        this.f41190p0++;
    }

    /* JADX INFO: renamed from: i */
    public final void m14669i(long j10) {
        int iM14849b = AbstractC13253a.m14849b(this.f41188Z, this.f41190p0, j10);
        if (iM14849b >= 0) {
            Object[] objArr = this.f41189o0;
            Object obj = objArr[iM14849b];
            Object obj2 = AbstractC12978q.f41191a;
            if (obj != obj2) {
                objArr[iM14849b] = obj2;
                this.f41187Y = true;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m14670j() {
        if (this.f41187Y) {
            int i10 = this.f41190p0;
            long[] jArr = this.f41188Z;
            Object[] objArr = this.f41189o0;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC12978q.f41191a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f41187Y = false;
            this.f41190p0 = i11;
        }
        return this.f41190p0;
    }

    /* JADX INFO: renamed from: k */
    public final Object m14671k(int i10) {
        if (!(i10 >= 0 && i10 < this.f41190p0)) {
            AbstractC13253a.m14850c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f41187Y) {
            int i11 = this.f41190p0;
            long[] jArr = this.f41188Z;
            Object[] objArr = this.f41189o0;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != AbstractC12978q.f41191a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f41187Y = false;
            this.f41190p0 = i12;
        }
        return this.f41189o0[i10];
    }

    public final String toString() {
        if (m14670j() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f41190p0 * 28);
        sb2.append('{');
        int i10 = this.f41190p0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(m14667g(i11));
            sb2.append('=');
            Object objM14671k = m14671k(i11);
            if (objM14671k != sb2) {
                sb2.append(objM14671k);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public /* synthetic */ C12977p(Object obj) {
        this(10);
    }
}
