package p379Pb;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import p160G5.p161rK.TVCuK;
import p817j$.util.Objects;

/* JADX INFO: renamed from: Pb.c */
/* JADX INFO: loaded from: classes.dex */
public class C6382c implements Closeable, Flushable {

    /* JADX INFO: renamed from: u0 */
    public static final Pattern f20790u0 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: v0 */
    public static final String[] f20791v0 = new String[128];

    /* JADX INFO: renamed from: w0 */
    public static final String[] f20792w0;

    /* JADX INFO: renamed from: Y */
    public final Writer f20793Y;

    /* JADX INFO: renamed from: Z */
    public int[] f20794Z;

    /* JADX INFO: renamed from: o0 */
    public int f20795o0;

    /* JADX INFO: renamed from: p0 */
    public final String f20796p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f20797q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f20798r0;

    /* JADX INFO: renamed from: s0 */
    public String f20799s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f20800t0;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f20791v0[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f20791v0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f20792w0 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C6382c(Writer writer) {
        int[] iArr = new int[32];
        this.f20794Z = iArr;
        this.f20795o0 = 0;
        if (iArr.length == 0) {
            this.f20794Z = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f20794Z;
        int i10 = this.f20795o0;
        this.f20795o0 = i10 + 1;
        iArr2[i10] = 6;
        this.f20796p0 = ":";
        this.f20800t0 = true;
        Objects.requireNonNull(writer, "out == null");
        this.f20793Y = writer;
    }

    /* JADX INFO: renamed from: C0 */
    public void m7007C0(long j10) throws IOException {
        m7015V0();
        m7017a();
        this.f20793Y.write(Long.toString(j10));
    }

    /* JADX INFO: renamed from: E */
    public void m7008E() throws IOException {
        m7021m(']', 1, 2);
    }

    /* JADX INFO: renamed from: H0 */
    public void m7009H0(Number number) throws IOException {
        if (number == null) {
            m7016W();
            return;
        }
        m7015V0();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f20790u0.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f20797q0) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        m7017a();
        this.f20793Y.append((CharSequence) string);
    }

    /* JADX INFO: renamed from: J0 */
    public void m7010J0(String str) throws IOException {
        if (str == null) {
            m7016W();
            return;
        }
        m7015V0();
        m7017a();
        m7022r0(str);
    }

    /* JADX INFO: renamed from: P */
    public void m7012P() throws IOException {
        m7021m('}', 3, 5);
    }

    /* JADX INFO: renamed from: S */
    public void m7013S(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f20799s0 != null) {
            throw new IllegalStateException();
        }
        if (this.f20795o0 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f20799s0 = str;
    }

    /* JADX INFO: renamed from: V0 */
    public final void m7015V0() throws IOException {
        if (this.f20799s0 != null) {
            int iM7019j0 = m7019j0();
            if (iM7019j0 == 5) {
                this.f20793Y.write(44);
            } else if (iM7019j0 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m7014T();
            this.f20794Z[this.f20795o0 - 1] = 4;
            m7022r0(this.f20799s0);
            this.f20799s0 = null;
        }
    }

    /* JADX INFO: renamed from: W */
    public C6382c m7016W() throws IOException {
        if (this.f20799s0 != null) {
            if (!this.f20800t0) {
                this.f20799s0 = null;
                return this;
            }
            m7015V0();
        }
        m7017a();
        this.f20793Y.write("null");
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final void m7017a() throws IOException {
        int iM7019j0 = m7019j0();
        if (iM7019j0 == 1) {
            this.f20794Z[this.f20795o0 - 1] = 2;
            m7014T();
            return;
        }
        Writer writer = this.f20793Y;
        if (iM7019j0 == 2) {
            writer.append(',');
            m7014T();
        } else {
            if (iM7019j0 == 4) {
                writer.append((CharSequence) this.f20796p0);
                this.f20794Z[this.f20795o0 - 1] = 5;
                return;
            }
            if (iM7019j0 != 6) {
                if (iM7019j0 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f20797q0) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f20794Z[this.f20795o0 - 1] = 7;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f20793Y.close();
        int i10 = this.f20795o0;
        if (i10 > 1 || (i10 == 1 && this.f20794Z[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f20795o0 = 0;
    }

    /* JADX INFO: renamed from: e */
    public void m7018e() throws IOException {
        m7015V0();
        m7017a();
        int i10 = this.f20795o0;
        int[] iArr = this.f20794Z;
        if (i10 == iArr.length) {
            this.f20794Z = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f20794Z;
        int i11 = this.f20795o0;
        this.f20795o0 = i11 + 1;
        iArr2[i11] = 1;
        this.f20793Y.write(91);
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f20795o0 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f20793Y.flush();
    }

    /* JADX INFO: renamed from: j0 */
    public final int m7019j0() {
        int i10 = this.f20795o0;
        if (i10 != 0) {
            return this.f20794Z[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX INFO: renamed from: k */
    public void m7020k() throws IOException {
        m7015V0();
        m7017a();
        int i10 = this.f20795o0;
        int[] iArr = this.f20794Z;
        if (i10 == iArr.length) {
            this.f20794Z = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f20794Z;
        int i11 = this.f20795o0;
        this.f20795o0 = i11 + 1;
        iArr2[i11] = 3;
        this.f20793Y.write(123);
    }

    /* JADX INFO: renamed from: m */
    public final void m7021m(char c9, int i10, int i11) throws IOException {
        int iM7019j0 = m7019j0();
        if (iM7019j0 != i11 && iM7019j0 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f20799s0 != null) {
            throw new IllegalStateException("Dangling name: " + this.f20799s0);
        }
        this.f20795o0--;
        if (iM7019j0 == i11) {
            m7014T();
        }
        this.f20793Y.write(c9);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX INFO: renamed from: r0 */
    public final void m7022r0(String str) throws IOException {
        String str2;
        String[] strArr = this.f20798r0 ? f20792w0 : f20791v0;
        Writer writer = this.f20793Y;
        writer.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        writer.write(str, i10, i11 - i10);
                    }
                    writer.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    writer.write(str, i10, i11 - i10);
                }
                writer.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            writer.write(str, i10, length - i10);
        }
        writer.write(34);
    }

    /* JADX INFO: renamed from: v0 */
    public void m7023v0(double d10) throws IOException {
        m7015V0();
        if (this.f20797q0 || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            m7017a();
            this.f20793Y.append((CharSequence) Double.toString(d10));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void m7011N0(boolean z6) throws IOException {
        m7015V0();
        m7017a();
        this.f20793Y.write(z6 ? "true" : TVCuK.ZnkZJnAHDjLhV);
    }

    /* JADX INFO: renamed from: T */
    public final void m7014T() {
    }
}
