package p003A1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import androidx.compose.p650ui.platform.AndroidComposeView;
import com.google.protobuf.AbstractC12107L1;
import fo.C13711h;
import kotlin.jvm.internal.AbstractC16544l;
import p1062vd.C20567q;
import p1071w0.C20714I0;
import p1140z1.InterfaceC21687d0;
import p330N4.C5667r;
import p492U1.C7543h;
import p492U1.C7545j;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p544W9.AbstractC8596Z3;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9394x4;
import p615Z6.C10235r;
import p759g1.AbstractC13799a;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13802d;
import p774h1.AbstractC14332J;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14348d;
import p774h1.C14328F;
import p774h1.C14329G;
import p774h1.C14330H;
import p774h1.C14331I;
import p774h1.C14336N;
import p774h1.C14343V;
import p774h1.C14353i;
import p774h1.C14365u;
import p774h1.InterfaceC14324B;
import p774h1.InterfaceC14362r;
import p821j1.C16037b;
import p843k1.C16308b;
import p843k1.InterfaceC16310d;
import p985r9.C18903m;

/* JADX INFO: renamed from: A1.W0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0216W0 implements InterfaceC21687d0 {

    /* JADX INFO: renamed from: B0 */
    public AbstractC14332J f819B0;

    /* JADX INFO: renamed from: C0 */
    public C14353i f820C0;

    /* JADX INFO: renamed from: D0 */
    public C18903m f821D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f822E0;

    /* JADX INFO: renamed from: Y */
    public C16308b f824Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC14324B f825Z;

    /* JADX INFO: renamed from: o0 */
    public final AndroidComposeView f826o0;

    /* JADX INFO: renamed from: p0 */
    public C20567q f827p0;

    /* JADX INFO: renamed from: q0 */
    public C20714I0 f828q0;

    /* JADX INFO: renamed from: s0 */
    public boolean f830s0;

    /* JADX INFO: renamed from: u0 */
    public float[] f832u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f833v0;

    /* JADX INFO: renamed from: z0 */
    public int f837z0;

    /* JADX INFO: renamed from: r0 */
    public long f829r0 = AbstractC9113C4.m9643a(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: t0 */
    public final float[] f831t0 = C14328F.m15602a();

    /* JADX INFO: renamed from: w0 */
    public InterfaceC7537b f834w0 = AbstractC9394x4.m9976a();

    /* JADX INFO: renamed from: x0 */
    public EnumC7546k f835x0 = EnumC7546k.f23904Y;

    /* JADX INFO: renamed from: y0 */
    public final C16037b f836y0 = new C16037b();

    /* JADX INFO: renamed from: A0 */
    public long f818A0 = C14343V.f45023b;

    /* JADX INFO: renamed from: F0 */
    public final C0254h0 f823F0 = new C0254h0(this, 2);

    public C0216W0(C16308b c16308b, InterfaceC14324B interfaceC14324B, AndroidComposeView androidComposeView, C20567q c20567q, C20714I0 c20714i0) {
        this.f824Y = c16308b;
        this.f825Z = interfaceC14324B;
        this.f826o0 = androidComposeView;
        this.f827p0 = c20567q;
        this.f828q0 = c20714i0;
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: a */
    public final void mo538a(float[] fArr) {
        C14328F.m15608g(fArr, m687m());
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: b */
    public final boolean mo539b(long j10) {
        float fM15306g = C13800b.m15306g(j10);
        float fM15307h = C13800b.m15307h(j10);
        C16308b c16308b = this.f824Y;
        if (c16308b.f50540v) {
            return AbstractC0240d0.m800k(c16308b.m17833c(), fM15306g, fM15307h, null, null);
        }
        return true;
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: c */
    public final void mo540c(InterfaceC14362r interfaceC14362r, C16308b c16308b) {
        Canvas canvasM15725a = AbstractC14348d.m15725a(interfaceC14362r);
        if (canvasM15725a.isHardwareAccelerated()) {
            mo548k();
            this.f822E0 = this.f824Y.f50519a.mo17846I() > 0.0f;
            C16037b c16037b = this.f836y0;
            C13711h c13711h = c16037b.f49479Z;
            c13711h.m15185H(interfaceC14362r);
            c13711h.f43260o0 = c16308b;
            C5667r.m6091c(c16037b, this.f824Y);
            return;
        }
        C16308b c16308b2 = this.f824Y;
        long j10 = c16308b2.f50537s;
        float f10 = (int) (j10 >> 32);
        float f11 = (int) (j10 & 4294967295L);
        long j11 = this.f829r0;
        float f12 = ((int) (j11 >> 32)) + f10;
        float f13 = f11 + ((int) (j11 & 4294967295L));
        if (c16308b2.f50519a.mo17849a() < 1.0f) {
            C18903m c18903mM15630h = this.f821D0;
            if (c18903mM15630h == null) {
                c18903mM15630h = AbstractC14334L.m15630h();
                this.f821D0 = c18903mM15630h;
            }
            c18903mM15630h.m20220d(this.f824Y.f50519a.mo17849a());
            canvasM15725a.saveLayer(f10, f11, f12, f13, (Paint) c18903mM15630h.f60268b);
        } else {
            interfaceC14362r.mo15706e();
        }
        interfaceC14362r.mo15717p(f10, f11);
        interfaceC14362r.mo15708g(m687m());
        C16308b c16308b3 = this.f824Y;
        boolean z6 = c16308b3.f50540v;
        if (z6 && z6) {
            AbstractC14332J abstractC14332JM17833c = c16308b3.m17833c();
            if (abstractC14332JM17833c instanceof C14330H) {
                interfaceC14362r.mo15709h(((C14330H) abstractC14332JM17833c).f44970a, 1);
            } else if (abstractC14332JM17833c instanceof C14331I) {
                C14353i c14353iM15631i = this.f820C0;
                if (c14353iM15631i == null) {
                    c14353iM15631i = AbstractC14334L.m15631i();
                    this.f820C0 = c14353iM15631i;
                }
                c14353iM15631i.m15733e();
                AbstractC12107L1.m13812c(c14353iM15631i, ((C14331I) abstractC14332JM17833c).f44971a);
                interfaceC14362r.mo15722u(c14353iM15631i, 1);
            } else if (abstractC14332JM17833c instanceof C14329G) {
                interfaceC14362r.mo15722u(((C14329G) abstractC14332JM17833c).f44969a, 1);
            }
        }
        C20567q c20567q = this.f827p0;
        if (c20567q != null) {
            c20567q.invoke(interfaceC14362r, null);
        }
        interfaceC14362r.mo15719r();
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: d */
    public final long mo541d(long j10, boolean z6) {
        if (!z6) {
            return C14328F.m15603b(j10, m687m());
        }
        float[] fArrM686l = m686l();
        if (fArrM686l != null) {
            return C14328F.m15603b(j10, fArrM686l);
        }
        return 9187343241974906880L;
    }

    @Override // p1140z1.InterfaceC21687d0
    public final void destroy() {
        this.f827p0 = null;
        this.f828q0 = null;
        this.f830s0 = true;
        boolean z6 = this.f833v0;
        AndroidComposeView androidComposeView = this.f826o0;
        if (z6) {
            this.f833v0 = false;
            androidComposeView.m11347u(this, false);
        }
        InterfaceC14324B interfaceC14324B = this.f825Z;
        if (interfaceC14324B != null) {
            interfaceC14324B.mo14859a(this.f824Y);
            androidComposeView.m11332C(this);
        }
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: e */
    public final void mo542e(C20567q c20567q, C20714I0 c20714i0) {
        InterfaceC14324B interfaceC14324B = this.f825Z;
        if (interfaceC14324B == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f824Y.f50536r) {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        this.f824Y = interfaceC14324B.mo14860b();
        this.f830s0 = false;
        this.f827p0 = c20567q;
        this.f828q0 = c20714i0;
        this.f818A0 = C14343V.f45023b;
        this.f822E0 = false;
        this.f829r0 = AbstractC9113C4.m9643a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f819B0 = null;
        this.f837z0 = 0;
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: f */
    public final void mo543f(long j10) {
        if (C7545j.m7886a(j10, this.f829r0)) {
            return;
        }
        this.f829r0 = j10;
        if (this.f833v0 || this.f830s0) {
            return;
        }
        AndroidComposeView androidComposeView = this.f826o0;
        androidComposeView.invalidate();
        if (true != this.f833v0) {
            this.f833v0 = true;
            androidComposeView.m11347u(this, true);
        }
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: g */
    public final void mo544g(C14336N c14336n) {
        C20714I0 c20714i0;
        int i10;
        C20714I0 c20714i1;
        int i11 = c14336n.f44984Y | this.f837z0;
        this.f835x0 = c14336n.f44982F0;
        this.f834w0 = c14336n.f44981E0;
        int i12 = i11 & 4096;
        if (i12 != 0) {
            this.f818A0 = c14336n.f44997z0;
        }
        if ((i11 & 1) != 0) {
            C16308b c16308b = this.f824Y;
            float f10 = c14336n.f44985Z;
            InterfaceC16310d interfaceC16310d = c16308b.f50519a;
            if (interfaceC16310d.mo17862n() != f10) {
                interfaceC16310d.mo17858j(f10);
            }
        }
        if ((i11 & 2) != 0) {
            C16308b c16308b2 = this.f824Y;
            float f11 = c14336n.f44986o0;
            InterfaceC16310d interfaceC16310d2 = c16308b2.f50519a;
            if (interfaceC16310d2.mo17847J() != f11) {
                interfaceC16310d2.mo17855g(f11);
            }
        }
        if ((i11 & 4) != 0) {
            this.f824Y.m17836f(c14336n.f44987p0);
        }
        if ((i11 & 8) != 0) {
            C16308b c16308b3 = this.f824Y;
            float f12 = c14336n.f44988q0;
            InterfaceC16310d interfaceC16310d3 = c16308b3.f50519a;
            if (interfaceC16310d3.mo17839B() != f12) {
                interfaceC16310d3.mo17859k(f12);
            }
        }
        if ((i11 & 16) != 0) {
            C16308b c16308b4 = this.f824Y;
            float f13 = c14336n.f44989r0;
            InterfaceC16310d interfaceC16310d4 = c16308b4.f50519a;
            if (interfaceC16310d4.mo17871w() != f13) {
                interfaceC16310d4.mo17853e(f13);
            }
        }
        boolean z6 = true;
        if ((i11 & 32) != 0) {
            C16308b c16308b5 = this.f824Y;
            float f14 = c14336n.f44990s0;
            InterfaceC16310d interfaceC16310d5 = c16308b5.f50519a;
            if (interfaceC16310d5.mo17846I() != f14) {
                interfaceC16310d5.mo17863o(f14);
                c16308b5.f50525g = true;
                c16308b5.m17831a();
            }
            if (c14336n.f44990s0 > 0.0f && !this.f822E0 && (c20714i1 = this.f828q0) != null) {
                c20714i1.invoke();
            }
        }
        if ((i11 & 64) != 0) {
            C16308b c16308b6 = this.f824Y;
            long j10 = c14336n.f44991t0;
            InterfaceC16310d interfaceC16310d6 = c16308b6.f50519a;
            if (!C14365u.m15775c(j10, interfaceC16310d6.mo17870v())) {
                interfaceC16310d6.mo17873y(j10);
            }
        }
        if ((i11 & 128) != 0) {
            C16308b c16308b7 = this.f824Y;
            long j11 = c14336n.f44992u0;
            InterfaceC16310d interfaceC16310d7 = c16308b7.f50519a;
            if (!C14365u.m15775c(j11, interfaceC16310d7.mo17872x())) {
                interfaceC16310d7.mo17843F(j11);
            }
        }
        if ((i11 & 1024) != 0) {
            C16308b c16308b8 = this.f824Y;
            float f15 = c14336n.f44995x0;
            InterfaceC16310d interfaceC16310d8 = c16308b8.f50519a;
            if (interfaceC16310d8.mo17868t() != f15) {
                interfaceC16310d8.mo17852d(f15);
            }
        }
        if ((i11 & 256) != 0) {
            C16308b c16308b9 = this.f824Y;
            float f16 = c14336n.f44993v0;
            InterfaceC16310d interfaceC16310d9 = c16308b9.f50519a;
            if (interfaceC16310d9.mo17841D() != f16) {
                interfaceC16310d9.mo17861m(f16);
            }
        }
        if ((i11 & 512) != 0) {
            C16308b c16308b10 = this.f824Y;
            float f17 = c14336n.f44994w0;
            InterfaceC16310d interfaceC16310d10 = c16308b10.f50519a;
            if (interfaceC16310d10.mo17867s() != f17) {
                interfaceC16310d10.mo17850b(f17);
            }
        }
        if ((i11 & 2048) != 0) {
            C16308b c16308b11 = this.f824Y;
            float f18 = c14336n.f44996y0;
            InterfaceC16310d interfaceC16310d11 = c16308b11.f50519a;
            if (interfaceC16310d11.mo17874z() != f18) {
                interfaceC16310d11.mo17860l(f18);
            }
        }
        if (i12 != 0) {
            if (C14343V.m15667a(this.f818A0, C14343V.f45023b)) {
                C16308b c16308b12 = this.f824Y;
                if (!C13800b.m15303d(c16308b12.f50539u, 9205357640488583168L)) {
                    c16308b12.f50539u = 9205357640488583168L;
                    c16308b12.f50519a.mo17869u(9205357640488583168L);
                }
            } else {
                C16308b c16308b13 = this.f824Y;
                long jM8536b = AbstractC8088f6.m8536b(C14343V.m15668b(this.f818A0) * ((int) (this.f829r0 >> 32)), C14343V.m15669c(this.f818A0) * ((int) (this.f829r0 & 4294967295L)));
                if (!C13800b.m15303d(c16308b13.f50539u, jM8536b)) {
                    c16308b13.f50539u = jM8536b;
                    c16308b13.f50519a.mo17869u(jM8536b);
                }
            }
        }
        if ((i11 & 16384) != 0) {
            C16308b c16308b14 = this.f824Y;
            boolean z10 = c14336n.f44978B0;
            if (c16308b14.f50540v != z10) {
                c16308b14.f50540v = z10;
                c16308b14.f50525g = true;
                c16308b14.m17831a();
            }
        }
        if ((131072 & i11) != 0) {
            InterfaceC16310d interfaceC16310d12 = this.f824Y.f50519a;
            if (!AbstractC16544l.m18089b(null, null)) {
                interfaceC16310d12.mo17851c();
            }
        }
        if ((32768 & i11) != 0) {
            C16308b c16308b15 = this.f824Y;
            int i13 = c14336n.f44979C0;
            if (AbstractC14334L.m15640r(i13, 0)) {
                i10 = 0;
            } else if (AbstractC14334L.m15640r(i13, 1)) {
                i10 = 1;
            } else {
                i10 = 2;
                if (!AbstractC14334L.m15640r(i13, 2)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            InterfaceC16310d interfaceC16310d13 = c16308b15.f50519a;
            if (!AbstractC8596Z3.m9257a(interfaceC16310d13.mo17865q(), i10)) {
                interfaceC16310d13.mo17842E(i10);
            }
        }
        if (AbstractC16544l.m18089b(this.f819B0, c14336n.f44983G0)) {
            z6 = false;
        } else {
            AbstractC14332J abstractC14332J = c14336n.f44983G0;
            this.f819B0 = abstractC14332J;
            if (abstractC14332J != null) {
                C16308b c16308b16 = this.f824Y;
                if (abstractC14332J instanceof C14330H) {
                    C13801c c13801c = ((C14330H) abstractC14332J).f44970a;
                    c16308b16.m17837g(0.0f, AbstractC8088f6.m8536b(c13801c.f43586a, c13801c.f43587b), AbstractC8112i6.m8603a(c13801c.m15321h(), c13801c.m15318e()));
                } else if (abstractC14332J instanceof C14329G) {
                    c16308b16.f50529k = null;
                    c16308b16.f50527i = 9205357640488583168L;
                    c16308b16.f50526h = 0L;
                    c16308b16.f50528j = 0.0f;
                    c16308b16.f50525g = true;
                    c16308b16.f50532n = false;
                    c16308b16.f50530l = ((C14329G) abstractC14332J).f44969a;
                    c16308b16.m17831a();
                } else if (abstractC14332J instanceof C14331I) {
                    C14331I c14331i = (C14331I) abstractC14332J;
                    C14353i c14353i = c14331i.f44972b;
                    if (c14353i != null) {
                        c16308b16.f50529k = null;
                        c16308b16.f50527i = 9205357640488583168L;
                        c16308b16.f50526h = 0L;
                        c16308b16.f50528j = 0.0f;
                        c16308b16.f50525g = true;
                        c16308b16.f50532n = false;
                        c16308b16.f50530l = c14353i;
                        c16308b16.m17831a();
                    } else {
                        C13802d c13802d = c14331i.f44971a;
                        c16308b16.m17837g(AbstractC13799a.m15297b(c13802d.f43597h), AbstractC8088f6.m8536b(c13802d.f43590a, c13802d.f43591b), AbstractC8112i6.m8603a(c13802d.m15328b(), c13802d.m15327a()));
                    }
                }
                if ((abstractC14332J instanceof C14329G) && Build.VERSION.SDK_INT < 33 && (c20714i0 = this.f828q0) != null) {
                    c20714i0.invoke();
                }
            }
        }
        this.f837z0 = c14336n.f44984Y;
        if (i11 != 0 || z6) {
            int i14 = Build.VERSION.SDK_INT;
            AndroidComposeView androidComposeView = this.f826o0;
            if (i14 >= 26) {
                C0242d2.f902a.m812a(androidComposeView);
            } else {
                androidComposeView.invalidate();
            }
        }
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: h */
    public final void mo545h(C10235r c10235r, boolean z6) {
        if (!z6) {
            C14328F.m15604c(m687m(), c10235r);
            return;
        }
        float[] fArrM686l = m686l();
        if (fArrM686l != null) {
            C14328F.m15604c(fArrM686l, c10235r);
            return;
        }
        c10235r.f30390b = 0.0f;
        c10235r.f30391c = 0.0f;
        c10235r.f30392d = 0.0f;
        c10235r.f30393e = 0.0f;
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: i */
    public final void mo546i(float[] fArr) {
        float[] fArrM686l = m686l();
        if (fArrM686l != null) {
            C14328F.m15608g(fArr, fArrM686l);
        }
    }

    @Override // p1140z1.InterfaceC21687d0
    public final void invalidate() {
        if (this.f833v0 || this.f830s0) {
            return;
        }
        AndroidComposeView androidComposeView = this.f826o0;
        androidComposeView.invalidate();
        if (true != this.f833v0) {
            this.f833v0 = true;
            androidComposeView.m11347u(this, true);
        }
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: j */
    public final void mo547j(long j10) {
        C16308b c16308b = this.f824Y;
        if (!C7543h.m7880b(c16308b.f50537s, j10)) {
            c16308b.f50537s = j10;
            c16308b.f50519a.mo17838A(c16308b.f50538t, (int) (j10 >> 32), (int) (j10 & 4294967295L));
        }
        int i10 = Build.VERSION.SDK_INT;
        AndroidComposeView androidComposeView = this.f826o0;
        if (i10 >= 26) {
            C0242d2.f902a.m812a(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: k */
    public final void mo548k() {
        if (this.f833v0) {
            if (!C14343V.m15667a(this.f818A0, C14343V.f45023b) && !C7545j.m7886a(this.f824Y.f50538t, this.f829r0)) {
                C16308b c16308b = this.f824Y;
                long jM8536b = AbstractC8088f6.m8536b(C14343V.m15668b(this.f818A0) * ((int) (this.f829r0 >> 32)), C14343V.m15669c(this.f818A0) * ((int) (this.f829r0 & 4294967295L)));
                if (!C13800b.m15303d(c16308b.f50539u, jM8536b)) {
                    c16308b.f50539u = jM8536b;
                    c16308b.f50519a.mo17869u(jM8536b);
                }
            }
            C16308b c16308b2 = this.f824Y;
            InterfaceC7537b interfaceC7537b = this.f834w0;
            EnumC7546k enumC7546k = this.f835x0;
            long j10 = this.f829r0;
            if (!C7545j.m7886a(c16308b2.f50538t, j10)) {
                c16308b2.f50538t = j10;
                long j11 = c16308b2.f50537s;
                c16308b2.f50519a.mo17838A(j10, (int) (j11 >> 32), (int) (4294967295L & j11));
                if (c16308b2.f50527i == 9205357640488583168L) {
                    c16308b2.f50525g = true;
                    c16308b2.m17831a();
                }
            }
            c16308b2.f50520b = interfaceC7537b;
            c16308b2.f50521c = enumC7546k;
            c16308b2.f50522d = this.f823F0;
            c16308b2.m17835e();
            if (this.f833v0) {
                this.f833v0 = false;
                this.f826o0.m11347u(this, false);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final float[] m686l() {
        float[] fArrM687m = m687m();
        float[] fArrM15602a = this.f832u0;
        if (fArrM15602a == null) {
            fArrM15602a = C14328F.m15602a();
            this.f832u0 = fArrM15602a;
        }
        if (AbstractC0240d0.m798i(fArrM687m, fArrM15602a)) {
            return fArrM15602a;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final float[] m687m() {
        C16308b c16308b = this.f824Y;
        long jM8605c = AbstractC8088f6.m8539e(c16308b.f50539u) ? AbstractC8112i6.m8605c(AbstractC9113C4.m9645c(this.f829r0)) : c16308b.f50539u;
        float[] fArr = this.f831t0;
        C14328F.m15605d(fArr);
        float[] fArrM15602a = C14328F.m15602a();
        C14328F.m15609h(fArrM15602a, -C13800b.m15306g(jM8605c), -C13800b.m15307h(jM8605c), 0.0f);
        C14328F.m15608g(fArr, fArrM15602a);
        float[] fArrM15602a2 = C14328F.m15602a();
        InterfaceC16310d interfaceC16310d = c16308b.f50519a;
        C14328F.m15609h(fArrM15602a2, interfaceC16310d.mo17839B(), interfaceC16310d.mo17871w(), 0.0f);
        double dMo17841D = (((double) interfaceC16310d.mo17841D()) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(dMo17841D);
        float fSin = (float) Math.sin(dMo17841D);
        float f10 = fArrM15602a2[1];
        float f11 = fArrM15602a2[2];
        float f12 = fArrM15602a2[5];
        float f13 = fArrM15602a2[6];
        float f14 = fArrM15602a2[9];
        float f15 = fArrM15602a2[10];
        float f16 = fArrM15602a2[13];
        float f17 = fArrM15602a2[14];
        fArrM15602a2[1] = (f10 * fCos) - (f11 * fSin);
        fArrM15602a2[2] = (f11 * fCos) + (f10 * fSin);
        fArrM15602a2[5] = (f12 * fCos) - (f13 * fSin);
        fArrM15602a2[6] = (f13 * fCos) + (f12 * fSin);
        fArrM15602a2[9] = (f14 * fCos) - (f15 * fSin);
        fArrM15602a2[10] = (f15 * fCos) + (f14 * fSin);
        fArrM15602a2[13] = (f16 * fCos) - (f17 * fSin);
        fArrM15602a2[14] = (f17 * fCos) + (f16 * fSin);
        double dMo17867s = (((double) interfaceC16310d.mo17867s()) * 3.141592653589793d) / 180.0d;
        float fCos2 = (float) Math.cos(dMo17867s);
        float fSin2 = (float) Math.sin(dMo17867s);
        float f18 = fArrM15602a2[0];
        float f19 = fArrM15602a2[2];
        float f20 = fArrM15602a2[4];
        float f21 = fArrM15602a2[6];
        float f22 = (f21 * fSin2) + (f20 * fCos2);
        float f23 = (f21 * fCos2) + ((-f20) * fSin2);
        float f24 = fArrM15602a2[8];
        float f25 = fArrM15602a2[10];
        float f26 = fArrM15602a2[12];
        float f27 = fArrM15602a2[14];
        fArrM15602a2[0] = (f19 * fSin2) + (f18 * fCos2);
        fArrM15602a2[2] = (f19 * fCos2) + ((-f18) * fSin2);
        fArrM15602a2[4] = f22;
        fArrM15602a2[6] = f23;
        fArrM15602a2[8] = (f25 * fSin2) + (f24 * fCos2);
        fArrM15602a2[10] = (f25 * fCos2) + ((-f24) * fSin2);
        fArrM15602a2[12] = (f27 * fSin2) + (f26 * fCos2);
        fArrM15602a2[14] = (f27 * fCos2) + ((-f26) * fSin2);
        C14328F.m15606e(fArrM15602a2, interfaceC16310d.mo17868t());
        C14328F.m15607f(fArrM15602a2, interfaceC16310d.mo17862n(), interfaceC16310d.mo17847J(), 1.0f);
        C14328F.m15608g(fArr, fArrM15602a2);
        float[] fArrM15602a3 = C14328F.m15602a();
        C14328F.m15609h(fArrM15602a3, C13800b.m15306g(jM8605c), C13800b.m15307h(jM8605c), 0.0f);
        C14328F.m15608g(fArr, fArrM15602a3);
        return fArr;
    }
}
