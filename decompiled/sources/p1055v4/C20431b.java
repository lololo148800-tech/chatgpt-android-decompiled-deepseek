package p1055v4;

import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import p1016t3.C19755E;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p372P3.C6318J;
import p372P3.C6329k;
import p372P3.C6330l;
import p372P3.C6337s;
import p372P3.C6338t;
import p372P3.InterfaceC6333o;
import p372P3.InterfaceC6334p;
import p372P3.InterfaceC6335q;
import p734ep.C13458b;

/* JADX INFO: renamed from: v4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C20431b implements InterfaceC6333o {

    /* JADX INFO: renamed from: d */
    public final C20811m f64647d;

    /* JADX INFO: renamed from: e */
    public final C6318J f64648e;

    /* JADX INFO: renamed from: f */
    public InterfaceC6335q f64649f;

    /* JADX INFO: renamed from: g */
    public long f64650g;

    /* JADX INFO: renamed from: j */
    public boolean f64653j;

    /* JADX INFO: renamed from: k */
    public boolean f64654k;

    /* JADX INFO: renamed from: l */
    public boolean f64655l;

    /* JADX INFO: renamed from: a */
    public final int f64644a = 0;

    /* JADX INFO: renamed from: b */
    public final C20432c f64645b = new C20432c(true, null, 0);

    /* JADX INFO: renamed from: c */
    public final C20811m f64646c = new C20811m(2048);

    /* JADX INFO: renamed from: i */
    public int f64652i = -1;

    /* JADX INFO: renamed from: h */
    public long f64651h = -1;

    public C20431b() {
        C20811m c20811m = new C20811m(10);
        this.f64647d = c20811m;
        byte[] bArr = c20811m.f66092a;
        this.f64648e = new C6318J(bArr.length, bArr);
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: a */
    public final InterfaceC6333o mo6855a() {
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final int m21093b(C6330l c6330l) throws EOFException, InterruptedIOException {
        int i10 = 0;
        while (true) {
            C20811m c20811m = this.f64647d;
            c6330l.mo3047d(c20811m.f66092a, 0, 10, false);
            c20811m.m21344F(0);
            if (c20811m.m21368w() != 4801587) {
                break;
            }
            c20811m.m21345G(3);
            int iM21364s = c20811m.m21364s();
            i10 += iM21364s + 10;
            c6330l.m6941g(iM21364s, false);
        }
        c6330l.f20550r0 = 0;
        c6330l.m6941g(i10, false);
        if (this.f64651h == -1) {
            this.f64651h = i10;
        }
        return i10;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: c */
    public final boolean mo6856c(InterfaceC6334p interfaceC6334p) throws EOFException, InterruptedIOException {
        C6330l c6330l = (C6330l) interfaceC6334p;
        int iM21093b = m21093b(c6330l);
        int i10 = iM21093b;
        int i11 = 0;
        int i12 = 0;
        do {
            C20811m c20811m = this.f64647d;
            c6330l.mo3047d(c20811m.f66092a, 0, 2, false);
            c20811m.m21344F(0);
            if ((c20811m.m21371z() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                c6330l.mo3047d(c20811m.f66092a, 0, 4, false);
                C6318J c6318j = this.f64648e;
                c6318j.m6880q(14);
                int iM6872i = c6318j.m6872i(13);
                if (iM6872i <= 6) {
                    i10++;
                    c6330l.f20550r0 = 0;
                    c6330l.m6941g(i10, false);
                } else {
                    c6330l.m6941g(iM6872i - 6, false);
                    i12 += iM6872i;
                }
            } else {
                i10++;
                c6330l.f20550r0 = 0;
                c6330l.m6941g(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iM21093b < 8192);
        return false;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: f */
    public final void mo6857f(long j10, long j11) {
        this.f64654k = false;
        this.f64645b.mo21089c();
        this.f64650g = j11;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: g */
    public final List mo6858g() {
        C11276A c11276a = AbstractC11278C.f34162Z;
        return C11294T.f34185q0;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: h */
    public final int mo6859h(InterfaceC6334p interfaceC6334p, C6337s c6337s) throws C19755E, EOFException, InterruptedIOException {
        int i10;
        AbstractC20800b.m21321i(this.f64649f);
        long j10 = ((C6330l) interfaceC6334p).f20547o0;
        int i11 = this.f64644a;
        int i12 = i11 & 2;
        int i13 = 0;
        boolean z6 = true;
        if (i12 == 0 && ((i11 & 1) == 0 || j10 == -1)) {
            i10 = -1;
        } else {
            C6318J c6318j = this.f64648e;
            C20811m c20811m = this.f64647d;
            if (this.f64653j) {
                i10 = -1;
            } else {
                this.f64652i = -1;
                C6330l c6330l = (C6330l) interfaceC6334p;
                c6330l.f20550r0 = 0;
                long j11 = 0;
                if (c6330l.f20548p0 == 0) {
                    m21093b(c6330l);
                }
                int i14 = 0;
                while (true) {
                    try {
                        C6330l c6330l2 = (C6330l) interfaceC6334p;
                        if (!c6330l2.mo3047d(c20811m.f66092a, i13, 2, z6)) {
                            break;
                        }
                        c20811m.m21344F(i13);
                        if (((c20811m.m21371z() & 65526) == 65520 ? z6 : i13) == 0) {
                            i14 = i13;
                            break;
                        }
                        if (!c6330l2.mo3047d(c20811m.f66092a, i13, 4, z6)) {
                            break;
                        }
                        c6318j.m6880q(14);
                        int iM6872i = c6318j.m6872i(13);
                        if (iM6872i <= 6) {
                            this.f64653j = z6;
                            throw C19755E.m20712a(null, "Malformed ADTS stream");
                        }
                        j11 += (long) iM6872i;
                        i14++;
                        if (i14 == 1000 || !c6330l2.m6941g(iM6872i - 6, true)) {
                            break;
                            break;
                        }
                        z6 = true;
                        i13 = 0;
                    } catch (EOFException unused) {
                    }
                }
                c6330l.f20550r0 = 0;
                if (i14 > 0) {
                    this.f64652i = (int) (j11 / ((long) i14));
                    i10 = -1;
                } else {
                    i10 = -1;
                    this.f64652i = -1;
                }
                this.f64653j = true;
            }
        }
        C20811m c20811m2 = this.f64646c;
        int i15 = ((C6330l) interfaceC6334p).read(c20811m2.f66092a, 0, 2048);
        boolean z10 = i15 == i10;
        boolean z11 = this.f64655l;
        C20432c c20432c = this.f64645b;
        if (!z11) {
            boolean z12 = (i11 & 1) != 0 && this.f64652i > 0;
            if (!z12 || c20432c.f64674r != -9223372036854775807L || z10) {
                if (z12) {
                    long j12 = c20432c.f64674r;
                    if (j12 != -9223372036854775807L) {
                        InterfaceC6335q interfaceC6335q = this.f64649f;
                        boolean z13 = i12 != 0;
                        int i16 = this.f64652i;
                        interfaceC6335q.mo3045F(new C6329k(j10, this.f64651h, (int) ((((long) i16) * 8000000) / j12), i16, z13));
                    } else {
                        this.f64649f.mo3045F(new C6338t(-9223372036854775807L));
                    }
                } else {
                    this.f64649f.mo3045F(new C6338t(-9223372036854775807L));
                }
                this.f64655l = true;
            }
        }
        if (z10) {
            return -1;
        }
        c20811m2.m21344F(0);
        c20811m2.m21343E(i15);
        if (!this.f64654k) {
            c20432c.f64676t = this.f64650g;
            this.f64654k = true;
        }
        c20432c.mo21088b(c20811m2);
        return 0;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: i */
    public final void mo6860i(InterfaceC6335q interfaceC6335q) {
        this.f64649f = interfaceC6335q;
        this.f64645b.mo21090d(interfaceC6335q, new C13458b(0, 1));
        interfaceC6335q.mo3061s();
    }

    @Override // p372P3.InterfaceC6333o
    public final void release() {
    }
}
