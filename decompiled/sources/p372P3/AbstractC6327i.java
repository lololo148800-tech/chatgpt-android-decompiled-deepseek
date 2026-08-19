package p372P3;

import android.gov.nist.core.Separators;
import co.AbstractC11828r;
import co.C11817g;
import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p013Ab.C0420b;
import p025An.C0644w;
import p1073w3.AbstractC20800b;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: P3.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6327i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20527a = 1;

    /* JADX INFO: renamed from: b */
    public int f20528b;

    /* JADX INFO: renamed from: c */
    public final Object f20529c;

    /* JADX INFO: renamed from: d */
    public Object f20530d;

    /* JADX INFO: renamed from: e */
    public Object f20531e;

    public AbstractC6327i(InterfaceC6324f interfaceC6324f, InterfaceC6326h interfaceC6326h, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f20530d = interfaceC6326h;
        this.f20528b = i10;
        this.f20529c = new C6322d(interfaceC6324f, j10, j11, j12, j13, j14);
    }

    /* JADX INFO: renamed from: B */
    public static int m6907B(C6330l c6330l, long j10, C6337s c6337s) {
        if (j10 == c6330l.f20548p0) {
            return 0;
        }
        c6337s.f20561a = j10;
        return 1;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m6908r(AbstractC6327i abstractC6327i, String str, int i10, String str2, int i11) {
        if ((i11 & 2) != 0) {
            i10 = abstractC6327i.f20528b;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        abstractC6327i.m6933q(i10, str, str2);
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m6909w(char c9) {
        return (c9 == ',' || c9 == ':' || c9 == ']' || c9 == '}') ? false : true;
    }

    /* JADX INFO: renamed from: A */
    public abstract int mo6910A(int i10);

    /* JADX INFO: renamed from: C */
    public void m6911C(long j10) {
        C6323e c6323e = (C6323e) this.f20531e;
        if (c6323e == null || c6323e.f20515a != j10) {
            C6322d c6322d = (C6322d) this.f20529c;
            this.f20531e = new C6323e(j10, c6322d.f20509a.mo3666c(j10), c6322d.f20511c, c6322d.f20512d, c6322d.f20513e, c6322d.f20514f);
        }
    }

    /* JADX INFO: renamed from: D */
    public abstract int mo6912D();

    /* JADX INFO: renamed from: E */
    public String mo6913E(int i10, int i11) {
        return mo6936u().subSequence(i10, i11).toString();
    }

    /* JADX INFO: renamed from: F */
    public boolean m6914F() {
        int iMo6912D = mo6912D();
        CharSequence charSequenceMo6936u = mo6936u();
        if (iMo6912D >= charSequenceMo6936u.length() || iMo6912D == -1 || charSequenceMo6936u.charAt(iMo6912D) != ',') {
            return false;
        }
        this.f20528b++;
        return true;
    }

    /* JADX INFO: renamed from: G */
    public boolean m6915G(boolean z6) {
        int iMo6910A = mo6910A(mo6912D());
        int length = mo6936u().length() - iMo6910A;
        if (length < 4 || iMo6910A == -1) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if ("null".charAt(i10) != mo6936u().charAt(iMo6910A + i10)) {
                return false;
            }
        }
        if (length > 4 && AbstractC11828r.m13103i(mo6936u().charAt(iMo6910A + 4)) == 0) {
            return false;
        }
        if (!z6) {
            return true;
        }
        this.f20528b = iMo6910A + 4;
        return true;
    }

    /* JADX INFO: renamed from: H */
    public void m6916H(char c9) {
        int i10 = this.f20528b;
        if (i10 > 0 && c9 == '\"') {
            try {
                this.f20528b = i10 - 1;
                String strM6928l = m6928l();
                this.f20528b = i10;
                if (AbstractC16544l.m18089b(strM6928l, "null")) {
                    m6933q(this.f20528b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th2) {
                this.f20528b = i10;
                throw th2;
            }
        }
        m6934s(AbstractC11828r.m13103i(c9), true);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public int m6917a(int i10, CharSequence charSequence) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            ((StringBuilder) this.f20531e).append((char) (m6935t(i10 + 3, charSequence) + (m6935t(i10, charSequence) << 12) + (m6935t(i10 + 1, charSequence) << 8) + (m6935t(i10 + 2, charSequence) << 4)));
            return i11;
        }
        this.f20528b = i10;
        mo6931o();
        if (this.f20528b + 4 < charSequence.length()) {
            return m6917a(this.f20528b, charSequence);
        }
        m6908r(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public void mo6918b(int i10, int i11) {
        ((StringBuilder) this.f20531e).append(mo6936u(), i10, i11);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo6919c();

    /* JADX INFO: renamed from: d */
    public void m6920d(int i10, String str) {
        if (mo6936u().length() - i10 < str.length()) {
            m6908r(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (mo6936u().charAt(i10 + i11) | ' ')) {
                m6908r(this, "Expected valid boolean literal prefix, but had '" + m6928l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f20528b = str.length() + i10;
    }

    /* JADX INFO: renamed from: e */
    public abstract String mo6921e();

    /* JADX INFO: renamed from: f */
    public abstract byte mo6922f();

    /* JADX INFO: renamed from: g */
    public byte m6923g(byte b) {
        byte bMo6922f = mo6922f();
        if (bMo6922f == b) {
            return bMo6922f;
        }
        m6934s(b, true);
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo6924h(char c9);

    /* JADX INFO: renamed from: i */
    public long m6925i() {
        boolean z6;
        String str;
        double dPow;
        int iMo6910A = mo6910A(mo6912D());
        String str2 = "EOF";
        int i10 = 0;
        if (iMo6910A >= mo6936u().length() || iMo6910A == -1) {
            m6908r(this, "EOF", 0, null, 6);
            throw null;
        }
        if (mo6936u().charAt(iMo6910A) == '\"') {
            iMo6910A++;
            if (iMo6910A == mo6936u().length()) {
                m6908r(this, "EOF", 0, null, 6);
                throw null;
            }
            z6 = true;
        } else {
            z6 = false;
        }
        int i11 = iMo6910A;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            if (i11 == mo6936u().length()) {
                str = str2;
                break;
            }
            char cCharAt = mo6936u().charAt(i11);
            if ((cCharAt == 'e' || cCharAt == 'E') && !z10) {
                if (i11 == iMo6910A) {
                    m6908r(this, "Unexpected symbol " + cCharAt + " in numeric literal", i10, null, 6);
                    throw null;
                }
                i11++;
                z10 = true;
            } else if (cCharAt == '-' && z10) {
                if (i11 == iMo6910A) {
                    m6908r(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                    throw null;
                }
                i11++;
                i10 = 0;
                z12 = false;
            } else if (cCharAt != '+' || !z10) {
                str = str2;
                if (cCharAt != '-') {
                    if (AbstractC11828r.m13103i(cCharAt) != 0) {
                        break;
                    }
                    i11++;
                    int i12 = cCharAt - '0';
                    if (i12 < 0 || i12 >= 10) {
                        m6908r(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    if (z10) {
                        j10 = (j10 * ((long) 10)) + ((long) i12);
                    } else {
                        j11 = (j11 * ((long) 10)) - ((long) i12);
                        if (j11 > 0) {
                            m6908r(this, "Numeric value overflow", 0, null, 6);
                            throw null;
                        }
                    }
                    str2 = str;
                    i10 = 0;
                } else {
                    if (i11 != iMo6910A) {
                        m6908r(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i11++;
                    str2 = str;
                    i10 = 0;
                    z11 = true;
                }
            } else {
                if (i11 == iMo6910A) {
                    m6908r(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                    throw null;
                }
                i11++;
                i10 = 0;
            }
            z12 = true;
        }
        boolean z13 = i11 != iMo6910A;
        if (iMo6910A == i11 || (z11 && iMo6910A == i11 - 1)) {
            m6908r(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z6) {
            if (!z13) {
                m6908r(this, str, 0, null, 6);
                throw null;
            }
            if (mo6936u().charAt(i11) != '\"') {
                m6908r(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i11++;
        }
        this.f20528b = i11;
        if (z10) {
            double d10 = j11;
            boolean z14 = z12;
            if (!z14) {
                dPow = Math.pow(10.0d, -j10);
            } else {
                if (!z14) {
                    throw new C0644w();
                }
                dPow = Math.pow(10.0d, j10);
            }
            double d11 = d10 * dPow;
            if (d11 > 9.223372036854776E18d || d11 < -9.223372036854776E18d) {
                m6908r(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d11) != d11) {
                m6908r(this, "Can't convert " + d11 + " to Long", 0, null, 6);
                throw null;
            }
            j11 = (long) d11;
        }
        if (z11) {
            return j11;
        }
        if (j11 != Long.MIN_VALUE) {
            return -j11;
        }
        m6908r(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public String m6926j() {
        String str = (String) this.f20530d;
        if (str == null) {
            return mo6921e();
        }
        AbstractC16544l.m18091d(str);
        this.f20530d = null;
        return str;
    }

    /* JADX INFO: renamed from: k */
    public String m6927k(int i10, int i11, CharSequence source) {
        AbstractC16544l.m18094g(source, "source");
        char cCharAt = source.charAt(i11);
        boolean z6 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                mo6918b(i10, i11);
                int iMo6910A = mo6910A(i11 + 1);
                if (iMo6910A == -1) {
                    m6908r(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int iM6917a = iMo6910A + 1;
                char cCharAt2 = mo6936u().charAt(iMo6910A);
                if (cCharAt2 == 'u') {
                    iM6917a = m6917a(iM6917a, mo6936u());
                } else {
                    char c9 = cCharAt2 < 'u' ? C11817g.f35820a[cCharAt2] : (char) 0;
                    if (c9 == 0) {
                        m6908r(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    ((StringBuilder) this.f20531e).append(c9);
                }
                i10 = mo6910A(iM6917a);
                if (i10 == -1) {
                    m6908r(this, "Unexpected EOF", i10, null, 4);
                    throw null;
                }
            } else {
                i11++;
                if (i11 >= source.length()) {
                    mo6918b(i10, i11);
                    i10 = mo6910A(i11);
                    if (i10 == -1) {
                        m6908r(this, "Unexpected EOF", i10, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                }
                cCharAt = source.charAt(i11);
            }
            i11 = i10;
            z6 = true;
            cCharAt = source.charAt(i11);
        }
        String strMo6913E = !z6 ? mo6913E(i10, i11) : m6930n(i10, i11);
        this.f20528b = i11 + 1;
        return strMo6913E;
    }

    /* JADX INFO: renamed from: l */
    public String m6928l() {
        String str = (String) this.f20530d;
        if (str != null) {
            AbstractC16544l.m18091d(str);
            this.f20530d = null;
            return str;
        }
        int iMo6912D = mo6912D();
        if (iMo6912D >= mo6936u().length() || iMo6912D == -1) {
            m6908r(this, "EOF", iMo6912D, null, 4);
            throw null;
        }
        byte bM13103i = AbstractC11828r.m13103i(mo6936u().charAt(iMo6912D));
        if (bM13103i == 1) {
            return m6926j();
        }
        if (bM13103i != 0) {
            m6908r(this, "Expected beginning of the string, but got " + mo6936u().charAt(iMo6912D), 0, null, 6);
            throw null;
        }
        boolean z6 = false;
        while (AbstractC11828r.m13103i(mo6936u().charAt(iMo6912D)) == 0) {
            iMo6912D++;
            if (iMo6912D >= mo6936u().length()) {
                mo6918b(this.f20528b, iMo6912D);
                int iMo6910A = mo6910A(iMo6912D);
                if (iMo6910A == -1) {
                    this.f20528b = iMo6912D;
                    return m6930n(0, 0);
                }
                iMo6912D = iMo6910A;
                z6 = true;
            }
        }
        String strMo6913E = !z6 ? mo6913E(this.f20528b, iMo6912D) : m6930n(this.f20528b, iMo6912D);
        this.f20528b = iMo6912D;
        return strMo6913E;
    }

    /* JADX INFO: renamed from: m */
    public String m6929m() {
        String strM6928l = m6928l();
        if (!AbstractC16544l.m18089b(strM6928l, "null") || mo6936u().charAt(this.f20528b - 1) == '\"') {
            return strM6928l;
        }
        m6908r(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public String m6930n(int i10, int i11) {
        mo6918b(i10, i11);
        StringBuilder sb2 = (StringBuilder) this.f20531e;
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        sb2.setLength(0);
        return string;
    }

    /* JADX INFO: renamed from: p */
    public void m6932p() {
        if (mo6922f() == 10) {
            return;
        }
        m6908r(this, "Expected EOF after parsing, but had " + mo6936u().charAt(this.f20528b - 1) + " instead", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public void m6933q(int i10, String message, String hint) {
        AbstractC16544l.m18094g(message, "message");
        AbstractC16544l.m18094g(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : Separators.RETURN.concat(hint);
        StringBuilder sbM9895n = AbstractC9306j0.m9895n(message, " at path: ");
        sbM9895n.append(((C0420b) this.f20529c).m1066v());
        sbM9895n.append(strConcat);
        throw AbstractC11828r.m13097c(i10, mo6936u(), sbM9895n.toString());
    }

    /* JADX INFO: renamed from: s */
    public void m6934s(byte b, boolean z6) {
        String strM13119y = AbstractC11828r.m13119y(b);
        int i10 = z6 ? this.f20528b - 1 : this.f20528b;
        m6908r(this, AbstractC0010F.m20d("Expected ", strM13119y, ", but had '", (this.f20528b == mo6936u().length() || i10 < 0) ? "EOF" : String.valueOf(mo6936u().charAt(i10)), "' instead"), i10, null, 4);
        throw null;
    }

    /* JADX INFO: renamed from: t */
    public int m6935t(int i10, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i10);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m6908r(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public String toString() {
        switch (this.f20527a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("JsonReader(source='");
                sb2.append((Object) mo6936u());
                sb2.append("', currentPosition=");
                return AbstractC12107L1.m13826q(sb2, this.f20528b, ')');
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public abstract CharSequence mo6936u();

    /* JADX INFO: renamed from: v */
    public int m6937v(C6330l c6330l, C6337s c6337s) {
        while (true) {
            C6323e c6323e = (C6323e) this.f20531e;
            AbstractC20800b.m21321i(c6323e);
            long j10 = c6323e.f20520f;
            long j11 = c6323e.f20521g;
            long j12 = c6323e.f20522h;
            long j13 = j11 - j10;
            long j14 = this.f20528b;
            InterfaceC6326h interfaceC6326h = (InterfaceC6326h) this.f20530d;
            if (j13 <= j14) {
                this.f20531e = null;
                interfaceC6326h.mo1054i();
                return m6907B(c6330l, j10, c6337s);
            }
            long j15 = j12 - c6330l.f20548p0;
            if (j15 < 0 || j15 > 262144) {
                return m6907B(c6330l, j12, c6337s);
            }
            c6330l.mo3052j((int) j15);
            c6330l.f20550r0 = 0;
            C6325g c6325gMo1050e = interfaceC6326h.mo1050e(c6330l, c6323e.f20516b);
            int i10 = c6325gMo1050e.f20524a;
            if (i10 == -3) {
                this.f20531e = null;
                interfaceC6326h.mo1054i();
                return m6907B(c6330l, j12, c6337s);
            }
            long j16 = c6325gMo1050e.f20525b;
            long j17 = c6325gMo1050e.f20526c;
            if (i10 == -2) {
                c6323e.f20518d = j16;
                c6323e.f20520f = j17;
                c6323e.f20522h = C6323e.m6906a(c6323e.f20516b, j16, c6323e.f20519e, j17, c6323e.f20521g, c6323e.f20517c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long j18 = j17 - c6330l.f20548p0;
                    if (j18 >= 0 && j18 <= 262144) {
                        c6330l.mo3052j((int) j18);
                    }
                    this.f20531e = null;
                    interfaceC6326h.mo1054i();
                    return m6907B(c6330l, j17, c6337s);
                }
                c6323e.f20519e = j16;
                c6323e.f20521g = j17;
                c6323e.f20522h = C6323e.m6906a(c6323e.f20516b, c6323e.f20518d, j16, c6323e.f20520f, j17, c6323e.f20517c);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public abstract String mo6938x(String str, boolean z6);

    /* JADX INFO: renamed from: y */
    public byte mo6939y() {
        CharSequence charSequenceMo6936u = mo6936u();
        int i10 = this.f20528b;
        while (true) {
            int iMo6910A = mo6910A(i10);
            if (iMo6910A == -1) {
                this.f20528b = iMo6910A;
                return (byte) 10;
            }
            char cCharAt = charSequenceMo6936u.charAt(iMo6910A);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f20528b = iMo6910A;
                return AbstractC11828r.m13103i(cCharAt);
            }
            i10 = iMo6910A + 1;
        }
    }

    /* JADX INFO: renamed from: z */
    public String m6940z(boolean z6) {
        String strM6926j;
        byte bMo6939y = mo6939y();
        if (z6) {
            if (bMo6939y != 1 && bMo6939y != 0) {
                return null;
            }
            strM6926j = m6928l();
        } else {
            if (bMo6939y != 1) {
                return null;
            }
            strM6926j = m6926j();
        }
        this.f20530d = strM6926j;
        return strM6926j;
    }

    public AbstractC6327i() {
        C0420b c0420b = new C0420b((char) 0, 12);
        c0420b.f1382o0 = new Object[8];
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        c0420b.f1383p0 = iArr;
        c0420b.f1381Z = -1;
        this.f20529c = c0420b;
        this.f20531e = new StringBuilder();
    }

    /* JADX INFO: renamed from: o */
    public void mo6931o() {
    }
}
