package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.vendor.gson.stream.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15515c implements Closeable, Flushable {

    /* JADX INFO: renamed from: u0 */
    public static final String[] f48456u0 = new String[128];

    /* JADX INFO: renamed from: Y */
    public final Writer f48457Y;

    /* JADX INFO: renamed from: Z */
    public int[] f48458Z;

    /* JADX INFO: renamed from: o0 */
    public int f48459o0;

    /* JADX INFO: renamed from: p0 */
    public String f48460p0;

    /* JADX INFO: renamed from: q0 */
    public String f48461q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f48462r0;

    /* JADX INFO: renamed from: s0 */
    public String f48463s0;

    /* JADX INFO: renamed from: t0 */
    public final boolean f48464t0;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f48456u0[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f48456u0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C15515c(Writer writer) {
        int[] iArr = new int[32];
        this.f48458Z = iArr;
        this.f48459o0 = 0;
        if (iArr.length == 0) {
            this.f48458Z = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f48458Z;
        int i10 = this.f48459o0;
        this.f48459o0 = i10 + 1;
        iArr2[i10] = 6;
        this.f48461q0 = ":";
        this.f48464t0 = true;
        this.f48457Y = writer;
    }

    /* JADX INFO: renamed from: E */
    public final int m16720E() {
        int i10 = this.f48459o0;
        if (i10 != 0) {
            return this.f48458Z[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX INFO: renamed from: P */
    public final void m16721P(String str) throws IOException {
        String str2;
        String[] strArr = f48456u0;
        Writer writer = this.f48457Y;
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

    /* JADX INFO: renamed from: S */
    public final void m16722S() throws IOException {
        if (this.f48463s0 != null) {
            int iM16720E = m16720E();
            if (iM16720E == 5) {
                this.f48457Y.write(44);
            } else if (iM16720E != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m16725k();
            this.f48458Z[this.f48459o0 - 1] = 4;
            m16721P(this.f48463s0);
            this.f48463s0 = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m16723a() throws IOException {
        int iM16720E = m16720E();
        if (iM16720E == 1) {
            this.f48458Z[this.f48459o0 - 1] = 2;
            m16725k();
            return;
        }
        Writer writer = this.f48457Y;
        if (iM16720E == 2) {
            writer.append(',');
            m16725k();
        } else {
            if (iM16720E == 4) {
                writer.append((CharSequence) this.f48461q0);
                this.f48458Z[this.f48459o0 - 1] = 5;
                return;
            }
            if (iM16720E != 6) {
                if (iM16720E != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f48462r0) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f48458Z[this.f48459o0 - 1] = 7;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f48457Y.close();
        int i10 = this.f48459o0;
        if (i10 > 1 || (i10 == 1 && this.f48458Z[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f48459o0 = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m16724e(char c9, int i10, int i11) throws IOException {
        int iM16720E = m16720E();
        if (iM16720E != i11 && iM16720E != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f48463s0 != null) {
            throw new IllegalStateException("Dangling name: " + this.f48463s0);
        }
        this.f48459o0--;
        if (iM16720E == i11) {
            m16725k();
        }
        this.f48457Y.write(c9);
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f48459o0 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f48457Y.flush();
    }

    /* JADX INFO: renamed from: k */
    public final void m16725k() throws IOException {
        if (this.f48460p0 == null) {
            return;
        }
        Writer writer = this.f48457Y;
        writer.write(10);
        int i10 = this.f48459o0;
        for (int i11 = 1; i11 < i10; i11++) {
            writer.write(this.f48460p0);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m16726m() throws IOException {
        if (this.f48463s0 != null) {
            if (!this.f48464t0) {
                this.f48463s0 = null;
                return;
            }
            m16722S();
        }
        m16723a();
        this.f48457Y.write("null");
    }
}
