package bj;

import com.openai.feature.onboarding.p683mU.YladLSetV;
import java.io.IOException;
import p026Ao.InterfaceC0676j;

/* JADX INFO: renamed from: bj.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C11479z extends AbstractC11440E {

    /* JADX INFO: renamed from: y0 */
    public static final String[] f34715y0 = new String[128];

    /* JADX INFO: renamed from: v0 */
    public final InterfaceC0676j f34716v0;

    /* JADX INFO: renamed from: w0 */
    public String f34717w0 = ":";

    /* JADX INFO: renamed from: x0 */
    public String f34718x0;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f34715y0[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f34715y0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = YladLSetV.nUDsb;
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public C11479z(InterfaceC0676j interfaceC0676j) {
        if (interfaceC0676j == null) {
            throw new NullPointerException("sink == null");
        }
        this.f34716v0 = interfaceC0676j;
        m12839r0(6);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX INFO: renamed from: b1 */
    public static void m12882b1(InterfaceC0676j interfaceC0676j, String str) {
        String str2;
        String[] strArr = f34715y0;
        interfaceC0676j.mo1328M(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        interfaceC0676j.mo1337l0(i10, i11, str);
                    }
                    interfaceC0676j.mo1333c0(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    interfaceC0676j.mo1337l0(i10, i11, str);
                }
                interfaceC0676j.mo1333c0(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            interfaceC0676j.mo1337l0(i10, length, str);
        }
        interfaceC0676j.mo1328M(34);
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: C0 */
    public final AbstractC11440E mo12822C0(double d10) {
        if (!this.f34576r0 && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f34578t0) {
            this.f34578t0 = false;
            mo12827T(Double.toString(d10));
            return this;
        }
        m12887c1();
        m12883X0();
        this.f34716v0.mo1333c0(Double.toString(d10));
        int[] iArr = this.f34574p0;
        int i10 = this.f34571Y - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: E */
    public final AbstractC11440E mo12823E() {
        this.f34578t0 = false;
        m12884Y0('}', 3, 5);
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
        m12887c1();
        m12883X0();
        this.f34716v0.mo1333c0(Long.toString(j10));
        int[] iArr = this.f34574p0;
        int i10 = this.f34571Y - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: J0 */
    public final AbstractC11440E mo12825J0(Boolean bool) {
        if (bool == null) {
            mo12829W();
            return this;
        }
        mo12830W0(bool.booleanValue());
        return this;
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: N0 */
    public final AbstractC11440E mo12826N0(Number number) {
        if (number == null) {
            mo12829W();
            return this;
        }
        String string = number.toString();
        if (!this.f34576r0 && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f34578t0) {
            this.f34578t0 = false;
            mo12827T(string);
            return this;
        }
        m12887c1();
        m12883X0();
        this.f34716v0.mo1333c0(string);
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
        int iM12837j0 = m12837j0();
        if ((iM12837j0 != 3 && iM12837j0 != 5) || this.f34718x0 != null || this.f34578t0) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f34718x0 = str;
        this.f34573o0[this.f34571Y - 1] = str;
        return this;
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: V0 */
    public final AbstractC11440E mo12828V0(String str) {
        if (str == null) {
            mo12829W();
            return this;
        }
        if (this.f34578t0) {
            this.f34578t0 = false;
            mo12827T(str);
            return this;
        }
        m12887c1();
        m12883X0();
        m12882b1(this.f34716v0, str);
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
        if (this.f34718x0 != null) {
            if (!this.f34577s0) {
                this.f34718x0 = null;
                return this;
            }
            m12887c1();
        }
        m12883X0();
        this.f34716v0.mo1333c0("null");
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
        m12887c1();
        m12883X0();
        this.f34716v0.mo1333c0(z6 ? "true" : "false");
        int[] iArr = this.f34574p0;
        int i10 = this.f34571Y - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m12883X0() {
        int iM12837j0 = m12837j0();
        int i10 = 2;
        if (iM12837j0 != 1) {
            InterfaceC0676j interfaceC0676j = this.f34716v0;
            if (iM12837j0 == 2) {
                interfaceC0676j.mo1328M(44);
                m12885Z0();
            } else if (iM12837j0 == 4) {
                interfaceC0676j.mo1333c0(this.f34717w0);
                i10 = 5;
            } else {
                if (iM12837j0 == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                if (iM12837j0 != 6) {
                    if (iM12837j0 != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f34576r0) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                i10 = 7;
            }
        } else {
            m12885Z0();
        }
        this.f34572Z[this.f34571Y - 1] = i10;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m12884Y0(char c9, int i10, int i11) {
        int iM12837j0 = m12837j0();
        if (iM12837j0 != i11 && iM12837j0 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f34718x0 != null) {
            throw new IllegalStateException("Dangling name: " + this.f34718x0);
        }
        int i12 = this.f34571Y;
        int i13 = ~this.f34579u0;
        if (i12 == i13) {
            this.f34579u0 = i13;
            return;
        }
        int i14 = i12 - 1;
        this.f34571Y = i14;
        this.f34573o0[i14] = null;
        int[] iArr = this.f34574p0;
        int i15 = i12 - 2;
        iArr[i15] = iArr[i15] + 1;
        if (iM12837j0 == i11) {
            m12885Z0();
        }
        this.f34716v0.mo1328M(c9);
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m12885Z0() {
        if (this.f34575q0 == null) {
            return;
        }
        InterfaceC0676j interfaceC0676j = this.f34716v0;
        interfaceC0676j.mo1328M(10);
        int i10 = this.f34571Y;
        for (int i11 = 1; i11 < i10; i11++) {
            interfaceC0676j.mo1333c0(this.f34575q0);
        }
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: a */
    public final AbstractC11440E mo12832a() {
        if (this.f34578t0) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + m12835P());
        }
        m12887c1();
        m12886a1('[', 1, 2);
        return this;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m12886a1(char c9, int i10, int i11) {
        int i12;
        int i13 = this.f34571Y;
        int i14 = this.f34579u0;
        if (i13 == i14 && ((i12 = this.f34572Z[i13 - 1]) == i10 || i12 == i11)) {
            this.f34579u0 = ~i14;
            return;
        }
        m12883X0();
        m12838k();
        m12839r0(i10);
        this.f34574p0[this.f34571Y - 1] = 0;
        this.f34716v0.mo1328M(c9);
    }

    /* JADX INFO: renamed from: c1 */
    public final void m12887c1() {
        if (this.f34718x0 != null) {
            int iM12837j0 = m12837j0();
            InterfaceC0676j interfaceC0676j = this.f34716v0;
            if (iM12837j0 == 5) {
                interfaceC0676j.mo1328M(44);
            } else if (iM12837j0 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m12885Z0();
            this.f34572Z[this.f34571Y - 1] = 4;
            m12882b1(interfaceC0676j, this.f34718x0);
            this.f34718x0 = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34716v0.close();
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
        m12887c1();
        m12886a1('{', 3, 5);
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f34571Y == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f34716v0.flush();
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: m */
    public final AbstractC11440E mo12834m() {
        m12884Y0(']', 1, 2);
        return this;
    }

    @Override // bj.AbstractC11440E
    /* JADX INFO: renamed from: v0 */
    public final void mo12840v0(String str) {
        super.mo12840v0(str);
        this.f34717w0 = !str.isEmpty() ? ": " : ":";
    }
}
