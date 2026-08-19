package p003A1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import androidx.compose.p650ui.platform.AndroidComposeView;
import io.sentry.hints.C15370i;
import p1062vd.C20567q;
import p1071w0.C20714I0;
import p1140z1.InterfaceC21687d0;
import p615Z6.C10235r;
import p759g1.C13800b;
import p774h1.AbstractC14332J;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14348d;
import p774h1.C14328F;
import p774h1.C14336N;
import p774h1.C14343V;
import p774h1.C14363s;
import p774h1.InterfaceC14333K;
import p774h1.InterfaceC14362r;
import p843k1.C16308b;
import p985r9.C18903m;

/* JADX INFO: renamed from: A1.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0279p1 implements InterfaceC21687d0 {

    /* JADX INFO: renamed from: Y */
    public final AndroidComposeView f1011Y;

    /* JADX INFO: renamed from: Z */
    public C20567q f1012Z;

    /* JADX INFO: renamed from: o0 */
    public C20714I0 f1013o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f1014p0;

    /* JADX INFO: renamed from: r0 */
    public boolean f1016r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f1017s0;

    /* JADX INFO: renamed from: t0 */
    public C18903m f1018t0;

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC0193O0 f1022x0;

    /* JADX INFO: renamed from: y0 */
    public int f1023y0;

    /* JADX INFO: renamed from: q0 */
    public final C0252g1 f1015q0 = new C0252g1();

    /* JADX INFO: renamed from: u0 */
    public final C0241d1 f1019u0 = new C0241d1(C0198Q.f738p0);

    /* JADX INFO: renamed from: v0 */
    public final C14363s f1020v0 = new C14363s();

    /* JADX INFO: renamed from: w0 */
    public long f1021w0 = C14343V.f45023b;

    public C0279p1(AndroidComposeView androidComposeView, C20567q c20567q, C20714I0 c20714i0) {
        this.f1011Y = androidComposeView;
        this.f1012Z = c20567q;
        this.f1013o0 = c20714i0;
        InterfaceC0193O0 c0273n1 = Build.VERSION.SDK_INT >= 29 ? new C0273n1() : new C0270m1(androidComposeView);
        c0273n1.mo608z();
        c0273n1.mo601s(false);
        this.f1022x0 = c0273n1;
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: a */
    public final void mo538a(float[] fArr) {
        C14328F.m15608g(fArr, this.f1019u0.m810b(this.f1022x0));
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: b */
    public final boolean mo539b(long j10) {
        AbstractC14332J abstractC14332J;
        float fM15306g = C13800b.m15306g(j10);
        float fM15307h = C13800b.m15307h(j10);
        InterfaceC0193O0 interfaceC0193O0 = this.f1022x0;
        if (interfaceC0193O0.mo573A()) {
            return 0.0f <= fM15306g && fM15306g < ((float) interfaceC0193O0.getWidth()) && 0.0f <= fM15307h && fM15307h < ((float) interfaceC0193O0.getHeight());
        }
        if (!interfaceC0193O0.mo578F()) {
            return true;
        }
        C0252g1 c0252g1 = this.f1015q0;
        if (c0252g1.f956m && (abstractC14332J = c0252g1.f946c) != null) {
            return AbstractC0240d0.m800k(abstractC14332J, C13800b.m15306g(j10), C13800b.m15307h(j10), null, null);
        }
        return true;
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: c */
    public final void mo540c(InterfaceC14362r interfaceC14362r, C16308b c16308b) {
        Canvas canvasM15725a = AbstractC14348d.m15725a(interfaceC14362r);
        boolean zIsHardwareAccelerated = canvasM15725a.isHardwareAccelerated();
        InterfaceC0193O0 interfaceC0193O0 = this.f1022x0;
        if (zIsHardwareAccelerated) {
            mo548k();
            boolean z6 = interfaceC0193O0.mo582J() > 0.0f;
            this.f1017s0 = z6;
            if (z6) {
                interfaceC14362r.mo15721t();
            }
            interfaceC0193O0.mo598p(canvasM15725a);
            if (this.f1017s0) {
                interfaceC14362r.mo15707f();
                return;
            }
            return;
        }
        float fMo599q = interfaceC0193O0.mo599q();
        float fMo574B = interfaceC0193O0.mo574B();
        float fMo577E = interfaceC0193O0.mo577E();
        float fMo597o = interfaceC0193O0.mo597o();
        if (interfaceC0193O0.mo583a() < 1.0f) {
            C18903m c18903mM15630h = this.f1018t0;
            if (c18903mM15630h == null) {
                c18903mM15630h = AbstractC14334L.m15630h();
                this.f1018t0 = c18903mM15630h;
            }
            c18903mM15630h.m20220d(interfaceC0193O0.mo583a());
            canvasM15725a.saveLayer(fMo599q, fMo574B, fMo577E, fMo597o, (Paint) c18903mM15630h.f60268b);
        } else {
            interfaceC14362r.mo15706e();
        }
        interfaceC14362r.mo15717p(fMo599q, fMo574B);
        interfaceC14362r.mo15708g(this.f1019u0.m810b(interfaceC0193O0));
        if (interfaceC0193O0.mo578F() || interfaceC0193O0.mo573A()) {
            this.f1015q0.m819a(interfaceC14362r);
        }
        C20567q c20567q = this.f1012Z;
        if (c20567q != null) {
            c20567q.invoke(interfaceC14362r, null);
        }
        interfaceC14362r.mo15719r();
        m864l(false);
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: d */
    public final long mo541d(long j10, boolean z6) {
        InterfaceC0193O0 interfaceC0193O0 = this.f1022x0;
        C0241d1 c0241d1 = this.f1019u0;
        if (!z6) {
            return C14328F.m15603b(j10, c0241d1.m810b(interfaceC0193O0));
        }
        float[] fArrM809a = c0241d1.m809a(interfaceC0193O0);
        if (fArrM809a != null) {
            return C14328F.m15603b(j10, fArrM809a);
        }
        return 9187343241974906880L;
    }

    @Override // p1140z1.InterfaceC21687d0
    public final void destroy() {
        InterfaceC0193O0 interfaceC0193O0 = this.f1022x0;
        if (interfaceC0193O0.mo590h()) {
            interfaceC0193O0.mo588f();
        }
        this.f1012Z = null;
        this.f1013o0 = null;
        this.f1016r0 = true;
        m864l(false);
        AndroidComposeView androidComposeView = this.f1011Y;
        androidComposeView.f32773N0 = true;
        androidComposeView.m11332C(this);
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: e */
    public final void mo542e(C20567q c20567q, C20714I0 c20714i0) {
        m864l(false);
        this.f1016r0 = false;
        this.f1017s0 = false;
        this.f1021w0 = C14343V.f45023b;
        this.f1012Z = c20567q;
        this.f1013o0 = c20714i0;
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: f */
    public final void mo543f(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        float fM15668b = C14343V.m15668b(this.f1021w0) * i10;
        InterfaceC0193O0 interfaceC0193O0 = this.f1022x0;
        interfaceC0193O0.mo600r(fM15668b);
        interfaceC0193O0.mo603u(C14343V.m15669c(this.f1021w0) * i11);
        if (interfaceC0193O0.mo602t(interfaceC0193O0.mo599q(), interfaceC0193O0.mo574B(), interfaceC0193O0.mo599q() + i10, interfaceC0193O0.mo574B() + i11)) {
            interfaceC0193O0.mo607y(this.f1015q0.m820b());
            if (!this.f1014p0 && !this.f1016r0) {
                this.f1011Y.invalidate();
                m864l(true);
            }
            this.f1019u0.m811c();
        }
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: g */
    public final void mo544g(C14336N c14336n) {
        C20714I0 c20714i0;
        int i10 = c14336n.f44984Y | this.f1023y0;
        int i11 = i10 & 4096;
        if (i11 != 0) {
            this.f1021w0 = c14336n.f44997z0;
        }
        InterfaceC0193O0 interfaceC0193O0 = this.f1022x0;
        boolean zMo578F = interfaceC0193O0.mo578F();
        C0252g1 c0252g1 = this.f1015q0;
        boolean z6 = false;
        boolean z10 = zMo578F && c0252g1.f950g;
        if ((i10 & 1) != 0) {
            interfaceC0193O0.mo592j(c14336n.f44985Z);
        }
        if ((i10 & 2) != 0) {
            interfaceC0193O0.mo589g(c14336n.f44986o0);
        }
        if ((i10 & 4) != 0) {
            interfaceC0193O0.mo591i(c14336n.f44987p0);
        }
        if ((i10 & 8) != 0) {
            interfaceC0193O0.mo593k(c14336n.f44988q0);
        }
        if ((i10 & 16) != 0) {
            interfaceC0193O0.mo587e(c14336n.f44989r0);
        }
        if ((i10 & 32) != 0) {
            interfaceC0193O0.mo604v(c14336n.f44990s0);
        }
        if ((i10 & 64) != 0) {
            interfaceC0193O0.mo575C(AbstractC14334L.m15617F(c14336n.f44991t0));
        }
        if ((i10 & 128) != 0) {
            interfaceC0193O0.mo580H(AbstractC14334L.m15617F(c14336n.f44992u0));
        }
        if ((i10 & 1024) != 0) {
            interfaceC0193O0.mo586d(c14336n.f44995x0);
        }
        if ((i10 & 256) != 0) {
            interfaceC0193O0.mo595m(c14336n.f44993v0);
        }
        if ((i10 & 512) != 0) {
            interfaceC0193O0.mo584b(c14336n.f44994w0);
        }
        if ((i10 & 2048) != 0) {
            interfaceC0193O0.mo594l(c14336n.f44996y0);
        }
        if (i11 != 0) {
            interfaceC0193O0.mo600r(C14343V.m15668b(this.f1021w0) * interfaceC0193O0.getWidth());
            interfaceC0193O0.mo603u(C14343V.m15669c(this.f1021w0) * interfaceC0193O0.getHeight());
        }
        boolean z11 = c14336n.f44978B0;
        C15370i c15370i = AbstractC14334L.f44973a;
        boolean z12 = z11 && c14336n.f44977A0 != c15370i;
        if ((i10 & 24576) != 0) {
            interfaceC0193O0.mo579G(z12);
            interfaceC0193O0.mo601s(c14336n.f44978B0 && c14336n.f44977A0 == c15370i);
        }
        if ((131072 & i10) != 0) {
            interfaceC0193O0.mo585c();
        }
        if ((32768 & i10) != 0) {
            interfaceC0193O0.mo606x(c14336n.f44979C0);
        }
        boolean zM821c = this.f1015q0.m821c(c14336n.f44983G0, c14336n.f44987p0, z12, c14336n.f44990s0, c14336n.f44980D0);
        if (c0252g1.f949f) {
            interfaceC0193O0.mo607y(c0252g1.m820b());
        }
        if (z12 && c0252g1.f950g) {
            z6 = true;
        }
        AndroidComposeView androidComposeView = this.f1011Y;
        if (z10 != z6 || (z6 && zM821c)) {
            if (!this.f1014p0 && !this.f1016r0) {
                androidComposeView.invalidate();
                m864l(true);
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0242d2.f902a.m812a(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
        if (!this.f1017s0 && interfaceC0193O0.mo582J() > 0.0f && (c20714i0 = this.f1013o0) != null) {
            c20714i0.invoke();
        }
        if ((i10 & 7963) != 0) {
            this.f1019u0.m811c();
        }
        this.f1023y0 = c14336n.f44984Y;
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: h */
    public final void mo545h(C10235r c10235r, boolean z6) {
        InterfaceC0193O0 interfaceC0193O0 = this.f1022x0;
        C0241d1 c0241d1 = this.f1019u0;
        if (!z6) {
            C14328F.m15604c(c0241d1.m810b(interfaceC0193O0), c10235r);
            return;
        }
        float[] fArrM809a = c0241d1.m809a(interfaceC0193O0);
        if (fArrM809a != null) {
            C14328F.m15604c(fArrM809a, c10235r);
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
        float[] fArrM809a = this.f1019u0.m809a(this.f1022x0);
        if (fArrM809a != null) {
            C14328F.m15608g(fArr, fArrM809a);
        }
    }

    @Override // p1140z1.InterfaceC21687d0
    public final void invalidate() {
        if (this.f1014p0 || this.f1016r0) {
            return;
        }
        this.f1011Y.invalidate();
        m864l(true);
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: j */
    public final void mo547j(long j10) {
        InterfaceC0193O0 interfaceC0193O0 = this.f1022x0;
        int iMo599q = interfaceC0193O0.mo599q();
        int iMo574B = interfaceC0193O0.mo574B();
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (iMo599q == i10 && iMo574B == i11) {
            return;
        }
        if (iMo599q != i10) {
            interfaceC0193O0.mo596n(i10 - iMo599q);
        }
        if (iMo574B != i11) {
            interfaceC0193O0.mo605w(i11 - iMo574B);
        }
        int i12 = Build.VERSION.SDK_INT;
        AndroidComposeView androidComposeView = this.f1011Y;
        if (i12 >= 26) {
            C0242d2.f902a.m812a(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
        this.f1019u0.m811c();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: k */
    public final void mo548k() {
        InterfaceC14333K interfaceC14333K;
        boolean z6 = this.f1014p0;
        InterfaceC0193O0 interfaceC0193O0 = this.f1022x0;
        if (z6 || !interfaceC0193O0.mo590h()) {
            if (interfaceC0193O0.mo578F()) {
                C0252g1 c0252g1 = this.f1015q0;
                if (c0252g1.f950g) {
                    c0252g1.m822d();
                    interfaceC14333K = c0252g1.f948e;
                } else {
                    interfaceC14333K = null;
                }
            } else {
                interfaceC14333K = null;
            }
            C20567q c20567q = this.f1012Z;
            if (c20567q != null) {
                interfaceC0193O0.mo576D(this.f1020v0, interfaceC14333K, new C0254h0(c20567q, 4));
            }
            m864l(false);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m864l(boolean z6) {
        if (z6 != this.f1014p0) {
            this.f1014p0 = z6;
            this.f1011Y.m11347u(this, z6);
        }
    }
}
