package p1074w4;

import java.math.RoundingMode;
import p1016t3.AbstractC19754D;
import p1016t3.C19755E;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20817s;
import p350O1.C6061j;
import p372P3.C6330l;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;

/* JADX INFO: renamed from: w4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C20820c implements InterfaceC20819b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6335q f66134a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6316H f66135b;

    /* JADX INFO: renamed from: c */
    public final C6061j f66136c;

    /* JADX INFO: renamed from: d */
    public final C19788o f66137d;

    /* JADX INFO: renamed from: e */
    public final int f66138e;

    /* JADX INFO: renamed from: f */
    public long f66139f;

    /* JADX INFO: renamed from: g */
    public int f66140g;

    /* JADX INFO: renamed from: h */
    public long f66141h;

    public C20820c(InterfaceC6335q interfaceC6335q, InterfaceC6316H interfaceC6316H, C6061j c6061j, String str, int i10) throws C19755E {
        this.f66134a = interfaceC6335q;
        this.f66135b = interfaceC6316H;
        this.f66136c = c6061j;
        int i11 = c6061j.f19747q0;
        int i12 = c6061j.f19744Z;
        int i13 = (i11 * i12) / 8;
        int i14 = c6061j.f19746p0;
        if (i14 != i13) {
            throw C19755E.m20712a(null, "Expected block size: " + i13 + "; got: " + i14);
        }
        int i15 = c6061j.f19745o0;
        int i16 = i15 * i13;
        int i17 = i16 * 8;
        int iMax = Math.max(i13, i16 / 10);
        this.f66138e = iMax;
        C19787n c19787n = new C19787n();
        c19787n.f62714l = AbstractC19754D.m20711i(str);
        c19787n.f62709g = i17;
        c19787n.f62710h = i17;
        c19787n.f62715m = iMax;
        c19787n.f62728z = i12;
        c19787n.f62694A = i15;
        c19787n.f62695B = i10;
        this.f66137d = new C19788o(c19787n);
    }

    @Override // p1074w4.InterfaceC20819b
    /* JADX INFO: renamed from: a */
    public final void mo21426a(long j10) {
        this.f66139f = j10;
        this.f66140g = 0;
        this.f66141h = 0L;
    }

    @Override // p1074w4.InterfaceC20819b
    /* JADX INFO: renamed from: b */
    public final void mo21427b(int i10, long j10) {
        this.f66134a.mo3045F(new C20822e(this.f66136c, 1, i10, j10));
        this.f66135b.mo4971d(this.f66137d);
    }

    @Override // p1074w4.InterfaceC20819b
    /* JADX INFO: renamed from: c */
    public final boolean mo21428c(C6330l c6330l, long j10) {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.f66140g) < (i11 = this.f66138e)) {
            int iMo4973f = this.f66135b.mo4973f(c6330l, (int) Math.min(i11 - i10, j11), true);
            if (iMo4973f == -1) {
                j11 = 0;
            } else {
                this.f66140g += iMo4973f;
                j11 -= (long) iMo4973f;
            }
        }
        C6061j c6061j = this.f66136c;
        int i12 = this.f66140g;
        int i13 = c6061j.f19746p0;
        int i14 = i12 / i13;
        if (i14 > 0) {
            long j12 = this.f66139f;
            long j13 = this.f66141h;
            long j14 = c6061j.f19745o0;
            int i15 = AbstractC20817s.f66106a;
            long jM21396J = j12 + AbstractC20817s.m21396J(j13, 1000000L, j14, RoundingMode.FLOOR);
            int i16 = i14 * i13;
            int i17 = this.f66140g - i16;
            this.f66135b.mo4968a(jM21396J, 1, i16, i17, null);
            this.f66141h += (long) i14;
            this.f66140g = i17;
        }
        return j11 <= 0;
    }
}
