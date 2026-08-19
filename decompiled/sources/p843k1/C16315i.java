package p843k1;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import p492U1.C7545j;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8088f6;
import p544W9.AbstractC8596Z3;
import p749fd.C13628m;
import p759g1.C13800b;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14348d;
import p774h1.C14347c;
import p774h1.C14363s;
import p774h1.C14365u;
import p774h1.InterfaceC14362r;
import p821j1.C16037b;
import p861l1.AbstractC16800a;

/* JADX INFO: renamed from: k1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C16315i implements InterfaceC16310d {

    /* JADX INFO: renamed from: A */
    public static final C16314h f50593A = new C16314h();

    /* JADX INFO: renamed from: b */
    public final AbstractC16800a f50594b;

    /* JADX INFO: renamed from: c */
    public final C14363s f50595c;

    /* JADX INFO: renamed from: d */
    public final C16322p f50596d;

    /* JADX INFO: renamed from: e */
    public final Resources f50597e;

    /* JADX INFO: renamed from: f */
    public final Rect f50598f;

    /* JADX INFO: renamed from: g */
    public int f50599g;

    /* JADX INFO: renamed from: h */
    public int f50600h;

    /* JADX INFO: renamed from: i */
    public long f50601i;

    /* JADX INFO: renamed from: j */
    public boolean f50602j;

    /* JADX INFO: renamed from: k */
    public boolean f50603k;

    /* JADX INFO: renamed from: l */
    public boolean f50604l;

    /* JADX INFO: renamed from: m */
    public final int f50605m;

    /* JADX INFO: renamed from: n */
    public int f50606n;

    /* JADX INFO: renamed from: o */
    public float f50607o;

    /* JADX INFO: renamed from: p */
    public boolean f50608p;

    /* JADX INFO: renamed from: q */
    public float f50609q;

    /* JADX INFO: renamed from: r */
    public float f50610r;

    /* JADX INFO: renamed from: s */
    public float f50611s;

    /* JADX INFO: renamed from: t */
    public float f50612t;

    /* JADX INFO: renamed from: u */
    public float f50613u;

    /* JADX INFO: renamed from: v */
    public long f50614v;

    /* JADX INFO: renamed from: w */
    public long f50615w;

    /* JADX INFO: renamed from: x */
    public float f50616x;

    /* JADX INFO: renamed from: y */
    public float f50617y;

    /* JADX INFO: renamed from: z */
    public float f50618z;

    public C16315i(AbstractC16800a abstractC16800a) {
        C14363s c14363s = new C14363s();
        C16037b c16037b = new C16037b();
        this.f50594b = abstractC16800a;
        this.f50595c = c14363s;
        C16322p c16322p = new C16322p(abstractC16800a, c14363s, c16037b);
        this.f50596d = c16322p;
        this.f50597e = abstractC16800a.getResources();
        this.f50598f = new Rect();
        abstractC16800a.addView(c16322p);
        c16322p.setClipBounds(null);
        this.f50601i = 0L;
        View.generateViewId();
        this.f50605m = 3;
        this.f50606n = 0;
        this.f50607o = 1.0f;
        this.f50609q = 1.0f;
        this.f50610r = 1.0f;
        long j10 = C14365u.f45052b;
        this.f50614v = j10;
        this.f50615w = j10;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: A */
    public final void mo17838A(long j10, int i10, int i11) {
        boolean zM7886a = C7545j.m7886a(this.f50601i, j10);
        C16322p c16322p = this.f50596d;
        if (zM7886a) {
            int i12 = this.f50599g;
            if (i12 != i10) {
                c16322p.offsetLeftAndRight(i10 - i12);
            }
            int i13 = this.f50600h;
            if (i13 != i11) {
                c16322p.offsetTopAndBottom(i11 - i13);
            }
        } else {
            if (m17910M()) {
                this.f50602j = true;
            }
            int i14 = (int) (j10 >> 32);
            int i15 = (int) (4294967295L & j10);
            c16322p.layout(i10, i11, i10 + i14, i11 + i15);
            this.f50601i = j10;
            if (this.f50608p) {
                c16322p.setPivotX(i14 / 2.0f);
                c16322p.setPivotY(i15 / 2.0f);
            }
        }
        this.f50599g = i10;
        this.f50600h = i11;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: B */
    public final float mo17839B() {
        return this.f50611s;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: C */
    public final void mo17840C(boolean z6) {
        boolean z10 = false;
        this.f50604l = z6 && !this.f50603k;
        this.f50602j = true;
        if (z6 && this.f50603k) {
            z10 = true;
        }
        this.f50596d.setClipToOutline(z10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: D */
    public final float mo17841D() {
        return this.f50616x;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: E */
    public final void mo17842E(int i10) {
        this.f50606n = i10;
        if (AbstractC8596Z3.m9257a(i10, 1) || !AbstractC14334L.m15639q(this.f50605m, 3)) {
            m17909L(1);
        } else {
            m17909L(this.f50606n);
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: F */
    public final void mo17843F(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f50615w = j10;
            this.f50596d.setOutlineSpotShadowColor(AbstractC14334L.m15617F(j10));
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: G */
    public final Matrix mo17844G() {
        return this.f50596d.getMatrix();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: H */
    public final void mo17845H(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k, C16308b c16308b, C13628m c13628m) {
        C16322p c16322p = this.f50596d;
        ViewParent parent = c16322p.getParent();
        AbstractC16800a abstractC16800a = this.f50594b;
        if (parent == null) {
            abstractC16800a.addView(c16322p);
        }
        c16322p.f50632u0 = interfaceC7537b;
        c16322p.f50633v0 = enumC7546k;
        c16322p.f50634w0 = c13628m;
        c16322p.f50635x0 = c16308b;
        if (c16322p.isAttachedToWindow()) {
            c16322p.setVisibility(4);
            c16322p.setVisibility(0);
            try {
                C14363s c14363s = this.f50595c;
                C16314h c16314h = f50593A;
                C14347c c14347c = c14363s.f45050a;
                Canvas canvas = c14347c.f45028a;
                c14347c.f45028a = c16314h;
                abstractC16800a.m18558a(c14347c, c16322p, c16322p.getDrawingTime());
                c14363s.f45050a.f45028a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: I */
    public final float mo17846I() {
        return this.f50613u;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: J */
    public final float mo17847J() {
        return this.f50610r;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: K */
    public final int mo17848K() {
        return this.f50605m;
    }

    /* JADX INFO: renamed from: L */
    public final void m17909L(int i10) {
        boolean z6 = true;
        boolean zM9257a = AbstractC8596Z3.m9257a(i10, 1);
        C16322p c16322p = this.f50596d;
        if (zM9257a) {
            c16322p.setLayerType(2, null);
        } else if (AbstractC8596Z3.m9257a(i10, 2)) {
            c16322p.setLayerType(0, null);
            z6 = false;
        } else {
            c16322p.setLayerType(0, null);
        }
        c16322p.setCanUseCompositingLayer$ui_graphics_release(z6);
    }

    /* JADX INFO: renamed from: M */
    public final boolean m17910M() {
        return this.f50604l || this.f50596d.getClipToOutline();
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: a */
    public final float mo17849a() {
        return this.f50607o;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: b */
    public final void mo17850b(float f10) {
        this.f50617y = f10;
        this.f50596d.setRotationY(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: c */
    public final void mo17851c() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f50596d.setRenderEffect(null);
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: d */
    public final void mo17852d(float f10) {
        this.f50618z = f10;
        this.f50596d.setRotation(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: e */
    public final void mo17853e(float f10) {
        this.f50612t = f10;
        this.f50596d.setTranslationY(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: f */
    public final void mo17854f() {
        this.f50594b.removeViewInLayout(this.f50596d);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: g */
    public final void mo17855g(float f10) {
        this.f50610r = f10;
        this.f50596d.setScaleY(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean mo17856h() {
        return true;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: i */
    public final void mo17857i(float f10) {
        this.f50607o = f10;
        this.f50596d.setAlpha(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: j */
    public final void mo17858j(float f10) {
        this.f50609q = f10;
        this.f50596d.setScaleX(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: k */
    public final void mo17859k(float f10) {
        this.f50611s = f10;
        this.f50596d.setTranslationX(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: l */
    public final void mo17860l(float f10) {
        this.f50596d.setCameraDistance(f10 * this.f50597e.getDisplayMetrics().densityDpi);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: m */
    public final void mo17861m(float f10) {
        this.f50616x = f10;
        this.f50596d.setRotationX(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: n */
    public final float mo17862n() {
        return this.f50609q;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: o */
    public final void mo17863o(float f10) {
        this.f50613u = f10;
        this.f50596d.setElevation(f10);
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: p */
    public final void mo17864p(Outline outline, long j10) {
        C16322p c16322p = this.f50596d;
        c16322p.f50630s0 = outline;
        c16322p.invalidateOutline();
        if (m17910M() && outline != null) {
            c16322p.setClipToOutline(true);
            if (this.f50604l) {
                this.f50604l = false;
                this.f50602j = true;
            }
        }
        this.f50603k = outline != null;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: q */
    public final int mo17865q() {
        return this.f50606n;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: r */
    public final void mo17866r(InterfaceC14362r interfaceC14362r) {
        Rect rect;
        boolean z6 = this.f50602j;
        C16322p c16322p = this.f50596d;
        if (z6) {
            if (!m17910M() || this.f50603k) {
                rect = null;
            } else {
                rect = this.f50598f;
                rect.left = 0;
                rect.top = 0;
                rect.right = c16322p.getWidth();
                rect.bottom = c16322p.getHeight();
            }
            c16322p.setClipBounds(rect);
        }
        if (AbstractC14348d.m15725a(interfaceC14362r).isHardwareAccelerated()) {
            this.f50594b.m18558a(interfaceC14362r, c16322p, c16322p.getDrawingTime());
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: s */
    public final float mo17867s() {
        return this.f50617y;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: t */
    public final float mo17868t() {
        return this.f50618z;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: u */
    public final void mo17869u(long j10) {
        boolean zM8539e = AbstractC8088f6.m8539e(j10);
        C16322p c16322p = this.f50596d;
        if (!zM8539e) {
            this.f50608p = false;
            c16322p.setPivotX(C13800b.m15306g(j10));
            c16322p.setPivotY(C13800b.m15307h(j10));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                c16322p.resetPivot();
                return;
            }
            this.f50608p = true;
            c16322p.setPivotX(((int) (this.f50601i >> 32)) / 2.0f);
            c16322p.setPivotY(((int) (this.f50601i & 4294967295L)) / 2.0f);
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: v */
    public final long mo17870v() {
        return this.f50614v;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: w */
    public final float mo17871w() {
        return this.f50612t;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: x */
    public final long mo17872x() {
        return this.f50615w;
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: y */
    public final void mo17873y(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f50614v = j10;
            this.f50596d.setOutlineAmbientShadowColor(AbstractC14334L.m15617F(j10));
        }
    }

    @Override // p843k1.InterfaceC16310d
    /* JADX INFO: renamed from: z */
    public final float mo17874z() {
        return this.f50596d.getCameraDistance() / this.f50597e.getDisplayMetrics().densityDpi;
    }
}
