package p1006s6;

import android.gov.nist.core.Separators;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p026Ao.InterfaceC0677k;
import p060C6.C1609f;
import p060C6.C1610g;
import p1113xn.C21307a;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17680n;
import p959q8.C18639a;

/* JADX INFO: renamed from: s6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C19452b implements InterfaceC19455e {

    /* JADX INFO: renamed from: A0 */
    public static final C0678l f61718A0;

    /* JADX INFO: renamed from: y0 */
    public static final C0678l f61719y0;

    /* JADX INFO: renamed from: z0 */
    public static final C0678l f61720z0;

    /* JADX INFO: renamed from: Y */
    public final InterfaceC0677k f61721Y;

    /* JADX INFO: renamed from: Z */
    public final C0675i f61722Z;

    /* JADX INFO: renamed from: o0 */
    public int f61723o0;

    /* JADX INFO: renamed from: p0 */
    public long f61724p0;

    /* JADX INFO: renamed from: q0 */
    public int f61725q0;

    /* JADX INFO: renamed from: r0 */
    public String f61726r0;

    /* JADX INFO: renamed from: s0 */
    public int[] f61727s0;

    /* JADX INFO: renamed from: t0 */
    public int f61728t0;

    /* JADX INFO: renamed from: u0 */
    public String[] f61729u0;

    /* JADX INFO: renamed from: v0 */
    public int[] f61730v0;

    /* JADX INFO: renamed from: w0 */
    public int[] f61731w0;

    /* JADX INFO: renamed from: x0 */
    public int f61732x0;

    static {
        C0678l c0678l = C0678l.f1971p0;
        f61719y0 = C18639a.m19996n("'\\");
        f61720z0 = C18639a.m19996n("\"\\");
        f61718A0 = C18639a.m19996n("{}[]:, \n\t\r/\\;#=");
    }

    public C19452b(InterfaceC0677k source) {
        AbstractC16544l.m18094g(source, "source");
        this.f61721Y = source;
        this.f61722Z = source.mo1353b();
        int[] iArr = new int[64];
        iArr[0] = 6;
        this.f61727s0 = iArr;
        this.f61728t0 = 1;
        this.f61729u0 = new String[64];
        this.f61730v0 = new int[64];
        int[] iArr2 = new int[64];
        iArr2[0] = 0;
        this.f61731w0 = iArr2;
        this.f61732x0 = 1;
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: B0 */
    public final int mo20558B0(List names) throws EOFException {
        AbstractC16544l.m18094g(names, "names");
        if (names.isEmpty()) {
            return -1;
        }
        while (hasNext()) {
            String strMo20570a0 = mo20570a0();
            int i10 = this.f61731w0[this.f61732x0 - 1];
            if (AbstractC16544l.m18089b(names.get(i10), strMo20570a0)) {
                int[] iArr = this.f61731w0;
                int i11 = this.f61732x0;
                iArr[i11 - 1] = i10 + 1;
                if (iArr[i11 - 1] == names.size()) {
                    this.f61731w0[this.f61732x0 - 1] = 0;
                }
                return i10;
            }
            int i12 = i10;
            while (true) {
                i12++;
                if (i12 == names.size()) {
                    i12 = 0;
                }
                if (i12 == i10) {
                    break;
                }
                if (AbstractC16544l.m18089b(names.get(i12), strMo20570a0)) {
                    int[] iArr2 = this.f61731w0;
                    int i13 = this.f61732x0;
                    iArr2[i13 - 1] = i12 + 1;
                    if (iArr2[i13 - 1] == names.size()) {
                        this.f61731w0[this.f61732x0 - 1] = 0;
                    }
                    return i12;
                }
            }
            mo20559D();
        }
        return -1;
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: D */
    public final void mo20559D() throws EOFException {
        int i10 = 0;
        do {
            int i11 = this.f61723o0;
            Integer numValueOf = Integer.valueOf(i11);
            if (i11 == 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : m20569a();
            C0675i c0675i = this.f61722Z;
            switch (iIntValue) {
                case 1:
                    m20565S(3);
                    i10++;
                    break;
                case 2:
                    this.f61728t0--;
                    i10--;
                    break;
                case 3:
                    m20565S(1);
                    i10++;
                    break;
                case 4:
                    this.f61728t0--;
                    i10--;
                    break;
                case 8:
                case 12:
                    m20568W(f61719y0);
                    break;
                case 9:
                case 13:
                    m20568W(f61720z0);
                    break;
                case 10:
                case 14:
                    long jMo1344L0 = this.f61721Y.mo1344L0(f61718A0);
                    if (jMo1344L0 == -1) {
                        jMo1344L0 = c0675i.f1970Z;
                    }
                    c0675i.skip(jMo1344L0);
                    break;
                case 16:
                    c0675i.skip(this.f61725q0);
                    break;
            }
            this.f61723o0 = 0;
        } while (i10 != 0);
        int[] iArr = this.f61730v0;
        int i12 = this.f61728t0 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f61729u0[i12] = "null";
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: D0 */
    public final void mo20560D0() {
        throw new IllegalStateException("BufferedSourceJsonReader cannot rewind.");
    }

    /* JADX INFO: renamed from: E */
    public final String m20561E(C0678l c0678l) throws EOFException {
        StringBuilder sb2 = null;
        while (true) {
            long jMo1344L0 = this.f61721Y.mo1344L0(c0678l);
            if (jMo1344L0 == -1) {
                m20575j0("Unterminated string");
                throw null;
            }
            C0675i c0675i = this.f61722Z;
            if (c0675i.m1422T(jMo1344L0) != 92) {
                if (sb2 == null) {
                    String strM1427Y0 = c0675i.m1427Y0(jMo1344L0, C21307a.f67720a);
                    c0675i.readByte();
                    return strM1427Y0;
                }
                sb2.append(c0675i.m1427Y0(jMo1344L0, C21307a.f67720a));
                c0675i.readByte();
                String string = sb2.toString();
                AbstractC16544l.m18091d(string);
                return string;
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(c0675i.m1427Y0(jMo1344L0, C21307a.f67720a));
            c0675i.readByte();
            sb2.append(m20567T());
        }
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: E0 */
    public final long mo20562E0() throws EOFException {
        Integer numValueOf = Integer.valueOf(this.f61723o0);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : m20569a();
        if (iIntValue == 15) {
            this.f61723o0 = 0;
            int[] iArr = this.f61730v0;
            int i10 = this.f61728t0 - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f61724p0;
        }
        if (iIntValue == 16) {
            long j10 = this.f61725q0;
            C0675i c0675i = this.f61722Z;
            c0675i.getClass();
            this.f61726r0 = c0675i.m1427Y0(j10, C21307a.f67720a);
        } else if (iIntValue == 9 || iIntValue == 8) {
            String strM20561E = m20561E(iIntValue == 9 ? f61720z0 : f61719y0);
            this.f61726r0 = strM20561E;
            try {
                long j11 = Long.parseLong(strM20561E);
                this.f61723o0 = 0;
                int[] iArr2 = this.f61730v0;
                int i11 = this.f61728t0 - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j11;
            } catch (NumberFormatException unused) {
            }
        } else if (iIntValue != 11) {
            throw new C1609f("Expected a long but was " + peek() + " at path " + m20571e());
        }
        this.f61723o0 = 11;
        try {
            String str = this.f61726r0;
            AbstractC16544l.m18091d(str);
            double d10 = Double.parseDouble(str);
            long j12 = (long) d10;
            if (j12 != d10) {
                throw new C1609f("Expected a long but was " + this.f61726r0 + " at path " + m20571e());
            }
            this.f61726r0 = null;
            this.f61723o0 = 0;
            int[] iArr3 = this.f61730v0;
            int i12 = this.f61728t0 - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return j12;
        } catch (NumberFormatException unused2) {
            throw new C1609f("Expected a long but was " + this.f61726r0 + " at path " + m20571e());
        }
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: O */
    public final double mo20563O() {
        Integer numValueOf = Integer.valueOf(this.f61723o0);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : m20569a();
        if (iIntValue == 15) {
            this.f61723o0 = 0;
            int[] iArr = this.f61730v0;
            int i10 = this.f61728t0 - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f61724p0;
        }
        if (iIntValue == 16) {
            long j10 = this.f61725q0;
            C0675i c0675i = this.f61722Z;
            c0675i.getClass();
            this.f61726r0 = c0675i.m1427Y0(j10, C21307a.f67720a);
        } else if (iIntValue == 9) {
            this.f61726r0 = m20561E(f61720z0);
        } else if (iIntValue == 8) {
            this.f61726r0 = m20561E(f61719y0);
        } else if (iIntValue == 10) {
            this.f61726r0 = m20564P();
        } else if (iIntValue != 11) {
            throw new C1609f("Expected a double but was " + peek() + " at path " + m20571e());
        }
        this.f61723o0 = 11;
        try {
            String str = this.f61726r0;
            AbstractC16544l.m18091d(str);
            double d10 = Double.parseDouble(str);
            if (Double.isNaN(d10) || Double.isInfinite(d10)) {
                throw new C1610g("JSON forbids NaN and infinities: " + d10 + " at path " + m20571e());
            }
            this.f61726r0 = null;
            this.f61723o0 = 0;
            int[] iArr2 = this.f61730v0;
            int i11 = this.f61728t0 - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return d10;
        } catch (NumberFormatException unused) {
            throw new C1609f("Expected a double but was " + this.f61726r0 + " at path " + m20571e());
        }
    }

    /* JADX INFO: renamed from: P */
    public final String m20564P() {
        long jMo1344L0 = this.f61721Y.mo1344L0(f61718A0);
        C0675i c0675i = this.f61722Z;
        if (jMo1344L0 == -1) {
            return c0675i.m1428Z0();
        }
        c0675i.getClass();
        return c0675i.m1427Y0(jMo1344L0, C21307a.f67720a);
    }

    /* JADX INFO: renamed from: S */
    public final void m20565S(int i10) {
        int i11 = this.f61728t0;
        int[] iArr = this.f61727s0;
        if (i11 == iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC16544l.m18093f(iArrCopyOf, "copyOf(...)");
            this.f61727s0 = iArrCopyOf;
            String[] strArr = this.f61729u0;
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length * 2);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(...)");
            this.f61729u0 = (String[]) objArrCopyOf;
            int[] iArr2 = this.f61730v0;
            int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length * 2);
            AbstractC16544l.m18093f(iArrCopyOf2, "copyOf(...)");
            this.f61730v0 = iArrCopyOf2;
            int[] iArr3 = this.f61731w0;
            int[] iArrCopyOf3 = Arrays.copyOf(iArr3, iArr3.length * 2);
            AbstractC16544l.m18093f(iArrCopyOf3, "copyOf(...)");
            this.f61731w0 = iArrCopyOf3;
        }
        int[] iArr4 = this.f61727s0;
        int i12 = this.f61728t0;
        this.f61728t0 = i12 + 1;
        iArr4[i12] = i10;
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: S0 */
    public final boolean mo20566S0() {
        Integer numValueOf = Integer.valueOf(this.f61723o0);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : m20569a();
        if (iIntValue == 5) {
            this.f61723o0 = 0;
            int[] iArr = this.f61730v0;
            int i10 = this.f61728t0 - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iIntValue == 6) {
            this.f61723o0 = 0;
            int[] iArr2 = this.f61730v0;
            int i11 = this.f61728t0 - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new C1609f("Expected a boolean but was " + peek() + " at path " + m20571e());
    }

    /* JADX INFO: renamed from: T */
    public final char m20567T() throws EOFException {
        int i10;
        InterfaceC0677k interfaceC0677k = this.f61721Y;
        if (!interfaceC0677k.mo1359l(1L)) {
            m20575j0("Unterminated escape sequence");
            throw null;
        }
        C0675i c0675i = this.f61722Z;
        char c9 = (char) c0675i.readByte();
        if (c9 != 'u') {
            if (c9 == 't') {
                return '\t';
            }
            if (c9 == 'b') {
                return '\b';
            }
            if (c9 == 'n') {
                return '\n';
            }
            if (c9 == 'r') {
                return '\r';
            }
            if (c9 == 'f') {
                return '\f';
            }
            if (c9 == '\n' || c9 == '\'' || c9 == '\"' || c9 == '\\' || c9 == '/') {
                return c9;
            }
            m20575j0("Invalid escape sequence: \\" + c9);
            throw null;
        }
        if (!interfaceC0677k.mo1359l(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + mo20578n());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bM1422T = c0675i.m1422T(i11);
            char c11 = (char) (c10 << 4);
            if (bM1422T >= 48 && bM1422T <= 57) {
                i10 = bM1422T - 48;
            } else if (bM1422T >= 97 && bM1422T <= 102) {
                i10 = bM1422T - 87;
            } else {
                if (bM1422T < 65 || bM1422T > 70) {
                    m20575j0("\\u".concat(c0675i.m1427Y0(4L, C21307a.f67720a)));
                    throw null;
                }
                i10 = bM1422T - 55;
            }
            c10 = (char) (c11 + i10);
        }
        c0675i.skip(4L);
        return c10;
    }

    /* JADX INFO: renamed from: W */
    public final void m20568W(C0678l c0678l) throws EOFException {
        while (true) {
            long jMo1344L0 = this.f61721Y.mo1344L0(c0678l);
            if (jMo1344L0 == -1) {
                m20575j0("Unterminated string");
                throw null;
            }
            C0675i c0675i = this.f61722Z;
            if (c0675i.m1422T(jMo1344L0) != 92) {
                c0675i.skip(jMo1344L0 + 1);
                return;
            } else {
                c0675i.skip(jMo1344L0 + 1);
                m20567T();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0176 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:112:0x0177  */
    /* JADX WARN: Code duplicated, block: B:115:0x0187  */
    /* JADX WARN: Code duplicated, block: B:117:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x019e  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:187:0x0241  */
    /* JADX WARN: Code duplicated, block: B:197:0x025c  */
    /* JADX WARN: Code duplicated, block: B:205:0x026d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:206:0x026e  */
    /* JADX WARN: Code duplicated, block: B:208:0x027b  */
    /* JADX WARN: Code duplicated, block: B:210:0x0282  */
    /* JADX WARN: Code duplicated, block: B:219:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0194 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final int m20569a() throws EOFException {
        String str;
        String str2;
        int i10;
        byte bM1422T;
        int i11;
        char c9;
        boolean z6;
        boolean z10;
        long j10;
        String str3;
        char c10;
        int i12;
        char c11;
        char c12;
        int[] iArr = this.f61727s0;
        int i13 = this.f61728t0 - 1;
        int i14 = iArr[i13];
        String str4 = "Malformed JSON";
        char c13 = 5;
        C0675i c0675i = this.f61722Z;
        switch (i14) {
            case 1:
                iArr[i13] = 2;
                break;
            case 2:
                int iM20577m = m20577m(true);
                c0675i.readByte();
                char c14 = (char) iM20577m;
                if (c14 == ']') {
                    this.f61723o0 = 4;
                    return 4;
                }
                if (c14 != ',') {
                    m20575j0("Unterminated array");
                    throw null;
                }
                break;
            case 3:
            case 5:
                iArr[i13] = 4;
                if (i14 == 5) {
                    int iM20577m2 = m20577m(true);
                    c0675i.readByte();
                    char c15 = (char) iM20577m2;
                    if (c15 == '}') {
                        this.f61723o0 = 2;
                        return 2;
                    }
                    if (c15 != ',') {
                        m20575j0("Unterminated object");
                        throw null;
                    }
                }
                char cM20577m = (char) m20577m(true);
                if (cM20577m == '\"') {
                    c0675i.readByte();
                    this.f61723o0 = 13;
                    return 13;
                }
                if (cM20577m != '}') {
                    m20575j0("Unexpected character: " + cM20577m);
                    throw null;
                }
                if (i14 == 5) {
                    m20575j0("Expected name");
                    throw null;
                }
                c0675i.readByte();
                this.f61723o0 = 2;
                return 2;
            case 4:
                iArr[i13] = 5;
                int iM20577m3 = m20577m(true);
                c0675i.readByte();
                if (((char) iM20577m3) != ':') {
                    m20575j0("Expected ':'");
                    throw null;
                }
                break;
            case 6:
                iArr[i13] = 7;
                break;
            case 7:
                if (m20577m(false) == -1) {
                    this.f61723o0 = 17;
                    return 17;
                }
                m20575j0("Malformed JSON");
                throw null;
            default:
                if (i14 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                break;
        }
        char cM20577m2 = (char) m20577m(true);
        if (cM20577m2 == ']') {
            if (i14 != 1) {
                m20575j0("Unexpected value");
                throw null;
            }
            c0675i.readByte();
            this.f61723o0 = 4;
            return 4;
        }
        if (cM20577m2 == ';' || cM20577m2 == ',' || cM20577m2 == '\'') {
            m20575j0("Unexpected value");
            throw null;
        }
        if (cM20577m2 == '\"') {
            c0675i.readByte();
            this.f61723o0 = 9;
            return 9;
        }
        if (cM20577m2 == '[') {
            c0675i.readByte();
            this.f61723o0 = 3;
            return 3;
        }
        if (cM20577m2 == '{') {
            c0675i.readByte();
            this.f61723o0 = 1;
            return 1;
        }
        byte bM1422T2 = c0675i.m1422T(0L);
        InterfaceC0677k interfaceC0677k = this.f61721Y;
        if (bM1422T2 == 116 || bM1422T2 == 84) {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else {
            if (bM1422T2 != 102 && bM1422T2 != 70) {
                if (bM1422T2 == 110 || bM1422T2 == 78) {
                    str = "null";
                    str2 = "NULL";
                    i10 = 7;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    return i10;
                }
                i11 = 0;
                c9 = 0;
                long j11 = 0;
                z6 = false;
                z10 = true;
                while (true) {
                    j10 = i11;
                    str3 = str4;
                    if (!interfaceC0677k.mo1359l(j10 + 1)) {
                        byte bM1422T3 = c0675i.m1422T(j10);
                        c11 = (char) bM1422T3;
                        if (c11 == '-') {
                            if (c11 == '+') {
                                if (c9 != c13) {
                                }
                                c9 = 6;
                            } else if (c11 != 'e' || c11 == 'E') {
                                if (c9 != c12 || c9 == 4) {
                                    c9 = c13;
                                    i11++;
                                    c13 = c13;
                                    str4 = str3;
                                }
                            } else if (c11 == '.') {
                                if (c9 == 2) {
                                    c13 = c13;
                                    c9 = 3;
                                }
                            } else {
                                if (bM1422T3 < 48 || bM1422T3 > 57) {
                                    if (!m20576k(c11)) {
                                    }
                                    if (i12 != 0) {
                                        return i12;
                                    }
                                    if (m20576k((char) c0675i.m1422T(0L))) {
                                        m20575j0(str3);
                                        throw null;
                                    }
                                    m20575j0("Expected value");
                                    throw null;
                                }
                                if (c9 == 0 || c9 == 1) {
                                    char c16 = 6;
                                    j11 = -(bM1422T3 - 48);
                                    c9 = 2;
                                    c13 = 5;
                                } else if (c9 != 2) {
                                    if (c9 == 3) {
                                        c9 = 4;
                                        c13 = 5;
                                    } else if (c9 == 5 || c9 == 6) {
                                        c13 = 5;
                                        c9 = 7;
                                    } else {
                                        c13 = 5;
                                    }
                                } else if (j11 != 0) {
                                    long j12 = (((long) 10) * j11) - ((long) (bM1422T3 - 48));
                                    z10 = (z10 && ((j11 > (-922337203685477580L) ? 1 : (j11 == (-922337203685477580L) ? 0 : -1)) > 0)) || (j11 == -922337203685477580L && j12 < j11);
                                    j11 = j12;
                                    c13 = 5;
                                }
                                i11++;
                                c13 = c13;
                                str4 = str3;
                            }
                            i12 = 0;
                            if (i12 != 0) {
                                return i12;
                            }
                            if (m20576k((char) c0675i.m1422T(0L))) {
                                m20575j0("Expected value");
                                throw null;
                            }
                            m20575j0(str3);
                            throw null;
                        }
                        if (c9 != 0) {
                            if (c9 != c13) {
                                i12 = 0;
                                if (i12 != 0) {
                                    return i12;
                                }
                                if (m20576k((char) c0675i.m1422T(0L))) {
                                    m20575j0("Expected value");
                                    throw null;
                                }
                                m20575j0(str3);
                                throw null;
                            }
                            c9 = 6;
                        } else {
                            c9 = 1;
                            z6 = true;
                        }
                        i11++;
                        c13 = c13;
                        str4 = str3;
                    }
                    if (c9 == 2) {
                        if (z10 || (j11 == Long.MIN_VALUE && !z6)) {
                            c10 = 2;
                        } else {
                            if (!z6) {
                                j11 = -j11;
                            }
                            this.f61724p0 = j11;
                            c0675i.skip(j10);
                            i12 = 15;
                            this.f61723o0 = 15;
                        }
                        if (i12 != 0) {
                            return i12;
                        }
                        if (m20576k((char) c0675i.m1422T(0L))) {
                            m20575j0("Expected value");
                            throw null;
                        }
                        m20575j0(str3);
                        throw null;
                    }
                    c10 = 2;
                    if (c9 != c10 || c9 == 4 || c9 == 7) {
                        this.f61725q0 = i11;
                        i12 = 16;
                        this.f61723o0 = 16;
                    } else {
                        i12 = 0;
                    }
                    if (i12 != 0) {
                        return i12;
                    }
                    if (m20576k((char) c0675i.m1422T(0L))) {
                        m20575j0("Expected value");
                        throw null;
                    }
                    m20575j0(str3);
                    throw null;
                }
            }
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        }
        int length = str.length();
        int i15 = 1;
        while (true) {
            if (i15 < length) {
                long j13 = i15;
                if (interfaceC0677k.mo1359l(j13 + 1) && ((bM1422T = c0675i.m1422T(j13)) == ((byte) str.charAt(i15)) || bM1422T == ((byte) str2.charAt(i15)))) {
                    i15++;
                }
            } else {
                long j14 = length;
                if (!interfaceC0677k.mo1359l(j14 + 1) || !m20576k((char) c0675i.m1422T(j14))) {
                    c0675i.skip(j14);
                    this.f61723o0 = i10;
                }
            }
            i10 = 0;
        }
        if (i10 != 0) {
            return i10;
        }
        i11 = 0;
        c9 = 0;
        long j15 = 0;
        z6 = false;
        z10 = true;
        while (true) {
            j10 = i11;
            str3 = str4;
            if (!interfaceC0677k.mo1359l(j10 + 1)) {
                byte bM1422T4 = c0675i.m1422T(j10);
                c11 = (char) bM1422T4;
                if (c11 == '-') {
                    if (c11 == '+') {
                        if (c9 != c13) {
                        }
                        c9 = 6;
                    } else {
                        c12 = c11 != 'e' ? (char) 2 : (char) 2;
                        if (c9 != c12) {
                        }
                        c9 = c13;
                        i11++;
                        c13 = c13;
                        str4 = str3;
                    }
                    i12 = 0;
                    if (i12 != 0) {
                        return i12;
                    }
                    if (m20576k((char) c0675i.m1422T(0L))) {
                        m20575j0("Expected value");
                        throw null;
                    }
                    m20575j0(str3);
                    throw null;
                }
                if (c9 != 0) {
                    if (c9 != c13) {
                        i12 = 0;
                        if (i12 != 0) {
                            return i12;
                        }
                        if (m20576k((char) c0675i.m1422T(0L))) {
                            m20575j0("Expected value");
                            throw null;
                        }
                        m20575j0(str3);
                        throw null;
                    }
                    c9 = 6;
                } else {
                    c9 = 1;
                    z6 = true;
                }
                i11++;
                c13 = c13;
                str4 = str3;
            }
            if (c9 == 2) {
                if (z10) {
                }
                c10 = 2;
            } else {
                c10 = 2;
            }
            if (c9 != c10) {
            }
            this.f61725q0 = i11;
            i12 = 16;
            this.f61723o0 = 16;
            if (i12 != 0) {
                return i12;
            }
            if (m20576k((char) c0675i.m1422T(0L))) {
                m20575j0("Expected value");
                throw null;
            }
            m20575j0(str3);
            throw null;
        }
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: a0 */
    public final String mo20570a0() throws EOFException {
        String strM20561E;
        Integer numValueOf = Integer.valueOf(this.f61723o0);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        switch (numValueOf != null ? numValueOf.intValue() : m20569a()) {
            case 12:
                strM20561E = m20561E(f61719y0);
                break;
            case 13:
                strM20561E = m20561E(f61720z0);
                break;
            case 14:
                strM20561E = m20564P();
                break;
            default:
                throw new C1609f("Expected a name but was " + peek() + " at path " + m20571e());
        }
        this.f61723o0 = 0;
        this.f61729u0[this.f61728t0 - 1] = strM20561E;
        return strM20561E;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f61723o0 = 0;
        this.f61727s0[0] = 8;
        this.f61728t0 = 1;
        this.f61722Z.m1429a();
        this.f61721Y.close();
    }

    /* JADX INFO: renamed from: e */
    public final String m20571e() {
        return AbstractC17680n.m19349Y(mo20578n(), Separators.DOT, null, null, 0, null, null, 62);
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: e0 */
    public final void mo20572e0() {
        int i10 = this.f61723o0;
        Integer numValueOf = Integer.valueOf(i10);
        if (i10 == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : m20569a()) == 7) {
            this.f61723o0 = 0;
            int[] iArr = this.f61730v0;
            int i11 = this.f61728t0 - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new C1609f("Expected null but was " + peek() + " at path " + m20571e());
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: g0 */
    public final int mo20573g0() throws EOFException {
        int i10 = this.f61723o0;
        Integer numValueOf = Integer.valueOf(i10);
        if (i10 == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : m20569a();
        if (iIntValue == 15) {
            long j10 = this.f61724p0;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f61723o0 = 0;
                int[] iArr = this.f61730v0;
                int i12 = this.f61728t0 - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new C1609f("Expected an int but was " + this.f61724p0 + " at path " + mo20578n());
        }
        if (iIntValue == 16) {
            long j11 = this.f61725q0;
            C0675i c0675i = this.f61722Z;
            c0675i.getClass();
            this.f61726r0 = c0675i.m1427Y0(j11, C21307a.f67720a);
        } else if (iIntValue == 9 || iIntValue == 8) {
            String strM20561E = m20561E(iIntValue == 9 ? f61720z0 : f61719y0);
            this.f61726r0 = strM20561E;
            try {
                int i13 = Integer.parseInt(strM20561E);
                this.f61723o0 = 0;
                int[] iArr2 = this.f61730v0;
                int i14 = this.f61728t0 - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return i13;
            } catch (NumberFormatException unused) {
            }
        } else if (iIntValue != 11) {
            throw new C1609f("Expected an int but was " + peek() + " at path " + m20571e());
        }
        this.f61723o0 = 11;
        try {
            String str = this.f61726r0;
            AbstractC16544l.m18091d(str);
            double d10 = Double.parseDouble(str);
            int i15 = (int) d10;
            if (i15 != d10) {
                throw new C1609f("Expected an int but was " + this.f61726r0 + " at path " + m20571e());
            }
            this.f61726r0 = null;
            this.f61723o0 = 0;
            int[] iArr3 = this.f61730v0;
            int i16 = this.f61728t0 - 1;
            iArr3[i16] = iArr3[i16] + 1;
            return i15;
        } catch (NumberFormatException unused2) {
            throw new C1609f("Expected an int but was " + this.f61726r0 + " at path " + m20571e());
        }
    }

    @Override // p1006s6.InterfaceC19455e
    public final boolean hasNext() {
        Integer numValueOf = Integer.valueOf(this.f61723o0);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : m20569a();
        return (iIntValue == 2 || iIntValue == 4) ? false : true;
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: j */
    public final InterfaceC19455e mo20574j() {
        Integer numValueOf = Integer.valueOf(this.f61723o0);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : m20569a()) != 2) {
            throw new C1609f("Expected END_OBJECT but was " + peek() + " at path " + m20571e());
        }
        int i10 = this.f61728t0;
        int i11 = i10 - 1;
        this.f61728t0 = i11;
        this.f61729u0[i11] = null;
        int[] iArr = this.f61730v0;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f61723o0 = 0;
        this.f61732x0--;
        return this;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m20575j0(String str) {
        StringBuilder sbM9895n = AbstractC9306j0.m9895n(str, " at path ");
        sbM9895n.append(mo20578n());
        throw new C1610g(sbM9895n.toString());
    }

    /* JADX INFO: renamed from: k */
    public final boolean m20576k(char c9) {
        if (c9 != '/' && c9 != '\\' && c9 != ';' && c9 != '#' && c9 != '=') {
            return (c9 == '{' || c9 == '}' || c9 == '[' || c9 == ']' || c9 == ':' || c9 == ',' || c9 == ' ' || c9 == '\t' || c9 == '\r' || c9 == '\n') ? false : true;
        }
        m20575j0("Unexpected character: " + c9);
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public final int m20577m(boolean z6) throws EOFException {
        int i10 = 0;
        while (true) {
            long j10 = i10;
            InterfaceC0677k interfaceC0677k = this.f61721Y;
            if (!interfaceC0677k.mo1359l(j10 + 1)) {
                if (z6) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            i10++;
            C0675i c0675i = this.f61722Z;
            byte bM1422T = c0675i.m1422T(j10);
            if (bM1422T != 9 && bM1422T != 10 && bM1422T != 13 && bM1422T != 32) {
                c0675i.skip(((long) i10) - 1);
                if (bM1422T == 35) {
                    m20575j0("Malformed JSON");
                    throw null;
                }
                if (bM1422T != 47 || !interfaceC0677k.mo1359l(2L)) {
                    return bM1422T;
                }
                m20575j0("Malformed JSON");
                throw null;
            }
        }
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: n */
    public final ArrayList mo20578n() {
        String str;
        int i10 = this.f61728t0;
        int[] stack = this.f61727s0;
        String[] pathNames = this.f61729u0;
        int[] pathIndices = this.f61730v0;
        AbstractC16544l.m18094g(stack, "stack");
        AbstractC16544l.m18094g(pathNames, "pathNames");
        AbstractC16544l.m18094g(pathIndices, "pathIndices");
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = stack[i11];
            if (i12 == 1 || i12 == 2) {
                arrayList.add(Integer.valueOf(pathIndices[i11]));
            } else if ((i12 == 3 || i12 == 4 || i12 == 5) && (str = pathNames[i11]) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: o */
    public final InterfaceC19455e mo20579o() {
        Integer numValueOf = Integer.valueOf(this.f61723o0);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : m20569a()) != 1) {
            throw new C1609f("Expected BEGIN_OBJECT but was " + peek() + " at path " + m20571e());
        }
        m20565S(3);
        this.f61723o0 = 0;
        int i10 = this.f61732x0;
        this.f61732x0 = i10 + 1;
        this.f61731w0[i10] = 0;
        return this;
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: p */
    public final InterfaceC19455e mo20580p() {
        Integer numValueOf = Integer.valueOf(this.f61723o0);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : m20569a()) != 4) {
            throw new C1609f("Expected END_ARRAY but was " + peek() + " at path " + m20571e());
        }
        int i10 = this.f61728t0;
        this.f61728t0 = i10 - 1;
        int[] iArr = this.f61730v0;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f61723o0 = 0;
        return this;
    }

    @Override // p1006s6.InterfaceC19455e
    public final EnumC19454d peek() {
        Integer numValueOf = Integer.valueOf(this.f61723o0);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        switch (numValueOf != null ? numValueOf.intValue() : m20569a()) {
            case 1:
                return EnumC19454d.f61736o0;
            case 2:
                return EnumC19454d.f61737p0;
            case 3:
                return EnumC19454d.f61734Y;
            case 4:
                return EnumC19454d.f61735Z;
            case 5:
            case 6:
                return EnumC19454d.f61742u0;
            case 7:
                return EnumC19454d.f61743v0;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC19454d.f61739r0;
            case 12:
            case 13:
            case 14:
                return EnumC19454d.f61738q0;
            case 15:
                return EnumC19454d.f61741t0;
            case 16:
                return EnumC19454d.f61740s0;
            case 17:
                return EnumC19454d.f61744w0;
            default:
                throw new AssertionError();
        }
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: q */
    public final InterfaceC19455e mo20581q() {
        Integer numValueOf = Integer.valueOf(this.f61723o0);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : m20569a()) == 3) {
            m20565S(1);
            this.f61730v0[this.f61728t0 - 1] = 0;
            this.f61723o0 = 0;
            return this;
        }
        throw new C1609f("Expected BEGIN_ARRAY but was " + peek() + " at path " + m20571e());
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: x */
    public final String mo20582x() throws EOFException {
        Integer numValueOf = Integer.valueOf(this.f61723o0);
        String strValueOf = null;
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : m20569a();
        if (iIntValue == 15) {
            strValueOf = String.valueOf(this.f61724p0);
        } else if (iIntValue != 16) {
            switch (iIntValue) {
                case 8:
                    strValueOf = m20561E(f61719y0);
                    break;
                case 9:
                    strValueOf = m20561E(f61720z0);
                    break;
                case 10:
                    strValueOf = m20564P();
                    break;
                case 11:
                    String str = this.f61726r0;
                    if (str != null) {
                        this.f61726r0 = null;
                        strValueOf = str;
                    }
                    break;
                default:
                    throw new C1609f("Expected a string but was " + peek() + " at path " + m20571e());
            }
        } else {
            long j10 = this.f61725q0;
            C0675i c0675i = this.f61722Z;
            c0675i.getClass();
            strValueOf = c0675i.m1427Y0(j10, C21307a.f67720a);
        }
        this.f61723o0 = 0;
        int[] iArr = this.f61730v0;
        int i10 = this.f61728t0 - 1;
        iArr[i10] = iArr[i10] + 1;
        return strValueOf;
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: y0 */
    public final C19453c mo20583y0() throws EOFException {
        String strMo20582x = mo20582x();
        AbstractC16544l.m18091d(strMo20582x);
        return new C19453c(strMo20582x);
    }
}
