package p003A1;

import android.graphics.Outline;
import android.os.Build;
import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8104h6;
import p523V9.AbstractC8112i6;
import p759g1.AbstractC13799a;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13802d;
import p759g1.C13803e;
import p774h1.AbstractC14332J;
import p774h1.AbstractC14334L;
import p774h1.C14329G;
import p774h1.C14330H;
import p774h1.C14331I;
import p774h1.C14353i;
import p774h1.InterfaceC14333K;
import p774h1.InterfaceC14362r;

/* JADX INFO: renamed from: A1.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0252g1 {

    /* JADX INFO: renamed from: a */
    public boolean f944a = true;

    /* JADX INFO: renamed from: b */
    public final Outline f945b;

    /* JADX INFO: renamed from: c */
    public AbstractC14332J f946c;

    /* JADX INFO: renamed from: d */
    public C14353i f947d;

    /* JADX INFO: renamed from: e */
    public InterfaceC14333K f948e;

    /* JADX INFO: renamed from: f */
    public boolean f949f;

    /* JADX INFO: renamed from: g */
    public boolean f950g;

    /* JADX INFO: renamed from: h */
    public InterfaceC14333K f951h;

    /* JADX INFO: renamed from: i */
    public C13802d f952i;

    /* JADX INFO: renamed from: j */
    public float f953j;

    /* JADX INFO: renamed from: k */
    public long f954k;

    /* JADX INFO: renamed from: l */
    public long f955l;

    /* JADX INFO: renamed from: m */
    public boolean f956m;

    public C0252g1() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f945b = outline;
        this.f954k = 0L;
        this.f955l = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX INFO: renamed from: a */
    public final void m819a(InterfaceC14362r interfaceC14362r) {
        m822d();
        InterfaceC14333K interfaceC14333K = this.f948e;
        if (interfaceC14333K != null) {
            interfaceC14362r.mo15722u(interfaceC14333K, 1);
            return;
        }
        float f10 = this.f953j;
        if (f10 <= 0.0f) {
            interfaceC14362r.mo15716o(C13800b.m15306g(this.f954k), C13800b.m15307h(this.f954k), C13800b.m15306g(this.f954k) + C13803e.m15333e(this.f955l), C13800b.m15307h(this.f954k) + C13803e.m15331c(this.f955l), 1);
            return;
        }
        InterfaceC14333K interfaceC14333KM15631i = this.f951h;
        C13802d c13802d = this.f952i;
        if (interfaceC14333KM15631i != null) {
            long j10 = this.f954k;
            long j11 = this.f955l;
            if (c13802d == null || !AbstractC8104h6.m8584c(c13802d)) {
                float fM15306g = C13800b.m15306g(this.f954k);
                float fM15307h = C13800b.m15307h(this.f954k);
                float fM15333e = C13803e.m15333e(this.f955l) + C13800b.m15306g(this.f954k);
                float fM15331c = C13803e.m15331c(this.f955l) + C13800b.m15307h(this.f954k);
                float f11 = this.f953j;
                long jM8484a = AbstractC8072d6.m8484a(f11, f11);
                long jM8484a2 = AbstractC8072d6.m8484a(AbstractC13799a.m15297b(jM8484a), AbstractC13799a.m15298c(jM8484a));
                C13802d c13802d2 = new C13802d(fM15306g, fM15307h, fM15333e, fM15331c, jM8484a2, jM8484a2, jM8484a2, jM8484a2);
                if (interfaceC14333KM15631i == null) {
                    interfaceC14333KM15631i = AbstractC14334L.m15631i();
                } else {
                    ((C14353i) interfaceC14333KM15631i).m15733e();
                }
                AbstractC12107L1.m13812c(interfaceC14333KM15631i, c13802d2);
                this.f952i = c13802d2;
                this.f951h = interfaceC14333KM15631i;
            } else {
                if (c13802d.f43590a == C13800b.m15306g(j10)) {
                    if (c13802d.f43591b == C13800b.m15307h(j10)) {
                        if (c13802d.f43592c == C13803e.m15333e(j11) + C13800b.m15306g(j10)) {
                            if (c13802d.f43593d != C13803e.m15331c(j11) + C13800b.m15307h(j10) || AbstractC13799a.m15297b(c13802d.f43594e) != f10) {
                                float fM15306g2 = C13800b.m15306g(this.f954k);
                                float fM15307h2 = C13800b.m15307h(this.f954k);
                                float fM15333e2 = C13803e.m15333e(this.f955l) + C13800b.m15306g(this.f954k);
                                float fM15331c2 = C13803e.m15331c(this.f955l) + C13800b.m15307h(this.f954k);
                                float f12 = this.f953j;
                                long jM8484a3 = AbstractC8072d6.m8484a(f12, f12);
                                long jM8484a4 = AbstractC8072d6.m8484a(AbstractC13799a.m15297b(jM8484a3), AbstractC13799a.m15298c(jM8484a3));
                                C13802d c13802d3 = new C13802d(fM15306g2, fM15307h2, fM15333e2, fM15331c2, jM8484a4, jM8484a4, jM8484a4, jM8484a4);
                                if (interfaceC14333KM15631i == null) {
                                    interfaceC14333KM15631i = AbstractC14334L.m15631i();
                                } else {
                                    ((C14353i) interfaceC14333KM15631i).m15733e();
                                }
                                AbstractC12107L1.m13812c(interfaceC14333KM15631i, c13802d3);
                                this.f952i = c13802d3;
                                this.f951h = interfaceC14333KM15631i;
                            }
                        } else {
                            float fM15306g3 = C13800b.m15306g(this.f954k);
                            float fM15307h3 = C13800b.m15307h(this.f954k);
                            float fM15333e3 = C13803e.m15333e(this.f955l) + C13800b.m15306g(this.f954k);
                            float fM15331c3 = C13803e.m15331c(this.f955l) + C13800b.m15307h(this.f954k);
                            float f13 = this.f953j;
                            long jM8484a5 = AbstractC8072d6.m8484a(f13, f13);
                            long jM8484a6 = AbstractC8072d6.m8484a(AbstractC13799a.m15297b(jM8484a5), AbstractC13799a.m15298c(jM8484a5));
                            C13802d c13802d4 = new C13802d(fM15306g3, fM15307h3, fM15333e3, fM15331c3, jM8484a6, jM8484a6, jM8484a6, jM8484a6);
                            if (interfaceC14333KM15631i == null) {
                                interfaceC14333KM15631i = AbstractC14334L.m15631i();
                            } else {
                                ((C14353i) interfaceC14333KM15631i).m15733e();
                            }
                            AbstractC12107L1.m13812c(interfaceC14333KM15631i, c13802d4);
                            this.f952i = c13802d4;
                            this.f951h = interfaceC14333KM15631i;
                        }
                    } else {
                        float fM15306g4 = C13800b.m15306g(this.f954k);
                        float fM15307h4 = C13800b.m15307h(this.f954k);
                        float fM15333e4 = C13803e.m15333e(this.f955l) + C13800b.m15306g(this.f954k);
                        float fM15331c4 = C13803e.m15331c(this.f955l) + C13800b.m15307h(this.f954k);
                        float f14 = this.f953j;
                        long jM8484a7 = AbstractC8072d6.m8484a(f14, f14);
                        long jM8484a8 = AbstractC8072d6.m8484a(AbstractC13799a.m15297b(jM8484a7), AbstractC13799a.m15298c(jM8484a7));
                        C13802d c13802d5 = new C13802d(fM15306g4, fM15307h4, fM15333e4, fM15331c4, jM8484a8, jM8484a8, jM8484a8, jM8484a8);
                        if (interfaceC14333KM15631i == null) {
                            interfaceC14333KM15631i = AbstractC14334L.m15631i();
                        } else {
                            ((C14353i) interfaceC14333KM15631i).m15733e();
                        }
                        AbstractC12107L1.m13812c(interfaceC14333KM15631i, c13802d5);
                        this.f952i = c13802d5;
                        this.f951h = interfaceC14333KM15631i;
                    }
                } else {
                    float fM15306g5 = C13800b.m15306g(this.f954k);
                    float fM15307h5 = C13800b.m15307h(this.f954k);
                    float fM15333e5 = C13803e.m15333e(this.f955l) + C13800b.m15306g(this.f954k);
                    float fM15331c5 = C13803e.m15331c(this.f955l) + C13800b.m15307h(this.f954k);
                    float f15 = this.f953j;
                    long jM8484a9 = AbstractC8072d6.m8484a(f15, f15);
                    long jM8484a10 = AbstractC8072d6.m8484a(AbstractC13799a.m15297b(jM8484a9), AbstractC13799a.m15298c(jM8484a9));
                    C13802d c13802d6 = new C13802d(fM15306g5, fM15307h5, fM15333e5, fM15331c5, jM8484a10, jM8484a10, jM8484a10, jM8484a10);
                    if (interfaceC14333KM15631i == null) {
                        interfaceC14333KM15631i = AbstractC14334L.m15631i();
                    } else {
                        ((C14353i) interfaceC14333KM15631i).m15733e();
                    }
                    AbstractC12107L1.m13812c(interfaceC14333KM15631i, c13802d6);
                    this.f952i = c13802d6;
                    this.f951h = interfaceC14333KM15631i;
                }
            }
        } else {
            float fM15306g6 = C13800b.m15306g(this.f954k);
            float fM15307h6 = C13800b.m15307h(this.f954k);
            float fM15333e6 = C13803e.m15333e(this.f955l) + C13800b.m15306g(this.f954k);
            float fM15331c6 = C13803e.m15331c(this.f955l) + C13800b.m15307h(this.f954k);
            float f16 = this.f953j;
            long jM8484a11 = AbstractC8072d6.m8484a(f16, f16);
            long jM8484a12 = AbstractC8072d6.m8484a(AbstractC13799a.m15297b(jM8484a11), AbstractC13799a.m15298c(jM8484a11));
            C13802d c13802d7 = new C13802d(fM15306g6, fM15307h6, fM15333e6, fM15331c6, jM8484a12, jM8484a12, jM8484a12, jM8484a12);
            if (interfaceC14333KM15631i == null) {
                interfaceC14333KM15631i = AbstractC14334L.m15631i();
            } else {
                ((C14353i) interfaceC14333KM15631i).m15733e();
            }
            AbstractC12107L1.m13812c(interfaceC14333KM15631i, c13802d7);
            this.f952i = c13802d7;
            this.f951h = interfaceC14333KM15631i;
        }
        interfaceC14362r.mo15722u(interfaceC14333KM15631i, 1);
    }

    /* JADX INFO: renamed from: b */
    public final Outline m820b() {
        m822d();
        if (this.f956m && this.f944a) {
            return this.f945b;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m821c(AbstractC14332J abstractC14332J, float f10, boolean z6, float f11, long j10) {
        this.f945b.setAlpha(f10);
        boolean zM18089b = AbstractC16544l.m18089b(this.f946c, abstractC14332J);
        boolean z10 = !zM18089b;
        if (!zM18089b) {
            this.f946c = abstractC14332J;
            this.f949f = true;
        }
        this.f955l = j10;
        boolean z11 = abstractC14332J != null && (z6 || f11 > 0.0f);
        if (this.f956m != z11) {
            this.f956m = z11;
            this.f949f = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: d */
    public final void m822d() {
        if (this.f949f) {
            this.f954k = 0L;
            this.f953j = 0.0f;
            this.f948e = null;
            this.f949f = false;
            this.f950g = false;
            AbstractC14332J abstractC14332J = this.f946c;
            Outline outline = this.f945b;
            if (abstractC14332J == null || !this.f956m || C13803e.m15333e(this.f955l) <= 0.0f || C13803e.m15331c(this.f955l) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f944a = true;
            if (abstractC14332J instanceof C14330H) {
                C13801c c13801c = ((C14330H) abstractC14332J).f44970a;
                float f10 = c13801c.f43586a;
                float f11 = c13801c.f43587b;
                this.f954k = AbstractC8088f6.m8536b(f10, f11);
                this.f955l = AbstractC8112i6.m8603a(c13801c.m15321h(), c13801c.m15318e());
                outline.setRect(Math.round(c13801c.f43586a), Math.round(f11), Math.round(c13801c.f43588c), Math.round(c13801c.f43589d));
                return;
            }
            if (!(abstractC14332J instanceof C14331I)) {
                if (abstractC14332J instanceof C14329G) {
                    m823e(((C14329G) abstractC14332J).f44969a);
                    return;
                }
                return;
            }
            C13802d c13802d = ((C14331I) abstractC14332J).f44971a;
            float fM15297b = AbstractC13799a.m15297b(c13802d.f43594e);
            float f12 = c13802d.f43590a;
            float f13 = c13802d.f43591b;
            this.f954k = AbstractC8088f6.m8536b(f12, f13);
            this.f955l = AbstractC8112i6.m8603a(c13802d.m15328b(), c13802d.m15327a());
            if (AbstractC8104h6.m8584c(c13802d)) {
                this.f945b.setRoundRect(Math.round(f12), Math.round(f13), Math.round(c13802d.f43592c), Math.round(c13802d.f43593d), fM15297b);
                this.f953j = fM15297b;
                return;
            }
            C14353i c14353iM15631i = this.f947d;
            if (c14353iM15631i == null) {
                c14353iM15631i = AbstractC14334L.m15631i();
                this.f947d = c14353iM15631i;
            }
            c14353iM15631i.m15733e();
            AbstractC12107L1.m13812c(c14353iM15631i, c13802d);
            m823e(c14353iM15631i);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m823e(InterfaceC14333K interfaceC14333K) {
        int i10 = Build.VERSION.SDK_INT;
        Outline outline = this.f945b;
        if (i10 <= 28 && !((C14353i) interfaceC14333K).f45039a.isConvex()) {
            this.f944a = false;
            outline.setEmpty();
            this.f950g = true;
        } else {
            if (!(interfaceC14333K instanceof C14353i)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((C14353i) interfaceC14333K).f45039a);
            this.f950g = !outline.canClip();
        }
        this.f948e = interfaceC14333K;
    }
}
