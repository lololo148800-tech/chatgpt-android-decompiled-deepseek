package p1055v4;

import android.util.SparseArray;
import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p1073w3.C20816r;
import p140Fa.C2685e;
import p372P3.C6318J;
import p372P3.C6322d;
import p372P3.C6323e;
import p372P3.C6330l;
import p372P3.C6337s;
import p372P3.C6338t;
import p372P3.InterfaceC6333o;
import p372P3.InterfaceC6334p;
import p372P3.InterfaceC6335q;
import p494U3.C7553a;
import p658b5.C11232c;
import p734ep.C13458b;

/* JADX INFO: renamed from: v4.x */
/* JADX INFO: loaded from: classes.dex */
public final class C20453x implements InterfaceC6333o {

    /* JADX INFO: renamed from: e */
    public boolean f64918e;

    /* JADX INFO: renamed from: f */
    public boolean f64919f;

    /* JADX INFO: renamed from: g */
    public boolean f64920g;

    /* JADX INFO: renamed from: h */
    public long f64921h;

    /* JADX INFO: renamed from: i */
    public C7553a f64922i;

    /* JADX INFO: renamed from: j */
    public InterfaceC6335q f64923j;

    /* JADX INFO: renamed from: k */
    public boolean f64924k;

    /* JADX INFO: renamed from: a */
    public final C20816r f64914a = new C20816r(0);

    /* JADX INFO: renamed from: c */
    public final C20811m f64916c = new C20811m(4096);

    /* JADX INFO: renamed from: b */
    public final SparseArray f64915b = new SparseArray();

    /* JADX INFO: renamed from: d */
    public final C20451v f64917d = new C20451v(0);

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: a */
    public final InterfaceC6333o mo6855a() {
        return this;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: c */
    public final boolean mo6856c(InterfaceC6334p interfaceC6334p) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        C6330l c6330l = (C6330l) interfaceC6334p;
        c6330l.mo3047d(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c6330l.m6941g(bArr[13] & 7, false);
        c6330l.mo3047d(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: f */
    public final void mo6857f(long j10, long j11) {
        C20816r c20816r = this.f64914a;
        boolean z6 = c20816r.m21384e() == -9223372036854775807L;
        if (!z6) {
            long jM21383d = c20816r.m21383d();
            z6 = (jM21383d == -9223372036854775807L || jM21383d == 0 || jM21383d == j11) ? false : true;
        }
        if (z6) {
            c20816r.m21386g(j11);
        }
        C7553a c7553a = this.f64922i;
        if (c7553a != null) {
            c7553a.m6911C(j11);
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f64915b;
            if (i10 >= sparseArray.size()) {
                return;
            }
            C20452w c20452w = (C20452w) sparseArray.valueAt(i10);
            c20452w.f64912f = false;
            c20452w.f64907a.mo21089c();
            i10++;
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: g */
    public final List mo6858g() {
        C11276A c11276a = AbstractC11278C.f34162Z;
        return C11294T.f34185q0;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: h */
    public final int mo6859h(InterfaceC6334p interfaceC6334p, C6337s c6337s) {
        InterfaceC20435f c20437h;
        long jM21106c;
        long jM21106c2;
        AbstractC20800b.m21321i(this.f64923j);
        long j10 = ((C6330l) interfaceC6334p).f20547o0;
        int i10 = 1;
        C20451v c20451v = this.f64917d;
        if (j10 != -1 && !c20451v.f64901d) {
            boolean z6 = c20451v.f64903f;
            C20811m c20811m = c20451v.f64900c;
            if (!z6) {
                C6330l c6330l = (C6330l) interfaceC6334p;
                long j11 = c6330l.f20547o0;
                int iMin = (int) Math.min(20000L, j11);
                long j12 = j11 - ((long) iMin);
                if (c6330l.f20548p0 != j12) {
                    c6337s.f20561a = j12;
                } else {
                    c20811m.m21341C(iMin);
                    c6330l.f20550r0 = 0;
                    c6330l.mo3047d(c20811m.f66092a, 0, iMin, false);
                    int i11 = c20811m.f66093b;
                    int i12 = c20811m.f66094c - 4;
                    while (true) {
                        if (i12 < i11) {
                            jM21106c2 = -9223372036854775807L;
                            break;
                        }
                        if (C20451v.m21105b(i12, c20811m.f66092a) == 442) {
                            c20811m.m21344F(i12 + 4);
                            jM21106c2 = C20451v.m21106c(c20811m);
                            if (jM21106c2 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i12--;
                    }
                    c20451v.f64905h = jM21106c2;
                    c20451v.f64903f = true;
                    i10 = 0;
                }
            } else {
                if (c20451v.f64905h == -9223372036854775807L) {
                    c20451v.m21107a((C6330l) interfaceC6334p);
                    return 0;
                }
                if (c20451v.f64902e) {
                    long j13 = c20451v.f64904g;
                    if (j13 == -9223372036854775807L) {
                        c20451v.m21107a((C6330l) interfaceC6334p);
                        return 0;
                    }
                    C20816r c20816r = c20451v.f64899b;
                    c20451v.f64906i = c20816r.m21382c(c20451v.f64905h) - c20816r.m21381b(j13);
                    c20451v.m21107a((C6330l) interfaceC6334p);
                    return 0;
                }
                C6330l c6330l2 = (C6330l) interfaceC6334p;
                int iMin2 = (int) Math.min(20000L, c6330l2.f20547o0);
                long j14 = 0;
                if (c6330l2.f20548p0 != j14) {
                    c6337s.f20561a = j14;
                } else {
                    c20811m.m21341C(iMin2);
                    c6330l2.f20550r0 = 0;
                    c6330l2.mo3047d(c20811m.f66092a, 0, iMin2, false);
                    int i13 = c20811m.f66093b;
                    int i14 = c20811m.f66094c;
                    while (true) {
                        if (i13 >= i14 - 3) {
                            jM21106c = -9223372036854775807L;
                            break;
                        }
                        if (C20451v.m21105b(i13, c20811m.f66092a) == 442) {
                            c20811m.m21344F(i13 + 4);
                            jM21106c = C20451v.m21106c(c20811m);
                            if (jM21106c != -9223372036854775807L) {
                                break;
                            }
                        }
                        i13++;
                    }
                    c20451v.f64904g = jM21106c;
                    c20451v.f64902e = true;
                    i10 = 0;
                }
            }
            return i10;
        }
        if (!this.f64924k) {
            this.f64924k = true;
            long j15 = c20451v.f64906i;
            if (j15 != -9223372036854775807L) {
                C2685e c2685e = new C2685e();
                C20816r c20816r2 = c20451v.f64899b;
                C11232c c11232c = new C11232c();
                c11232c.f33996Y = c20816r2;
                c11232c.f33997Z = new C20811m();
                C7553a c7553a = new C7553a(c2685e, c11232c, j15, j15 + 1, 0L, j10, 188L, 1000);
                this.f64922i = c7553a;
                this.f64923j.mo3045F((C6322d) c7553a.f20529c);
            } else {
                this.f64923j.mo3045F(new C6338t(j15));
            }
        }
        C7553a c7553a2 = this.f64922i;
        if (c7553a2 != null && ((C6323e) c7553a2.f20531e) != null) {
            return c7553a2.m6937v((C6330l) interfaceC6334p, c6337s);
        }
        C6330l c6330l3 = (C6330l) interfaceC6334p;
        c6330l3.f20550r0 = 0;
        long jMo3048e = j10 != -1 ? j10 - c6330l3.mo3048e() : -1L;
        if (jMo3048e != -1 && jMo3048e < 4) {
            return -1;
        }
        C20811m c20811m2 = this.f64916c;
        if (!c6330l3.mo3047d(c20811m2.f66092a, 0, 4, true)) {
            return -1;
        }
        c20811m2.m21344F(0);
        int iM21352g = c20811m2.m21352g();
        if (iM21352g == 441) {
            return -1;
        }
        if (iM21352g == 442) {
            c6330l3.mo3047d(c20811m2.f66092a, 0, 10, false);
            c20811m2.m21344F(9);
            c6330l3.mo3052j((c20811m2.m21365t() & 7) + 14);
            return 0;
        }
        if (iM21352g == 443) {
            c6330l3.mo3047d(c20811m2.f66092a, 0, 2, false);
            c20811m2.m21344F(0);
            c6330l3.mo3052j(c20811m2.m21371z() + 6);
            return 0;
        }
        if (((iM21352g & (-256)) >> 8) != 1) {
            c6330l3.mo3052j(1);
            return 0;
        }
        int i15 = iM21352g & 255;
        SparseArray sparseArray = this.f64915b;
        C20452w c20452w = (C20452w) sparseArray.get(i15);
        if (!this.f64918e) {
            if (c20452w == null) {
                if (i15 == 189) {
                    c20437h = new C20430a();
                    this.f64919f = true;
                    this.f64921h = c6330l3.f20548p0;
                } else if ((iM21352g & 224) == 192) {
                    c20437h = new C20447r(null, 0);
                    this.f64919f = true;
                    this.f64921h = c6330l3.f20548p0;
                } else if ((iM21352g & 240) == 224) {
                    c20437h = new C20437h(null);
                    this.f64920g = true;
                    this.f64921h = c6330l3.f20548p0;
                } else {
                    c20437h = null;
                }
                if (c20437h != null) {
                    c20437h.mo21090d(this.f64923j, new C13458b(i15, 256));
                    c20452w = new C20452w(c20437h, this.f64914a);
                    sparseArray.put(i15, c20452w);
                }
            }
            if (c6330l3.f20548p0 > ((this.f64919f && this.f64920g) ? this.f64921h + 8192 : 1048576L)) {
                this.f64918e = true;
                this.f64923j.mo3061s();
            }
        }
        c6330l3.mo3047d(c20811m2.f66092a, 0, 2, false);
        c20811m2.m21344F(0);
        int iM21371z = c20811m2.m21371z() + 6;
        if (c20452w == null) {
            c6330l3.mo3052j(iM21371z);
        } else {
            c20811m2.m21341C(iM21371z);
            c6330l3.mo3046b(c20811m2.f66092a, 0, iM21371z, false);
            c20811m2.m21344F(6);
            C6318J c6318j = c20452w.f64909c;
            c20811m2.m21350e(c6318j.f20467d, 0, 3);
            c6318j.m6880q(0);
            c6318j.m6883t(8);
            c20452w.f64910d = c6318j.m6871h();
            c20452w.f64911e = c6318j.m6871h();
            c6318j.m6883t(6);
            c20811m2.m21350e(c6318j.f20467d, 0, c6318j.m6872i(8));
            c6318j.m6880q(0);
            c20452w.f64913g = 0L;
            if (c20452w.f64910d) {
                c6318j.m6883t(4);
                long jM6872i = ((long) c6318j.m6872i(3)) << 30;
                c6318j.m6883t(1);
                long jM6872i2 = jM6872i | ((long) (c6318j.m6872i(15) << 15));
                c6318j.m6883t(1);
                long jM6872i3 = jM6872i2 | ((long) c6318j.m6872i(15));
                c6318j.m6883t(1);
                boolean z10 = c20452w.f64912f;
                C20816r c20816r3 = c20452w.f64908b;
                if (!z10 && c20452w.f64911e) {
                    c6318j.m6883t(4);
                    long jM6872i4 = ((long) c6318j.m6872i(3)) << 30;
                    c6318j.m6883t(1);
                    long jM6872i5 = jM6872i4 | ((long) (c6318j.m6872i(15) << 15));
                    c6318j.m6883t(1);
                    long jM6872i6 = jM6872i5 | ((long) c6318j.m6872i(15));
                    c6318j.m6883t(1);
                    c20816r3.m21381b(jM6872i6);
                    c20452w.f64912f = true;
                }
                c20452w.f64913g = c20816r3.m21381b(jM6872i3);
            }
            long j16 = c20452w.f64913g;
            InterfaceC20435f interfaceC20435f = c20452w.f64907a;
            interfaceC20435f.mo21092f(4, j16);
            interfaceC20435f.mo21088b(c20811m2);
            interfaceC20435f.mo21091e(false);
            c20811m2.m21343E(c20811m2.f66092a.length);
        }
        return 0;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: i */
    public final void mo6860i(InterfaceC6335q interfaceC6335q) {
        this.f64923j = interfaceC6335q;
    }

    @Override // p372P3.InterfaceC6333o
    public final void release() {
    }
}
