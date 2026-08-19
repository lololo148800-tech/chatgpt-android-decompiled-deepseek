package p655b2;

import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Arrays;
import p004A2.C0312c;
import p658b5.C11242m;
import p760g2.C13806c;

/* JADX INFO: renamed from: b2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11219c {

    /* JADX INFO: renamed from: p */
    public static boolean f33946p = false;

    /* JADX INFO: renamed from: q */
    public static int f33947q = 1000;

    /* JADX INFO: renamed from: c */
    public final C11220d f33950c;

    /* JADX INFO: renamed from: f */
    public C11218b[] f33953f;

    /* JADX INFO: renamed from: l */
    public final C11242m f33959l;

    /* JADX INFO: renamed from: o */
    public C11218b f33962o;

    /* JADX INFO: renamed from: a */
    public boolean f33948a = false;

    /* JADX INFO: renamed from: b */
    public int f33949b = 0;

    /* JADX INFO: renamed from: d */
    public int f33951d = 32;

    /* JADX INFO: renamed from: e */
    public int f33952e = 32;

    /* JADX INFO: renamed from: g */
    public boolean f33954g = false;

    /* JADX INFO: renamed from: h */
    public boolean[] f33955h = new boolean[32];

    /* JADX INFO: renamed from: i */
    public int f33956i = 1;

    /* JADX INFO: renamed from: j */
    public int f33957j = 0;

    /* JADX INFO: renamed from: k */
    public int f33958k = 32;

    /* JADX INFO: renamed from: m */
    public C11221e[] f33960m = new C11221e[f33947q];

    /* JADX INFO: renamed from: n */
    public int f33961n = 0;

    public C11219c() {
        this.f33953f = null;
        this.f33953f = new C11218b[32];
        m12474s();
        C11242m c11242m = new C11242m();
        c11242m.f34018Y = new C0312c();
        c11242m.f34019Z = new C0312c();
        c11242m.f34020o0 = new C11221e[32];
        this.f33959l = c11242m;
        C11220d c11220d = new C11220d(c11242m);
        c11220d.f33963f = new C11221e[128];
        c11220d.f33964g = new C11221e[128];
        c11220d.f33965h = 0;
        c11220d.f33966i = new C15384c(c11220d);
        this.f33950c = c11220d;
        this.f33962o = new C11218b(c11242m);
    }

    /* JADX INFO: renamed from: n */
    public static int m12456n(Object obj) {
        C11221e c11221e = ((C13806c) obj).f43628i;
        if (c11221e != null) {
            return (int) (c11221e.f33971q0 + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final C11221e m12457a(int i10) {
        C0312c c0312c = (C0312c) this.f33959l.f34019Z;
        int i11 = c0312c.f1085b;
        Object obj = null;
        if (i11 > 0) {
            int i12 = i11 - 1;
            Object[] objArr = c0312c.f1084a;
            Object obj2 = objArr[i12];
            objArr[i12] = null;
            c0312c.f1085b = i12;
            obj = obj2;
        }
        C11221e c11221e = (C11221e) obj;
        if (c11221e == null) {
            c11221e = new C11221e(i10);
            c11221e.f33978x0 = i10;
        } else {
            c11221e.m12480c();
            c11221e.f33978x0 = i10;
        }
        int i13 = this.f33961n;
        int i14 = f33947q;
        if (i13 >= i14) {
            int i15 = i14 * 2;
            f33947q = i15;
            this.f33960m = (C11221e[]) Arrays.copyOf(this.f33960m, i15);
        }
        C11221e[] c11221eArr = this.f33960m;
        int i16 = this.f33961n;
        this.f33961n = i16 + 1;
        c11221eArr[i16] = c11221e;
        return c11221e;
    }

    /* JADX INFO: renamed from: b */
    public final void m12458b(C11221e c11221e, C11221e c11221e2, int i10, float f10, C11221e c11221e3, C11221e c11221e4, int i11, int i12) {
        C11218b c11218bM12468l = m12468l();
        if (c11221e2 == c11221e3) {
            c11218bM12468l.f33944d.m12445g(c11221e, 1.0f);
            c11218bM12468l.f33944d.m12445g(c11221e4, 1.0f);
            c11218bM12468l.f33944d.m12445g(c11221e2, -2.0f);
        } else if (f10 == 0.5f) {
            c11218bM12468l.f33944d.m12445g(c11221e, 1.0f);
            c11218bM12468l.f33944d.m12445g(c11221e2, -1.0f);
            c11218bM12468l.f33944d.m12445g(c11221e3, -1.0f);
            c11218bM12468l.f33944d.m12445g(c11221e4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                c11218bM12468l.f33942b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            c11218bM12468l.f33944d.m12445g(c11221e, -1.0f);
            c11218bM12468l.f33944d.m12445g(c11221e2, 1.0f);
            c11218bM12468l.f33942b = i10;
        } else if (f10 >= 1.0f) {
            c11218bM12468l.f33944d.m12445g(c11221e4, -1.0f);
            c11218bM12468l.f33944d.m12445g(c11221e3, 1.0f);
            c11218bM12468l.f33942b = -i11;
        } else {
            float f11 = 1.0f - f10;
            c11218bM12468l.f33944d.m12445g(c11221e, f11 * 1.0f);
            c11218bM12468l.f33944d.m12445g(c11221e2, f11 * (-1.0f));
            c11218bM12468l.f33944d.m12445g(c11221e3, (-1.0f) * f10);
            c11218bM12468l.f33944d.m12445g(c11221e4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                c11218bM12468l.f33942b = (i11 * f10) + ((-i10) * f11);
            }
        }
        if (i12 != 8) {
            c11218bM12468l.m12447a(this, i12);
        }
        m12459c(c11218bM12468l);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f5  */
    /* JADX INFO: renamed from: c */
    public final void m12459c(C11218b c11218b) {
        boolean z6;
        boolean z10;
        C11221e c11221eM12452f;
        ArrayList arrayList;
        if (this.f33957j + 1 >= this.f33958k || this.f33956i + 1 >= this.f33952e) {
            m12470o();
        }
        if (c11218b.f33945e) {
            z6 = false;
        } else {
            if (this.f33953f.length != 0) {
                boolean z11 = false;
                while (!z11) {
                    int iM12442d = c11218b.f33944d.m12442d();
                    int i10 = 0;
                    while (true) {
                        arrayList = c11218b.f33943c;
                        if (i10 >= iM12442d) {
                            break;
                        }
                        C11221e c11221eM12443e = c11218b.f33944d.m12443e(i10);
                        if (c11221eM12443e.f33969o0 != -1 || c11221eM12443e.f33972r0) {
                            arrayList.add(c11221eM12443e);
                        }
                        i10++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i11 = 0; i11 < size; i11++) {
                            C11221e c11221e = (C11221e) arrayList.get(i11);
                            if (c11221e.f33972r0) {
                                c11218b.m12454h(this, c11221e, true);
                            } else {
                                c11218b.mo12455i(this, this.f33953f[c11221e.f33969o0], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z11 = true;
                    }
                }
                if (c11218b.f33941a != null && c11218b.f33944d.m12442d() == 0) {
                    c11218b.f33945e = true;
                    this.f33948a = true;
                }
            }
            if (c11218b.mo12451e()) {
                return;
            }
            float f10 = c11218b.f33942b;
            if (f10 < 0.0f) {
                c11218b.f33942b = f10 * (-1.0f);
                C11217a c11217a = c11218b.f33944d;
                int i12 = c11217a.f33938h;
                for (int i13 = 0; i12 != -1 && i13 < c11217a.f33931a; i13++) {
                    float[] fArr = c11217a.f33937g;
                    fArr[i12] = fArr[i12] * (-1.0f);
                    i12 = c11217a.f33936f[i12];
                }
            }
            int iM12442d2 = c11218b.f33944d.m12442d();
            float f11 = 0.0f;
            float f12 = 0.0f;
            C11221e c11221e2 = null;
            C11221e c11221e3 = null;
            boolean z12 = false;
            boolean z13 = false;
            for (int i14 = 0; i14 < iM12442d2; i14++) {
                float fM12444f = c11218b.f33944d.m12444f(i14);
                C11221e c11221eM12443e2 = c11218b.f33944d.m12443e(i14);
                if (c11221eM12443e2.f33978x0 == 1) {
                    if (c11221e2 == null) {
                        if (c11221eM12443e2.f33977w0 <= 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        c11221e2 = c11221eM12443e2;
                        f11 = fM12444f;
                    } else {
                        if (f11 > fM12444f) {
                            if (c11221eM12443e2.f33977w0 > 1) {
                                z12 = false;
                            }
                            c11221e2 = c11221eM12443e2;
                            f11 = fM12444f;
                        } else if (z12 || c11221eM12443e2.f33977w0 > 1) {
                        }
                        z12 = true;
                        c11221e2 = c11221eM12443e2;
                        f11 = fM12444f;
                    }
                } else if (c11221e2 == null && fM12444f < 0.0f) {
                    if (c11221e3 == null) {
                        if (c11221eM12443e2.f33977w0 <= 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        c11221e3 = c11221eM12443e2;
                        f12 = fM12444f;
                    } else {
                        if (f12 > fM12444f) {
                            if (c11221eM12443e2.f33977w0 > 1) {
                                z13 = false;
                            }
                            c11221e3 = c11221eM12443e2;
                            f12 = fM12444f;
                        } else if (z13 || c11221eM12443e2.f33977w0 > 1) {
                        }
                        z13 = true;
                        c11221e3 = c11221eM12443e2;
                        f12 = fM12444f;
                    }
                }
            }
            if (c11221e2 == null) {
                c11221e2 = c11221e3;
            }
            if (c11221e2 == null) {
                z10 = true;
            } else {
                c11218b.m12453g(c11221e2);
                z10 = false;
            }
            if (c11218b.f33944d.m12442d() == 0) {
                c11218b.f33945e = true;
            }
            if (z10) {
                if (this.f33956i + 1 >= this.f33952e) {
                    m12470o();
                }
                C11221e c11221eM12457a = m12457a(3);
                int i15 = this.f33949b + 1;
                this.f33949b = i15;
                this.f33956i++;
                c11221eM12457a.f33968Z = i15;
                C11242m c11242m = this.f33959l;
                ((C11221e[]) c11242m.f34020o0)[i15] = c11221eM12457a;
                c11218b.f33941a = c11221eM12457a;
                int i16 = this.f33957j;
                m12464h(c11218b);
                if (this.f33957j == i16 + 1) {
                    C11218b c11218b2 = this.f33962o;
                    c11218b2.getClass();
                    c11218b2.f33941a = null;
                    c11218b2.f33944d.m12440b();
                    for (int i17 = 0; i17 < c11218b.f33944d.m12442d(); i17++) {
                        c11218b2.f33944d.m12439a(c11218b.f33944d.m12443e(i17), c11218b.f33944d.m12444f(i17), true);
                    }
                    m12473r(this.f33962o);
                    if (c11221eM12457a.f33969o0 == -1) {
                        if (c11218b.f33941a == c11221eM12457a && (c11221eM12452f = c11218b.m12452f(null, c11221eM12457a)) != null) {
                            c11218b.m12453g(c11221eM12452f);
                        }
                        if (!c11218b.f33945e) {
                            c11218b.f33941a.m12482e(this, c11218b);
                        }
                        ((C0312c) c11242m.f34018Y).m913b(c11218b);
                        this.f33957j--;
                    }
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            C11221e c11221e4 = c11218b.f33941a;
            if (c11221e4 == null) {
                return;
            }
            if (c11221e4.f33978x0 != 1 && c11218b.f33942b < 0.0f) {
                return;
            }
        }
        if (z6) {
            return;
        }
        m12464h(c11218b);
    }

    /* JADX INFO: renamed from: d */
    public final void m12460d(C11221e c11221e, int i10) {
        int i11 = c11221e.f33969o0;
        if (i11 == -1) {
            c11221e.m12481d(this, i10);
            for (int i12 = 0; i12 < this.f33949b + 1; i12++) {
                C11221e c11221e2 = ((C11221e[]) this.f33959l.f34020o0)[i12];
            }
            return;
        }
        if (i11 == -1) {
            C11218b c11218bM12468l = m12468l();
            c11218bM12468l.f33941a = c11221e;
            float f10 = i10;
            c11221e.f33971q0 = f10;
            c11218bM12468l.f33942b = f10;
            c11218bM12468l.f33945e = true;
            m12459c(c11218bM12468l);
            return;
        }
        C11218b c11218b = this.f33953f[i11];
        if (c11218b.f33945e) {
            c11218b.f33942b = i10;
            return;
        }
        if (c11218b.f33944d.m12442d() == 0) {
            c11218b.f33945e = true;
            c11218b.f33942b = i10;
            return;
        }
        C11218b c11218bM12468l2 = m12468l();
        if (i10 < 0) {
            c11218bM12468l2.f33942b = i10 * (-1);
            c11218bM12468l2.f33944d.m12445g(c11221e, 1.0f);
        } else {
            c11218bM12468l2.f33942b = i10;
            c11218bM12468l2.f33944d.m12445g(c11221e, -1.0f);
        }
        m12459c(c11218bM12468l2);
    }

    /* JADX INFO: renamed from: e */
    public final void m12461e(C11221e c11221e, C11221e c11221e2, int i10, int i11) {
        if (i11 == 8 && c11221e2.f33972r0 && c11221e.f33969o0 == -1) {
            c11221e.m12481d(this, c11221e2.f33971q0 + i10);
            return;
        }
        C11218b c11218bM12468l = m12468l();
        boolean z6 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z6 = true;
            }
            c11218bM12468l.f33942b = i10;
        }
        if (z6) {
            c11218bM12468l.f33944d.m12445g(c11221e, 1.0f);
            c11218bM12468l.f33944d.m12445g(c11221e2, -1.0f);
        } else {
            c11218bM12468l.f33944d.m12445g(c11221e, -1.0f);
            c11218bM12468l.f33944d.m12445g(c11221e2, 1.0f);
        }
        if (i11 != 8) {
            c11218bM12468l.m12447a(this, i11);
        }
        m12459c(c11218bM12468l);
    }

    /* JADX INFO: renamed from: f */
    public final void m12462f(C11221e c11221e, C11221e c11221e2, int i10, int i11) {
        C11218b c11218bM12468l = m12468l();
        C11221e c11221eM12469m = m12469m();
        c11221eM12469m.f33970p0 = 0;
        c11218bM12468l.m12448b(c11221e, c11221e2, c11221eM12469m, i10);
        if (i11 != 8) {
            c11218bM12468l.f33944d.m12445g(m12466j(i11), (int) (c11218bM12468l.f33944d.m12441c(c11221eM12469m) * (-1.0f)));
        }
        m12459c(c11218bM12468l);
    }

    /* JADX INFO: renamed from: g */
    public final void m12463g(C11221e c11221e, C11221e c11221e2, int i10, int i11) {
        C11218b c11218bM12468l = m12468l();
        C11221e c11221eM12469m = m12469m();
        c11221eM12469m.f33970p0 = 0;
        c11218bM12468l.m12449c(c11221e, c11221e2, c11221eM12469m, i10);
        if (i11 != 8) {
            c11218bM12468l.f33944d.m12445g(m12466j(i11), (int) (c11218bM12468l.f33944d.m12441c(c11221eM12469m) * (-1.0f)));
        }
        m12459c(c11218bM12468l);
    }

    /* JADX INFO: renamed from: h */
    public final void m12464h(C11218b c11218b) {
        int i10;
        if (c11218b.f33945e) {
            c11218b.f33941a.m12481d(this, c11218b.f33942b);
        } else {
            C11218b[] c11218bArr = this.f33953f;
            int i11 = this.f33957j;
            c11218bArr[i11] = c11218b;
            C11221e c11221e = c11218b.f33941a;
            c11221e.f33969o0 = i11;
            this.f33957j = i11 + 1;
            c11221e.m12482e(this, c11218b);
        }
        if (this.f33948a) {
            int i12 = 0;
            while (i12 < this.f33957j) {
                if (this.f33953f[i12] == null) {
                    System.out.println("WTF");
                }
                C11218b c11218b2 = this.f33953f[i12];
                if (c11218b2 != null && c11218b2.f33945e) {
                    c11218b2.f33941a.m12481d(this, c11218b2.f33942b);
                    ((C0312c) this.f33959l.f34018Y).m913b(c11218b2);
                    this.f33953f[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f33957j;
                        if (i13 >= i10) {
                            break;
                        }
                        C11218b[] c11218bArr2 = this.f33953f;
                        int i15 = i13 - 1;
                        C11218b c11218b3 = c11218bArr2[i13];
                        c11218bArr2[i15] = c11218b3;
                        C11221e c11221e2 = c11218b3.f33941a;
                        if (c11221e2.f33969o0 == i13) {
                            c11221e2.f33969o0 = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f33953f[i14] = null;
                    }
                    this.f33957j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f33948a = false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m12465i() {
        for (int i10 = 0; i10 < this.f33957j; i10++) {
            C11218b c11218b = this.f33953f[i10];
            c11218b.f33941a.f33971q0 = c11218b.f33942b;
        }
    }

    /* JADX INFO: renamed from: j */
    public final C11221e m12466j(int i10) {
        if (this.f33956i + 1 >= this.f33952e) {
            m12470o();
        }
        C11221e c11221eM12457a = m12457a(4);
        int i11 = this.f33949b + 1;
        this.f33949b = i11;
        this.f33956i++;
        c11221eM12457a.f33968Z = i11;
        c11221eM12457a.f33970p0 = i10;
        ((C11221e[]) this.f33959l.f34020o0)[i11] = c11221eM12457a;
        C11220d c11220d = this.f33950c;
        c11220d.f33966i.f47967Z = c11221eM12457a;
        float[] fArr = c11221eM12457a.f33974t0;
        Arrays.fill(fArr, 0.0f);
        fArr[c11221eM12457a.f33970p0] = 1.0f;
        c11220d.m12476j(c11221eM12457a);
        return c11221eM12457a;
    }

    /* JADX INFO: renamed from: k */
    public final C11221e m12467k(Object obj) {
        C11221e c11221e = null;
        if (obj == null) {
            return null;
        }
        if (this.f33956i + 1 >= this.f33952e) {
            m12470o();
        }
        if (obj instanceof C13806c) {
            C13806c c13806c = (C13806c) obj;
            c11221e = c13806c.f43628i;
            if (c11221e == null) {
                c13806c.m15352k();
                c11221e = c13806c.f43628i;
            }
            int i10 = c11221e.f33968Z;
            C11242m c11242m = this.f33959l;
            if (i10 == -1 || i10 > this.f33949b || ((C11221e[]) c11242m.f34020o0)[i10] == null) {
                if (i10 != -1) {
                    c11221e.m12480c();
                }
                int i11 = this.f33949b + 1;
                this.f33949b = i11;
                this.f33956i++;
                c11221e.f33968Z = i11;
                c11221e.f33978x0 = 1;
                ((C11221e[]) c11242m.f34020o0)[i11] = c11221e;
            }
        }
        return c11221e;
    }

    /* JADX INFO: renamed from: l */
    public final C11218b m12468l() {
        Object obj;
        C11242m c11242m = this.f33959l;
        C0312c c0312c = (C0312c) c11242m.f34018Y;
        int i10 = c0312c.f1085b;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = c0312c.f1084a;
            obj = objArr[i11];
            objArr[i11] = null;
            c0312c.f1085b = i11;
        } else {
            obj = null;
        }
        C11218b c11218b = (C11218b) obj;
        if (c11218b == null) {
            return new C11218b(c11242m);
        }
        c11218b.f33941a = null;
        c11218b.f33944d.m12440b();
        c11218b.f33942b = 0.0f;
        c11218b.f33945e = false;
        return c11218b;
    }

    /* JADX INFO: renamed from: m */
    public final C11221e m12469m() {
        if (this.f33956i + 1 >= this.f33952e) {
            m12470o();
        }
        C11221e c11221eM12457a = m12457a(3);
        int i10 = this.f33949b + 1;
        this.f33949b = i10;
        this.f33956i++;
        c11221eM12457a.f33968Z = i10;
        ((C11221e[]) this.f33959l.f34020o0)[i10] = c11221eM12457a;
        return c11221eM12457a;
    }

    /* JADX INFO: renamed from: o */
    public final void m12470o() {
        int i10 = this.f33951d * 2;
        this.f33951d = i10;
        this.f33953f = (C11218b[]) Arrays.copyOf(this.f33953f, i10);
        C11242m c11242m = this.f33959l;
        c11242m.f34020o0 = (C11221e[]) Arrays.copyOf((C11221e[]) c11242m.f34020o0, this.f33951d);
        int i11 = this.f33951d;
        this.f33955h = new boolean[i11];
        this.f33952e = i11;
        this.f33958k = i11;
    }

    /* JADX INFO: renamed from: p */
    public final void m12471p() {
        C11220d c11220d = this.f33950c;
        if (c11220d.mo12451e()) {
            m12465i();
            return;
        }
        if (!this.f33954g) {
            m12472q(c11220d);
            return;
        }
        for (int i10 = 0; i10 < this.f33957j; i10++) {
            if (!this.f33953f[i10].f33945e) {
                m12472q(c11220d);
                return;
            }
        }
        m12465i();
    }

    /* JADX INFO: renamed from: q */
    public final void m12472q(C11220d c11220d) {
        for (int i10 = 0; i10 < this.f33957j; i10++) {
            C11218b c11218b = this.f33953f[i10];
            int i11 = 1;
            if (c11218b.f33941a.f33978x0 != 1) {
                float f10 = 0.0f;
                if (c11218b.f33942b < 0.0f) {
                    boolean z6 = false;
                    int i12 = 0;
                    while (!z6) {
                        i12 += i11;
                        float f11 = Float.MAX_VALUE;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < this.f33957j) {
                            C11218b c11218b2 = this.f33953f[i15];
                            if (c11218b2.f33941a.f33978x0 != i11 && !c11218b2.f33945e && c11218b2.f33942b < f10) {
                                int iM12442d = c11218b2.f33944d.m12442d();
                                int i17 = 0;
                                while (i17 < iM12442d) {
                                    C11221e c11221eM12443e = c11218b2.f33944d.m12443e(i17);
                                    float fM12441c = c11218b2.f33944d.m12441c(c11221eM12443e);
                                    if (fM12441c > f10) {
                                        for (int i18 = 0; i18 < 9; i18++) {
                                            float f12 = c11221eM12443e.f33973s0[i18] / fM12441c;
                                            if ((f12 < f11 && i18 == i16) || i18 > i16) {
                                                i16 = i18;
                                                i14 = c11221eM12443e.f33968Z;
                                                i13 = i15;
                                                f11 = f12;
                                            }
                                        }
                                    }
                                    i17++;
                                    f10 = 0.0f;
                                }
                            }
                            i15++;
                            f10 = 0.0f;
                            i11 = 1;
                        }
                        if (i13 != -1) {
                            C11218b c11218b3 = this.f33953f[i13];
                            c11218b3.f33941a.f33969o0 = -1;
                            c11218b3.m12453g(((C11221e[]) this.f33959l.f34020o0)[i14]);
                            C11221e c11221e = c11218b3.f33941a;
                            c11221e.f33969o0 = i13;
                            c11221e.m12482e(this, c11218b3);
                        } else {
                            z6 = true;
                        }
                        if (i12 > this.f33956i / 2) {
                            z6 = true;
                        }
                        f10 = 0.0f;
                        i11 = 1;
                    }
                    break;
                }
            }
        }
        m12473r(c11220d);
        m12465i();
    }

    /* JADX INFO: renamed from: r */
    public final void m12473r(C11218b c11218b) {
        boolean z6;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f33956i; i11++) {
            this.f33955h[i11] = false;
        }
        boolean z10 = false;
        int i12 = 0;
        while (!z10) {
            int i13 = 1;
            i12++;
            if (i12 >= this.f33956i * 2) {
                return;
            }
            C11221e c11221e = c11218b.f33941a;
            if (c11221e != null) {
                this.f33955h[c11221e.f33968Z] = true;
            }
            C11221e c11221eMo12450d = c11218b.mo12450d(this.f33955h);
            if (c11221eMo12450d != null) {
                boolean[] zArr = this.f33955h;
                int i14 = c11221eMo12450d.f33968Z;
                if (zArr[i14]) {
                    return;
                } else {
                    zArr[i14] = true;
                }
            }
            if (c11221eMo12450d != null) {
                float f10 = Float.MAX_VALUE;
                int i15 = i10;
                int i16 = -1;
                while (i15 < this.f33957j) {
                    C11218b c11218b2 = this.f33953f[i15];
                    if (c11218b2.f33941a.f33978x0 != i13 && !c11218b2.f33945e) {
                        C11217a c11217a = c11218b2.f33944d;
                        int i17 = c11217a.f33938h;
                        if (i17 == -1) {
                            z6 = false;
                            break;
                        }
                        int i18 = 0;
                        while (true) {
                            if (i17 == -1 || i18 >= c11217a.f33931a) {
                                z6 = false;
                                break;
                            } else if (c11217a.f33935e[i17] == c11221eMo12450d.f33968Z) {
                                z6 = true;
                                break;
                            } else {
                                i17 = c11217a.f33936f[i17];
                                i18++;
                            }
                        }
                        if (z6) {
                            float fM12441c = c11218b2.f33944d.m12441c(c11221eMo12450d);
                            if (fM12441c < 0.0f) {
                                float f11 = (-c11218b2.f33942b) / fM12441c;
                                if (f11 < f10) {
                                    f10 = f11;
                                    i16 = i15;
                                }
                            }
                        }
                    }
                    i15++;
                    i13 = 1;
                }
                if (i16 > -1) {
                    C11218b c11218b3 = this.f33953f[i16];
                    c11218b3.f33941a.f33969o0 = -1;
                    c11218b3.m12453g(c11221eMo12450d);
                    C11221e c11221e2 = c11218b3.f33941a;
                    c11221e2.f33969o0 = i16;
                    c11221e2.m12482e(this, c11218b3);
                }
            } else {
                z10 = true;
            }
            i10 = 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m12474s() {
        for (int i10 = 0; i10 < this.f33957j; i10++) {
            C11218b c11218b = this.f33953f[i10];
            if (c11218b != null) {
                ((C0312c) this.f33959l.f34018Y).m913b(c11218b);
            }
            this.f33953f[i10] = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m12475t() {
        C11242m c11242m;
        int i10 = 0;
        while (true) {
            c11242m = this.f33959l;
            C11221e[] c11221eArr = (C11221e[]) c11242m.f34020o0;
            if (i10 >= c11221eArr.length) {
                break;
            }
            C11221e c11221e = c11221eArr[i10];
            if (c11221e != null) {
                c11221e.m12480c();
            }
            i10++;
        }
        C0312c c0312c = (C0312c) c11242m.f34019Z;
        C11221e[] c11221eArr2 = this.f33960m;
        int length = this.f33961n;
        c0312c.getClass();
        if (length > c11221eArr2.length) {
            length = c11221eArr2.length;
        }
        for (int i11 = 0; i11 < length; i11++) {
            C11221e c11221e2 = c11221eArr2[i11];
            int i12 = c0312c.f1085b;
            Object[] objArr = c0312c.f1084a;
            if (i12 < objArr.length) {
                objArr[i12] = c11221e2;
                c0312c.f1085b = i12 + 1;
            }
        }
        this.f33961n = 0;
        Arrays.fill((C11221e[]) c11242m.f34020o0, (Object) null);
        this.f33949b = 0;
        C11220d c11220d = this.f33950c;
        c11220d.f33965h = 0;
        c11220d.f33942b = 0.0f;
        this.f33956i = 1;
        for (int i13 = 0; i13 < this.f33957j; i13++) {
            C11218b c11218b = this.f33953f[i13];
        }
        m12474s();
        this.f33957j = 0;
        this.f33962o = new C11218b(c11242m);
    }
}
