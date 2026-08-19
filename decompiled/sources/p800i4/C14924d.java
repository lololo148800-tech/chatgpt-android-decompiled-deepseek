package p800i4;

import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.util.List;
import p1009s9.C19506i;
import p1016t3.AbstractC19754D;
import p1016t3.C19753C;
import p1016t3.C19755E;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1016t3.InterfaceC19752B;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p372P3.AbstractC6320b;
import p372P3.C6330l;
import p372P3.C6332n;
import p372P3.C6337s;
import p372P3.C6341w;
import p372P3.C6344z;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6333o;
import p372P3.InterfaceC6334p;
import p372P3.InterfaceC6335q;
import p523V9.AbstractC7957O4;
import p523V9.AbstractC8135l5;
import p561X.C8990d;
import p571X9.AbstractC9306j0;
import p696d4.C13014l;
import p696d4.C13016n;

/* JADX INFO: renamed from: i4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C14924d implements InterfaceC6333o {

    /* JADX INFO: renamed from: t */
    public static final C8990d f46488t = new C8990d(12);

    /* JADX INFO: renamed from: f */
    public final C6332n f46494f;

    /* JADX INFO: renamed from: g */
    public InterfaceC6335q f46495g;

    /* JADX INFO: renamed from: h */
    public InterfaceC6316H f46496h;

    /* JADX INFO: renamed from: i */
    public InterfaceC6316H f46497i;

    /* JADX INFO: renamed from: j */
    public int f46498j;

    /* JADX INFO: renamed from: k */
    public C19753C f46499k;

    /* JADX INFO: renamed from: m */
    public long f46501m;

    /* JADX INFO: renamed from: n */
    public long f46502n;

    /* JADX INFO: renamed from: o */
    public int f46503o;

    /* JADX INFO: renamed from: p */
    public InterfaceC14926f f46504p;

    /* JADX INFO: renamed from: q */
    public boolean f46505q;

    /* JADX INFO: renamed from: r */
    public boolean f46506r;

    /* JADX INFO: renamed from: s */
    public long f46507s;

    /* JADX INFO: renamed from: a */
    public final int f46489a = 0;

    /* JADX INFO: renamed from: b */
    public final C20811m f46490b = new C20811m(10);

    /* JADX INFO: renamed from: c */
    public final C6344z f46491c = new C6344z();

    /* JADX INFO: renamed from: d */
    public final C6341w f46492d = new C6341w();

    /* JADX INFO: renamed from: l */
    public long f46500l = -9223372036854775807L;

    /* JADX INFO: renamed from: e */
    public final C19506i f46493e = new C19506i(17, (byte) 0);

    public C14924d() {
        C6332n c6332n = new C6332n();
        this.f46494f = c6332n;
        this.f46497i = c6332n;
    }

    /* JADX INFO: renamed from: b */
    public static long m16092b(C19753C c19753c) {
        if (c19753c == null) {
            return -9223372036854775807L;
        }
        int length = c19753c.f62555Y.length;
        for (int i10 = 0; i10 < length; i10++) {
            InterfaceC19752B interfaceC19752B = c19753c.f62555Y[i10];
            if (interfaceC19752B instanceof C13016n) {
                C13016n c13016n = (C13016n) interfaceC19752B;
                if (c13016n.f41286Y.equals("TLEN")) {
                    return AbstractC20817s.m21390D(Long.parseLong((String) c13016n.f41299o0.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: a */
    public final InterfaceC6333o mo6855a() {
        return this;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: c */
    public final boolean mo6856c(InterfaceC6334p interfaceC6334p) {
        return m16094e((C6330l) interfaceC6334p, true);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m16093d(C6330l c6330l) {
        InterfaceC14926f interfaceC14926f = this.f46504p;
        if (interfaceC14926f != null) {
            long jMo16087b = interfaceC14926f.mo16087b();
            if (jMo16087b != -1 && c6330l.mo3048e() > jMo16087b - 4) {
                return true;
            }
        }
        try {
            return !c6330l.mo3047d(this.f46490b.f66092a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m16094e(C6330l c6330l, boolean z6) throws C19755E, EOFException, InterruptedIOException {
        int iMo3048e;
        int i10;
        int iM6892h;
        int i11 = z6 ? 32768 : 131072;
        c6330l.f20550r0 = 0;
        if (c6330l.f20548p0 == 0) {
            C19753C c19753cM20611X = this.f46493e.m20611X(c6330l, (this.f46489a & 8) == 0 ? null : f46488t);
            this.f46499k = c19753cM20611X;
            if (c19753cM20611X != null) {
                this.f46492d.m6957b(c19753cM20611X);
            }
            iMo3048e = (int) c6330l.mo3048e();
            if (!z6) {
                c6330l.mo3052j(iMo3048e);
            }
            i10 = 0;
        } else {
            iMo3048e = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (m16093d(c6330l)) {
                if (i12 > 0) {
                    break;
                }
                throw new EOFException();
            }
            C20811m c20811m = this.f46490b;
            c20811m.m21344F(0);
            int iM21352g = c20811m.m21352g();
            if ((i10 == 0 || ((-128000) & iM21352g) == (((long) i10) & (-128000))) && (iM6892h = AbstractC6320b.m6892h(iM21352g)) != -1) {
                i12++;
                if (i12 != 1) {
                    if (i12 == 4) {
                        break;
                    }
                } else {
                    this.f46491c.m6959a(iM21352g);
                    i10 = iM21352g;
                }
                c6330l.m6941g(iM6892h - 4, false);
            } else {
                int i14 = i13 + 1;
                if (i13 == i11) {
                    if (z6) {
                        return false;
                    }
                    throw C19755E.m20712a(null, "Searched too many bytes.");
                }
                if (z6) {
                    c6330l.f20550r0 = 0;
                    c6330l.m6941g(iMo3048e + i14, false);
                } else {
                    c6330l.mo3052j(1);
                }
                i12 = 0;
                i13 = i14;
                i10 = 0;
            }
        }
        if (z6) {
            c6330l.mo3052j(iMo3048e + i13);
        } else {
            c6330l.f20550r0 = 0;
        }
        this.f46498j = i10;
        return true;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: f */
    public final void mo6857f(long j10, long j11) {
        this.f46498j = 0;
        this.f46500l = -9223372036854775807L;
        this.f46501m = 0L;
        this.f46503o = 0;
        this.f46507s = j11;
        InterfaceC14926f interfaceC14926f = this.f46504p;
        if (!(interfaceC14926f instanceof C14922b) || ((C14922b) interfaceC14926f).m16090a(j11)) {
            return;
        }
        this.f46506r = true;
        this.f46497i = this.f46494f;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: g */
    public final List mo6858g() {
        C11276A c11276a = AbstractC11278C.f34162Z;
        return C11294T.f34185q0;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0228  */
    /* JADX WARN: Code duplicated, block: B:112:0x0236  */
    /* JADX WARN: Code duplicated, block: B:114:0x023a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0251  */
    /* JADX WARN: Code duplicated, block: B:121:0x025f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0261  */
    /* JADX WARN: Code duplicated, block: B:124:0x0265 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0279  */
    /* JADX WARN: Code duplicated, block: B:130:0x028f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0293  */
    /* JADX WARN: Code duplicated, block: B:136:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:142:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:146:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Code duplicated, block: B:193:0x0413  */
    /* JADX WARN: Code duplicated, block: B:194:0x0415  */
    /* JADX WARN: Code duplicated, block: B:197:0x0424  */
    /* JADX WARN: Code duplicated, block: B:208:0x046b  */
    /* JADX WARN: Code duplicated, block: B:234:0x0502  */
    /* JADX WARN: Code duplicated, block: B:237:0x050a  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:71:0x017e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0184  */
    /* JADX WARN: Code duplicated, block: B:76:0x018a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0192  */
    /* JADX WARN: Code duplicated, block: B:81:0x0199  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a0 A[LOOP:3: B:82:0x019e->B:83:0x01a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d1  */
    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: h */
    public final int mo6859h(InterfaceC6334p interfaceC6334p, C6337s c6337s) throws C19755E, InterruptedIOException {
        C14924d c14924d;
        C6344z c6344z;
        int i10;
        int i11;
        InterfaceC6334p interfaceC6334p2;
        C20811m c20811m;
        int iMo4973f;
        int i12;
        int i13;
        int i14;
        int iM21352g;
        int iM21352g2;
        int iM21369x;
        long jM21367v;
        long[] jArr;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        long j11;
        long j12;
        int i19;
        long j13;
        long jM21394H;
        long j14;
        InterfaceC14926f c14921a;
        InterfaceC14926f c14922b;
        long j15;
        long jM21394H2;
        long[] jArr2;
        int i20;
        C6330l c6330l;
        C14923c c14923c;
        C6330l c6330l2;
        InterfaceC14926f c14921a2;
        long jM16092b;
        C19787n c19787n;
        C19753C c19753c;
        C6330l c6330l3;
        int iM21365t;
        AbstractC20800b.m21321i(this.f46496h);
        int i21 = AbstractC20817s.f66106a;
        int i22 = this.f46498j;
        C6344z c6344z2 = this.f46491c;
        if (i22 == 0) {
            try {
                m16094e((C6330l) interfaceC6334p, false);
            } catch (EOFException unused) {
                c14924d = this;
                c6344z = c6344z2;
                i10 = -1;
                i11 = -1;
            }
        }
        InterfaceC14926f interfaceC14926f = this.f46504p;
        C20811m c20811m2 = this.f46490b;
        if (interfaceC14926f == null) {
            C20811m c20811m3 = new C20811m(c6344z2.f20596b);
            ((C6330l) interfaceC6334p).mo3047d(c20811m3.f66092a, 0, c6344z2.f20596b, false);
            if ((c6344z2.f20595a & 1) != 0) {
                if (c6344z2.f20598d != 1) {
                    i14 = 36;
                } else {
                    i14 = 21;
                }
            } else if (c6344z2.f20598d != 1) {
                i14 = 21;
            } else {
                i14 = 13;
            }
            if (c20811m3.f66094c >= i14 + 4) {
                c20811m3.m21344F(i14);
                iM21352g = c20811m3.m21352g();
                if (iM21352g != 1483304551 && iM21352g != 1231971951) {
                    if (c20811m3.f66094c >= 40) {
                        c20811m3.m21344F(36);
                        if (c20811m3.m21352g() == 1447187017) {
                            iM21352g = 1447187017;
                        } else {
                            iM21352g = 0;
                        }
                    } else {
                        iM21352g = 0;
                    }
                }
            } else if (c20811m3.f66094c >= 40) {
                c20811m3.m21344F(36);
                if (c20811m3.m21352g() == 1447187017) {
                    iM21352g = 1447187017;
                } else {
                    iM21352g = 0;
                }
            } else {
                iM21352g = 0;
            }
            C6341w c6341w = this.f46492d;
            long jMo16087b = -1;
            if (iM21352g == 1231971951) {
                c6344z = c6344z2;
                c20811m = c20811m2;
                iM21352g2 = c20811m3.m21352g();
                if ((iM21352g2 & 1) != 0) {
                    iM21369x = c20811m3.m21369x();
                } else {
                    iM21369x = -1;
                }
                if ((iM21352g2 & 2) != 0) {
                    jM21367v = c20811m3.m21367v();
                } else {
                    jM21367v = -1;
                }
                if ((iM21352g2 & 4) == 4) {
                    jArr2 = new long[100];
                    for (i20 = 0; i20 < 100; i20++) {
                        jArr2[i20] = c20811m3.m21365t();
                    }
                    jArr = jArr2;
                } else {
                    jArr = null;
                }
                if ((iM21352g2 & 8) != 0) {
                    c20811m3.m21345G(4);
                }
                if (c20811m3.m21346a() >= 24) {
                    c20811m3.m21345G(21);
                    int iM21368w = c20811m3.m21368w();
                    i16 = (16773120 & iM21368w) >> 12;
                    i15 = iM21368w & 4095;
                } else {
                    i15 = -1;
                    i16 = -1;
                }
                j10 = iM21369x;
                i17 = c6344z.f20596b;
                int i23 = c6344z.f20597c;
                i18 = c6344z.f20599e;
                int i24 = c6344z.f20600f;
                if ((c6341w.f20579a != -1 || c6341w.f20580b == -1) && i16 != -1 && i15 != -1) {
                    c6341w.f20579a = i16;
                    c6341w.f20580b = i15;
                }
                interfaceC6334p2 = interfaceC6334p;
                C6330l c6330l4 = (C6330l) interfaceC6334p2;
                j11 = c6330l4.f20548p0;
                j12 = c6330l4.f20547o0;
                if (j12 != -1 || jM21367v == -1) {
                    i19 = i18;
                } else {
                    i19 = i18;
                    long j16 = j11 + jM21367v;
                    if (j12 != j16) {
                        StringBuilder sbM9894m = AbstractC9306j0.m9894m("Data size mismatch between stream (", j12, ") and Xing frame (");
                        sbM9894m.append(j16);
                        sbM9894m.append("), using Xing value.");
                        AbstractC20800b.m21327o("Mp3Extractor", sbM9894m.toString());
                    }
                    c6330l4.mo3052j(c6344z.f20596b);
                    if (iM21352g == 1483304551) {
                        if (j10 != -1 || j10 == 0) {
                            j15 = -9223372036854775807L;
                            jM21394H2 = -9223372036854775807L;
                        } else {
                            jM21394H2 = AbstractC20817s.m21394H(i23, (j10 * ((long) i24)) - 1);
                            j15 = -9223372036854775807L;
                        }
                        if (jM21394H2 == j15) {
                            c14922b = null;
                        } else {
                            if (jM21367v != -1 || jArr == null) {
                                c14921a = new C14928h(j11, i17, jM21394H2, i19, -1L, null);
                            } else {
                                c14921a = new C14928h(j11, i17, jM21394H2, i19, jM21367v, jArr);
                            }
                            c14922b = c14921a;
                        }
                    } else {
                        if (j10 != -1 || j10 == 0) {
                            j13 = -9223372036854775807L;
                            jM21394H = -9223372036854775807L;
                        } else {
                            jM21394H = AbstractC20817s.m21394H(i23, (((long) i24) * j10) - 1);
                            j13 = -9223372036854775807L;
                        }
                        if (jM21394H != j13) {
                            if (jM21367v != -1) {
                                j12 = j11 + jM21367v;
                                j14 = jM21367v - ((long) i17);
                            } else if (j12 != -1) {
                                j14 = (j12 - j11) - ((long) i17);
                            }
                            long j17 = j12;
                            long j18 = j14;
                            RoundingMode roundingMode = RoundingMode.HALF_UP;
                            c14921a = new C14921a(j17, j11 + ((long) i17), AbstractC8135l5.m8655c(AbstractC20817s.m21396J(j18, 8000000L, jM21394H, roundingMode)), AbstractC8135l5.m8655c(AbstractC7957O4.m8245e(j18, j10, roundingMode)), false);
                            c14922b = c14921a;
                        }
                        c14922b = null;
                    }
                    c14924d = this;
                }
                c6330l4.mo3052j(c6344z.f20596b);
                if (iM21352g == 1483304551) {
                    if (j10 != -1) {
                        j15 = -9223372036854775807L;
                        jM21394H2 = -9223372036854775807L;
                    } else {
                        j15 = -9223372036854775807L;
                        jM21394H2 = -9223372036854775807L;
                    }
                    if (jM21394H2 == j15) {
                        c14922b = null;
                    } else {
                        if (jM21367v != -1) {
                            c14921a = new C14928h(j11, i17, jM21394H2, i19, -1L, null);
                        } else {
                            c14921a = new C14928h(j11, i17, jM21394H2, i19, -1L, null);
                        }
                        c14922b = c14921a;
                    }
                } else {
                    if (j10 != -1) {
                        j13 = -9223372036854775807L;
                        jM21394H = -9223372036854775807L;
                    } else {
                        j13 = -9223372036854775807L;
                        jM21394H = -9223372036854775807L;
                    }
                    if (jM21394H != j13) {
                        if (jM21367v != -1) {
                            j12 = j11 + jM21367v;
                            j14 = jM21367v - ((long) i17);
                        } else if (j12 != -1) {
                            j14 = (j12 - j11) - ((long) i17);
                        }
                        long j19 = j12;
                        long j110 = j14;
                        RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                        c14921a = new C14921a(j19, j11 + ((long) i17), AbstractC8135l5.m8655c(AbstractC20817s.m21396J(j110, 8000000L, jM21394H, roundingMode2)), AbstractC8135l5.m8655c(AbstractC7957O4.m8245e(j110, j10, roundingMode2)), false);
                        c14922b = c14921a;
                    }
                    c14922b = null;
                }
                c14924d = this;
            } else if (iM21352g == 1447187017) {
                C6330l c6330l5 = (C6330l) interfaceC6334p;
                long j20 = c6330l5.f20548p0;
                c20811m3.m21345G(10);
                int iM21352g3 = c20811m3.m21352g();
                if (iM21352g3 <= 0) {
                    c6330l3 = c6330l5;
                    c6344z = c6344z2;
                    c20811m = c20811m2;
                } else {
                    int i25 = c6344z2.f20597c;
                    c20811m = c20811m2;
                    long jM21396J = AbstractC20817s.m21396J(iM21352g3, ((long) (i25 >= 32000 ? 1152 : 576)) * 1000000, i25, RoundingMode.FLOOR);
                    int iM21371z = c20811m3.m21371z();
                    int iM21371z2 = c20811m3.m21371z();
                    int iM21371z3 = c20811m3.m21371z();
                    c20811m3.m21345G(2);
                    long j21 = j20 + ((long) c6344z2.f20596b);
                    long[] jArr3 = new long[iM21371z];
                    long[] jArr4 = new long[iM21371z];
                    long j22 = j20;
                    int i26 = 0;
                    while (true) {
                        if (i26 >= iM21371z) {
                            C6344z c6344z3 = c6344z2;
                            c6330l3 = c6330l5;
                            long j23 = c6330l3.f20547o0;
                            if (j23 != -1 && j23 != j22) {
                                StringBuilder sbM9894m2 = AbstractC9306j0.m9894m("VBRI data size mismatch: ", j23, ", ");
                                sbM9894m2.append(j22);
                                AbstractC20800b.m21332t("VbriSeeker", sbM9894m2.toString());
                            }
                            c6344z = c6344z3;
                            c14922b = new C14927g(jArr3, jArr4, jM21396J, j22, c6344z.f20599e);
                            break;
                        }
                        C6344z c6344z4 = c6344z2;
                        jArr3[i26] = (((long) i26) * jM21396J) / ((long) iM21371z);
                        jArr4[i26] = Math.max(j22, j21);
                        if (iM21371z3 == 1) {
                            iM21365t = c20811m3.m21365t();
                        } else if (iM21371z3 == 2) {
                            iM21365t = c20811m3.m21371z();
                        } else if (iM21371z3 == 3) {
                            iM21365t = c20811m3.m21368w();
                        } else if (iM21371z3 != 4) {
                            c6330l3 = c6330l5;
                            c6344z = c6344z4;
                        } else {
                            iM21365t = c20811m3.m21369x();
                        }
                        j22 += ((long) iM21365t) * ((long) iM21371z2);
                        i26++;
                        c6344z2 = c6344z4;
                    }
                    c6330l3.mo3052j(c6344z.f20596b);
                    c14924d = this;
                    interfaceC6334p2 = interfaceC6334p;
                    c6341w = c6341w;
                }
                c14922b = null;
                c6330l3.mo3052j(c6344z.f20596b);
                c14924d = this;
                interfaceC6334p2 = interfaceC6334p;
                c6341w = c6341w;
            } else if (iM21352g != 1483304551) {
                ((C6330l) interfaceC6334p).f20550r0 = 0;
                c14924d = this;
                interfaceC6334p2 = interfaceC6334p;
                c6344z = c6344z2;
                c20811m = c20811m2;
                c6341w = c6341w;
                c14922b = null;
            } else {
                c6344z = c6344z2;
                c20811m = c20811m2;
                iM21352g2 = c20811m3.m21352g();
                if ((iM21352g2 & 1) != 0) {
                    iM21369x = c20811m3.m21369x();
                } else {
                    iM21369x = -1;
                }
                if ((iM21352g2 & 2) != 0) {
                    jM21367v = c20811m3.m21367v();
                } else {
                    jM21367v = -1;
                }
                if ((iM21352g2 & 4) == 4) {
                    jArr2 = new long[100];
                    while (i20 < 100) {
                        jArr2[i20] = c20811m3.m21365t();
                    }
                    jArr = jArr2;
                } else {
                    jArr = null;
                }
                if ((iM21352g2 & 8) != 0) {
                    c20811m3.m21345G(4);
                }
                if (c20811m3.m21346a() >= 24) {
                    c20811m3.m21345G(21);
                    int iM21368w2 = c20811m3.m21368w();
                    i16 = (16773120 & iM21368w2) >> 12;
                    i15 = iM21368w2 & 4095;
                } else {
                    i15 = -1;
                    i16 = -1;
                }
                j10 = iM21369x;
                i17 = c6344z.f20596b;
                int i27 = c6344z.f20597c;
                i18 = c6344z.f20599e;
                int i28 = c6344z.f20600f;
                if (c6341w.f20579a != -1) {
                    c6341w.f20579a = i16;
                    c6341w.f20580b = i15;
                } else {
                    c6341w.f20579a = i16;
                    c6341w.f20580b = i15;
                }
                interfaceC6334p2 = interfaceC6334p;
                C6330l c6330l6 = (C6330l) interfaceC6334p2;
                j11 = c6330l6.f20548p0;
                j12 = c6330l6.f20547o0;
                if (j12 != -1) {
                    i19 = i18;
                } else {
                    i19 = i18;
                }
                c6330l6.mo3052j(c6344z.f20596b);
                if (iM21352g == 1483304551) {
                    if (j10 != -1) {
                        j15 = -9223372036854775807L;
                        jM21394H2 = -9223372036854775807L;
                    } else {
                        j15 = -9223372036854775807L;
                        jM21394H2 = -9223372036854775807L;
                    }
                    if (jM21394H2 == j15) {
                        c14922b = null;
                    } else {
                        if (jM21367v != -1) {
                            c14921a = new C14928h(j11, i17, jM21394H2, i19, -1L, null);
                        } else {
                            c14921a = new C14928h(j11, i17, jM21394H2, i19, -1L, null);
                        }
                        c14922b = c14921a;
                    }
                } else {
                    if (j10 != -1) {
                        j13 = -9223372036854775807L;
                        jM21394H = -9223372036854775807L;
                    } else {
                        j13 = -9223372036854775807L;
                        jM21394H = -9223372036854775807L;
                    }
                    if (jM21394H != j13) {
                        if (jM21367v != -1) {
                            j12 = j11 + jM21367v;
                            j14 = jM21367v - ((long) i17);
                        } else if (j12 != -1) {
                            j14 = (j12 - j11) - ((long) i17);
                        }
                        long j111 = j12;
                        long j112 = j14;
                        RoundingMode roundingMode3 = RoundingMode.HALF_UP;
                        c14921a = new C14921a(j111, j11 + ((long) i17), AbstractC8135l5.m8655c(AbstractC20817s.m21396J(j112, 8000000L, jM21394H, roundingMode3)), AbstractC8135l5.m8655c(AbstractC7957O4.m8245e(j112, j10, roundingMode3)), false);
                        c14922b = c14921a;
                    }
                    c14922b = null;
                }
                c14924d = this;
            }
            C19753C c19753c2 = c14924d.f46499k;
            C6330l c6330l7 = (C6330l) interfaceC6334p2;
            long j24 = c6330l7.f20548p0;
            if (c19753c2 == null) {
                c6330l = c6330l7;
                c14923c = null;
                break;
            }
            InterfaceC19752B[] interfaceC19752BArr = c19753c2.f62555Y;
            int length = interfaceC19752BArr.length;
            int i29 = 0;
            while (true) {
                if (i29 >= length) {
                    c6330l = c6330l7;
                    c14923c = null;
                    break;
                }
                InterfaceC19752B interfaceC19752B = interfaceC19752BArr[i29];
                if (interfaceC19752B instanceof C13014l) {
                    C13014l c13014l = (C13014l) interfaceC19752B;
                    long jM16092b2 = m16092b(c19753c2);
                    int length2 = c13014l.f41294q0.length;
                    boolean z6 = true;
                    int i30 = length2 + 1;
                    long[] jArr5 = new long[i30];
                    long[] jArr6 = new long[i30];
                    jArr5[0] = j24;
                    jArr6[0] = 0;
                    int i31 = 1;
                    long j25 = 0;
                    while (i31 <= length2) {
                        int i32 = i31 - 1;
                        j24 += (long) (c13014l.f41292o0 + c13014l.f41294q0[i32]);
                        j25 += (long) (c13014l.f41293p0 + c13014l.f41295r0[i32]);
                        jArr5[i31] = j24;
                        jArr6[i31] = j25;
                        i31++;
                        z6 = true;
                        c6330l7 = c6330l7;
                        length2 = length2;
                    }
                    c6330l = c6330l7;
                    c14923c = new C14923c(jM16092b2, jArr5, jArr6);
                    break;
                }
                i29++;
                c6330l7 = c6330l7;
            }
            boolean z10 = c14924d.f46505q;
            int i33 = c14924d.f46489a;
            if (z10) {
                c14921a2 = new C14925e(-9223372036854775807L);
                c6330l2 = c6330l;
            } else {
                if ((i33 & 4) != 0) {
                    if (c14923c != null) {
                        jM16092b = c14923c.f46487c;
                    } else if (c14922b != null) {
                        jM16092b = c14922b.mo4938l();
                        jMo16087b = c14922b.mo16087b();
                    } else {
                        jM16092b = m16092b(c14924d.f46499k);
                    }
                    c6330l2 = c6330l;
                    c14922b = new C14922b(jM16092b, c6330l2.f20548p0, jMo16087b);
                } else {
                    c6330l2 = c6330l;
                    if (c14923c != null) {
                        c14922b = c14923c;
                    } else if (c14922b == null) {
                        c14922b = null;
                    }
                }
                if (c14922b == null || !(c14922b.mo6853d() || (i33 & 1) == 0)) {
                    boolean z11 = (2 & i33) != 0;
                    c6330l2.mo3047d(c20811m.f66092a, 0, 4, false);
                    c20811m.m21344F(0);
                    c6344z.m6959a(c20811m.m21352g());
                    c14921a2 = new C14921a(c6330l2.f20547o0, c6330l2.f20548p0, c6344z.f20599e, c6344z.f20596b, z11);
                } else {
                    c14921a2 = c14922b;
                }
                c14924d.f46504p = c14921a2;
                c14924d.f46495g.mo3045F(c14921a2);
                c19787n = new C19787n();
                c19787n.f62714l = AbstractC19754D.m20711i((String) c6344z.f20601g);
                c19787n.f62715m = 4096;
                c19787n.f62728z = c6344z.f20598d;
                c19787n.f62694A = c6344z.f20597c;
                C6341w c6341w2 = c6341w;
                c19787n.f62696C = c6341w2.f20579a;
                c19787n.f62697D = c6341w2.f20580b;
                if ((i33 & 8) != 0) {
                    c19753c = null;
                } else {
                    c19753c = c14924d.f46499k;
                }
                c19787n.f62712j = c19753c;
                if (c14924d.f46504p.mo16089k() != -2147483647) {
                    c19787n.f62709g = c14924d.f46504p.mo16089k();
                }
                c14924d.f46497i.mo4971d(new C19788o(c19787n));
                c14924d.f46502n = c6330l2.f20548p0;
            }
            c20811m = c20811m;
            c14924d.f46504p = c14921a2;
            c14924d.f46495g.mo3045F(c14921a2);
            c19787n = new C19787n();
            c19787n.f62714l = AbstractC19754D.m20711i((String) c6344z.f20601g);
            c19787n.f62715m = 4096;
            c19787n.f62728z = c6344z.f20598d;
            c19787n.f62694A = c6344z.f20597c;
            C6341w c6341w3 = c6341w;
            c19787n.f62696C = c6341w3.f20579a;
            c19787n.f62697D = c6341w3.f20580b;
            if ((i33 & 8) != 0) {
                c19753c = null;
            } else {
                c19753c = c14924d.f46499k;
            }
            c19787n.f62712j = c19753c;
            if (c14924d.f46504p.mo16089k() != -2147483647) {
                c19787n.f62709g = c14924d.f46504p.mo16089k();
            }
            c14924d.f46497i.mo4971d(new C19788o(c19787n));
            c14924d.f46502n = c6330l2.f20548p0;
        } else {
            c14924d = this;
            interfaceC6334p2 = interfaceC6334p;
            c6344z = c6344z2;
            c20811m = c20811m2;
            long j26 = c14924d.f46502n;
            if (j26 != 0) {
                long j27 = ((C6330l) interfaceC6334p2).f20548p0;
                if (j27 < j26) {
                    ((C6330l) interfaceC6334p2).mo3052j((int) (j26 - j27));
                }
            }
        }
        if (c14924d.f46503o == 0) {
            ((C6330l) interfaceC6334p2).f20550r0 = 0;
            C6330l c6330l8 = (C6330l) interfaceC6334p2;
            if (c14924d.m16093d(c6330l8)) {
                i13 = -1;
            } else {
                c20811m.m21344F(0);
                int iM21352g4 = c20811m.m21352g();
                if (((-128000) & iM21352g4) != (((long) c14924d.f46498j) & (-128000)) || AbstractC6320b.m6892h(iM21352g4) == -1) {
                    c6330l8.mo3052j(1);
                    c14924d.f46498j = 0;
                } else {
                    c6344z.m6959a(iM21352g4);
                    if (c14924d.f46500l == -9223372036854775807L) {
                        c14924d.f46500l = c14924d.f46504p.mo16088e(c6330l8.f20548p0);
                    }
                    int i34 = c6344z.f20596b;
                    c14924d.f46503o = i34;
                    InterfaceC14926f interfaceC14926f2 = c14924d.f46504p;
                    if (interfaceC14926f2 instanceof C14922b) {
                        C14922b c14922b2 = (C14922b) interfaceC14926f2;
                        long j28 = (((c14924d.f46501m + ((long) c6344z.f20600f)) * 1000000) / ((long) c6344z.f20597c)) + c14924d.f46500l;
                        long j29 = c6330l8.f20548p0 + ((long) i34);
                        if (!c14922b2.m16090a(j28)) {
                            c14922b2.f46481b.m20921a(j28);
                            c14922b2.f46482c.m20921a(j29);
                        }
                        if (c14924d.f46506r && c14922b2.m16090a(c14924d.f46507s)) {
                            c14924d.f46506r = false;
                            c14924d.f46497i = c14924d.f46496h;
                        }
                    }
                    iMo4973f = c14924d.f46497i.mo4973f(interfaceC6334p2, c14924d.f46503o, true);
                    if (iMo4973f == -1) {
                        i13 = -1;
                    } else {
                        i12 = c14924d.f46503o - iMo4973f;
                        c14924d.f46503o = i12;
                        if (i12 <= 0) {
                            c14924d.f46497i.mo4968a(((c14924d.f46501m * 1000000) / ((long) c6344z.f20597c)) + c14924d.f46500l, 1, c6344z.f20596b, 0, null);
                            c14924d.f46501m += (long) c6344z.f20600f;
                            c14924d.f46503o = 0;
                            i13 = 0;
                        }
                    }
                }
                i13 = 0;
            }
        } else {
            iMo4973f = c14924d.f46497i.mo4973f(interfaceC6334p2, c14924d.f46503o, true);
            if (iMo4973f == -1) {
                i13 = -1;
            } else {
                i12 = c14924d.f46503o - iMo4973f;
                c14924d.f46503o = i12;
                if (i12 <= 0) {
                    i13 = 0;
                } else {
                    c14924d.f46497i.mo4968a(((c14924d.f46501m * 1000000) / ((long) c6344z.f20597c)) + c14924d.f46500l, 1, c6344z.f20596b, 0, null);
                    c14924d.f46501m += (long) c6344z.f20600f;
                    c14924d.f46503o = 0;
                    i13 = 0;
                }
            }
        }
        i11 = i13;
        i10 = -1;
        if (i11 == i10) {
            InterfaceC14926f interfaceC14926f3 = c14924d.f46504p;
            if (interfaceC14926f3 instanceof C14922b) {
                long j30 = ((c14924d.f46501m * 1000000) / ((long) c6344z.f20597c)) + c14924d.f46500l;
                if (interfaceC14926f3.mo4938l() != j30) {
                    InterfaceC14926f interfaceC14926f4 = c14924d.f46504p;
                    ((C14922b) interfaceC14926f4).f46484e = j30;
                    c14924d.f46495g.mo3045F(interfaceC14926f4);
                }
            }
        }
        return i11;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: i */
    public final void mo6860i(InterfaceC6335q interfaceC6335q) {
        this.f46495g = interfaceC6335q;
        InterfaceC6316H interfaceC6316HMo3044D = interfaceC6335q.mo3044D(0, 1);
        this.f46496h = interfaceC6316HMo3044D;
        this.f46497i = interfaceC6316HMo3044D;
        this.f46495g.mo3061s();
    }

    @Override // p372P3.InterfaceC6333o
    public final void release() {
    }
}
