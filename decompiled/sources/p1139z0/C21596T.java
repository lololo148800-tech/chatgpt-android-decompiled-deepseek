package p1139z0;

import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p025An.C0644w;
import p204I1.C3581L;
import p349O0.C5960K;
import p349O0.InterfaceC5959J0;
import p492U1.C7536a;
import p544W9.AbstractC8676n;

/* JADX INFO: renamed from: z0.T */
/* JADX INFO: loaded from: classes.dex */
public final class C21596T implements InterfaceC5959J0 {

    /* JADX INFO: renamed from: Z */
    public static final C21596T f68403Z = new C21596T(0);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68404Y;

    public /* synthetic */ C21596T(int i10) {
        this.f68404Y = i10;
    }

    /* JADX INFO: renamed from: b */
    public static long m21943b(long j10, C5960K c5960k, C21595S c21595s) {
        int i10 = C3581L.f10907c;
        long jM6395a = c5960k.m6395a((int) (j10 >> 32), true);
        long jM6395a2 = C3581L.m4267c(j10) ? jM6395a : c5960k.m6395a((int) (j10 & 4294967295L), true);
        int iMin = Math.min(C3581L.m4270f(jM6395a), C3581L.m4270f(jM6395a2));
        int iMax = Math.max(C3581L.m4269e(jM6395a), C3581L.m4269e(jM6395a2));
        long jM9365b = C3581L.m4271g(j10) ? AbstractC8676n.m9365b(iMax, iMin) : AbstractC8676n.m9365b(iMin, iMax);
        if (!C3581L.m4267c(j10) || C3581L.m4267c(jM9365b)) {
            return jM9365b;
        }
        int i11 = c21595s != null ? c21595s.f68401a : 0;
        int i12 = i11 == 0 ? -1 : AbstractC21576B0.f68323a[AbstractC0010F.m24h(i11)];
        if (i12 == -1) {
            return jM9365b;
        }
        if (i12 == 1) {
            int i13 = (int) (jM9365b >> 32);
            return AbstractC8676n.m9365b(i13, i13);
        }
        if (i12 != 2) {
            throw new C0644w();
        }
        int i14 = (int) (jM9365b & 4294967295L);
        return AbstractC8676n.m9365b(i14, i14);
    }

    @Override // p349O0.InterfaceC5959J0
    /* JADX INFO: renamed from: a */
    public boolean mo6393a(Object obj, Object obj2) {
        switch (this.f68404Y) {
            case 1:
                C21646v0 c21646v0 = (C21646v0) obj;
                C21646v0 c21646v1 = (C21646v0) obj2;
                if (c21646v0 == null || c21646v1 == null) {
                    if ((c21646v0 == null) ^ (c21646v1 == null)) {
                        return false;
                    }
                } else if (c21646v0.f68594e != c21646v1.f68594e || c21646v0.f68595f != c21646v1.f68595f || c21646v0.f68591b != c21646v1.f68591b || !AbstractC16544l.m18089b(c21646v0.f68592c, c21646v1.f68592c) || !C7536a.m7848c(c21646v0.f68593d, c21646v1.f68593d)) {
                    return false;
                }
                return true;
            default:
                C21648w0 c21648w0 = (C21648w0) obj;
                C21648w0 c21648w1 = (C21648w0) obj2;
                if (c21648w0 == null || c21648w1 == null) {
                    if ((c21648w0 == null) ^ (c21648w1 == null)) {
                        return false;
                    }
                } else if (c21648w0.f68597a != c21648w1.f68597a || !AbstractC16544l.m18089b(c21648w0.f68598b, c21648w1.f68598b) || c21648w0.f68599c != c21648w1.f68599c || c21648w0.f68600d != c21648w1.f68600d) {
                    return false;
                }
                return true;
        }
    }

    public String toString() {
        switch (this.f68404Y) {
            case 0:
                return "SingleLineCodepointTransformation";
            default:
                return super.toString();
        }
    }
}
