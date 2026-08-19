package p003A1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import p774h1.AbstractC14334L;
import p774h1.C14347c;
import p774h1.C14363s;
import p774h1.InterfaceC14333K;

/* JADX INFO: renamed from: A1.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0273n1 implements InterfaceC0193O0 {

    /* JADX INFO: renamed from: a */
    public final RenderNode f996a = AbstractC0209U.m660d();

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: A */
    public final boolean mo573A() {
        return this.f996a.getClipToBounds();
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: B */
    public final int mo574B() {
        return this.f996a.getTop();
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: C */
    public final void mo575C(int i10) {
        this.f996a.setAmbientShadowColor(i10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: D */
    public final void mo576D(C14363s c14363s, InterfaceC14333K interfaceC14333K, C0254h0 c0254h0) {
        RecordingCanvas recordingCanvasBeginRecording = this.f996a.beginRecording();
        C14347c c14347c = c14363s.f45050a;
        Canvas canvas = c14347c.f45028a;
        c14347c.f45028a = recordingCanvasBeginRecording;
        if (interfaceC14333K != null) {
            c14347c.mo15706e();
            c14347c.mo15722u(interfaceC14333K, 1);
        }
        c0254h0.invoke(c14347c);
        if (interfaceC14333K != null) {
            c14347c.mo15719r();
        }
        c14363s.f45050a.f45028a = canvas;
        this.f996a.endRecording();
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: E */
    public final int mo577E() {
        return this.f996a.getRight();
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: F */
    public final boolean mo578F() {
        return this.f996a.getClipToOutline();
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: G */
    public final void mo579G(boolean z6) {
        this.f996a.setClipToOutline(z6);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: H */
    public final void mo580H(int i10) {
        this.f996a.setSpotShadowColor(i10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: I */
    public final void mo581I(Matrix matrix) {
        this.f996a.getMatrix(matrix);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: J */
    public final float mo582J() {
        return this.f996a.getElevation();
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: a */
    public final float mo583a() {
        return this.f996a.getAlpha();
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: b */
    public final void mo584b(float f10) {
        this.f996a.setRotationY(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: c */
    public final void mo585c() {
        if (Build.VERSION.SDK_INT >= 31) {
            C0276o1.f1003a.m861a(this.f996a, null);
        }
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: d */
    public final void mo586d(float f10) {
        this.f996a.setRotationZ(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: e */
    public final void mo587e(float f10) {
        this.f996a.setTranslationY(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: f */
    public final void mo588f() {
        this.f996a.discardDisplayList();
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: g */
    public final void mo589g(float f10) {
        this.f996a.setScaleY(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    public final int getHeight() {
        return this.f996a.getHeight();
    }

    @Override // p003A1.InterfaceC0193O0
    public final int getWidth() {
        return this.f996a.getWidth();
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: h */
    public final boolean mo590h() {
        return this.f996a.hasDisplayList();
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: i */
    public final void mo591i(float f10) {
        this.f996a.setAlpha(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: j */
    public final void mo592j(float f10) {
        this.f996a.setScaleX(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: k */
    public final void mo593k(float f10) {
        this.f996a.setTranslationX(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: l */
    public final void mo594l(float f10) {
        this.f996a.setCameraDistance(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: m */
    public final void mo595m(float f10) {
        this.f996a.setRotationX(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: n */
    public final void mo596n(int i10) {
        this.f996a.offsetLeftAndRight(i10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: o */
    public final int mo597o() {
        return this.f996a.getBottom();
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: p */
    public final void mo598p(Canvas canvas) {
        canvas.drawRenderNode(this.f996a);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: q */
    public final int mo599q() {
        return this.f996a.getLeft();
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: r */
    public final void mo600r(float f10) {
        this.f996a.setPivotX(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: s */
    public final void mo601s(boolean z6) {
        this.f996a.setClipToBounds(z6);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: t */
    public final boolean mo602t(int i10, int i11, int i12, int i13) {
        return this.f996a.setPosition(i10, i11, i12, i13);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: u */
    public final void mo603u(float f10) {
        this.f996a.setPivotY(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: v */
    public final void mo604v(float f10) {
        this.f996a.setElevation(f10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: w */
    public final void mo605w(int i10) {
        this.f996a.offsetTopAndBottom(i10);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: x */
    public final void mo606x(int i10) {
        RenderNode renderNode = this.f996a;
        if (AbstractC14334L.m15640r(i10, 1)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (AbstractC14334L.m15640r(i10, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: y */
    public final void mo607y(Outline outline) {
        this.f996a.setOutline(outline);
    }

    @Override // p003A1.InterfaceC0193O0
    /* JADX INFO: renamed from: z */
    public final boolean mo608z() {
        return this.f996a.setHasOverlappingRendering(true);
    }
}
