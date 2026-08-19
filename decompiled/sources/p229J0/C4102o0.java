package p229J0;

import com.google.protobuf.AbstractC12107L1;
import p049Bm.InterfaceC1439n;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p492U1.C7540e;
import p586Y0.C9566r;
import p758g0.AbstractC13785r0;
import p758g0.C13756d;
import p758g0.C13774m;
import p894n0.C17396b;
import p894n0.C17398d;
import p894n0.C17402h;
import p894n0.C17409o;
import p894n0.InterfaceC17405k;
import p894n0.InterfaceC17406l;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: J0.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4102o0 {

    /* JADX INFO: renamed from: a */
    public final float f13155a;

    /* JADX INFO: renamed from: b */
    public final float f13156b;

    /* JADX INFO: renamed from: c */
    public final float f13157c;

    /* JADX INFO: renamed from: d */
    public final float f13158d;

    /* JADX INFO: renamed from: e */
    public final float f13159e;

    /* JADX INFO: renamed from: f */
    public final float f13160f;

    public C4102o0(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f13155a = f10;
        this.f13156b = f11;
        this.f13157c = f12;
        this.f13158d = f13;
        this.f13159e = f14;
        this.f13160f = f15;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
    /* JADX INFO: renamed from: a */
    public final InterfaceC5982V0 m4762a(boolean z6, InterfaceC17406l interfaceC17406l, C6021p c6021p, int i10) {
        float f10;
        Object objM6514H;
        C13756d c13756d;
        boolean zM6545h;
        Object objM6514H2;
        c6021p.m6524S(-1763481333);
        c6021p.m6524S(-734838460);
        Object obj = C6013l.f19514a;
        float f11 = this.f13155a;
        if (interfaceC17406l == null) {
            Object objM6514H3 = c6021p.m6514H();
            if (objM6514H3 == obj) {
                objM6514H3 = C5997d.m6430Q(new C7540e(f11), C5975S.f19448r0);
                c6021p.m6537c0(objM6514H3);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H3;
            c6021p.m6553p(false);
            c6021p.m6553p(false);
            return interfaceC5985X;
        }
        c6021p.m6553p(false);
        Object objM6514H4 = c6021p.m6514H();
        if (objM6514H4 == obj) {
            objM6514H4 = new C9566r();
            c6021p.m6537c0(objM6514H4);
        }
        C9566r c9566r = (C9566r) objM6514H4;
        boolean z10 = true;
        boolean z11 = (((i10 & 112) ^ 48) > 32 && c6021p.m6542f(interfaceC17406l)) || (i10 & 48) == 32;
        Object objM6514H5 = c6021p.m6514H();
        if (z11 || objM6514H5 == obj) {
            objM6514H5 = new C4090m0(interfaceC17406l, c9566r, null);
            c6021p.m6537c0(objM6514H5);
        }
        C5997d.m6450f((InterfaceC1439n) objM6514H5, c6021p, interfaceC17406l);
        InterfaceC17405k interfaceC17405k = (InterfaceC17405k) AbstractC17680n.m19353c0(c9566r);
        if (!z6) {
            f10 = this.f13160f;
        } else if (interfaceC17405k instanceof C17409o) {
            f10 = this.f13156b;
        } else if (interfaceC17405k instanceof C17402h) {
            f10 = this.f13158d;
        } else {
            if (!(interfaceC17405k instanceof C17398d)) {
                if (interfaceC17405k instanceof C17396b) {
                    f10 = this.f13159e;
                }
                objM6514H = c6021p.m6514H();
                if (objM6514H == obj) {
                    objM6514H = new C13756d(new C7540e(f11), AbstractC13785r0.f43530c, null, 12);
                    c6021p.m6537c0(objM6514H);
                }
                c13756d = (C13756d) objM6514H;
                C7540e c7540e = new C7540e(f11);
                boolean zM6545h2 = c6021p.m6545h(c13756d) | c6021p.m6536c(f11) | ((((i10 & 14) ^ 6) <= 4 && c6021p.m6544g(z6)) || (i10 & 6) == 4);
                if ((((i10 & 896) ^ 384) > 256 || !c6021p.m6542f(this)) && (i10 & 384) != 256) {
                }
                zM6545h = zM6545h2 | z10 | c6021p.m6545h(interfaceC17405k);
                objM6514H2 = c6021p.m6514H();
                if (zM6545h || objM6514H2 == obj) {
                    Object c4096n0 = new C4096n0(c13756d, f11, z6, this, interfaceC17405k, null);
                    c6021p.m6537c0(c4096n0);
                    objM6514H2 = c4096n0;
                }
                C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, c7540e);
                C13774m c13774m = c13756d.f43411c;
                c6021p.m6553p(false);
                return c13774m;
            }
            f10 = this.f13157c;
        }
        f11 = f10;
        objM6514H = c6021p.m6514H();
        if (objM6514H == obj) {
            objM6514H = new C13756d(new C7540e(f11), AbstractC13785r0.f43530c, null, 12);
            c6021p.m6537c0(objM6514H);
        }
        c13756d = (C13756d) objM6514H;
        C7540e c7540e2 = new C7540e(f11);
        boolean zM6545h3 = c6021p.m6545h(c13756d) | c6021p.m6536c(f11) | ((((i10 & 14) ^ 6) <= 4 && c6021p.m6544g(z6)) || (i10 & 6) == 4);
        z10 = ((i10 & 896) ^ 384) > 256 ? false : false;
        zM6545h = zM6545h3 | z10 | c6021p.m6545h(interfaceC17405k);
        objM6514H2 = c6021p.m6514H();
        if (zM6545h) {
            Object c4096n1 = new C4096n0(c13756d, f11, z6, this, interfaceC17405k, null);
            c6021p.m6537c0(c4096n1);
            objM6514H2 = c4096n1;
        } else {
            Object c4096n2 = new C4096n0(c13756d, f11, z6, this, interfaceC17405k, null);
            c6021p.m6537c0(c4096n2);
            objM6514H2 = c4096n2;
        }
        C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, c7540e2);
        C13774m c13774m2 = c13756d.f43411c;
        c6021p.m6553p(false);
        return c13774m2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4102o0)) {
            return false;
        }
        C4102o0 c4102o0 = (C4102o0) obj;
        return C7540e.m7873a(this.f13155a, c4102o0.f13155a) && C7540e.m7873a(this.f13156b, c4102o0.f13156b) && C7540e.m7873a(this.f13157c, c4102o0.f13157c) && C7540e.m7873a(this.f13158d, c4102o0.f13158d) && C7540e.m7873a(this.f13160f, c4102o0.f13160f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f13160f) + AbstractC12107L1.m13819j(this.f13158d, AbstractC12107L1.m13819j(this.f13157c, AbstractC12107L1.m13819j(this.f13156b, Float.floatToIntBits(this.f13155a) * 31, 31), 31), 31);
    }
}
