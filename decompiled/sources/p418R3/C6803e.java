package p418R3;

import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p372P3.C6309A;
import p372P3.C6311C;
import p372P3.InterfaceC6316H;

/* JADX INFO: renamed from: R3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6803e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6316H f21833a;

    /* JADX INFO: renamed from: b */
    public final int f21834b;

    /* JADX INFO: renamed from: c */
    public final int f21835c;

    /* JADX INFO: renamed from: d */
    public final long f21836d;

    /* JADX INFO: renamed from: e */
    public final int f21837e;

    /* JADX INFO: renamed from: f */
    public int f21838f;

    /* JADX INFO: renamed from: g */
    public int f21839g;

    /* JADX INFO: renamed from: h */
    public int f21840h;

    /* JADX INFO: renamed from: i */
    public int f21841i;

    /* JADX INFO: renamed from: j */
    public int f21842j;

    /* JADX INFO: renamed from: k */
    public long[] f21843k;

    /* JADX INFO: renamed from: l */
    public int[] f21844l;

    public C6803e(int i10, int i11, long j10, int i12, InterfaceC6316H interfaceC6316H) {
        boolean z6 = true;
        if (i11 != 1 && i11 != 2) {
            z6 = false;
        }
        AbstractC20800b.m21316d(z6);
        this.f21836d = j10;
        this.f21837e = i12;
        this.f21833a = interfaceC6316H;
        int i13 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f21834b = (i11 == 2 ? 1667497984 : 1651965952) | i13;
        this.f21835c = i11 == 2 ? i13 | 1650720768 : -1;
        this.f21843k = new long[512];
        this.f21844l = new int[512];
    }

    /* JADX INFO: renamed from: a */
    public final C6311C m7236a(int i10) {
        return new C6311C(((this.f21836d * ((long) 1)) / ((long) this.f21837e)) * ((long) this.f21844l[i10]), this.f21843k[i10]);
    }

    /* JADX INFO: renamed from: b */
    public final C6309A m7237b(long j10) {
        int i10 = (int) (j10 / ((this.f21836d * ((long) 1)) / ((long) this.f21837e)));
        int iM21403d = AbstractC20817s.m21403d(this.f21844l, i10, true, true);
        if (this.f21844l[iM21403d] == i10) {
            C6311C c6311cM7236a = m7236a(iM21403d);
            return new C6309A(c6311cM7236a, c6311cM7236a);
        }
        C6311C c6311cM7236a2 = m7236a(iM21403d);
        int i11 = iM21403d + 1;
        return i11 < this.f21843k.length ? new C6309A(c6311cM7236a2, m7236a(i11)) : new C6309A(c6311cM7236a2, c6311cM7236a2);
    }
}
