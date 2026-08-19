package p1055v4;

import p1016t3.AbstractC19754D;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p165G9.C3018d;
import p372P3.AbstractC6320b;
import p372P3.C6318J;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;
import p734ep.C13458b;

/* JADX INFO: renamed from: v4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C20430a implements InterfaceC20435f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64630a;

    /* JADX INFO: renamed from: b */
    public final C6318J f64631b;

    /* JADX INFO: renamed from: c */
    public final C20811m f64632c;

    /* JADX INFO: renamed from: d */
    public final String f64633d;

    /* JADX INFO: renamed from: e */
    public final int f64634e;

    /* JADX INFO: renamed from: f */
    public String f64635f;

    /* JADX INFO: renamed from: g */
    public InterfaceC6316H f64636g;

    /* JADX INFO: renamed from: h */
    public int f64637h;

    /* JADX INFO: renamed from: i */
    public int f64638i;

    /* JADX INFO: renamed from: j */
    public boolean f64639j;

    /* JADX INFO: renamed from: k */
    public long f64640k;

    /* JADX INFO: renamed from: l */
    public C19788o f64641l;

    /* JADX INFO: renamed from: m */
    public int f64642m;

    /* JADX INFO: renamed from: n */
    public long f64643n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C20430a() {
        this(null, 0, 0);
        this.f64630a = 0;
    }

    /* JADX WARN: Code duplicated, block: B:181:0x0338  */
    /* JADX WARN: Code duplicated, block: B:202:0x037b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: b */
    public final void mo21088b(C20811m c20811m) {
        int i10;
        int iM6890f;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        byte b;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        switch (this.f64630a) {
            case 0:
                AbstractC20800b.m21321i(this.f64636g);
                while (c20811m.m21346a() > 0) {
                    int i26 = this.f64637h;
                    C20811m c20811m2 = this.f64632c;
                    if (i26 == 0) {
                        while (c20811m.m21346a() > 0) {
                            if (this.f64639j) {
                                int iM21365t = c20811m.m21365t();
                                if (iM21365t == 119) {
                                    this.f64639j = false;
                                    this.f64637h = 1;
                                    byte[] bArr = c20811m2.f66092a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f64638i = 2;
                                }
                                this.f64639j = iM21365t == 11;
                            } else {
                                this.f64639j = c20811m.m21365t() == 11;
                            }
                            break;
                        }
                    } else if (i26 == 1) {
                        byte[] bArr2 = c20811m2.f66092a;
                        int iMin = Math.min(c20811m.m21346a(), 128 - this.f64638i);
                        c20811m.m21350e(bArr2, this.f64638i, iMin);
                        int i27 = this.f64638i + iMin;
                        this.f64638i = i27;
                        if (i27 == 128) {
                            C6318J c6318j = this.f64631b;
                            c6318j.m6880q(0);
                            int iM6870g = c6318j.m6870g();
                            c6318j.m6883t(40);
                            Object[] objArr = c6318j.m6872i(5) > 10;
                            c6318j.m6880q(iM6870g);
                            int[] iArr = AbstractC6320b.f20477f;
                            int[] iArr2 = AbstractC6320b.f20475d;
                            if (objArr == true) {
                                c6318j.m6883t(16);
                                int iM6872i = c6318j.m6872i(2);
                                if (iM6872i == 0) {
                                    b = 0;
                                } else if (iM6872i != 1) {
                                    b = iM6872i != 2 ? (byte) -1 : (byte) 2;
                                } else {
                                    b = 1;
                                }
                                c6318j.m6883t(3);
                                iM6890f = (c6318j.m6872i(11) + 1) * 2;
                                int iM6872i2 = c6318j.m6872i(2);
                                if (iM6872i2 == 3) {
                                    i14 = AbstractC6320b.f20476e[c6318j.m6872i(2)];
                                    i15 = 3;
                                    i16 = 6;
                                } else {
                                    int iM6872i3 = c6318j.m6872i(2);
                                    int i28 = AbstractC6320b.f20474c[iM6872i3];
                                    i14 = iArr2[iM6872i2];
                                    i15 = iM6872i3;
                                    i16 = i28;
                                }
                                i13 = i16 * 256;
                                int i29 = (iM6890f * i14) / (i16 * 32);
                                int iM6872i4 = c6318j.m6872i(3);
                                boolean zM6871h = c6318j.m6871h();
                                i12 = iArr[iM6872i4] + (zM6871h ? 1 : 0);
                                c6318j.m6883t(10);
                                if (c6318j.m6871h()) {
                                    c6318j.m6883t(8);
                                }
                                if (iM6872i4 == 0) {
                                    c6318j.m6883t(5);
                                    if (c6318j.m6871h()) {
                                        c6318j.m6883t(8);
                                    }
                                }
                                if (b == 1 && c6318j.m6871h()) {
                                    c6318j.m6883t(16);
                                }
                                if (c6318j.m6871h()) {
                                    if (iM6872i4 > 2) {
                                        c6318j.m6883t(2);
                                    }
                                    if ((iM6872i4 & 1) == 0 || iM6872i4 <= 2) {
                                        i21 = 6;
                                    } else {
                                        i21 = 6;
                                        c6318j.m6883t(6);
                                    }
                                    if ((iM6872i4 & 4) != 0) {
                                        c6318j.m6883t(i21);
                                    }
                                    if (zM6871h && c6318j.m6871h()) {
                                        c6318j.m6883t(5);
                                    }
                                    if (b != 0) {
                                        i17 = i15;
                                    } else {
                                        if (c6318j.m6871h()) {
                                            i22 = 6;
                                            c6318j.m6883t(6);
                                        } else {
                                            i22 = 6;
                                        }
                                        if (iM6872i4 == 0 && c6318j.m6871h()) {
                                            c6318j.m6883t(i22);
                                        }
                                        if (c6318j.m6871h()) {
                                            c6318j.m6883t(i22);
                                        }
                                        int iM6872i5 = c6318j.m6872i(2);
                                        if (iM6872i5 == 1) {
                                            c6318j.m6883t(5);
                                            i24 = 2;
                                        } else {
                                            if (iM6872i5 == 2) {
                                                c6318j.m6883t(12);
                                            } else if (iM6872i5 == 3) {
                                                int iM6872i6 = c6318j.m6872i(5);
                                                if (c6318j.m6871h()) {
                                                    c6318j.m6883t(5);
                                                    if (c6318j.m6871h()) {
                                                        i25 = 4;
                                                        c6318j.m6883t(4);
                                                    } else {
                                                        i25 = 4;
                                                    }
                                                    if (c6318j.m6871h()) {
                                                        c6318j.m6883t(i25);
                                                    }
                                                    if (c6318j.m6871h()) {
                                                        c6318j.m6883t(i25);
                                                    }
                                                    if (c6318j.m6871h()) {
                                                        c6318j.m6883t(i25);
                                                    }
                                                    if (c6318j.m6871h()) {
                                                        c6318j.m6883t(i25);
                                                    }
                                                    if (c6318j.m6871h()) {
                                                        c6318j.m6883t(i25);
                                                    }
                                                    if (c6318j.m6871h()) {
                                                        c6318j.m6883t(i25);
                                                    }
                                                    if (c6318j.m6871h()) {
                                                        if (c6318j.m6871h()) {
                                                            c6318j.m6883t(i25);
                                                        }
                                                        if (c6318j.m6871h()) {
                                                            c6318j.m6883t(i25);
                                                        }
                                                    }
                                                }
                                                if (c6318j.m6871h()) {
                                                    c6318j.m6883t(5);
                                                    if (c6318j.m6871h()) {
                                                        c6318j.m6883t(7);
                                                        if (c6318j.m6871h()) {
                                                            i23 = 8;
                                                            c6318j.m6883t(8);
                                                        } else {
                                                            i23 = 8;
                                                        }
                                                    } else {
                                                        i23 = 8;
                                                    }
                                                } else {
                                                    i23 = 8;
                                                }
                                                i24 = 2;
                                                c6318j.m6883t((iM6872i6 + 2) * i23);
                                                c6318j.m6866c();
                                            }
                                            i24 = 2;
                                        }
                                        if (iM6872i4 < i24) {
                                            if (c6318j.m6871h()) {
                                                c6318j.m6883t(14);
                                            }
                                            if (iM6872i4 == 0 && c6318j.m6871h()) {
                                                c6318j.m6883t(14);
                                            }
                                        }
                                        if (c6318j.m6871h()) {
                                            i17 = i15;
                                            if (i17 == 0) {
                                                c6318j.m6883t(5);
                                            } else {
                                                int i30 = 5;
                                                int i31 = 0;
                                                while (i31 < i16) {
                                                    if (c6318j.m6871h()) {
                                                        c6318j.m6883t(i30);
                                                    }
                                                    i31++;
                                                    i30 = 5;
                                                }
                                            }
                                        } else {
                                            i17 = i15;
                                        }
                                    }
                                } else {
                                    i17 = i15;
                                }
                                if (c6318j.m6871h()) {
                                    c6318j.m6883t(5);
                                    if (iM6872i4 == 2) {
                                        c6318j.m6883t(4);
                                    }
                                    if (iM6872i4 >= 6) {
                                        c6318j.m6883t(2);
                                    }
                                    if (c6318j.m6871h()) {
                                        i20 = 8;
                                        c6318j.m6883t(8);
                                    } else {
                                        i20 = 8;
                                    }
                                    if (iM6872i4 == 0 && c6318j.m6871h()) {
                                        c6318j.m6883t(i20);
                                    }
                                    i18 = 3;
                                    if (iM6872i2 < 3) {
                                        c6318j.m6882s();
                                    }
                                } else {
                                    i18 = 3;
                                }
                                if (b == 0 && i17 != i18) {
                                    c6318j.m6882s();
                                }
                                if (b == 2 && (i17 == i18 || c6318j.m6871h())) {
                                    i19 = 6;
                                    c6318j.m6883t(6);
                                } else {
                                    i19 = 6;
                                }
                                str = (c6318j.m6871h() && c6318j.m6872i(i19) == 1 && c6318j.m6872i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i10 = i29;
                            } else {
                                c6318j.m6883t(32);
                                int iM6872i7 = c6318j.m6872i(2);
                                String str2 = iM6872i7 == 3 ? null : "audio/ac3";
                                int iM6872i8 = c6318j.m6872i(6);
                                i10 = AbstractC6320b.f20478g[iM6872i8 / 2] * 1000;
                                iM6890f = AbstractC6320b.m6890f(iM6872i7, iM6872i8);
                                c6318j.m6883t(8);
                                int iM6872i9 = c6318j.m6872i(3);
                                if ((iM6872i9 & 1) == 0 || iM6872i9 == 1) {
                                    i11 = 2;
                                } else {
                                    i11 = 2;
                                    c6318j.m6883t(2);
                                }
                                if ((iM6872i9 & 4) != 0) {
                                    c6318j.m6883t(i11);
                                }
                                if (iM6872i9 == i11) {
                                    c6318j.m6883t(i11);
                                }
                                int i32 = iM6872i7 < 3 ? iArr2[iM6872i7] : -1;
                                i12 = iArr[iM6872i9] + (c6318j.m6871h() ? 1 : 0);
                                i13 = 1536;
                                str = str2;
                                i14 = i32;
                            }
                            C19788o c19788o = this.f64641l;
                            if (c19788o == null || i12 != c19788o.f62729A || i14 != c19788o.f62730B || !AbstractC20817s.m21400a(str, c19788o.f62752m)) {
                                C19787n c19787n = new C19787n();
                                c19787n.f62703a = this.f64635f;
                                c19787n.f62714l = AbstractC19754D.m20711i(str);
                                c19787n.f62728z = i12;
                                c19787n.f62694A = i14;
                                c19787n.f62706d = this.f64633d;
                                c19787n.f62708f = this.f64634e;
                                c19787n.f62710h = i10;
                                if ("audio/ac3".equals(str)) {
                                    c19787n.f62709g = i10;
                                }
                                C19788o c19788o2 = new C19788o(c19787n);
                                this.f64641l = c19788o2;
                                this.f64636g.mo4971d(c19788o2);
                            }
                            this.f64642m = iM6890f;
                            this.f64640k = (((long) i13) * 1000000) / ((long) this.f64641l.f62730B);
                            c20811m2.m21344F(0);
                            this.f64636g.mo4970c(128, c20811m2);
                            this.f64637h = 2;
                        }
                    } else if (i26 == 2) {
                        int iMin2 = Math.min(c20811m.m21346a(), this.f64642m - this.f64638i);
                        this.f64636g.mo4970c(iMin2, c20811m);
                        int i33 = this.f64638i + iMin2;
                        this.f64638i = i33;
                        if (i33 == this.f64642m) {
                            AbstractC20800b.m21320h(this.f64643n != -9223372036854775807L);
                            this.f64636g.mo4968a(this.f64643n, 1, this.f64642m, 0, null);
                            this.f64643n += this.f64640k;
                            this.f64637h = 0;
                        }
                    }
                }
                break;
            default:
                AbstractC20800b.m21321i(this.f64636g);
                while (c20811m.m21346a() > 0) {
                    int i34 = this.f64637h;
                    C20811m c20811m3 = this.f64632c;
                    if (i34 == 0) {
                        while (c20811m.m21346a() > 0) {
                            if (this.f64639j) {
                                int iM21365t2 = c20811m.m21365t();
                                this.f64639j = iM21365t2 == 172;
                                if (iM21365t2 == 64 || iM21365t2 == 65) {
                                    Object[] objArr2 = iM21365t2 == 65;
                                    this.f64637h = 1;
                                    byte[] bArr3 = c20811m3.f66092a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr2 == true ? 65 : 64);
                                    this.f64638i = 2;
                                }
                            } else {
                                this.f64639j = c20811m.m21365t() == 172;
                            }
                            break;
                        }
                    } else if (i34 == 1) {
                        byte[] bArr4 = c20811m3.f66092a;
                        int iMin3 = Math.min(c20811m.m21346a(), 16 - this.f64638i);
                        c20811m.m21350e(bArr4, this.f64638i, iMin3);
                        int i35 = this.f64638i + iMin3;
                        this.f64638i = i35;
                        if (i35 == 16) {
                            C6318J c6318j2 = this.f64631b;
                            c6318j2.m6880q(0);
                            C3018d c3018dM6897m = AbstractC6320b.m6897m(c6318j2);
                            C19788o c19788o3 = this.f64641l;
                            int i36 = c3018dM6897m.f9092a;
                            if (c19788o3 == null || 2 != c19788o3.f62729A || i36 != c19788o3.f62730B || !"audio/ac4".equals(c19788o3.f62752m)) {
                                C19787n c19787n2 = new C19787n();
                                c19787n2.f62703a = this.f64635f;
                                c19787n2.f62714l = AbstractC19754D.m20711i("audio/ac4");
                                c19787n2.f62728z = 2;
                                c19787n2.f62694A = i36;
                                c19787n2.f62706d = this.f64633d;
                                c19787n2.f62708f = this.f64634e;
                                C19788o c19788o4 = new C19788o(c19787n2);
                                this.f64641l = c19788o4;
                                this.f64636g.mo4971d(c19788o4);
                            }
                            this.f64642m = c3018dM6897m.f9093b;
                            this.f64640k = (((long) c3018dM6897m.f9094c) * 1000000) / ((long) this.f64641l.f62730B);
                            c20811m3.m21344F(0);
                            this.f64636g.mo4970c(16, c20811m3);
                            this.f64637h = 2;
                        }
                    } else if (i34 == 2) {
                        int iMin4 = Math.min(c20811m.m21346a(), this.f64642m - this.f64638i);
                        this.f64636g.mo4970c(iMin4, c20811m);
                        int i37 = this.f64638i + iMin4;
                        this.f64638i = i37;
                        if (i37 == this.f64642m) {
                            AbstractC20800b.m21320h(this.f64643n != -9223372036854775807L);
                            this.f64636g.mo4968a(this.f64643n, 1, this.f64642m, 0, null);
                            this.f64643n += this.f64640k;
                            this.f64637h = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: c */
    public final void mo21089c() {
        switch (this.f64630a) {
            case 0:
                this.f64637h = 0;
                this.f64638i = 0;
                this.f64639j = false;
                this.f64643n = -9223372036854775807L;
                break;
            default:
                this.f64637h = 0;
                this.f64638i = 0;
                this.f64639j = false;
                this.f64643n = -9223372036854775807L;
                break;
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: d */
    public final void mo21090d(InterfaceC6335q interfaceC6335q, C13458b c13458b) {
        switch (this.f64630a) {
            case 0:
                c13458b.m14981c();
                c13458b.m14986h();
                this.f64635f = (String) c13458b.f42596e;
                c13458b.m14986h();
                this.f64636g = interfaceC6335q.mo3044D(c13458b.f42594c, 1);
                break;
            default:
                c13458b.m14981c();
                c13458b.m14986h();
                this.f64635f = (String) c13458b.f42596e;
                c13458b.m14986h();
                this.f64636g = interfaceC6335q.mo3044D(c13458b.f42594c, 1);
                break;
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: e */
    public final void mo21091e(boolean z6) {
        int i10 = this.f64630a;
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: f */
    public final void mo21092f(int i10, long j10) {
        switch (this.f64630a) {
            case 0:
                this.f64643n = j10;
                break;
            default:
                this.f64643n = j10;
                break;
        }
    }

    public C20430a(String str, int i10, int i11) {
        this.f64630a = i11;
        switch (i11) {
            case 1:
                C6318J c6318j = new C6318J(16, new byte[16]);
                this.f64631b = c6318j;
                this.f64632c = new C20811m(c6318j.f20467d);
                this.f64637h = 0;
                this.f64638i = 0;
                this.f64639j = false;
                this.f64643n = -9223372036854775807L;
                this.f64633d = str;
                this.f64634e = i10;
                break;
            default:
                C6318J c6318j2 = new C6318J(128, new byte[128]);
                this.f64631b = c6318j2;
                this.f64632c = new C20811m(c6318j2.f20467d);
                this.f64637h = 0;
                this.f64643n = -9223372036854775807L;
                this.f64633d = str;
                this.f64634e = i10;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m21086a(boolean z6) {
    }

    /* JADX INFO: renamed from: g */
    private final void m21087g(boolean z6) {
    }
}
