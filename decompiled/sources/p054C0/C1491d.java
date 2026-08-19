package p054C0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.AbstractC20740b0;
import p117Eb.C2392v;
import p204I1.C3577H;
import p204I1.C3578I;
import p204I1.C3582M;
import p204I1.C3590f;
import p204I1.C3599o;
import p328N1.InterfaceC5598n;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8242z0;
import p544W9.AbstractC8682o;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9160K3;
import p571X9.AbstractC9388w4;
import p909nm.C17689w;

/* JADX INFO: renamed from: C0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1491d {

    /* JADX INFO: renamed from: a */
    public C3590f f3920a;

    /* JADX INFO: renamed from: b */
    public C3582M f3921b;

    /* JADX INFO: renamed from: c */
    public InterfaceC5598n f3922c;

    /* JADX INFO: renamed from: d */
    public int f3923d;

    /* JADX INFO: renamed from: e */
    public boolean f3924e;

    /* JADX INFO: renamed from: f */
    public int f3925f;

    /* JADX INFO: renamed from: g */
    public int f3926g;

    /* JADX INFO: renamed from: h */
    public List f3927h;

    /* JADX INFO: renamed from: i */
    public C1489b f3928i;

    /* JADX INFO: renamed from: k */
    public InterfaceC7537b f3930k;

    /* JADX INFO: renamed from: l */
    public C2392v f3931l;

    /* JADX INFO: renamed from: m */
    public EnumC7546k f3932m;

    /* JADX INFO: renamed from: n */
    public C3578I f3933n;

    /* JADX INFO: renamed from: j */
    public long f3929j = AbstractC1488a.f3908a;

    /* JADX INFO: renamed from: o */
    public int f3934o = -1;

    /* JADX INFO: renamed from: p */
    public int f3935p = -1;

    public C1491d(C3590f c3590f, C3582M c3582m, InterfaceC5598n interfaceC5598n, int i10, boolean z6, int i11, int i12, List list) {
        this.f3920a = c3590f;
        this.f3921b = c3582m;
        this.f3922c = interfaceC5598n;
        this.f3923d = i10;
        this.f3924e = z6;
        this.f3925f = i11;
        this.f3926g = i12;
        this.f3927h = list;
    }

    /* JADX INFO: renamed from: a */
    public final int m2134a(int i10, EnumC7546k enumC7546k) {
        int i11 = this.f3934o;
        int i12 = this.f3935p;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int iM21275p = AbstractC20740b0.m21275p(m2135b(AbstractC9388w4.m9958a(0, i10, 0, Integer.MAX_VALUE), enumC7546k).f10962e);
        this.f3934o = i10;
        this.f3935p = iM21275p;
        return iM21275p;
    }

    /* JADX INFO: renamed from: b */
    public final C3599o m2135b(long j10, EnumC7546k enumC7546k) {
        C2392v c2392vM2137d = m2137d(enumC7546k);
        long jM8889b = AbstractC8242z0.m8889b(c2392vM2137d.mo3548e(), this.f3923d, j10, this.f3924e);
        boolean z6 = this.f3924e;
        int i10 = this.f3923d;
        int i11 = this.f3925f;
        int i12 = 1;
        if (z6 || !AbstractC9160K3.m9708a(i10, 2)) {
            if (i11 < 1) {
                i11 = 1;
            }
            i12 = i11;
        }
        return new C3599o(c2392vM2137d, jM8889b, i12, AbstractC9160K3.m9708a(this.f3923d, 2));
    }

    /* JADX INFO: renamed from: c */
    public final void m2136c(InterfaceC7537b interfaceC7537b) {
        long jM2132a;
        InterfaceC7537b interfaceC7537b2 = this.f3930k;
        if (interfaceC7537b != null) {
            int i10 = AbstractC1488a.f3909b;
            jM2132a = AbstractC1488a.m2132a(interfaceC7537b.getDensity(), interfaceC7537b.mo7863X());
        } else {
            jM2132a = AbstractC1488a.f3908a;
        }
        if (interfaceC7537b2 == null) {
            this.f3930k = interfaceC7537b;
            this.f3929j = jM2132a;
        } else if (interfaceC7537b == null || this.f3929j != jM2132a) {
            this.f3930k = interfaceC7537b;
            this.f3929j = jM2132a;
            this.f3931l = null;
            this.f3933n = null;
            this.f3935p = -1;
            this.f3934o = -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public final C2392v m2137d(EnumC7546k enumC7546k) {
        C2392v c2392v = this.f3931l;
        if (c2392v == null || enumC7546k != this.f3932m || c2392v.mo3544a()) {
            this.f3932m = enumC7546k;
            C3590f c3590f = this.f3920a;
            C3582M c3582mM9379b = AbstractC8682o.m9379b(this.f3921b, enumC7546k);
            InterfaceC7537b interfaceC7537b = this.f3930k;
            AbstractC16544l.m18091d(interfaceC7537b);
            InterfaceC5598n interfaceC5598n = this.f3922c;
            List list = this.f3927h;
            if (list == null) {
                list = C17689w.f56480Y;
            }
            c2392v = new C2392v(c3590f, c3582mM9379b, list, interfaceC7537b, interfaceC5598n);
        }
        this.f3931l = c2392v;
        return c2392v;
    }

    /* JADX INFO: renamed from: e */
    public final C3578I m2138e(EnumC7546k enumC7546k, long j10, C3599o c3599o) {
        float fMin = Math.min(c3599o.f10958a.mo3548e(), c3599o.f10961d);
        C3590f c3590f = this.f3920a;
        C3582M c3582m = this.f3921b;
        List list = this.f3927h;
        if (list == null) {
            list = C17689w.f56480Y;
        }
        int i10 = this.f3925f;
        boolean z6 = this.f3924e;
        int i11 = this.f3923d;
        InterfaceC7537b interfaceC7537b = this.f3930k;
        AbstractC16544l.m18091d(interfaceC7537b);
        return new C3578I(new C3577H(c3590f, c3582m, list, i10, z6, i11, interfaceC7537b, enumC7546k, this.f3922c, j10), c3599o, AbstractC9388w4.m9962e(j10, AbstractC9113C4.m9643a(AbstractC20740b0.m21275p(fMin), AbstractC20740b0.m21275p(c3599o.f10962e))));
    }
}
