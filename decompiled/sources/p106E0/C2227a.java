package p106E0;

import com.google.protobuf.AbstractC12107L1;
import p037B9.MeDP.MpoABj;
import p228J.AbstractC3794B0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p774h1.C14365u;

/* JADX INFO: renamed from: E0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2227a {

    /* JADX INFO: renamed from: a */
    public final C6002f0 f6815a;

    /* JADX INFO: renamed from: b */
    public final C6002f0 f6816b;

    /* JADX INFO: renamed from: c */
    public final C6002f0 f6817c;

    /* JADX INFO: renamed from: d */
    public final C6002f0 f6818d;

    /* JADX INFO: renamed from: e */
    public final C6002f0 f6819e;

    /* JADX INFO: renamed from: f */
    public final C6002f0 f6820f;

    /* JADX INFO: renamed from: g */
    public final C6002f0 f6821g;

    /* JADX INFO: renamed from: h */
    public final C6002f0 f6822h;

    /* JADX INFO: renamed from: i */
    public final C6002f0 f6823i;

    /* JADX INFO: renamed from: j */
    public final C6002f0 f6824j;

    /* JADX INFO: renamed from: k */
    public final C6002f0 f6825k;

    /* JADX INFO: renamed from: l */
    public final C6002f0 f6826l;

    /* JADX INFO: renamed from: m */
    public final C6002f0 f6827m;

    public C2227a(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        C14365u c14365u = new C14365u(j10);
        C5975S c5975s = C5975S.f19448r0;
        this.f6815a = C5997d.m6430Q(c14365u, c5975s);
        this.f6816b = C5997d.m6430Q(new C14365u(j11), c5975s);
        this.f6817c = C5997d.m6430Q(new C14365u(j12), c5975s);
        this.f6818d = C5997d.m6430Q(new C14365u(j13), c5975s);
        this.f6819e = C5997d.m6430Q(new C14365u(j14), c5975s);
        this.f6820f = C5997d.m6430Q(new C14365u(j15), c5975s);
        this.f6821g = C5997d.m6430Q(new C14365u(j16), c5975s);
        this.f6822h = C5997d.m6430Q(new C14365u(j17), c5975s);
        this.f6823i = C5997d.m6430Q(new C14365u(j18), c5975s);
        this.f6824j = C5997d.m6430Q(new C14365u(j19), c5975s);
        this.f6825k = C5997d.m6430Q(new C14365u(j20), c5975s);
        this.f6826l = C5997d.m6430Q(new C14365u(j21), c5975s);
        this.f6827m = C5997d.m6430Q(Boolean.TRUE, c5975s);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Colors(primary=");
        AbstractC12107L1.m13828s(((C14365u) this.f6815a.getValue()).f45062a, ", primaryVariant=", sb2);
        AbstractC12107L1.m13828s(((C14365u) this.f6816b.getValue()).f45062a, ", secondary=", sb2);
        AbstractC12107L1.m13828s(((C14365u) this.f6817c.getValue()).f45062a, ", secondaryVariant=", sb2);
        AbstractC12107L1.m13828s(((C14365u) this.f6818d.getValue()).f45062a, MpoABj.yUYhvI, sb2);
        AbstractC12107L1.m13828s(((C14365u) this.f6819e.getValue()).f45062a, ", surface=", sb2);
        AbstractC12107L1.m13828s(((C14365u) this.f6820f.getValue()).f45062a, ", error=", sb2);
        AbstractC12107L1.m13828s(((C14365u) this.f6821g.getValue()).f45062a, ", onPrimary=", sb2);
        AbstractC12107L1.m13828s(((C14365u) this.f6822h.getValue()).f45062a, ", onSecondary=", sb2);
        AbstractC12107L1.m13828s(((C14365u) this.f6823i.getValue()).f45062a, ", onBackground=", sb2);
        AbstractC12107L1.m13828s(((C14365u) this.f6824j.getValue()).f45062a, ", onSurface=", sb2);
        AbstractC12107L1.m13828s(((C14365u) this.f6825k.getValue()).f45062a, ", onError=", sb2);
        AbstractC12107L1.m13828s(((C14365u) this.f6826l.getValue()).f45062a, ", isLight=", sb2);
        return AbstractC3794B0.m4499x(sb2, ((Boolean) this.f6827m.getValue()).booleanValue(), ')');
    }
}
