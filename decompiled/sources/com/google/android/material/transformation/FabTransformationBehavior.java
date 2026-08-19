package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p1061vb.C20513d;
import p311Ma.C5314b;
import p544W9.AbstractC8608b3;
import p658b5.C11248s;
import p806ia.AbstractC14951a;
import p806ia.C14953c;
import p806ia.C14954d;
import p806ia.C14955e;
import p862l2.C16806e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c */
    public final Rect f36830c;

    /* JADX INFO: renamed from: d */
    public final RectF f36831d;

    /* JADX INFO: renamed from: e */
    public final RectF f36832e;

    /* JADX INFO: renamed from: f */
    public final int[] f36833f;

    /* JADX INFO: renamed from: g */
    public float f36834g;

    /* JADX INFO: renamed from: h */
    public float f36835h;

    public FabTransformationBehavior() {
        this.f36830c = new Rect();
        this.f36831d = new RectF();
        this.f36832e = new RectF();
        this.f36833f = new int[2];
    }

    /* JADX INFO: renamed from: t */
    public static Pair m13692t(float f10, float f11, boolean z6, C11248s c11248s) {
        C14955e c14955eM16119d;
        C14955e c14955eM16119d2;
        if (f10 == 0.0f || f11 == 0.0f) {
            c14955eM16119d = ((C14954d) c11248s.f34081Z).m16119d("translationXLinear");
            c14955eM16119d2 = ((C14954d) c11248s.f34081Z).m16119d("translationYLinear");
        } else if ((!z6 || f11 >= 0.0f) && (z6 || f11 <= 0.0f)) {
            c14955eM16119d = ((C14954d) c11248s.f34081Z).m16119d("translationXCurveDownwards");
            c14955eM16119d2 = ((C14954d) c11248s.f34081Z).m16119d("translationYCurveDownwards");
        } else {
            c14955eM16119d = ((C14954d) c11248s.f34081Z).m16119d("translationXCurveUpwards");
            c14955eM16119d2 = ((C14954d) c11248s.f34081Z).m16119d("translationYCurveUpwards");
        }
        return new Pair(c14955eM16119d, c14955eM16119d2);
    }

    /* JADX INFO: renamed from: w */
    public static float m13693w(C11248s c11248s, C14955e c14955e, float f10) {
        long j10 = c14955e.f46578a;
        C14955e c14955eM16119d = ((C14954d) c11248s.f34081Z).m16119d("expansion");
        return AbstractC14951a.m16113a(f10, 0.0f, c14955e.m16121b().getInterpolation((((c14955eM16119d.f46578a + c14955eM16119d.f46579b) + 17) - j10) / c14955e.f46579b));
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, p862l2.AbstractC16803b
    /* JADX INFO: renamed from: b */
    public final boolean mo13577b(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: c */
    public final void mo13594c(C16806e c16806e) {
        if (c16806e.f53924h == 0) {
            c16806e.f53924h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* JADX INFO: renamed from: s */
    public final AnimatorSet mo13691s(View view, View view2, boolean z6, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ObjectAnimator objectAnimatorOfFloat4;
        C11248s c11248sMo13697y = mo13697y(view2.getContext(), z6);
        if (z6) {
            this.f36834g = view.getTranslationX();
            this.f36835h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        float fM1548e = AbstractC0730K.m1548e(view2) - AbstractC0730K.m1548e(view);
        if (z6) {
            if (!z10) {
                view2.setTranslationZ(-fM1548e);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fM1548e);
        }
        ((C14954d) c11248sMo13697y.f34081Z).m16119d("elevation").m16120a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        RectF rectF = this.f36831d;
        float fM13694u = m13694u(view, view2, (C20513d) c11248sMo13697y.f34082o0);
        float fM13695v = m13695v(view, view2, (C20513d) c11248sMo13697y.f34082o0);
        Pair pairM13692t = m13692t(fM13694u, fM13695v, z6, c11248sMo13697y);
        C14955e c14955e = (C14955e) pairM13692t.first;
        C14955e c14955e2 = (C14955e) pairM13692t.second;
        if (z6) {
            if (!z10) {
                view2.setTranslationX(-fM13694u);
                view2.setTranslationY(-fM13695v);
            }
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fM13693w = m13693w(c11248sMo13697y, c14955e, -fM13694u);
            float fM13693w2 = m13693w(c11248sMo13697y, c14955e2, -fM13695v);
            Rect rect = this.f36830c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.f36832e;
            m13696x(view2, rectF2);
            rectF2.offset(fM13693w, fM13693w2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
            objectAnimatorOfFloat3 = objectAnimatorOfFloat6;
            objectAnimatorOfFloat2 = objectAnimatorOfFloat5;
        } else {
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fM13694u);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fM13695v);
        }
        c14955e.m16120a(objectAnimatorOfFloat2);
        c14955e2.m16120a(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat3);
        rectF.width();
        rectF.height();
        float fM13694u2 = m13694u(view, view2, (C20513d) c11248sMo13697y.f34082o0);
        float fM13695v2 = m13695v(view, view2, (C20513d) c11248sMo13697y.f34082o0);
        Pair pairM13692t2 = m13692t(fM13694u2, fM13695v2, z6, c11248sMo13697y);
        C14955e c14955e3 = (C14955e) pairM13692t2.first;
        C14955e c14955e4 = (C14955e) pairM13692t2.second;
        Property property = View.TRANSLATION_X;
        if (!z6) {
            fM13694u2 = this.f36834g;
        }
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fM13694u2);
        Property property2 = View.TRANSLATION_Y;
        if (!z6) {
            fM13695v2 = this.f36835h;
        }
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fM13695v2);
        c14955e3.m16120a(objectAnimatorOfFloat7);
        c14955e4.m16120a(objectAnimatorOfFloat8);
        arrayList.add(objectAnimatorOfFloat7);
        arrayList.add(objectAnimatorOfFloat8);
        if (view2 instanceof ViewGroup) {
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = viewFindViewById != null ? viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null : (ViewGroup) view2;
            if (viewGroup != null) {
                if (z6) {
                    if (!z10) {
                        C14953c.f46575a.set(viewGroup, Float.valueOf(0.0f));
                    }
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, C14953c.f46575a, 1.0f);
                } else {
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, C14953c.f46575a, 0.0f);
                }
                ((C14954d) c11248sMo13697y.f34081Z).m16119d("contentFade").m16120a(objectAnimatorOfFloat4);
                arrayList.add(objectAnimatorOfFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC8608b3.m9259c(animatorSet, arrayList);
        animatorSet.addListener(new C5314b(z6, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i10));
        }
        return animatorSet;
    }

    /* JADX INFO: renamed from: u */
    public final float m13694u(View view, View view2, C20513d c20513d) {
        RectF rectF = this.f36831d;
        RectF rectF2 = this.f36832e;
        m13696x(view, rectF);
        rectF.offset(this.f36834g, this.f36835h);
        m13696x(view2, rectF2);
        c20513d.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    /* JADX INFO: renamed from: v */
    public final float m13695v(View view, View view2, C20513d c20513d) {
        RectF rectF = this.f36831d;
        RectF rectF2 = this.f36832e;
        m13696x(view, rectF);
        rectF.offset(this.f36834g, this.f36835h);
        m13696x(view2, rectF2);
        c20513d.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    /* JADX INFO: renamed from: x */
    public final void m13696x(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f36833f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* JADX INFO: renamed from: y */
    public abstract C11248s mo13697y(Context context, boolean z6);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36830c = new Rect();
        this.f36831d = new RectF();
        this.f36832e = new RectF();
        this.f36833f = new int[2];
    }
}
