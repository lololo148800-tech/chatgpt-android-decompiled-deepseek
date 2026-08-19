package bj;

import android.gov.nist.core.Separators;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import p026Ao.AbstractC0668b;
import p026Ao.C0657F;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p026Ao.InterfaceC0677k;
import p1113xn.C21307a;
import p232J3.C4206F;
import p959q8.C18639a;

/* JADX INFO: renamed from: bj.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C11478y extends AbstractC11477x {

    /* JADX INFO: renamed from: A0 */
    public static final C0678l f34703A0;

    /* JADX INFO: renamed from: B0 */
    public static final C0678l f34704B0;

    /* JADX INFO: renamed from: C0 */
    public static final C0678l f34705C0;

    /* JADX INFO: renamed from: D0 */
    public static final C0678l f34706D0;

    /* JADX INFO: renamed from: z0 */
    public static final C0678l f34707z0;

    /* JADX INFO: renamed from: s0 */
    public final InterfaceC0677k f34708s0;

    /* JADX INFO: renamed from: t0 */
    public final C0675i f34709t0;

    /* JADX INFO: renamed from: u0 */
    public int f34710u0;

    /* JADX INFO: renamed from: v0 */
    public long f34711v0;

    /* JADX INFO: renamed from: w0 */
    public int f34712w0;

    /* JADX INFO: renamed from: x0 */
    public String f34713x0;

    /* JADX INFO: renamed from: y0 */
    public C11438C f34714y0;

    static {
        C0678l c0678l = C0678l.f1971p0;
        f34707z0 = C18639a.m19996n("'\\");
        f34703A0 = C18639a.m19996n("\"\\");
        f34704B0 = C18639a.m19996n("{}[]:, \n\t\r\f/\\;#=");
        f34705C0 = C18639a.m19996n("\n\r");
        f34706D0 = C18639a.m19996n("*/");
    }

    public C11478y(InterfaceC0677k interfaceC0677k) {
        this.f34710u0 = 0;
        if (interfaceC0677k == null) {
            throw new NullPointerException("source == null");
        }
        this.f34708s0 = interfaceC0677k;
        this.f34709t0 = interfaceC0677k.mo1353b();
        m12870j0(6);
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: C0 */
    public final int mo12799C0(C11475v c11475v) throws C4206F, EOFException {
        int iM12873W0 = this.f34710u0;
        if (iM12873W0 == 0) {
            iM12873W0 = m12873W0();
        }
        if (iM12873W0 < 8 || iM12873W0 > 11) {
            return -1;
        }
        if (iM12873W0 == 11) {
            return m12875Y0(this.f34713x0, c11475v);
        }
        int iMo1342G0 = this.f34708s0.mo1342G0(c11475v.f34685b);
        if (iMo1342G0 != -1) {
            this.f34710u0 = 0;
            int[] iArr = this.f34700p0;
            int i10 = this.f34697Y - 1;
            iArr[i10] = iArr[i10] + 1;
            return iMo1342G0;
        }
        String strMo12820x = mo12820x();
        int iM12875Y0 = m12875Y0(strMo12820x, c11475v);
        if (iM12875Y0 == -1) {
            this.f34710u0 = 11;
            this.f34713x0 = strMo12820x;
            int[] iArr2 = this.f34700p0;
            int i11 = this.f34697Y - 1;
            iArr2[i11] = iArr2[i11] - 1;
        }
        return iM12875Y0;
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: D */
    public final void mo12800D() throws C4206F, EOFException {
        if (this.f34702r0) {
            throw new C11473t("Cannot skip unexpected " + mo12805S() + " at " + m12867E());
        }
        int i10 = 0;
        do {
            int iM12873W0 = this.f34710u0;
            if (iM12873W0 == 0) {
                iM12873W0 = m12873W0();
            }
            if (iM12873W0 == 3) {
                m12870j0(1);
            } else {
                if (iM12873W0 == 1) {
                    m12870j0(3);
                } else if (iM12873W0 == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new C11473t("Expected a value but was " + mo12805S() + " at path " + m12867E());
                    }
                    this.f34697Y--;
                } else if (iM12873W0 == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new C11473t("Expected a value but was " + mo12805S() + " at path " + m12867E());
                    }
                    this.f34697Y--;
                } else {
                    C0675i c0675i = this.f34709t0;
                    if (iM12873W0 == 14 || iM12873W0 == 10) {
                        long jMo1344L0 = this.f34708s0.mo1344L0(f34704B0);
                        if (jMo1344L0 == -1) {
                            jMo1344L0 = c0675i.f1970Z;
                        }
                        c0675i.skip(jMo1344L0);
                    } else if (iM12873W0 == 9 || iM12873W0 == 13) {
                        m12881e1(f34703A0);
                    } else if (iM12873W0 == 8 || iM12873W0 == 12) {
                        m12881e1(f34707z0);
                    } else if (iM12873W0 == 17) {
                        c0675i.skip(this.f34712w0);
                    } else if (iM12873W0 == 18) {
                        throw new C11473t("Expected a value but was " + mo12805S() + " at path " + m12867E());
                    }
                }
                this.f34710u0 = 0;
            }
            i10++;
            this.f34710u0 = 0;
        } while (i10 != 0);
        int[] iArr = this.f34700p0;
        int i11 = this.f34697Y - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f34699o0[i11] = "null";
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: E0 */
    public final long mo12801E0() throws C4206F, EOFException {
        int iM12873W0 = this.f34710u0;
        if (iM12873W0 == 0) {
            iM12873W0 = m12873W0();
        }
        if (iM12873W0 == 16) {
            this.f34710u0 = 0;
            int[] iArr = this.f34700p0;
            int i10 = this.f34697Y - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f34711v0;
        }
        if (iM12873W0 == 17) {
            long j10 = this.f34712w0;
            C0675i c0675i = this.f34709t0;
            c0675i.getClass();
            this.f34713x0 = c0675i.m1427Y0(j10, C21307a.f67720a);
        } else if (iM12873W0 == 9 || iM12873W0 == 8) {
            String strM12878b1 = iM12873W0 == 9 ? m12878b1(f34703A0) : m12878b1(f34707z0);
            this.f34713x0 = strM12878b1;
            try {
                long j11 = Long.parseLong(strM12878b1);
                this.f34710u0 = 0;
                int[] iArr2 = this.f34700p0;
                int i11 = this.f34697Y - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j11;
            } catch (NumberFormatException unused) {
            }
        } else if (iM12873W0 != 11) {
            throw new C11473t("Expected a long but was " + mo12805S() + " at path " + m12867E());
        }
        this.f34710u0 = 11;
        try {
            long jLongValueExact = new BigDecimal(this.f34713x0).longValueExact();
            this.f34713x0 = null;
            this.f34710u0 = 0;
            int[] iArr3 = this.f34700p0;
            int i12 = this.f34697Y - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new C11473t("Expected a long but was " + this.f34713x0 + " at path " + m12867E());
        }
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: H0 */
    public final void mo12802H0() throws C4206F, EOFException {
        if (this.f34702r0) {
            EnumC11476w enumC11476wMo12805S = mo12805S();
            mo12813a0();
            throw new C11473t("Cannot skip unexpected " + enumC11476wMo12805S + " at " + m12867E());
        }
        int iM12873W0 = this.f34710u0;
        if (iM12873W0 == 0) {
            iM12873W0 = m12873W0();
        }
        if (iM12873W0 == 14) {
            long jMo1344L0 = this.f34708s0.mo1344L0(f34704B0);
            C0675i c0675i = this.f34709t0;
            if (jMo1344L0 == -1) {
                jMo1344L0 = c0675i.f1970Z;
            }
            c0675i.skip(jMo1344L0);
        } else if (iM12873W0 == 13) {
            m12881e1(f34703A0);
        } else if (iM12873W0 == 12) {
            m12881e1(f34707z0);
        } else if (iM12873W0 != 15) {
            throw new C11473t("Expected a name but was " + mo12805S() + " at path " + m12867E());
        }
        this.f34710u0 = 0;
        this.f34699o0[this.f34697Y - 1] = "null";
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: O */
    public final double mo12803O() throws C4206F, EOFException {
        int iM12873W0 = this.f34710u0;
        if (iM12873W0 == 0) {
            iM12873W0 = m12873W0();
        }
        if (iM12873W0 == 16) {
            this.f34710u0 = 0;
            int[] iArr = this.f34700p0;
            int i10 = this.f34697Y - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f34711v0;
        }
        if (iM12873W0 == 17) {
            long j10 = this.f34712w0;
            C0675i c0675i = this.f34709t0;
            c0675i.getClass();
            this.f34713x0 = c0675i.m1427Y0(j10, C21307a.f67720a);
        } else if (iM12873W0 == 9) {
            this.f34713x0 = m12878b1(f34703A0);
        } else if (iM12873W0 == 8) {
            this.f34713x0 = m12878b1(f34707z0);
        } else if (iM12873W0 == 10) {
            this.f34713x0 = m12879c1();
        } else if (iM12873W0 != 11) {
            throw new C11473t("Expected a double but was " + mo12805S() + " at path " + m12867E());
        }
        this.f34710u0 = 11;
        try {
            double d10 = Double.parseDouble(this.f34713x0);
            if (!this.f34701q0 && (Double.isNaN(d10) || Double.isInfinite(d10))) {
                throw new C4206F("JSON forbids NaN and infinities: " + d10 + " at path " + m12867E());
            }
            this.f34713x0 = null;
            this.f34710u0 = 0;
            int[] iArr2 = this.f34700p0;
            int i11 = this.f34697Y - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return d10;
        } catch (NumberFormatException unused) {
            throw new C11473t("Expected a double but was " + this.f34713x0 + " at path " + m12867E());
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: P */
    public final InterfaceC0677k mo12804P() throws IOException {
        int i10;
        int iM12873W0 = this.f34710u0;
        if (iM12873W0 == 0) {
            iM12873W0 = m12873W0();
        }
        C0675i c0675i = new C0675i();
        C0678l c0678l = C11438C.f34561y0;
        if (iM12873W0 != 3) {
            if (iM12873W0 == 1) {
                c0675i.m1444l1("{");
                c0678l = C11438C.f34556t0;
            } else {
                if (iM12873W0 == 9) {
                    c0675i.m1444l1(Separators.DOUBLE_QUOTE);
                    c0678l = C11438C.f34558v0;
                } else if (iM12873W0 == 8) {
                    c0675i.m1444l1(Separators.QUOTE);
                    c0678l = C11438C.f34557u0;
                } else if (iM12873W0 == 17 || iM12873W0 == 16 || iM12873W0 == 10) {
                    c0675i.m1444l1(mo12820x());
                } else if (iM12873W0 == 5) {
                    c0675i.m1444l1("true");
                } else if (iM12873W0 == 6) {
                    c0675i.m1444l1("false");
                } else if (iM12873W0 == 7) {
                    c0675i.m1444l1("null");
                } else {
                    if (iM12873W0 != 11) {
                        throw new C11473t("Expected a value but was " + mo12805S() + " at path " + m12867E());
                    }
                    String strMo12820x = mo12820x();
                    C11479z c11479z = new C11479z(c0675i);
                    try {
                        c11479z.mo12828V0(strMo12820x);
                        c11479z.close();
                    } catch (Throwable th2) {
                        try {
                            c11479z.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                i10 = 0;
            }
            if (this.f34710u0 != 0) {
                int[] iArr = this.f34700p0;
                int i11 = this.f34697Y - 1;
                iArr[i11] = iArr[i11] + 1;
                this.f34710u0 = 0;
            }
            this.f34714y0 = new C11438C(this.f34708s0, c0675i, c0678l, i10);
            m12870j0(9);
            return AbstractC0668b.m1403c(this.f34714y0);
        }
        c0675i.m1444l1("[");
        c0678l = C11438C.f34556t0;
        i10 = 1;
        if (this.f34710u0 != 0) {
            int[] iArr2 = this.f34700p0;
            int i12 = this.f34697Y - 1;
            iArr2[i12] = iArr2[i12] + 1;
            this.f34710u0 = 0;
        }
        this.f34714y0 = new C11438C(this.f34708s0, c0675i, c0678l, i10);
        m12870j0(9);
        return AbstractC0668b.m1403c(this.f34714y0);
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: S */
    public final EnumC11476w mo12805S() throws C4206F, EOFException {
        int iM12873W0 = this.f34710u0;
        if (iM12873W0 == 0) {
            iM12873W0 = m12873W0();
        }
        switch (iM12873W0) {
            case 1:
                return EnumC11476w.f34688o0;
            case 2:
                return EnumC11476w.f34689p0;
            case 3:
                return EnumC11476w.f34686Y;
            case 4:
                return EnumC11476w.f34687Z;
            case 5:
            case 6:
                return EnumC11476w.f34693t0;
            case 7:
                return EnumC11476w.f34694u0;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC11476w.f34691r0;
            case 12:
            case 13:
            case 14:
            case 15:
                return EnumC11476w.f34690q0;
            case 16:
            case 17:
                return EnumC11476w.f34692s0;
            case 18:
                return EnumC11476w.f34695v0;
            default:
                throw new AssertionError();
        }
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: S0 */
    public final boolean mo12806S0() throws C4206F, EOFException {
        int iM12873W0 = this.f34710u0;
        if (iM12873W0 == 0) {
            iM12873W0 = m12873W0();
        }
        if (iM12873W0 == 5) {
            this.f34710u0 = 0;
            int[] iArr = this.f34700p0;
            int i10 = this.f34697Y - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iM12873W0 == 6) {
            this.f34710u0 = 0;
            int[] iArr2 = this.f34700p0;
            int i11 = this.f34697Y - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new C11473t("Expected a boolean but was " + mo12805S() + " at path " + m12867E());
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: T */
    public final AbstractC11477x mo12807T() {
        return new C11478y(this);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m12872V0() throws C4206F {
        if (this.f34701q0) {
            return;
        }
        m12868J0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: W */
    public final void mo12809W() {
        if (hasNext()) {
            this.f34713x0 = mo12813a0();
            this.f34710u0 = 11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0161  */
    /* JADX WARN: Code duplicated, block: B:106:0x016a  */
    /* JADX WARN: Code duplicated, block: B:108:0x016e  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:167:0x0204  */
    /* JADX WARN: Code duplicated, block: B:180:0x0225  */
    /* JADX WARN: Code duplicated, block: B:183:0x022a  */
    /* JADX WARN: Code duplicated, block: B:188:0x0237 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:189:0x0238  */
    /* JADX WARN: Code duplicated, block: B:191:0x0244  */
    /* JADX WARN: Code duplicated, block: B:193:0x024c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0253  */
    /* JADX WARN: Code duplicated, block: B:197:0x0259 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x025b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0262  */
    /* JADX WARN: Code duplicated, block: B:209:0x027b  */
    /* JADX WARN: Code duplicated, block: B:211:0x0286  */
    /* JADX WARN: Code duplicated, block: B:251:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x00f7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x0105  */
    /* JADX WARN: Code duplicated, block: B:83:0x0111  */
    /* JADX WARN: Code duplicated, block: B:86:0x011b  */
    /* JADX WARN: Code duplicated, block: B:94:0x013a  */
    /* JADX WARN: Code duplicated, block: B:99:0x014e A[RETURN] */
    /* JADX INFO: renamed from: W0 */
    public final int m12873W0() throws C4206F, EOFException {
        int i10;
        int iM12877a1;
        byte bM1422T;
        int i11;
        String str;
        String str2;
        int length;
        int i12;
        int i13;
        char cM1422T;
        int i14;
        int i15;
        long j10;
        int i16;
        long j11;
        int i17;
        byte bM1422T2;
        long j12;
        int i18;
        int[] iArr = this.f34698Z;
        int i19 = this.f34697Y - 1;
        int i20 = iArr[i19];
        InterfaceC0677k interfaceC0677k = this.f34708s0;
        C0675i c0675i = this.f34709t0;
        if (i20 == 1) {
            iArr[i19] = 2;
        } else if (i20 == 2) {
            int iM12877a2 = m12877a1(true);
            c0675i.readByte();
            if (iM12877a2 != 44) {
                if (iM12877a2 != 59) {
                    if (iM12877a2 == 93) {
                        this.f34710u0 = 4;
                        return 4;
                    }
                    m12868J0("Unterminated array");
                    throw null;
                }
                m12872V0();
            }
        } else {
            if (i20 == 3 || i20 == 5) {
                iArr[i19] = 4;
                if (i20 == 5) {
                    int iM12877a3 = m12877a1(true);
                    c0675i.readByte();
                    if (iM12877a3 != 44) {
                        if (iM12877a3 != 59) {
                            if (iM12877a3 == 125) {
                                this.f34710u0 = 2;
                                return 2;
                            }
                            m12868J0("Unterminated object");
                            throw null;
                        }
                        m12872V0();
                    }
                }
                int iM12877a4 = m12877a1(true);
                if (iM12877a4 == 34) {
                    c0675i.readByte();
                    this.f34710u0 = 13;
                    return 13;
                }
                if (iM12877a4 == 39) {
                    c0675i.readByte();
                    m12872V0();
                    this.f34710u0 = 12;
                    return 12;
                }
                if (iM12877a4 != 125) {
                    m12872V0();
                    if (m12876Z0((char) iM12877a4)) {
                        this.f34710u0 = 14;
                        return 14;
                    }
                    m12868J0("Expected name");
                    throw null;
                }
                if (i20 == 5) {
                    m12868J0("Expected name");
                    throw null;
                }
                c0675i.readByte();
                this.f34710u0 = 2;
                return 2;
            }
            if (i20 != 4) {
                if (i20 == 6) {
                    iArr[i19] = 7;
                } else if (i20 == 7) {
                    i10 = 0;
                    if (m12877a1(false) == -1) {
                        this.f34710u0 = 18;
                        return 18;
                    }
                    m12872V0();
                } else {
                    i10 = 0;
                    if (i20 == 9) {
                        C11438C c11438c = this.f34714y0;
                        c11438c.f34568s0 = true;
                        while (c11438c.f34565p0 != C11438C.f34561y0) {
                            c11438c.m12821a(8192L);
                            c11438c.f34562Y.skip(c11438c.f34567r0);
                        }
                        this.f34714y0 = null;
                        this.f34697Y--;
                        return m12873W0();
                    }
                    if (i20 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iM12877a1 = m12877a1(true);
                if (iM12877a1 != 34) {
                    c0675i.readByte();
                    this.f34710u0 = 9;
                    return 9;
                }
                if (iM12877a1 != 39) {
                    m12872V0();
                    c0675i.readByte();
                    this.f34710u0 = 8;
                    return 8;
                }
                if (iM12877a1 != 44 && iM12877a1 != 59) {
                    if (iM12877a1 != 91) {
                        c0675i.readByte();
                        this.f34710u0 = 3;
                        return 3;
                    }
                    if (iM12877a1 != 93) {
                        if (iM12877a1 != 123) {
                            c0675i.readByte();
                            this.f34710u0 = 1;
                            return 1;
                        }
                        bM1422T = c0675i.m1422T(0L);
                        if (bM1422T != 116 || bM1422T == 84) {
                            i11 = 5;
                            str2 = "true";
                            str = "TRUE";
                        } else {
                            if (bM1422T != 102 && bM1422T != 70) {
                                if (bM1422T != 110 && bM1422T != 78) {
                                    i11 = i10;
                                    break;
                                }
                                i11 = 7;
                                str2 = "null";
                                str = "NULL";
                                if (i11 != 0) {
                                    return i11;
                                }
                                i14 = i10;
                                i15 = i14;
                                int i21 = i15;
                                boolean z6 = true;
                                j10 = 0;
                                while (true) {
                                    i16 = i14 + 1;
                                    j11 = j10;
                                    if (interfaceC0677k.mo1359l(i16)) {
                                        bM1422T2 = c0675i.m1422T(i14);
                                        if (bM1422T2 == 43) {
                                            j12 = j11;
                                            i18 = 6;
                                            if (i15 != 5) {
                                                i17 = 0;
                                                if (i17 != 0) {
                                                    return i17;
                                                }
                                                if (!m12876Z0(c0675i.m1422T(0L))) {
                                                    m12868J0("Expected value");
                                                    throw null;
                                                }
                                                m12872V0();
                                                this.f34710u0 = 10;
                                                return 10;
                                            }
                                            i15 = i18;
                                            j10 = j12;
                                        } else if (bM1422T2 != 69 || bM1422T2 == 101) {
                                            j12 = j11;
                                            if (i15 == 2 && i15 != 4) {
                                                i17 = 0;
                                                if (i17 != 0) {
                                                    return i17;
                                                }
                                                if (!m12876Z0(c0675i.m1422T(0L))) {
                                                    m12868J0("Expected value");
                                                    throw null;
                                                }
                                                m12872V0();
                                                this.f34710u0 = 10;
                                                return 10;
                                            }
                                            i15 = 5;
                                            j10 = j12;
                                        } else {
                                            if (bM1422T2 != 45) {
                                                if (bM1422T2 != 46) {
                                                    if (bM1422T2 < 48 || bM1422T2 > 57) {
                                                        if (m12876Z0(bM1422T2)) {
                                                            i17 = 0;
                                                        }
                                                    } else if (i15 == 1 || i15 == 0) {
                                                        j12 = -(bM1422T2 - 48);
                                                        i15 = 2;
                                                        j10 = j12;
                                                    } else if (i15 == 2) {
                                                        if (j11 == 0) {
                                                            i17 = i10;
                                                        } else {
                                                            j10 = (10 * j11) - ((long) (bM1422T2 - 48));
                                                            z6 &= j11 > -922337203685477580L || (j11 == -922337203685477580L && j10 < j11);
                                                        }
                                                    } else if (i15 == 3) {
                                                        j10 = j11;
                                                        i15 = 4;
                                                    } else if (i15 == 5 || i15 == 6) {
                                                        j10 = j11;
                                                        i15 = 7;
                                                    } else {
                                                        j10 = j11;
                                                    }
                                                } else if (i15 == 2) {
                                                    j10 = j11;
                                                    i15 = 3;
                                                } else {
                                                    i17 = 0;
                                                }
                                                if (i17 != 0) {
                                                    return i17;
                                                }
                                                if (!m12876Z0(c0675i.m1422T(0L))) {
                                                    m12868J0("Expected value");
                                                    throw null;
                                                }
                                                m12872V0();
                                                this.f34710u0 = 10;
                                                return 10;
                                            }
                                            j12 = j11;
                                            i18 = 6;
                                            if (i15 == 0) {
                                                i15 = 1;
                                                i21 = 1;
                                            } else {
                                                if (i15 != 5) {
                                                    i17 = 0;
                                                    if (i17 != 0) {
                                                        return i17;
                                                    }
                                                    if (!m12876Z0(c0675i.m1422T(0L))) {
                                                        m12868J0("Expected value");
                                                        throw null;
                                                    }
                                                    m12872V0();
                                                    this.f34710u0 = 10;
                                                    return 10;
                                                }
                                                i15 = i18;
                                            }
                                            j10 = j12;
                                        }
                                        i14 = i16;
                                        i10 = 0;
                                    }
                                    if (i15 != 2 && z6 && ((j11 != Long.MIN_VALUE || i21 != 0) && (j11 != 0 || i21 == 0))) {
                                        this.f34711v0 = i21 != 0 ? j11 : -j11;
                                        c0675i.skip(i14);
                                        i17 = 16;
                                        this.f34710u0 = 16;
                                    } else if (i15 != 2 || i15 == 4 || i15 == 7) {
                                        this.f34712w0 = i14;
                                        i17 = 17;
                                        this.f34710u0 = 17;
                                    } else {
                                        i17 = 0;
                                    }
                                    if (i17 != 0) {
                                        return i17;
                                    }
                                    if (!m12876Z0(c0675i.m1422T(0L))) {
                                        m12868J0("Expected value");
                                        throw null;
                                    }
                                    m12872V0();
                                    this.f34710u0 = 10;
                                    return 10;
                                }
                            }
                            i11 = 6;
                            str2 = "false";
                            str = "FALSE";
                        }
                        length = str2.length();
                        i12 = 1;
                        while (true) {
                            if (i12 >= length) {
                                if (interfaceC0677k.mo1359l(length + 1) || !m12876Z0(c0675i.m1422T(length))) {
                                    c0675i.skip(length);
                                    this.f34710u0 = i11;
                                    break;
                                }
                            } else {
                                i13 = i12 + 1;
                                if (!interfaceC0677k.mo1359l(i13) && ((cM1422T = c0675i.m1422T(i12)) == str2.charAt(i12) || cM1422T == str.charAt(i12))) {
                                    i12 = i13;
                                }
                            }
                            i11 = i10;
                            break;
                        }
                        if (i11 != 0) {
                            return i11;
                        }
                        i14 = i10;
                        i15 = i14;
                        int i22 = i15;
                        boolean z10 = true;
                        j10 = 0;
                        while (true) {
                            i16 = i14 + 1;
                            j11 = j10;
                            if (interfaceC0677k.mo1359l(i16)) {
                                bM1422T2 = c0675i.m1422T(i14);
                                if (bM1422T2 == 43) {
                                    if (bM1422T2 != 69) {
                                    }
                                    j12 = j11;
                                    if (i15 == 2) {
                                    }
                                    i15 = 5;
                                    j10 = j12;
                                } else {
                                    j12 = j11;
                                    i18 = 6;
                                    if (i15 != 5) {
                                        i17 = 0;
                                        if (i17 != 0) {
                                            return i17;
                                        }
                                        if (!m12876Z0(c0675i.m1422T(0L))) {
                                            m12868J0("Expected value");
                                            throw null;
                                        }
                                        m12872V0();
                                        this.f34710u0 = 10;
                                        return 10;
                                    }
                                    i15 = i18;
                                    j10 = j12;
                                }
                                i14 = i16;
                                i10 = 0;
                            }
                            if (i15 != 2) {
                                if (i15 != 2) {
                                }
                                this.f34712w0 = i14;
                                i17 = 17;
                                this.f34710u0 = 17;
                            } else {
                                if (i15 != 2) {
                                }
                                this.f34712w0 = i14;
                                i17 = 17;
                                this.f34710u0 = 17;
                            }
                            if (i17 != 0) {
                                return i17;
                            }
                            if (!m12876Z0(c0675i.m1422T(0L))) {
                                m12868J0("Expected value");
                                throw null;
                            }
                            m12872V0();
                            this.f34710u0 = 10;
                            return 10;
                        }
                    }
                    if (i20 == 1) {
                        c0675i.readByte();
                        this.f34710u0 = 4;
                        return 4;
                    }
                }
                if (i20 == 1 && i20 != 2) {
                    m12868J0("Unexpected value");
                    throw null;
                }
                m12872V0();
                this.f34710u0 = 7;
                return 7;
            }
            iArr[i19] = 5;
            int iM12877a5 = m12877a1(true);
            c0675i.readByte();
            if (iM12877a5 != 58) {
                if (iM12877a5 != 61) {
                    m12868J0("Expected ':'");
                    throw null;
                }
                m12872V0();
                if (interfaceC0677k.mo1359l(1L) && c0675i.m1422T(0L) == 62) {
                    c0675i.readByte();
                }
            }
        }
        i10 = 0;
        iM12877a1 = m12877a1(true);
        if (iM12877a1 != 34) {
            c0675i.readByte();
            this.f34710u0 = 9;
            return 9;
        }
        if (iM12877a1 != 39) {
            m12872V0();
            c0675i.readByte();
            this.f34710u0 = 8;
            return 8;
        }
        if (iM12877a1 != 44) {
            if (iM12877a1 != 91) {
                c0675i.readByte();
                this.f34710u0 = 3;
                return 3;
            }
            if (iM12877a1 != 93) {
                if (iM12877a1 != 123) {
                    c0675i.readByte();
                    this.f34710u0 = 1;
                    return 1;
                }
                bM1422T = c0675i.m1422T(0L);
                if (bM1422T != 116) {
                    i11 = 5;
                    str2 = "true";
                    str = "TRUE";
                    length = str2.length();
                    i12 = 1;
                    while (true) {
                        if (i12 >= length) {
                            if (interfaceC0677k.mo1359l(length + 1)) {
                            }
                            c0675i.skip(length);
                            this.f34710u0 = i11;
                            break;
                        }
                        i13 = i12 + 1;
                        if (!interfaceC0677k.mo1359l(i13)) {
                            i12 = i13;
                        }
                    }
                    if (i11 != 0) {
                        return i11;
                    }
                    i14 = i10;
                    i15 = i14;
                    int i23 = i15;
                    boolean z11 = true;
                    j10 = 0;
                    while (true) {
                        i16 = i14 + 1;
                        j11 = j10;
                        if (interfaceC0677k.mo1359l(i16)) {
                            bM1422T2 = c0675i.m1422T(i14);
                            if (bM1422T2 == 43) {
                                if (bM1422T2 != 69) {
                                }
                                j12 = j11;
                                if (i15 == 2) {
                                }
                                i15 = 5;
                                j10 = j12;
                            } else {
                                j12 = j11;
                                i18 = 6;
                                if (i15 != 5) {
                                    i17 = 0;
                                    if (i17 != 0) {
                                        return i17;
                                    }
                                    if (!m12876Z0(c0675i.m1422T(0L))) {
                                        m12868J0("Expected value");
                                        throw null;
                                    }
                                    m12872V0();
                                    this.f34710u0 = 10;
                                    return 10;
                                }
                                i15 = i18;
                                j10 = j12;
                            }
                            i14 = i16;
                            i10 = 0;
                        }
                        if (i15 != 2) {
                            if (i15 != 2) {
                            }
                            this.f34712w0 = i14;
                            i17 = 17;
                            this.f34710u0 = 17;
                        } else {
                            if (i15 != 2) {
                            }
                            this.f34712w0 = i14;
                            i17 = 17;
                            this.f34710u0 = 17;
                        }
                        if (i17 != 0) {
                            return i17;
                        }
                        if (!m12876Z0(c0675i.m1422T(0L))) {
                            m12868J0("Expected value");
                            throw null;
                        }
                        m12872V0();
                        this.f34710u0 = 10;
                        return 10;
                    }
                }
                i11 = 5;
                str2 = "true";
                str = "TRUE";
                length = str2.length();
                i12 = 1;
                while (true) {
                    if (i12 >= length) {
                        if (interfaceC0677k.mo1359l(length + 1)) {
                        }
                        c0675i.skip(length);
                        this.f34710u0 = i11;
                        break;
                    }
                    i13 = i12 + 1;
                    if (!interfaceC0677k.mo1359l(i13)) {
                        i12 = i13;
                    }
                }
                if (i11 != 0) {
                    return i11;
                }
                i14 = i10;
                i15 = i14;
                int i24 = i15;
                boolean z12 = true;
                j10 = 0;
                while (true) {
                    i16 = i14 + 1;
                    j11 = j10;
                    if (interfaceC0677k.mo1359l(i16)) {
                        bM1422T2 = c0675i.m1422T(i14);
                        if (bM1422T2 == 43) {
                            if (bM1422T2 != 69) {
                            }
                            j12 = j11;
                            if (i15 == 2) {
                            }
                            i15 = 5;
                            j10 = j12;
                        } else {
                            j12 = j11;
                            i18 = 6;
                            if (i15 != 5) {
                                i17 = 0;
                                if (i17 != 0) {
                                    return i17;
                                }
                                if (!m12876Z0(c0675i.m1422T(0L))) {
                                    m12868J0("Expected value");
                                    throw null;
                                }
                                m12872V0();
                                this.f34710u0 = 10;
                                return 10;
                            }
                            i15 = i18;
                            j10 = j12;
                        }
                        i14 = i16;
                        i10 = 0;
                    }
                    if (i15 != 2) {
                        if (i15 != 2) {
                        }
                        this.f34712w0 = i14;
                        i17 = 17;
                        this.f34710u0 = 17;
                    } else {
                        if (i15 != 2) {
                        }
                        this.f34712w0 = i14;
                        i17 = 17;
                        this.f34710u0 = 17;
                    }
                    if (i17 != 0) {
                        return i17;
                    }
                    if (!m12876Z0(c0675i.m1422T(0L))) {
                        m12868J0("Expected value");
                        throw null;
                    }
                    m12872V0();
                    this.f34710u0 = 10;
                    return 10;
                }
                i11 = i10;
                if (i11 != 0) {
                    return i11;
                }
                i14 = i10;
                i15 = i14;
                int i25 = i15;
                boolean z13 = true;
                j10 = 0;
                while (true) {
                    i16 = i14 + 1;
                    j11 = j10;
                    if (interfaceC0677k.mo1359l(i16)) {
                        bM1422T2 = c0675i.m1422T(i14);
                        if (bM1422T2 == 43) {
                            if (bM1422T2 != 69) {
                            }
                            j12 = j11;
                            if (i15 == 2) {
                            }
                            i15 = 5;
                            j10 = j12;
                        } else {
                            j12 = j11;
                            i18 = 6;
                            if (i15 != 5) {
                                i17 = 0;
                                if (i17 != 0) {
                                    return i17;
                                }
                                if (!m12876Z0(c0675i.m1422T(0L))) {
                                    m12868J0("Expected value");
                                    throw null;
                                }
                                m12872V0();
                                this.f34710u0 = 10;
                                return 10;
                            }
                            i15 = i18;
                            j10 = j12;
                        }
                        i14 = i16;
                        i10 = 0;
                    }
                    if (i15 != 2) {
                        if (i15 != 2) {
                        }
                        this.f34712w0 = i14;
                        i17 = 17;
                        this.f34710u0 = 17;
                    } else {
                        if (i15 != 2) {
                        }
                        this.f34712w0 = i14;
                        i17 = 17;
                        this.f34710u0 = 17;
                    }
                    if (i17 != 0) {
                        return i17;
                    }
                    if (!m12876Z0(c0675i.m1422T(0L))) {
                        m12868J0("Expected value");
                        throw null;
                    }
                    m12872V0();
                    this.f34710u0 = 10;
                    return 10;
                }
            }
            if (i20 == 1) {
                c0675i.readByte();
                this.f34710u0 = 4;
                return 4;
            }
        }
        if (i20 == 1) {
        }
        m12872V0();
        this.f34710u0 = 7;
        return 7;
    }

    /* JADX INFO: renamed from: X0 */
    public final int m12874X0(String str, C11475v c11475v) {
        int length = c11475v.f34684a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(c11475v.f34684a[i10])) {
                this.f34710u0 = 0;
                this.f34699o0[this.f34697Y - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: Y0 */
    public final int m12875Y0(String str, C11475v c11475v) {
        int length = c11475v.f34684a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(c11475v.f34684a[i10])) {
                this.f34710u0 = 0;
                int[] iArr = this.f34700p0;
                int i11 = this.f34697Y - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: Z0 */
    public final boolean m12876Z0(int i10) throws C4206F {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m12872V0();
        return false;
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: a */
    public final void mo12812a() throws C4206F, EOFException {
        int iM12873W0 = this.f34710u0;
        if (iM12873W0 == 0) {
            iM12873W0 = m12873W0();
        }
        if (iM12873W0 == 3) {
            m12870j0(1);
            this.f34700p0[this.f34697Y - 1] = 0;
            this.f34710u0 = 0;
        } else {
            throw new C11473t("Expected BEGIN_ARRAY but was " + mo12805S() + " at path " + m12867E());
        }
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: a0 */
    public final String mo12813a0() throws C4206F, EOFException {
        String strM12878b1;
        int iM12873W0 = this.f34710u0;
        if (iM12873W0 == 0) {
            iM12873W0 = m12873W0();
        }
        if (iM12873W0 == 14) {
            strM12878b1 = m12879c1();
        } else if (iM12873W0 == 13) {
            strM12878b1 = m12878b1(f34703A0);
        } else if (iM12873W0 == 12) {
            strM12878b1 = m12878b1(f34707z0);
        } else {
            if (iM12873W0 != 15) {
                throw new C11473t("Expected a name but was " + mo12805S() + " at path " + m12867E());
            }
            strM12878b1 = this.f34713x0;
            this.f34713x0 = null;
        }
        this.f34710u0 = 0;
        this.f34699o0[this.f34697Y - 1] = strM12878b1;
        return strM12878b1;
    }

    /* JADX INFO: renamed from: a1 */
    public final int m12877a1(boolean z6) throws C4206F, EOFException {
        InterfaceC0677k interfaceC0677k;
        long j10;
        C0675i c0675i;
        byte bM1422T;
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                interfaceC0677k = this.f34708s0;
                if (!interfaceC0677k.mo1359l(i11)) {
                    if (z6) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                j10 = i10;
                c0675i = this.f34709t0;
                bM1422T = c0675i.m1422T(j10);
                if (bM1422T == 10 || bM1422T == 32 || bM1422T == 13 || bM1422T == 9) {
                    i10 = i11;
                }
            }
            c0675i.skip(j10);
            C0678l c0678l = f34705C0;
            if (bM1422T == 47) {
                if (!interfaceC0677k.mo1359l(2L)) {
                    return bM1422T;
                }
                m12872V0();
                byte bM1422T2 = c0675i.m1422T(1L);
                if (bM1422T2 == 42) {
                    c0675i.readByte();
                    c0675i.readByte();
                    C0678l c0678l2 = f34706D0;
                    long jMo1351Z = interfaceC0677k.mo1351Z(c0678l2);
                    boolean z10 = jMo1351Z != -1;
                    c0675i.skip(z10 ? jMo1351Z + ((long) c0678l2.f1972Y.length) : c0675i.f1970Z);
                    if (!z10) {
                        m12868J0("Unterminated comment");
                        throw null;
                    }
                } else {
                    if (bM1422T2 != 47) {
                        return bM1422T;
                    }
                    c0675i.readByte();
                    c0675i.readByte();
                    long jMo1344L0 = interfaceC0677k.mo1344L0(c0678l);
                    c0675i.skip(jMo1344L0 != -1 ? jMo1344L0 + 1 : c0675i.f1970Z);
                }
            } else {
                if (bM1422T != 35) {
                    return bM1422T;
                }
                m12872V0();
                long jMo1344L1 = interfaceC0677k.mo1344L0(c0678l);
                c0675i.skip(jMo1344L1 != -1 ? jMo1344L1 + 1 : c0675i.f1970Z);
            }
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final String m12878b1(C0678l c0678l) throws C4206F, EOFException {
        StringBuilder sb2 = null;
        while (true) {
            long jMo1344L0 = this.f34708s0.mo1344L0(c0678l);
            if (jMo1344L0 == -1) {
                m12868J0("Unterminated string");
                throw null;
            }
            C0675i c0675i = this.f34709t0;
            if (c0675i.m1422T(jMo1344L0) != 92) {
                if (sb2 == null) {
                    String strM1427Y0 = c0675i.m1427Y0(jMo1344L0, C21307a.f67720a);
                    c0675i.readByte();
                    return strM1427Y0;
                }
                sb2.append(c0675i.m1427Y0(jMo1344L0, C21307a.f67720a));
                c0675i.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(c0675i.m1427Y0(jMo1344L0, C21307a.f67720a));
            c0675i.readByte();
            sb2.append(m12880d1());
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final String m12879c1() {
        long jMo1344L0 = this.f34708s0.mo1344L0(f34704B0);
        C0675i c0675i = this.f34709t0;
        if (jMo1344L0 == -1) {
            return c0675i.m1428Z0();
        }
        c0675i.getClass();
        return c0675i.m1427Y0(jMo1344L0, C21307a.f67720a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34710u0 = 0;
        this.f34698Z[0] = 8;
        this.f34697Y = 1;
        this.f34709t0.m1429a();
        this.f34708s0.close();
    }

    /* JADX INFO: renamed from: d1 */
    public final char m12880d1() throws C4206F, EOFException {
        int i10;
        InterfaceC0677k interfaceC0677k = this.f34708s0;
        if (!interfaceC0677k.mo1359l(1L)) {
            m12868J0("Unterminated escape sequence");
            throw null;
        }
        C0675i c0675i = this.f34709t0;
        byte b = c0675i.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            if (this.f34701q0) {
                return (char) b;
            }
            m12868J0("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!interfaceC0677k.mo1359l(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + m12867E());
        }
        char c9 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bM1422T = c0675i.m1422T(i11);
            char c10 = (char) (c9 << 4);
            if (bM1422T >= 48 && bM1422T <= 57) {
                i10 = bM1422T - 48;
            } else if (bM1422T >= 97 && bM1422T <= 102) {
                i10 = bM1422T - 87;
            } else {
                if (bM1422T < 65 || bM1422T > 70) {
                    m12868J0("\\u".concat(c0675i.m1427Y0(4L, C21307a.f67720a)));
                    throw null;
                }
                i10 = bM1422T - 55;
            }
            c9 = (char) (i10 + c10);
        }
        c0675i.skip(4L);
        return c9;
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: e */
    public final void mo12814e() throws C4206F, EOFException {
        int iM12873W0 = this.f34710u0;
        if (iM12873W0 == 0) {
            iM12873W0 = m12873W0();
        }
        if (iM12873W0 == 1) {
            m12870j0(3);
            this.f34710u0 = 0;
        } else {
            throw new C11473t("Expected BEGIN_OBJECT but was " + mo12805S() + " at path " + m12867E());
        }
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: e0 */
    public final void mo12815e0() throws C4206F, EOFException {
        int iM12873W0 = this.f34710u0;
        if (iM12873W0 == 0) {
            iM12873W0 = m12873W0();
        }
        if (iM12873W0 == 7) {
            this.f34710u0 = 0;
            int[] iArr = this.f34700p0;
            int i10 = this.f34697Y - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new C11473t("Expected null but was " + mo12805S() + " at path " + m12867E());
    }

    /* JADX INFO: renamed from: e1 */
    public final void m12881e1(C0678l c0678l) throws C4206F, EOFException {
        while (true) {
            long jMo1344L0 = this.f34708s0.mo1344L0(c0678l);
            if (jMo1344L0 == -1) {
                m12868J0("Unterminated string");
                throw null;
            }
            C0675i c0675i = this.f34709t0;
            if (c0675i.m1422T(jMo1344L0) != 92) {
                c0675i.skip(jMo1344L0 + 1);
                return;
            } else {
                c0675i.skip(jMo1344L0 + 1);
                m12880d1();
            }
        }
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: g0 */
    public final int mo12816g0() throws C4206F, EOFException {
        int iM12873W0 = this.f34710u0;
        if (iM12873W0 == 0) {
            iM12873W0 = m12873W0();
        }
        if (iM12873W0 == 16) {
            long j10 = this.f34711v0;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f34710u0 = 0;
                int[] iArr = this.f34700p0;
                int i11 = this.f34697Y - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new C11473t("Expected an int but was " + this.f34711v0 + " at path " + m12867E());
        }
        if (iM12873W0 == 17) {
            long j11 = this.f34712w0;
            C0675i c0675i = this.f34709t0;
            c0675i.getClass();
            this.f34713x0 = c0675i.m1427Y0(j11, C21307a.f67720a);
        } else if (iM12873W0 == 9 || iM12873W0 == 8) {
            String strM12878b1 = iM12873W0 == 9 ? m12878b1(f34703A0) : m12878b1(f34707z0);
            this.f34713x0 = strM12878b1;
            try {
                int i12 = Integer.parseInt(strM12878b1);
                this.f34710u0 = 0;
                int[] iArr2 = this.f34700p0;
                int i13 = this.f34697Y - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iM12873W0 != 11) {
            throw new C11473t("Expected an int but was " + mo12805S() + " at path " + m12867E());
        }
        this.f34710u0 = 11;
        try {
            double d10 = Double.parseDouble(this.f34713x0);
            int i14 = (int) d10;
            if (i14 != d10) {
                throw new C11473t("Expected an int but was " + this.f34713x0 + " at path " + m12867E());
            }
            this.f34713x0 = null;
            this.f34710u0 = 0;
            int[] iArr3 = this.f34700p0;
            int i15 = this.f34697Y - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        } catch (NumberFormatException unused2) {
            throw new C11473t("Expected an int but was " + this.f34713x0 + " at path " + m12867E());
        }
    }

    @Override // bj.AbstractC11477x
    public final boolean hasNext() throws C4206F, EOFException {
        int iM12873W0 = this.f34710u0;
        if (iM12873W0 == 0) {
            iM12873W0 = m12873W0();
        }
        return (iM12873W0 == 2 || iM12873W0 == 4 || iM12873W0 == 18) ? false : true;
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: k */
    public final void mo12817k() throws C4206F, EOFException {
        int iM12873W0 = this.f34710u0;
        if (iM12873W0 == 0) {
            iM12873W0 = m12873W0();
        }
        if (iM12873W0 != 4) {
            throw new C11473t("Expected END_ARRAY but was " + mo12805S() + " at path " + m12867E());
        }
        int i10 = this.f34697Y;
        this.f34697Y = i10 - 1;
        int[] iArr = this.f34700p0;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f34710u0 = 0;
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: m */
    public final void mo12818m() throws C4206F, EOFException {
        int iM12873W0 = this.f34710u0;
        if (iM12873W0 == 0) {
            iM12873W0 = m12873W0();
        }
        if (iM12873W0 != 2) {
            throw new C11473t("Expected END_OBJECT but was " + mo12805S() + " at path " + m12867E());
        }
        int i10 = this.f34697Y;
        int i11 = i10 - 1;
        this.f34697Y = i11;
        this.f34699o0[i11] = null;
        int[] iArr = this.f34700p0;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f34710u0 = 0;
    }

    public final String toString() {
        return "JsonReader(" + this.f34708s0 + Separators.RPAREN;
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: v0 */
    public final int mo12819v0(C11475v c11475v) throws C4206F, EOFException {
        int iM12873W0 = this.f34710u0;
        if (iM12873W0 == 0) {
            iM12873W0 = m12873W0();
        }
        if (iM12873W0 < 12 || iM12873W0 > 15) {
            return -1;
        }
        if (iM12873W0 == 15) {
            return m12874X0(this.f34713x0, c11475v);
        }
        int iMo1342G0 = this.f34708s0.mo1342G0(c11475v.f34685b);
        if (iMo1342G0 != -1) {
            this.f34710u0 = 0;
            this.f34699o0[this.f34697Y - 1] = c11475v.f34684a[iMo1342G0];
            return iMo1342G0;
        }
        String str = this.f34699o0[this.f34697Y - 1];
        String strMo12813a0 = mo12813a0();
        int iM12874X0 = m12874X0(strMo12813a0, c11475v);
        if (iM12874X0 == -1) {
            this.f34710u0 = 15;
            this.f34713x0 = strMo12813a0;
            this.f34699o0[this.f34697Y - 1] = str;
        }
        return iM12874X0;
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: x */
    public final String mo12820x() throws C4206F, EOFException {
        String strM1427Y0;
        int iM12873W0 = this.f34710u0;
        if (iM12873W0 == 0) {
            iM12873W0 = m12873W0();
        }
        if (iM12873W0 == 10) {
            strM1427Y0 = m12879c1();
        } else if (iM12873W0 == 9) {
            strM1427Y0 = m12878b1(f34703A0);
        } else if (iM12873W0 == 8) {
            strM1427Y0 = m12878b1(f34707z0);
        } else if (iM12873W0 == 11) {
            strM1427Y0 = this.f34713x0;
            this.f34713x0 = null;
        } else if (iM12873W0 == 16) {
            strM1427Y0 = Long.toString(this.f34711v0);
        } else {
            if (iM12873W0 != 17) {
                throw new C11473t("Expected a string but was " + mo12805S() + " at path " + m12867E());
            }
            long j10 = this.f34712w0;
            C0675i c0675i = this.f34709t0;
            c0675i.getClass();
            strM1427Y0 = c0675i.m1427Y0(j10, C21307a.f67720a);
        }
        this.f34710u0 = 0;
        int[] iArr = this.f34700p0;
        int i10 = this.f34697Y - 1;
        iArr[i10] = iArr[i10] + 1;
        return strM1427Y0;
    }

    public C11478y(C11478y c11478y) {
        super(c11478y);
        this.f34710u0 = 0;
        C0657F c0657fPeek = c11478y.f34708s0.peek();
        this.f34708s0 = c0657fPeek;
        this.f34709t0 = c0657fPeek.f1922Z;
        this.f34710u0 = c11478y.f34710u0;
        this.f34711v0 = c11478y.f34711v0;
        this.f34712w0 = c11478y.f34712w0;
        this.f34713x0 = c11478y.f34713x0;
        try {
            c0657fPeek.mo1362s(c11478y.f34709t0.f1970Z);
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
