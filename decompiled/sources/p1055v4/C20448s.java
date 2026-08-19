package p1055v4;

import bb.AbstractC11278C;
import bb.C11294T;
import p1016t3.AbstractC19754D;
import p1016t3.C19755E;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p372P3.C6318J;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;
import p523V9.AbstractC7957O4;
import p523V9.AbstractC8018W4;
import p734ep.C13458b;

/* JADX INFO: renamed from: v4.s */
/* JADX INFO: loaded from: classes.dex */
public final class C20448s implements InterfaceC20435f {

    /* JADX INFO: renamed from: e */
    public String f64866e;

    /* JADX INFO: renamed from: f */
    public InterfaceC6316H f64867f;

    /* JADX INFO: renamed from: i */
    public boolean f64870i;

    /* JADX INFO: renamed from: k */
    public int f64872k;

    /* JADX INFO: renamed from: l */
    public int f64873l;

    /* JADX INFO: renamed from: n */
    public int f64875n;

    /* JADX INFO: renamed from: o */
    public int f64876o;

    /* JADX INFO: renamed from: s */
    public int f64880s;

    /* JADX INFO: renamed from: u */
    public boolean f64882u;

    /* JADX INFO: renamed from: d */
    public int f64865d = 0;

    /* JADX INFO: renamed from: a */
    public final C20811m f64862a = new C20811m(2, new byte[15]);

    /* JADX INFO: renamed from: b */
    public final C6318J f64863b = new C6318J();

    /* JADX INFO: renamed from: c */
    public final C20811m f64864c = new C20811m();

    /* JADX INFO: renamed from: p */
    public final C20449t f64877p = new C20449t();

    /* JADX INFO: renamed from: q */
    public int f64878q = -2147483647;

    /* JADX INFO: renamed from: r */
    public int f64879r = -1;

    /* JADX INFO: renamed from: t */
    public long f64881t = -1;

    /* JADX INFO: renamed from: j */
    public boolean f64871j = true;

    /* JADX INFO: renamed from: m */
    public boolean f64874m = true;

    /* JADX INFO: renamed from: g */
    public double f64868g = -9.223372036854776E18d;

    /* JADX INFO: renamed from: h */
    public double f64869h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:156:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:160:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:163:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:192:0x03ac  */
    /* JADX WARN: Instruction removed from duplicated block: B:156:0x02b0, please report this as an issue */
    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: b */
    public final void mo21088b(C20811m c20811m) throws C19755E {
        int i10;
        int iM6872i;
        int i11;
        int iM6872i2;
        int i12;
        int i13;
        byte[] bArr;
        long j10;
        long j11;
        C11294T c11294tM12696z;
        int i14;
        int iM6872i3;
        int i15;
        long j12;
        boolean z6;
        int i16;
        int i17 = 4;
        int i18 = 8;
        int i19 = 1;
        AbstractC20800b.m21321i(this.f64867f);
        while (c20811m.m21346a() > 0) {
            int i20 = this.f64865d;
            if (i20 != 0) {
                C20449t c20449t = this.f64877p;
                C20811m c20811m2 = this.f64864c;
                if (i20 == i19) {
                    int iM21346a = c20811m.m21346a();
                    C20811m c20811m3 = this.f64862a;
                    int iMin = Math.min(iM21346a, c20811m3.m21346a());
                    c20811m.m21350e(c20811m3.f66092a, c20811m3.f66093b, iMin);
                    c20811m3.m21345G(iMin);
                    if (c20811m3.m21346a() == 0) {
                        int i21 = c20811m3.f66094c;
                        byte[] bArr2 = c20811m3.f66092a;
                        C6318J c6318j = this.f64863b;
                        c6318j.m6878o(i21, bArr2);
                        c6318j.m6869f();
                        int iM8348h = AbstractC8018W4.m8348h(c6318j, 3, 8, 8);
                        c20449t.f64883a = iM8348h;
                        if (iM8348h != -1) {
                            AbstractC20800b.m21316d(Math.max(Math.max(2, 8), 32) <= 63);
                            AbstractC7957O4.m8244d(AbstractC7957O4.m8244d(3L, 255L), 4294967296L);
                            if (c6318j.m6865b() < 2) {
                                j12 = -1;
                            } else {
                                long jM6874k = c6318j.m6874k(2);
                                if (jM6874k == 3) {
                                    if (c6318j.m6865b() >= 8) {
                                        long jM6874k2 = c6318j.m6874k(8);
                                        jM6874k += jM6874k2;
                                        if (jM6874k2 == 255) {
                                            if (c6318j.m6865b() >= 32) {
                                                jM6874k = c6318j.m6874k(32) + jM6874k;
                                            }
                                        }
                                    }
                                    j12 = -1;
                                }
                                j12 = jM6874k;
                            }
                            c20449t.f64884b = j12;
                            if (j12 == -1) {
                                z6 = false;
                            } else {
                                if (j12 > 16) {
                                    throw C19755E.m20713b("Contains sub-stream with an invalid packet label " + c20449t.f64884b);
                                }
                                if (j12 == 0) {
                                    int i22 = c20449t.f64883a;
                                    if (i22 == 1) {
                                        throw C19755E.m20712a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i22 == 2) {
                                        throw C19755E.m20712a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i22 == 17) {
                                        throw C19755E.m20712a(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iM8348h2 = AbstractC8018W4.m8348h(c6318j, 11, 24, 24);
                                c20449t.f64885c = iM8348h2;
                                if (iM8348h2 != -1) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            }
                        } else {
                            z6 = false;
                        }
                        if (z6) {
                            this.f64875n = 0;
                            this.f64876o = c20449t.f64885c + i21 + this.f64876o;
                        }
                        if (z6) {
                            c20811m3.m21344F(0);
                            this.f64867f.mo4970c(c20811m3.f66094c, c20811m3);
                            c20811m3.m21341C(2);
                            c20811m2.m21341C(c20449t.f64885c);
                            i11 = 1;
                            this.f64874m = true;
                            this.f64865d = 2;
                        } else {
                            int i23 = c20811m3.f66094c;
                            if (i23 < 15) {
                                c20811m3.m21343E(i23 + 1);
                                this.f64874m = false;
                            }
                        }
                    } else {
                        this.f64874m = false;
                    }
                    i17 = 4;
                    i18 = 8;
                    i19 = 1;
                } else {
                    if (i20 != 2) {
                        throw new IllegalStateException();
                    }
                    int i24 = c20449t.f64883a;
                    if (i24 == i19 || i24 == 17) {
                        int i25 = c20811m.f66093b;
                        int iMin2 = Math.min(c20811m.m21346a(), c20811m2.m21346a());
                        c20811m.m21350e(c20811m2.f66092a, c20811m2.f66093b, iMin2);
                        c20811m2.m21345G(iMin2);
                        c20811m.m21344F(i25);
                    }
                    int iMin3 = Math.min(c20811m.m21346a(), c20449t.f64885c - this.f64875n);
                    this.f64867f.mo4970c(iMin3, c20811m);
                    int i26 = this.f64875n + iMin3;
                    this.f64875n = i26;
                    if (i26 != c20449t.f64885c) {
                        continue;
                    } else {
                        int i27 = c20449t.f64883a;
                        if (i27 == i19) {
                            byte[] bArr3 = c20811m2.f66092a;
                            C6318J c6318j2 = new C6318J(bArr3.length, bArr3);
                            int iM6872i4 = c6318j2.m6872i(i18);
                            int iM6872i5 = c6318j2.m6872i(5);
                            if (iM6872i5 != 31) {
                                switch (iM6872i5) {
                                    case 0:
                                        iM6872i2 = 96000;
                                        break;
                                    case 1:
                                        iM6872i2 = 88200;
                                        break;
                                    case 2:
                                        iM6872i2 = 64000;
                                        break;
                                    case 3:
                                        iM6872i2 = 48000;
                                        break;
                                    case 4:
                                        iM6872i2 = 44100;
                                        break;
                                    case 5:
                                        iM6872i2 = 32000;
                                        break;
                                    case 6:
                                        iM6872i2 = 24000;
                                        break;
                                    case 7:
                                        iM6872i2 = 22050;
                                        break;
                                    case 8:
                                        iM6872i2 = 16000;
                                        break;
                                    case 9:
                                        iM6872i2 = 12000;
                                        break;
                                    case 10:
                                        iM6872i2 = 11025;
                                        break;
                                    case 11:
                                        iM6872i2 = 8000;
                                        break;
                                    case 12:
                                        iM6872i2 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw C19755E.m20713b("Unsupported sampling rate index " + iM6872i5);
                                    case 15:
                                        iM6872i2 = 57600;
                                        break;
                                    case 16:
                                        iM6872i2 = 51200;
                                        break;
                                    case 17:
                                        iM6872i2 = 40000;
                                        break;
                                    case 18:
                                        iM6872i2 = 38400;
                                        break;
                                    case 19:
                                        iM6872i2 = 34150;
                                        break;
                                    case 20:
                                        iM6872i2 = 28800;
                                        break;
                                    case 21:
                                        iM6872i2 = 25600;
                                        break;
                                    case 22:
                                        iM6872i2 = 20000;
                                        break;
                                    case 23:
                                        iM6872i2 = 19200;
                                        break;
                                    case 24:
                                        iM6872i2 = 17075;
                                        break;
                                    case 25:
                                        iM6872i2 = 14400;
                                        break;
                                    case 26:
                                        iM6872i2 = 12800;
                                        break;
                                    case 27:
                                        iM6872i2 = 9600;
                                        break;
                                }
                            } else {
                                iM6872i2 = c6318j2.m6872i(24);
                            }
                            int iM6872i6 = c6318j2.m6872i(3);
                            if (iM6872i6 == 0) {
                                i12 = 768;
                            } else if (iM6872i6 == i19) {
                                i12 = 1024;
                            } else if (iM6872i6 == 2 || iM6872i6 == 3) {
                                i12 = 2048;
                            } else {
                                if (iM6872i6 != i17) {
                                    throw C19755E.m20713b("Unsupported coreSbrFrameLengthIndex " + iM6872i6);
                                }
                                i12 = 4096;
                            }
                            int i28 = i12;
                            if (iM6872i6 == 0 || iM6872i6 == i19) {
                                i13 = 0;
                            } else if (iM6872i6 == 2) {
                                i13 = 2;
                            } else if (iM6872i6 == 3) {
                                i13 = 3;
                            } else {
                                if (iM6872i6 != i17) {
                                    throw C19755E.m20713b("Unsupported coreSbrFrameLengthIndex " + iM6872i6);
                                }
                                i13 = i19;
                            }
                            c6318j2.m6883t(2);
                            AbstractC8018W4.m8350j(c6318j2);
                            int iM6872i7 = c6318j2.m6872i(5);
                            int i29 = 0;
                            int iM8348h3 = 0;
                            while (true) {
                                int i30 = 16;
                                if (i29 < iM6872i7 + 1) {
                                    int iM6872i8 = c6318j2.m6872i(3);
                                    iM8348h3 = AbstractC8018W4.m8348h(c6318j2, 5, i18, 16) + i19 + iM8348h3;
                                    if ((iM6872i8 == 0 || iM6872i8 == 2) && c6318j2.m6871h()) {
                                        AbstractC8018W4.m8350j(c6318j2);
                                    }
                                    i29 += i19;
                                } else {
                                    int iM8348h4 = AbstractC8018W4.m8348h(c6318j2, 4, i18, 16) + i19;
                                    c6318j2.m6882s();
                                    int i31 = 0;
                                    while (true) {
                                        double d10 = 2.0d;
                                        if (i31 < iM8348h4) {
                                            int iM6872i9 = c6318j2.m6872i(2);
                                            if (iM6872i9 != 0) {
                                                if (iM6872i9 != i19) {
                                                    if (iM6872i9 == 3) {
                                                        AbstractC8018W4.m8348h(c6318j2, 4, i18, i30);
                                                        int iM8348h5 = AbstractC8018W4.m8348h(c6318j2, 4, i18, i30);
                                                        if (c6318j2.m6871h()) {
                                                            AbstractC8018W4.m8348h(c6318j2, i18, i30, 0);
                                                        }
                                                        c6318j2.m6882s();
                                                        if (iM8348h5 > 0) {
                                                            c6318j2.m6883t(iM8348h5 * 8);
                                                        }
                                                    }
                                                    i14 = i19;
                                                } else {
                                                    c6318j2.m6883t(3);
                                                    boolean zM6871h = c6318j2.m6871h();
                                                    if (zM6871h) {
                                                        c6318j2.m6883t(13);
                                                    }
                                                    if (zM6871h) {
                                                        c6318j2.m6882s();
                                                    }
                                                    if (i13 > 0) {
                                                        AbstractC8018W4.m8349i(c6318j2);
                                                        iM6872i3 = c6318j2.m6872i(2);
                                                    } else {
                                                        iM6872i3 = 0;
                                                    }
                                                    if (iM6872i3 > 0) {
                                                        c6318j2.m6883t(6);
                                                        int iM6872i10 = c6318j2.m6872i(2);
                                                        c6318j2.m6883t(4);
                                                        if (c6318j2.m6871h()) {
                                                            c6318j2.m6883t(5);
                                                        }
                                                        if (iM6872i3 == 2 || iM6872i3 == 3) {
                                                            c6318j2.m6883t(6);
                                                        }
                                                        if (iM6872i10 == 2) {
                                                            c6318j2.m6882s();
                                                        }
                                                        i15 = 1;
                                                    } else {
                                                        i15 = i19;
                                                    }
                                                    int iFloor = ((int) Math.floor(Math.log(iM8348h3 - 1) / Math.log(2.0d))) + i15;
                                                    int iM6872i11 = c6318j2.m6872i(2);
                                                    if (iM6872i11 > 0 && c6318j2.m6871h()) {
                                                        c6318j2.m6883t(iFloor);
                                                    }
                                                    if (c6318j2.m6871h()) {
                                                        c6318j2.m6883t(iFloor);
                                                    }
                                                    if (i13 == 0 && iM6872i11 == 0) {
                                                        c6318j2.m6882s();
                                                    }
                                                }
                                                i31 += i14;
                                                i19 = i14;
                                                i30 = 16;
                                                i18 = 8;
                                            } else {
                                                c6318j2.m6883t(3);
                                                if (c6318j2.m6871h()) {
                                                    c6318j2.m6883t(13);
                                                }
                                                if (i13 > 0) {
                                                    AbstractC8018W4.m8349i(c6318j2);
                                                }
                                            }
                                            i14 = 1;
                                            i31 += i14;
                                            i19 = i14;
                                            i30 = 16;
                                            i18 = 8;
                                        } else {
                                            int i32 = i19;
                                            if (c6318j2.m6871h()) {
                                                int i33 = 8;
                                                int i34 = 4;
                                                int iM8348h6 = AbstractC8018W4.m8348h(c6318j2, 2, 4, 8) + i32;
                                                int i35 = 0;
                                                bArr = null;
                                                while (i35 < iM8348h6) {
                                                    int iM8348h7 = AbstractC8018W4.m8348h(c6318j2, i34, i33, 16);
                                                    int iM8348h8 = AbstractC8018W4.m8348h(c6318j2, i34, i33, 16);
                                                    if (iM8348h7 == 7) {
                                                        int iM6872i12 = c6318j2.m6872i(i34) + i32;
                                                        c6318j2.m6883t(i34);
                                                        byte[] bArr4 = new byte[iM6872i12];
                                                        for (int i36 = 0; i36 < iM6872i12; i36 += i32) {
                                                            bArr4[i36] = (byte) c6318j2.m6872i(i33);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        c6318j2.m6883t(iM8348h8 * i33);
                                                    }
                                                    i35 += i32;
                                                    i33 = 8;
                                                    i34 = 4;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iM6872i2) {
                                                case 14700:
                                                case 16000:
                                                    d10 = 3.0d;
                                                    this.f64878q = (int) (((double) iM6872i2) * d10);
                                                    this.f64879r = (int) (((double) i28) * d10);
                                                    j10 = this.f64881t;
                                                    j11 = c20449t.f64884b;
                                                    if (j10 != j11) {
                                                        this.f64881t = j11;
                                                        String strConcat = iM6872i4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iM6872i4))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            c11294tM12696z = null;
                                                        } else {
                                                            c11294tM12696z = AbstractC11278C.m12696z(AbstractC20817s.f66111f, bArr);
                                                        }
                                                        C19787n c19787n = new C19787n();
                                                        c19787n.f62703a = this.f64866e;
                                                        c19787n.f62714l = AbstractC19754D.m20711i("audio/mhm1");
                                                        c19787n.f62694A = this.f64878q;
                                                        c19787n.f62711i = strConcat;
                                                        c19787n.f62717o = c11294tM12696z;
                                                        this.f64867f.mo4971d(new C19788o(c19787n));
                                                    }
                                                    this.f64882u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.f64878q = (int) (((double) iM6872i2) * d10);
                                                    this.f64879r = (int) (((double) i28) * d10);
                                                    j10 = this.f64881t;
                                                    j11 = c20449t.f64884b;
                                                    if (j10 != j11) {
                                                        this.f64881t = j11;
                                                        if (iM6872i4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            c11294tM12696z = null;
                                                        } else {
                                                            c11294tM12696z = null;
                                                        }
                                                        C19787n c19787n2 = new C19787n();
                                                        c19787n2.f62703a = this.f64866e;
                                                        c19787n2.f62714l = AbstractC19754D.m20711i("audio/mhm1");
                                                        c19787n2.f62694A = this.f64878q;
                                                        c19787n2.f62711i = strConcat;
                                                        c19787n2.f62717o = c11294tM12696z;
                                                        this.f64867f.mo4971d(new C19788o(c19787n2));
                                                    }
                                                    this.f64882u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d10 = 1.5d;
                                                    this.f64878q = (int) (((double) iM6872i2) * d10);
                                                    this.f64879r = (int) (((double) i28) * d10);
                                                    j10 = this.f64881t;
                                                    j11 = c20449t.f64884b;
                                                    if (j10 != j11) {
                                                        this.f64881t = j11;
                                                        if (iM6872i4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            c11294tM12696z = null;
                                                        } else {
                                                            c11294tM12696z = null;
                                                        }
                                                        C19787n c19787n3 = new C19787n();
                                                        c19787n3.f62703a = this.f64866e;
                                                        c19787n3.f62714l = AbstractC19754D.m20711i("audio/mhm1");
                                                        c19787n3.f62694A = this.f64878q;
                                                        c19787n3.f62711i = strConcat;
                                                        c19787n3.f62717o = c11294tM12696z;
                                                        this.f64867f.mo4971d(new C19788o(c19787n3));
                                                    }
                                                    this.f64882u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d10 = 1.0d;
                                                    this.f64878q = (int) (((double) iM6872i2) * d10);
                                                    this.f64879r = (int) (((double) i28) * d10);
                                                    j10 = this.f64881t;
                                                    j11 = c20449t.f64884b;
                                                    if (j10 != j11) {
                                                        this.f64881t = j11;
                                                        if (iM6872i4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            c11294tM12696z = null;
                                                        } else {
                                                            c11294tM12696z = null;
                                                        }
                                                        C19787n c19787n4 = new C19787n();
                                                        c19787n4.f62703a = this.f64866e;
                                                        c19787n4.f62714l = AbstractC19754D.m20711i("audio/mhm1");
                                                        c19787n4.f62694A = this.f64878q;
                                                        c19787n4.f62711i = strConcat;
                                                        c19787n4.f62717o = c11294tM12696z;
                                                        this.f64867f.mo4971d(new C19788o(c19787n4));
                                                    }
                                                    this.f64882u = true;
                                                    break;
                                                default:
                                                    throw C19755E.m20713b("Unsupported sampling rate " + iM6872i2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (i27 == 17) {
                            byte[] bArr5 = c20811m2.f66092a;
                            C6318J c6318j3 = new C6318J(bArr5.length, bArr5);
                            if (c6318j3.m6871h()) {
                                c6318j3.m6883t(2);
                                iM6872i = c6318j3.m6872i(13);
                            } else {
                                iM6872i = 0;
                            }
                            this.f64880s = iM6872i;
                        } else if (i27 == 2) {
                            if (this.f64882u) {
                                this.f64871j = false;
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            double d11 = (((double) (this.f64879r - this.f64880s)) * 1000000.0d) / ((double) this.f64878q);
                            long jRound = Math.round(this.f64868g);
                            if (this.f64870i) {
                                this.f64870i = false;
                                this.f64868g = this.f64869h;
                            } else {
                                this.f64868g += d11;
                            }
                            this.f64867f.mo4968a(jRound, i10, this.f64876o, 0, null);
                            this.f64882u = false;
                            this.f64880s = 0;
                            this.f64876o = 0;
                        }
                        i11 = 1;
                        this.f64865d = 1;
                    }
                }
                i19 = i11;
                i17 = 4;
                i18 = 8;
            } else {
                int i37 = this.f64872k;
                if ((i37 & 2) == 0) {
                    c20811m.m21344F(c20811m.f66094c);
                    i16 = 4;
                } else {
                    i16 = 4;
                    if ((i37 & 4) == 0) {
                        while (true) {
                            if (c20811m.m21346a() > 0) {
                                i18 = 8;
                                int i38 = this.f64873l << 8;
                                this.f64873l = i38;
                                int iM21365t = i38 | c20811m.m21365t();
                                this.f64873l = iM21365t;
                                if ((iM21365t & 16777215) == 12583333) {
                                    c20811m.m21344F(c20811m.f66093b - 3);
                                    this.f64873l = 0;
                                }
                            }
                        }
                    } else {
                        i18 = 8;
                    }
                    i19 = 1;
                    this.f64865d = 1;
                    i17 = 4;
                }
                i18 = 8;
                i17 = i16;
                i19 = 1;
            }
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: c */
    public final void mo21089c() {
        this.f64865d = 0;
        this.f64873l = 0;
        this.f64862a.m21341C(2);
        this.f64875n = 0;
        this.f64876o = 0;
        this.f64878q = -2147483647;
        this.f64879r = -1;
        this.f64880s = 0;
        this.f64881t = -1L;
        this.f64882u = false;
        this.f64870i = false;
        this.f64874m = true;
        this.f64871j = true;
        this.f64868g = -9.223372036854776E18d;
        this.f64869h = -9.223372036854776E18d;
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: d */
    public final void mo21090d(InterfaceC6335q interfaceC6335q, C13458b c13458b) {
        c13458b.m14981c();
        c13458b.m14986h();
        this.f64866e = (String) c13458b.f42596e;
        c13458b.m14986h();
        this.f64867f = interfaceC6335q.mo3044D(c13458b.f42594c, 1);
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: f */
    public final void mo21092f(int i10, long j10) {
        this.f64872k = i10;
        if (!this.f64871j && (this.f64876o != 0 || !this.f64874m)) {
            this.f64870i = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f64870i) {
                this.f64869h = j10;
            } else {
                this.f64868g = j10;
            }
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: e */
    public final void mo21091e(boolean z6) {
    }
}
