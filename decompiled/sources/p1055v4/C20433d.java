package p1055v4;

import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import p1016t3.AbstractC19754D;
import p1016t3.C19755E;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p372P3.AbstractC6320b;
import p372P3.C6318J;
import p372P3.C6319a;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;
import p523V9.AbstractC8135l5;
import p734ep.C13458b;

/* JADX INFO: renamed from: v4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C20433d implements InterfaceC20435f {

    /* JADX INFO: renamed from: a */
    public final C20811m f64679a;

    /* JADX INFO: renamed from: c */
    public final String f64681c;

    /* JADX INFO: renamed from: d */
    public final int f64682d;

    /* JADX INFO: renamed from: e */
    public String f64683e;

    /* JADX INFO: renamed from: f */
    public InterfaceC6316H f64684f;

    /* JADX INFO: renamed from: h */
    public int f64686h;

    /* JADX INFO: renamed from: i */
    public int f64687i;

    /* JADX INFO: renamed from: j */
    public long f64688j;

    /* JADX INFO: renamed from: k */
    public C19788o f64689k;

    /* JADX INFO: renamed from: l */
    public int f64690l;

    /* JADX INFO: renamed from: m */
    public int f64691m;

    /* JADX INFO: renamed from: g */
    public int f64685g = 0;

    /* JADX INFO: renamed from: p */
    public long f64694p = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f64680b = new AtomicInteger();

    /* JADX INFO: renamed from: n */
    public int f64692n = -1;

    /* JADX INFO: renamed from: o */
    public int f64693o = -1;

    public C20433d(String str, int i10, int i11) {
        this.f64679a = new C20811m(new byte[i11]);
        this.f64681c = str;
        this.f64682d = i10;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21094a(C20811m c20811m, byte[] bArr, int i10) {
        int iMin = Math.min(c20811m.m21346a(), i10 - this.f64686h);
        c20811m.m21350e(bArr, this.f64686h, iMin);
        int i11 = this.f64686h + iMin;
        this.f64686h = i11;
        return i11 == i10;
    }

    /* JADX WARN: Code duplicated, block: B:181:0x046d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0476  */
    /* JADX WARN: Code duplicated, block: B:186:0x0479 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x047b  */
    /* JADX WARN: Code duplicated, block: B:189:0x048b  */
    /* JADX WARN: Code duplicated, block: B:191:0x0497  */
    /* JADX WARN: Code duplicated, block: B:192:0x04a0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [P3.H] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [int] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: b */
    public final void mo21088b(C20811m c20811m) throws C19755E {
        byte b;
        int i10;
        boolean z6;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        byte b10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int iM6872i;
        int iM6872i2;
        int i23;
        int iM6872i3;
        int i24;
        long jM21396J;
        int i25;
        long jM21396J2;
        int iM6872i4;
        int i26;
        int i27;
        int i28;
        byte b11 = -1;
        boolean z11 = true;
        AbstractC20800b.m21321i(this.f64684f);
        while (c20811m.m21346a() > 0) {
            int i29 = this.f64685g;
            C20811m c20811m2 = this.f64679a;
            switch (i29) {
                case 0:
                    b = b11;
                    while (true) {
                        if (c20811m.m21346a() > 0) {
                            int i30 = this.f64687i << 8;
                            this.f64687i = i30;
                            int iM21365t = i30 | c20811m.m21365t();
                            this.f64687i = iM21365t;
                            if (iM21365t == 2147385345 || iM21365t == -25230976 || iM21365t == 536864768 || iM21365t == -14745368) {
                                i10 = 1;
                            } else if (iM21365t == 1683496997 || iM21365t == 622876772) {
                                i10 = 2;
                            } else if (iM21365t == 1078008818 || iM21365t == -233094848) {
                                i10 = 3;
                            } else {
                                i10 = (iM21365t == 1908687592 || iM21365t == -398277519) ? 4 : 0;
                            }
                            this.f64691m = i10;
                            if (i10 != 0) {
                                byte[] bArr = c20811m2.f66092a;
                                bArr[0] = (byte) ((iM21365t >> 24) & 255);
                                bArr[1] = (byte) ((iM21365t >> 16) & 255);
                                bArr[2] = (byte) ((iM21365t >> 8) & 255);
                                bArr[3] = (byte) (iM21365t & 255);
                                this.f64686h = 4;
                                this.f64687i = 0;
                                if (i10 == 3 || i10 == 4) {
                                    z6 = true;
                                    this.f64685g = 4;
                                } else {
                                    z6 = true;
                                    if (i10 == 1) {
                                        this.f64685g = 1;
                                    } else {
                                        this.f64685g = 2;
                                    }
                                }
                                z11 = z6;
                                b11 = b;
                            }
                        } else {
                            b11 = b;
                            z11 = true;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (m21094a(c20811m, c20811m2.f66092a, 18)) {
                        byte[] bArr2 = c20811m2.f66092a;
                        if (this.f64689k == null) {
                            String str = this.f64683e;
                            C6318J c6318jM6893i = AbstractC6320b.m6893i(bArr2);
                            c6318jM6893i.m6883t(60);
                            int i31 = AbstractC6320b.f20481j[c6318jM6893i.m6872i(6)];
                            int i32 = AbstractC6320b.f20482k[c6318jM6893i.m6872i(4)];
                            int iM6872i5 = c6318jM6893i.m6872i(5);
                            if (iM6872i5 >= 29) {
                                i20 = -1;
                                i19 = 2;
                            } else {
                                int i33 = AbstractC6320b.f20483l[iM6872i5] * 1000;
                                i19 = 2;
                                i20 = i33 / 2;
                            }
                            c6318jM6893i.m6883t(10);
                            int i34 = i31 + (c6318jM6893i.m6872i(i19) > 0 ? 1 : 0);
                            C19787n c19787n = new C19787n();
                            c19787n.f62703a = str;
                            c19787n.f62714l = AbstractC19754D.m20711i("audio/vnd.dts");
                            c19787n.f62709g = i20;
                            c19787n.f62728z = i34;
                            c19787n.f62694A = i32;
                            c19787n.f62718p = null;
                            c19787n.f62706d = this.f64681c;
                            c19787n.f62708f = this.f64682d;
                            C19788o c19788o = new C19788o(c19787n);
                            this.f64689k = c19788o;
                            this.f64684f.mo4971d(c19788o);
                        }
                        byte b12 = bArr2[0];
                        if (b12 != -2) {
                            if (b12 == -1) {
                                i17 = ((bArr2[7] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                i18 = (bArr2[9] & 60) >> 2;
                            } else if (b12 != 31) {
                                i11 = (((3 & bArr2[5]) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                            } else {
                                i17 = ((bArr2[6] & 3) << 12) | ((bArr2[7] & 255) << 4);
                                i18 = (bArr2[8] & 60) >> 2;
                            }
                            i11 = (i17 | i18) + 1;
                            z10 = true;
                            if (z10) {
                                i11 = (i11 * 16) / 14;
                            }
                            this.f64690l = i11;
                            if (b12 != -2) {
                                b = -1;
                                if (b12 != -1) {
                                    if (b12 != 31) {
                                        i15 = (bArr2[4] & 1) << 6;
                                        i16 = bArr2[5] & 252;
                                        i14 = 2;
                                    } else {
                                        i14 = 2;
                                        i15 = (bArr2[5] & 7) << 4;
                                        b10 = bArr2[6];
                                    }
                                    i13 = (i16 >> i14) | i15;
                                    i12 = 1;
                                } else {
                                    i14 = 2;
                                    i15 = (bArr2[4] & 7) << 4;
                                    b10 = bArr2[7];
                                }
                                i16 = b10 & 60;
                                i13 = (i16 >> i14) | i15;
                                i12 = 1;
                            } else {
                                b = -1;
                                i12 = 1;
                                i13 = ((bArr2[4] & 252) >> 2) | ((bArr2[5] & 1) << 6);
                            }
                            this.f64688j = AbstractC8135l5.m8655c(AbstractC20817s.m21394H(this.f64689k.f62730B, (i13 + i12) * 32));
                            c20811m2.m21344F(0);
                            this.f64684f.mo4970c(18, c20811m2);
                            this.f64685g = 6;
                            b11 = b;
                        } else {
                            i11 = (((bArr2[4] & 3) << 12) | ((bArr2[7] & 255) << 4) | ((bArr2[6] & 240) >> 4)) + 1;
                        }
                        z10 = false;
                        if (z10) {
                            i11 = (i11 * 16) / 14;
                        }
                        this.f64690l = i11;
                        if (b12 != -2) {
                            b = -1;
                            if (b12 != -1) {
                                if (b12 != 31) {
                                    i15 = (bArr2[4] & 1) << 6;
                                    i16 = bArr2[5] & 252;
                                    i14 = 2;
                                } else {
                                    i14 = 2;
                                    i15 = (bArr2[5] & 7) << 4;
                                    b10 = bArr2[6];
                                }
                                i13 = (i16 >> i14) | i15;
                                i12 = 1;
                            } else {
                                i14 = 2;
                                i15 = (bArr2[4] & 7) << 4;
                                b10 = bArr2[7];
                            }
                            i16 = b10 & 60;
                            i13 = (i16 >> i14) | i15;
                            i12 = 1;
                        } else {
                            b = -1;
                            i12 = 1;
                            i13 = ((bArr2[4] & 252) >> 2) | ((bArr2[5] & 1) << 6);
                        }
                        this.f64688j = AbstractC8135l5.m8655c(AbstractC20817s.m21394H(this.f64689k.f62730B, (i13 + i12) * 32));
                        c20811m2.m21344F(0);
                        this.f64684f.mo4970c(18, c20811m2);
                        this.f64685g = 6;
                        b11 = b;
                    } else {
                        b11 = -1;
                    }
                    z11 = true;
                    break;
                case 2:
                    if (m21094a(c20811m, c20811m2.f66092a, 7)) {
                        C6318J c6318jM6893i2 = AbstractC6320b.m6893i(c20811m2.f66092a);
                        c6318jM6893i2.m6883t(42);
                        this.f64692n = c6318jM6893i2.m6872i(c6318jM6893i2.m6871h() ? 12 : 8) + 1;
                        this.f64685g = 3;
                    }
                    b11 = -1;
                    z11 = true;
                    break;
                case 3:
                    if (m21094a(c20811m, c20811m2.f66092a, this.f64692n)) {
                        C6318J c6318jM6893i3 = AbstractC6320b.m6893i(c20811m2.f66092a);
                        c6318jM6893i3.m6883t(40);
                        int iM6872i6 = c6318jM6893i3.m6872i(2);
                        if (c6318jM6893i3.m6871h()) {
                            i21 = 20;
                            i22 = 12;
                        } else {
                            i21 = 16;
                            i22 = 8;
                        }
                        c6318jM6893i3.m6883t(i22);
                        int iM6872i7 = c6318jM6893i3.m6872i(i21) + 1;
                        boolean zM6871h = c6318jM6893i3.m6871h();
                        if (zM6871h) {
                            iM6872i = c6318jM6893i3.m6872i(2);
                            iM6872i2 = (c6318jM6893i3.m6872i(3) + 1) * 512;
                            if (c6318jM6893i3.m6871h()) {
                                c6318jM6893i3.m6883t(36);
                            }
                            int iM6872i8 = c6318jM6893i3.m6872i(3) + 1;
                            int iM6872i9 = c6318jM6893i3.m6872i(3) + 1;
                            if (iM6872i8 != 1 || iM6872i9 != 1) {
                                throw C19755E.m20713b("Multiple audio presentations or assets not supported");
                            }
                            int i35 = iM6872i6 + 1;
                            int iM6872i10 = c6318jM6893i3.m6872i(i35);
                            for (int i36 = 0; i36 < i35; i36++) {
                                if (((iM6872i10 >> i36) & 1) == 1) {
                                    c6318jM6893i3.m6883t(8);
                                }
                            }
                            if (c6318jM6893i3.m6871h()) {
                                c6318jM6893i3.m6883t(2);
                                int iM6872i11 = (c6318jM6893i3.m6872i(2) + 1) << 2;
                                int iM6872i12 = c6318jM6893i3.m6872i(2) + 1;
                                for (int i37 = 0; i37 < iM6872i12; i37++) {
                                    c6318jM6893i3.m6883t(iM6872i11);
                                }
                            }
                        } else {
                            iM6872i = -1;
                            iM6872i2 = 0;
                        }
                        c6318jM6893i3.m6883t(i21);
                        c6318jM6893i3.m6883t(12);
                        if (zM6871h) {
                            if (c6318jM6893i3.m6871h()) {
                                c6318jM6893i3.m6883t(4);
                            }
                            if (c6318jM6893i3.m6871h()) {
                                c6318jM6893i3.m6883t(24);
                            }
                            if (c6318jM6893i3.m6871h()) {
                                i23 = 1;
                                c6318jM6893i3.m6884u(c6318jM6893i3.m6872i(10) + 1);
                            } else {
                                i23 = 1;
                            }
                            c6318jM6893i3.m6883t(5);
                            int i38 = AbstractC6320b.f20484m[c6318jM6893i3.m6872i(4)];
                            iM6872i3 = c6318jM6893i3.m6872i(8) + i23;
                            i24 = i38;
                        } else {
                            i23 = 1;
                            iM6872i3 = -1;
                            i24 = -2147483647;
                        }
                        if (zM6871h) {
                            if (iM6872i == 0) {
                                i25 = 32000;
                            } else if (iM6872i == i23) {
                                i25 = 44100;
                            } else {
                                if (iM6872i != 2) {
                                    throw C19755E.m20712a(null, "Unsupported reference clock code in DTS HD header: " + iM6872i);
                                }
                                i25 = 48000;
                            }
                            long j10 = i25;
                            int i39 = AbstractC20817s.f66106a;
                            jM21396J = AbstractC20817s.m21396J(iM6872i2, 1000000L, j10, RoundingMode.FLOOR);
                        } else {
                            jM21396J = -9223372036854775807L;
                        }
                        m21095g(new C6319a("audio/vnd.dts.hd;profile=lbr", iM6872i3, i24, iM6872i7, jM21396J));
                        this.f64690l = iM6872i7;
                        this.f64688j = jM21396J == -9223372036854775807L ? 0L : jM21396J;
                        c20811m2.m21344F(0);
                        this.f64684f.mo4970c(this.f64692n, c20811m2);
                        this.f64685g = 6;
                    }
                    b11 = -1;
                    z11 = true;
                    break;
                case 4:
                    if (m21094a(c20811m, c20811m2.f66092a, 6)) {
                        C6318J c6318jM6893i4 = AbstractC6320b.m6893i(c20811m2.f66092a);
                        c6318jM6893i4.m6883t(32);
                        int iM6899o = AbstractC6320b.m6899o(c6318jM6893i4, AbstractC6320b.f20489r) + 1;
                        this.f64693o = iM6899o;
                        int i40 = this.f64686h;
                        if (i40 > iM6899o) {
                            int i41 = i40 - iM6899o;
                            this.f64686h = i40 - i41;
                            c20811m.m21344F(c20811m.f66093b - i41);
                        }
                        this.f64685g = 5;
                    }
                    b11 = -1;
                    z11 = true;
                    break;
                case 5:
                    if (m21094a(c20811m, c20811m2.f66092a, this.f64693o)) {
                        byte[] bArr3 = c20811m2.f66092a;
                        AtomicInteger atomicInteger = this.f64680b;
                        C6318J c6318jM6893i5 = AbstractC6320b.m6893i(bArr3);
                        ?? r10 = c6318jM6893i5.m6872i(32) == 1078008818 ? z11 : 0;
                        int iM6899o2 = AbstractC6320b.m6899o(c6318jM6893i5, AbstractC6320b.f20485n);
                        int i42 = iM6899o2 + 1;
                        if (r10 == 0) {
                            jM21396J2 = -9223372036854775807L;
                            iM6872i4 = -2147483647;
                        } else {
                            if (!c6318jM6893i5.m6871h()) {
                                throw C19755E.m20713b("Only supports full channel mask-based audio presentation");
                            }
                            int i43 = iM6899o2 - 1;
                            int i44 = ((bArr3[i43] << 8) & 65535) | (bArr3[iM6899o2] & 255);
                            int i45 = AbstractC20817s.f66106a;
                            int i46 = 65535;
                            int i47 = 0;
                            while (i47 < i43) {
                                byte b13 = bArr3[i47];
                                int[] iArr = AbstractC20817s.f66118m;
                                int i48 = (iArr[(((b13 & 255) >> 4) ^ ((i46 >> 12) & 255)) & 255] ^ ((i46 << 4) & 65535)) & 65535;
                                i46 = (((i48 << 4) & 65535) ^ iArr[((b13 & 15) ^ ((i48 >> 12) & 255)) & 255]) & 65535;
                                i47++;
                                z11 = true;
                            }
                            boolean z12 = z11;
                            if (i44 != i46) {
                                throw C19755E.m20712a(null, "CRC check failed");
                            }
                            int iM6872i13 = c6318jM6893i5.m6872i(2);
                            if (iM6872i13 != 0) {
                                if (iM6872i13 == z12) {
                                    i27 = 480;
                                } else {
                                    if (iM6872i13 != 2) {
                                        throw C19755E.m20712a(null, "Unsupported base duration index in DTS UHD header: " + iM6872i13);
                                    }
                                    i27 = 384;
                                }
                                i26 = 3;
                            } else {
                                i26 = 3;
                                i27 = 512;
                            }
                            int iM6872i14 = (c6318jM6893i5.m6872i(i26) + 1) * i27;
                            int iM6872i15 = c6318jM6893i5.m6872i(2);
                            if (iM6872i15 == 0) {
                                i28 = 32000;
                            } else if (iM6872i15 == 1) {
                                i28 = 44100;
                            } else {
                                if (iM6872i15 != 2) {
                                    throw C19755E.m20712a(null, "Unsupported clock rate index in DTS UHD header: " + iM6872i15);
                                }
                                i28 = 48000;
                            }
                            if (c6318jM6893i5.m6871h()) {
                                c6318jM6893i5.m6883t(36);
                            }
                            iM6872i4 = (1 << c6318jM6893i5.m6872i(2)) * i28;
                            jM21396J2 = AbstractC20817s.m21396J(iM6872i14, 1000000L, i28, RoundingMode.FLOOR);
                        }
                        int iM6899o3 = 0;
                        for (int i49 = 0; i49 < r10; i49++) {
                            iM6899o3 += AbstractC6320b.m6899o(c6318jM6893i5, AbstractC6320b.f20486o);
                        }
                        if (r10 != 0) {
                            atomicInteger.set(AbstractC6320b.m6899o(c6318jM6893i5, AbstractC6320b.f20487p));
                        }
                        int iM6899o4 = iM6899o3 + (atomicInteger.get() != 0 ? AbstractC6320b.m6899o(c6318jM6893i5, AbstractC6320b.f20488q) : 0) + i42;
                        C6319a c6319a = new C6319a("audio/vnd.dts.uhd;profile=p2", 2, iM6872i4, iM6899o4, jM21396J2);
                        if (this.f64691m == 3) {
                            m21095g(c6319a);
                        }
                        this.f64690l = iM6899o4;
                        this.f64688j = jM21396J2 == -9223372036854775807L ? 0L : jM21396J2;
                        c20811m2.m21344F(0);
                        this.f64684f.mo4970c(this.f64693o, c20811m2);
                        this.f64685g = 6;
                        b11 = -1;
                        z11 = true;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(c20811m.m21346a(), this.f64690l - this.f64686h);
                    this.f64684f.mo4970c(iMin, c20811m);
                    int i50 = this.f64686h + iMin;
                    this.f64686h = i50;
                    if (i50 == this.f64690l) {
                        AbstractC20800b.m21320h(this.f64694p != -9223372036854775807L ? z11 : false);
                        this.f64684f.mo4968a(this.f64694p, this.f64691m == 4 ? 0 : z11, this.f64690l, 0, null);
                        this.f64694p += this.f64688j;
                        this.f64685g = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: c */
    public final void mo21089c() {
        this.f64685g = 0;
        this.f64686h = 0;
        this.f64687i = 0;
        this.f64694p = -9223372036854775807L;
        this.f64680b.set(0);
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: d */
    public final void mo21090d(InterfaceC6335q interfaceC6335q, C13458b c13458b) {
        c13458b.m14981c();
        c13458b.m14986h();
        this.f64683e = (String) c13458b.f42596e;
        c13458b.m14986h();
        this.f64684f = interfaceC6335q.mo3044D(c13458b.f42594c, 1);
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: f */
    public final void mo21092f(int i10, long j10) {
        this.f64694p = j10;
    }

    /* JADX INFO: renamed from: g */
    public final void m21095g(C6319a c6319a) {
        int i10;
        int i11 = c6319a.f20470b;
        if (i11 == -2147483647 || (i10 = c6319a.f20471c) == -1) {
            return;
        }
        C19788o c19788o = this.f64689k;
        String str = c6319a.f20469a;
        if (c19788o != null && i10 == c19788o.f62729A && i11 == c19788o.f62730B && str.equals(c19788o.f62752m)) {
            return;
        }
        C19788o c19788o2 = this.f64689k;
        C19787n c19787n = c19788o2 == null ? new C19787n() : c19788o2.m20747a();
        c19787n.f62703a = this.f64683e;
        c19787n.f62714l = AbstractC19754D.m20711i(str);
        c19787n.f62728z = i10;
        c19787n.f62694A = i11;
        c19787n.f62706d = this.f64681c;
        c19787n.f62708f = this.f64682d;
        C19788o c19788o3 = new C19788o(c19787n);
        this.f64689k = c19788o3;
        this.f64684f.mo4971d(c19788o3);
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: e */
    public final void mo21091e(boolean z6) {
    }
}
