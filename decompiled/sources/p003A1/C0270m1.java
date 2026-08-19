package p003A1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.p650ui.platform.AndroidComposeView;
import p774h1.AbstractC14334L;
import p774h1.C14347c;
import p774h1.C14363s;
import p774h1.InterfaceC14333K;

/* JADX INFO: renamed from: A1.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0270m1 implements InterfaceC0193O0 {

    /* JADX INFO: renamed from: g */
    public static boolean f984g = true;

    /* JADX INFO: renamed from: a */
    public final RenderNode f985a;

    /* JADX INFO: renamed from: b */
    public int f986b;

    /* JADX INFO: renamed from: c */
    public int f987c;

    /* JADX INFO: renamed from: d */
    public int f988d;

    /* JADX INFO: renamed from: e */
    public int f989e;

    /* JADX INFO: renamed from: f */
    public boolean f990f;

    public C0270m1(AndroidComposeView androidComposeView) {
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.f985a = renderNodeCreate;
        if (f984g) {
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
                C0288s1 c0288s1 = C0288s1.f1040a;
                c0288s1.m869c(renderNodeCreate, c0288s1.m867a(renderNodeCreate));
                c0288s1.m870d(renderNodeCreate, c0288s1.m868b(renderNodeCreate));
            }
            if (i10 >= 24) {
                C0285r1.f1035a.m866a(renderNodeCreate);
            } else {
                C0282q1.f1032a.m865a(renderNodeCreate);
            }
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f984g = false;
        }
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: A */
    public final boolean mo573A() {
        return this.f990f;
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: B */
    public final int mo574B() {
        return this.f987c;
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: C */
    public final void mo575C(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            C0288s1.f1040a.m869c(this.f985a, i10);
        }
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: D */
    public final void mo576D(C14363s c14363s, InterfaceC14333K interfaceC14333K, C0254h0 c0254h0) {
        DisplayListCanvas displayListCanvasStart = this.f985a.start(getWidth(), getHeight());
        Canvas canvasM15723v = c14363s.m15771a().m15723v();
        c14363s.m15771a().m15724w((Canvas) displayListCanvasStart);
        C14347c c14347cM15771a = c14363s.m15771a();
        if (interfaceC14333K != null) {
            c14347cM15771a.mo15706e();
            c14347cM15771a.mo15722u(interfaceC14333K, 1);
        }
        c0254h0.invoke(c14347cM15771a);
        if (interfaceC14333K != null) {
            c14347cM15771a.mo15719r();
        }
        c14363s.m15771a().m15724w(canvasM15723v);
        this.f985a.end(displayListCanvasStart);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: E */
    public final int mo577E() {
        return this.f988d;
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: F */
    public final boolean mo578F() {
        return this.f985a.getClipToOutline();
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: G */
    public final void mo579G(boolean z6) {
        this.f985a.setClipToOutline(z6);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: H */
    public final void mo580H(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            C0288s1.f1040a.m870d(this.f985a, i10);
        }
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: I */
    public final void mo581I(Matrix matrix) {
        this.f985a.getMatrix(matrix);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: J */
    public final float mo582J() {
        return this.f985a.getElevation();
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: a */
    public final float mo583a() {
        return this.f985a.getAlpha();
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: b */
    public final void mo584b(float f10) {
        this.f985a.setRotationY(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: d */
    public final void mo586d(float f10) {
        this.f985a.setRotation(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: e */
    public final void mo587e(float f10) {
        this.f985a.setTranslationY(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: f */
    public final void mo588f() {
        if (Build.VERSION.SDK_INT >= 24) {
            C0285r1.f1035a.m866a(this.f985a);
        } else {
            C0282q1.f1032a.m865a(this.f985a);
        }
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: g */
    public final void mo589g(float f10) {
        this.f985a.setScaleY(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    public final int getHeight() {
        return this.f989e - this.f987c;
    }

    @Override // p003A1.InterfaceC0193O0
    public final int getWidth() {
        return this.f988d - this.f986b;
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: h */
    public final boolean mo590h() {
        return this.f985a.isValid();
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: i */
    public final void mo591i(float f10) {
        this.f985a.setAlpha(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: j */
    public final void mo592j(float f10) {
        this.f985a.setScaleX(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: k */
    public final void mo593k(float f10) {
        this.f985a.setTranslationX(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: l */
    public final void mo594l(float f10) {
        this.f985a.setCameraDistance(-f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: m */
    public final void mo595m(float f10) {
        this.f985a.setRotationX(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: n */
    public final void mo596n(int i10) {
        this.f986b += i10;
        this.f988d += i10;
        this.f985a.offsetLeftAndRight(i10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: o */
    public final int mo597o() {
        return this.f989e;
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: p */
    public final void mo598p(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f985a);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: q */
    public final int mo599q() {
        return this.f986b;
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: r */
    public final void mo600r(float f10) {
        this.f985a.setPivotX(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: s */
    public final void mo601s(boolean z6) {
        this.f990f = z6;
        this.f985a.setClipToBounds(z6);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: t */
    public final boolean mo602t(int i10, int i11, int i12, int i13) {
        this.f986b = i10;
        this.f987c = i11;
        this.f988d = i12;
        this.f989e = i13;
        return this.f985a.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: u */
    public final void mo603u(float f10) {
        this.f985a.setPivotY(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: v */
    public final void mo604v(float f10) {
        this.f985a.setElevation(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: w */
    public final void mo605w(int i10) {
        this.f987c += i10;
        this.f989e += i10;
        this.f985a.offsetTopAndBottom(i10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: x */
    public final void mo606x(int i10) {
        if (AbstractC14334L.m15640r(i10, 1)) {
            this.f985a.setLayerType(2);
            this.f985a.setHasOverlappingRendering(true);
        } else if (AbstractC14334L.m15640r(i10, 2)) {
            this.f985a.setLayerType(0);
            this.f985a.setHasOverlappingRendering(false);
        } else {
            this.f985a.setLayerType(0);
            this.f985a.setHasOverlappingRendering(true);
        }
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: y */
    public final void mo607y(Outline outline) {
        this.f985a.setOutline(outline);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: z */
    public final boolean mo608z() {
        return this.f985a.setHasOverlappingRendering(true);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: c */
    public final void mo585c() {
    }
}
