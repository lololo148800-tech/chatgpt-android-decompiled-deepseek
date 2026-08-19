package p843k1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.p650ui.platform.AndroidComposeView;
import fo.C13711h;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import p492U1.C7545j;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8088f6;
import p544W9.AbstractC8596Z3;
import p571X9.AbstractC9113C4;
import p749fd.C13628m;
import p759g1.C13800b;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14348d;
import p774h1.C14347c;
import p774h1.C14363s;
import p774h1.C14365u;
import p774h1.InterfaceC14362r;
import p821j1.C16037b;

/* JADX INFO: renamed from: k1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C16311e implements InterfaceC16310d {

    /* JADX INFO: renamed from: A */
    public static final AtomicBoolean f50544A = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b */
    public final C14363s f50545b;

    /* JADX INFO: renamed from: c */
    public final C16037b f50546c;

    /* JADX INFO: renamed from: d */
    public final RenderNode f50547d;

    /* JADX INFO: renamed from: e */
    public long f50548e;

    /* JADX INFO: renamed from: f */
    public Matrix f50549f;

    /* JADX INFO: renamed from: g */
    public boolean f50550g;

    /* JADX INFO: renamed from: h */
    public long f50551h;

    /* JADX INFO: renamed from: i */
    public int f50552i;

    /* JADX INFO: renamed from: j */
    public final int f50553j;

    /* JADX INFO: renamed from: k */
    public float f50554k;

    /* JADX INFO: renamed from: l */
    public boolean f50555l;

    /* JADX INFO: renamed from: m */
    public float f50556m;

    /* JADX INFO: renamed from: n */
    public float f50557n;

    /* JADX INFO: renamed from: o */
    public float f50558o;

    /* JADX INFO: renamed from: p */
    public float f50559p;

    /* JADX INFO: renamed from: q */
    public float f50560q;

    /* JADX INFO: renamed from: r */
    public long f50561r;

    /* JADX INFO: renamed from: s */
    public long f50562s;

    /* JADX INFO: renamed from: t */
    public float f50563t;

    /* JADX INFO: renamed from: u */
    public float f50564u;

    /* JADX INFO: renamed from: v */
    public float f50565v;

    /* JADX INFO: renamed from: w */
    public float f50566w;

    /* JADX INFO: renamed from: x */
    public boolean f50567x;

    /* JADX INFO: renamed from: y */
    public boolean f50568y;

    /* JADX INFO: renamed from: z */
    public boolean f50569z;

    public C16311e(AndroidComposeView androidComposeView, C14363s c14363s, C16037b c16037b) {
        this.f50545b = c14363s;
        this.f50546c = c16037b;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.f50547d = renderNodeCreate;
        this.f50548e = 0L;
        this.f50551h = 0L;
        if (f50544A.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                C16320n c16320n = C16320n.f50623a;
                c16320n.m17916c(renderNodeCreate, c16320n.m17914a(renderNodeCreate));
                c16320n.m17917d(renderNodeCreate, c16320n.m17915b(renderNodeCreate));
            }
            if (i10 >= 24) {
                C16319m.f50622a.m17913a(renderNodeCreate);
            } else {
                C16318l.f50621a.m17912a(renderNodeCreate);
            }
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        m17876M(0);
        this.f50552i = 0;
        this.f50553j = 3;
        this.f50554k = 1.0f;
        this.f50556m = 1.0f;
        this.f50557n = 1.0f;
        int i11 = C14365u.f45061k;
        this.f50561r = AbstractC14334L.m15645w();
        this.f50562s = AbstractC14334L.m15645w();
        this.f50566w = 8.0f;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: A */
    public final void mo17838A(long j10, int i10, int i11) {
        this.f50547d.setLeftTopRightBottom(i10, i11, C7545j.m7888c(j10) + i10, C7545j.m7887b(j10) + i11);
        if (C7545j.m7886a(this.f50548e, j10)) {
            return;
        }
        if (this.f50555l) {
            this.f50547d.setPivotX(C7545j.m7888c(j10) / 2.0f);
            this.f50547d.setPivotY(C7545j.m7887b(j10) / 2.0f);
        }
        this.f50548e = j10;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: B */
    public final float mo17839B() {
        return this.f50558o;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: C */
    public final void mo17840C(boolean z6) {
        this.f50567x = z6;
        m17875L();
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: D */
    public final float mo17841D() {
        return this.f50563t;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: E */
    public final void mo17842E(int i10) {
        this.f50552i = i10;
        if (AbstractC8596Z3.m9257a(i10, 1) || !AbstractC14334L.m15639q(this.f50553j, 3)) {
            m17876M(1);
        } else {
            m17876M(this.f50552i);
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: F */
    public final void mo17843F(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f50562s = j10;
            C16320n.f50623a.m17917d(this.f50547d, AbstractC14334L.m15617F(j10));
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: G */
    public final Matrix mo17844G() {
        Matrix matrix = this.f50549f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f50549f = matrix;
        }
        this.f50547d.getMatrix(matrix);
        return matrix;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: H */
    public final void mo17845H(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k, C16308b c16308b, C13628m c13628m) {
        Canvas canvasStart = this.f50547d.start(Math.max(C7545j.m7888c(this.f50548e), C7545j.m7888c(this.f50551h)), Math.max(C7545j.m7887b(this.f50548e), C7545j.m7887b(this.f50551h)));
        try {
            C14363s c14363s = this.f50545b;
            Canvas canvasM15723v = c14363s.m15771a().m15723v();
            c14363s.m15771a().m15724w(canvasStart);
            C14347c c14347cM15771a = c14363s.m15771a();
            C16037b c16037b = this.f50546c;
            long jM9645c = AbstractC9113C4.m9645c(this.f50548e);
            InterfaceC7537b interfaceC7537bM15197n = c16037b.mo17601f0().m15197n();
            EnumC7546k enumC7546kM15201w = c16037b.mo17601f0().m15201w();
            InterfaceC14362r interfaceC14362rM15196m = c16037b.mo17601f0().m15196m();
            long jM15202x = c16037b.mo17601f0().m15202x();
            C16308b c16308bM15200v = c16037b.mo17601f0().m15200v();
            C13711h c13711hMo17601f0 = c16037b.mo17601f0();
            c13711hMo17601f0.m15186I(interfaceC7537b);
            c13711hMo17601f0.m15188K(enumC7546k);
            c13711hMo17601f0.m15185H(c14347cM15771a);
            c13711hMo17601f0.m15189L(jM9645c);
            c13711hMo17601f0.m15187J(c16308b);
            c14347cM15771a.mo15706e();
            try {
                c13628m.invoke(c16037b);
                c14347cM15771a.mo15719r();
                C13711h c13711hMo17601f1 = c16037b.mo17601f0();
                c13711hMo17601f1.m15186I(interfaceC7537bM15197n);
                c13711hMo17601f1.m15188K(enumC7546kM15201w);
                c13711hMo17601f1.m15185H(interfaceC14362rM15196m);
                c13711hMo17601f1.m15189L(jM15202x);
                c13711hMo17601f1.m15187J(c16308bM15200v);
                c14363s.m15771a().m15724w(canvasM15723v);
                this.f50547d.end(canvasStart);
            } catch (Throwable th2) {
                c14347cM15771a.mo15719r();
                C13711h c13711hMo17601f2 = c16037b.mo17601f0();
                c13711hMo17601f2.m15186I(interfaceC7537bM15197n);
                c13711hMo17601f2.m15188K(enumC7546kM15201w);
                c13711hMo17601f2.m15185H(interfaceC14362rM15196m);
                c13711hMo17601f2.m15189L(jM15202x);
                c13711hMo17601f2.m15187J(c16308bM15200v);
                throw th2;
            }
        } catch (Throwable th3) {
            this.f50547d.end(canvasStart);
            throw th3;
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: I */
    public final float mo17846I() {
        return this.f50560q;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: J */
    public final float mo17847J() {
        return this.f50557n;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: K */
    public final int mo17848K() {
        return this.f50553j;
    }

    /* JADX INFO: renamed from: L */
    public final void m17875L() {
        boolean z6 = this.f50567x;
        boolean z10 = false;
        boolean z11 = z6 && !this.f50550g;
        if (z6 && this.f50550g) {
            z10 = true;
        }
        if (z11 != this.f50568y) {
            this.f50568y = z11;
            this.f50547d.setClipToBounds(z11);
        }
        if (z10 != this.f50569z) {
            this.f50569z = z10;
            this.f50547d.setClipToOutline(z10);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m17876M(int i10) {
        RenderNode renderNode = this.f50547d;
        if (AbstractC8596Z3.m9257a(i10, 1)) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (AbstractC8596Z3.m9257a(i10, 2)) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: a */
    public final float mo17849a() {
        return this.f50554k;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: b */
    public final void mo17850b(float f10) {
        this.f50564u = f10;
        this.f50547d.setRotationY(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: d */
    public final void mo17852d(float f10) {
        this.f50565v = f10;
        this.f50547d.setRotation(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: e */
    public final void mo17853e(float f10) {
        this.f50559p = f10;
        this.f50547d.setTranslationY(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: f */
    public final void mo17854f() {
        if (Build.VERSION.SDK_INT >= 24) {
            C16319m.f50622a.m17913a(this.f50547d);
        } else {
            C16318l.f50621a.m17912a(this.f50547d);
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: g */
    public final void mo17855g(float f10) {
        this.f50557n = f10;
        this.f50547d.setScaleY(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: h */
    public final boolean mo17856h() {
        return this.f50547d.isValid();
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: i */
    public final void mo17857i(float f10) {
        this.f50554k = f10;
        this.f50547d.setAlpha(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: j */
    public final void mo17858j(float f10) {
        this.f50556m = f10;
        this.f50547d.setScaleX(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: k */
    public final void mo17859k(float f10) {
        this.f50558o = f10;
        this.f50547d.setTranslationX(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: l */
    public final void mo17860l(float f10) {
        this.f50566w = f10;
        this.f50547d.setCameraDistance(-f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: m */
    public final void mo17861m(float f10) {
        this.f50563t = f10;
        this.f50547d.setRotationX(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: n */
    public final float mo17862n() {
        return this.f50556m;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: o */
    public final void mo17863o(float f10) {
        this.f50560q = f10;
        this.f50547d.setElevation(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: p */
    public final void mo17864p(Outline outline, long j10) {
        this.f50551h = j10;
        this.f50547d.setOutline(outline);
        this.f50550g = outline != null;
        m17875L();
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: q */
    public final int mo17865q() {
        return this.f50552i;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: r */
    public final void mo17866r(InterfaceC14362r interfaceC14362r) {
        DisplayListCanvas displayListCanvasM15725a = AbstractC14348d.m15725a(interfaceC14362r);
        AbstractC16544l.m18092e(displayListCanvasM15725a, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasM15725a.drawRenderNode(this.f50547d);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: s */
    public final float mo17867s() {
        return this.f50564u;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: t */
    public final float mo17868t() {
        return this.f50565v;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: u */
    public final void mo17869u(long j10) {
        if (AbstractC8088f6.m8539e(j10)) {
            this.f50555l = true;
            this.f50547d.setPivotX(C7545j.m7888c(this.f50548e) / 2.0f);
            this.f50547d.setPivotY(C7545j.m7887b(this.f50548e) / 2.0f);
        } else {
            this.f50555l = false;
            this.f50547d.setPivotX(C13800b.m15306g(j10));
            this.f50547d.setPivotY(C13800b.m15307h(j10));
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: v */
    public final long mo17870v() {
        return this.f50561r;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: w */
    public final float mo17871w() {
        return this.f50559p;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: x */
    public final long mo17872x() {
        return this.f50562s;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: y */
    public final void mo17873y(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f50561r = j10;
            C16320n.f50623a.m17916c(this.f50547d, AbstractC14334L.m15617F(j10));
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: z */
    public final float mo17874z() {
        return this.f50566w;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: c */
    public final void mo17851c() {
    }
}
