package p846k4;

import java.io.EOFException;
import java.io.IOException;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p372P3.C6330l;
import p372P3.InterfaceC6310B;

/* JADX INFO: renamed from: k4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C16333b implements InterfaceC16338g {

    /* JADX INFO: renamed from: Y */
    public final C16337f f50664Y;

    /* JADX INFO: renamed from: Z */
    public final long f50665Z;

    /* JADX INFO: renamed from: o0 */
    public final long f50666o0;

    /* JADX INFO: renamed from: p0 */
    public final AbstractC16341j f50667p0;

    /* JADX INFO: renamed from: q0 */
    public int f50668q0;

    /* JADX INFO: renamed from: r0 */
    public long f50669r0;

    /* JADX INFO: renamed from: s0 */
    public long f50670s0;

    /* JADX INFO: renamed from: t0 */
    public long f50671t0;

    /* JADX INFO: renamed from: u0 */
    public long f50672u0;

    /* JADX INFO: renamed from: v0 */
    public long f50673v0;

    /* JADX INFO: renamed from: w0 */
    public long f50674w0;

    /* JADX INFO: renamed from: x0 */
    public long f50675x0;

    public C16333b(AbstractC16341j abstractC16341j, long j10, long j11, long j12, long j13, boolean z6) {
        AbstractC20800b.m21316d(j10 >= 0 && j11 > j10);
        this.f50667p0 = abstractC16341j;
        this.f50665Z = j10;
        this.f50666o0 = j11;
        if (j12 == j11 - j10 || z6) {
            this.f50669r0 = j13;
            this.f50668q0 = 4;
        } else {
            this.f50668q0 = 0;
        }
        this.f50664Y = new C16337f();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // p846k4.InterfaceC16338g
    /* JADX INFO: renamed from: a */
    public final long mo2153a(C6330l c6330l) throws IOException {
        ?? r6;
        long jM21409j;
        long j10;
        int i10 = this.f50668q0;
        long j11 = this.f50666o0;
        C16337f c16337f = this.f50664Y;
        if (i10 == 0) {
            long j12 = c6330l.f20548p0;
            this.f50670s0 = j12;
            this.f50668q0 = 1;
            long j13 = j11 - 65307;
            if (j13 > j12) {
                return j13;
            }
            r6 = 0;
        } else if (i10 != 1) {
            if (i10 == 2) {
                long j14 = this.f50672u0;
                long j15 = this.f50673v0;
                if (j14 == j15) {
                    c16337f = c16337f;
                    j10 = -1;
                    jM21409j = -1;
                } else {
                    long j16 = c6330l.f20548p0;
                    if (c16337f.m17933b(c6330l, j15)) {
                        c16337f.m17932a(c6330l, false);
                        c6330l.f20550r0 = 0;
                        long j17 = this.f50671t0;
                        long j18 = c16337f.f50688b;
                        long j19 = j17 - j18;
                        int i11 = c16337f.f50690d + c16337f.f50691e;
                        if (0 > j19 || j19 >= 72000) {
                            if (j19 < 0) {
                                this.f50673v0 = j16;
                                this.f50675x0 = j18;
                            } else {
                                this.f50672u0 = c6330l.f20548p0 + ((long) i11);
                                this.f50674w0 = j18;
                            }
                            long j20 = this.f50673v0;
                            long j21 = this.f50672u0;
                            if (j20 - j21 < 100000) {
                                this.f50673v0 = j21;
                                jM21409j = j21;
                            } else {
                                jM21409j = AbstractC20817s.m21409j((((j20 - j21) * j19) / (this.f50675x0 - this.f50674w0)) + (c6330l.f20548p0 - (((long) i11) * (j19 <= 0 ? 2L : 1L))), j21, j20 - 1);
                            }
                            j10 = -1;
                        } else {
                            c16337f = c16337f;
                            j10 = -1;
                            jM21409j = -1;
                        }
                    } else {
                        long j22 = this.f50672u0;
                        if (j22 == j16) {
                            throw new IOException("No ogg page can be found.");
                        }
                        jM21409j = j22;
                    }
                    j10 = -1;
                }
                if (jM21409j != j10) {
                    return jM21409j;
                }
                this.f50668q0 = 3;
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j10 = -1;
                c16337f = c16337f;
            }
            C16337f c16337f2 = c16337f;
            while (true) {
                c16337f2.m17933b(c6330l, j10);
                c16337f2.m17932a(c6330l, false);
                if (c16337f2.f50688b > this.f50671t0) {
                    c6330l.f20550r0 = 0;
                    this.f50668q0 = 4;
                    return -(this.f50674w0 + 2);
                }
                c6330l.mo3052j(c16337f2.f50690d + c16337f2.f50691e);
                this.f50672u0 = c6330l.f20548p0;
                this.f50674w0 = c16337f2.f50688b;
                j10 = -1;
            }
        } else {
            r6 = 0;
        }
        c16337f.f50687a = r6;
        c16337f.f50688b = 0L;
        c16337f.f50689c = r6;
        c16337f.f50690d = r6;
        c16337f.f50691e = r6;
        if (!c16337f.m17933b(c6330l, -1L)) {
            throw new EOFException();
        }
        c16337f.m17932a(c6330l, r6);
        c6330l.mo3052j(c16337f.f50690d + c16337f.f50691e);
        long j23 = c16337f.f50688b;
        while ((c16337f.f50687a & 4) != 4 && c16337f.m17933b(c6330l, -1L) && c6330l.f20548p0 < j11 && c16337f.m17932a(c6330l, true)) {
            try {
                c6330l.mo3052j(c16337f.f50690d + c16337f.f50691e);
                j23 = c16337f.f50688b;
            } catch (EOFException unused) {
            }
        }
        this.f50669r0 = j23;
        this.f50668q0 = 4;
        return this.f50670s0;
    }

    @Override // p846k4.InterfaceC16338g
    /* JADX INFO: renamed from: c */
    public final InterfaceC6310B mo2154c() {
        if (this.f50669r0 != 0) {
            return new C16332a(this);
        }
        return null;
    }

    @Override // p846k4.InterfaceC16338g
    /* JADX INFO: renamed from: e */
    public final void mo2156e(long j10) {
        this.f50671t0 = AbstractC20817s.m21409j(j10, 0L, this.f50669r0 - 1);
        this.f50668q0 = 2;
        this.f50672u0 = this.f50665Z;
        this.f50673v0 = this.f50666o0;
        this.f50674w0 = 0L;
        this.f50675x0 = this.f50669r0;
    }
}
