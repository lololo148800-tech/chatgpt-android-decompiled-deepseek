package p1055v4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import fo.C13711h;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import p013Ab.C0420b;
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
import p523V9.AbstractC8025X4;
import p658b5.C11241l;
import p784hb.C14438g;
import p885m4.InterfaceC17161k;

/* JADX INFO: renamed from: v4.A */
/* JADX INFO: loaded from: classes.dex */
public final class C20427A implements InterfaceC6333o {

    /* JADX INFO: renamed from: a */
    public final int f64611a;

    /* JADX INFO: renamed from: b */
    public final List f64612b;

    /* JADX INFO: renamed from: c */
    public final C20811m f64613c = new C20811m(0, new byte[9400]);

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f64614d;

    /* JADX INFO: renamed from: e */
    public final C14438g f64615e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17161k f64616f;

    /* JADX INFO: renamed from: g */
    public final SparseArray f64617g;

    /* JADX INFO: renamed from: h */
    public final SparseBooleanArray f64618h;

    /* JADX INFO: renamed from: i */
    public final SparseBooleanArray f64619i;

    /* JADX INFO: renamed from: j */
    public final C20451v f64620j;

    /* JADX INFO: renamed from: k */
    public C7553a f64621k;

    /* JADX INFO: renamed from: l */
    public InterfaceC6335q f64622l;

    /* JADX INFO: renamed from: m */
    public int f64623m;

    /* JADX INFO: renamed from: n */
    public boolean f64624n;

    /* JADX INFO: renamed from: o */
    public boolean f64625o;

    /* JADX INFO: renamed from: p */
    public boolean f64626p;

    /* JADX INFO: renamed from: q */
    public int f64627q;

    public C20427A(int i10, InterfaceC17161k interfaceC17161k, C20816r c20816r, C14438g c14438g) {
        this.f64615e = c14438g;
        this.f64611a = i10;
        this.f64616f = interfaceC17161k;
        this.f64612b = Collections.singletonList(c20816r);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f64618h = sparseBooleanArray;
        this.f64619i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f64617g = sparseArray;
        this.f64614d = new SparseIntArray();
        this.f64620j = new C20451v(1);
        this.f64622l = InterfaceC6335q.f20560e0;
        this.f64627q = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (InterfaceC20429C) sparseArray2.valueAt(i11));
        }
        C11241l c11241l = new C11241l();
        c11241l.f34017Z = this;
        c11241l.f34016Y = new C6318J(4, new byte[4]);
        sparseArray.put(0, new C20455z(c11241l));
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: a */
    public final InterfaceC6333o mo6855a() {
        return this;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: c */
    public final boolean mo6856c(InterfaceC6334p interfaceC6334p) {
        byte[] bArr = this.f64613c.f66092a;
        C6330l c6330l = (C6330l) interfaceC6334p;
        c6330l.mo3047d(bArr, 0, 940, false);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    c6330l.mo3052j(i10);
                    return true;
                }
                if (bArr[(i11 * 188) + i10] != 71) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: f */
    public final void mo6857f(long j10, long j11) {
        C7553a c7553a;
        List list = this.f64612b;
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C20816r c20816r = (C20816r) list.get(i11);
            boolean z6 = c20816r.m21384e() == -9223372036854775807L;
            if (!z6) {
                long jM21383d = c20816r.m21383d();
                z6 = (jM21383d == -9223372036854775807L || jM21383d == 0 || jM21383d == j11) ? false : true;
            }
            if (z6) {
                c20816r.m21386g(j11);
            }
        }
        if (j11 != 0 && (c7553a = this.f64621k) != null) {
            c7553a.m6911C(j11);
        }
        this.f64613c.m21341C(0);
        this.f64614d.clear();
        while (true) {
            SparseArray sparseArray = this.f64617g;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((InterfaceC20429C) sparseArray.valueAt(i10)).mo21084c();
            i10++;
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: g */
    public final List mo6858g() {
        C11276A c11276a = AbstractC11278C.f34162Z;
        return C11294T.f34185q0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [v4.u] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [v4.C] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: h */
    public final int mo6859h(InterfaceC6334p interfaceC6334p, C6337s c6337s) throws EOFException, InterruptedIOException {
        ?? r6;
        ?? r10;
        ?? r11;
        InterfaceC20429C interfaceC20429C;
        boolean z6;
        long j10;
        long j11;
        long j12 = ((C6330l) interfaceC6334p).f20547o0;
        if (this.f64624n) {
            C20451v c20451v = this.f64620j;
            if (j12 != -1 && !c20451v.f64901d) {
                int i10 = this.f64627q;
                if (i10 <= 0) {
                    c20451v.m21107a((C6330l) interfaceC6334p);
                    return 0;
                }
                boolean z10 = c20451v.f64903f;
                C20811m c20811m = c20451v.f64900c;
                if (!z10) {
                    C6330l c6330l = (C6330l) interfaceC6334p;
                    long j13 = c6330l.f20547o0;
                    int iMin = (int) Math.min(112800, j13);
                    long j14 = j13 - ((long) iMin);
                    if (c6330l.f20548p0 == j14) {
                        c20811m.m21341C(iMin);
                        c6330l.f20550r0 = 0;
                        c6330l.mo3047d(c20811m.f66092a, 0, iMin, false);
                        int i11 = c20811m.f66093b;
                        int i12 = c20811m.f66094c;
                        for (int i13 = i12 - 188; i13 >= i11; i13--) {
                            byte[] bArr = c20811m.f66092a;
                            int i14 = 0;
                            for (int i15 = -4; i15 <= 4; i15++) {
                                int i16 = (i15 * 188) + i13;
                                if (i16 < i11 || i16 >= i12 || bArr[i16] != 71) {
                                    i14 = 0;
                                } else {
                                    i14++;
                                    if (i14 == 5) {
                                        long jM8369d = AbstractC8025X4.m8369d(c20811m, i13, i10);
                                        if (jM8369d == -9223372036854775807L) {
                                            break;
                                        }
                                        j11 = jM8369d;
                                        c20451v.f64905h = j11;
                                        c20451v.f64903f = true;
                                        return 0;
                                    }
                                }
                            }
                        }
                        j11 = -9223372036854775807L;
                        c20451v.f64905h = j11;
                        c20451v.f64903f = true;
                        return 0;
                    }
                    c6337s.f20561a = j14;
                } else {
                    if (c20451v.f64905h == -9223372036854775807L) {
                        c20451v.m21107a((C6330l) interfaceC6334p);
                        return 0;
                    }
                    if (c20451v.f64902e) {
                        long j15 = c20451v.f64904g;
                        if (j15 == -9223372036854775807L) {
                            c20451v.m21107a((C6330l) interfaceC6334p);
                            return 0;
                        }
                        C20816r c20816r = c20451v.f64899b;
                        c20451v.f64906i = c20816r.m21382c(c20451v.f64905h) - c20816r.m21381b(j15);
                        c20451v.m21107a((C6330l) interfaceC6334p);
                        return 0;
                    }
                    C6330l c6330l2 = (C6330l) interfaceC6334p;
                    int iMin2 = (int) Math.min(112800, c6330l2.f20547o0);
                    long j16 = 0;
                    if (c6330l2.f20548p0 == j16) {
                        c20811m.m21341C(iMin2);
                        c6330l2.f20550r0 = 0;
                        c6330l2.mo3047d(c20811m.f66092a, 0, iMin2, false);
                        int i17 = c20811m.f66094c;
                        for (int i18 = c20811m.f66093b; i18 < i17; i18++) {
                            if (c20811m.f66092a[i18] == 71) {
                                long jM8369d2 = AbstractC8025X4.m8369d(c20811m, i18, i10);
                                if (jM8369d2 != -9223372036854775807L) {
                                    j10 = jM8369d2;
                                    c20451v.f64904g = j10;
                                    c20451v.f64902e = true;
                                    return 0;
                                }
                            }
                        }
                        j10 = -9223372036854775807L;
                        c20451v.f64904g = j10;
                        c20451v.f64902e = true;
                        return 0;
                    }
                    c6337s.f20561a = j16;
                }
                return 1;
            }
            if (!this.f64625o) {
                this.f64625o = true;
                long j17 = c20451v.f64906i;
                if (j17 != -9223372036854775807L) {
                    C7553a c7553a = new C7553a(new C2685e(), new C0420b(this.f64627q, c20451v.f64899b), j17, j17 + 1, 0L, j12, 188L, 940);
                    this.f64621k = c7553a;
                    this.f64622l.mo3045F((C6322d) c7553a.f20529c);
                } else {
                    this.f64622l.mo3045F(new C6338t(j17));
                }
            }
            if (this.f64626p) {
                z6 = false;
                this.f64626p = false;
                mo6857f(0L, 0L);
                if (((C6330l) interfaceC6334p).f20548p0 != 0) {
                    c6337s.f20561a = 0L;
                    return 1;
                }
            } else {
                z6 = false;
            }
            r6 = 1;
            r6 = 1;
            C7553a c7553a2 = this.f64621k;
            r10 = z6;
            if (c7553a2 != null && ((C6323e) c7553a2.f20531e) != null) {
                r10 = z6;
                return c7553a2.m6937v((C6330l) interfaceC6334p, c6337s);
            }
        } else {
            r6 = 1;
            r10 = 0;
            j12 = j12;
        }
        r10 = z6;
        C20811m c20811m2 = this.f64613c;
        byte[] bArr2 = c20811m2.f66092a;
        if (9400 - c20811m2.f66093b < 188) {
            int iM21346a = c20811m2.m21346a();
            if (iM21346a > 0) {
                System.arraycopy(bArr2, c20811m2.f66093b, bArr2, r10, iM21346a);
            }
            c20811m2.m21342D(iM21346a, bArr2);
        }
        while (true) {
            int iM21346a2 = c20811m2.m21346a();
            ?? r12 = this.f64617g;
            if (iM21346a2 >= 188) {
                int i19 = c20811m2.f66093b;
                int i20 = c20811m2.f66094c;
                byte[] bArr3 = c20811m2.f66092a;
                while (i19 < i20 && bArr3[i19] != 71) {
                    i19++;
                }
                c20811m2.m21344F(i19);
                int i21 = i19 + 188;
                int i22 = c20811m2.f66094c;
                if (i21 > i22) {
                    return r10;
                }
                int iM21352g = c20811m2.m21352g();
                if ((8388608 & iM21352g) != 0) {
                    c20811m2.m21344F(i21);
                    return r10;
                }
                ?? r13 = (4194304 & iM21352g) != 0 ? r6 : r10;
                int i23 = (2096896 & iM21352g) >> 8;
                ?? r14 = (iM21352g & 32) != 0 ? r6 : r10;
                if ((iM21352g & 16) != 0) {
                    interfaceC20429C = (InterfaceC20429C) r12.get(i23);
                } else {
                    r11 = 0;
                }
                if (r11 == 0) {
                    r11 = interfaceC20429C;
                    c20811m2.m21344F(i21);
                    return r10;
                }
                int i24 = iM21352g & 15;
                SparseIntArray sparseIntArray = this.f64614d;
                int i25 = sparseIntArray.get(i23, i24 - 1);
                sparseIntArray.put(i23, i24);
                if (i25 == i24) {
                    r11 = interfaceC20429C;
                    c20811m2.m21344F(i21);
                    return r10;
                }
                if (i24 != ((i25 + r6) & 15)) {
                    r11 = interfaceC20429C;
                    r11.mo21084c();
                }
                if (r14 != 0) {
                    int iM21365t = c20811m2.m21365t();
                    r13 = (r13 == true ? 1 : 0) | ((c20811m2.m21365t() & 64) != 0 ? 2 : r10);
                    c20811m2.m21345G(iM21365t - r6);
                }
                boolean z11 = this.f64624n;
                if (z11 || !this.f64619i.get(i23, r10)) {
                    c20811m2.m21343E(i21);
                    r11.mo21083a(r13, c20811m2);
                    c20811m2.m21343E(i22);
                }
                if (!z11 && this.f64624n && j12 != -1) {
                    this.f64626p = r6;
                }
                c20811m2.m21344F(i21);
                return r10;
            }
            int i26 = c20811m2.f66094c;
            int i27 = ((C6330l) interfaceC6334p).read(bArr2, i26, 9400 - i26);
            if (i27 == -1) {
                for (?? r15 = r10; r15 < r12.size(); r15++) {
                    InterfaceC20429C interfaceC20429C2 = (InterfaceC20429C) r12.valueAt(r15);
                    if (interfaceC20429C2 instanceof C20450u) {
                        ?? r16 = (C20450u) interfaceC20429C2;
                        if (r16.f64888c == 3 && r16.f64895j == -1) {
                            r16.mo21083a(r6, new C20811m());
                        }
                    }
                }
                return -1;
            }
            c20811m2.m21343E(i26 + i27);
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: i */
    public final void mo6860i(InterfaceC6335q interfaceC6335q) {
        if ((this.f64611a & 1) == 0) {
            interfaceC6335q = new C13711h(interfaceC6335q, this.f64616f);
        }
        this.f64622l = interfaceC6335q;
    }

    @Override // p372P3.InterfaceC6333o
    public final void release() {
    }
}
