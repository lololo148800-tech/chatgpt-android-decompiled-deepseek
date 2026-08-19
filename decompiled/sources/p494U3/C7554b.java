package p494U3;

import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.List;
import p013Ab.C0420b;
import p1009s9.C19506i;
import p1016t3.C19753C;
import p1016t3.C19755E;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p239Ja.C4307j;
import p372P3.AbstractC6320b;
import p372P3.C6318J;
import p372P3.C6322d;
import p372P3.C6323e;
import p372P3.C6330l;
import p372P3.C6337s;
import p372P3.C6338t;
import p372P3.C6339u;
import p372P3.InterfaceC6310B;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6333o;
import p372P3.InterfaceC6334p;
import p372P3.InterfaceC6335q;
import p657b4.C11228a;
import p696d4.C13010h;

/* JADX INFO: renamed from: U3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7554b implements InterfaceC6333o {

    /* JADX INFO: renamed from: e */
    public InterfaceC6335q f23917e;

    /* JADX INFO: renamed from: f */
    public InterfaceC6316H f23918f;

    /* JADX INFO: renamed from: h */
    public C19753C f23920h;

    /* JADX INFO: renamed from: i */
    public C6339u f23921i;

    /* JADX INFO: renamed from: j */
    public int f23922j;

    /* JADX INFO: renamed from: k */
    public int f23923k;

    /* JADX INFO: renamed from: l */
    public C7553a f23924l;

    /* JADX INFO: renamed from: m */
    public int f23925m;

    /* JADX INFO: renamed from: n */
    public long f23926n;

    /* JADX INFO: renamed from: a */
    public final byte[] f23913a = new byte[42];

    /* JADX INFO: renamed from: b */
    public final C20811m f23914b = new C20811m(0, new byte[32768]);

    /* JADX INFO: renamed from: c */
    public final boolean f23915c = false;

    /* JADX INFO: renamed from: d */
    public final C6337s f23916d = new C6337s();

    /* JADX INFO: renamed from: g */
    public int f23919g = 0;

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: a */
    public final InterfaceC6333o mo6855a() {
        return this;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: c */
    public final boolean mo6856c(InterfaceC6334p interfaceC6334p) throws EOFException, InterruptedIOException {
        C6330l c6330l = (C6330l) interfaceC6334p;
        C19753C c19753cM20611X = new C19506i(17, (byte) 0).m20611X(c6330l, C13010h.f41284b);
        if (c19753cM20611X != null) {
            int length = c19753cM20611X.f62555Y.length;
        }
        C20811m c20811m = new C20811m(4);
        c6330l.mo3047d(c20811m.f66092a, 0, 4, false);
        return c20811m.m21367v() == 1716281667;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: f */
    public final void mo6857f(long j10, long j11) {
        if (j10 == 0) {
            this.f23919g = 0;
        } else {
            C7553a c7553a = this.f23924l;
            if (c7553a != null) {
                c7553a.m6911C(j11);
            }
        }
        this.f23926n = j11 != 0 ? -1L : 0L;
        this.f23925m = 0;
        this.f23914b.m21341C(0);
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: g */
    public final List mo6858g() {
        C11276A c11276a = AbstractC11278C.f34162Z;
        return C11294T.f34185q0;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: h */
    public final int mo6859h(InterfaceC6334p interfaceC6334p, C6337s c6337s) throws C19755E, EOFException, InterruptedIOException {
        C6339u c6339u;
        InterfaceC6310B c6338t;
        long j10;
        boolean z6;
        long j11;
        boolean zM6886b;
        boolean z10 = true;
        int i10 = this.f23919g;
        C19753C c19753c = null;
        if (i10 == 0) {
            ((C6330l) interfaceC6334p).f20550r0 = 0;
            C6330l c6330l = (C6330l) interfaceC6334p;
            long jMo3048e = c6330l.mo3048e();
            C19753C c19753cM20611X = new C19506i(17, (byte) 0).m20611X(c6330l, !this.f23915c ? null : C13010h.f41284b);
            if (c19753cM20611X != null && c19753cM20611X.f62555Y.length != 0) {
                c19753c = c19753cM20611X;
            }
            c6330l.mo3052j((int) (c6330l.mo3048e() - jMo3048e));
            this.f23920h = c19753c;
            this.f23919g = 1;
            return 0;
        }
        byte[] bArr = this.f23913a;
        if (i10 == 1) {
            ((C6330l) interfaceC6334p).mo3047d(bArr, 0, bArr.length, false);
            ((C6330l) interfaceC6334p).f20550r0 = 0;
            this.f23919g = 2;
            return 0;
        }
        int i11 = 3;
        if (i10 == 2) {
            C20811m c20811m = new C20811m(4);
            ((C6330l) interfaceC6334p).mo3046b(c20811m.f66092a, 0, 4, false);
            if (c20811m.m21367v() != 1716281667) {
                throw C19755E.m20712a(null, "Failed to read FLAC stream marker.");
            }
            this.f23919g = 3;
            return 0;
        }
        int i12 = 7;
        if (i10 == 3) {
            C6339u c6339u2 = this.f23921i;
            boolean z11 = false;
            while (!z11) {
                ((C6330l) interfaceC6334p).f20550r0 = 0;
                byte[] bArr2 = new byte[4];
                C6318J c6318j = new C6318J(4, bArr2);
                C6330l c6330l2 = (C6330l) interfaceC6334p;
                c6330l2.mo3047d(bArr2, 0, 4, false);
                boolean zM6871h = c6318j.m6871h();
                int iM6872i = c6318j.m6872i(i12);
                int iM6872i2 = c6318j.m6872i(24) + 4;
                if (iM6872i == 0) {
                    byte[] bArr3 = new byte[38];
                    c6330l2.mo3046b(bArr3, 0, 38, false);
                    c6339u2 = new C6339u(4, bArr3);
                } else {
                    if (c6339u2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iM6872i == i11) {
                        C20811m c20811m2 = new C20811m(iM6872i2);
                        c6330l2.mo3046b(c20811m2.f66092a, 0, iM6872i2, false);
                        c6339u2 = new C6339u(c6339u2.f20565a, c6339u2.f20566b, c6339u2.f20567c, c6339u2.f20568d, c6339u2.f20569e, c6339u2.f20571g, c6339u2.f20572h, c6339u2.f20574j, AbstractC6320b.m6902r(c20811m2), c6339u2.f20576l);
                    } else {
                        C19753C c19753c2 = c6339u2.f20576l;
                        if (iM6872i == 4) {
                            C20811m c20811m3 = new C20811m(iM6872i2);
                            c6330l2.mo3046b(c20811m3.f66092a, 0, iM6872i2, false);
                            c20811m3.m21345G(4);
                            C19753C c19753cM6900p = AbstractC6320b.m6900p(Arrays.asList((String[]) AbstractC6320b.m6903s(c20811m3, false, false).f9127Z));
                            if (c19753c2 != null) {
                                c19753cM6900p = c19753c2.m20702b(c19753cM6900p);
                            }
                            c6339u = new C6339u(c6339u2.f20565a, c6339u2.f20566b, c6339u2.f20567c, c6339u2.f20568d, c6339u2.f20569e, c6339u2.f20571g, c6339u2.f20572h, c6339u2.f20574j, c6339u2.f20575k, c19753cM6900p);
                        } else if (iM6872i == 6) {
                            C20811m c20811m4 = new C20811m(iM6872i2);
                            c6330l2.mo3046b(c20811m4.f66092a, 0, iM6872i2, false);
                            c20811m4.m21345G(4);
                            C19753C c19753c3 = new C19753C(AbstractC11278C.m12695y(C11228a.m12483a(c20811m4)));
                            if (c19753c2 != null) {
                                c19753c3 = c19753c2.m20702b(c19753c3);
                            }
                            c6339u = new C6339u(c6339u2.f20565a, c6339u2.f20566b, c6339u2.f20567c, c6339u2.f20568d, c6339u2.f20569e, c6339u2.f20571g, c6339u2.f20572h, c6339u2.f20574j, c6339u2.f20575k, c19753c3);
                        } else {
                            c6330l2.mo3052j(iM6872i2);
                        }
                        c6339u2 = c6339u;
                    }
                }
                int i13 = AbstractC20817s.f66106a;
                this.f23921i = c6339u2;
                z11 = zM6871h;
                i11 = 3;
                i12 = 7;
            }
            this.f23921i.getClass();
            this.f23922j = Math.max(this.f23921i.f20567c, 6);
            InterfaceC6316H interfaceC6316H = this.f23918f;
            int i14 = AbstractC20817s.f66106a;
            interfaceC6316H.mo4971d(this.f23921i.m6955c(bArr, this.f23920h));
            this.f23919g = 4;
            return 0;
        }
        long j12 = 0;
        if (i10 == 4) {
            ((C6330l) interfaceC6334p).f20550r0 = 0;
            C20811m c20811m5 = new C20811m(2);
            C6330l c6330l3 = (C6330l) interfaceC6334p;
            c6330l3.mo3047d(c20811m5.f66092a, 0, 2, false);
            int iM21371z = c20811m5.m21371z();
            if ((iM21371z >> 2) != 16382) {
                c6330l3.f20550r0 = 0;
                throw C19755E.m20712a(null, "First frame does not start with sync code.");
            }
            c6330l3.f20550r0 = 0;
            this.f23923k = iM21371z;
            InterfaceC6335q interfaceC6335q = this.f23917e;
            int i15 = AbstractC20817s.f66106a;
            long j13 = c6330l3.f20548p0;
            this.f23921i.getClass();
            C6339u c6339u3 = this.f23921i;
            if (c6339u3.f20575k != null) {
                c6338t = new C6338t(c6339u3, j13, 0);
            } else {
                long j14 = c6330l3.f20547o0;
                if (j14 == -1 || c6339u3.f20574j <= 0) {
                    c6338t = new C6338t(c6339u3.m6954b());
                } else {
                    int i16 = this.f23923k;
                    C4307j c4307j = new C4307j(c6339u3, 6);
                    C0420b c0420b = new C0420b(c6339u3, i16);
                    long jM6954b = c6339u3.m6954b();
                    int i17 = c6339u3.f20567c;
                    int i18 = c6339u3.f20568d;
                    if (i18 > 0) {
                        j10 = ((((long) i18) + ((long) i17)) / 2) + 1;
                    } else {
                        int i19 = c6339u3.f20566b;
                        int i20 = c6339u3.f20565a;
                        j10 = (((((i20 != i19 || i20 <= 0) ? 4096L : i20) * ((long) c6339u3.f20571g)) * ((long) c6339u3.f20572h)) / 8) + 64;
                    }
                    C7553a c7553a = new C7553a(c4307j, c0420b, jM6954b, c6339u3.f20574j, j13, j14, j10, Math.max(6, i17));
                    this.f23924l = c7553a;
                    c6338t = (C6322d) c7553a.f20529c;
                }
            }
            interfaceC6335q.mo3045F(c6338t);
            this.f23919g = 5;
            return 0;
        }
        if (i10 != 5) {
            throw new IllegalStateException();
        }
        this.f23918f.getClass();
        this.f23921i.getClass();
        C7553a c7553a2 = this.f23924l;
        if (c7553a2 != null && ((C6323e) c7553a2.f20531e) != null) {
            return c7553a2.m6937v((C6330l) interfaceC6334p, c6337s);
        }
        if (this.f23926n == -1) {
            C6339u c6339u4 = this.f23921i;
            ((C6330l) interfaceC6334p).f20550r0 = 0;
            C6330l c6330l4 = (C6330l) interfaceC6334p;
            c6330l4.m6941g(1, false);
            byte[] bArr4 = new byte[1];
            c6330l4.mo3047d(bArr4, 0, 1, false);
            boolean z12 = (bArr4[0] & 1) == 1;
            c6330l4.m6941g(2, false);
            int i21 = z12 ? 7 : 6;
            C20811m c20811m6 = new C20811m(i21);
            byte[] bArr5 = c20811m6.f66092a;
            int i22 = 0;
            while (i22 < i21) {
                int iM6943m = c6330l4.m6943m(bArr5, i22, i21 - i22);
                if (iM6943m == -1) {
                    break;
                }
                i22 += iM6943m;
            }
            c20811m6.m21343E(i22);
            c6330l4.f20550r0 = 0;
            try {
                long jM21339A = c20811m6.m21339A();
                if (!z12) {
                    jM21339A *= (long) c6339u4.f20566b;
                }
                j12 = jM21339A;
            } catch (NumberFormatException unused) {
                z10 = false;
            }
            if (!z10) {
                throw C19755E.m20712a(null, null);
            }
            this.f23926n = j12;
            return 0;
        }
        C20811m c20811m7 = this.f23914b;
        int i23 = c20811m7.f66094c;
        if (i23 < 32768) {
            int i24 = ((C6330l) interfaceC6334p).read(c20811m7.f66092a, i23, 32768 - i23);
            z6 = i24 == -1;
            if (!z6) {
                c20811m7.m21343E(i23 + i24);
            } else if (c20811m7.m21346a() == 0) {
                long j15 = this.f23926n * 1000000;
                C6339u c6339u5 = this.f23921i;
                int i25 = AbstractC20817s.f66106a;
                this.f23918f.mo4968a(j15 / ((long) c6339u5.f20569e), 1, this.f23925m, 0, null);
                return -1;
            }
        } else {
            z6 = false;
        }
        int i26 = c20811m7.f66093b;
        int i27 = this.f23925m;
        int i28 = this.f23922j;
        if (i27 < i28) {
            c20811m7.m21345G(Math.min(i28 - i27, c20811m7.m21346a()));
        }
        this.f23921i.getClass();
        int i29 = c20811m7.f66093b;
        while (true) {
            int i30 = c20811m7.f66094c - 16;
            C6337s c6337s2 = this.f23916d;
            if (i29 > i30) {
                if (z6) {
                    while (true) {
                        int i31 = c20811m7.f66094c;
                        if (i29 <= i31 - this.f23922j) {
                            c20811m7.m21344F(i29);
                            try {
                                zM6886b = AbstractC6320b.m6886b(c20811m7, this.f23921i, this.f23923k, c6337s2);
                            } catch (IndexOutOfBoundsException unused2) {
                                zM6886b = false;
                            }
                            if (c20811m7.f66093b > c20811m7.f66094c) {
                                zM6886b = false;
                            }
                            if (zM6886b) {
                                c20811m7.m21344F(i29);
                                j11 = c6337s2.f20561a;
                                break;
                            }
                            i29++;
                        } else {
                            c20811m7.m21344F(i31);
                        }
                    }
                } else {
                    c20811m7.m21344F(i29);
                }
                j11 = -1;
                break;
            }
            c20811m7.m21344F(i29);
            if (AbstractC6320b.m6886b(c20811m7, this.f23921i, this.f23923k, c6337s2)) {
                c20811m7.m21344F(i29);
                j11 = c6337s2.f20561a;
                break;
            }
            i29++;
        }
        int i32 = c20811m7.f66093b - i26;
        c20811m7.m21344F(i26);
        this.f23918f.mo4970c(i32, c20811m7);
        int i33 = this.f23925m + i32;
        this.f23925m = i33;
        if (j11 != -1) {
            long j16 = this.f23926n * 1000000;
            C6339u c6339u6 = this.f23921i;
            int i34 = AbstractC20817s.f66106a;
            this.f23918f.mo4968a(j16 / ((long) c6339u6.f20569e), 1, i33, 0, null);
            this.f23925m = 0;
            this.f23926n = j11;
        }
        if (c20811m7.m21346a() >= 16) {
            return 0;
        }
        int iM21346a = c20811m7.m21346a();
        byte[] bArr6 = c20811m7.f66092a;
        System.arraycopy(bArr6, c20811m7.f66093b, bArr6, 0, iM21346a);
        c20811m7.m21344F(0);
        c20811m7.m21343E(iM21346a);
        return 0;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: i */
    public final void mo6860i(InterfaceC6335q interfaceC6335q) {
        this.f23917e = interfaceC6335q;
        this.f23918f = interfaceC6335q.mo3044D(0, 1);
        interfaceC6335q.mo3061s();
    }

    @Override // p372P3.InterfaceC6333o
    public final void release() {
    }
}
