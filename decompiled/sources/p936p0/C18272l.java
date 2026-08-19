package p936p0;

import java.util.List;
import java.util.Map;
import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21058L;
import p153Fn.C2925c;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9101A4;
import p860l0.EnumC16673F0;
import p909nm.AbstractC17680n;
import p953q0.C18546D;

/* JADX INFO: renamed from: p0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C18272l implements InterfaceC21058L {

    /* JADX INFO: renamed from: a */
    public final C18273m f58287a;

    /* JADX INFO: renamed from: b */
    public int f58288b;

    /* JADX INFO: renamed from: c */
    public boolean f58289c;

    /* JADX INFO: renamed from: d */
    public float f58290d;

    /* JADX INFO: renamed from: e */
    public final float f58291e;

    /* JADX INFO: renamed from: f */
    public final boolean f58292f;

    /* JADX INFO: renamed from: g */
    public final C2925c f58293g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC7537b f58294h;

    /* JADX INFO: renamed from: i */
    public final long f58295i;

    /* JADX INFO: renamed from: j */
    public final Object f58296j;

    /* JADX INFO: renamed from: k */
    public final int f58297k;

    /* JADX INFO: renamed from: l */
    public final int f58298l;

    /* JADX INFO: renamed from: m */
    public final int f58299m;

    /* JADX INFO: renamed from: n */
    public final EnumC16673F0 f58300n;

    /* JADX INFO: renamed from: o */
    public final int f58301o;

    /* JADX INFO: renamed from: p */
    public final int f58302p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC21058L f58303q;

    public C18272l(C18273m c18273m, int i10, boolean z6, float f10, InterfaceC21058L interfaceC21058L, float f11, boolean z10, C2925c c2925c, InterfaceC7537b interfaceC7537b, long j10, List list, int i11, int i12, int i13, EnumC16673F0 enumC16673F0, int i14, int i15) {
        this.f58287a = c18273m;
        this.f58288b = i10;
        this.f58289c = z6;
        this.f58290d = f10;
        this.f58291e = f11;
        this.f58292f = z10;
        this.f58293g = c2925c;
        this.f58294h = interfaceC7537b;
        this.f58295i = j10;
        this.f58296j = list;
        this.f58297k = i11;
        this.f58298l = i12;
        this.f58299m = i13;
        this.f58300n = enumC16673F0;
        this.f58301o = i14;
        this.f58302p = i15;
        this.f58303q = interfaceC21058L;
    }

    @Override // p1095x1.InterfaceC21058L
    /* JADX INFO: renamed from: a */
    public final Map mo19805a() {
        return this.f58303q.mo19805a();
    }

    @Override // p1095x1.InterfaceC21058L
    /* JADX INFO: renamed from: b */
    public final void mo19806b() {
        this.f58303q.mo19806b();
    }

    @Override // p1095x1.InterfaceC21058L
    /* JADX INFO: renamed from: c */
    public final InterfaceC1436k mo19807c() {
        return this.f58303q.mo19807c();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: d */
    public final boolean m19808d(int i10, boolean z6) {
        C18273m c18273m;
        int i11;
        boolean z10;
        if (this.f58292f) {
            return false;
        }
        ?? r6 = this.f58296j;
        if (r6.isEmpty() || (c18273m = this.f58287a) == null || (i11 = this.f58288b - i10) < 0 || i11 >= c18273m.f58321r) {
            return false;
        }
        C18273m c18273m2 = (C18273m) AbstractC17680n.m19341Q(r6);
        C18273m c18273m3 = (C18273m) AbstractC17680n.m19351a0(r6);
        if (c18273m2.f58323t || c18273m3.f58323t) {
            return false;
        }
        int i12 = this.f58298l;
        int i13 = this.f58297k;
        if (i10 < 0) {
            if (Math.min((c18273m2.f58319p + c18273m2.f58321r) - i13, (c18273m3.f58319p + c18273m3.f58321r) - i12) <= (-i10)) {
                return false;
            }
        } else if (Math.min(i13 - c18273m2.f58319p, i12 - c18273m3.f58319p) <= i10) {
            return false;
        }
        this.f58288b -= i10;
        int size = r6.size();
        for (int i14 = 0; i14 < size; i14++) {
            C18273m c18273m4 = (C18273m) r6.get(i14);
            if (!c18273m4.f58323t) {
                c18273m4.f58319p += i10;
                int[] iArr = c18273m4.f58327x;
                int length = iArr.length;
                int i15 = 0;
                while (true) {
                    z10 = c18273m4.f58306c;
                    if (i15 >= length) {
                        break;
                    }
                    if ((z10 && i15 % 2 == 1) || (!z10 && i15 % 2 == 0)) {
                        iArr[i15] = iArr[i15] + i10;
                    }
                    i15++;
                }
                if (z6) {
                    int size2 = c18273m4.f58305b.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        C18546D c18546dM11264a = c18273m4.f58317n.m11264a(i16, c18273m4.f58315l);
                        if (c18546dM11264a != null) {
                            long j10 = c18546dM11264a.f59092l;
                            c18546dM11264a.f59092l = AbstractC9101A4.m9631a(z10 ? (int) (j10 >> 32) : ((int) (j10 >> 32)) + i10, z10 ? ((int) (j10 & 4294967295L)) + i10 : (int) (j10 & 4294967295L));
                        }
                    }
                }
            }
        }
        this.f58290d = i10;
        if (!this.f58289c && i10 > 0) {
            this.f58289c = true;
        }
        return true;
    }

    @Override // p1095x1.InterfaceC21058L
    public final int getHeight() {
        return this.f58303q.getHeight();
    }

    @Override // p1095x1.InterfaceC21058L
    public final int getWidth() {
        return this.f58303q.getWidth();
    }
}
