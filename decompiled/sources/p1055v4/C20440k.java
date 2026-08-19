package p1055v4;

import java.util.Arrays;
import java.util.Collections;
import p057C3.C1529G;
import p1016t3.AbstractC19754D;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1036u9.C20168n;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p1097x3.AbstractC21121g;
import p372P3.C6318J;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;
import p734ep.C13458b;

/* JADX INFO: renamed from: v4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C20440k implements InterfaceC20435f {

    /* JADX INFO: renamed from: l */
    public static final float[] f64738l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final C20168n f64739a;

    /* JADX INFO: renamed from: b */
    public final C20811m f64740b;

    /* JADX INFO: renamed from: c */
    public final boolean[] f64741c = new boolean[4];

    /* JADX INFO: renamed from: d */
    public final C20438i f64742d;

    /* JADX INFO: renamed from: e */
    public final C1529G f64743e;

    /* JADX INFO: renamed from: f */
    public C20439j f64744f;

    /* JADX INFO: renamed from: g */
    public long f64745g;

    /* JADX INFO: renamed from: h */
    public String f64746h;

    /* JADX INFO: renamed from: i */
    public InterfaceC6316H f64747i;

    /* JADX INFO: renamed from: j */
    public boolean f64748j;

    /* JADX INFO: renamed from: k */
    public long f64749k;

    public C20440k(C20168n c20168n) {
        this.f64739a = c20168n;
        C20438i c20438i = new C20438i();
        c20438i.f64729e = new byte[128];
        this.f64742d = c20438i;
        this.f64749k = -9223372036854775807L;
        this.f64743e = new C1529G(178);
        this.f64740b = new C20811m();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0258  */
    /* JADX WARN: Code duplicated, block: B:106:0x025d  */
    /* JADX WARN: Code duplicated, block: B:107:0x025f  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0203  */
    /* JADX WARN: Code duplicated, block: B:93:0x0223  */
    /* JADX WARN: Code duplicated, block: B:95:0x022f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0233  */
    /* JADX WARN: Code duplicated, block: B:99:0x0251  */
    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: b */
    public final void mo21088b(C20811m c20811m) {
        int i10;
        int i11;
        boolean z6;
        boolean z10;
        boolean z11;
        int i12;
        float f10;
        C20811m c20811m2 = c20811m;
        boolean z12 = true;
        AbstractC20800b.m21321i(this.f64744f);
        AbstractC20800b.m21321i(this.f64747i);
        int i13 = c20811m2.f66093b;
        int i14 = c20811m2.f66094c;
        byte[] bArr = c20811m2.f66092a;
        this.f64745g += (long) c20811m.m21346a();
        this.f64747i.mo4970c(c20811m.m21346a(), c20811m2);
        while (true) {
            int iM21585b = AbstractC21121g.m21585b(bArr, i13, i14, this.f64741c);
            C20438i c20438i = this.f64742d;
            C1529G c1529g = this.f64743e;
            if (iM21585b == i14) {
                if (!this.f64748j) {
                    c20438i.m21097a(bArr, i13, i14);
                }
                this.f64744f.m21098a(bArr, i13, i14);
                if (c1529g != null) {
                    c1529g.m2258a(bArr, i13, i14);
                    return;
                }
                return;
            }
            int i15 = iM21585b + 3;
            byte b = c20811m2.f66092a[i15];
            int i16 = b & 255;
            int i17 = iM21585b - i13;
            if (this.f64748j) {
                i10 = i14;
                i11 = i15;
            } else {
                if (i17 > 0) {
                    c20438i.m21097a(bArr, i13, iM21585b);
                }
                int i18 = i17 < 0 ? -i17 : 0;
                int i19 = c20438i.f64726b;
                if (i19 != 0) {
                    i11 = i15;
                    if (i19 == z12) {
                        i10 = i14;
                        if (i16 != 181) {
                            AbstractC20800b.m21332t("H263Reader", "Unexpected start code value");
                            c20438i.f64725a = false;
                            c20438i.f64727c = 0;
                            c20438i.f64726b = 0;
                        } else {
                            c20438i.f64726b = 2;
                        }
                    } else if (i19 != 2) {
                        i10 = i14;
                        if (i19 != 3) {
                            if (i19 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i16 == 179 || i16 == 181) {
                                c20438i.f64727c -= i18;
                                c20438i.f64725a = false;
                                InterfaceC6316H interfaceC6316H = this.f64747i;
                                int i20 = c20438i.f64728d;
                                String str = this.f64746h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(c20438i.f64729e, c20438i.f64727c);
                                C6318J c6318j = new C6318J(bArrCopyOf.length, bArrCopyOf);
                                c6318j.m6884u(i20);
                                c6318j.m6884u(4);
                                c6318j.m6882s();
                                c6318j.m6883t(8);
                                if (c6318j.m6871h()) {
                                    c6318j.m6883t(4);
                                    c6318j.m6883t(3);
                                }
                                int iM6872i = c6318j.m6872i(4);
                                if (iM6872i == 15) {
                                    int iM6872i2 = c6318j.m6872i(8);
                                    int iM6872i3 = c6318j.m6872i(8);
                                    if (iM6872i3 == 0) {
                                        AbstractC20800b.m21332t("H263Reader", "Invalid aspect ratio");
                                        f10 = 1.0f;
                                    } else {
                                        f10 = iM6872i2 / iM6872i3;
                                    }
                                } else if (iM6872i < 7) {
                                    f10 = f64738l[iM6872i];
                                } else {
                                    AbstractC20800b.m21332t("H263Reader", "Invalid aspect ratio");
                                    f10 = 1.0f;
                                }
                                if (c6318j.m6871h()) {
                                    c6318j.m6883t(2);
                                    c6318j.m6883t(1);
                                    if (c6318j.m6871h()) {
                                        c6318j.m6883t(15);
                                        c6318j.m6882s();
                                        c6318j.m6883t(15);
                                        c6318j.m6882s();
                                        c6318j.m6883t(15);
                                        c6318j.m6882s();
                                        c6318j.m6883t(3);
                                        c6318j.m6883t(11);
                                        c6318j.m6882s();
                                        c6318j.m6883t(15);
                                        c6318j.m6882s();
                                    }
                                }
                                if (c6318j.m6872i(2) != 0) {
                                    AbstractC20800b.m21332t("H263Reader", "Unhandled video object layer shape");
                                }
                                c6318j.m6882s();
                                int iM6872i4 = c6318j.m6872i(16);
                                c6318j.m6882s();
                                if (c6318j.m6871h()) {
                                    if (iM6872i4 == 0) {
                                        AbstractC20800b.m21332t("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i21 = 0;
                                        for (int i22 = iM6872i4 - 1; i22 > 0; i22 >>= 1) {
                                            i21++;
                                        }
                                        c6318j.m6883t(i21);
                                    }
                                }
                                c6318j.m6882s();
                                int iM6872i5 = c6318j.m6872i(13);
                                c6318j.m6882s();
                                int iM6872i6 = c6318j.m6872i(13);
                                c6318j.m6882s();
                                c6318j.m6882s();
                                C19787n c19787n = new C19787n();
                                c19787n.f62703a = str;
                                c19787n.f62714l = AbstractC19754D.m20711i("video/mp4v-es");
                                c19787n.f62720r = iM6872i5;
                                c19787n.f62721s = iM6872i6;
                                c19787n.f62724v = f10;
                                c19787n.f62717o = Collections.singletonList(bArrCopyOf);
                                interfaceC6316H.mo4971d(new C19788o(c19787n));
                                this.f64748j = true;
                            }
                            this.f64744f.m21098a(bArr, i13, iM21585b);
                            if (c1529g == null) {
                                c20811m2 = c20811m;
                                z6 = true;
                            } else {
                                if (i17 > 0) {
                                    c1529g.m2258a(bArr, i13, iM21585b);
                                    i12 = 0;
                                } else {
                                    i12 = -i17;
                                }
                                if (c1529g.m2262e(i12)) {
                                    int iM21589f = AbstractC21121g.m21589f(c1529g.f4109c, (byte[]) c1529g.f4112f);
                                    int i23 = AbstractC20817s.f66106a;
                                    byte[] bArr2 = (byte[]) c1529g.f4112f;
                                    C20811m c20811m3 = this.f64740b;
                                    c20811m3.m21342D(iM21589f, bArr2);
                                    this.f64739a.m20989d(this.f64749k, c20811m3);
                                }
                                if (i16 == 178) {
                                    c20811m2 = c20811m;
                                    z6 = true;
                                    if (c20811m2.f66092a[iM21585b + 2] == 1) {
                                        c1529g.m2265h(i16);
                                    }
                                } else {
                                    c20811m2 = c20811m;
                                    z6 = true;
                                }
                            }
                            int i24 = i10 - iM21585b;
                            this.f64744f.m21099b(i24, this.f64745g - ((long) i24), this.f64748j);
                            C20439j c20439j = this.f64744f;
                            long j10 = this.f64749k;
                            c20439j.f64734e = i16;
                            c20439j.f64733d = false;
                            if (i16 != 182 || i16 == 179) {
                                z10 = z6;
                            } else {
                                z10 = false;
                            }
                            c20439j.f64731b = z10;
                            if (i16 == 182) {
                                z11 = z6;
                            } else {
                                z11 = false;
                            }
                            c20439j.f64732c = z11;
                            c20439j.f64735f = 0;
                            c20439j.f64737h = j10;
                            z12 = z6;
                            i13 = i11;
                            i14 = i10;
                        } else if ((b & 240) != 32) {
                            AbstractC20800b.m21332t("H263Reader", "Unexpected start code value");
                            c20438i.f64725a = false;
                            c20438i.f64727c = 0;
                            c20438i.f64726b = 0;
                        } else {
                            c20438i.f64728d = c20438i.f64727c;
                            c20438i.f64726b = 4;
                        }
                    } else {
                        i10 = i14;
                        if (i16 > 31) {
                            AbstractC20800b.m21332t("H263Reader", "Unexpected start code value");
                            c20438i.f64725a = false;
                            c20438i.f64727c = 0;
                            c20438i.f64726b = 0;
                        } else {
                            c20438i.f64726b = 3;
                        }
                    }
                } else {
                    i10 = i14;
                    i11 = i15;
                    if (i16 == 176) {
                        c20438i.f64726b = 1;
                        c20438i.f64725a = true;
                    }
                }
                c20438i.m21097a(C20438i.f64724f, 0, 3);
                this.f64744f.m21098a(bArr, i13, iM21585b);
                if (c1529g == null) {
                    c20811m2 = c20811m;
                    z6 = true;
                } else {
                    if (i17 > 0) {
                        c1529g.m2258a(bArr, i13, iM21585b);
                        i12 = 0;
                    } else {
                        i12 = -i17;
                    }
                    if (c1529g.m2262e(i12)) {
                        int iM21589f2 = AbstractC21121g.m21589f(c1529g.f4109c, (byte[]) c1529g.f4112f);
                        int i25 = AbstractC20817s.f66106a;
                        byte[] bArr3 = (byte[]) c1529g.f4112f;
                        C20811m c20811m4 = this.f64740b;
                        c20811m4.m21342D(iM21589f2, bArr3);
                        this.f64739a.m20989d(this.f64749k, c20811m4);
                    }
                    if (i16 == 178) {
                        c20811m2 = c20811m;
                        z6 = true;
                        if (c20811m2.f66092a[iM21585b + 2] == 1) {
                            c1529g.m2265h(i16);
                        }
                    } else {
                        c20811m2 = c20811m;
                        z6 = true;
                    }
                }
                int i26 = i10 - iM21585b;
                this.f64744f.m21099b(i26, this.f64745g - ((long) i26), this.f64748j);
                C20439j c20439j2 = this.f64744f;
                long j11 = this.f64749k;
                c20439j2.f64734e = i16;
                c20439j2.f64733d = false;
                if (i16 != 182) {
                    z10 = z6;
                } else {
                    z10 = z6;
                }
                c20439j2.f64731b = z10;
                if (i16 == 182) {
                    z11 = z6;
                } else {
                    z11 = false;
                }
                c20439j2.f64732c = z11;
                c20439j2.f64735f = 0;
                c20439j2.f64737h = j11;
                z12 = z6;
                i13 = i11;
                i14 = i10;
            }
            this.f64744f.m21098a(bArr, i13, iM21585b);
            if (c1529g == null) {
                c20811m2 = c20811m;
                z6 = true;
            } else {
                if (i17 > 0) {
                    c1529g.m2258a(bArr, i13, iM21585b);
                    i12 = 0;
                } else {
                    i12 = -i17;
                }
                if (c1529g.m2262e(i12)) {
                    int iM21589f3 = AbstractC21121g.m21589f(c1529g.f4109c, (byte[]) c1529g.f4112f);
                    int i27 = AbstractC20817s.f66106a;
                    byte[] bArr4 = (byte[]) c1529g.f4112f;
                    C20811m c20811m5 = this.f64740b;
                    c20811m5.m21342D(iM21589f3, bArr4);
                    this.f64739a.m20989d(this.f64749k, c20811m5);
                }
                if (i16 == 178) {
                    c20811m2 = c20811m;
                    z6 = true;
                    if (c20811m2.f66092a[iM21585b + 2] == 1) {
                        c1529g.m2265h(i16);
                    }
                } else {
                    c20811m2 = c20811m;
                    z6 = true;
                }
            }
            int i28 = i10 - iM21585b;
            this.f64744f.m21099b(i28, this.f64745g - ((long) i28), this.f64748j);
            C20439j c20439j3 = this.f64744f;
            long j12 = this.f64749k;
            c20439j3.f64734e = i16;
            c20439j3.f64733d = false;
            if (i16 != 182) {
                z10 = z6;
            } else {
                z10 = z6;
            }
            c20439j3.f64731b = z10;
            if (i16 == 182) {
                z11 = z6;
            } else {
                z11 = false;
            }
            c20439j3.f64732c = z11;
            c20439j3.f64735f = 0;
            c20439j3.f64737h = j12;
            z12 = z6;
            i13 = i11;
            i14 = i10;
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: c */
    public final void mo21089c() {
        AbstractC21121g.m21584a(this.f64741c);
        C20438i c20438i = this.f64742d;
        c20438i.f64725a = false;
        c20438i.f64727c = 0;
        c20438i.f64726b = 0;
        C20439j c20439j = this.f64744f;
        if (c20439j != null) {
            c20439j.f64731b = false;
            c20439j.f64732c = false;
            c20439j.f64733d = false;
            c20439j.f64734e = -1;
        }
        C1529G c1529g = this.f64743e;
        if (c1529g != null) {
            c1529g.m2264g();
        }
        this.f64745g = 0L;
        this.f64749k = -9223372036854775807L;
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: d */
    public final void mo21090d(InterfaceC6335q interfaceC6335q, C13458b c13458b) {
        c13458b.m14981c();
        c13458b.m14986h();
        this.f64746h = (String) c13458b.f42596e;
        c13458b.m14986h();
        InterfaceC6316H interfaceC6316HMo3044D = interfaceC6335q.mo3044D(c13458b.f42594c, 2);
        this.f64747i = interfaceC6316HMo3044D;
        this.f64744f = new C20439j(interfaceC6316HMo3044D);
        this.f64739a.m20990e(interfaceC6335q, c13458b);
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: e */
    public final void mo21091e(boolean z6) {
        AbstractC20800b.m21321i(this.f64744f);
        if (z6) {
            this.f64744f.m21099b(0, this.f64745g, this.f64748j);
            C20439j c20439j = this.f64744f;
            c20439j.f64731b = false;
            c20439j.f64732c = false;
            c20439j.f64733d = false;
            c20439j.f64734e = -1;
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: f */
    public final void mo21092f(int i10, long j10) {
        this.f64749k = j10;
    }
}
