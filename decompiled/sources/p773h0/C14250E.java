package p773h0;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import fo.C13711h;
import p003A1.AbstractC0237c1;
import p003A1.C0280q;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p102Dm.AbstractC2119a;
import p1140z1.C21660F;
import p230J1.AbstractC4181h;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8088f6;
import p571X9.AbstractC9306j0;
import p604Yk.C10077b;
import p635a1.InterfaceC10459q;
import p715e1.InterfaceC13259e;
import p759g1.C13800b;
import p759g1.C13803e;
import p774h1.AbstractC14348d;
import p774h1.C14347c;
import p774h1.InterfaceC14362r;
import p821j1.C16037b;
import p843k1.C16308b;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: h0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C14250E extends AbstractC0237c1 implements InterfaceC13259e {

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f44716Z = 1;

    /* JADX INFO: renamed from: o0 */
    public final C14297n f44717o0;

    /* JADX INFO: renamed from: p0 */
    public final C14251F f44718p0;

    /* JADX INFO: renamed from: q0 */
    public Object f44719q0;

    public C14250E(C14297n c14297n, C14251F c14251f) {
        super(C0280q.f1030t0);
        this.f44717o0 = c14297n;
        this.f44718p0 = c14251f;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m15544l(float f10, EdgeEffect edgeEffect, Canvas canvas) {
        if (f10 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f10);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m15545m(float f10, long j10, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f10);
        canvas.translate(C13800b.m15306g(j10), C13800b.m15307h(j10));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: G */
    public final boolean mo426G(InterfaceC1436k interfaceC1436k) {
        switch (this.f44716Z) {
            case 0:
                break;
        }
        return ((Boolean) interfaceC1436k.invoke(this)).booleanValue();
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC10459q mo428M(InterfaceC10459q interfaceC10459q) {
        int i10 = this.f44716Z;
        return AbstractC9306j0.m9882a(this, interfaceC10459q);
    }

    @Override // p715e1.InterfaceC13259e
    /* JADX INFO: renamed from: e */
    public final void mo14858e(C21660F c21660f) {
        boolean zM15545m;
        float f10;
        boolean zM15544l;
        float f11;
        switch (this.f44716Z) {
            case 0:
                C16037b c16037b = c21660f.f68674Y;
                long jM15202x = c16037b.f49479Z.m15202x();
                C14297n c14297n = this.f44717o0;
                c14297n.m15590l(jM15202x);
                if (C13803e.m15334f(c16037b.f49479Z.m15202x())) {
                    c21660f.m22080a();
                    return;
                }
                c21660f.m22080a();
                c14297n.f44887o0.getValue();
                Canvas canvasM15725a = AbstractC14348d.m15725a(c16037b.f49479Z.m15196m());
                C14251F c14251f = this.f44718p0;
                boolean zM15547f = C14251F.m15547f(c14251f.f44725f);
                InterfaceC17763i0 interfaceC17763i0 = ((C14296m0) this.f44719q0).f44884b;
                if (zM15547f) {
                    zM15545m = m15545m(270.0f, AbstractC8088f6.m8536b(-C13803e.m15331c(c21660f.mo17602i()), c21660f.mo7864b0(interfaceC17763i0.mo19474c(c21660f.getLayoutDirection()))), c14251f.m15551c(), canvasM15725a);
                } else {
                    zM15545m = false;
                }
                if (C14251F.m15547f(c14251f.f44723d)) {
                    zM15545m = m15545m(0.0f, AbstractC8088f6.m8536b(0.0f, c21660f.mo7864b0(interfaceC17763i0.mo19475d())), c14251f.m15553e(), canvasM15725a) || zM15545m;
                }
                if (C14251F.m15547f(c14251f.f44726g)) {
                    zM15545m = m15545m(90.0f, AbstractC8088f6.m8536b(0.0f, c21660f.mo7864b0(interfaceC17763i0.mo19472a(c21660f.getLayoutDirection())) + (-((float) AbstractC2119a.m3195i(C13803e.m15333e(c21660f.mo17602i()))))), c14251f.m15552d(), canvasM15725a) || zM15545m;
                }
                if (C14251F.m15547f(c14251f.f44724e)) {
                    zM15545m = m15545m(180.0f, AbstractC8088f6.m8536b(-C13803e.m15333e(c21660f.mo17602i()), (-C13803e.m15331c(c21660f.mo17602i())) + c21660f.mo7864b0(interfaceC17763i0.mo19473b())), c14251f.m15550b(), canvasM15725a) || zM15545m;
                }
                if (zM15545m) {
                    c14297n.m15585g();
                    return;
                }
                return;
            default:
                C16037b c16037b2 = c21660f.f68674Y;
                long jM15202x2 = c16037b2.f49479Z.m15202x();
                C14297n c14297n2 = this.f44717o0;
                c14297n2.m15590l(jM15202x2);
                if (C13803e.m15334f(c16037b2.f49479Z.m15202x())) {
                    c21660f.m22080a();
                    return;
                }
                c14297n2.f44887o0.getValue();
                float fMo7864b0 = c21660f.mo7864b0(AbstractC14319y.f44945a);
                C13711h c13711h = c16037b2.f49479Z;
                Canvas canvasM15725a2 = AbstractC14348d.m15725a(c13711h.m15196m());
                C14251F c14251f2 = this.f44718p0;
                boolean z6 = C14251F.m15547f(c14251f2.f44723d) || C14251F.m15548g(c14251f2.f44727h) || C14251F.m15547f(c14251f2.f44724e) || C14251F.m15548g(c14251f2.f44728i);
                boolean z10 = C14251F.m15547f(c14251f2.f44725f) || C14251F.m15548g(c14251f2.f44729j) || C14251F.m15547f(c14251f2.f44726g) || C14251F.m15548g(c14251f2.f44730k);
                if (z6 && z10) {
                    m15546n().setPosition(0, 0, canvasM15725a2.getWidth(), canvasM15725a2.getHeight());
                } else if (z6) {
                    m15546n().setPosition(0, 0, (AbstractC2119a.m3195i(fMo7864b0) * 2) + canvasM15725a2.getWidth(), canvasM15725a2.getHeight());
                } else {
                    if (!z10) {
                        c21660f.m22080a();
                        return;
                    }
                    m15546n().setPosition(0, 0, canvasM15725a2.getWidth(), (AbstractC2119a.m3195i(fMo7864b0) * 2) + canvasM15725a2.getHeight());
                }
                RecordingCanvas recordingCanvasBeginRecording = m15546n().beginRecording();
                if (C14251F.m15548g(c14251f2.f44729j)) {
                    EdgeEffect edgeEffectM15549a = c14251f2.f44729j;
                    if (edgeEffectM15549a == null) {
                        edgeEffectM15549a = c14251f2.m15549a();
                        c14251f2.f44729j = edgeEffectM15549a;
                    }
                    m15544l(90.0f, edgeEffectM15549a, recordingCanvasBeginRecording);
                    edgeEffectM15549a.finish();
                }
                boolean zM15547f2 = C14251F.m15547f(c14251f2.f44725f);
                C14299o c14299o = C14299o.f44894a;
                if (zM15547f2) {
                    EdgeEffect edgeEffectM15551c = c14251f2.m15551c();
                    zM15544l = m15544l(270.0f, edgeEffectM15551c, recordingCanvasBeginRecording);
                    if (C14251F.m15548g(c14251f2.f44725f)) {
                        float fM15307h = C13800b.m15307h(c14297n2.m15584f());
                        EdgeEffect edgeEffectM15549a2 = c14251f2.f44729j;
                        if (edgeEffectM15549a2 == null) {
                            edgeEffectM15549a2 = c14251f2.m15549a();
                            c14251f2.f44729j = edgeEffectM15549a2;
                        }
                        f10 = fMo7864b0;
                        int i10 = Build.VERSION.SDK_INT;
                        float fM15592b = i10 >= 31 ? c14299o.m15592b(edgeEffectM15551c) : 0.0f;
                        float f12 = 1 - fM15307h;
                        if (i10 >= 31) {
                            c14299o.m15593c(edgeEffectM15549a2, fM15592b, f12);
                        } else {
                            edgeEffectM15549a2.onPull(fM15592b, f12);
                        }
                    } else {
                        f10 = fMo7864b0;
                    }
                } else {
                    f10 = fMo7864b0;
                    zM15544l = false;
                }
                if (C14251F.m15548g(c14251f2.f44727h)) {
                    EdgeEffect edgeEffectM15549a3 = c14251f2.f44727h;
                    if (edgeEffectM15549a3 == null) {
                        edgeEffectM15549a3 = c14251f2.m15549a();
                        c14251f2.f44727h = edgeEffectM15549a3;
                    }
                    m15544l(180.0f, edgeEffectM15549a3, recordingCanvasBeginRecording);
                    edgeEffectM15549a3.finish();
                }
                if (C14251F.m15547f(c14251f2.f44723d)) {
                    EdgeEffect edgeEffectM15553e = c14251f2.m15553e();
                    boolean z11 = m15544l(0.0f, edgeEffectM15553e, recordingCanvasBeginRecording) || zM15544l;
                    if (C14251F.m15548g(c14251f2.f44723d)) {
                        float fM15306g = C13800b.m15306g(c14297n2.m15584f());
                        EdgeEffect edgeEffectM15549a4 = c14251f2.f44727h;
                        if (edgeEffectM15549a4 == null) {
                            edgeEffectM15549a4 = c14251f2.m15549a();
                            c14251f2.f44727h = edgeEffectM15549a4;
                        }
                        int i11 = Build.VERSION.SDK_INT;
                        float fM15592b2 = i11 >= 31 ? c14299o.m15592b(edgeEffectM15553e) : 0.0f;
                        if (i11 >= 31) {
                            c14299o.m15593c(edgeEffectM15549a4, fM15592b2, fM15306g);
                        } else {
                            edgeEffectM15549a4.onPull(fM15592b2, fM15306g);
                        }
                    }
                    zM15544l = z11;
                }
                if (C14251F.m15548g(c14251f2.f44730k)) {
                    EdgeEffect edgeEffectM15549a5 = c14251f2.f44730k;
                    if (edgeEffectM15549a5 == null) {
                        edgeEffectM15549a5 = c14251f2.m15549a();
                        c14251f2.f44730k = edgeEffectM15549a5;
                    }
                    m15544l(270.0f, edgeEffectM15549a5, recordingCanvasBeginRecording);
                    edgeEffectM15549a5.finish();
                }
                if (C14251F.m15547f(c14251f2.f44726g)) {
                    EdgeEffect edgeEffectM15552d = c14251f2.m15552d();
                    boolean z12 = m15544l(90.0f, edgeEffectM15552d, recordingCanvasBeginRecording) || zM15544l;
                    if (C14251F.m15548g(c14251f2.f44726g)) {
                        float fM15307h2 = C13800b.m15307h(c14297n2.m15584f());
                        EdgeEffect edgeEffectM15549a6 = c14251f2.f44730k;
                        if (edgeEffectM15549a6 == null) {
                            edgeEffectM15549a6 = c14251f2.m15549a();
                            c14251f2.f44730k = edgeEffectM15549a6;
                        }
                        int i12 = Build.VERSION.SDK_INT;
                        float fM15592b3 = i12 >= 31 ? c14299o.m15592b(edgeEffectM15552d) : 0.0f;
                        if (i12 >= 31) {
                            c14299o.m15593c(edgeEffectM15549a6, fM15592b3, fM15307h2);
                        } else {
                            edgeEffectM15549a6.onPull(fM15592b3, fM15307h2);
                        }
                    }
                    zM15544l = z12;
                }
                if (C14251F.m15548g(c14251f2.f44728i)) {
                    EdgeEffect edgeEffectM15549a7 = c14251f2.f44728i;
                    if (edgeEffectM15549a7 == null) {
                        edgeEffectM15549a7 = c14251f2.m15549a();
                        c14251f2.f44728i = edgeEffectM15549a7;
                    }
                    f11 = 0.0f;
                    m15544l(0.0f, edgeEffectM15549a7, recordingCanvasBeginRecording);
                    edgeEffectM15549a7.finish();
                } else {
                    f11 = 0.0f;
                }
                if (C14251F.m15547f(c14251f2.f44724e)) {
                    EdgeEffect edgeEffectM15550b = c14251f2.m15550b();
                    boolean z13 = m15544l(180.0f, edgeEffectM15550b, recordingCanvasBeginRecording) || zM15544l;
                    if (C14251F.m15548g(c14251f2.f44724e)) {
                        float fM15306g2 = C13800b.m15306g(c14297n2.m15584f());
                        EdgeEffect edgeEffectM15549a8 = c14251f2.f44728i;
                        if (edgeEffectM15549a8 == null) {
                            edgeEffectM15549a8 = c14251f2.m15549a();
                            c14251f2.f44728i = edgeEffectM15549a8;
                        }
                        int i13 = Build.VERSION.SDK_INT;
                        float fM15592b4 = i13 >= 31 ? c14299o.m15592b(edgeEffectM15550b) : f11;
                        float f13 = 1 - fM15306g2;
                        if (i13 >= 31) {
                            c14299o.m15593c(edgeEffectM15549a8, fM15592b4, f13);
                        } else {
                            edgeEffectM15549a8.onPull(fM15592b4, f13);
                        }
                    }
                    zM15544l = z13;
                }
                if (zM15544l) {
                    c14297n2.m15585g();
                }
                float f14 = z10 ? 0.0f : f10;
                float f15 = z6 ? 0.0f : f10;
                EnumC7546k layoutDirection = c21660f.getLayoutDirection();
                C14347c c14347c = new C14347c();
                c14347c.f45028a = recordingCanvasBeginRecording;
                long jM15202x3 = c13711h.m15202x();
                InterfaceC7537b interfaceC7537bM15197n = c16037b2.f49479Z.m15197n();
                EnumC7546k enumC7546kM15201w = c16037b2.f49479Z.m15201w();
                InterfaceC14362r interfaceC14362rM15196m = c16037b2.f49479Z.m15196m();
                long jM15202x4 = c16037b2.f49479Z.m15202x();
                C13711h c13711h2 = c16037b2.f49479Z;
                C16308b c16308b = (C16308b) c13711h2.f43260o0;
                c13711h2.m15186I(c21660f);
                c13711h2.m15188K(layoutDirection);
                c13711h2.m15185H(c14347c);
                c13711h2.m15189L(jM15202x3);
                c13711h2.f43260o0 = null;
                c14347c.mo15706e();
                try {
                    ((C10077b) c16037b2.f49479Z.f43259Z).m10665M(f14, f15);
                    try {
                        c21660f.m22080a();
                        float f16 = -f14;
                        float f17 = -f15;
                        ((C10077b) c16037b2.f49479Z.f43259Z).m10665M(f16, f17);
                        c14347c.mo15719r();
                        C13711h c13711h3 = c16037b2.f49479Z;
                        c13711h3.m15186I(interfaceC7537bM15197n);
                        c13711h3.m15188K(enumC7546kM15201w);
                        c13711h3.m15185H(interfaceC14362rM15196m);
                        c13711h3.m15189L(jM15202x4);
                        c13711h3.f43260o0 = c16308b;
                        m15546n().endRecording();
                        int iSave = canvasM15725a2.save();
                        canvasM15725a2.translate(f16, f17);
                        canvasM15725a2.drawRenderNode(m15546n());
                        canvasM15725a2.restoreToCount(iSave);
                        return;
                    } catch (Throwable th2) {
                        ((C10077b) c16037b2.f49479Z.f43259Z).m10665M(-f14, -f15);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c14347c.mo15719r();
                    C13711h c13711h4 = c16037b2.f49479Z;
                    c13711h4.m15186I(interfaceC7537bM15197n);
                    c13711h4.m15188K(enumC7546kM15201w);
                    c13711h4.m15185H(interfaceC14362rM15196m);
                    c13711h4.m15189L(jM15202x4);
                    c13711h4.f43260o0 = c16308b;
                    throw th3;
                }
        }
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: j */
    public final Object mo431j(Object obj, InterfaceC1439n interfaceC1439n) {
        switch (this.f44716Z) {
            case 0:
                break;
        }
        return interfaceC1439n.invoke(obj, this);
    }

    /* JADX INFO: renamed from: n */
    public RenderNode m15546n() {
        RenderNode renderNode = (RenderNode) this.f44719q0;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeM4845f = AbstractC4181h.m4845f();
        this.f44719q0 = renderNodeM4845f;
        return renderNodeM4845f;
    }

    public C14250E(C14297n c14297n, C14251F c14251f, C14296m0 c14296m0) {
        super(C0280q.f1030t0);
        this.f44717o0 = c14297n;
        this.f44718p0 = c14251f;
        this.f44719q0 = c14296m0;
    }
}
