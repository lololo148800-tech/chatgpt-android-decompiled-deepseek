package p843k1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import fo.C13711h;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8088f6;
import p544W9.AbstractC8596Z3;
import p571X9.AbstractC9113C4;
import p749fd.C13628m;
import p759g1.C13800b;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14348d;
import p774h1.AbstractC14357m;
import p774h1.C14347c;
import p774h1.C14363s;
import p774h1.C14365u;
import p774h1.InterfaceC14362r;
import p821j1.C16037b;

/* JADX INFO: renamed from: k1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C16313g implements InterfaceC16310d {

    /* JADX INFO: renamed from: b */
    public final C14363s f50570b;

    /* JADX INFO: renamed from: c */
    public final C16037b f50571c;

    /* JADX INFO: renamed from: d */
    public final RenderNode f50572d;

    /* JADX INFO: renamed from: e */
    public long f50573e;

    /* JADX INFO: renamed from: f */
    public Matrix f50574f;

    /* JADX INFO: renamed from: g */
    public boolean f50575g;

    /* JADX INFO: renamed from: h */
    public float f50576h;

    /* JADX INFO: renamed from: i */
    public final int f50577i;

    /* JADX INFO: renamed from: j */
    public float f50578j;

    /* JADX INFO: renamed from: k */
    public float f50579k;

    /* JADX INFO: renamed from: l */
    public float f50580l;

    /* JADX INFO: renamed from: m */
    public float f50581m;

    /* JADX INFO: renamed from: n */
    public float f50582n;

    /* JADX INFO: renamed from: o */
    public long f50583o;

    /* JADX INFO: renamed from: p */
    public long f50584p;

    /* JADX INFO: renamed from: q */
    public float f50585q;

    /* JADX INFO: renamed from: r */
    public float f50586r;

    /* JADX INFO: renamed from: s */
    public float f50587s;

    /* JADX INFO: renamed from: t */
    public float f50588t;

    /* JADX INFO: renamed from: u */
    public boolean f50589u;

    /* JADX INFO: renamed from: v */
    public boolean f50590v;

    /* JADX INFO: renamed from: w */
    public boolean f50591w;

    /* JADX INFO: renamed from: x */
    public int f50592x;

    public C16313g() {
        C14363s c14363s = new C14363s();
        C16037b c16037b = new C16037b();
        this.f50570b = c14363s;
        this.f50571c = c16037b;
        RenderNode renderNodeM15746d = AbstractC14357m.m15746d();
        this.f50572d = renderNodeM15746d;
        this.f50573e = 0L;
        renderNodeM15746d.setClipToBounds(false);
        m17907M(renderNodeM15746d, 0);
        this.f50576h = 1.0f;
        this.f50577i = 3;
        this.f50578j = 1.0f;
        this.f50579k = 1.0f;
        long j10 = C14365u.f45052b;
        this.f50583o = j10;
        this.f50584p = j10;
        this.f50588t = 8.0f;
        this.f50592x = 0;
    }

    /* JADX INFO: renamed from: M */
    public static void m17907M(RenderNode renderNode, int i10) {
        if (AbstractC8596Z3.m9257a(i10, 1)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (AbstractC8596Z3.m9257a(i10, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: A */
    public final void mo17838A(long j10, int i10, int i11) {
        this.f50572d.setPosition(i10, i11, ((int) (j10 >> 32)) + i10, ((int) (4294967295L & j10)) + i11);
        this.f50573e = AbstractC9113C4.m9645c(j10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: B */
    public final float mo17839B() {
        return this.f50580l;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: C */
    public final void mo17840C(boolean z6) {
        this.f50589u = z6;
        m17908L();
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: D */
    public final float mo17841D() {
        return this.f50585q;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: E */
    public final void mo17842E(int i10) {
        this.f50592x = i10;
        if (AbstractC8596Z3.m9257a(i10, 1) || !AbstractC14334L.m15639q(this.f50577i, 3)) {
            m17907M(this.f50572d, 1);
        } else {
            m17907M(this.f50572d, this.f50592x);
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: F */
    public final void mo17843F(long j10) {
        this.f50584p = j10;
        this.f50572d.setSpotShadowColor(AbstractC14334L.m15617F(j10));
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: G */
    public final Matrix mo17844G() {
        Matrix matrix = this.f50574f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f50574f = matrix;
        }
        this.f50572d.getMatrix(matrix);
        return matrix;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: H */
    public final void mo17845H(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k, C16308b c16308b, C13628m c13628m) {
        C16037b c16037b = this.f50571c;
        RecordingCanvas recordingCanvasBeginRecording = this.f50572d.beginRecording();
        try {
            C14363s c14363s = this.f50570b;
            C14347c c14347c = c14363s.f45050a;
            Canvas canvas = c14347c.f45028a;
            c14347c.f45028a = recordingCanvasBeginRecording;
            C13711h c13711h = c16037b.f49479Z;
            c13711h.m15186I(interfaceC7537b);
            c13711h.m15188K(enumC7546k);
            c13711h.f43260o0 = c16308b;
            c13711h.m15189L(this.f50573e);
            c13711h.m15185H(c14347c);
            c13628m.invoke(c16037b);
            c14363s.f45050a.f45028a = canvas;
        } finally {
            this.f50572d.endRecording();
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: I */
    public final float mo17846I() {
        return this.f50582n;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: J */
    public final float mo17847J() {
        return this.f50579k;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: K */
    public final int mo17848K() {
        return this.f50577i;
    }

    /* JADX INFO: renamed from: L */
    public final void m17908L() {
        boolean z6 = this.f50589u;
        boolean z10 = false;
        boolean z11 = z6 && !this.f50575g;
        if (z6 && this.f50575g) {
            z10 = true;
        }
        if (z11 != this.f50590v) {
            this.f50590v = z11;
            this.f50572d.setClipToBounds(z11);
        }
        if (z10 != this.f50591w) {
            this.f50591w = z10;
            this.f50572d.setClipToOutline(z10);
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: a */
    public final float mo17849a() {
        return this.f50576h;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: b */
    public final void mo17850b(float f10) {
        this.f50586r = f10;
        this.f50572d.setRotationY(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: c */
    public final void mo17851c() {
        if (Build.VERSION.SDK_INT >= 31) {
            C16321o.f50624a.m17918a(this.f50572d, null);
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: d */
    public final void mo17852d(float f10) {
        this.f50587s = f10;
        this.f50572d.setRotationZ(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: e */
    public final void mo17853e(float f10) {
        this.f50581m = f10;
        this.f50572d.setTranslationY(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: f */
    public final void mo17854f() {
        this.f50572d.discardDisplayList();
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: g */
    public final void mo17855g(float f10) {
        this.f50579k = f10;
        this.f50572d.setScaleY(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: h */
    public final boolean mo17856h() {
        return this.f50572d.hasDisplayList();
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: i */
    public final void mo17857i(float f10) {
        this.f50576h = f10;
        this.f50572d.setAlpha(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: j */
    public final void mo17858j(float f10) {
        this.f50578j = f10;
        this.f50572d.setScaleX(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: k */
    public final void mo17859k(float f10) {
        this.f50580l = f10;
        this.f50572d.setTranslationX(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: l */
    public final void mo17860l(float f10) {
        this.f50588t = f10;
        this.f50572d.setCameraDistance(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: m */
    public final void mo17861m(float f10) {
        this.f50585q = f10;
        this.f50572d.setRotationX(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: n */
    public final float mo17862n() {
        return this.f50578j;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: o */
    public final void mo17863o(float f10) {
        this.f50582n = f10;
        this.f50572d.setElevation(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: p */
    public final void mo17864p(Outline outline, long j10) {
        this.f50572d.setOutline(outline);
        this.f50575g = outline != null;
        m17908L();
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: q */
    public final int mo17865q() {
        return this.f50592x;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: r */
    public final void mo17866r(InterfaceC14362r interfaceC14362r) {
        AbstractC14348d.m15725a(interfaceC14362r).drawRenderNode(this.f50572d);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: s */
    public final float mo17867s() {
        return this.f50586r;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: t */
    public final float mo17868t() {
        return this.f50587s;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: u */
    public final void mo17869u(long j10) {
        if (AbstractC8088f6.m8539e(j10)) {
            this.f50572d.resetPivot();
        } else {
            this.f50572d.setPivotX(C13800b.m15306g(j10));
            this.f50572d.setPivotY(C13800b.m15307h(j10));
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: v */
    public final long mo17870v() {
        return this.f50583o;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: w */
    public final float mo17871w() {
        return this.f50581m;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: x */
    public final long mo17872x() {
        return this.f50584p;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: y */
    public final void mo17873y(long j10) {
        this.f50583o = j10;
        this.f50572d.setAmbientShadowColor(AbstractC14334L.m15617F(j10));
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: z */
    public final float mo17874z() {
        return this.f50588t;
    }
}
