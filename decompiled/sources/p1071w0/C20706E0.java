package p1071w0;

import p1139z0.C21585H;
import p204I1.C3581L;
import p349O0.C5975S;
import p349O0.C5994b0;
import p349O0.C5997d;
import p349O0.C6002f0;
import p530Vi.AbstractC8301I;
import p594Y9.AbstractC9828W3;
import p759g1.C13801c;
import p860l0.EnumC16673F0;

/* JADX INFO: renamed from: w0.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20706E0 {

    /* JADX INFO: renamed from: f */
    public static final C21585H f65618f = AbstractC9828W3.m10471b(C20704D0.f65598Y, C20745e.f65756A0);

    /* JADX INFO: renamed from: a */
    public final C5994b0 f65619a;

    /* JADX INFO: renamed from: b */
    public final C5994b0 f65620b = C5997d.m6428O(0.0f);

    /* JADX INFO: renamed from: c */
    public C13801c f65621c = C13801c.f43585e;

    /* JADX INFO: renamed from: d */
    public long f65622d = C3581L.f10906b;

    /* JADX INFO: renamed from: e */
    public final C6002f0 f65623e;

    public C20706E0(EnumC16673F0 enumC16673F0, float f10) {
        this.f65619a = C5997d.m6428O(f10);
        this.f65623e = C5997d.m6430Q(enumC16673F0, C5975S.f19448r0);
    }

    /* JADX INFO: renamed from: a */
    public final void m21214a(EnumC16673F0 enumC16673F0, C13801c c13801c, int i10, int i11) {
        float f10;
        float f11 = i11 - i10;
        this.f65620b.m6410h(f11);
        C13801c c13801c2 = this.f65621c;
        float f12 = c13801c2.f43586a;
        float f13 = c13801c.f43586a;
        C5994b0 c5994b0 = this.f65619a;
        float f14 = c13801c.f43587b;
        if (f13 != f12 || f14 != c13801c2.f43587b) {
            boolean z6 = enumC16673F0 == EnumC16673F0.f53401Y;
            if (z6) {
                f13 = f14;
            }
            float f15 = z6 ? c13801c.f43589d : c13801c.f43588c;
            float fM6409g = c5994b0.m6409g();
            float f16 = i10;
            float f17 = fM6409g + f16;
            if (f15 <= f17 && (f13 >= fM6409g || f15 - f13 <= f16)) {
                f10 = (f13 >= fM6409g || f15 - f13 > f16) ? 0.0f : f13 - fM6409g;
            } else {
                f10 = f15 - f17;
            }
            c5994b0.m6410h(c5994b0.m6409g() + f10);
            this.f65621c = c13801c;
        }
        c5994b0.m6410h(AbstractC8301I.m8920k(c5994b0.m6409g(), 0.0f, f11));
    }
}
