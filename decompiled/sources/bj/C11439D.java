package bj;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: bj.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C11439D extends AbstractC11440E {

    /* JADX INFO: renamed from: v0 */
    public Object[] f34569v0;

    /* JADX INFO: renamed from: w0 */
    public String f34570w0;

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: C0 */
    public final AbstractC11440E mo12822C0(double d10) {
        if (!this.f34576r0 && (Double.isNaN(d10) || d10 == Double.NEGATIVE_INFINITY || d10 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f34578t0) {
            this.f34578t0 = false;
            mo12827T(Double.toString(d10));
            return this;
        }
        m12831X0(Double.valueOf(d10));
        int[] iArr = this.f34574p0;
        int i10 = this.f34571Y - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: E */
    public final AbstractC11440E mo12823E() {
        if (m12837j0() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f34570w0 != null) {
            throw new IllegalStateException("Dangling name: " + this.f34570w0);
        }
        int i10 = this.f34571Y;
        int i11 = this.f34579u0;
        if (i10 == (~i11)) {
            this.f34579u0 = ~i11;
            return this;
        }
        this.f34578t0 = false;
        int i12 = i10 - 1;
        this.f34571Y = i12;
        this.f34569v0[i12] = null;
        this.f34573o0[i12] = null;
        int[] iArr = this.f34574p0;
        int i13 = i10 - 2;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: H0 */
    public final AbstractC11440E mo12824H0(long j10) {
        if (this.f34578t0) {
            this.f34578t0 = false;
            mo12827T(Long.toString(j10));
            return this;
        }
        m12831X0(Long.valueOf(j10));
        int[] iArr = this.f34574p0;
        int i10 = this.f34571Y - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: J0 */
    public final AbstractC11440E mo12825J0(Boolean bool) {
        if (this.f34578t0) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + m12835P());
        }
        m12831X0(bool);
        int[] iArr = this.f34574p0;
        int i10 = this.f34571Y - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: N0 */
    public final AbstractC11440E mo12826N0(Number number) {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            mo12824H0(number.longValue());
            return this;
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            mo12822C0(number.doubleValue());
            return this;
        }
        if (number == null) {
            mo12829W();
            return this;
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.f34578t0) {
            this.f34578t0 = false;
            mo12827T(bigDecimal.toString());
            return this;
        }
        m12831X0(bigDecimal);
        int[] iArr = this.f34574p0;
        int i10 = this.f34571Y - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: T */
    public final AbstractC11440E mo12827T(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f34571Y == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (m12837j0() != 3 || this.f34570w0 != null || this.f34578t0) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f34570w0 = str;
        this.f34573o0[this.f34571Y - 1] = str;
        return this;
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: V0 */
    public final AbstractC11440E mo12828V0(String str) {
        if (this.f34578t0) {
            this.f34578t0 = false;
            mo12827T(str);
            return this;
        }
        m12831X0(str);
        int[] iArr = this.f34574p0;
        int i10 = this.f34571Y - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: W */
    public final AbstractC11440E mo12829W() {
        if (this.f34578t0) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + m12835P());
        }
        m12831X0(null);
        int[] iArr = this.f34574p0;
        int i10 = this.f34571Y - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: W0 */
    public final AbstractC11440E mo12830W0(boolean z6) {
        if (this.f34578t0) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + m12835P());
        }
        m12831X0(Boolean.valueOf(z6));
        int[] iArr = this.f34574p0;
        int i10 = this.f34571Y - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m12831X0(Serializable serializable) {
        String str;
        Object objPut;
        int iM12837j0 = m12837j0();
        int i10 = this.f34571Y;
        if (i10 == 1) {
            if (iM12837j0 != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            int i11 = i10 - 1;
            this.f34572Z[i11] = 7;
            this.f34569v0[i11] = serializable;
            return;
        }
        if (iM12837j0 != 3 || (str = this.f34570w0) == null) {
            if (iM12837j0 == 1) {
                ((List) this.f34569v0[i10 - 1]).add(serializable);
                return;
            } else {
                if (iM12837j0 != 9) {
                    throw new IllegalStateException("Nesting problem.");
                }
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
        }
        if ((serializable == null && !this.f34577s0) || (objPut = ((Map) this.f34569v0[i10 - 1]).put(str, serializable)) == null) {
            this.f34570w0 = null;
            return;
        }
        throw new IllegalArgumentException("Map key '" + this.f34570w0 + "' has multiple values at path " + m12835P() + ": " + objPut + " and " + serializable);
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: a */
    public final AbstractC11440E mo12832a() {
        if (this.f34578t0) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + m12835P());
        }
        int i10 = this.f34571Y;
        int i11 = this.f34579u0;
        if (i10 == i11 && this.f34572Z[i10 - 1] == 1) {
            this.f34579u0 = ~i11;
            return this;
        }
        m12838k();
        ArrayList arrayList = new ArrayList();
        m12831X0(arrayList);
        Object[] objArr = this.f34569v0;
        int i12 = this.f34571Y;
        objArr[i12] = arrayList;
        this.f34574p0[i12] = 0;
        m12839r0(1);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i10 = this.f34571Y;
        if (i10 > 1 || (i10 == 1 && this.f34572Z[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f34571Y = 0;
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: e */
    public final AbstractC11440E mo12833e() {
        if (this.f34578t0) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + m12835P());
        }
        int i10 = this.f34571Y;
        int i11 = this.f34579u0;
        if (i10 == i11 && this.f34572Z[i10 - 1] == 3) {
            this.f34579u0 = ~i11;
            return this;
        }
        m12838k();
        C11444I c11444i = new C11444I();
        m12831X0(c11444i);
        this.f34569v0[this.f34571Y] = c11444i;
        m12839r0(3);
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f34571Y == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: m */
    public final AbstractC11440E mo12834m() {
        if (m12837j0() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i10 = this.f34571Y;
        int i11 = this.f34579u0;
        if (i10 == (~i11)) {
            this.f34579u0 = ~i11;
            return this;
        }
        int i12 = i10 - 1;
        this.f34571Y = i12;
        this.f34569v0[i12] = null;
        int[] iArr = this.f34574p0;
        int i13 = i10 - 2;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }
}
