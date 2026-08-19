package p003A1;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.p650ui.platform.AndroidComposeView;
import io.sentry.hints.C15370i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16544l;
import p1062vd.C20567q;
import p1071w0.C20714I0;
import p1140z1.InterfaceC21687d0;
import p615Z6.C10235r;
import p759g1.C13800b;
import p774h1.AbstractC14332J;
import p774h1.AbstractC14334L;
import p774h1.C14328F;
import p774h1.C14336N;
import p774h1.C14343V;
import p774h1.C14347c;
import p774h1.C14363s;
import p774h1.InterfaceC14333K;
import p774h1.InterfaceC14362r;
import p843k1.C16308b;

/* JADX INFO: renamed from: A1.G1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0170G1 extends View implements InterfaceC21687d0 {

    /* JADX INFO: renamed from: D0 */
    public static final C0164E1 f650D0 = new C0164E1(0);

    /* JADX INFO: renamed from: E0 */
    public static Method f651E0;

    /* JADX INFO: renamed from: F0 */
    public static Field f652F0;

    /* JADX INFO: renamed from: G0 */
    public static boolean f653G0;

    /* JADX INFO: renamed from: H0 */
    public static boolean f654H0;

    /* JADX INFO: renamed from: A0 */
    public boolean f655A0;

    /* JADX INFO: renamed from: B0 */
    public final long f656B0;

    /* JADX INFO: renamed from: C0 */
    public int f657C0;

    /* JADX INFO: renamed from: o0 */
    public final AndroidComposeView f658o0;

    /* JADX INFO: renamed from: p0 */
    public final C0207T0 f659p0;

    /* JADX INFO: renamed from: q0 */
    public C20567q f660q0;

    /* JADX INFO: renamed from: r0 */
    public C20714I0 f661r0;

    /* JADX INFO: renamed from: s0 */
    public final C0252g1 f662s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f663t0;

    /* JADX INFO: renamed from: u0 */
    public Rect f664u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f665v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f666w0;

    /* JADX INFO: renamed from: x0 */
    public final C14363s f667x0;

    /* JADX INFO: renamed from: y0 */
    public final C0241d1 f668y0;

    /* JADX INFO: renamed from: z0 */
    public long f669z0;

    public C0170G1(AndroidComposeView androidComposeView, C0207T0 c0207t0, C20567q c20567q, C20714I0 c20714i0) {
        super(androidComposeView.getContext());
        this.f658o0 = androidComposeView;
        this.f659p0 = c0207t0;
        this.f660q0 = c20567q;
        this.f661r0 = c20714i0;
        this.f662s0 = new C0252g1();
        this.f667x0 = new C14363s();
        this.f668y0 = new C0241d1(C0198Q.f739q0);
        this.f669z0 = C14343V.f45023b;
        this.f655A0 = true;
        setWillNotDraw(false);
        c0207t0.addView(this);
        this.f656B0 = View.generateViewId();
    }

    private final InterfaceC14333K getManualClipPath() {
        if (getClipToOutline()) {
            C0252g1 c0252g1 = this.f662s0;
            if (c0252g1.f950g) {
                c0252g1.m822d();
                return c0252g1.f948e;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z6) {
        if (z6 != this.f665v0) {
            this.f665v0 = z6;
            this.f658o0.m11347u(this, z6);
        }
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: a */
    public final void mo538a(float[] fArr) {
        C14328F.m15608g(fArr, this.f668y0.m810b(this));
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: b */
    public final boolean mo539b(long j10) {
        AbstractC14332J abstractC14332J;
        float fM15306g = C13800b.m15306g(j10);
        float fM15307h = C13800b.m15307h(j10);
        if (this.f663t0) {
            return 0.0f <= fM15306g && fM15306g < ((float) getWidth()) && 0.0f <= fM15307h && fM15307h < ((float) getHeight());
        }
        if (!getClipToOutline()) {
            return true;
        }
        C0252g1 c0252g1 = this.f662s0;
        if (c0252g1.f956m && (abstractC14332J = c0252g1.f946c) != null) {
            return AbstractC0240d0.m800k(abstractC14332J, C13800b.m15306g(j10), C13800b.m15307h(j10), null, null);
        }
        return true;
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: c */
    public final void mo540c(InterfaceC14362r interfaceC14362r, C16308b c16308b) {
        boolean z6 = getElevation() > 0.0f;
        this.f666w0 = z6;
        if (z6) {
            interfaceC14362r.mo15721t();
        }
        this.f659p0.m652a(interfaceC14362r, this, getDrawingTime());
        if (this.f666w0) {
            interfaceC14362r.mo15707f();
        }
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: d */
    public final long mo541d(long j10, boolean z6) {
        C0241d1 c0241d1 = this.f668y0;
        if (!z6) {
            return C14328F.m15603b(j10, c0241d1.m810b(this));
        }
        float[] fArrM809a = c0241d1.m809a(this);
        if (fArrM809a != null) {
            return C14328F.m15603b(j10, fArrM809a);
        }
        return 9187343241974906880L;
    }

    @Override // p1140z1.InterfaceC21687d0
    public final void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.f658o0;
        androidComposeView.f32773N0 = true;
        this.f660q0 = null;
        this.f661r0 = null;
        androidComposeView.m11332C(this);
        this.f659p0.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z6;
        C14363s c14363s = this.f667x0;
        C14347c c14347c = c14363s.f45050a;
        Canvas canvas2 = c14347c.f45028a;
        c14347c.f45028a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z6 = false;
        } else {
            c14347c.mo15706e();
            this.f662s0.m819a(c14347c);
            z6 = true;
        }
        C20567q c20567q = this.f660q0;
        if (c20567q != null) {
            c20567q.invoke(c14347c, null);
        }
        if (z6) {
            c14347c.mo15719r();
        }
        c14363s.f45050a.f45028a = canvas2;
        setInvalidated(false);
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: e */
    public final void mo542e(C20567q c20567q, C20714I0 c20714i0) {
        this.f659p0.addView(this);
        this.f663t0 = false;
        this.f666w0 = false;
        this.f669z0 = C14343V.f45023b;
        this.f660q0 = c20567q;
        this.f661r0 = c20714i0;
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: f */
    public final void mo543f(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (i10 == getWidth() && i11 == getHeight()) {
            return;
        }
        setPivotX(C14343V.m15668b(this.f669z0) * i10);
        setPivotY(C14343V.m15669c(this.f669z0) * i11);
        setOutlineProvider(this.f662s0.m820b() != null ? f650D0 : null);
        layout(getLeft(), getTop(), getLeft() + i10, getTop() + i11);
        m549l();
        this.f668y0.m811c();
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: g */
    public final void mo544g(C14336N c14336n) {
        C20714I0 c20714i0;
        int i10 = c14336n.f44984Y | this.f657C0;
        if ((i10 & 4096) != 0) {
            long j10 = c14336n.f44997z0;
            this.f669z0 = j10;
            setPivotX(C14343V.m15668b(j10) * getWidth());
            setPivotY(C14343V.m15669c(this.f669z0) * getHeight());
        }
        if ((i10 & 1) != 0) {
            setScaleX(c14336n.f44985Z);
        }
        if ((i10 & 2) != 0) {
            setScaleY(c14336n.f44986o0);
        }
        if ((i10 & 4) != 0) {
            setAlpha(c14336n.f44987p0);
        }
        if ((i10 & 8) != 0) {
            setTranslationX(c14336n.f44988q0);
        }
        if ((i10 & 16) != 0) {
            setTranslationY(c14336n.f44989r0);
        }
        if ((i10 & 32) != 0) {
            setElevation(c14336n.f44990s0);
        }
        if ((i10 & 1024) != 0) {
            setRotation(c14336n.f44995x0);
        }
        if ((i10 & 256) != 0) {
            setRotationX(c14336n.f44993v0);
        }
        if ((i10 & 512) != 0) {
            setRotationY(c14336n.f44994w0);
        }
        if ((i10 & 2048) != 0) {
            setCameraDistancePx(c14336n.f44996y0);
        }
        boolean z6 = true;
        boolean z10 = getManualClipPath() != null;
        boolean z11 = c14336n.f44978B0;
        C15370i c15370i = AbstractC14334L.f44973a;
        boolean z12 = z11 && c14336n.f44977A0 != c15370i;
        if ((i10 & 24576) != 0) {
            this.f663t0 = z11 && c14336n.f44977A0 == c15370i;
            m549l();
            setClipToOutline(z12);
        }
        boolean zM821c = this.f662s0.m821c(c14336n.f44983G0, c14336n.f44987p0, z12, c14336n.f44990s0, c14336n.f44980D0);
        C0252g1 c0252g1 = this.f662s0;
        if (c0252g1.f949f) {
            setOutlineProvider(c0252g1.m820b() != null ? f650D0 : null);
        }
        boolean z13 = getManualClipPath() != null;
        if (z10 != z13 || (z13 && zM821c)) {
            invalidate();
        }
        if (!this.f666w0 && getElevation() > 0.0f && (c20714i0 = this.f661r0) != null) {
            c20714i0.invoke();
        }
        if ((i10 & 7963) != 0) {
            this.f668y0.m811c();
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = i10 & 64;
            C0176I1 c0176i1 = C0176I1.f673a;
            if (i12 != 0) {
                c0176i1.m556a(this, AbstractC14334L.m15617F(c14336n.f44991t0));
            }
            if ((i10 & 128) != 0) {
                c0176i1.m557b(this, AbstractC14334L.m15617F(c14336n.f44992u0));
            }
        }
        if (i11 >= 31 && (131072 & i10) != 0) {
            C0179J1.f677a.m559a(this, null);
        }
        if ((i10 & 32768) != 0) {
            int i13 = c14336n.f44979C0;
            if (AbstractC14334L.m15640r(i13, 1)) {
                setLayerType(2, null);
            } else if (AbstractC14334L.m15640r(i13, 2)) {
                setLayerType(0, null);
                z6 = false;
            } else {
                setLayerType(0, null);
            }
            this.f655A0 = z6;
        }
        this.f657C0 = c14336n.f44984Y;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final C0207T0 getContainer() {
        return this.f659p0;
    }

    public long getLayerId() {
        return this.f656B0;
    }

    public final AndroidComposeView getOwnerView() {
        return this.f658o0;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0167F1.m505a(this.f658o0);
        }
        return -1L;
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: h */
    public final void mo545h(C10235r c10235r, boolean z6) {
        C0241d1 c0241d1 = this.f668y0;
        if (!z6) {
            C14328F.m15604c(c0241d1.m810b(this), c10235r);
            return;
        }
        float[] fArrM809a = c0241d1.m809a(this);
        if (fArrM809a != null) {
            C14328F.m15604c(fArrM809a, c10235r);
            return;
        }
        c10235r.f30390b = 0.0f;
        c10235r.f30391c = 0.0f;
        c10235r.f30392d = 0.0f;
        c10235r.f30393e = 0.0f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f655A0;
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: i */
    public final void mo546i(float[] fArr) {
        float[] fArrM809a = this.f668y0.m809a(this);
        if (fArrM809a != null) {
            C14328F.m15608g(fArr, fArrM809a);
        }
    }

    @Override // android.view.View, p1140z1.InterfaceC21687d0
    public final void invalidate() {
        if (this.f665v0) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f658o0.invalidate();
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: j */
    public final void mo547j(long j10) {
        int i10 = (int) (j10 >> 32);
        int left = getLeft();
        C0241d1 c0241d1 = this.f668y0;
        if (i10 != left) {
            offsetLeftAndRight(i10 - getLeft());
            c0241d1.m811c();
        }
        int i11 = (int) (j10 & 4294967295L);
        if (i11 != getTop()) {
            offsetTopAndBottom(i11 - getTop());
            c0241d1.m811c();
        }
    }

    @Override // p1140z1.InterfaceC21687d0
    /* JADX INFO: renamed from: k */
    public final void mo548k() {
        if (!this.f665v0 || f654H0) {
            return;
        }
        AbstractC0240d0.m808s(this);
        setInvalidated(false);
    }

    /* JADX INFO: renamed from: l */
    public final void m549l() {
        Rect rect;
        if (this.f663t0) {
            Rect rect2 = this.f664u0;
            if (rect2 == null) {
                this.f664u0 = new Rect(0, 0, getWidth(), getHeight());
            } else {
                AbstractC16544l.m18091d(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f664u0;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
    }
}
