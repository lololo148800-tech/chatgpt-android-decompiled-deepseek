package p977r0;

import java.util.List;
import p005A3.C0326m;
import p013Ab.C0420b;
import p153Fn.C2925c;
import p774h1.InterfaceC14324B;
import p953q0.C18558P;

/* JADX INFO: renamed from: r0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C18839k {

    /* JADX INFO: renamed from: a */
    public final C18852x f59960a;

    /* JADX INFO: renamed from: b */
    public final Object f59961b;

    /* JADX INFO: renamed from: c */
    public final C18834f f59962c;

    /* JADX INFO: renamed from: d */
    public final C18848t f59963d;

    /* JADX INFO: renamed from: e */
    public final long f59964e;

    /* JADX INFO: renamed from: f */
    public final boolean f59965f;

    /* JADX INFO: renamed from: g */
    public final C18558P f59966g;

    /* JADX INFO: renamed from: h */
    public final int f59967h;

    /* JADX INFO: renamed from: i */
    public final long f59968i;

    /* JADX INFO: renamed from: j */
    public final int f59969j;

    /* JADX INFO: renamed from: k */
    public final int f59970k;

    /* JADX INFO: renamed from: l */
    public final boolean f59971l;

    /* JADX INFO: renamed from: m */
    public final int f59972m;

    /* JADX INFO: renamed from: n */
    public final C2925c f59973n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC14324B f59974o;

    /* JADX INFO: renamed from: p */
    public final C0326m f59975p;

    /* JADX INFO: renamed from: q */
    public final C0420b f59976q;

    /* JADX INFO: renamed from: r */
    public final int f59977r;

    public C18839k(C18852x c18852x, List list, C18834f c18834f, C18848t c18848t, long j10, boolean z6, C18558P c18558p, int i10, long j11, int i11, int i12, boolean z10, int i13, C2925c c2925c, InterfaceC14324B interfaceC14324B) {
        this.f59960a = c18852x;
        this.f59961b = list;
        this.f59962c = c18834f;
        this.f59963d = c18848t;
        this.f59964e = j10;
        this.f59965f = z6;
        this.f59966g = c18558p;
        this.f59967h = i10;
        this.f59968i = j11;
        this.f59969j = i11;
        this.f59970k = i12;
        this.f59971l = z10;
        this.f59972m = i13;
        this.f59973n = c2925c;
        this.f59974o = interfaceC14324B;
        C0326m c0326m = new C0326m();
        c0326m.f1143e = this;
        c0326m.f1139a = z6;
        c0326m.f1140b = c18834f;
        c0326m.f1141c = c18558p;
        c0326m.f1142d = c18848t;
        this.f59975p = c0326m;
        this.f59976q = c18852x.f60044c;
        this.f59977r = c18848t.f60030b.length;
    }

    /* JADX INFO: renamed from: a */
    public final long m20146a(C18834f c18834f, int i10, int i11) {
        boolean zM16555f = c18834f.f59941b.f59939c.m16555f(i10);
        int i12 = zM16555f ? this.f59977r : 1;
        if (zM16555f) {
            i11 = 0;
        }
        return (((long) (i12 + i11)) & 4294967295L) | (((long) i11) << 32);
    }
}
