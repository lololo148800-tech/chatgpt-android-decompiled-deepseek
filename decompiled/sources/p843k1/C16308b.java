package p843k1;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import kotlin.jvm.internal.AbstractC16546n;
import p005A3.C0326m;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8072d6;
import p571X9.AbstractC9113C4;
import p692d0.AbstractC12958K;
import p692d0.C12954G;
import p749fd.C13628m;
import p759g1.AbstractC13799a;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13802d;
import p759g1.C13803e;
import p774h1.AbstractC14332J;
import p774h1.C14329G;
import p774h1.C14330H;
import p774h1.C14331I;
import p774h1.C14353i;
import p821j1.AbstractC16038c;
import p985r9.C18903m;

/* JADX INFO: renamed from: k1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C16308b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC16310d f50519a;

    /* JADX INFO: renamed from: f */
    public Outline f50524f;

    /* JADX INFO: renamed from: j */
    public float f50528j;

    /* JADX INFO: renamed from: k */
    public AbstractC14332J f50529k;

    /* JADX INFO: renamed from: l */
    public C14353i f50530l;

    /* JADX INFO: renamed from: m */
    public C14353i f50531m;

    /* JADX INFO: renamed from: n */
    public boolean f50532n;

    /* JADX INFO: renamed from: o */
    public C18903m f50533o;

    /* JADX INFO: renamed from: p */
    public int f50534p;

    /* JADX INFO: renamed from: r */
    public boolean f50536r;

    /* JADX INFO: renamed from: s */
    public long f50537s;

    /* JADX INFO: renamed from: t */
    public long f50538t;

    /* JADX INFO: renamed from: u */
    public long f50539u;

    /* JADX INFO: renamed from: v */
    public boolean f50540v;

    /* JADX INFO: renamed from: w */
    public RectF f50541w;

    /* JADX INFO: renamed from: b */
    public InterfaceC7537b f50520b = AbstractC16038c.f49482a;

    /* JADX INFO: renamed from: c */
    public EnumC7546k f50521c = EnumC7546k.f23904Y;

    /* JADX INFO: renamed from: d */
    public AbstractC16546n f50522d = C16307a.f50516Z;

    /* JADX INFO: renamed from: e */
    public final C13628m f50523e = new C13628m(this, 28);

    /* JADX INFO: renamed from: g */
    public boolean f50525g = true;

    /* JADX INFO: renamed from: h */
    public long f50526h = 0;

    /* JADX INFO: renamed from: i */
    public long f50527i = 9205357640488583168L;

    /* JADX INFO: renamed from: q */
    public final C0326m f50535q = new C0326m();

    static {
        int i10 = AbstractC16316j.f50619a;
        int i11 = AbstractC16316j.f50619a;
    }

    public C16308b(InterfaceC16310d interfaceC16310d) {
        this.f50519a = interfaceC16310d;
        interfaceC16310d.mo17840C(false);
        this.f50537s = 0L;
        this.f50538t = 0L;
        this.f50539u = 9205357640488583168L;
    }

    /* JADX INFO: renamed from: a */
    public final void m17831a() {
        Outline outline;
        if (this.f50525g) {
            boolean z6 = this.f50540v;
            InterfaceC16310d interfaceC16310d = this.f50519a;
            Outline outline2 = null;
            if (z6 || interfaceC16310d.mo17846I() > 0.0f) {
                C14353i c14353i = this.f50530l;
                if (c14353i != null) {
                    RectF rectF = this.f50541w;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f50541w = rectF;
                    }
                    Path path = c14353i.f45039a;
                    path.computeBounds(rectF, false);
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 > 28 || path.isConvex()) {
                        outline = this.f50524f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f50524f = outline;
                        }
                        if (i10 >= 30) {
                            C16317k.f50620a.m17911a(outline, c14353i);
                        } else {
                            outline.setConvexPath(path);
                        }
                        this.f50532n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f50524f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f50532n = true;
                        outline = null;
                    }
                    this.f50530l = c14353i;
                    if (outline != null) {
                        outline.setAlpha(interfaceC16310d.mo17849a());
                        outline2 = outline;
                    }
                    interfaceC16310d.mo17864p(outline2, AbstractC9113C4.m9643a(Math.round(rectF.width()), Math.round(rectF.height())));
                    if (this.f50532n && this.f50540v) {
                        interfaceC16310d.mo17840C(false);
                        interfaceC16310d.mo17854f();
                    } else {
                        interfaceC16310d.mo17840C(this.f50540v);
                    }
                } else {
                    interfaceC16310d.mo17840C(this.f50540v);
                    Outline outline4 = this.f50524f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f50524f = outline4;
                    }
                    long jM9645c = AbstractC9113C4.m9645c(this.f50538t);
                    long j10 = this.f50526h;
                    long j11 = this.f50527i;
                    long j12 = j11 == 9205357640488583168L ? jM9645c : j11;
                    outline4.setRoundRect(Math.round(C13800b.m15306g(j10)), Math.round(C13800b.m15307h(j10)), Math.round(C13803e.m15333e(j12) + C13800b.m15306g(j10)), Math.round(C13803e.m15331c(j12) + C13800b.m15307h(j10)), this.f50528j);
                    outline4.setAlpha(interfaceC16310d.mo17849a());
                    interfaceC16310d.mo17864p(outline4, (((long) Math.round(C13803e.m15331c(j12))) & 4294967295L) | (((long) Math.round(C13803e.m15333e(j12))) << 32));
                }
            } else {
                interfaceC16310d.mo17840C(false);
                interfaceC16310d.mo17864p(null, 0L);
            }
        }
        this.f50525g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e A[LOOP:0: B:14:0x0027->B:24:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[EDGE_INSN: B:29:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:14:0x0027->B:24:0x005e], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final void m17832b() {
        if (this.f50536r && this.f50534p == 0) {
            C0326m c0326m = this.f50535q;
            C16308b c16308b = (C16308b) c0326m.f1140b;
            if (c16308b != null) {
                c16308b.m17834d();
                c0326m.f1140b = null;
            }
            C12954G c12954g = (C12954G) c0326m.f1142d;
            if (c12954g != null) {
                Object[] objArr = c12954g.f41144b;
                long[] jArr = c12954g.f41143a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i10 != length) {
                                break;
                                break;
                            }
                            i10++;
                        } else {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j10) < 128) {
                                    ((C16308b) objArr[(i10 << 3) + i12]).m17834d();
                                }
                                j10 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            } else if (i10 != length) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                c12954g.m14625b();
            }
            this.f50519a.mo17854f();
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC14332J m17833c() {
        AbstractC14332J c14330h;
        AbstractC14332J abstractC14332J = this.f50529k;
        C14353i c14353i = this.f50530l;
        if (abstractC14332J != null) {
            return abstractC14332J;
        }
        if (c14353i != null) {
            C14329G c14329g = new C14329G(c14353i);
            this.f50529k = c14329g;
            return c14329g;
        }
        long jM9645c = AbstractC9113C4.m9645c(this.f50538t);
        long j10 = this.f50526h;
        long j11 = this.f50527i;
        if (j11 != 9205357640488583168L) {
            jM9645c = j11;
        }
        float fM15306g = C13800b.m15306g(j10);
        float fM15307h = C13800b.m15307h(j10);
        float fM15333e = C13803e.m15333e(jM9645c) + fM15306g;
        float fM15331c = C13803e.m15331c(jM9645c) + fM15307h;
        float f10 = this.f50528j;
        if (f10 > 0.0f) {
            long jM8484a = AbstractC8072d6.m8484a(f10, f10);
            long jM8484a2 = AbstractC8072d6.m8484a(AbstractC13799a.m15297b(jM8484a), AbstractC13799a.m15298c(jM8484a));
            c14330h = new C14331I(new C13802d(fM15306g, fM15307h, fM15333e, fM15331c, jM8484a2, jM8484a2, jM8484a2, jM8484a2));
        } else {
            c14330h = new C14330H(new C13801c(fM15306g, fM15307h, fM15333e, fM15331c));
        }
        this.f50529k = c14330h;
        return c14330h;
    }

    /* JADX INFO: renamed from: d */
    public final void m17834d() {
        this.f50534p--;
        m17832b();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0091 A[LOOP:0: B:20:0x005b->B:30:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[EDGE_INSN: B:34:0x0093->B:31:0x0093 BREAK  A[LOOP:0: B:20:0x005b->B:30:0x0091], SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final void m17835e() {
        C0326m c0326m = this.f50535q;
        c0326m.f1141c = (C16308b) c0326m.f1140b;
        C12954G c12954g = (C12954G) c0326m.f1142d;
        if (c12954g != null && c12954g.m14631h()) {
            C12954G c12954g2 = (C12954G) c0326m.f1143e;
            if (c12954g2 == null) {
                int i10 = AbstractC12958K.f41151a;
                c12954g2 = new C12954G();
                c0326m.f1143e = c12954g2;
            }
            c12954g2.m14632i(c12954g);
            c12954g.m14625b();
        }
        c0326m.f1139a = true;
        this.f50519a.mo17845H(this.f50520b, this.f50521c, this, this.f50523e);
        c0326m.f1139a = false;
        C16308b c16308b = (C16308b) c0326m.f1141c;
        if (c16308b != null) {
            c16308b.m17834d();
        }
        C12954G c12954g3 = (C12954G) c0326m.f1143e;
        if (c12954g3 == null || !c12954g3.m14631h()) {
            return;
        }
        Object[] objArr = c12954g3.f41144b;
        long[] jArr = c12954g3.f41143a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            ((C16308b) objArr[(i11 << 3) + i13]).m17834d();
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        c12954g3.m14625b();
    }

    /* JADX INFO: renamed from: f */
    public final void m17836f(float f10) {
        InterfaceC16310d interfaceC16310d = this.f50519a;
        if (interfaceC16310d.mo17849a() == f10) {
            return;
        }
        interfaceC16310d.mo17857i(f10);
    }

    /* JADX INFO: renamed from: g */
    public final void m17837g(float f10, long j10, long j11) {
        if (C13800b.m15303d(this.f50526h, j10) && C13803e.m15330b(this.f50527i, j11) && this.f50528j == f10 && this.f50530l == null) {
            return;
        }
        this.f50529k = null;
        this.f50530l = null;
        this.f50525g = true;
        this.f50532n = false;
        this.f50526h = j10;
        this.f50527i = j11;
        this.f50528j = f10;
        m17831a();
    }
}
