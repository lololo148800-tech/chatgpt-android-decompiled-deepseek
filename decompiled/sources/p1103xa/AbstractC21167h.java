package p1103xa;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import p090Da.AbstractC1982a;
import p1060v9.C20485c;
import p140Fa.C2687g;
import p140Fa.C2691k;
import p140Fa.InterfaceC2701u;
import p239Ja.C4308k;
import p283L5.AbstractC4941g;
import p330N4.C5651b;
import p330N4.C5664o;
import p523V9.AbstractC8034Z;
import p544W9.AbstractC8608b3;
import p784hb.C14437f;
import p806ia.AbstractC14951a;
import p806ia.C14954d;
import p862l2.ViewTreeObserverOnPreDrawListenerC16807f;
import p897n3.C17474a;

/* JADX INFO: renamed from: xa.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21167h {

    /* JADX INFO: renamed from: a */
    public C2691k f67281a;

    /* JADX INFO: renamed from: b */
    public C2687g f67282b;

    /* JADX INFO: renamed from: c */
    public Drawable f67283c;

    /* JADX INFO: renamed from: d */
    public C21160a f67284d;

    /* JADX INFO: renamed from: e */
    public LayerDrawable f67285e;

    /* JADX INFO: renamed from: f */
    public boolean f67286f;

    /* JADX INFO: renamed from: h */
    public float f67288h;

    /* JADX INFO: renamed from: i */
    public float f67289i;

    /* JADX INFO: renamed from: j */
    public float f67290j;

    /* JADX INFO: renamed from: k */
    public int f67291k;

    /* JADX INFO: renamed from: l */
    public Animator f67292l;

    /* JADX INFO: renamed from: m */
    public C14954d f67293m;

    /* JADX INFO: renamed from: n */
    public C14954d f67294n;

    /* JADX INFO: renamed from: o */
    public float f67295o;

    /* JADX INFO: renamed from: q */
    public int f67297q;

    /* JADX INFO: renamed from: s */
    public final FloatingActionButton f67299s;

    /* JADX INFO: renamed from: t */
    public final C14437f f67300t;

    /* JADX INFO: renamed from: y */
    public ViewTreeObserverOnPreDrawListenerC16807f f67305y;

    /* JADX INFO: renamed from: z */
    public static final C17474a f67280z = AbstractC14951a.f46573c;

    /* JADX INFO: renamed from: A */
    public static final int f67270A = R.attr.motionDurationLong2;

    /* JADX INFO: renamed from: B */
    public static final int f67271B = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: C */
    public static final int f67272C = R.attr.motionDurationMedium1;

    /* JADX INFO: renamed from: D */
    public static final int f67273D = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* JADX INFO: renamed from: E */
    public static final int[] f67274E = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: F */
    public static final int[] f67275F = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: G */
    public static final int[] f67276G = {android.R.attr.state_focused, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: H */
    public static final int[] f67277H = {android.R.attr.state_hovered, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: I */
    public static final int[] f67278I = {android.R.attr.state_enabled};

    /* JADX INFO: renamed from: J */
    public static final int[] f67279J = new int[0];

    /* JADX INFO: renamed from: g */
    public boolean f67287g = true;

    /* JADX INFO: renamed from: p */
    public float f67296p = 1.0f;

    /* JADX INFO: renamed from: r */
    public int f67298r = 0;

    /* JADX INFO: renamed from: u */
    public final Rect f67301u = new Rect();

    /* JADX INFO: renamed from: v */
    public final RectF f67302v = new RectF();

    /* JADX INFO: renamed from: w */
    public final RectF f67303w = new RectF();

    /* JADX INFO: renamed from: x */
    public final Matrix f67304x = new Matrix();

    public AbstractC21167h(FloatingActionButton floatingActionButton, C14437f c14437f) {
        this.f67299s = floatingActionButton;
        this.f67300t = c14437f;
        C20485c c20485c = new C20485c();
        c20485c.f65029a = new ArrayList();
        c20485c.f65030b = null;
        c20485c.f65031c = new C4308k(c20485c, 9);
        C21169j c21169j = (C21169j) this;
        c20485c.m21134a(f67274E, m21595d(new C21165f(c21169j, 1)));
        c20485c.m21134a(f67275F, m21595d(new C21165f(c21169j, 0)));
        c20485c.m21134a(f67276G, m21595d(new C21165f(c21169j, 0)));
        c20485c.m21134a(f67277H, m21595d(new C21165f(c21169j, 0)));
        c20485c.m21134a(f67278I, m21595d(new C21165f(c21169j, 2)));
        c20485c.m21134a(f67279J, m21595d(new C21164e(c21169j)));
        this.f67295o = floatingActionButton.getRotation();
    }

    /* JADX INFO: renamed from: d */
    public static ValueAnimator m21595d(AbstractC21166g abstractC21166g) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f67280z);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(abstractC21166g);
        valueAnimator.addUpdateListener(abstractC21166g);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* JADX INFO: renamed from: a */
    public final void m21596a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f67299s.getDrawable();
        if (drawable == null || this.f67297q == 0) {
            return;
        }
        RectF rectF = this.f67302v;
        RectF rectF2 = this.f67303w;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        float f11 = this.f67297q;
        rectF2.set(0.0f, 0.0f, f11, f11);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f12 = this.f67297q / 2.0f;
        matrix.postScale(f10, f10, f12, f12);
    }

    /* JADX INFO: renamed from: b */
    public final AnimatorSet m21597b(C14954d c14954d, float f10, float f11, float f12) {
        int i10 = 2;
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f67299s;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        c14954d.m16119d("opacity").m16120a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        c14954d.m16119d("scale").m16120a(objectAnimatorOfFloat2);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 26) {
            C5664o c5664o = new C5664o(i10);
            c5664o.f18384b = new FloatEvaluator();
            objectAnimatorOfFloat2.setEvaluator(c5664o);
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        c14954d.m16119d("scale").m16120a(objectAnimatorOfFloat3);
        if (i11 == 26) {
            C5664o c5664o2 = new C5664o(i10);
            c5664o2.f18384b = new FloatEvaluator();
            objectAnimatorOfFloat3.setEvaluator(c5664o2);
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.f67304x;
        m21596a(f12, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new C5651b(), new C21162c(this), new Matrix(matrix));
        c14954d.m16119d("iconScale").m16120a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC8608b3.m9259c(animatorSet, arrayList);
        return animatorSet;
    }

    /* JADX INFO: renamed from: c */
    public final AnimatorSet m21598c(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f67299s;
        valueAnimatorOfFloat.addUpdateListener(new C21163d(this, floatingActionButton.getAlpha(), f10, floatingActionButton.getScaleX(), f11, floatingActionButton.getScaleY(), this.f67296p, f12, new Matrix(this.f67304x)));
        arrayList.add(valueAnimatorOfFloat);
        AbstractC8608b3.m9259c(animatorSet, arrayList);
        animatorSet.setDuration(AbstractC8034Z.m8389d(floatingActionButton.getContext(), i10, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(AbstractC8034Z.m8390e(floatingActionButton.getContext(), i11, AbstractC14951a.f46572b));
        return animatorSet;
    }

    /* JADX INFO: renamed from: e */
    public abstract float mo21599e();

    /* JADX INFO: renamed from: f */
    public void mo21600f(Rect rect) {
        int sizeDimension = this.f67286f ? (this.f67291k - this.f67299s.getSizeDimension()) / 2 : 0;
        float fMo21599e = this.f67287g ? mo21599e() + this.f67290j : 0.0f;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(fMo21599e));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(fMo21599e * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo21601g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10);

    /* JADX INFO: renamed from: h */
    public abstract void mo21602h();

    /* JADX INFO: renamed from: i */
    public abstract void mo21603i();

    /* JADX INFO: renamed from: j */
    public abstract void mo21604j(int[] iArr);

    /* JADX INFO: renamed from: k */
    public abstract void mo21605k(float f10, float f11, float f12);

    /* JADX INFO: renamed from: m */
    public void mo21607m(ColorStateList colorStateList) {
        Drawable drawable = this.f67283c;
        if (drawable != null) {
            drawable.setTintList(AbstractC1982a.m3155a(colorStateList));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m21608n(C2691k c2691k) {
        this.f67281a = c2691k;
        C2687g c2687g = this.f67282b;
        if (c2687g != null) {
            c2687g.setShapeAppearanceModel(c2691k);
        }
        Object obj = this.f67283c;
        if (obj instanceof InterfaceC2701u) {
            ((InterfaceC2701u) obj).setShapeAppearanceModel(c2691k);
        }
        C21160a c21160a = this.f67284d;
        if (c21160a != null) {
            c21160a.f67249o = c2691k;
            c21160a.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract boolean mo21609o();

    /* JADX INFO: renamed from: p */
    public abstract void mo21610p();

    /* JADX INFO: renamed from: q */
    public final void m21611q() {
        Rect rect = this.f67301u;
        mo21600f(rect);
        AbstractC4941g.m5558Q(this.f67285e, "Didn't initialize content background");
        boolean zMo21609o = mo21609o();
        C14437f c14437f = this.f67300t;
        if (zMo21609o) {
            super/*android.widget.ImageButton*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.f67285e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.f67285e;
            if (layerDrawable != null) {
                super/*android.widget.ImageButton*/.setBackgroundDrawable(layerDrawable);
            } else {
                c14437f.getClass();
            }
        }
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        FloatingActionButton floatingActionButton = (FloatingActionButton) c14437f.f45413Y;
        floatingActionButton.f36655z0.set(i10, i11, i12, i13);
        int i14 = floatingActionButton.f36652w0;
        floatingActionButton.setPadding(i10 + i14, i11 + i14, i12 + i14, i13 + i14);
    }

    /* JADX INFO: renamed from: l */
    public final void m21606l() {
    }
}
