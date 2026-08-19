package p846k4;

import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import io.sentry.C15358g1;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.List;
import p054C0.C1497j;
import p1016t3.C19755E;
import p1016t3.C19788o;
import p1055v4.C20430a;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p372P3.AbstractC6320b;
import p372P3.C6330l;
import p372P3.C6337s;
import p372P3.C6338t;
import p372P3.InterfaceC6310B;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6333o;
import p372P3.InterfaceC6334p;
import p372P3.InterfaceC6335q;
import p734ep.C13458b;

/* JADX INFO: renamed from: k4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C16335d implements InterfaceC6333o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50678a;

    /* JADX INFO: renamed from: b */
    public boolean f50679b;

    /* JADX INFO: renamed from: c */
    public Object f50680c;

    /* JADX INFO: renamed from: d */
    public Object f50681d;

    public C16335d(int i10) {
        this.f50678a = i10;
        switch (i10) {
            case 1:
                this.f50680c = new C20430a();
                this.f50681d = new C20811m(2786);
                break;
            case 2:
                this.f50680c = new C20430a(null, 0, 1);
                this.f50681d = new C20811m(16384);
                break;
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: a */
    public final InterfaceC6333o mo6855a() {
        int i10 = this.f50678a;
        return this;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: c */
    public final boolean mo6856c(InterfaceC6334p interfaceC6334p) throws EOFException, InterruptedIOException {
        int iM6890f;
        int i10;
        switch (this.f50678a) {
            case 0:
                try {
                    return m17929j((C6330l) interfaceC6334p);
                } catch (C19755E unused) {
                    return false;
                }
            case 1:
                C20811m c20811m = new C20811m(10);
                int i11 = 0;
                while (true) {
                    C6330l c6330l = (C6330l) interfaceC6334p;
                    c6330l.mo3047d(c20811m.f66092a, 0, 10, false);
                    c20811m.m21344F(0);
                    if (c20811m.m21368w() != 4801587) {
                        c6330l.f20550r0 = 0;
                        c6330l.m6941g(i11, false);
                        int i12 = 0;
                        int i13 = i11;
                        while (true) {
                            c6330l.mo3047d(c20811m.f66092a, 0, 6, false);
                            c20811m.m21344F(0);
                            if (c20811m.m21371z() != 2935) {
                                c6330l.f20550r0 = 0;
                                i13++;
                                if (i13 - i11 >= 8192) {
                                    return false;
                                }
                                c6330l.m6941g(i13, false);
                                i12 = 0;
                            } else {
                                i12++;
                                if (i12 >= 4) {
                                    return true;
                                }
                                byte[] bArr = c20811m.f66092a;
                                if (bArr.length < 6) {
                                    iM6890f = -1;
                                } else if (((bArr[5] & 248) >> 3) > 10) {
                                    iM6890f = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                                } else {
                                    byte b = bArr[4];
                                    iM6890f = AbstractC6320b.m6890f((b & 192) >> 6, b & 63);
                                }
                                if (iM6890f == -1) {
                                    return false;
                                }
                                c6330l.m6941g(iM6890f - 6, false);
                            }
                        }
                    } else {
                        c20811m.m21345G(3);
                        int iM21364s = c20811m.m21364s();
                        i11 += iM21364s + 10;
                        c6330l.m6941g(iM21364s, false);
                    }
                }
                break;
            default:
                C20811m c20811m2 = new C20811m(10);
                int i14 = 0;
                while (true) {
                    C6330l c6330l2 = (C6330l) interfaceC6334p;
                    c6330l2.mo3047d(c20811m2.f66092a, 0, 10, false);
                    c20811m2.m21344F(0);
                    if (c20811m2.m21368w() != 4801587) {
                        c6330l2.f20550r0 = 0;
                        c6330l2.m6941g(i14, false);
                        int i15 = 0;
                        int i16 = i14;
                        while (true) {
                            int i17 = 7;
                            c6330l2.mo3047d(c20811m2.f66092a, 0, 7, false);
                            c20811m2.m21344F(0);
                            int iM21371z = c20811m2.m21371z();
                            if (iM21371z == 44096 || iM21371z == 44097) {
                                i15++;
                                if (i15 >= 4) {
                                    return true;
                                }
                                byte[] bArr2 = c20811m2.f66092a;
                                if (bArr2.length < 7) {
                                    i10 = -1;
                                } else {
                                    int i18 = ((bArr2[2] & 255) << 8) | (bArr2[3] & 255);
                                    if (i18 == 65535) {
                                        i18 = ((bArr2[4] & 255) << 16) | ((bArr2[5] & 255) << 8) | (bArr2[6] & 255);
                                    } else {
                                        i17 = 4;
                                    }
                                    if (iM21371z == 44097) {
                                        i17 += 2;
                                    }
                                    i10 = i18 + i17;
                                }
                                if (i10 == -1) {
                                    return false;
                                }
                                c6330l2.m6941g(i10 - 7, false);
                            } else {
                                c6330l2.f20550r0 = 0;
                                i16++;
                                if (i16 - i14 >= 8192) {
                                    return false;
                                }
                                c6330l2.m6941g(i16, false);
                                i15 = 0;
                            }
                        }
                    } else {
                        c20811m2.m21345G(3);
                        int iM21364s2 = c20811m2.m21364s();
                        i14 += iM21364s2 + 10;
                        c6330l2.m6941g(iM21364s2, false);
                    }
                }
                break;
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: f */
    public final void mo6857f(long j10, long j11) {
        switch (this.f50678a) {
            case 0:
                AbstractC16341j abstractC16341j = (AbstractC16341j) this.f50681d;
                if (abstractC16341j != null) {
                    C16336e c16336e = abstractC16341j.f50697a;
                    C16337f c16337f = c16336e.f50682a;
                    c16337f.f50687a = 0;
                    c16337f.f50688b = 0L;
                    c16337f.f50689c = 0;
                    c16337f.f50690d = 0;
                    c16337f.f50691e = 0;
                    c16336e.f50683b.m21341C(0);
                    c16336e.f50684c = -1;
                    c16336e.f50686e = false;
                    if (j10 == 0) {
                        abstractC16341j.mo17925d(!abstractC16341j.f50708l);
                    } else if (abstractC16341j.f50704h != 0) {
                        long j12 = (((long) abstractC16341j.f50705i) * j11) / 1000000;
                        abstractC16341j.f50701e = j12;
                        InterfaceC16338g interfaceC16338g = abstractC16341j.f50700d;
                        int i10 = AbstractC20817s.f66106a;
                        interfaceC16338g.mo2156e(j12);
                        abstractC16341j.f50704h = 2;
                    }
                }
                break;
            case 1:
                this.f50679b = false;
                ((C20430a) this.f50680c).mo21089c();
                break;
            default:
                this.f50679b = false;
                ((C20430a) this.f50680c).mo21089c();
                break;
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: g */
    public final List mo6858g() {
        switch (this.f50678a) {
            case 0:
                C11276A c11276a = AbstractC11278C.f34162Z;
                break;
            case 1:
                C11276A c11276a2 = AbstractC11278C.f34162Z;
                break;
            default:
                C11276A c11276a3 = AbstractC11278C.f34162Z;
                break;
        }
        return C11294T.f34185q0;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x01e7  */
    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: h */
    public final int mo6859h(InterfaceC6334p interfaceC6334p, C6337s c6337s) throws C19755E, EOFException, InterruptedIOException {
        byte[] bArr;
        int i10 = 1;
        switch (this.f50678a) {
            case 0:
                AbstractC20800b.m21321i((InterfaceC6335q) this.f50680c);
                if (((AbstractC16341j) this.f50681d) == null) {
                    C6330l c6330l = (C6330l) interfaceC6334p;
                    if (!m17929j(c6330l)) {
                        throw C19755E.m20712a(null, "Failed to determine bitstream type");
                    }
                    c6330l.f20550r0 = 0;
                }
                if (!this.f50679b) {
                    InterfaceC6316H interfaceC6316HMo3044D = ((InterfaceC6335q) this.f50680c).mo3044D(0, 1);
                    ((InterfaceC6335q) this.f50680c).mo3061s();
                    AbstractC16341j abstractC16341j = (AbstractC16341j) this.f50681d;
                    abstractC16341j.f50699c = (InterfaceC6335q) this.f50680c;
                    abstractC16341j.f50698b = interfaceC6316HMo3044D;
                    abstractC16341j.mo17925d(true);
                    this.f50679b = true;
                }
                AbstractC16341j abstractC16341j2 = (AbstractC16341j) this.f50681d;
                AbstractC20800b.m21321i(abstractC16341j2.f50698b);
                int i11 = AbstractC20817s.f66106a;
                int i12 = abstractC16341j2.f50704h;
                C16336e c16336e = abstractC16341j2.f50697a;
                if (i12 == 0) {
                    while (true) {
                        C6330l c6330l2 = (C6330l) interfaceC6334p;
                        if (!c16336e.m17931b(c6330l2)) {
                            abstractC16341j2.f50704h = 3;
                            return -1;
                        }
                        long j10 = c6330l2.f20548p0;
                        long j11 = abstractC16341j2.f50702f;
                        abstractC16341j2.f50707k = j10 - j11;
                        C15358g1 c15358g1 = abstractC16341j2.f50706j;
                        C20811m c20811m = c16336e.f50683b;
                        if (abstractC16341j2.mo17924c(c20811m, j11, c15358g1)) {
                            abstractC16341j2.f50702f = ((C6330l) interfaceC6334p).f20548p0;
                        } else {
                            C19788o c19788o = (C19788o) abstractC16341j2.f50706j.f47945Y;
                            abstractC16341j2.f50705i = c19788o.f62730B;
                            if (!abstractC16341j2.f50709m) {
                                abstractC16341j2.f50698b.mo4971d(c19788o);
                                abstractC16341j2.f50709m = true;
                            }
                            C1497j c1497j = (C1497j) abstractC16341j2.f50706j.f47946Z;
                            if (c1497j != null) {
                                abstractC16341j2.f50700d = c1497j;
                            } else {
                                long j12 = ((C6330l) interfaceC6334p).f20547o0;
                                if (j12 == -1) {
                                    abstractC16341j2.f50700d = new C16340i();
                                } else {
                                    C16337f c16337f = c16336e.f50682a;
                                    abstractC16341j2.f50700d = new C16333b(abstractC16341j2, abstractC16341j2.f50702f, j12, c16337f.f50690d + c16337f.f50691e, c16337f.f50688b, (c16337f.f50687a & 4) != 0);
                                }
                                abstractC16341j2.f50704h = 2;
                                bArr = c20811m.f66092a;
                                if (bArr.length != 65025) {
                                    c20811m.m21342D(c20811m.f66094c, Arrays.copyOf(bArr, Math.max(65025, c20811m.f66094c)));
                                }
                            }
                            abstractC16341j2.f50704h = 2;
                            bArr = c20811m.f66092a;
                            if (bArr.length != 65025) {
                                c20811m.m21342D(c20811m.f66094c, Arrays.copyOf(bArr, Math.max(65025, c20811m.f66094c)));
                            }
                        }
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        C6330l c6330l3 = (C6330l) interfaceC6334p;
                        long jMo2153a = abstractC16341j2.f50700d.mo2153a(c6330l3);
                        if (jMo2153a >= 0) {
                            c6337s.f20561a = jMo2153a;
                        } else {
                            if (jMo2153a < -1) {
                                abstractC16341j2.mo17944a(-(jMo2153a + 2));
                            }
                            if (!abstractC16341j2.f50708l) {
                                InterfaceC6310B interfaceC6310BMo2154c = abstractC16341j2.f50700d.mo2154c();
                                AbstractC20800b.m21321i(interfaceC6310BMo2154c);
                                abstractC16341j2.f50699c.mo3045F(interfaceC6310BMo2154c);
                                abstractC16341j2.f50708l = true;
                            }
                            if (abstractC16341j2.f50707k > 0 || c16336e.m17931b(c6330l3)) {
                                abstractC16341j2.f50707k = 0L;
                                C20811m c20811m2 = c16336e.f50683b;
                                long jMo17923b = abstractC16341j2.mo17923b(c20811m2);
                                if (jMo17923b >= 0) {
                                    long j13 = abstractC16341j2.f50703g;
                                    if (j13 + jMo17923b >= abstractC16341j2.f50701e) {
                                        long j14 = (j13 * 1000000) / ((long) abstractC16341j2.f50705i);
                                        abstractC16341j2.f50698b.mo4970c(c20811m2.f66094c, c20811m2);
                                        abstractC16341j2.f50698b.mo4968a(j14, 1, c20811m2.f66094c, 0, null);
                                        abstractC16341j2.f50701e = -1L;
                                    }
                                }
                                abstractC16341j2.f50703g += jMo17923b;
                                i10 = 0;
                            } else {
                                abstractC16341j2.f50704h = 3;
                                i10 = -1;
                            }
                        }
                        return i10;
                    }
                    ((C6330l) interfaceC6334p).mo3052j((int) abstractC16341j2.f50702f);
                    abstractC16341j2.f50704h = 2;
                }
                return 0;
            case 1:
                C20811m c20811m3 = (C20811m) this.f50681d;
                int i13 = ((C6330l) interfaceC6334p).read(c20811m3.f66092a, 0, 2786);
                if (i13 == -1) {
                    return -1;
                }
                c20811m3.m21344F(0);
                c20811m3.m21343E(i13);
                boolean z6 = this.f50679b;
                C20430a c20430a = (C20430a) this.f50680c;
                if (!z6) {
                    c20430a.f64643n = 0L;
                    this.f50679b = true;
                }
                c20430a.mo21088b(c20811m3);
                return 0;
            default:
                C20811m c20811m4 = (C20811m) this.f50681d;
                int i14 = ((C6330l) interfaceC6334p).read(c20811m4.f66092a, 0, 16384);
                if (i14 == -1) {
                    return -1;
                }
                c20811m4.m21344F(0);
                c20811m4.m21343E(i14);
                boolean z10 = this.f50679b;
                C20430a c20430a2 = (C20430a) this.f50680c;
                if (!z10) {
                    c20430a2.f64643n = 0L;
                    this.f50679b = true;
                }
                c20430a2.mo21088b(c20811m4);
                return 0;
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: i */
    public final void mo6860i(InterfaceC6335q interfaceC6335q) {
        switch (this.f50678a) {
            case 0:
                this.f50680c = interfaceC6335q;
                break;
            case 1:
                ((C20430a) this.f50680c).mo21090d(interfaceC6335q, new C13458b(0, 1));
                interfaceC6335q.mo3061s();
                interfaceC6335q.mo3045F(new C6338t(-9223372036854775807L));
                break;
            default:
                ((C20430a) this.f50680c).mo21090d(interfaceC6335q, new C13458b(0, 1));
                interfaceC6335q.mo3061s();
                interfaceC6335q.mo3045F(new C6338t(-9223372036854775807L));
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m17929j(C6330l c6330l) {
        boolean zM6904t;
        C16337f c16337f = new C16337f();
        if (c16337f.m17932a(c6330l, true) && (c16337f.f50687a & 2) == 2) {
            int iMin = Math.min(c16337f.f50691e, 8);
            C20811m c20811m = new C20811m(iMin);
            c6330l.mo3047d(c20811m.f66092a, 0, iMin, false);
            c20811m.m21344F(0);
            if (c20811m.m21346a() >= 5 && c20811m.m21365t() == 127 && c20811m.m21367v() == 1179402563) {
                this.f50681d = new C16334c();
            } else {
                c20811m.m21344F(0);
                try {
                    zM6904t = AbstractC6320b.m6904t(1, c20811m, true);
                } catch (C19755E unused) {
                    zM6904t = false;
                }
                if (zM6904t) {
                    this.f50681d = new C16342k();
                } else {
                    c20811m.m21344F(0);
                    if (C16339h.m17934e(c20811m, C16339h.f50694o)) {
                        this.f50681d = new C16339h();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p372P3.InterfaceC6333o
    public final void release() {
        int i10 = this.f50678a;
    }

    /* JADX INFO: renamed from: b */
    private final void m17926b() {
    }

    /* JADX INFO: renamed from: d */
    private final void m17927d() {
    }

    /* JADX INFO: renamed from: e */
    private final void m17928e() {
    }
}
