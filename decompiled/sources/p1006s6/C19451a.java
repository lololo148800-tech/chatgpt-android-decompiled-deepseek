package p1006s6;

import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0675i;
import p509Uk.lpqL.SfpOlmlMATQ;
import p885m4.C17152b;

/* JADX INFO: renamed from: s6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C19451a implements InterfaceC19456f {

    /* JADX INFO: renamed from: t0 */
    public static final C17152b f61709t0 = new C17152b();

    /* JADX INFO: renamed from: u0 */
    public static final String[] f61710u0;

    /* JADX INFO: renamed from: Y */
    public final C0675i f61711Y;

    /* JADX INFO: renamed from: Z */
    public final String f61712Z;

    /* JADX INFO: renamed from: o0 */
    public int f61713o0;

    /* JADX INFO: renamed from: p0 */
    public int[] f61714p0 = new int[64];

    /* JADX INFO: renamed from: q0 */
    public String[] f61715q0 = new String[64];

    /* JADX INFO: renamed from: r0 */
    public int[] f61716r0 = new int[64];

    /* JADX INFO: renamed from: s0 */
    public String f61717s0;

    public C19451a(C0675i c0675i, String str) {
        this.f61711Y = c0675i;
        this.f61712Z = str;
        m20546P(6);
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: B */
    public final InterfaceC19456f mo20539B(long j10) {
        m20552k(String.valueOf(j10));
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: C */
    public final InterfaceC19456f mo20540C(int i10) {
        m20552k(String.valueOf(i10));
        return this;
    }

    /* JADX INFO: renamed from: E */
    public final int m20541E() {
        int i10 = this.f61713o0;
        if (i10 != 0) {
            return this.f61714p0[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: F */
    public final InterfaceC19456f mo20542F(double d10) {
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            m20552k(String.valueOf(d10));
            return this;
        }
        throw new IllegalArgumentException(("Numeric values must be finite, but was " + d10).toString());
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: I0 */
    public final InterfaceC19456f mo20543I0() {
        m20552k("null");
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: L */
    public final InterfaceC19456f mo20544L(String value) {
        AbstractC16544l.m18094g(value, "value");
        m20547S();
        m20549a();
        C17152b.m18913k(this.f61711Y, value);
        int[] iArr = this.f61716r0;
        int i10 = this.f61713o0 - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: M0 */
    public final InterfaceC19456f mo20545M0(String name) {
        AbstractC16544l.m18094g(name, "name");
        int i10 = this.f61713o0;
        if (i10 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (this.f61717s0 != null) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f61717s0 = name;
        this.f61715q0[i10 - 1] = name;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public final void m20546P(int i10) {
        int i11 = this.f61713o0;
        int[] iArr = this.f61714p0;
        if (i11 == iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC16544l.m18093f(iArrCopyOf, "copyOf(...)");
            this.f61714p0 = iArrCopyOf;
            String[] strArr = this.f61715q0;
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length * 2);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(...)");
            this.f61715q0 = (String[]) objArrCopyOf;
            int[] iArr2 = this.f61716r0;
            int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length * 2);
            AbstractC16544l.m18093f(iArrCopyOf2, "copyOf(...)");
            this.f61716r0 = iArrCopyOf2;
        }
        int[] iArr3 = this.f61714p0;
        int i12 = this.f61713o0;
        this.f61713o0 = i12 + 1;
        iArr3[i12] = i10;
    }

    /* JADX INFO: renamed from: S */
    public final void m20547S() {
        if (this.f61717s0 != null) {
            int iM20541E = m20541E();
            C0675i c0675i = this.f61711Y;
            if (iM20541E == 5) {
                c0675i.m1436f1(44);
            } else if (iM20541E != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m20553m();
            this.f61714p0[this.f61713o0 - 1] = 4;
            String str = this.f61717s0;
            AbstractC16544l.m18091d(str);
            C17152b.m18913k(c0675i, str);
            this.f61717s0 = null;
        }
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: X */
    public final InterfaceC19456f mo20548X(boolean z6) {
        m20552k(z6 ? "true" : "false");
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final void m20549a() {
        int iM20541E = m20541E();
        if (iM20541E == 1) {
            this.f61714p0[this.f61713o0 - 1] = 2;
            m20553m();
            return;
        }
        C0675i c0675i = this.f61711Y;
        if (iM20541E == 2) {
            c0675i.m1436f1(44);
            m20553m();
        } else if (iM20541E == 4) {
            String str = this.f61712Z;
            c0675i.m1444l1((str == null || str.length() == 0) ? ":" : ": ");
            this.f61714p0[this.f61713o0 - 1] = 5;
        } else if (iM20541E == 6) {
            this.f61714p0[this.f61713o0 - 1] = 7;
        } else {
            if (iM20541E == 7) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            throw new IllegalStateException("Nesting problem.");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f61711Y.getClass();
        int i10 = this.f61713o0;
        if (i10 > 1 || (i10 == 1 && this.f61714p0[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f61713o0 = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m20550e(int i10, int i11, String str) {
        int iM20541E = m20541E();
        if (iM20541E != i11 && iM20541E != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f61717s0 != null) {
            throw new IllegalStateException(("Dangling name: " + this.f61717s0).toString());
        }
        int i12 = this.f61713o0;
        int i13 = i12 - 1;
        this.f61713o0 = i13;
        this.f61715q0[i13] = null;
        int[] iArr = this.f61716r0;
        int i14 = i12 - 2;
        iArr[i14] = iArr[i14] + 1;
        if (iM20541E == i11) {
            m20553m();
        }
        this.f61711Y.m1444l1(str);
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: j */
    public final InterfaceC19456f mo20551j() {
        m20550e(3, 5, "}");
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final void m20552k(String value) {
        AbstractC16544l.m18094g(value, "value");
        m20547S();
        m20549a();
        this.f61711Y.m1444l1(value);
        int[] iArr = this.f61716r0;
        int i10 = this.f61713o0 - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    /* JADX INFO: renamed from: m */
    public final void m20553m() {
        String str = this.f61712Z;
        if (str == null) {
            return;
        }
        C0675i c0675i = this.f61711Y;
        c0675i.m1436f1(10);
        int i10 = this.f61713o0;
        for (int i11 = 1; i11 < i10; i11++) {
            c0675i.m1444l1(str);
        }
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: o */
    public final InterfaceC19456f mo20554o() {
        m20547S();
        m20549a();
        m20546P(3);
        this.f61716r0[this.f61713o0 - 1] = 0;
        this.f61711Y.m1444l1("{");
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: p */
    public final InterfaceC19456f mo20555p() {
        m20550e(1, 2, "]");
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: q */
    public final InterfaceC19456f mo20556q() {
        m20547S();
        m20549a();
        m20546P(1);
        this.f61716r0[this.f61713o0 - 1] = 0;
        this.f61711Y.m1444l1("[");
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: u0 */
    public final InterfaceC19456f mo20557u0(C19453c value) {
        AbstractC16544l.m18094g(value, "value");
        m20552k(value.f61733a);
        return this;
    }

    static {
        String[] strArr = new String[128];
        for (int i10 = 0; i10 < 32; i10++) {
            StringBuilder sb2 = new StringBuilder("\\u00");
            byte b = (byte) i10;
            f61709t0.getClass();
            StringBuilder sb3 = new StringBuilder();
            String str = SfpOlmlMATQ.rpQ;
            sb3.append(str.charAt(b >>> 4));
            sb3.append(str.charAt(b & 15));
            sb2.append(sb3.toString());
            strArr[i10] = sb2.toString();
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        f61710u0 = strArr;
    }
}
