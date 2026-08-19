package p1055v4;

import java.util.Collections;
import p057C3.C1529G;
import p1016t3.AbstractC19754D;
import p1016t3.C19781h;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p1097x3.AbstractC21121g;
import p1097x3.C21118d;
import p372P3.AbstractC6320b;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;
import p734ep.C13458b;
import sk.C19662a;

/* JADX INFO: renamed from: v4.p */
/* JADX INFO: loaded from: classes.dex */
public final class C20445p implements InterfaceC20435f {

    /* JADX INFO: renamed from: a */
    public final C19662a f64813a;

    /* JADX INFO: renamed from: b */
    public String f64814b;

    /* JADX INFO: renamed from: c */
    public InterfaceC6316H f64815c;

    /* JADX INFO: renamed from: d */
    public C20444o f64816d;

    /* JADX INFO: renamed from: e */
    public boolean f64817e;

    /* JADX INFO: renamed from: l */
    public long f64824l;

    /* JADX INFO: renamed from: f */
    public final boolean[] f64818f = new boolean[3];

    /* JADX INFO: renamed from: g */
    public final C1529G f64819g = new C1529G(32);

    /* JADX INFO: renamed from: h */
    public final C1529G f64820h = new C1529G(33);

    /* JADX INFO: renamed from: i */
    public final C1529G f64821i = new C1529G(34);

    /* JADX INFO: renamed from: j */
    public final C1529G f64822j = new C1529G(39);

    /* JADX INFO: renamed from: k */
    public final C1529G f64823k = new C1529G(40);

    /* JADX INFO: renamed from: m */
    public long f64825m = -9223372036854775807L;

    /* JADX INFO: renamed from: n */
    public final C20811m f64826n = new C20811m();

    public C20445p(C19662a c19662a) {
        this.f64813a = c19662a;
    }

    /* JADX INFO: renamed from: a */
    public final void m21103a(byte[] bArr, int i10, int i11) {
        C20444o c20444o = this.f64816d;
        if (c20444o.f64805f) {
            int i12 = c20444o.f64803d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                c20444o.f64806g = (bArr[i13] & 128) != 0;
                c20444o.f64805f = false;
            } else {
                c20444o.f64803d = (i11 - i10) + i12;
            }
        }
        if (!this.f64817e) {
            this.f64819g.m2258a(bArr, i10, i11);
            this.f64820h.m2258a(bArr, i10, i11);
            this.f64821i.m2258a(bArr, i10, i11);
        }
        this.f64822j.m2258a(bArr, i10, i11);
        this.f64823k.m2258a(bArr, i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x016a  */
    /* JADX WARN: Code duplicated, block: B:46:0x018b  */
    /* JADX WARN: Code duplicated, block: B:49:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:54:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x0211  */
    /* JADX WARN: Code duplicated, block: B:82:0x021d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0224  */
    /* JADX WARN: Code duplicated, block: B:93:0x0233 A[SYNTHETIC] */
    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: b */
    public final void mo21088b(C20811m c20811m) {
        boolean z6;
        C1529G c1529g;
        C1529G c1529g2;
        C1529G c1529g3;
        C1529G c1529g4;
        boolean zM2262e;
        InterfaceC6316H[] interfaceC6316HArr;
        C20811m c20811m2;
        C1529G c1529g5;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        AbstractC20800b.m21321i(this.f64815c);
        int i10 = AbstractC20817s.f66106a;
        while (c20811m.m21346a() > 0) {
            int i11 = c20811m.f66093b;
            int i12 = c20811m.f66094c;
            byte[] bArr = c20811m.f66092a;
            this.f64824l += (long) c20811m.m21346a();
            this.f64815c.mo4970c(c20811m.m21346a(), c20811m);
            while (i11 < i12) {
                int iM21585b = AbstractC21121g.m21585b(bArr, i11, i12, this.f64818f);
                if (iM21585b == i12) {
                    m21103a(bArr, i11, i12);
                    return;
                }
                int i13 = iM21585b + 3;
                int i14 = (bArr[i13] & 126) >> 1;
                int i15 = iM21585b - i11;
                if (i15 > 0) {
                    m21103a(bArr, i11, iM21585b);
                }
                int i16 = i12 - iM21585b;
                long j10 = this.f64824l - ((long) i16);
                int i17 = i15 < 0 ? -i15 : 0;
                long j11 = this.f64825m;
                C20444o c20444o = this.f64816d;
                boolean z14 = this.f64817e;
                if (c20444o.f64809j && c20444o.f64806g) {
                    c20444o.f64812m = c20444o.f64802c;
                    c20444o.f64809j = false;
                } else {
                    if (c20444o.f64807h || c20444o.f64806g) {
                        if (z14 && c20444o.f64808i) {
                            c20444o.m21102a(((int) (j10 - c20444o.f64801b)) + i16);
                        }
                        c20444o.f64810k = c20444o.f64801b;
                        c20444o.f64811l = c20444o.f64804e;
                        c20444o.f64812m = c20444o.f64802c;
                        c20444o.f64808i = true;
                    }
                    z6 = this.f64817e;
                    c1529g = this.f64821i;
                    c1529g2 = this.f64820h;
                    c1529g3 = this.f64819g;
                    if (!z6) {
                        c1529g3.m2262e(i17);
                        c1529g2.m2262e(i17);
                        c1529g.m2262e(i17);
                        if (!c1529g3.f4111e && c1529g2.f4111e && c1529g.f4111e) {
                            InterfaceC6316H interfaceC6316H = this.f64815c;
                            String str = this.f64814b;
                            int i18 = c1529g3.f4109c;
                            byte[] bArr2 = new byte[c1529g2.f4109c + i18 + c1529g.f4109c];
                            System.arraycopy((byte[]) c1529g3.f4112f, 0, bArr2, 0, i18);
                            System.arraycopy((byte[]) c1529g2.f4112f, 0, bArr2, c1529g3.f4109c, c1529g2.f4109c);
                            System.arraycopy((byte[]) c1529g.f4112f, 0, bArr2, c1529g3.f4109c + c1529g2.f4109c, c1529g.f4109c);
                            C21118d c21118dM21586c = AbstractC21121g.m21586c((byte[]) c1529g2.f4112f, 3, c1529g2.f4109c);
                            String strM21314b = AbstractC20800b.m21314b(c21118dM21586c.f67078a, c21118dM21586c.f67079b, c21118dM21586c.f67080c, c21118dM21586c.f67081d, c21118dM21586c.f67084g, c21118dM21586c.f67085h);
                            C19787n c19787n = new C19787n();
                            c19787n.f62703a = str;
                            c19787n.f62714l = AbstractC19754D.m20711i("video/hevc");
                            c19787n.f62711i = strM21314b;
                            c19787n.f62720r = c21118dM21586c.f67086i;
                            c19787n.f62721s = c21118dM21586c.f67087j;
                            c19787n.f62727y = new C19781h(c21118dM21586c.f67090m, c21118dM21586c.f67091n, c21118dM21586c.f67092o, c21118dM21586c.f67082e + 8, c21118dM21586c.f67083f + 8, null);
                            c19787n.f62724v = c21118dM21586c.f67088k;
                            c19787n.f62716n = c21118dM21586c.f67089l;
                            c19787n.f62717o = Collections.singletonList(bArr2);
                            interfaceC6316H.mo4971d(new C19788o(c19787n));
                            this.f64817e = true;
                        }
                    }
                    c1529g4 = this.f64822j;
                    zM2262e = c1529g4.m2262e(i17);
                    interfaceC6316HArr = (InterfaceC6316H[]) this.f64813a.f62321Z;
                    c20811m2 = this.f64826n;
                    if (zM2262e) {
                        c20811m2.m21342D(AbstractC21121g.m21589f(c1529g4.f4109c, (byte[]) c1529g4.f4112f), (byte[]) c1529g4.f4112f);
                        c20811m2.m21345G(5);
                        AbstractC6320b.m6888d(j11, c20811m2, interfaceC6316HArr);
                    }
                    c1529g5 = this.f64823k;
                    if (c1529g5.m2262e(i17)) {
                        c20811m2.m21342D(AbstractC21121g.m21589f(c1529g5.f4109c, (byte[]) c1529g5.f4112f), (byte[]) c1529g5.f4112f);
                        c20811m2.m21345G(5);
                        AbstractC6320b.m6888d(j11, c20811m2, interfaceC6316HArr);
                    }
                    long j12 = this.f64825m;
                    C20444o c20444o2 = this.f64816d;
                    boolean z15 = this.f64817e;
                    c20444o2.f64806g = false;
                    c20444o2.f64807h = false;
                    c20444o2.f64804e = j12;
                    c20444o2.f64803d = 0;
                    c20444o2.f64801b = j10;
                    if (i14 >= 32 || i14 == 40) {
                        z10 = true;
                        z11 = false;
                    } else {
                        if (!c20444o2.f64808i || c20444o2.f64809j) {
                            z11 = false;
                        } else {
                            if (z15) {
                                c20444o2.m21102a(i16);
                            }
                            z11 = false;
                            c20444o2.f64808i = false;
                        }
                        if ((32 > i14 || i14 > 35) && i14 != 39) {
                            z10 = true;
                        } else {
                            z10 = true;
                            c20444o2.f64807h = !c20444o2.f64809j;
                            c20444o2.f64809j = true;
                        }
                    }
                    if (i14 >= 16 || i14 > 21) {
                        z12 = z11;
                    } else {
                        z12 = z10;
                    }
                    c20444o2.f64802c = z12;
                    if (!z12 || i14 <= 9) {
                        z13 = z10;
                    } else {
                        z13 = z11;
                    }
                    c20444o2.f64805f = z13;
                    if (!this.f64817e) {
                        c1529g3.m2265h(i14);
                        c1529g2.m2265h(i14);
                        c1529g.m2265h(i14);
                    }
                    c1529g4.m2265h(i14);
                    c1529g5.m2265h(i14);
                    i11 = i13;
                    i12 = i12;
                    bArr = bArr;
                }
                i13 = i13;
                z6 = this.f64817e;
                c1529g = this.f64821i;
                c1529g2 = this.f64820h;
                c1529g3 = this.f64819g;
                if (!z6) {
                    c1529g3.m2262e(i17);
                    c1529g2.m2262e(i17);
                    c1529g.m2262e(i17);
                    if (!c1529g3.f4111e) {
                    }
                }
                c1529g4 = this.f64822j;
                zM2262e = c1529g4.m2262e(i17);
                interfaceC6316HArr = (InterfaceC6316H[]) this.f64813a.f62321Z;
                c20811m2 = this.f64826n;
                if (zM2262e) {
                    c20811m2.m21342D(AbstractC21121g.m21589f(c1529g4.f4109c, (byte[]) c1529g4.f4112f), (byte[]) c1529g4.f4112f);
                    c20811m2.m21345G(5);
                    AbstractC6320b.m6888d(j11, c20811m2, interfaceC6316HArr);
                }
                c1529g5 = this.f64823k;
                if (c1529g5.m2262e(i17)) {
                    c20811m2.m21342D(AbstractC21121g.m21589f(c1529g5.f4109c, (byte[]) c1529g5.f4112f), (byte[]) c1529g5.f4112f);
                    c20811m2.m21345G(5);
                    AbstractC6320b.m6888d(j11, c20811m2, interfaceC6316HArr);
                }
                long j13 = this.f64825m;
                C20444o c20444o3 = this.f64816d;
                boolean z16 = this.f64817e;
                c20444o3.f64806g = false;
                c20444o3.f64807h = false;
                c20444o3.f64804e = j13;
                c20444o3.f64803d = 0;
                c20444o3.f64801b = j10;
                if (i14 >= 32) {
                    z10 = true;
                    z11 = false;
                } else {
                    z10 = true;
                    z11 = false;
                }
                if (i14 >= 16) {
                    z12 = z11;
                } else {
                    z12 = z11;
                }
                c20444o3.f64802c = z12;
                if (z12) {
                    z13 = z10;
                } else {
                    z13 = z10;
                }
                c20444o3.f64805f = z13;
                if (!this.f64817e) {
                    c1529g3.m2265h(i14);
                    c1529g2.m2265h(i14);
                    c1529g.m2265h(i14);
                }
                c1529g4.m2265h(i14);
                c1529g5.m2265h(i14);
                i11 = i13;
                i12 = i12;
                bArr = bArr;
            }
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: c */
    public final void mo21089c() {
        this.f64824l = 0L;
        this.f64825m = -9223372036854775807L;
        AbstractC21121g.m21584a(this.f64818f);
        this.f64819g.m2264g();
        this.f64820h.m2264g();
        this.f64821i.m2264g();
        this.f64822j.m2264g();
        this.f64823k.m2264g();
        C20444o c20444o = this.f64816d;
        if (c20444o != null) {
            c20444o.f64805f = false;
            c20444o.f64806g = false;
            c20444o.f64807h = false;
            c20444o.f64808i = false;
            c20444o.f64809j = false;
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: d */
    public final void mo21090d(InterfaceC6335q interfaceC6335q, C13458b c13458b) {
        c13458b.m14981c();
        c13458b.m14986h();
        this.f64814b = (String) c13458b.f42596e;
        c13458b.m14986h();
        InterfaceC6316H interfaceC6316HMo3044D = interfaceC6335q.mo3044D(c13458b.f42594c, 2);
        this.f64815c = interfaceC6316HMo3044D;
        this.f64816d = new C20444o(interfaceC6316HMo3044D);
        this.f64813a.m20632c(interfaceC6335q, c13458b);
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: e */
    public final void mo21091e(boolean z6) {
        AbstractC20800b.m21321i(this.f64815c);
        int i10 = AbstractC20817s.f66106a;
        if (z6) {
            C20444o c20444o = this.f64816d;
            long j10 = this.f64824l;
            c20444o.f64812m = c20444o.f64802c;
            c20444o.m21102a((int) (j10 - c20444o.f64801b));
            c20444o.f64810k = c20444o.f64801b;
            c20444o.f64801b = j10;
            c20444o.m21102a(0);
            c20444o.f64808i = false;
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: f */
    public final void mo21092f(int i10, long j10) {
        this.f64825m = j10;
    }
}
